package topdeep.common.entity.db;
import java.util.*;
import common.util.*;
import java.sql.*;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import common.cache2.*;
/**
 * 基本的商业应用层代码，可扩展
 */
public abstract class BaseBiz {
	
	public abstract BusinessLogicManage getDao();
	
	/**
	 * 插入一个对象SystemAdmin到数据库中
	 * <param name="systemAdmin">需要插入的新对象</param>
	 */
	public int systemAdminInsert(SystemAdmin systemAdmin) throws CacheException {
		int ret = this.getDao().systemAdminInsert(systemAdmin);
		if (this.needCache("T_SYSTEM_ADMIN")) {
			this.getCache().clear("T_SYSTEM_ADMIN");
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdmin.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN", "插入", "ID", kvalue, systemAdmin, ret);
		return ret;
	}
	
	/**
	 * <param name="systemAdmin">从数据库中删除一个对象SystemAdmin</param>
	 * <param name="AId">操作员标识</param>
	 */
	public int systemAdminDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemAdminDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN")) {
				this.getCache().clear("T_SYSTEM_ADMIN");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemAdmin">从数据库中删除一个对象SystemAdmin</param>
	 */
	public int systemAdminDeleteByCondition(SystemAdminExample systemAdminQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminDeleteByCondition(systemAdminQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN")) {
				this.getCache().clear("T_SYSTEM_ADMIN");
			}
		}
		String kvalue = this.getSystemAdminExampleConditionSql(systemAdminQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN", "条件删除", "conditionSql", kvalue, systemAdminQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemAdmin到数据库中
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	public int systemAdminUpdate(SystemAdmin systemAdmin) throws CacheException {
		int ret = this.getDao().systemAdminUpdate(systemAdmin);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN")) {
				this.getCache().clear("T_SYSTEM_ADMIN");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdmin.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN", "更新", "ID", kvalue, systemAdmin, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemAdmin到数据库中
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	public int systemAdminUpdateSelective(SystemAdmin systemAdmin) throws CacheException {
		int ret = this.getDao().systemAdminUpdateSelective(systemAdmin);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN")) {
				this.getCache().clear("T_SYSTEM_ADMIN");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdmin.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN", "部分更新", "ID", kvalue, systemAdmin, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemAdmin到数据库中
	 * <param name="systemAdminQueryCondition">附加的条件</param>
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	public int systemAdminUpdateByCondition(SystemAdmin systemAdmin, SystemAdminExample systemAdminQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminUpdateByCondition(systemAdmin, systemAdminQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN")) {
				this.getCache().clear("T_SYSTEM_ADMIN");
			}
		}
		String kvalue = this.getSystemAdminExampleConditionSql(systemAdminQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN", "条件更新", "conditionSql", kvalue, systemAdmin, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemAdmin到数据库中
	 * <param name="systemAdminQueryCondition">附加的条件</param>
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	public int systemAdminUpdateSelectiveByCondition(SystemAdmin systemAdmin, SystemAdminExample systemAdminQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminUpdateSelectiveByCondition(systemAdmin, systemAdminQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN")) {
				this.getCache().clear("T_SYSTEM_ADMIN");
			}
		}
		String kvalue = this.getSystemAdminExampleConditionSql(systemAdminQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN", "批量部分更新", "conditionSql", kvalue, systemAdmin, ret);
		return ret;
	}
	
	public String getSystemAdminExampleConditionSql(SystemAdminExample systemAdminQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemAdminQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemAdminExample.Criteria item = systemAdminQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemAdminExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemAdmin">从数据库中查询一个对象SystemAdmin</param>
	 * <param name="AId">操作员标识</param>
	 */
	public SystemAdmin systemAdminSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN")) {
			String key = ("T_SYSTEM_ADMIN_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemAdmin obj = ((SystemAdmin)(this.getCache().get("T_SYSTEM_ADMIN", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemAdminQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemAdmin> systemAdminSelectObjects(SystemAdminExample systemAdminQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN")) {
			String key = ("T_SYSTEM_ADMIN_" 
						+ ("queryObject_" + this.getSystemAdminExampleConditionSql(systemAdminQueryCondition)));
			List<SystemAdmin> obj = ((List<SystemAdmin>)(this.getCache().get("T_SYSTEM_ADMIN", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminSelectObjects(systemAdminQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminSelectObjects(systemAdminQueryCondition);
		}
	}
	
	/**
	 * <param name="systemAdminQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemAdminQuerySelectObjectsCount(SystemAdminExample systemAdminQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN")) {
			String key = ("T_SYSTEM_ADMIN_" 
						+ ("queryCount_" + this.getSystemAdminExampleConditionSql(systemAdminQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_ADMIN", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminQuerySelectObjectsCount(systemAdminQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminQuerySelectObjectsCount(systemAdminQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要插入的新对象</param>
	 */
	public int systemAdminLogInsert(SystemAdminLog systemAdminLog) throws CacheException {
		int ret = this.getDao().systemAdminLogInsert(systemAdminLog);
		if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
			this.getCache().clear("T_SYSTEM_ADMIN_LOG");
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdminLog.getAdminLogId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_LOG", "插入", "ADMIN_LOG_ID", kvalue, systemAdminLog, ret);
		return ret;
	}
	
	/**
	 * <param name="systemAdminLog">从数据库中删除一个对象SystemAdminLog</param>
	 * <param name="AAdminLogId">操作员日志标识</param>
	 */
	public int systemAdminLogDeleteByPrimaryKey(String AAdminLogId) throws CacheException {
		int ret = this.getDao().systemAdminLogDeleteByPrimaryKey(AAdminLogId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
				this.getCache().clear("T_SYSTEM_ADMIN_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AAdminLogId);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_LOG", "删除", "ADMIN_LOG_ID", kvalue, AAdminLogId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemAdminLog">从数据库中删除一个对象SystemAdminLog</param>
	 */
	public int systemAdminLogDeleteByCondition(SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminLogDeleteByCondition(systemAdminLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
				this.getCache().clear("T_SYSTEM_ADMIN_LOG");
			}
		}
		String kvalue = this.getSystemAdminLogExampleConditionSql(systemAdminLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_LOG", "条件删除", "conditionSql", kvalue, systemAdminLogQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	public int systemAdminLogUpdate(SystemAdminLog systemAdminLog) throws CacheException {
		int ret = this.getDao().systemAdminLogUpdate(systemAdminLog);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
				this.getCache().clear("T_SYSTEM_ADMIN_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdminLog.getAdminLogId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_LOG", "更新", "ADMIN_LOG_ID", kvalue, systemAdminLog, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	public int systemAdminLogUpdateSelective(SystemAdminLog systemAdminLog) throws CacheException {
		int ret = this.getDao().systemAdminLogUpdateSelective(systemAdminLog);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
				this.getCache().clear("T_SYSTEM_ADMIN_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdminLog.getAdminLogId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_LOG", "部分更新", "ADMIN_LOG_ID", kvalue, systemAdminLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemAdminLog到数据库中
	 * <param name="systemAdminLogQueryCondition">附加的条件</param>
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	public int systemAdminLogUpdateByCondition(SystemAdminLog systemAdminLog, SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminLogUpdateByCondition(systemAdminLog, systemAdminLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
				this.getCache().clear("T_SYSTEM_ADMIN_LOG");
			}
		}
		String kvalue = this.getSystemAdminLogExampleConditionSql(systemAdminLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_LOG", "条件更新", "conditionSql", kvalue, systemAdminLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemAdminLog到数据库中
	 * <param name="systemAdminLogQueryCondition">附加的条件</param>
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	public int systemAdminLogUpdateSelectiveByCondition(SystemAdminLog systemAdminLog, SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminLogUpdateSelectiveByCondition(systemAdminLog, systemAdminLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
				this.getCache().clear("T_SYSTEM_ADMIN_LOG");
			}
		}
		String kvalue = this.getSystemAdminLogExampleConditionSql(systemAdminLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_LOG", "批量部分更新", "conditionSql", kvalue, systemAdminLog, ret);
		return ret;
	}
	
	public String getSystemAdminLogExampleConditionSql(SystemAdminLogExample systemAdminLogQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemAdminLogQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemAdminLogExample.Criteria item = systemAdminLogQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemAdminLogExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemAdminLog">从数据库中查询一个对象SystemAdminLog</param>
	 * <param name="AAdminLogId">操作员日志标识</param>
	 */
	public SystemAdminLog systemAdminLogSelectByPrimaryKey(String AAdminLogId) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
			String key = ("T_SYSTEM_ADMIN_LOG_" 
						+ (("_BYUNIINDEX_" + AAdminLogId) 
						+ "_"));
			SystemAdminLog obj = ((SystemAdminLog)(this.getCache().get("T_SYSTEM_ADMIN_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminLogSelectByPrimaryKey(AAdminLogId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminLogSelectByPrimaryKey(AAdminLogId);
		}
	}
	
	/**
	 * <param name="systemAdminLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemAdminLog> systemAdminLogSelectObjects(SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
			String key = ("T_SYSTEM_ADMIN_LOG_" 
						+ ("queryObject_" + this.getSystemAdminLogExampleConditionSql(systemAdminLogQueryCondition)));
			List<SystemAdminLog> obj = ((List<SystemAdminLog>)(this.getCache().get("T_SYSTEM_ADMIN_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminLogSelectObjects(systemAdminLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminLogSelectObjects(systemAdminLogQueryCondition);
		}
	}
	
	/**
	 * <param name="systemAdminLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemAdminLogQuerySelectObjectsCount(SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN_LOG")) {
			String key = ("T_SYSTEM_ADMIN_LOG_" 
						+ ("queryCount_" + this.getSystemAdminLogExampleConditionSql(systemAdminLogQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_ADMIN_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminLogQuerySelectObjectsCount(systemAdminLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminLogQuerySelectObjectsCount(systemAdminLogQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要插入的新对象</param>
	 */
	public int systemAdminRolesInsert(SystemAdminRoles systemAdminRoles) throws CacheException {
		int ret = this.getDao().systemAdminRolesInsert(systemAdminRoles);
		if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
			this.getCache().clear("T_SYSTEM_ADMIN_ROLES");
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdminRoles.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_ROLES", "插入", "ID", kvalue, systemAdminRoles, ret);
		return ret;
	}
	
	/**
	 * <param name="systemAdminRoles">从数据库中删除一个对象SystemAdminRoles</param>
	 * <param name="AId">主键</param>
	 */
	public int systemAdminRolesDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemAdminRolesDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
				this.getCache().clear("T_SYSTEM_ADMIN_ROLES");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_ROLES", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemAdminRoles">从数据库中删除一个对象SystemAdminRoles</param>
	 */
	public int systemAdminRolesDeleteByCondition(SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminRolesDeleteByCondition(systemAdminRolesQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
				this.getCache().clear("T_SYSTEM_ADMIN_ROLES");
			}
		}
		String kvalue = this.getSystemAdminRolesExampleConditionSql(systemAdminRolesQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_ROLES", "条件删除", "conditionSql", kvalue, systemAdminRolesQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	public int systemAdminRolesUpdate(SystemAdminRoles systemAdminRoles) throws CacheException {
		int ret = this.getDao().systemAdminRolesUpdate(systemAdminRoles);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
				this.getCache().clear("T_SYSTEM_ADMIN_ROLES");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdminRoles.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_ROLES", "更新", "ID", kvalue, systemAdminRoles, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	public int systemAdminRolesUpdateSelective(SystemAdminRoles systemAdminRoles) throws CacheException {
		int ret = this.getDao().systemAdminRolesUpdateSelective(systemAdminRoles);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
				this.getCache().clear("T_SYSTEM_ADMIN_ROLES");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemAdminRoles.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_ROLES", "部分更新", "ID", kvalue, systemAdminRoles, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRolesQueryCondition">附加的条件</param>
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	public int systemAdminRolesUpdateByCondition(SystemAdminRoles systemAdminRoles, SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminRolesUpdateByCondition(systemAdminRoles, systemAdminRolesQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
				this.getCache().clear("T_SYSTEM_ADMIN_ROLES");
			}
		}
		String kvalue = this.getSystemAdminRolesExampleConditionSql(systemAdminRolesQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_ROLES", "条件更新", "conditionSql", kvalue, systemAdminRoles, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRolesQueryCondition">附加的条件</param>
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	public int systemAdminRolesUpdateSelectiveByCondition(SystemAdminRoles systemAdminRoles, SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException {
		int ret = this.getDao().systemAdminRolesUpdateSelectiveByCondition(systemAdminRoles, systemAdminRolesQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
				this.getCache().clear("T_SYSTEM_ADMIN_ROLES");
			}
		}
		String kvalue = this.getSystemAdminRolesExampleConditionSql(systemAdminRolesQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ADMIN_ROLES", "批量部分更新", "conditionSql", kvalue, systemAdminRoles, ret);
		return ret;
	}
	
	public String getSystemAdminRolesExampleConditionSql(SystemAdminRolesExample systemAdminRolesQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemAdminRolesQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemAdminRolesExample.Criteria item = systemAdminRolesQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemAdminRolesExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemAdminRoles">从数据库中查询一个对象SystemAdminRoles</param>
	 * <param name="AId">主键</param>
	 */
	public SystemAdminRoles systemAdminRolesSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
			String key = ("T_SYSTEM_ADMIN_ROLES_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemAdminRoles obj = ((SystemAdminRoles)(this.getCache().get("T_SYSTEM_ADMIN_ROLES", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminRolesSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN_ROLES", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminRolesSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemAdminRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemAdminRoles> systemAdminRolesSelectObjects(SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
			String key = ("T_SYSTEM_ADMIN_ROLES_" 
						+ ("queryObject_" + this.getSystemAdminRolesExampleConditionSql(systemAdminRolesQueryCondition)));
			List<SystemAdminRoles> obj = ((List<SystemAdminRoles>)(this.getCache().get("T_SYSTEM_ADMIN_ROLES", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminRolesSelectObjects(systemAdminRolesQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN_ROLES", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminRolesSelectObjects(systemAdminRolesQueryCondition);
		}
	}
	
	/**
	 * <param name="systemAdminRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemAdminRolesQuerySelectObjectsCount(SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_ADMIN_ROLES")) {
			String key = ("T_SYSTEM_ADMIN_ROLES_" 
						+ ("queryCount_" + this.getSystemAdminRolesExampleConditionSql(systemAdminRolesQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_ADMIN_ROLES", key)));
			if ((obj == null)) {
				obj = this.getDao().systemAdminRolesQuerySelectObjectsCount(systemAdminRolesQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ADMIN_ROLES", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemAdminRolesQuerySelectObjectsCount(systemAdminRolesQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要插入的新对象</param>
	 */
	public int systemBaseInfoInsert(SystemBaseInfo systemBaseInfo) throws CacheException {
		int ret = this.getDao().systemBaseInfoInsert(systemBaseInfo);
		if (this.needCache("T_SYSTEM_BASE_INFO")) {
			this.getCache().clear("T_SYSTEM_BASE_INFO");
		}
		String kvalue = "";
		kvalue = (kvalue + systemBaseInfo.getCodeId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemBaseInfo.getCodeType());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemBaseInfo.getSystemType());
		this.operatesLogSimpleAdd("T_SYSTEM_BASE_INFO", "插入", "CODE_ID,CODE_TYPE,SYSTEM_TYPE", kvalue, systemBaseInfo, ret);
		return ret;
	}
	
	/**
	 * <param name="systemBaseInfo">从数据库中删除一个对象SystemBaseInfo</param>
	 * <param name="ASystemBaseInfoKey">系统基本信息表 主键类</param>
	 */
	public int systemBaseInfoDeleteByPrimaryKey(SystemBaseInfoKey ASystemBaseInfoKey) throws CacheException {
		int ret = this.getDao().systemBaseInfoDeleteByPrimaryKey(ASystemBaseInfoKey);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_BASE_INFO")) {
				this.getCache().clear("T_SYSTEM_BASE_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + ASystemBaseInfoKey.getCodeId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + ASystemBaseInfoKey.getCodeType());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + ASystemBaseInfoKey.getSystemType());
		this.operatesLogSimpleAdd("T_SYSTEM_BASE_INFO", "删除", "CODE_ID,CODE_TYPE,SYSTEM_TYPE", kvalue, ASystemBaseInfoKey, ret);
		return ret;
	}
	
	/**
	 * <param name="systemBaseInfo">从数据库中删除一个对象SystemBaseInfo</param>
	 */
	public int systemBaseInfoDeleteByCondition(SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException {
		int ret = this.getDao().systemBaseInfoDeleteByCondition(systemBaseInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_BASE_INFO")) {
				this.getCache().clear("T_SYSTEM_BASE_INFO");
			}
		}
		String kvalue = this.getSystemBaseInfoExampleConditionSql(systemBaseInfoQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_BASE_INFO", "条件删除", "conditionSql", kvalue, systemBaseInfoQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	public int systemBaseInfoUpdate(SystemBaseInfo systemBaseInfo) throws CacheException {
		int ret = this.getDao().systemBaseInfoUpdate(systemBaseInfo);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_BASE_INFO")) {
				this.getCache().clear("T_SYSTEM_BASE_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemBaseInfo.getCodeId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemBaseInfo.getCodeType());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemBaseInfo.getSystemType());
		this.operatesLogSimpleAdd("T_SYSTEM_BASE_INFO", "更新", "CODE_ID,CODE_TYPE,SYSTEM_TYPE", kvalue, systemBaseInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	public int systemBaseInfoUpdateSelective(SystemBaseInfo systemBaseInfo) throws CacheException {
		int ret = this.getDao().systemBaseInfoUpdateSelective(systemBaseInfo);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_BASE_INFO")) {
				this.getCache().clear("T_SYSTEM_BASE_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemBaseInfo.getCodeId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemBaseInfo.getCodeType());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemBaseInfo.getSystemType());
		this.operatesLogSimpleAdd("T_SYSTEM_BASE_INFO", "部分更新", "CODE_ID,CODE_TYPE,SYSTEM_TYPE", kvalue, systemBaseInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfoQueryCondition">附加的条件</param>
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	public int systemBaseInfoUpdateByCondition(SystemBaseInfo systemBaseInfo, SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException {
		int ret = this.getDao().systemBaseInfoUpdateByCondition(systemBaseInfo, systemBaseInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_BASE_INFO")) {
				this.getCache().clear("T_SYSTEM_BASE_INFO");
			}
		}
		String kvalue = this.getSystemBaseInfoExampleConditionSql(systemBaseInfoQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_BASE_INFO", "条件更新", "conditionSql", kvalue, systemBaseInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfoQueryCondition">附加的条件</param>
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	public int systemBaseInfoUpdateSelectiveByCondition(SystemBaseInfo systemBaseInfo, SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException {
		int ret = this.getDao().systemBaseInfoUpdateSelectiveByCondition(systemBaseInfo, systemBaseInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_BASE_INFO")) {
				this.getCache().clear("T_SYSTEM_BASE_INFO");
			}
		}
		String kvalue = this.getSystemBaseInfoExampleConditionSql(systemBaseInfoQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_BASE_INFO", "批量部分更新", "conditionSql", kvalue, systemBaseInfo, ret);
		return ret;
	}
	
	public String getSystemBaseInfoExampleConditionSql(SystemBaseInfoExample systemBaseInfoQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemBaseInfoQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemBaseInfoExample.Criteria item = systemBaseInfoQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemBaseInfoExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemBaseInfo">从数据库中查询一个对象SystemBaseInfo</param>
	 * <param name="ASystemBaseInfoKey">系统基本信息表 主键类</param>
	 */
	public SystemBaseInfo systemBaseInfoSelectByPrimaryKey(SystemBaseInfoKey ASystemBaseInfoKey) throws CacheException {
		if (this.needCache("T_SYSTEM_BASE_INFO")) {
			String key = ("T_SYSTEM_BASE_INFO_" + "_BYUNIINDEX_");
			SystemBaseInfo obj = ((SystemBaseInfo)(this.getCache().get("T_SYSTEM_BASE_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().systemBaseInfoSelectByPrimaryKey(ASystemBaseInfoKey);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_BASE_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemBaseInfoSelectByPrimaryKey(ASystemBaseInfoKey);
		}
	}
	
	/**
	 * <param name="systemBaseInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemBaseInfo> systemBaseInfoSelectObjects(SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_BASE_INFO")) {
			String key = ("T_SYSTEM_BASE_INFO_" 
						+ ("queryObject_" + this.getSystemBaseInfoExampleConditionSql(systemBaseInfoQueryCondition)));
			List<SystemBaseInfo> obj = ((List<SystemBaseInfo>)(this.getCache().get("T_SYSTEM_BASE_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().systemBaseInfoSelectObjects(systemBaseInfoQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_BASE_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemBaseInfoSelectObjects(systemBaseInfoQueryCondition);
		}
	}
	
	/**
	 * <param name="systemBaseInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemBaseInfoQuerySelectObjectsCount(SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_BASE_INFO")) {
			String key = ("T_SYSTEM_BASE_INFO_" 
						+ ("queryCount_" + this.getSystemBaseInfoExampleConditionSql(systemBaseInfoQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_BASE_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().systemBaseInfoQuerySelectObjectsCount(systemBaseInfoQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_BASE_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemBaseInfoQuerySelectObjectsCount(systemBaseInfoQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要插入的新对象</param>
	 */
	public int systemClientActivationInsert(SystemClientActivation systemClientActivation) throws CacheException {
		int ret = this.getDao().systemClientActivationInsert(systemClientActivation);
		if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
			this.getCache().clear("T_SYSTEM_CLIENT_ACTIVATION");
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientActivation.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_ACTIVATION", "插入", "ID", kvalue, systemClientActivation, ret);
		return ret;
	}
	
	/**
	 * <param name="systemClientActivation">从数据库中删除一个对象SystemClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	public int systemClientActivationDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemClientActivationDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_ACTIVATION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_ACTIVATION", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemClientActivation">从数据库中删除一个对象SystemClientActivation</param>
	 */
	public int systemClientActivationDeleteByCondition(SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientActivationDeleteByCondition(systemClientActivationQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_ACTIVATION");
			}
		}
		String kvalue = this.getSystemClientActivationExampleConditionSql(systemClientActivationQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_ACTIVATION", "条件删除", "conditionSql", kvalue, systemClientActivationQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	public int systemClientActivationUpdate(SystemClientActivation systemClientActivation) throws CacheException {
		int ret = this.getDao().systemClientActivationUpdate(systemClientActivation);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_ACTIVATION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientActivation.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_ACTIVATION", "更新", "ID", kvalue, systemClientActivation, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	public int systemClientActivationUpdateSelective(SystemClientActivation systemClientActivation) throws CacheException {
		int ret = this.getDao().systemClientActivationUpdateSelective(systemClientActivation);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_ACTIVATION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientActivation.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_ACTIVATION", "部分更新", "ID", kvalue, systemClientActivation, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemClientActivation到数据库中
	 * <param name="systemClientActivationQueryCondition">附加的条件</param>
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	public int systemClientActivationUpdateByCondition(SystemClientActivation systemClientActivation, SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientActivationUpdateByCondition(systemClientActivation, systemClientActivationQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_ACTIVATION");
			}
		}
		String kvalue = this.getSystemClientActivationExampleConditionSql(systemClientActivationQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_ACTIVATION", "条件更新", "conditionSql", kvalue, systemClientActivation, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemClientActivation到数据库中
	 * <param name="systemClientActivationQueryCondition">附加的条件</param>
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	public int systemClientActivationUpdateSelectiveByCondition(SystemClientActivation systemClientActivation, SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientActivationUpdateSelectiveByCondition(systemClientActivation, systemClientActivationQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_ACTIVATION");
			}
		}
		String kvalue = this.getSystemClientActivationExampleConditionSql(systemClientActivationQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_ACTIVATION", "批量部分更新", "conditionSql", kvalue, systemClientActivation, ret);
		return ret;
	}
	
	public String getSystemClientActivationExampleConditionSql(SystemClientActivationExample systemClientActivationQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemClientActivationQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemClientActivationExample.Criteria item = systemClientActivationQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemClientActivationExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemClientActivation">从数据库中查询一个对象SystemClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	public SystemClientActivation systemClientActivationSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
			String key = ("T_SYSTEM_CLIENT_ACTIVATION_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemClientActivation obj = ((SystemClientActivation)(this.getCache().get("T_SYSTEM_CLIENT_ACTIVATION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientActivationSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_ACTIVATION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientActivationSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemClientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemClientActivation> systemClientActivationSelectObjects(SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
			String key = ("T_SYSTEM_CLIENT_ACTIVATION_" 
						+ ("queryObject_" + this.getSystemClientActivationExampleConditionSql(systemClientActivationQueryCondition)));
			List<SystemClientActivation> obj = ((List<SystemClientActivation>)(this.getCache().get("T_SYSTEM_CLIENT_ACTIVATION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientActivationSelectObjects(systemClientActivationQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_ACTIVATION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientActivationSelectObjects(systemClientActivationQueryCondition);
		}
	}
	
	/**
	 * <param name="systemClientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemClientActivationQuerySelectObjectsCount(SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_ACTIVATION")) {
			String key = ("T_SYSTEM_CLIENT_ACTIVATION_" 
						+ ("queryCount_" + this.getSystemClientActivationExampleConditionSql(systemClientActivationQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_CLIENT_ACTIVATION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientActivationQuerySelectObjectsCount(systemClientActivationQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_ACTIVATION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientActivationQuerySelectObjectsCount(systemClientActivationQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要插入的新对象</param>
	 */
	public int systemClientTrackInsert(SystemClientTrack systemClientTrack) throws CacheException {
		int ret = this.getDao().systemClientTrackInsert(systemClientTrack);
		if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
			this.getCache().clear("T_SYSTEM_CLIENT_TRACK");
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientTrack.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK", "插入", "ID", kvalue, systemClientTrack, ret);
		return ret;
	}
	
	/**
	 * <param name="systemClientTrack">从数据库中删除一个对象SystemClientTrack</param>
	 * <param name="AId">PK</param>
	 */
	public int systemClientTrackDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemClientTrackDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemClientTrack">从数据库中删除一个对象SystemClientTrack</param>
	 */
	public int systemClientTrackDeleteByCondition(SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientTrackDeleteByCondition(systemClientTrackQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK");
			}
		}
		String kvalue = this.getSystemClientTrackExampleConditionSql(systemClientTrackQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK", "条件删除", "conditionSql", kvalue, systemClientTrackQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	public int systemClientTrackUpdate(SystemClientTrack systemClientTrack) throws CacheException {
		int ret = this.getDao().systemClientTrackUpdate(systemClientTrack);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientTrack.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK", "更新", "ID", kvalue, systemClientTrack, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	public int systemClientTrackUpdateSelective(SystemClientTrack systemClientTrack) throws CacheException {
		int ret = this.getDao().systemClientTrackUpdateSelective(systemClientTrack);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientTrack.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK", "部分更新", "ID", kvalue, systemClientTrack, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemClientTrack到数据库中
	 * <param name="systemClientTrackQueryCondition">附加的条件</param>
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	public int systemClientTrackUpdateByCondition(SystemClientTrack systemClientTrack, SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientTrackUpdateByCondition(systemClientTrack, systemClientTrackQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK");
			}
		}
		String kvalue = this.getSystemClientTrackExampleConditionSql(systemClientTrackQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK", "条件更新", "conditionSql", kvalue, systemClientTrack, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemClientTrack到数据库中
	 * <param name="systemClientTrackQueryCondition">附加的条件</param>
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	public int systemClientTrackUpdateSelectiveByCondition(SystemClientTrack systemClientTrack, SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientTrackUpdateSelectiveByCondition(systemClientTrack, systemClientTrackQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK");
			}
		}
		String kvalue = this.getSystemClientTrackExampleConditionSql(systemClientTrackQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK", "批量部分更新", "conditionSql", kvalue, systemClientTrack, ret);
		return ret;
	}
	
	public String getSystemClientTrackExampleConditionSql(SystemClientTrackExample systemClientTrackQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemClientTrackQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemClientTrackExample.Criteria item = systemClientTrackQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemClientTrackExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemClientTrack">从数据库中查询一个对象SystemClientTrack</param>
	 * <param name="AId">PK</param>
	 */
	public SystemClientTrack systemClientTrackSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
			String key = ("T_SYSTEM_CLIENT_TRACK_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemClientTrack obj = ((SystemClientTrack)(this.getCache().get("T_SYSTEM_CLIENT_TRACK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientTrackSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_TRACK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientTrackSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemClientTrackQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemClientTrack> systemClientTrackSelectObjects(SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
			String key = ("T_SYSTEM_CLIENT_TRACK_" 
						+ ("queryObject_" + this.getSystemClientTrackExampleConditionSql(systemClientTrackQueryCondition)));
			List<SystemClientTrack> obj = ((List<SystemClientTrack>)(this.getCache().get("T_SYSTEM_CLIENT_TRACK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientTrackSelectObjects(systemClientTrackQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_TRACK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientTrackSelectObjects(systemClientTrackQueryCondition);
		}
	}
	
	/**
	 * <param name="systemClientTrackQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemClientTrackQuerySelectObjectsCount(SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_TRACK")) {
			String key = ("T_SYSTEM_CLIENT_TRACK_" 
						+ ("queryCount_" + this.getSystemClientTrackExampleConditionSql(systemClientTrackQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_CLIENT_TRACK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientTrackQuerySelectObjectsCount(systemClientTrackQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_TRACK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientTrackQuerySelectObjectsCount(systemClientTrackQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要插入的新对象</param>
	 */
	public int systemClientTrackDetailInsert(SystemClientTrackDetail systemClientTrackDetail) throws CacheException {
		int ret = this.getDao().systemClientTrackDetailInsert(systemClientTrackDetail);
		if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
			this.getCache().clear("T_SYSTEM_CLIENT_TRACK_DETAIL");
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientTrackDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK_DETAIL", "插入", "ID", kvalue, systemClientTrackDetail, ret);
		return ret;
	}
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中删除一个对象SystemClientTrackDetail</param>
	 * <param name="AId">PK</param>
	 */
	public int systemClientTrackDetailDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemClientTrackDetailDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK_DETAIL", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中删除一个对象SystemClientTrackDetail</param>
	 */
	public int systemClientTrackDetailDeleteByCondition(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientTrackDetailDeleteByCondition(systemClientTrackDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK_DETAIL");
			}
		}
		String kvalue = this.getSystemClientTrackDetailExampleConditionSql(systemClientTrackDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK_DETAIL", "条件删除", "conditionSql", kvalue, systemClientTrackDetailQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	public int systemClientTrackDetailUpdate(SystemClientTrackDetail systemClientTrackDetail) throws CacheException {
		int ret = this.getDao().systemClientTrackDetailUpdate(systemClientTrackDetail);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientTrackDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK_DETAIL", "更新", "ID", kvalue, systemClientTrackDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	public int systemClientTrackDetailUpdateSelective(SystemClientTrackDetail systemClientTrackDetail) throws CacheException {
		int ret = this.getDao().systemClientTrackDetailUpdateSelective(systemClientTrackDetail);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientTrackDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK_DETAIL", "部分更新", "ID", kvalue, systemClientTrackDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetailQueryCondition">附加的条件</param>
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	public int systemClientTrackDetailUpdateByCondition(SystemClientTrackDetail systemClientTrackDetail, SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientTrackDetailUpdateByCondition(systemClientTrackDetail, systemClientTrackDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK_DETAIL");
			}
		}
		String kvalue = this.getSystemClientTrackDetailExampleConditionSql(systemClientTrackDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK_DETAIL", "条件更新", "conditionSql", kvalue, systemClientTrackDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetailQueryCondition">附加的条件</param>
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	public int systemClientTrackDetailUpdateSelectiveByCondition(SystemClientTrackDetail systemClientTrackDetail, SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientTrackDetailUpdateSelectiveByCondition(systemClientTrackDetail, systemClientTrackDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
				this.getCache().clear("T_SYSTEM_CLIENT_TRACK_DETAIL");
			}
		}
		String kvalue = this.getSystemClientTrackDetailExampleConditionSql(systemClientTrackDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_TRACK_DETAIL", "批量部分更新", "conditionSql", kvalue, systemClientTrackDetail, ret);
		return ret;
	}
	
	public String getSystemClientTrackDetailExampleConditionSql(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemClientTrackDetailQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemClientTrackDetailExample.Criteria item = systemClientTrackDetailQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemClientTrackDetailExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中查询一个对象SystemClientTrackDetail</param>
	 * <param name="AId">PK</param>
	 */
	public SystemClientTrackDetail systemClientTrackDetailSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
			String key = ("T_SYSTEM_CLIENT_TRACK_DETAIL_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemClientTrackDetail obj = ((SystemClientTrackDetail)(this.getCache().get("T_SYSTEM_CLIENT_TRACK_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientTrackDetailSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_TRACK_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientTrackDetailSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemClientTrackDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemClientTrackDetail> systemClientTrackDetailSelectObjects(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
			String key = ("T_SYSTEM_CLIENT_TRACK_DETAIL_" 
						+ ("queryObject_" + this.getSystemClientTrackDetailExampleConditionSql(systemClientTrackDetailQueryCondition)));
			List<SystemClientTrackDetail> obj = ((List<SystemClientTrackDetail>)(this.getCache().get("T_SYSTEM_CLIENT_TRACK_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientTrackDetailSelectObjects(systemClientTrackDetailQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_TRACK_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientTrackDetailSelectObjects(systemClientTrackDetailQueryCondition);
		}
	}
	
	/**
	 * <param name="systemClientTrackDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemClientTrackDetailQuerySelectObjectsCount(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_TRACK_DETAIL")) {
			String key = ("T_SYSTEM_CLIENT_TRACK_DETAIL_" 
						+ ("queryCount_" + this.getSystemClientTrackDetailExampleConditionSql(systemClientTrackDetailQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_CLIENT_TRACK_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientTrackDetailQuerySelectObjectsCount(systemClientTrackDetailQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_TRACK_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientTrackDetailQuerySelectObjectsCount(systemClientTrackDetailQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要插入的新对象</param>
	 */
	public int systemClientVersionInsert(SystemClientVersion systemClientVersion) throws CacheException {
		int ret = this.getDao().systemClientVersionInsert(systemClientVersion);
		if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
			this.getCache().clear("T_SYSTEM_CLIENT_VERSION");
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientVersion.getClientType());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemClientVersion.getClientVersion());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_VERSION", "插入", "CLIENT_TYPE,CLIENT_VERSION", kvalue, systemClientVersion, ret);
		return ret;
	}
	
	/**
	 * <param name="systemClientVersion">从数据库中删除一个对象SystemClientVersion</param>
	 * <param name="ASystemClientVersionKey">客户端版本控制 主键类</param>
	 */
	public int systemClientVersionDeleteByPrimaryKey(SystemClientVersionKey ASystemClientVersionKey) throws CacheException {
		int ret = this.getDao().systemClientVersionDeleteByPrimaryKey(ASystemClientVersionKey);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_VERSION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + ASystemClientVersionKey.getClientType());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + ASystemClientVersionKey.getClientVersion());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_VERSION", "删除", "CLIENT_TYPE,CLIENT_VERSION", kvalue, ASystemClientVersionKey, ret);
		return ret;
	}
	
	/**
	 * <param name="systemClientVersion">从数据库中删除一个对象SystemClientVersion</param>
	 */
	public int systemClientVersionDeleteByCondition(SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientVersionDeleteByCondition(systemClientVersionQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_VERSION");
			}
		}
		String kvalue = this.getSystemClientVersionExampleConditionSql(systemClientVersionQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_VERSION", "条件删除", "conditionSql", kvalue, systemClientVersionQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	public int systemClientVersionUpdate(SystemClientVersion systemClientVersion) throws CacheException {
		int ret = this.getDao().systemClientVersionUpdate(systemClientVersion);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_VERSION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientVersion.getClientType());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemClientVersion.getClientVersion());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_VERSION", "更新", "CLIENT_TYPE,CLIENT_VERSION", kvalue, systemClientVersion, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	public int systemClientVersionUpdateSelective(SystemClientVersion systemClientVersion) throws CacheException {
		int ret = this.getDao().systemClientVersionUpdateSelective(systemClientVersion);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_VERSION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemClientVersion.getClientType());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemClientVersion.getClientVersion());
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_VERSION", "部分更新", "CLIENT_TYPE,CLIENT_VERSION", kvalue, systemClientVersion, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemClientVersion到数据库中
	 * <param name="systemClientVersionQueryCondition">附加的条件</param>
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	public int systemClientVersionUpdateByCondition(SystemClientVersion systemClientVersion, SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientVersionUpdateByCondition(systemClientVersion, systemClientVersionQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_VERSION");
			}
		}
		String kvalue = this.getSystemClientVersionExampleConditionSql(systemClientVersionQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_VERSION", "条件更新", "conditionSql", kvalue, systemClientVersion, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemClientVersion到数据库中
	 * <param name="systemClientVersionQueryCondition">附加的条件</param>
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	public int systemClientVersionUpdateSelectiveByCondition(SystemClientVersion systemClientVersion, SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException {
		int ret = this.getDao().systemClientVersionUpdateSelectiveByCondition(systemClientVersion, systemClientVersionQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
				this.getCache().clear("T_SYSTEM_CLIENT_VERSION");
			}
		}
		String kvalue = this.getSystemClientVersionExampleConditionSql(systemClientVersionQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CLIENT_VERSION", "批量部分更新", "conditionSql", kvalue, systemClientVersion, ret);
		return ret;
	}
	
	public String getSystemClientVersionExampleConditionSql(SystemClientVersionExample systemClientVersionQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemClientVersionQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemClientVersionExample.Criteria item = systemClientVersionQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemClientVersionExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemClientVersion">从数据库中查询一个对象SystemClientVersion</param>
	 * <param name="ASystemClientVersionKey">客户端版本控制 主键类</param>
	 */
	public SystemClientVersion systemClientVersionSelectByPrimaryKey(SystemClientVersionKey ASystemClientVersionKey) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
			String key = ("T_SYSTEM_CLIENT_VERSION_" + "_BYUNIINDEX_");
			SystemClientVersion obj = ((SystemClientVersion)(this.getCache().get("T_SYSTEM_CLIENT_VERSION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientVersionSelectByPrimaryKey(ASystemClientVersionKey);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_VERSION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientVersionSelectByPrimaryKey(ASystemClientVersionKey);
		}
	}
	
	/**
	 * <param name="systemClientVersionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemClientVersion> systemClientVersionSelectObjects(SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
			String key = ("T_SYSTEM_CLIENT_VERSION_" 
						+ ("queryObject_" + this.getSystemClientVersionExampleConditionSql(systemClientVersionQueryCondition)));
			List<SystemClientVersion> obj = ((List<SystemClientVersion>)(this.getCache().get("T_SYSTEM_CLIENT_VERSION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientVersionSelectObjects(systemClientVersionQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_VERSION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientVersionSelectObjects(systemClientVersionQueryCondition);
		}
	}
	
	/**
	 * <param name="systemClientVersionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemClientVersionQuerySelectObjectsCount(SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CLIENT_VERSION")) {
			String key = ("T_SYSTEM_CLIENT_VERSION_" 
						+ ("queryCount_" + this.getSystemClientVersionExampleConditionSql(systemClientVersionQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_CLIENT_VERSION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemClientVersionQuerySelectObjectsCount(systemClientVersionQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CLIENT_VERSION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemClientVersionQuerySelectObjectsCount(systemClientVersionQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemConfig到数据库中
	 * <param name="systemConfig">需要插入的新对象</param>
	 */
	public int systemConfigInsert(SystemConfig systemConfig) throws CacheException {
		int ret = this.getDao().systemConfigInsert(systemConfig);
		if (this.needCache("T_SYSTEM_CONFIG")) {
			this.getCache().clear("T_SYSTEM_CONFIG");
		}
		String kvalue = "";
		kvalue = (kvalue + systemConfig.getSystemParamCategory());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemConfig.getSystemParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_CONFIG", "插入", "SYSTEM_PARAM_CATEGORY,SYSTEM_PARAM_CODE", kvalue, systemConfig, ret);
		return ret;
	}
	
	/**
	 * <param name="systemConfig">从数据库中删除一个对象SystemConfig</param>
	 * <param name="ASystemConfigKey">系统配置表 主键类</param>
	 */
	public int systemConfigDeleteByPrimaryKey(SystemConfigKey ASystemConfigKey) throws CacheException {
		int ret = this.getDao().systemConfigDeleteByPrimaryKey(ASystemConfigKey);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CONFIG")) {
				this.getCache().clear("T_SYSTEM_CONFIG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + ASystemConfigKey.getSystemParamCategory());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + ASystemConfigKey.getSystemParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_CONFIG", "删除", "SYSTEM_PARAM_CATEGORY,SYSTEM_PARAM_CODE", kvalue, ASystemConfigKey, ret);
		return ret;
	}
	
	/**
	 * <param name="systemConfig">从数据库中删除一个对象SystemConfig</param>
	 */
	public int systemConfigDeleteByCondition(SystemConfigExample systemConfigQueryCondition) throws CacheException {
		int ret = this.getDao().systemConfigDeleteByCondition(systemConfigQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CONFIG")) {
				this.getCache().clear("T_SYSTEM_CONFIG");
			}
		}
		String kvalue = this.getSystemConfigExampleConditionSql(systemConfigQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CONFIG", "条件删除", "conditionSql", kvalue, systemConfigQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemConfig到数据库中
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	public int systemConfigUpdate(SystemConfig systemConfig) throws CacheException {
		int ret = this.getDao().systemConfigUpdate(systemConfig);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CONFIG")) {
				this.getCache().clear("T_SYSTEM_CONFIG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemConfig.getSystemParamCategory());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemConfig.getSystemParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_CONFIG", "更新", "SYSTEM_PARAM_CATEGORY,SYSTEM_PARAM_CODE", kvalue, systemConfig, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemConfig到数据库中
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	public int systemConfigUpdateSelective(SystemConfig systemConfig) throws CacheException {
		int ret = this.getDao().systemConfigUpdateSelective(systemConfig);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CONFIG")) {
				this.getCache().clear("T_SYSTEM_CONFIG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemConfig.getSystemParamCategory());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemConfig.getSystemParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_CONFIG", "部分更新", "SYSTEM_PARAM_CATEGORY,SYSTEM_PARAM_CODE", kvalue, systemConfig, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemConfig到数据库中
	 * <param name="systemConfigQueryCondition">附加的条件</param>
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	public int systemConfigUpdateByCondition(SystemConfig systemConfig, SystemConfigExample systemConfigQueryCondition) throws CacheException {
		int ret = this.getDao().systemConfigUpdateByCondition(systemConfig, systemConfigQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CONFIG")) {
				this.getCache().clear("T_SYSTEM_CONFIG");
			}
		}
		String kvalue = this.getSystemConfigExampleConditionSql(systemConfigQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CONFIG", "条件更新", "conditionSql", kvalue, systemConfig, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemConfig到数据库中
	 * <param name="systemConfigQueryCondition">附加的条件</param>
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	public int systemConfigUpdateSelectiveByCondition(SystemConfig systemConfig, SystemConfigExample systemConfigQueryCondition) throws CacheException {
		int ret = this.getDao().systemConfigUpdateSelectiveByCondition(systemConfig, systemConfigQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CONFIG")) {
				this.getCache().clear("T_SYSTEM_CONFIG");
			}
		}
		String kvalue = this.getSystemConfigExampleConditionSql(systemConfigQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CONFIG", "批量部分更新", "conditionSql", kvalue, systemConfig, ret);
		return ret;
	}
	
	public String getSystemConfigExampleConditionSql(SystemConfigExample systemConfigQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemConfigQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemConfigExample.Criteria item = systemConfigQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemConfigExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemConfig">从数据库中查询一个对象SystemConfig</param>
	 * <param name="ASystemConfigKey">系统配置表 主键类</param>
	 */
	public SystemConfig systemConfigSelectByPrimaryKey(SystemConfigKey ASystemConfigKey) throws CacheException {
		if (this.needCache("T_SYSTEM_CONFIG")) {
			String key = ("T_SYSTEM_CONFIG_" + "_BYUNIINDEX_");
			SystemConfig obj = ((SystemConfig)(this.getCache().get("T_SYSTEM_CONFIG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemConfigSelectByPrimaryKey(ASystemConfigKey);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CONFIG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemConfigSelectByPrimaryKey(ASystemConfigKey);
		}
	}
	
	/**
	 * <param name="systemConfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemConfig> systemConfigSelectObjects(SystemConfigExample systemConfigQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CONFIG")) {
			String key = ("T_SYSTEM_CONFIG_" 
						+ ("queryObject_" + this.getSystemConfigExampleConditionSql(systemConfigQueryCondition)));
			List<SystemConfig> obj = ((List<SystemConfig>)(this.getCache().get("T_SYSTEM_CONFIG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemConfigSelectObjects(systemConfigQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CONFIG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemConfigSelectObjects(systemConfigQueryCondition);
		}
	}
	
	/**
	 * <param name="systemConfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemConfigQuerySelectObjectsCount(SystemConfigExample systemConfigQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CONFIG")) {
			String key = ("T_SYSTEM_CONFIG_" 
						+ ("queryCount_" + this.getSystemConfigExampleConditionSql(systemConfigQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_CONFIG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemConfigQuerySelectObjectsCount(systemConfigQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CONFIG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemConfigQuerySelectObjectsCount(systemConfigQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemCronJob到数据库中
	 * <param name="systemCronJob">需要插入的新对象</param>
	 */
	public int systemCronJobInsert(SystemCronJob systemCronJob) throws CacheException {
		int ret = this.getDao().systemCronJobInsert(systemCronJob);
		if (this.needCache("T_SYSTEM_CRON_JOB")) {
			this.getCache().clear("T_SYSTEM_CRON_JOB");
		}
		String kvalue = "";
		kvalue = (kvalue + systemCronJob.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB", "插入", "ID", kvalue, systemCronJob, ret);
		return ret;
	}
	
	/**
	 * <param name="systemCronJob">从数据库中删除一个对象SystemCronJob</param>
	 * <param name="AId"></param>
	 */
	public int systemCronJobDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemCronJobDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemCronJob">从数据库中删除一个对象SystemCronJob</param>
	 */
	public int systemCronJobDeleteByCondition(SystemCronJobExample systemCronJobQueryCondition) throws CacheException {
		int ret = this.getDao().systemCronJobDeleteByCondition(systemCronJobQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB");
			}
		}
		String kvalue = this.getSystemCronJobExampleConditionSql(systemCronJobQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB", "条件删除", "conditionSql", kvalue, systemCronJobQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemCronJob到数据库中
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	public int systemCronJobUpdate(SystemCronJob systemCronJob) throws CacheException {
		int ret = this.getDao().systemCronJobUpdate(systemCronJob);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemCronJob.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB", "更新", "ID", kvalue, systemCronJob, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemCronJob到数据库中
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	public int systemCronJobUpdateSelective(SystemCronJob systemCronJob) throws CacheException {
		int ret = this.getDao().systemCronJobUpdateSelective(systemCronJob);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemCronJob.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB", "部分更新", "ID", kvalue, systemCronJob, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemCronJob到数据库中
	 * <param name="systemCronJobQueryCondition">附加的条件</param>
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	public int systemCronJobUpdateByCondition(SystemCronJob systemCronJob, SystemCronJobExample systemCronJobQueryCondition) throws CacheException {
		int ret = this.getDao().systemCronJobUpdateByCondition(systemCronJob, systemCronJobQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB");
			}
		}
		String kvalue = this.getSystemCronJobExampleConditionSql(systemCronJobQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB", "条件更新", "conditionSql", kvalue, systemCronJob, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemCronJob到数据库中
	 * <param name="systemCronJobQueryCondition">附加的条件</param>
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	public int systemCronJobUpdateSelectiveByCondition(SystemCronJob systemCronJob, SystemCronJobExample systemCronJobQueryCondition) throws CacheException {
		int ret = this.getDao().systemCronJobUpdateSelectiveByCondition(systemCronJob, systemCronJobQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB");
			}
		}
		String kvalue = this.getSystemCronJobExampleConditionSql(systemCronJobQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB", "批量部分更新", "conditionSql", kvalue, systemCronJob, ret);
		return ret;
	}
	
	public String getSystemCronJobExampleConditionSql(SystemCronJobExample systemCronJobQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemCronJobQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemCronJobExample.Criteria item = systemCronJobQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemCronJobExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemCronJob">从数据库中查询一个对象SystemCronJob</param>
	 * <param name="AId"></param>
	 */
	public SystemCronJob systemCronJobSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_CRON_JOB")) {
			String key = ("T_SYSTEM_CRON_JOB_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemCronJob obj = ((SystemCronJob)(this.getCache().get("T_SYSTEM_CRON_JOB", key)));
			if ((obj == null)) {
				obj = this.getDao().systemCronJobSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CRON_JOB", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemCronJobSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemCronJobQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemCronJob> systemCronJobSelectObjects(SystemCronJobExample systemCronJobQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CRON_JOB")) {
			String key = ("T_SYSTEM_CRON_JOB_" 
						+ ("queryObject_" + this.getSystemCronJobExampleConditionSql(systemCronJobQueryCondition)));
			List<SystemCronJob> obj = ((List<SystemCronJob>)(this.getCache().get("T_SYSTEM_CRON_JOB", key)));
			if ((obj == null)) {
				obj = this.getDao().systemCronJobSelectObjects(systemCronJobQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CRON_JOB", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemCronJobSelectObjects(systemCronJobQueryCondition);
		}
	}
	
	/**
	 * <param name="systemCronJobQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemCronJobQuerySelectObjectsCount(SystemCronJobExample systemCronJobQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CRON_JOB")) {
			String key = ("T_SYSTEM_CRON_JOB_" 
						+ ("queryCount_" + this.getSystemCronJobExampleConditionSql(systemCronJobQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_CRON_JOB", key)));
			if ((obj == null)) {
				obj = this.getDao().systemCronJobQuerySelectObjectsCount(systemCronJobQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CRON_JOB", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemCronJobQuerySelectObjectsCount(systemCronJobQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要插入的新对象</param>
	 */
	public int systemCronJobLogInsert(SystemCronJobLog systemCronJobLog) throws CacheException {
		int ret = this.getDao().systemCronJobLogInsert(systemCronJobLog);
		if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
			this.getCache().clear("T_SYSTEM_CRON_JOB_LOG");
		}
		String kvalue = "";
		kvalue = (kvalue + systemCronJobLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB_LOG", "插入", "ID", kvalue, systemCronJobLog, ret);
		return ret;
	}
	
	/**
	 * <param name="systemCronJobLog">从数据库中删除一个对象SystemCronJobLog</param>
	 * <param name="AId"></param>
	 */
	public int systemCronJobLogDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemCronJobLogDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB_LOG", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemCronJobLog">从数据库中删除一个对象SystemCronJobLog</param>
	 */
	public int systemCronJobLogDeleteByCondition(SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemCronJobLogDeleteByCondition(systemCronJobLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB_LOG");
			}
		}
		String kvalue = this.getSystemCronJobLogExampleConditionSql(systemCronJobLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB_LOG", "条件删除", "conditionSql", kvalue, systemCronJobLogQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	public int systemCronJobLogUpdate(SystemCronJobLog systemCronJobLog) throws CacheException {
		int ret = this.getDao().systemCronJobLogUpdate(systemCronJobLog);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemCronJobLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB_LOG", "更新", "ID", kvalue, systemCronJobLog, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	public int systemCronJobLogUpdateSelective(SystemCronJobLog systemCronJobLog) throws CacheException {
		int ret = this.getDao().systemCronJobLogUpdateSelective(systemCronJobLog);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemCronJobLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB_LOG", "部分更新", "ID", kvalue, systemCronJobLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLogQueryCondition">附加的条件</param>
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	public int systemCronJobLogUpdateByCondition(SystemCronJobLog systemCronJobLog, SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemCronJobLogUpdateByCondition(systemCronJobLog, systemCronJobLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB_LOG");
			}
		}
		String kvalue = this.getSystemCronJobLogExampleConditionSql(systemCronJobLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB_LOG", "条件更新", "conditionSql", kvalue, systemCronJobLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLogQueryCondition">附加的条件</param>
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	public int systemCronJobLogUpdateSelectiveByCondition(SystemCronJobLog systemCronJobLog, SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemCronJobLogUpdateSelectiveByCondition(systemCronJobLog, systemCronJobLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
				this.getCache().clear("T_SYSTEM_CRON_JOB_LOG");
			}
		}
		String kvalue = this.getSystemCronJobLogExampleConditionSql(systemCronJobLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_CRON_JOB_LOG", "批量部分更新", "conditionSql", kvalue, systemCronJobLog, ret);
		return ret;
	}
	
	public String getSystemCronJobLogExampleConditionSql(SystemCronJobLogExample systemCronJobLogQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemCronJobLogQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemCronJobLogExample.Criteria item = systemCronJobLogQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemCronJobLogExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemCronJobLog">从数据库中查询一个对象SystemCronJobLog</param>
	 * <param name="AId"></param>
	 */
	public SystemCronJobLog systemCronJobLogSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
			String key = ("T_SYSTEM_CRON_JOB_LOG_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemCronJobLog obj = ((SystemCronJobLog)(this.getCache().get("T_SYSTEM_CRON_JOB_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemCronJobLogSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CRON_JOB_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemCronJobLogSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemCronJobLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemCronJobLog> systemCronJobLogSelectObjects(SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
			String key = ("T_SYSTEM_CRON_JOB_LOG_" 
						+ ("queryObject_" + this.getSystemCronJobLogExampleConditionSql(systemCronJobLogQueryCondition)));
			List<SystemCronJobLog> obj = ((List<SystemCronJobLog>)(this.getCache().get("T_SYSTEM_CRON_JOB_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemCronJobLogSelectObjects(systemCronJobLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CRON_JOB_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemCronJobLogSelectObjects(systemCronJobLogQueryCondition);
		}
	}
	
	/**
	 * <param name="systemCronJobLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemCronJobLogQuerySelectObjectsCount(SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_CRON_JOB_LOG")) {
			String key = ("T_SYSTEM_CRON_JOB_LOG_" 
						+ ("queryCount_" + this.getSystemCronJobLogExampleConditionSql(systemCronJobLogQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_CRON_JOB_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemCronJobLogQuerySelectObjectsCount(systemCronJobLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_CRON_JOB_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemCronJobLogQuerySelectObjectsCount(systemCronJobLogQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要插入的新对象</param>
	 */
	public int systemExceptionLogInsert(SystemExceptionLog systemExceptionLog) throws CacheException {
		int ret = this.getDao().systemExceptionLogInsert(systemExceptionLog);
		if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
			this.getCache().clear("T_SYSTEM_EXCEPTION_LOG");
		}
		String kvalue = "";
		kvalue = (kvalue + systemExceptionLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_EXCEPTION_LOG", "插入", "ID", kvalue, systemExceptionLog, ret);
		return ret;
	}
	
	/**
	 * <param name="systemExceptionLog">从数据库中删除一个对象SystemExceptionLog</param>
	 * <param name="AId"></param>
	 */
	public int systemExceptionLogDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemExceptionLogDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
				this.getCache().clear("T_SYSTEM_EXCEPTION_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_EXCEPTION_LOG", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemExceptionLog">从数据库中删除一个对象SystemExceptionLog</param>
	 */
	public int systemExceptionLogDeleteByCondition(SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemExceptionLogDeleteByCondition(systemExceptionLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
				this.getCache().clear("T_SYSTEM_EXCEPTION_LOG");
			}
		}
		String kvalue = this.getSystemExceptionLogExampleConditionSql(systemExceptionLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_EXCEPTION_LOG", "条件删除", "conditionSql", kvalue, systemExceptionLogQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	public int systemExceptionLogUpdate(SystemExceptionLog systemExceptionLog) throws CacheException {
		int ret = this.getDao().systemExceptionLogUpdate(systemExceptionLog);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
				this.getCache().clear("T_SYSTEM_EXCEPTION_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemExceptionLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_EXCEPTION_LOG", "更新", "ID", kvalue, systemExceptionLog, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	public int systemExceptionLogUpdateSelective(SystemExceptionLog systemExceptionLog) throws CacheException {
		int ret = this.getDao().systemExceptionLogUpdateSelective(systemExceptionLog);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
				this.getCache().clear("T_SYSTEM_EXCEPTION_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemExceptionLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_EXCEPTION_LOG", "部分更新", "ID", kvalue, systemExceptionLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLogQueryCondition">附加的条件</param>
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	public int systemExceptionLogUpdateByCondition(SystemExceptionLog systemExceptionLog, SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemExceptionLogUpdateByCondition(systemExceptionLog, systemExceptionLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
				this.getCache().clear("T_SYSTEM_EXCEPTION_LOG");
			}
		}
		String kvalue = this.getSystemExceptionLogExampleConditionSql(systemExceptionLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_EXCEPTION_LOG", "条件更新", "conditionSql", kvalue, systemExceptionLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLogQueryCondition">附加的条件</param>
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	public int systemExceptionLogUpdateSelectiveByCondition(SystemExceptionLog systemExceptionLog, SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemExceptionLogUpdateSelectiveByCondition(systemExceptionLog, systemExceptionLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
				this.getCache().clear("T_SYSTEM_EXCEPTION_LOG");
			}
		}
		String kvalue = this.getSystemExceptionLogExampleConditionSql(systemExceptionLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_EXCEPTION_LOG", "批量部分更新", "conditionSql", kvalue, systemExceptionLog, ret);
		return ret;
	}
	
	public String getSystemExceptionLogExampleConditionSql(SystemExceptionLogExample systemExceptionLogQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemExceptionLogQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemExceptionLogExample.Criteria item = systemExceptionLogQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemExceptionLogExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemExceptionLog">从数据库中查询一个对象SystemExceptionLog</param>
	 * <param name="AId"></param>
	 */
	public SystemExceptionLog systemExceptionLogSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
			String key = ("T_SYSTEM_EXCEPTION_LOG_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemExceptionLog obj = ((SystemExceptionLog)(this.getCache().get("T_SYSTEM_EXCEPTION_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemExceptionLogSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_EXCEPTION_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemExceptionLogSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemExceptionLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemExceptionLog> systemExceptionLogSelectObjects(SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
			String key = ("T_SYSTEM_EXCEPTION_LOG_" 
						+ ("queryObject_" + this.getSystemExceptionLogExampleConditionSql(systemExceptionLogQueryCondition)));
			List<SystemExceptionLog> obj = ((List<SystemExceptionLog>)(this.getCache().get("T_SYSTEM_EXCEPTION_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemExceptionLogSelectObjects(systemExceptionLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_EXCEPTION_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemExceptionLogSelectObjects(systemExceptionLogQueryCondition);
		}
	}
	
	/**
	 * <param name="systemExceptionLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemExceptionLogQuerySelectObjectsCount(SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_EXCEPTION_LOG")) {
			String key = ("T_SYSTEM_EXCEPTION_LOG_" 
						+ ("queryCount_" + this.getSystemExceptionLogExampleConditionSql(systemExceptionLogQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_EXCEPTION_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemExceptionLogQuerySelectObjectsCount(systemExceptionLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_EXCEPTION_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemExceptionLogQuerySelectObjectsCount(systemExceptionLogQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要插入的新对象</param>
	 */
	public int systemExtUserRelationInsert(SystemExtUserRelation systemExtUserRelation) throws CacheException {
		int ret = this.getDao().systemExtUserRelationInsert(systemExtUserRelation);
		if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
			this.getCache().clear("T_SYSTEM_EXT_USER_RELATION");
		}
		String kvalue = "";
		kvalue = (kvalue + systemExtUserRelation.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_EXT_USER_RELATION", "插入", "ID", kvalue, systemExtUserRelation, ret);
		return ret;
	}
	
	/**
	 * <param name="systemExtUserRelation">从数据库中删除一个对象SystemExtUserRelation</param>
	 * <param name="AId">PK</param>
	 */
	public int systemExtUserRelationDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemExtUserRelationDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
				this.getCache().clear("T_SYSTEM_EXT_USER_RELATION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_EXT_USER_RELATION", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemExtUserRelation">从数据库中删除一个对象SystemExtUserRelation</param>
	 */
	public int systemExtUserRelationDeleteByCondition(SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException {
		int ret = this.getDao().systemExtUserRelationDeleteByCondition(systemExtUserRelationQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
				this.getCache().clear("T_SYSTEM_EXT_USER_RELATION");
			}
		}
		String kvalue = this.getSystemExtUserRelationExampleConditionSql(systemExtUserRelationQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_EXT_USER_RELATION", "条件删除", "conditionSql", kvalue, systemExtUserRelationQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	public int systemExtUserRelationUpdate(SystemExtUserRelation systemExtUserRelation) throws CacheException {
		int ret = this.getDao().systemExtUserRelationUpdate(systemExtUserRelation);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
				this.getCache().clear("T_SYSTEM_EXT_USER_RELATION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemExtUserRelation.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_EXT_USER_RELATION", "更新", "ID", kvalue, systemExtUserRelation, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	public int systemExtUserRelationUpdateSelective(SystemExtUserRelation systemExtUserRelation) throws CacheException {
		int ret = this.getDao().systemExtUserRelationUpdateSelective(systemExtUserRelation);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
				this.getCache().clear("T_SYSTEM_EXT_USER_RELATION");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemExtUserRelation.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_EXT_USER_RELATION", "部分更新", "ID", kvalue, systemExtUserRelation, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelationQueryCondition">附加的条件</param>
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	public int systemExtUserRelationUpdateByCondition(SystemExtUserRelation systemExtUserRelation, SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException {
		int ret = this.getDao().systemExtUserRelationUpdateByCondition(systemExtUserRelation, systemExtUserRelationQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
				this.getCache().clear("T_SYSTEM_EXT_USER_RELATION");
			}
		}
		String kvalue = this.getSystemExtUserRelationExampleConditionSql(systemExtUserRelationQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_EXT_USER_RELATION", "条件更新", "conditionSql", kvalue, systemExtUserRelation, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelationQueryCondition">附加的条件</param>
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	public int systemExtUserRelationUpdateSelectiveByCondition(SystemExtUserRelation systemExtUserRelation, SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException {
		int ret = this.getDao().systemExtUserRelationUpdateSelectiveByCondition(systemExtUserRelation, systemExtUserRelationQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
				this.getCache().clear("T_SYSTEM_EXT_USER_RELATION");
			}
		}
		String kvalue = this.getSystemExtUserRelationExampleConditionSql(systemExtUserRelationQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_EXT_USER_RELATION", "批量部分更新", "conditionSql", kvalue, systemExtUserRelation, ret);
		return ret;
	}
	
	public String getSystemExtUserRelationExampleConditionSql(SystemExtUserRelationExample systemExtUserRelationQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemExtUserRelationQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemExtUserRelationExample.Criteria item = systemExtUserRelationQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemExtUserRelationExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemExtUserRelation">从数据库中查询一个对象SystemExtUserRelation</param>
	 * <param name="AId">PK</param>
	 */
	public SystemExtUserRelation systemExtUserRelationSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
			String key = ("T_SYSTEM_EXT_USER_RELATION_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemExtUserRelation obj = ((SystemExtUserRelation)(this.getCache().get("T_SYSTEM_EXT_USER_RELATION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemExtUserRelationSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_EXT_USER_RELATION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemExtUserRelationSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemExtUserRelationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemExtUserRelation> systemExtUserRelationSelectObjects(SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
			String key = ("T_SYSTEM_EXT_USER_RELATION_" 
						+ ("queryObject_" + this.getSystemExtUserRelationExampleConditionSql(systemExtUserRelationQueryCondition)));
			List<SystemExtUserRelation> obj = ((List<SystemExtUserRelation>)(this.getCache().get("T_SYSTEM_EXT_USER_RELATION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemExtUserRelationSelectObjects(systemExtUserRelationQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_EXT_USER_RELATION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemExtUserRelationSelectObjects(systemExtUserRelationQueryCondition);
		}
	}
	
	/**
	 * <param name="systemExtUserRelationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemExtUserRelationQuerySelectObjectsCount(SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_EXT_USER_RELATION")) {
			String key = ("T_SYSTEM_EXT_USER_RELATION_" 
						+ ("queryCount_" + this.getSystemExtUserRelationExampleConditionSql(systemExtUserRelationQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_EXT_USER_RELATION", key)));
			if ((obj == null)) {
				obj = this.getDao().systemExtUserRelationQuerySelectObjectsCount(systemExtUserRelationQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_EXT_USER_RELATION", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemExtUserRelationQuerySelectObjectsCount(systemExtUserRelationQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要插入的新对象</param>
	 */
	public int systemHisMsgPushDetailInsert(SystemHisMsgPushDetail systemHisMsgPushDetail) throws CacheException {
		int ret = this.getDao().systemHisMsgPushDetailInsert(systemHisMsgPushDetail);
		if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
			this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_DETAIL");
		}
		String kvalue = "";
		kvalue = (kvalue + systemHisMsgPushDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_DETAIL", "插入", "ID", kvalue, systemHisMsgPushDetail, ret);
		return ret;
	}
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中删除一个对象SystemHisMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	public int systemHisMsgPushDetailDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemHisMsgPushDetailDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_DETAIL", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中删除一个对象SystemHisMsgPushDetail</param>
	 */
	public int systemHisMsgPushDetailDeleteByCondition(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemHisMsgPushDetailDeleteByCondition(systemHisMsgPushDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = this.getSystemHisMsgPushDetailExampleConditionSql(systemHisMsgPushDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_DETAIL", "条件删除", "conditionSql", kvalue, systemHisMsgPushDetailQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	public int systemHisMsgPushDetailUpdate(SystemHisMsgPushDetail systemHisMsgPushDetail) throws CacheException {
		int ret = this.getDao().systemHisMsgPushDetailUpdate(systemHisMsgPushDetail);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemHisMsgPushDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_DETAIL", "更新", "ID", kvalue, systemHisMsgPushDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	public int systemHisMsgPushDetailUpdateSelective(SystemHisMsgPushDetail systemHisMsgPushDetail) throws CacheException {
		int ret = this.getDao().systemHisMsgPushDetailUpdateSelective(systemHisMsgPushDetail);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemHisMsgPushDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_DETAIL", "部分更新", "ID", kvalue, systemHisMsgPushDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetailQueryCondition">附加的条件</param>
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	public int systemHisMsgPushDetailUpdateByCondition(SystemHisMsgPushDetail systemHisMsgPushDetail, SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemHisMsgPushDetailUpdateByCondition(systemHisMsgPushDetail, systemHisMsgPushDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = this.getSystemHisMsgPushDetailExampleConditionSql(systemHisMsgPushDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_DETAIL", "条件更新", "conditionSql", kvalue, systemHisMsgPushDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetailQueryCondition">附加的条件</param>
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	public int systemHisMsgPushDetailUpdateSelectiveByCondition(SystemHisMsgPushDetail systemHisMsgPushDetail, SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemHisMsgPushDetailUpdateSelectiveByCondition(systemHisMsgPushDetail, systemHisMsgPushDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = this.getSystemHisMsgPushDetailExampleConditionSql(systemHisMsgPushDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_DETAIL", "批量部分更新", "conditionSql", kvalue, systemHisMsgPushDetail, ret);
		return ret;
	}
	
	public String getSystemHisMsgPushDetailExampleConditionSql(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemHisMsgPushDetailQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemHisMsgPushDetailExample.Criteria item = systemHisMsgPushDetailQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemHisMsgPushDetailExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中查询一个对象SystemHisMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	public SystemHisMsgPushDetail systemHisMsgPushDetailSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
			String key = ("T_SYSTEM_HIS_MSG_PUSH_DETAIL_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemHisMsgPushDetail obj = ((SystemHisMsgPushDetail)(this.getCache().get("T_SYSTEM_HIS_MSG_PUSH_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemHisMsgPushDetailSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_HIS_MSG_PUSH_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemHisMsgPushDetailSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemHisMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemHisMsgPushDetail> systemHisMsgPushDetailSelectObjects(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
			String key = ("T_SYSTEM_HIS_MSG_PUSH_DETAIL_" 
						+ ("queryObject_" + this.getSystemHisMsgPushDetailExampleConditionSql(systemHisMsgPushDetailQueryCondition)));
			List<SystemHisMsgPushDetail> obj = ((List<SystemHisMsgPushDetail>)(this.getCache().get("T_SYSTEM_HIS_MSG_PUSH_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemHisMsgPushDetailSelectObjects(systemHisMsgPushDetailQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_HIS_MSG_PUSH_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemHisMsgPushDetailSelectObjects(systemHisMsgPushDetailQueryCondition);
		}
	}
	
	/**
	 * <param name="systemHisMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemHisMsgPushDetailQuerySelectObjectsCount(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_DETAIL")) {
			String key = ("T_SYSTEM_HIS_MSG_PUSH_DETAIL_" 
						+ ("queryCount_" + this.getSystemHisMsgPushDetailExampleConditionSql(systemHisMsgPushDetailQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_HIS_MSG_PUSH_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemHisMsgPushDetailQuerySelectObjectsCount(systemHisMsgPushDetailQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_HIS_MSG_PUSH_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemHisMsgPushDetailQuerySelectObjectsCount(systemHisMsgPushDetailQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要插入的新对象</param>
	 */
	public int systemHisMsgPushTaskInsert(SystemHisMsgPushTask systemHisMsgPushTask) throws CacheException {
		int ret = this.getDao().systemHisMsgPushTaskInsert(systemHisMsgPushTask);
		if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
			this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_TASK");
		}
		String kvalue = "";
		kvalue = (kvalue + systemHisMsgPushTask.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_TASK", "插入", "ID", kvalue, systemHisMsgPushTask, ret);
		return ret;
	}
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中删除一个对象SystemHisMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	public int systemHisMsgPushTaskDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemHisMsgPushTaskDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_TASK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_TASK", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中删除一个对象SystemHisMsgPushTask</param>
	 */
	public int systemHisMsgPushTaskDeleteByCondition(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException {
		int ret = this.getDao().systemHisMsgPushTaskDeleteByCondition(systemHisMsgPushTaskQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_TASK");
			}
		}
		String kvalue = this.getSystemHisMsgPushTaskExampleConditionSql(systemHisMsgPushTaskQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_TASK", "条件删除", "conditionSql", kvalue, systemHisMsgPushTaskQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	public int systemHisMsgPushTaskUpdate(SystemHisMsgPushTask systemHisMsgPushTask) throws CacheException {
		int ret = this.getDao().systemHisMsgPushTaskUpdate(systemHisMsgPushTask);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_TASK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemHisMsgPushTask.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_TASK", "更新", "ID", kvalue, systemHisMsgPushTask, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	public int systemHisMsgPushTaskUpdateSelective(SystemHisMsgPushTask systemHisMsgPushTask) throws CacheException {
		int ret = this.getDao().systemHisMsgPushTaskUpdateSelective(systemHisMsgPushTask);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_TASK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemHisMsgPushTask.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_TASK", "部分更新", "ID", kvalue, systemHisMsgPushTask, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTaskQueryCondition">附加的条件</param>
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	public int systemHisMsgPushTaskUpdateByCondition(SystemHisMsgPushTask systemHisMsgPushTask, SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException {
		int ret = this.getDao().systemHisMsgPushTaskUpdateByCondition(systemHisMsgPushTask, systemHisMsgPushTaskQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_TASK");
			}
		}
		String kvalue = this.getSystemHisMsgPushTaskExampleConditionSql(systemHisMsgPushTaskQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_TASK", "条件更新", "conditionSql", kvalue, systemHisMsgPushTask, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTaskQueryCondition">附加的条件</param>
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	public int systemHisMsgPushTaskUpdateSelectiveByCondition(SystemHisMsgPushTask systemHisMsgPushTask, SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException {
		int ret = this.getDao().systemHisMsgPushTaskUpdateSelectiveByCondition(systemHisMsgPushTask, systemHisMsgPushTaskQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_HIS_MSG_PUSH_TASK");
			}
		}
		String kvalue = this.getSystemHisMsgPushTaskExampleConditionSql(systemHisMsgPushTaskQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_HIS_MSG_PUSH_TASK", "批量部分更新", "conditionSql", kvalue, systemHisMsgPushTask, ret);
		return ret;
	}
	
	public String getSystemHisMsgPushTaskExampleConditionSql(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemHisMsgPushTaskQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemHisMsgPushTaskExample.Criteria item = systemHisMsgPushTaskQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemHisMsgPushTaskExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中查询一个对象SystemHisMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	public SystemHisMsgPushTask systemHisMsgPushTaskSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
			String key = ("T_SYSTEM_HIS_MSG_PUSH_TASK_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemHisMsgPushTask obj = ((SystemHisMsgPushTask)(this.getCache().get("T_SYSTEM_HIS_MSG_PUSH_TASK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemHisMsgPushTaskSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_HIS_MSG_PUSH_TASK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemHisMsgPushTaskSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemHisMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemHisMsgPushTask> systemHisMsgPushTaskSelectObjects(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
			String key = ("T_SYSTEM_HIS_MSG_PUSH_TASK_" 
						+ ("queryObject_" + this.getSystemHisMsgPushTaskExampleConditionSql(systemHisMsgPushTaskQueryCondition)));
			List<SystemHisMsgPushTask> obj = ((List<SystemHisMsgPushTask>)(this.getCache().get("T_SYSTEM_HIS_MSG_PUSH_TASK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemHisMsgPushTaskSelectObjects(systemHisMsgPushTaskQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_HIS_MSG_PUSH_TASK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemHisMsgPushTaskSelectObjects(systemHisMsgPushTaskQueryCondition);
		}
	}
	
	/**
	 * <param name="systemHisMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemHisMsgPushTaskQuerySelectObjectsCount(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_HIS_MSG_PUSH_TASK")) {
			String key = ("T_SYSTEM_HIS_MSG_PUSH_TASK_" 
						+ ("queryCount_" + this.getSystemHisMsgPushTaskExampleConditionSql(systemHisMsgPushTaskQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_HIS_MSG_PUSH_TASK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemHisMsgPushTaskQuerySelectObjectsCount(systemHisMsgPushTaskQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_HIS_MSG_PUSH_TASK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemHisMsgPushTaskQuerySelectObjectsCount(systemHisMsgPushTaskQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要插入的新对象</param>
	 */
	public int systemMsgPushDetailInsert(SystemMsgPushDetail systemMsgPushDetail) throws CacheException {
		int ret = this.getDao().systemMsgPushDetailInsert(systemMsgPushDetail);
		if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
			this.getCache().clear("T_SYSTEM_MSG_PUSH_DETAIL");
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgPushDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_DETAIL", "插入", "ID", kvalue, systemMsgPushDetail, ret);
		return ret;
	}
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中删除一个对象SystemMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	public int systemMsgPushDetailDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemMsgPushDetailDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_DETAIL", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中删除一个对象SystemMsgPushDetail</param>
	 */
	public int systemMsgPushDetailDeleteByCondition(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgPushDetailDeleteByCondition(systemMsgPushDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = this.getSystemMsgPushDetailExampleConditionSql(systemMsgPushDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_DETAIL", "条件删除", "conditionSql", kvalue, systemMsgPushDetailQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	public int systemMsgPushDetailUpdate(SystemMsgPushDetail systemMsgPushDetail) throws CacheException {
		int ret = this.getDao().systemMsgPushDetailUpdate(systemMsgPushDetail);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgPushDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_DETAIL", "更新", "ID", kvalue, systemMsgPushDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	public int systemMsgPushDetailUpdateSelective(SystemMsgPushDetail systemMsgPushDetail) throws CacheException {
		int ret = this.getDao().systemMsgPushDetailUpdateSelective(systemMsgPushDetail);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgPushDetail.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_DETAIL", "部分更新", "ID", kvalue, systemMsgPushDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetailQueryCondition">附加的条件</param>
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	public int systemMsgPushDetailUpdateByCondition(SystemMsgPushDetail systemMsgPushDetail, SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgPushDetailUpdateByCondition(systemMsgPushDetail, systemMsgPushDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = this.getSystemMsgPushDetailExampleConditionSql(systemMsgPushDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_DETAIL", "条件更新", "conditionSql", kvalue, systemMsgPushDetail, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetailQueryCondition">附加的条件</param>
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	public int systemMsgPushDetailUpdateSelectiveByCondition(SystemMsgPushDetail systemMsgPushDetail, SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgPushDetailUpdateSelectiveByCondition(systemMsgPushDetail, systemMsgPushDetailQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_DETAIL");
			}
		}
		String kvalue = this.getSystemMsgPushDetailExampleConditionSql(systemMsgPushDetailQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_DETAIL", "批量部分更新", "conditionSql", kvalue, systemMsgPushDetail, ret);
		return ret;
	}
	
	public String getSystemMsgPushDetailExampleConditionSql(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemMsgPushDetailQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemMsgPushDetailExample.Criteria item = systemMsgPushDetailQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemMsgPushDetailExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中查询一个对象SystemMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	public SystemMsgPushDetail systemMsgPushDetailSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
			String key = ("T_SYSTEM_MSG_PUSH_DETAIL_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemMsgPushDetail obj = ((SystemMsgPushDetail)(this.getCache().get("T_SYSTEM_MSG_PUSH_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgPushDetailSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_PUSH_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgPushDetailSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemMsgPushDetail> systemMsgPushDetailSelectObjects(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
			String key = ("T_SYSTEM_MSG_PUSH_DETAIL_" 
						+ ("queryObject_" + this.getSystemMsgPushDetailExampleConditionSql(systemMsgPushDetailQueryCondition)));
			List<SystemMsgPushDetail> obj = ((List<SystemMsgPushDetail>)(this.getCache().get("T_SYSTEM_MSG_PUSH_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgPushDetailSelectObjects(systemMsgPushDetailQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_PUSH_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgPushDetailSelectObjects(systemMsgPushDetailQueryCondition);
		}
	}
	
	/**
	 * <param name="systemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemMsgPushDetailQuerySelectObjectsCount(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_PUSH_DETAIL")) {
			String key = ("T_SYSTEM_MSG_PUSH_DETAIL_" 
						+ ("queryCount_" + this.getSystemMsgPushDetailExampleConditionSql(systemMsgPushDetailQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_MSG_PUSH_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgPushDetailQuerySelectObjectsCount(systemMsgPushDetailQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_PUSH_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgPushDetailQuerySelectObjectsCount(systemMsgPushDetailQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要插入的新对象</param>
	 */
	public int systemMsgPushTaskInsert(SystemMsgPushTask systemMsgPushTask) throws CacheException {
		int ret = this.getDao().systemMsgPushTaskInsert(systemMsgPushTask);
		if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
			this.getCache().clear("T_SYSTEM_MSG_PUSH_TASK");
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgPushTask.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_TASK", "插入", "ID", kvalue, systemMsgPushTask, ret);
		return ret;
	}
	
	/**
	 * <param name="systemMsgPushTask">从数据库中删除一个对象SystemMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	public int systemMsgPushTaskDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemMsgPushTaskDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_TASK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_TASK", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemMsgPushTask">从数据库中删除一个对象SystemMsgPushTask</param>
	 */
	public int systemMsgPushTaskDeleteByCondition(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgPushTaskDeleteByCondition(systemMsgPushTaskQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_TASK");
			}
		}
		String kvalue = this.getSystemMsgPushTaskExampleConditionSql(systemMsgPushTaskQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_TASK", "条件删除", "conditionSql", kvalue, systemMsgPushTaskQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	public int systemMsgPushTaskUpdate(SystemMsgPushTask systemMsgPushTask) throws CacheException {
		int ret = this.getDao().systemMsgPushTaskUpdate(systemMsgPushTask);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_TASK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgPushTask.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_TASK", "更新", "ID", kvalue, systemMsgPushTask, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	public int systemMsgPushTaskUpdateSelective(SystemMsgPushTask systemMsgPushTask) throws CacheException {
		int ret = this.getDao().systemMsgPushTaskUpdateSelective(systemMsgPushTask);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_TASK");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgPushTask.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_TASK", "部分更新", "ID", kvalue, systemMsgPushTask, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTaskQueryCondition">附加的条件</param>
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	public int systemMsgPushTaskUpdateByCondition(SystemMsgPushTask systemMsgPushTask, SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgPushTaskUpdateByCondition(systemMsgPushTask, systemMsgPushTaskQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_TASK");
			}
		}
		String kvalue = this.getSystemMsgPushTaskExampleConditionSql(systemMsgPushTaskQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_TASK", "条件更新", "conditionSql", kvalue, systemMsgPushTask, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTaskQueryCondition">附加的条件</param>
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	public int systemMsgPushTaskUpdateSelectiveByCondition(SystemMsgPushTask systemMsgPushTask, SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgPushTaskUpdateSelectiveByCondition(systemMsgPushTask, systemMsgPushTaskQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
				this.getCache().clear("T_SYSTEM_MSG_PUSH_TASK");
			}
		}
		String kvalue = this.getSystemMsgPushTaskExampleConditionSql(systemMsgPushTaskQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_PUSH_TASK", "批量部分更新", "conditionSql", kvalue, systemMsgPushTask, ret);
		return ret;
	}
	
	public String getSystemMsgPushTaskExampleConditionSql(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemMsgPushTaskQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemMsgPushTaskExample.Criteria item = systemMsgPushTaskQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemMsgPushTaskExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemMsgPushTask">从数据库中查询一个对象SystemMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	public SystemMsgPushTask systemMsgPushTaskSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
			String key = ("T_SYSTEM_MSG_PUSH_TASK_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemMsgPushTask obj = ((SystemMsgPushTask)(this.getCache().get("T_SYSTEM_MSG_PUSH_TASK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgPushTaskSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_PUSH_TASK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgPushTaskSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemMsgPushTask> systemMsgPushTaskSelectObjects(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
			String key = ("T_SYSTEM_MSG_PUSH_TASK_" 
						+ ("queryObject_" + this.getSystemMsgPushTaskExampleConditionSql(systemMsgPushTaskQueryCondition)));
			List<SystemMsgPushTask> obj = ((List<SystemMsgPushTask>)(this.getCache().get("T_SYSTEM_MSG_PUSH_TASK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgPushTaskSelectObjects(systemMsgPushTaskQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_PUSH_TASK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgPushTaskSelectObjects(systemMsgPushTaskQueryCondition);
		}
	}
	
	/**
	 * <param name="systemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemMsgPushTaskQuerySelectObjectsCount(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_PUSH_TASK")) {
			String key = ("T_SYSTEM_MSG_PUSH_TASK_" 
						+ ("queryCount_" + this.getSystemMsgPushTaskExampleConditionSql(systemMsgPushTaskQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_MSG_PUSH_TASK", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgPushTaskQuerySelectObjectsCount(systemMsgPushTaskQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_PUSH_TASK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgPushTaskQuerySelectObjectsCount(systemMsgPushTaskQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要插入的新对象</param>
	 */
	public int systemMsgSendInsert(SystemMsgSend systemMsgSend) throws CacheException {
		int ret = this.getDao().systemMsgSendInsert(systemMsgSend);
		if (this.needCache("T_SYSTEM_MSG_SEND")) {
			this.getCache().clear("T_SYSTEM_MSG_SEND");
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgSend.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_SEND", "插入", "ID", kvalue, systemMsgSend, ret);
		return ret;
	}
	
	/**
	 * <param name="systemMsgSend">从数据库中删除一个对象SystemMsgSend</param>
	 * <param name="AId">主键</param>
	 */
	public int systemMsgSendDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemMsgSendDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_SEND")) {
				this.getCache().clear("T_SYSTEM_MSG_SEND");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_SEND", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemMsgSend">从数据库中删除一个对象SystemMsgSend</param>
	 */
	public int systemMsgSendDeleteByCondition(SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgSendDeleteByCondition(systemMsgSendQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_SEND")) {
				this.getCache().clear("T_SYSTEM_MSG_SEND");
			}
		}
		String kvalue = this.getSystemMsgSendExampleConditionSql(systemMsgSendQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_SEND", "条件删除", "conditionSql", kvalue, systemMsgSendQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	public int systemMsgSendUpdate(SystemMsgSend systemMsgSend) throws CacheException {
		int ret = this.getDao().systemMsgSendUpdate(systemMsgSend);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_SEND")) {
				this.getCache().clear("T_SYSTEM_MSG_SEND");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgSend.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_SEND", "更新", "ID", kvalue, systemMsgSend, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	public int systemMsgSendUpdateSelective(SystemMsgSend systemMsgSend) throws CacheException {
		int ret = this.getDao().systemMsgSendUpdateSelective(systemMsgSend);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_SEND")) {
				this.getCache().clear("T_SYSTEM_MSG_SEND");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemMsgSend.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_SEND", "部分更新", "ID", kvalue, systemMsgSend, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemMsgSend到数据库中
	 * <param name="systemMsgSendQueryCondition">附加的条件</param>
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	public int systemMsgSendUpdateByCondition(SystemMsgSend systemMsgSend, SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgSendUpdateByCondition(systemMsgSend, systemMsgSendQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_SEND")) {
				this.getCache().clear("T_SYSTEM_MSG_SEND");
			}
		}
		String kvalue = this.getSystemMsgSendExampleConditionSql(systemMsgSendQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_SEND", "条件更新", "conditionSql", kvalue, systemMsgSend, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemMsgSend到数据库中
	 * <param name="systemMsgSendQueryCondition">附加的条件</param>
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	public int systemMsgSendUpdateSelectiveByCondition(SystemMsgSend systemMsgSend, SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException {
		int ret = this.getDao().systemMsgSendUpdateSelectiveByCondition(systemMsgSend, systemMsgSendQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_MSG_SEND")) {
				this.getCache().clear("T_SYSTEM_MSG_SEND");
			}
		}
		String kvalue = this.getSystemMsgSendExampleConditionSql(systemMsgSendQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_MSG_SEND", "批量部分更新", "conditionSql", kvalue, systemMsgSend, ret);
		return ret;
	}
	
	public String getSystemMsgSendExampleConditionSql(SystemMsgSendExample systemMsgSendQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemMsgSendQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemMsgSendExample.Criteria item = systemMsgSendQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemMsgSendExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemMsgSend">从数据库中查询一个对象SystemMsgSend</param>
	 * <param name="AId">主键</param>
	 */
	public SystemMsgSend systemMsgSendSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_SEND")) {
			String key = ("T_SYSTEM_MSG_SEND_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemMsgSend obj = ((SystemMsgSend)(this.getCache().get("T_SYSTEM_MSG_SEND", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgSendSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_SEND", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgSendSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemMsgSendQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemMsgSend> systemMsgSendSelectObjects(SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_SEND")) {
			String key = ("T_SYSTEM_MSG_SEND_" 
						+ ("queryObject_" + this.getSystemMsgSendExampleConditionSql(systemMsgSendQueryCondition)));
			List<SystemMsgSend> obj = ((List<SystemMsgSend>)(this.getCache().get("T_SYSTEM_MSG_SEND", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgSendSelectObjects(systemMsgSendQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_SEND", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgSendSelectObjects(systemMsgSendQueryCondition);
		}
	}
	
	/**
	 * <param name="systemMsgSendQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemMsgSendQuerySelectObjectsCount(SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_MSG_SEND")) {
			String key = ("T_SYSTEM_MSG_SEND_" 
						+ ("queryCount_" + this.getSystemMsgSendExampleConditionSql(systemMsgSendQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_MSG_SEND", key)));
			if ((obj == null)) {
				obj = this.getDao().systemMsgSendQuerySelectObjectsCount(systemMsgSendQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_MSG_SEND", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemMsgSendQuerySelectObjectsCount(systemMsgSendQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemParam到数据库中
	 * <param name="systemParam">需要插入的新对象</param>
	 */
	public int systemParamInsert(SystemParam systemParam) throws CacheException {
		int ret = this.getDao().systemParamInsert(systemParam);
		if (this.needCache("T_SYSTEM_PARAM")) {
			this.getCache().clear("T_SYSTEM_PARAM");
		}
		String kvalue = "";
		kvalue = (kvalue + systemParam.getId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemParam.getParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "插入", "ID,PARAM_CODE", kvalue, systemParam, ret);
		return ret;
	}
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 * <param name="ASystemParamKey">对象参数表,存放所有系统的参数 主键类</param>
	 */
	public int systemParamDeleteByPrimaryKey(SystemParamKey ASystemParamKey) throws CacheException {
		int ret = this.getDao().systemParamDeleteByPrimaryKey(ASystemParamKey);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PARAM")) {
				this.getCache().clear("T_SYSTEM_PARAM");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + ASystemParamKey.getId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + ASystemParamKey.getParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "删除", "ID,PARAM_CODE", kvalue, ASystemParamKey, ret);
		return ret;
	}
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 */
	public int systemParamDeleteByCondition(SystemParamExample systemParamQueryCondition) throws CacheException {
		int ret = this.getDao().systemParamDeleteByCondition(systemParamQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PARAM")) {
				this.getCache().clear("T_SYSTEM_PARAM");
			}
		}
		String kvalue = this.getSystemParamExampleConditionSql(systemParamQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "条件删除", "conditionSql", kvalue, systemParamQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	public int systemParamUpdate(SystemParam systemParam) throws CacheException {
		int ret = this.getDao().systemParamUpdate(systemParam);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PARAM")) {
				this.getCache().clear("T_SYSTEM_PARAM");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemParam.getId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemParam.getParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "更新", "ID,PARAM_CODE", kvalue, systemParam, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	public int systemParamUpdateSelective(SystemParam systemParam) throws CacheException {
		int ret = this.getDao().systemParamUpdateSelective(systemParam);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PARAM")) {
				this.getCache().clear("T_SYSTEM_PARAM");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemParam.getId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemParam.getParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "部分更新", "ID,PARAM_CODE", kvalue, systemParam, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemParam到数据库中
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	public int systemParamUpdateByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) throws CacheException {
		int ret = this.getDao().systemParamUpdateByCondition(systemParam, systemParamQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PARAM")) {
				this.getCache().clear("T_SYSTEM_PARAM");
			}
		}
		String kvalue = this.getSystemParamExampleConditionSql(systemParamQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "条件更新", "conditionSql", kvalue, systemParam, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemParam到数据库中
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	public int systemParamUpdateSelectiveByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) throws CacheException {
		int ret = this.getDao().systemParamUpdateSelectiveByCondition(systemParam, systemParamQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PARAM")) {
				this.getCache().clear("T_SYSTEM_PARAM");
			}
		}
		String kvalue = this.getSystemParamExampleConditionSql(systemParamQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "批量部分更新", "conditionSql", kvalue, systemParam, ret);
		return ret;
	}
	
	public String getSystemParamExampleConditionSql(SystemParamExample systemParamQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemParamQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemParamExample.Criteria item = systemParamQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemParamExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemParam">从数据库中查询一个对象SystemParam</param>
	 * <param name="ASystemParamKey">对象参数表,存放所有系统的参数 主键类</param>
	 */
	public SystemParam systemParamSelectByPrimaryKey(SystemParamKey ASystemParamKey) throws CacheException {
		if (this.needCache("T_SYSTEM_PARAM")) {
			String key = ("T_SYSTEM_PARAM_" + "_BYUNIINDEX_");
			SystemParam obj = ((SystemParam)(this.getCache().get("T_SYSTEM_PARAM", key)));
			if ((obj == null)) {
				obj = this.getDao().systemParamSelectByPrimaryKey(ASystemParamKey);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_PARAM", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemParamSelectByPrimaryKey(ASystemParamKey);
		}
	}
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemParam> systemParamSelectObjects(SystemParamExample systemParamQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_PARAM")) {
			String key = ("T_SYSTEM_PARAM_" 
						+ ("queryObject_" + this.getSystemParamExampleConditionSql(systemParamQueryCondition)));
			List<SystemParam> obj = ((List<SystemParam>)(this.getCache().get("T_SYSTEM_PARAM", key)));
			if ((obj == null)) {
				obj = this.getDao().systemParamSelectObjects(systemParamQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_PARAM", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemParamSelectObjects(systemParamQueryCondition);
		}
	}
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemParamQuerySelectObjectsCount(SystemParamExample systemParamQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_PARAM")) {
			String key = ("T_SYSTEM_PARAM_" 
						+ ("queryCount_" + this.getSystemParamExampleConditionSql(systemParamQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_PARAM", key)));
			if ((obj == null)) {
				obj = this.getDao().systemParamQuerySelectObjectsCount(systemParamQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_PARAM", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemParamQuerySelectObjectsCount(systemParamQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要插入的新对象</param>
	 */
	public int systemPrivilegeInsert(SystemPrivilege systemPrivilege) throws CacheException {
		int ret = this.getDao().systemPrivilegeInsert(systemPrivilege);
		if (this.needCache("T_SYSTEM_PRIVILEGE")) {
			this.getCache().clear("T_SYSTEM_PRIVILEGE");
		}
		String kvalue = "";
		kvalue = (kvalue + systemPrivilege.getFuncPrivilege());
		this.operatesLogSimpleAdd("T_SYSTEM_PRIVILEGE", "插入", "FUNC_PRIVILEGE", kvalue, systemPrivilege, ret);
		return ret;
	}
	
	/**
	 * <param name="systemPrivilege">从数据库中删除一个对象SystemPrivilege</param>
	 * <param name="AFuncPrivilege">功能权限值</param>
	 */
	public int systemPrivilegeDeleteByPrimaryKey(int AFuncPrivilege) throws CacheException {
		int ret = this.getDao().systemPrivilegeDeleteByPrimaryKey(AFuncPrivilege);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PRIVILEGE")) {
				this.getCache().clear("T_SYSTEM_PRIVILEGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AFuncPrivilege);
		this.operatesLogSimpleAdd("T_SYSTEM_PRIVILEGE", "删除", "FUNC_PRIVILEGE", kvalue, AFuncPrivilege, ret);
		return ret;
	}
	
	/**
	 * <param name="systemPrivilege">从数据库中删除一个对象SystemPrivilege</param>
	 */
	public int systemPrivilegeDeleteByCondition(SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException {
		int ret = this.getDao().systemPrivilegeDeleteByCondition(systemPrivilegeQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PRIVILEGE")) {
				this.getCache().clear("T_SYSTEM_PRIVILEGE");
			}
		}
		String kvalue = this.getSystemPrivilegeExampleConditionSql(systemPrivilegeQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PRIVILEGE", "条件删除", "conditionSql", kvalue, systemPrivilegeQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	public int systemPrivilegeUpdate(SystemPrivilege systemPrivilege) throws CacheException {
		int ret = this.getDao().systemPrivilegeUpdate(systemPrivilege);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PRIVILEGE")) {
				this.getCache().clear("T_SYSTEM_PRIVILEGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemPrivilege.getFuncPrivilege());
		this.operatesLogSimpleAdd("T_SYSTEM_PRIVILEGE", "更新", "FUNC_PRIVILEGE", kvalue, systemPrivilege, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	public int systemPrivilegeUpdateSelective(SystemPrivilege systemPrivilege) throws CacheException {
		int ret = this.getDao().systemPrivilegeUpdateSelective(systemPrivilege);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PRIVILEGE")) {
				this.getCache().clear("T_SYSTEM_PRIVILEGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemPrivilege.getFuncPrivilege());
		this.operatesLogSimpleAdd("T_SYSTEM_PRIVILEGE", "部分更新", "FUNC_PRIVILEGE", kvalue, systemPrivilege, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemPrivilege到数据库中
	 * <param name="systemPrivilegeQueryCondition">附加的条件</param>
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	public int systemPrivilegeUpdateByCondition(SystemPrivilege systemPrivilege, SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException {
		int ret = this.getDao().systemPrivilegeUpdateByCondition(systemPrivilege, systemPrivilegeQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PRIVILEGE")) {
				this.getCache().clear("T_SYSTEM_PRIVILEGE");
			}
		}
		String kvalue = this.getSystemPrivilegeExampleConditionSql(systemPrivilegeQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PRIVILEGE", "条件更新", "conditionSql", kvalue, systemPrivilege, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemPrivilege到数据库中
	 * <param name="systemPrivilegeQueryCondition">附加的条件</param>
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	public int systemPrivilegeUpdateSelectiveByCondition(SystemPrivilege systemPrivilege, SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException {
		int ret = this.getDao().systemPrivilegeUpdateSelectiveByCondition(systemPrivilege, systemPrivilegeQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_PRIVILEGE")) {
				this.getCache().clear("T_SYSTEM_PRIVILEGE");
			}
		}
		String kvalue = this.getSystemPrivilegeExampleConditionSql(systemPrivilegeQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PRIVILEGE", "批量部分更新", "conditionSql", kvalue, systemPrivilege, ret);
		return ret;
	}
	
	public String getSystemPrivilegeExampleConditionSql(SystemPrivilegeExample systemPrivilegeQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemPrivilegeQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemPrivilegeExample.Criteria item = systemPrivilegeQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemPrivilegeExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemPrivilege">从数据库中查询一个对象SystemPrivilege</param>
	 * <param name="AFuncPrivilege">功能权限值</param>
	 */
	public SystemPrivilege systemPrivilegeSelectByPrimaryKey(int AFuncPrivilege) throws CacheException {
		if (this.needCache("T_SYSTEM_PRIVILEGE")) {
			String key = ("T_SYSTEM_PRIVILEGE_" 
						+ (("_BYUNIINDEX_" + AFuncPrivilege) 
						+ "_"));
			SystemPrivilege obj = ((SystemPrivilege)(this.getCache().get("T_SYSTEM_PRIVILEGE", key)));
			if ((obj == null)) {
				obj = this.getDao().systemPrivilegeSelectByPrimaryKey(AFuncPrivilege);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_PRIVILEGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemPrivilegeSelectByPrimaryKey(AFuncPrivilege);
		}
	}
	
	/**
	 * <param name="systemPrivilegeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemPrivilege> systemPrivilegeSelectObjects(SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_PRIVILEGE")) {
			String key = ("T_SYSTEM_PRIVILEGE_" 
						+ ("queryObject_" + this.getSystemPrivilegeExampleConditionSql(systemPrivilegeQueryCondition)));
			List<SystemPrivilege> obj = ((List<SystemPrivilege>)(this.getCache().get("T_SYSTEM_PRIVILEGE", key)));
			if ((obj == null)) {
				obj = this.getDao().systemPrivilegeSelectObjects(systemPrivilegeQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_PRIVILEGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemPrivilegeSelectObjects(systemPrivilegeQueryCondition);
		}
	}
	
	/**
	 * <param name="systemPrivilegeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemPrivilegeQuerySelectObjectsCount(SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_PRIVILEGE")) {
			String key = ("T_SYSTEM_PRIVILEGE_" 
						+ ("queryCount_" + this.getSystemPrivilegeExampleConditionSql(systemPrivilegeQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_PRIVILEGE", key)));
			if ((obj == null)) {
				obj = this.getDao().systemPrivilegeQuerySelectObjectsCount(systemPrivilegeQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_PRIVILEGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemPrivilegeQuerySelectObjectsCount(systemPrivilegeQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemRoles到数据库中
	 * <param name="systemRoles">需要插入的新对象</param>
	 */
	public int systemRolesInsert(SystemRoles systemRoles) throws CacheException {
		int ret = this.getDao().systemRolesInsert(systemRoles);
		if (this.needCache("T_SYSTEM_ROLES")) {
			this.getCache().clear("T_SYSTEM_ROLES");
		}
		String kvalue = "";
		kvalue = (kvalue + systemRoles.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ROLES", "插入", "ID", kvalue, systemRoles, ret);
		return ret;
	}
	
	/**
	 * <param name="systemRoles">从数据库中删除一个对象SystemRoles</param>
	 * <param name="AId">角色标识</param>
	 */
	public int systemRolesDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemRolesDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ROLES")) {
				this.getCache().clear("T_SYSTEM_ROLES");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_ROLES", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemRoles">从数据库中删除一个对象SystemRoles</param>
	 */
	public int systemRolesDeleteByCondition(SystemRolesExample systemRolesQueryCondition) throws CacheException {
		int ret = this.getDao().systemRolesDeleteByCondition(systemRolesQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ROLES")) {
				this.getCache().clear("T_SYSTEM_ROLES");
			}
		}
		String kvalue = this.getSystemRolesExampleConditionSql(systemRolesQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ROLES", "条件删除", "conditionSql", kvalue, systemRolesQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemRoles到数据库中
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	public int systemRolesUpdate(SystemRoles systemRoles) throws CacheException {
		int ret = this.getDao().systemRolesUpdate(systemRoles);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ROLES")) {
				this.getCache().clear("T_SYSTEM_ROLES");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemRoles.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ROLES", "更新", "ID", kvalue, systemRoles, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemRoles到数据库中
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	public int systemRolesUpdateSelective(SystemRoles systemRoles) throws CacheException {
		int ret = this.getDao().systemRolesUpdateSelective(systemRoles);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ROLES")) {
				this.getCache().clear("T_SYSTEM_ROLES");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemRoles.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_ROLES", "部分更新", "ID", kvalue, systemRoles, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemRoles到数据库中
	 * <param name="systemRolesQueryCondition">附加的条件</param>
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	public int systemRolesUpdateByCondition(SystemRoles systemRoles, SystemRolesExample systemRolesQueryCondition) throws CacheException {
		int ret = this.getDao().systemRolesUpdateByCondition(systemRoles, systemRolesQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ROLES")) {
				this.getCache().clear("T_SYSTEM_ROLES");
			}
		}
		String kvalue = this.getSystemRolesExampleConditionSql(systemRolesQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ROLES", "条件更新", "conditionSql", kvalue, systemRoles, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemRoles到数据库中
	 * <param name="systemRolesQueryCondition">附加的条件</param>
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	public int systemRolesUpdateSelectiveByCondition(SystemRoles systemRoles, SystemRolesExample systemRolesQueryCondition) throws CacheException {
		int ret = this.getDao().systemRolesUpdateSelectiveByCondition(systemRoles, systemRolesQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_ROLES")) {
				this.getCache().clear("T_SYSTEM_ROLES");
			}
		}
		String kvalue = this.getSystemRolesExampleConditionSql(systemRolesQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_ROLES", "批量部分更新", "conditionSql", kvalue, systemRoles, ret);
		return ret;
	}
	
	public String getSystemRolesExampleConditionSql(SystemRolesExample systemRolesQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemRolesQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemRolesExample.Criteria item = systemRolesQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemRolesExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemRoles">从数据库中查询一个对象SystemRoles</param>
	 * <param name="AId">角色标识</param>
	 */
	public SystemRoles systemRolesSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_ROLES")) {
			String key = ("T_SYSTEM_ROLES_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemRoles obj = ((SystemRoles)(this.getCache().get("T_SYSTEM_ROLES", key)));
			if ((obj == null)) {
				obj = this.getDao().systemRolesSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ROLES", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemRolesSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemRoles> systemRolesSelectObjects(SystemRolesExample systemRolesQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_ROLES")) {
			String key = ("T_SYSTEM_ROLES_" 
						+ ("queryObject_" + this.getSystemRolesExampleConditionSql(systemRolesQueryCondition)));
			List<SystemRoles> obj = ((List<SystemRoles>)(this.getCache().get("T_SYSTEM_ROLES", key)));
			if ((obj == null)) {
				obj = this.getDao().systemRolesSelectObjects(systemRolesQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ROLES", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemRolesSelectObjects(systemRolesQueryCondition);
		}
	}
	
	/**
	 * <param name="systemRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemRolesQuerySelectObjectsCount(SystemRolesExample systemRolesQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_ROLES")) {
			String key = ("T_SYSTEM_ROLES_" 
						+ ("queryCount_" + this.getSystemRolesExampleConditionSql(systemRolesQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_ROLES", key)));
			if ((obj == null)) {
				obj = this.getDao().systemRolesQuerySelectObjectsCount(systemRolesQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_ROLES", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemRolesQuerySelectObjectsCount(systemRolesQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要插入的新对象</param>
	 */
	public int systemValidInfoInsert(SystemValidInfo systemValidInfo) throws CacheException {
		int ret = this.getDao().systemValidInfoInsert(systemValidInfo);
		if (this.needCache("T_SYSTEM_VALID_INFO")) {
			this.getCache().clear("T_SYSTEM_VALID_INFO");
		}
		String kvalue = "";
		kvalue = (kvalue + systemValidInfo.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VALID_INFO", "插入", "ID", kvalue, systemValidInfo, ret);
		return ret;
	}
	
	/**
	 * <param name="systemValidInfo">从数据库中删除一个对象SystemValidInfo</param>
	 * <param name="AId">PK</param>
	 */
	public int systemValidInfoDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemValidInfoDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VALID_INFO")) {
				this.getCache().clear("T_SYSTEM_VALID_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_VALID_INFO", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemValidInfo">从数据库中删除一个对象SystemValidInfo</param>
	 */
	public int systemValidInfoDeleteByCondition(SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException {
		int ret = this.getDao().systemValidInfoDeleteByCondition(systemValidInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VALID_INFO")) {
				this.getCache().clear("T_SYSTEM_VALID_INFO");
			}
		}
		String kvalue = this.getSystemValidInfoExampleConditionSql(systemValidInfoQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VALID_INFO", "条件删除", "conditionSql", kvalue, systemValidInfoQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	public int systemValidInfoUpdate(SystemValidInfo systemValidInfo) throws CacheException {
		int ret = this.getDao().systemValidInfoUpdate(systemValidInfo);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VALID_INFO")) {
				this.getCache().clear("T_SYSTEM_VALID_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemValidInfo.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VALID_INFO", "更新", "ID", kvalue, systemValidInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	public int systemValidInfoUpdateSelective(SystemValidInfo systemValidInfo) throws CacheException {
		int ret = this.getDao().systemValidInfoUpdateSelective(systemValidInfo);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VALID_INFO")) {
				this.getCache().clear("T_SYSTEM_VALID_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemValidInfo.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VALID_INFO", "部分更新", "ID", kvalue, systemValidInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemValidInfo到数据库中
	 * <param name="systemValidInfoQueryCondition">附加的条件</param>
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	public int systemValidInfoUpdateByCondition(SystemValidInfo systemValidInfo, SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException {
		int ret = this.getDao().systemValidInfoUpdateByCondition(systemValidInfo, systemValidInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VALID_INFO")) {
				this.getCache().clear("T_SYSTEM_VALID_INFO");
			}
		}
		String kvalue = this.getSystemValidInfoExampleConditionSql(systemValidInfoQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VALID_INFO", "条件更新", "conditionSql", kvalue, systemValidInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemValidInfo到数据库中
	 * <param name="systemValidInfoQueryCondition">附加的条件</param>
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	public int systemValidInfoUpdateSelectiveByCondition(SystemValidInfo systemValidInfo, SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException {
		int ret = this.getDao().systemValidInfoUpdateSelectiveByCondition(systemValidInfo, systemValidInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VALID_INFO")) {
				this.getCache().clear("T_SYSTEM_VALID_INFO");
			}
		}
		String kvalue = this.getSystemValidInfoExampleConditionSql(systemValidInfoQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VALID_INFO", "批量部分更新", "conditionSql", kvalue, systemValidInfo, ret);
		return ret;
	}
	
	public String getSystemValidInfoExampleConditionSql(SystemValidInfoExample systemValidInfoQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemValidInfoQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemValidInfoExample.Criteria item = systemValidInfoQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemValidInfoExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemValidInfo">从数据库中查询一个对象SystemValidInfo</param>
	 * <param name="AId">PK</param>
	 */
	public SystemValidInfo systemValidInfoSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_VALID_INFO")) {
			String key = ("T_SYSTEM_VALID_INFO_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemValidInfo obj = ((SystemValidInfo)(this.getCache().get("T_SYSTEM_VALID_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().systemValidInfoSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VALID_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemValidInfoSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemValidInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemValidInfo> systemValidInfoSelectObjects(SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_VALID_INFO")) {
			String key = ("T_SYSTEM_VALID_INFO_" 
						+ ("queryObject_" + this.getSystemValidInfoExampleConditionSql(systemValidInfoQueryCondition)));
			List<SystemValidInfo> obj = ((List<SystemValidInfo>)(this.getCache().get("T_SYSTEM_VALID_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().systemValidInfoSelectObjects(systemValidInfoQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VALID_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemValidInfoSelectObjects(systemValidInfoQueryCondition);
		}
	}
	
	/**
	 * <param name="systemValidInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemValidInfoQuerySelectObjectsCount(SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_VALID_INFO")) {
			String key = ("T_SYSTEM_VALID_INFO_" 
						+ ("queryCount_" + this.getSystemValidInfoExampleConditionSql(systemValidInfoQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_VALID_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().systemValidInfoQuerySelectObjectsCount(systemValidInfoQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VALID_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemValidInfoQuerySelectObjectsCount(systemValidInfoQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要插入的新对象</param>
	 */
	public int systemVisitLogInsert(SystemVisitLog systemVisitLog) throws CacheException {
		int ret = this.getDao().systemVisitLogInsert(systemVisitLog);
		if (this.needCache("T_SYSTEM_VISIT_LOG")) {
			this.getCache().clear("T_SYSTEM_VISIT_LOG");
		}
		String kvalue = "";
		kvalue = (kvalue + systemVisitLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_LOG", "插入", "ID", kvalue, systemVisitLog, ret);
		return ret;
	}
	
	/**
	 * <param name="systemVisitLog">从数据库中删除一个对象SystemVisitLog</param>
	 * <param name="AId">标识</param>
	 */
	public int systemVisitLogDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemVisitLogDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_LOG")) {
				this.getCache().clear("T_SYSTEM_VISIT_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_LOG", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemVisitLog">从数据库中删除一个对象SystemVisitLog</param>
	 */
	public int systemVisitLogDeleteByCondition(SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemVisitLogDeleteByCondition(systemVisitLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_LOG")) {
				this.getCache().clear("T_SYSTEM_VISIT_LOG");
			}
		}
		String kvalue = this.getSystemVisitLogExampleConditionSql(systemVisitLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_LOG", "条件删除", "conditionSql", kvalue, systemVisitLogQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	public int systemVisitLogUpdate(SystemVisitLog systemVisitLog) throws CacheException {
		int ret = this.getDao().systemVisitLogUpdate(systemVisitLog);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_LOG")) {
				this.getCache().clear("T_SYSTEM_VISIT_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemVisitLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_LOG", "更新", "ID", kvalue, systemVisitLog, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	public int systemVisitLogUpdateSelective(SystemVisitLog systemVisitLog) throws CacheException {
		int ret = this.getDao().systemVisitLogUpdateSelective(systemVisitLog);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_LOG")) {
				this.getCache().clear("T_SYSTEM_VISIT_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemVisitLog.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_LOG", "部分更新", "ID", kvalue, systemVisitLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemVisitLog到数据库中
	 * <param name="systemVisitLogQueryCondition">附加的条件</param>
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	public int systemVisitLogUpdateByCondition(SystemVisitLog systemVisitLog, SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemVisitLogUpdateByCondition(systemVisitLog, systemVisitLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_LOG")) {
				this.getCache().clear("T_SYSTEM_VISIT_LOG");
			}
		}
		String kvalue = this.getSystemVisitLogExampleConditionSql(systemVisitLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_LOG", "条件更新", "conditionSql", kvalue, systemVisitLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemVisitLog到数据库中
	 * <param name="systemVisitLogQueryCondition">附加的条件</param>
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	public int systemVisitLogUpdateSelectiveByCondition(SystemVisitLog systemVisitLog, SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException {
		int ret = this.getDao().systemVisitLogUpdateSelectiveByCondition(systemVisitLog, systemVisitLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_LOG")) {
				this.getCache().clear("T_SYSTEM_VISIT_LOG");
			}
		}
		String kvalue = this.getSystemVisitLogExampleConditionSql(systemVisitLogQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_LOG", "批量部分更新", "conditionSql", kvalue, systemVisitLog, ret);
		return ret;
	}
	
	public String getSystemVisitLogExampleConditionSql(SystemVisitLogExample systemVisitLogQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemVisitLogQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemVisitLogExample.Criteria item = systemVisitLogQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemVisitLogExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemVisitLog">从数据库中查询一个对象SystemVisitLog</param>
	 * <param name="AId">标识</param>
	 */
	public SystemVisitLog systemVisitLogSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_VISIT_LOG")) {
			String key = ("T_SYSTEM_VISIT_LOG_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemVisitLog obj = ((SystemVisitLog)(this.getCache().get("T_SYSTEM_VISIT_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemVisitLogSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VISIT_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemVisitLogSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemVisitLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemVisitLog> systemVisitLogSelectObjects(SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_VISIT_LOG")) {
			String key = ("T_SYSTEM_VISIT_LOG_" 
						+ ("queryObject_" + this.getSystemVisitLogExampleConditionSql(systemVisitLogQueryCondition)));
			List<SystemVisitLog> obj = ((List<SystemVisitLog>)(this.getCache().get("T_SYSTEM_VISIT_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemVisitLogSelectObjects(systemVisitLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VISIT_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemVisitLogSelectObjects(systemVisitLogQueryCondition);
		}
	}
	
	/**
	 * <param name="systemVisitLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemVisitLogQuerySelectObjectsCount(SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_VISIT_LOG")) {
			String key = ("T_SYSTEM_VISIT_LOG_" 
						+ ("queryCount_" + this.getSystemVisitLogExampleConditionSql(systemVisitLogQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_VISIT_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().systemVisitLogQuerySelectObjectsCount(systemVisitLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VISIT_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemVisitLogQuerySelectObjectsCount(systemVisitLogQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要插入的新对象</param>
	 */
	public int systemVisitMessageInsert(SystemVisitMessage systemVisitMessage) throws CacheException {
		int ret = this.getDao().systemVisitMessageInsert(systemVisitMessage);
		if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
			this.getCache().clear("T_SYSTEM_VISIT_MESSAGE");
		}
		String kvalue = "";
		kvalue = (kvalue + systemVisitMessage.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_MESSAGE", "插入", "ID", kvalue, systemVisitMessage, ret);
		return ret;
	}
	
	/**
	 * <param name="systemVisitMessage">从数据库中删除一个对象SystemVisitMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	public int systemVisitMessageDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemVisitMessageDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
				this.getCache().clear("T_SYSTEM_VISIT_MESSAGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_MESSAGE", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemVisitMessage">从数据库中删除一个对象SystemVisitMessage</param>
	 */
	public int systemVisitMessageDeleteByCondition(SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException {
		int ret = this.getDao().systemVisitMessageDeleteByCondition(systemVisitMessageQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
				this.getCache().clear("T_SYSTEM_VISIT_MESSAGE");
			}
		}
		String kvalue = this.getSystemVisitMessageExampleConditionSql(systemVisitMessageQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_MESSAGE", "条件删除", "conditionSql", kvalue, systemVisitMessageQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	public int systemVisitMessageUpdate(SystemVisitMessage systemVisitMessage) throws CacheException {
		int ret = this.getDao().systemVisitMessageUpdate(systemVisitMessage);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
				this.getCache().clear("T_SYSTEM_VISIT_MESSAGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemVisitMessage.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_MESSAGE", "更新", "ID", kvalue, systemVisitMessage, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	public int systemVisitMessageUpdateSelective(SystemVisitMessage systemVisitMessage) throws CacheException {
		int ret = this.getDao().systemVisitMessageUpdateSelective(systemVisitMessage);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
				this.getCache().clear("T_SYSTEM_VISIT_MESSAGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemVisitMessage.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_MESSAGE", "部分更新", "ID", kvalue, systemVisitMessage, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessageQueryCondition">附加的条件</param>
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	public int systemVisitMessageUpdateByCondition(SystemVisitMessage systemVisitMessage, SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException {
		int ret = this.getDao().systemVisitMessageUpdateByCondition(systemVisitMessage, systemVisitMessageQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
				this.getCache().clear("T_SYSTEM_VISIT_MESSAGE");
			}
		}
		String kvalue = this.getSystemVisitMessageExampleConditionSql(systemVisitMessageQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_MESSAGE", "条件更新", "conditionSql", kvalue, systemVisitMessage, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessageQueryCondition">附加的条件</param>
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	public int systemVisitMessageUpdateSelectiveByCondition(SystemVisitMessage systemVisitMessage, SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException {
		int ret = this.getDao().systemVisitMessageUpdateSelectiveByCondition(systemVisitMessage, systemVisitMessageQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
				this.getCache().clear("T_SYSTEM_VISIT_MESSAGE");
			}
		}
		String kvalue = this.getSystemVisitMessageExampleConditionSql(systemVisitMessageQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_VISIT_MESSAGE", "批量部分更新", "conditionSql", kvalue, systemVisitMessage, ret);
		return ret;
	}
	
	public String getSystemVisitMessageExampleConditionSql(SystemVisitMessageExample systemVisitMessageQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemVisitMessageQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemVisitMessageExample.Criteria item = systemVisitMessageQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemVisitMessageExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemVisitMessage">从数据库中查询一个对象SystemVisitMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	public SystemVisitMessage systemVisitMessageSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
			String key = ("T_SYSTEM_VISIT_MESSAGE_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemVisitMessage obj = ((SystemVisitMessage)(this.getCache().get("T_SYSTEM_VISIT_MESSAGE", key)));
			if ((obj == null)) {
				obj = this.getDao().systemVisitMessageSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VISIT_MESSAGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemVisitMessageSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemVisitMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemVisitMessage> systemVisitMessageSelectObjects(SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
			String key = ("T_SYSTEM_VISIT_MESSAGE_" 
						+ ("queryObject_" + this.getSystemVisitMessageExampleConditionSql(systemVisitMessageQueryCondition)));
			List<SystemVisitMessage> obj = ((List<SystemVisitMessage>)(this.getCache().get("T_SYSTEM_VISIT_MESSAGE", key)));
			if ((obj == null)) {
				obj = this.getDao().systemVisitMessageSelectObjects(systemVisitMessageQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VISIT_MESSAGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemVisitMessageSelectObjects(systemVisitMessageQueryCondition);
		}
	}
	
	/**
	 * <param name="systemVisitMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemVisitMessageQuerySelectObjectsCount(SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_VISIT_MESSAGE")) {
			String key = ("T_SYSTEM_VISIT_MESSAGE_" 
						+ ("queryCount_" + this.getSystemVisitMessageExampleConditionSql(systemVisitMessageQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_VISIT_MESSAGE", key)));
			if ((obj == null)) {
				obj = this.getDao().systemVisitMessageQuerySelectObjectsCount(systemVisitMessageQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_VISIT_MESSAGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemVisitMessageQuerySelectObjectsCount(systemVisitMessageQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要插入的新对象</param>
	 */
	public int systemWhiteListInsert(SystemWhiteList systemWhiteList) throws CacheException {
		int ret = this.getDao().systemWhiteListInsert(systemWhiteList);
		if (this.needCache("T_SYSTEM_WHITE_LIST")) {
			this.getCache().clear("T_SYSTEM_WHITE_LIST");
		}
		String kvalue = "";
		kvalue = (kvalue + systemWhiteList.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_WHITE_LIST", "插入", "ID", kvalue, systemWhiteList, ret);
		return ret;
	}
	
	/**
	 * <param name="systemWhiteList">从数据库中删除一个对象SystemWhiteList</param>
	 * <param name="AId">主键</param>
	 */
	public int systemWhiteListDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().systemWhiteListDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_WHITE_LIST")) {
				this.getCache().clear("T_SYSTEM_WHITE_LIST");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_SYSTEM_WHITE_LIST", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="systemWhiteList">从数据库中删除一个对象SystemWhiteList</param>
	 */
	public int systemWhiteListDeleteByCondition(SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException {
		int ret = this.getDao().systemWhiteListDeleteByCondition(systemWhiteListQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_WHITE_LIST")) {
				this.getCache().clear("T_SYSTEM_WHITE_LIST");
			}
		}
		String kvalue = this.getSystemWhiteListExampleConditionSql(systemWhiteListQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_WHITE_LIST", "条件删除", "conditionSql", kvalue, systemWhiteListQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	public int systemWhiteListUpdate(SystemWhiteList systemWhiteList) throws CacheException {
		int ret = this.getDao().systemWhiteListUpdate(systemWhiteList);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_WHITE_LIST")) {
				this.getCache().clear("T_SYSTEM_WHITE_LIST");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemWhiteList.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_WHITE_LIST", "更新", "ID", kvalue, systemWhiteList, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	public int systemWhiteListUpdateSelective(SystemWhiteList systemWhiteList) throws CacheException {
		int ret = this.getDao().systemWhiteListUpdateSelective(systemWhiteList);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_WHITE_LIST")) {
				this.getCache().clear("T_SYSTEM_WHITE_LIST");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + systemWhiteList.getId());
		this.operatesLogSimpleAdd("T_SYSTEM_WHITE_LIST", "部分更新", "ID", kvalue, systemWhiteList, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemWhiteList到数据库中
	 * <param name="systemWhiteListQueryCondition">附加的条件</param>
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	public int systemWhiteListUpdateByCondition(SystemWhiteList systemWhiteList, SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException {
		int ret = this.getDao().systemWhiteListUpdateByCondition(systemWhiteList, systemWhiteListQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_WHITE_LIST")) {
				this.getCache().clear("T_SYSTEM_WHITE_LIST");
			}
		}
		String kvalue = this.getSystemWhiteListExampleConditionSql(systemWhiteListQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_WHITE_LIST", "条件更新", "conditionSql", kvalue, systemWhiteList, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemWhiteList到数据库中
	 * <param name="systemWhiteListQueryCondition">附加的条件</param>
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	public int systemWhiteListUpdateSelectiveByCondition(SystemWhiteList systemWhiteList, SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException {
		int ret = this.getDao().systemWhiteListUpdateSelectiveByCondition(systemWhiteList, systemWhiteListQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_SYSTEM_WHITE_LIST")) {
				this.getCache().clear("T_SYSTEM_WHITE_LIST");
			}
		}
		String kvalue = this.getSystemWhiteListExampleConditionSql(systemWhiteListQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_WHITE_LIST", "批量部分更新", "conditionSql", kvalue, systemWhiteList, ret);
		return ret;
	}
	
	public String getSystemWhiteListExampleConditionSql(SystemWhiteListExample systemWhiteListQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemWhiteListQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemWhiteListExample.Criteria item = systemWhiteListQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemWhiteListExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemWhiteList">从数据库中查询一个对象SystemWhiteList</param>
	 * <param name="AId">主键</param>
	 */
	public SystemWhiteList systemWhiteListSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_SYSTEM_WHITE_LIST")) {
			String key = ("T_SYSTEM_WHITE_LIST_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			SystemWhiteList obj = ((SystemWhiteList)(this.getCache().get("T_SYSTEM_WHITE_LIST", key)));
			if ((obj == null)) {
				obj = this.getDao().systemWhiteListSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_WHITE_LIST", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemWhiteListSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="systemWhiteListQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemWhiteList> systemWhiteListSelectObjects(SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_WHITE_LIST")) {
			String key = ("T_SYSTEM_WHITE_LIST_" 
						+ ("queryObject_" + this.getSystemWhiteListExampleConditionSql(systemWhiteListQueryCondition)));
			List<SystemWhiteList> obj = ((List<SystemWhiteList>)(this.getCache().get("T_SYSTEM_WHITE_LIST", key)));
			if ((obj == null)) {
				obj = this.getDao().systemWhiteListSelectObjects(systemWhiteListQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_WHITE_LIST", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemWhiteListSelectObjects(systemWhiteListQueryCondition);
		}
	}
	
	/**
	 * <param name="systemWhiteListQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemWhiteListQuerySelectObjectsCount(SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException {
		if (this.needCache("T_SYSTEM_WHITE_LIST")) {
			String key = ("T_SYSTEM_WHITE_LIST_" 
						+ ("queryCount_" + this.getSystemWhiteListExampleConditionSql(systemWhiteListQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_SYSTEM_WHITE_LIST", key)));
			if ((obj == null)) {
				obj = this.getDao().systemWhiteListQuerySelectObjectsCount(systemWhiteListQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_SYSTEM_WHITE_LIST", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().systemWhiteListQuerySelectObjectsCount(systemWhiteListQueryCondition);
		}
	}
	
	public String getVSystemMsgPushDetailExampleConditionSql(VSystemMsgPushDetailExample vSystemMsgPushDetailQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < vSystemMsgPushDetailQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			VSystemMsgPushDetailExample.Criteria item = vSystemMsgPushDetailQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					VSystemMsgPushDetailExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="vSystemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VSystemMsgPushDetail> vSystemMsgPushDetailSelectObjects(VSystemMsgPushDetailExample vSystemMsgPushDetailQueryCondition) throws CacheException {
		if (this.needCache("V_SYSTEM_MSG_PUSH_DETAIL")) {
			String key = ("V_SYSTEM_MSG_PUSH_DETAIL_" 
						+ ("queryObject_" + this.getVSystemMsgPushDetailExampleConditionSql(vSystemMsgPushDetailQueryCondition)));
			List<VSystemMsgPushDetail> obj = ((List<VSystemMsgPushDetail>)(this.getCache().get("V_SYSTEM_MSG_PUSH_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().vSystemMsgPushDetailSelectObjects(vSystemMsgPushDetailQueryCondition);
				if ((obj != null)) {
					this.getCache().put("V_SYSTEM_MSG_PUSH_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().vSystemMsgPushDetailSelectObjects(vSystemMsgPushDetailQueryCondition);
		}
	}
	
	/**
	 * <param name="vSystemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vSystemMsgPushDetailQuerySelectObjectsCount(VSystemMsgPushDetailExample vSystemMsgPushDetailQueryCondition) throws CacheException {
		if (this.needCache("V_SYSTEM_MSG_PUSH_DETAIL")) {
			String key = ("V_SYSTEM_MSG_PUSH_DETAIL_" 
						+ ("queryCount_" + this.getVSystemMsgPushDetailExampleConditionSql(vSystemMsgPushDetailQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("V_SYSTEM_MSG_PUSH_DETAIL", key)));
			if ((obj == null)) {
				obj = this.getDao().vSystemMsgPushDetailQuerySelectObjectsCount(vSystemMsgPushDetailQueryCondition);
				if ((obj != null)) {
					this.getCache().put("V_SYSTEM_MSG_PUSH_DETAIL", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().vSystemMsgPushDetailQuerySelectObjectsCount(vSystemMsgPushDetailQueryCondition);
		}
	}
	
	public String getVSystemMsgPushTaskExampleConditionSql(VSystemMsgPushTaskExample vSystemMsgPushTaskQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < vSystemMsgPushTaskQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			VSystemMsgPushTaskExample.Criteria item = vSystemMsgPushTaskQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					VSystemMsgPushTaskExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="vSystemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VSystemMsgPushTask> vSystemMsgPushTaskSelectObjects(VSystemMsgPushTaskExample vSystemMsgPushTaskQueryCondition) throws CacheException {
		if (this.needCache("V_SYSTEM_MSG_PUSH_TASK")) {
			String key = ("V_SYSTEM_MSG_PUSH_TASK_" 
						+ ("queryObject_" + this.getVSystemMsgPushTaskExampleConditionSql(vSystemMsgPushTaskQueryCondition)));
			List<VSystemMsgPushTask> obj = ((List<VSystemMsgPushTask>)(this.getCache().get("V_SYSTEM_MSG_PUSH_TASK", key)));
			if ((obj == null)) {
				obj = this.getDao().vSystemMsgPushTaskSelectObjects(vSystemMsgPushTaskQueryCondition);
				if ((obj != null)) {
					this.getCache().put("V_SYSTEM_MSG_PUSH_TASK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().vSystemMsgPushTaskSelectObjects(vSystemMsgPushTaskQueryCondition);
		}
	}
	
	/**
	 * <param name="vSystemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vSystemMsgPushTaskQuerySelectObjectsCount(VSystemMsgPushTaskExample vSystemMsgPushTaskQueryCondition) throws CacheException {
		if (this.needCache("V_SYSTEM_MSG_PUSH_TASK")) {
			String key = ("V_SYSTEM_MSG_PUSH_TASK_" 
						+ ("queryCount_" + this.getVSystemMsgPushTaskExampleConditionSql(vSystemMsgPushTaskQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("V_SYSTEM_MSG_PUSH_TASK", key)));
			if ((obj == null)) {
				obj = this.getDao().vSystemMsgPushTaskQuerySelectObjectsCount(vSystemMsgPushTaskQueryCondition);
				if ((obj != null)) {
					this.getCache().put("V_SYSTEM_MSG_PUSH_TASK", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().vSystemMsgPushTaskQuerySelectObjectsCount(vSystemMsgPushTaskQueryCondition);
		}
	}
	
	/**
	 * 简单的日志接口,调用Dao
	 * <param name="tableName">表名称</param>
	 * <param name="operateName">操作名称</param>
	 * <param name="keyFieldName">主键字段名</param>
	 * <param name="keyFieldValue">主键字段值</param>
	 * <param name="param">附加参数</param>
	 * <param name="updateCount">更新数量</param>
	 */
	public void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param, int updateCount) {
		this.getDao().operatesLogSimpleAdd(tableName, operateName, keyFieldName, keyFieldValue, param, updateCount);
	}
	
	/**
	 * 根据表名决定是否需要使用缓存
	 * <param name="tableName">原始表名称</param>
	 */
	protected Boolean needCache(String tableName) {
		return false;
	}
	
	/**
	 * 获得缓存服务
	 */
	public Cache getCache() {
		throw new UnsupportedOperationException();
	}
}
