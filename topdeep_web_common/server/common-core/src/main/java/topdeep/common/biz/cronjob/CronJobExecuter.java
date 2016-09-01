/**
 * 
 */
package topdeep.common.biz.cronjob;

import java.util.Date;
import java.util.List;

import topdeep.common.entity.db.SystemCronJob;
import topdeep.common.entity.db.SystemParam;

/**
 * @author niexin
 *
 */
public interface CronJobExecuter {

	/**
	 * 执行器名字
	 * 
	 * @return
	 */
	String getName();

	/**
	 * 获得对象Id
	 * 
	 * @return
	 */
	String getObjId();

	/**
	 * 获得对象版本
	 * 
	 * @return
	 */
	int getVersion();

	/**
	 * 获得默认执行周期单位
	 * 
	 * @return
	 */
	String getDefaultCycleUnit();

	/**
	 * 获得默认执行周期值
	 * 
	 * @return
	 */
	int getDefaultCycleValue();

	/**
	 * 获得默认首次执行时间
	 * 
	 * @return
	 */
	Date getDefaultFirstExecuteTime();

	/**
	 * 获得默认的执行位置
	 * 
	 * @return
	 */
	String getDefaultJobLocate();

	/**
	 * 获得默认的任务类型
	 * 
	 * @return
	 */
	String getDefaultJobType();

	/**
	 * 获得默认的作务Log是否激活
	 * 
	 * @return
	 */
	String getDefaultLogEnabled();

	/**
	 * 获得默认的初始化参数
	 * 
	 * @return
	 */
	List<SystemParam> getInitParams();

	/**
	 * 执行任务，返回结果
	 * 
	 * @param CronJob job
	 * @return
	 */
	public void execute(SystemCronJob obj) throws Exception;

}
