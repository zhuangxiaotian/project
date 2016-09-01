/**
 * 
 */
package topdeep.common.biz.cronjob;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import topdeep.common.biz.common.impl.BaseBiz;
import topdeep.common.entity.db.SystemCronJob;
import topdeep.common.entity.db.SystemParam;
import topdeep.common.entity.db.SystemParamExample;
import topdeep.common.entity.execute.ObjRegisterAttribute;
import topdeep.common.entity.params.CommonApplicationParam;
import topdeep.common.util.ApplicationContextHelper;

import common.cache2.CacheException;
import common.util.ResolverUtil;

/**
 * @author niexin
 *
 */
@Service("cronJobBiz")
public class CronJobBiz extends BaseBiz {

	@Autowired
	private CommonApplicationParam commonApplicationParam;

	@Transactional
	public void init() throws Exception {
		initCronJob();
	}

	public void initCronJob() throws CacheException {
		String scanPackage = commonApplicationParam.getCronjobScanPackage();
		String[] scanPackages = scanPackage.split(",");
		ResolverUtil<CronJobExecuter> resolver = new ResolverUtil<CronJobExecuter>();
		resolver.findImplementations(CronJobExecuter.class, scanPackages);
		Set<Class<? extends CronJobExecuter>> cronjobSet = resolver.getClasses();
		for (Class<? extends CronJobExecuter> item : cronjobSet) {
			ObjRegisterAttribute attr = item.getAnnotation(ObjRegisterAttribute.class);
			if (attr != null) {
				CronJobExecuter bean = null;
				try {
					bean = (CronJobExecuter) ApplicationContextHelper.getBean(attr.BeanId());
				} catch (Exception e) {
					logger.error("initCronJob error: " + e.getMessage(), e);
				}
				if (bean != null) {
					SystemCronJob cronJob = systemCronJobSelectByPrimaryKey(bean.getObjId());

					if (cronJob != null && cronJob.getJobVersion() < bean.getVersion()) {
						systemCronJobDeleteByPrimaryKey(bean.getObjId());
						cronJob = null;
					}

					if (cronJob == null) {
						cronJob = new SystemCronJob();
						// cronJob.setAuditId("");
						// cronJob.setAuditName("");
						cronJob.setAuditState("1");
						// cronJob.setAuditTime(null);
						// cronJob.setCreateId("");
						// cronJob.setCreateName(createName);
						cronJob.setCreateTime(new Date());
						cronJob.setCurrentExecServer("");
						cronJob.setCycleUnit(bean.getDefaultCycleUnit());
						cronJob.setCycleValue(bean.getDefaultCycleValue());
						cronJob.setFailCount(0);
						cronJob.setFirstExecuteTime(bean.getDefaultFirstExecuteTime());
						cronJob.setId(bean.getObjId());
						cronJob.setJobBeanId(attr.BeanId());
						cronJob.setJobFrom("0");
						cronJob.setJobLocate(bean.getDefaultJobLocate());
						cronJob.setJobState("1");
						cronJob.setJobType(bean.getDefaultJobType());
						cronJob.setJobVersion(bean.getVersion());
						cronJob.setLogEnabled(bean.getDefaultLogEnabled());
						cronJob.setModifyTime(new Date());
						cronJob.setName(bean.getName());
						cronJob.setOwnerId(bean.getObjId());
						cronJob.setRowVersion(0);
						cronJob.setSuccessCount(0);
						cronJob.setTotalCount(0);
						cronJob.setNextExecuteTime(bean.getDefaultFirstExecuteTime());
						systemCronJobInsert(cronJob);
						SystemParamExample paramCondition = new SystemParamExample();
						paramCondition.or().andIdEqualTo(cronJob.getId());
						systemParamDeleteByCondition(paramCondition);
						List<SystemParam> cronJobParamList = bean.getInitParams();
						for (SystemParam item2 : cronJobParamList) {
							systemParamInsert(item2);
						}
					}
				} else {
					logger.warn("can't find datasource bean: " + attr.BeanId());
				}
			}
		}
	}

	@Transactional
	public int cronJobDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = super.systemCronJobDeleteByPrimaryKey(AId);
		if (ret > 0) {
			SystemParamExample condition = new SystemParamExample();
			condition.or().andIdEqualTo(AId);
			systemParamDeleteByCondition(condition);
		}
		return ret;
	}

}
