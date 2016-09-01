package topdeep.commonfund.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import topdeep.common.entity.base.BaseMapper;
import topdeep.commonfund.entity.db.BusinessLogicManage;

/**
 * @author niexin
 *
 */
@Repository("fundCommonBaseDao")
public class BaseDao extends BusinessLogicManage {

	@Autowired(required = false)
	@Qualifier("fundCommonSqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Autowired(required = false)
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	public Long getNextSequValue(String sequName) {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		return mapperImpl.getNextSequValue(sequName);
	}

	public void checkDatabase() {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		mapperImpl.checkDatabase();
	}

	public int queryCount(String sql) {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		Long count = mapperImpl.queryCount(sql);
		if (count == null) {
			return 0;
		}
		return count.intValue();
	}

	public Object queryScalar(String sql) {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		Object obj = mapperImpl.queryScalar(sql);
		return obj;
	}

	public <T> List<T> queryEntity(Class<T> type, String sql) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		// sql = "SHOW VARIABLES LIKE 'CHAR%';";
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		List<Map<String, Object>> resultList = mapperImpl.queryResult(sql);
		List<T> list = new ArrayList<T>();
		for (Map<String, Object> item : resultList) {
			T obj = type.newInstance();
			readObj(obj, item);
			list.add(obj);
		}
		return list;
	}

	public <T> List<T> queryEntity(Class<T> type, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// return getDataVisit().queryEntity(type, sql, pageIndex, rowsOfPage, orderField, order);
		int beginRow = pageIndex * rowsOfPage;
		int endRow = beginRow + rowsOfPage;
		return queryEntity(type, getPageSql(sql, beginRow, endRow, orderField + " " + order));
	}

	public <T> T querySingleEntity(Class<T> type, String sql) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException,
			InvocationTargetException {
		List<T> list = queryEntity(type, sql);
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	protected String getPageSql(String sql, int beginRow, int endRow, String order) {
		return "select * from (" + sql + ") TTT___ order by " + order + " limit " + beginRow + "," + (endRow - beginRow);
	}

	private static Hashtable<Class, Hashtable<String, Method>> objMetaList = new Hashtable<Class, Hashtable<String, Method>>();

	private Method getObjSetMethod(Class type, String fieldName) {
		Hashtable<String, Method> methodList = objMetaList.get(type);
		if (methodList == null) {
			synchronized (objMetaList) {
				methodList = objMetaList.get(type);
				if (methodList == null) {
					methodList = new Hashtable<String, Method>();
					// create
					Method[] methods = type.getMethods();
					for (Method method : methods) {
						if (method.getName().startsWith("set") && (method.getParameterTypes().length == 1)) {
							String key = method.getName().toLowerCase().substring(3);
							if (!methodList.containsKey(key)) {
								methodList.put(key, method);
							}
							// if(method.getParameterTypes()[0] == boolean.class){
							//
							// }
						}
					}
					objMetaList.put(type, methodList);
				}
			}
		}
		String fieldKey = fieldName.toLowerCase().replaceAll("_", "");
		if (methodList.containsKey(fieldKey)) {
			return methodList.get(fieldKey);
		} else {
			if (fieldKey.startsWith("is")) {
				fieldKey = fieldKey.substring(2);
				if (methodList.containsKey(fieldKey)) {
					return methodList.get(fieldKey);
				}
			}
			return null;
		}
	}

	private void readObj(Object obj, Map<String, Object> data) {
		for (String key : data.keySet()) {
			String fieldName = key;
			Method method = getObjSetMethod(obj.getClass(), fieldName);
			if (method != null) {
				try {
					method.invoke(obj, data.get(key));
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
				}
			} else {
				logger.warn("can't read " + fieldName + " value");
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lion.fund.entity.db.BusinessLogicManage#operatesLogSimpleAdd(java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.Object, int)
	 */
	// @Override
	// protected void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param, int updateCount) {
	// OperateLog log = new OperateLog();
	// log.setId(UUIDGenerator.getUUID24());
	// log.setOperateTime(new java.util.Date());
	// log.setOperateType(tableName + ":" + operateName + "=[" + updateCount + "]");
	// log.setOperateContent(keyFieldName + ":" + keyFieldValue);
	// log.setRowVersion(0);
	// if (manageSession != null && !StringUtils.isNullOrEmpty(manageSession.getLoginUserId())) {
	// log.setOperatorId(manageSession.getLoginUserId());
	// log.setOperatorName(manageSession.getLoginUserName());
	// } else {
	// log.setOperatorId(UUIDGenerator.PARENT_ID);
	// log.setOperatorName("系统");
	// }
	// operateLogInsert(log);
	// }

}
