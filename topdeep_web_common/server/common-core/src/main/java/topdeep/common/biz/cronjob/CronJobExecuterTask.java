/**
 * 
 */
package topdeep.common.biz.cronjob;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import topdeep.common.biz.common.CommonSystemBiz;
import topdeep.common.biz.common.impl.CommonSystemParamBiz;
import topdeep.common.entity.BizException;
import topdeep.common.entity.constant.EnumType.JobExecuteResult;
import topdeep.common.entity.constant.EnumType.JobState;
import topdeep.common.entity.db.SystemCronJob;
import topdeep.common.entity.db.SystemCronJobExample;
import topdeep.common.entity.db.SystemCronJobLog;
import topdeep.common.util.ApplicationContextHelper;
import topdeep.common.util.EnumTypeUtil;
import topdeep.common.util.TopdeepUtils;
import topdeep.common.util.UUIDGenerator;

import common.cache2.CacheException;
import common.util.StringUtils;

/**
 * @author niexin
 *
 */
@Service("cronJobExecuterTask")
public class CronJobExecuterTask implements InitializingBean {

	private Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("commonSystemBiz")
	private CommonSystemBiz commonSystemBiz;

	@Autowired
	private CommonSystemParamBiz commonSystemParamBiz;

	private String serverName;

	/**
	 * 
	 */
	public CronJobExecuterTask() {
	}

	public void execute() {
		logger.info("execute CronJobExecuterTask!");
		SystemCronJobExample condition = new SystemCronJobExample();
		condition.or().andJobStateNotEqualTo(JobState.Invalid.getValue()).andJobStateNotEqualTo(JobState.Finished.getValue()).andNextExecuteTimeIsNotNull()
				.andCurrentExecServerIsNull();
		try {
			List<SystemCronJob> jobList = commonSystemBiz.systemCronJobSelectObjects(condition);
			for (SystemCronJob item : jobList) {
				if (new Date().getTime() > item.getNextExecuteTime().getTime()) {
					execute(item);
				}
			}
		} catch (CacheException e) {
			logger.error("execute error! " + e.getMessage(), e);
		}
	}

	private void execute(SystemCronJob job) {
		Date currTime = new Date();
		try {
			if (JobState.AdminDisabled.getValue().equals(job.getJobState())) {
				if ("1".equals(job.getLogEnabled())) {
					SystemCronJobLog jobLog = new SystemCronJobLog();
					setJobLog(job, jobLog);
					jobLog.setEndExecuteTime(currTime);
					jobLog.setExecuteResult(JobExecuteResult.AdminDisabled.getValue());
					jobLog.setExecuteMessage("管理员禁止");
					jobLog.setStartExecuteTime(currTime);
					jobLog.setRowVersion(1);
					jobLog.setUseTime(0);
					commonSystemBiz.systemCronJobLogInsert(jobLog);
					updateJob(job, JobExecuteResult.AdminDisabled, jobLog.getExecuteMessage(), currTime);
				}
			} else if (JobState.UserDisabled.getValue().equals(job.getJobState())) {
				if ("1".equals(job.getLogEnabled())) {
					SystemCronJobLog jobLog = new SystemCronJobLog();
					setJobLog(job, jobLog);
					jobLog.setEndExecuteTime(currTime);
					jobLog.setExecuteResult(JobExecuteResult.UserDisabled.getValue());
					jobLog.setExecuteMessage("用户禁止");
					jobLog.setStartExecuteTime(currTime);
					jobLog.setRowVersion(1);
					jobLog.setUseTime(0);
					commonSystemBiz.systemCronJobLogInsert(jobLog);
					updateJob(job, JobExecuteResult.UserDisabled, jobLog.getExecuteMessage(), currTime);
				}
			} else if (JobState.Normal.getValue().equals(job.getJobState())) {
				boolean hasOwner = false;
				// 正常执行任务
				try {
					// 首先要获得执行权限
					SystemCronJobExample updateCondition = new SystemCronJobExample();
					updateCondition.or().andIdEqualTo(job.getId()).andCurrentExecServerIsNull();
					SystemCronJob updateJob = new SystemCronJob();
					updateJob.setId(job.getId());
					updateJob.setCurrentExecServer(serverName);
					int ret = commonSystemBiz.systemCronJobUpdateSelectiveByCondition(updateJob, updateCondition);
					if (ret == 1) {
						hasOwner = true;
						executeJob(job);
					}

				} catch (Exception e) {
					logger.error("execute job " + job.getName() + " " + e.getMessage(), e);
				}
				try {
					// 恢复执行权限
					if (hasOwner) {
						SystemCronJob updateJob = commonSystemBiz.systemCronJobSelectByPrimaryKey(job.getId());
						updateJob.setCurrentExecServer(null);
						commonSystemBiz.systemCronJobUpdate(updateJob);
					}
				} catch (Exception e) {
					logger.error("execute job " + job.getName() + " " + e.getMessage(), e);
				}
			}
		} catch (Exception e) {
			logger.error("execute job " + job.getName() + " " + e.getMessage(), e);
		}
	}

	private void setJobLog(SystemCronJob job, SystemCronJobLog jobLog) {
		jobLog.setId(UUIDGenerator.getUUID24());
		jobLog.setJobId(job.getId());
		jobLog.setJobLocate(job.getJobLocate());
		jobLog.setJobBeanId(job.getJobBeanId());
		jobLog.setName(job.getName());
		jobLog.setJobFrom(job.getJobFrom());
		jobLog.setJobVersion(job.getJobVersion());
	}

