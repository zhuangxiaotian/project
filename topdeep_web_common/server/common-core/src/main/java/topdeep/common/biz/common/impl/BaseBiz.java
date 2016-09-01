/**
 * 
 */
package topdeep.common.biz.common.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;

import topdeep.common.dao.common.BaseDao;
import topdeep.common.entity.db.BusinessLogicManage;
import topdeep.common.entity.db.SystemAdminLog;
import topdeep.common.entity.view.SystemClientActivationExExample;
import topdeep.common.entity.view.SystemClientActivationManageView;
import topdeep.common.util.UUIDGenerator;

import common.cache2.Cache;
import common.cache2.CacheException;
import common.web.WebRuntime;

/**
 * @author niexin
 *
 */
public class BaseBiz extends topdeep.common.entity.db.BaseBiz implements topdeep.common.biz.common.BaseBiz {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired(required = false)
	private WebRuntime webUserRuntimeBiz;

	@Autowired(required = false)
	@Qualifier("commonBaseDao")
	private BaseDao baseDao;

	@Override
	public BusinessLogicManage getDao() {
		// TODO Auto-generated method stub
		return baseDao;
	}

	public Long getNextSequValue(String sequName) {
		return baseDao.getNextSequValue(sequName);
	}

	public void checkDatabase() {
		baseDao.checkDatabase();
	}

	public <T> T selectSingleObject(List<T> tlist) {
		if (tlist != null && tlist.size() > 0) {
			return tlist.get(0);
		}
		return null;
	}

	public Object queryScalar(String sql) {
		return baseDao.queryScalar(sql);
	}

	@Override
	public Boolean needCache(String tableName) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see au.com.jasu.entity.db.BaseBiz#getCache()
	 */
	// @Override
	public Cache getCache() {
		// return (common.cache2.Cache) ApplicationContextProvider.getApplicationContext().getBean("cache");
		return null;
	}

	/**
	 * @return the baseDao
	 */
	public BaseDao getBaseDao() {
		return baseDao;
	}

	/**
	 * @param baseDao the baseDao to set
	 */
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lion.fund.entity.db.BaseBiz#operatesLogSimpleAdd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, int)
	 */
	@Override
	public void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param, int updateCount) {
		if (tableName.equalsIgnoreCase("t_system_admin_log")) {
			return;
		}
		try {
			SystemAdminLog log = new SystemAdminLog();
			log.setAdminLogId(UUIDGenerator.getUUID24());
			log.setOperateTime(new java.util.Date());
			log.setOperateType(tableName + ":" + operateName);
			log.setUpdateCount(updateCount);
			log.setOperateContent(keyFieldName + ":" + keyFieldValue);
			log.setRowVersion(0);

			if (RequestContextHolder.getRequestAttributes() != null && webUserRuntimeBiz != null && webUserRuntimeBiz.isLogin()) {
				log.setAdminId(webUserRuntimeBiz.getLoginUserId());
				log.setAdminName(webUserRuntimeBiz.getLoginUserName());
			} else {
				log.setAdminId(UUIDGenerator.PARENT_ID);
				log.setAdminName("");
			}
			systemAdminLogInsert(log);
		} catch (Throwable ex) {
			logger.error("operatesLogSimpleAdd log error: " + ex.getMessage(), ex);
		}
	}

	@Transactional
	public List<SystemClientActivationManageView> clientActivationViewSelectObjects(SystemClientActivationExExample clientActivationQueryCondition)
			throws CacheException {
		return this.getBaseDao().clientActivationViewSelectObjects(clientActivationQueryCondition);
	}

	@Transactional
	public int clientActivationViewQuerySelectObjectsCount(SystemClientActivationExExample clientActivationQueryCondition) throws CacheException {
		return this.getBaseDao().clientActivationViewQuerySelectObjectsCount(clientActivationQueryCondition);
	}

}
