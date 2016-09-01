package topdeep.commonfund.biz.common.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import topdeep.commonfund.dao.BaseDao;
import topdeep.commonfund.entity.db.BusinessLogicManage;

import common.cache2.Cache;

/**
 * 
 * @author shidewen
 * 
 */
public class BaseBiz extends topdeep.commonfund.entity.db.BaseBiz implements topdeep.commonfund.biz.common.BaseBiz {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("fundCommonBaseDao")
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


}