	private void updateJob(SystemCronJob job, JobExecuteResult executeResult, String executeMessage, Date currTime) throws BizException, CacheException {
		if (job.getFirstExecuteTime() == null) {
			job.setFirstExecuteTime(currTime);
		}
		job.setLastExecuteResult(executeResult.getValue());
		job.setLastExecuteMessage(executeMessage);
		if (executeResult == JobExecuteResult.Success) {
			job.setSuccessCount(job.getSuccessCount() + 1);
		} else if (executeResult == JobExecuteResult.Fail) {
			job.setFailCount(job.getFailCount() + 1);
		}
		job.setTotalCount(job.getTotalCount() + 1);
		long executeTime = job.getNextExecuteTime().getTime();
		if ("0".equals(job.getJobType())) {
			// 定时任务
			if ("s".equals(job.getCycleUnit())) {
				executeTime += job.getCycleValue() * 1000;
				if (executeTime < currTime.getTime()) {
					executeTime = currTime.getTime() + job.getCycleValue() * 1000;
				}
			} else if ("m".equals(job.getCycleUnit())) {
				executeTime += job.getCycleValue() * 60 * 1000;
				if (executeTime < currTime.getTime()) {
					executeTime = currTime.getTime() + job.getCycleValue() * 60 * 1000;
				}
			} else if ("h".equals(job.getCycleUnit())) {
				executeTime += job.getCycleValue() * 60 * 60 * 1000;
				if (executeTime < currTime.getTime()) {
					executeTime = currTime.getTime() + job.getCycleValue() * 60 * 60 * 1000;
				}
			} else if ("d".equals(job.getCycleUnit())) {
				executeTime += job.getCycleValue() * 24 * 60 * 60 * 1000;
				if (executeTime < currTime.getTime()) {
					executeTime = currTime.getTime() + job.getCycleValue() * 24 * 60 * 60 * 1000;
				}
			} else if ("M".equals(job.getCycleUnit())) {
				executeTime = StringUtils.getDateByMonth(job.getNextExecuteTime(), job.getCycleValue()).getTime();
			} else if ("y".equals(job.getCycleUnit())) {
				executeTime = StringUtils.getDateByYear(job.getNextExecuteTime(), job.getCycleValue()).getTime();
			}
			job.setNextExecuteTime(new Date(executeTime));
		} else if ("1".equals(job.getJobType())) {
			job.setJobState(JobState.Finished.getValue());
			job.setNextExecuteTime(null);
		} else {
			throw new BizException("无效的任务时间类型");
		}
		commonSystemBiz.systemCronJobUpdate(job);
	}

	private void executeJob(SystemCronJob job) throws CacheException, BizException {
		Date currTime = new Date();
		CronJobExecuter executer = (CronJobExecuter) ApplicationContextHelper.getBean(job.getJobBeanId());
		if (executer == null) {
			SystemCronJobLog jobLog = new SystemCronJobLog();
			setJobLog(job, jobLog);
			jobLog.setEndExecuteTime(currTime);
			jobLog.setExecuteResult(JobExecuteResult.ParamError.getValue());
			jobLog.setExecuteMessage("找不到执行器");
			jobLog.setStartExecuteTime(currTime);
			jobLog.setRowVersion(1);
			jobLog.setUseTime(0);
			// systemBiz.cronJobLogInsert(jobLog);
			updateJob(job, JobExecuteResult.ParamError, jobLog.getExecuteMessage(), currTime);
		} else {
			JobExecuteResult result = JobExecuteResult.Timeout;
			String resultMessage = "等待执行返回";
			SystemCronJobLog jobLog = new SystemCronJobLog();
			setJobLog(job, jobLog);
			jobLog.setExecuteResult(result.getValue());
			jobLog.setExecuteMessage(resultMessage);
			jobLog.setStartExecuteTime(currTime);
			jobLog.setRowVersion(1);
			jobLog.setUseTime(0);
			jobLog.setExecServer(serverName);
			// systemBiz.cronJobLogInsert(jobLog);
			updateJob(job, JobExecuteResult.ParamError, jobLog.getExecuteMessage(), currTime);
			try {
				executer.execute(job);
				result = JobExecuteResult.Success;
				resultMessage = "";
			} catch (BizException e) {
				logger.error(e.getMessage(), e);
				result = EnumTypeUtil.valueOf(e.getErrorCode(), JobExecuteResult.class);
				if (result == null) {
					result = JobExecuteResult.Fail;
				}
				resultMessage = e.getMessage();
			} catch (Exception e1) {
				logger.error(e1.getMessage(), e1);
				result = JobExecuteResult.Fail;
				resultMessage = e1.getMessage();
			}
			job.setLastExecuteResult(result.getValue());
			job.setLastExecuteMessage(resultMessage);
			if (result == JobExecuteResult.Success) {
				job.setSuccessCount(job.getSuccessCount() + 1);
				job.setLastSuccessTime(new Date());
			} else {
				job.setFailCount(job.getFailCount() + 1);
			}
			// systemBiz.cronJobUpdate(job);
			jobLog.setEndExecuteTime(new Date());
			jobLog.setExecuteResult(result.getValue());
			jobLog.setExecuteMessage(resultMessage);
			jobLog.setUseTime((int) (jobLog.getEndExecuteTime().getTime() - currTime.getTime()));
			// systemBiz.cronJobLogUpdate(jobLog);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		serverName = commonSystemParamBiz.getApplicationParam().getServerName();
		if (StringUtils.isNullOrEmpty(serverName)) {
			serverName = TopdeepUtils.getLocalIp();
		}
	}
}
