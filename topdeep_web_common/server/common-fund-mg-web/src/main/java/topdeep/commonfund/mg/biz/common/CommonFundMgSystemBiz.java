/**
 * 
 */
package topdeep.commonfund.mg.biz.common;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import topdeep.commonfund.dao.BaseDao;
import topdeep.commonfund.entity.db.BusinessLogicManage;

import common.cache2.Cache;


/**
 * @author niexin
 *
 */
public class CommonFundMgSystemBiz extends topdeep.commonfund.entity.db.BaseBiz {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("fundCommonBaseDao")
	private BaseDao baseDao;

	@Override
	public BusinessLogicManage getDao() {
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

	// public void checkDbVersion() {
	// String verInDb = dbParam.getVofundVersion();
	// String verInSys = DbVersion.Vofund_Current;
	// if (TopdeepUtils.versionCompare(verInSys, verInDb) > 0) {
	// throw new RuntimeException("数据库版本是" + verInDb + ",系统要求版本为:" + verInSys + ",请升级数据库");
	// }
	// }

	@Override
	protected Boolean needCache(String tableName) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see au.com.jasu.entity.db.BaseBiz#getCache()
	 */
	@Override
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