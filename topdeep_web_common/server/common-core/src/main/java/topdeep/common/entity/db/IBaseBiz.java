package topdeep.common.entity.db;
import java.util.*;
import common.util.*;
import java.sql.*;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import common.cache2.*;
/**
 * 基本的商业应用层接口
 */
public interface IBaseBiz {
	
	/**
	 * 插入一个对象SystemAdmin到数据库中
	 * <param name="systemAdmin">需要插入的新对象</param>
	 */
	int systemAdminInsert(SystemAdmin systemAdmin) throws CacheException;
	
	/**
	 * <param name="systemAdmin">从数据库中删除一个对象SystemAdmin</param>
	 * <param name="AId">操作员标识</param>
	 */
	int systemAdminDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemAdmin">从数据库中删除一个对象SystemAdmin</param>
	 */
	int systemAdminDeleteByCondition(SystemAdminExample systemAdminQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemAdmin到数据库中
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	int systemAdminUpdate(SystemAdmin systemAdmin) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemAdmin到数据库中
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	int systemAdminUpdateSelective(SystemAdmin systemAdmin) throws CacheException;
	
	/**
	 * 更新一批对象SystemAdmin到数据库中
	 * <param name="systemAdminQueryCondition">附加的条件</param>
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	int systemAdminUpdateByCondition(SystemAdmin systemAdmin, SystemAdminExample systemAdminQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemAdmin到数据库中
	 * <param name="systemAdminQueryCondition">附加的条件</param>
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	int systemAdminUpdateSelectiveByCondition(SystemAdmin systemAdmin, SystemAdminExample systemAdminQueryCondition) throws CacheException;
	
	String getSystemAdminExampleConditionSql(SystemAdminExample systemAdminQueryCondition);
	
	/**
	 * <param name="systemAdmin">从数据库中查询一个对象SystemAdmin</param>
	 * <param name="AId">操作员标识</param>
	 */
	SystemAdmin systemAdminSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemAdminQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemAdmin> systemAdminSelectObjects(SystemAdminExample systemAdminQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemAdminQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemAdminQuerySelectObjectsCount(SystemAdminExample systemAdminQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要插入的新对象</param>
	 */
	int systemAdminLogInsert(SystemAdminLog systemAdminLog) throws CacheException;
	
	/**
	 * <param name="systemAdminLog">从数据库中删除一个对象SystemAdminLog</param>
	 * <param name="AAdminLogId">操作员日志标识</param>
	 */
	int systemAdminLogDeleteByPrimaryKey(String AAdminLogId) throws CacheException;
	
	/**
	 * <param name="systemAdminLog">从数据库中删除一个对象SystemAdminLog</param>
	 */
	int systemAdminLogDeleteByCondition(SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	int systemAdminLogUpdate(SystemAdminLog systemAdminLog) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	int systemAdminLogUpdateSelective(SystemAdminLog systemAdminLog) throws CacheException;
	
	/**
	 * 更新一批对象SystemAdminLog到数据库中
	 * <param name="systemAdminLogQueryCondition">附加的条件</param>
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	int systemAdminLogUpdateByCondition(SystemAdminLog systemAdminLog, SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemAdminLog到数据库中
	 * <param name="systemAdminLogQueryCondition">附加的条件</param>
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	int systemAdminLogUpdateSelectiveByCondition(SystemAdminLog systemAdminLog, SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException;
	
	String getSystemAdminLogExampleConditionSql(SystemAdminLogExample systemAdminLogQueryCondition);
	
	/**
	 * <param name="systemAdminLog">从数据库中查询一个对象SystemAdminLog</param>
	 * <param name="AAdminLogId">操作员日志标识</param>
	 */
	SystemAdminLog systemAdminLogSelectByPrimaryKey(String AAdminLogId) throws CacheException;
	
	/**
	 * <param name="systemAdminLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemAdminLog> systemAdminLogSelectObjects(SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemAdminLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemAdminLogQuerySelectObjectsCount(SystemAdminLogExample systemAdminLogQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要插入的新对象</param>
	 */
	int systemAdminRolesInsert(SystemAdminRoles systemAdminRoles) throws CacheException;
	
	/**
	 * <param name="systemAdminRoles">从数据库中删除一个对象SystemAdminRoles</param>
	 * <param name="AId">主键</param>
	 */
	int systemAdminRolesDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemAdminRoles">从数据库中删除一个对象SystemAdminRoles</param>
	 */
	int systemAdminRolesDeleteByCondition(SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	int systemAdminRolesUpdate(SystemAdminRoles systemAdminRoles) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	int systemAdminRolesUpdateSelective(SystemAdminRoles systemAdminRoles) throws CacheException;
	
	/**
	 * 更新一批对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRolesQueryCondition">附加的条件</param>
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	int systemAdminRolesUpdateByCondition(SystemAdminRoles systemAdminRoles, SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRolesQueryCondition">附加的条件</param>
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	int systemAdminRolesUpdateSelectiveByCondition(SystemAdminRoles systemAdminRoles, SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException;
	
	String getSystemAdminRolesExampleConditionSql(SystemAdminRolesExample systemAdminRolesQueryCondition);
	
	/**
	 * <param name="systemAdminRoles">从数据库中查询一个对象SystemAdminRoles</param>
	 * <param name="AId">主键</param>
	 */
	SystemAdminRoles systemAdminRolesSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemAdminRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemAdminRoles> systemAdminRolesSelectObjects(SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemAdminRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemAdminRolesQuerySelectObjectsCount(SystemAdminRolesExample systemAdminRolesQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要插入的新对象</param>
	 */
	int systemBaseInfoInsert(SystemBaseInfo systemBaseInfo) throws CacheException;
	
	/**
	 * <param name="systemBaseInfo">从数据库中删除一个对象SystemBaseInfo</param>
	 * <param name="ASystemBaseInfoKey">系统基本信息表 主键类</param>
	 */
	int systemBaseInfoDeleteByPrimaryKey(SystemBaseInfoKey ASystemBaseInfoKey) throws CacheException;
	
	/**
	 * <param name="systemBaseInfo">从数据库中删除一个对象SystemBaseInfo</param>
	 */
	int systemBaseInfoDeleteByCondition(SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	int systemBaseInfoUpdate(SystemBaseInfo systemBaseInfo) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	int systemBaseInfoUpdateSelective(SystemBaseInfo systemBaseInfo) throws CacheException;
	
	/**
	 * 更新一批对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfoQueryCondition">附加的条件</param>
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	int systemBaseInfoUpdateByCondition(SystemBaseInfo systemBaseInfo, SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfoQueryCondition">附加的条件</param>
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	int systemBaseInfoUpdateSelectiveByCondition(SystemBaseInfo systemBaseInfo, SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException;
	
	String getSystemBaseInfoExampleConditionSql(SystemBaseInfoExample systemBaseInfoQueryCondition);
	
	/**
	 * <param name="systemBaseInfo">从数据库中查询一个对象SystemBaseInfo</param>
	 * <param name="ASystemBaseInfoKey">系统基本信息表 主键类</param>
	 */
	SystemBaseInfo systemBaseInfoSelectByPrimaryKey(SystemBaseInfoKey ASystemBaseInfoKey) throws CacheException;
	
	/**
	 * <param name="systemBaseInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemBaseInfo> systemBaseInfoSelectObjects(SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemBaseInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemBaseInfoQuerySelectObjectsCount(SystemBaseInfoExample systemBaseInfoQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要插入的新对象</param>
	 */
	int systemClientActivationInsert(SystemClientActivation systemClientActivation) throws CacheException;
	
	/**
	 * <param name="systemClientActivation">从数据库中删除一个对象SystemClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	int systemClientActivationDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemClientActivation">从数据库中删除一个对象SystemClientActivation</param>
	 */
	int systemClientActivationDeleteByCondition(SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	int systemClientActivationUpdate(SystemClientActivation systemClientActivation) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	int systemClientActivationUpdateSelective(SystemClientActivation systemClientActivation) throws CacheException;
	
	/**
	 * 更新一批对象SystemClientActivation到数据库中
	 * <param name="systemClientActivationQueryCondition">附加的条件</param>
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	int systemClientActivationUpdateByCondition(SystemClientActivation systemClientActivation, SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemClientActivation到数据库中
	 * <param name="systemClientActivationQueryCondition">附加的条件</param>
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	int systemClientActivationUpdateSelectiveByCondition(SystemClientActivation systemClientActivation, SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException;
	
	String getSystemClientActivationExampleConditionSql(SystemClientActivationExample systemClientActivationQueryCondition);
	
	/**
	 * <param name="systemClientActivation">从数据库中查询一个对象SystemClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	SystemClientActivation systemClientActivationSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemClientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemClientActivation> systemClientActivationSelectObjects(SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemClientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemClientActivationQuerySelectObjectsCount(SystemClientActivationExample systemClientActivationQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要插入的新对象</param>
	 */
	int systemClientTrackInsert(SystemClientTrack systemClientTrack) throws CacheException;
	
	/**
	 * <param name="systemClientTrack">从数据库中删除一个对象SystemClientTrack</param>
	 * <param name="AId">PK</param>
	 */
	int systemClientTrackDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemClientTrack">从数据库中删除一个对象SystemClientTrack</param>
	 */
	int systemClientTrackDeleteByCondition(SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	int systemClientTrackUpdate(SystemClientTrack systemClientTrack) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	int systemClientTrackUpdateSelective(SystemClientTrack systemClientTrack) throws CacheException;
	
	/**
	 * 更新一批对象SystemClientTrack到数据库中
	 * <param name="systemClientTrackQueryCondition">附加的条件</param>
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	int systemClientTrackUpdateByCondition(SystemClientTrack systemClientTrack, SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemClientTrack到数据库中
	 * <param name="systemClientTrackQueryCondition">附加的条件</param>
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	int systemClientTrackUpdateSelectiveByCondition(SystemClientTrack systemClientTrack, SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException;
	
	String getSystemClientTrackExampleConditionSql(SystemClientTrackExample systemClientTrackQueryCondition);
	
	/**
	 * <param name="systemClientTrack">从数据库中查询一个对象SystemClientTrack</param>
	 * <param name="AId">PK</param>
	 */
	SystemClientTrack systemClientTrackSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemClientTrackQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemClientTrack> systemClientTrackSelectObjects(SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemClientTrackQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemClientTrackQuerySelectObjectsCount(SystemClientTrackExample systemClientTrackQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要插入的新对象</param>
	 */
	int systemClientTrackDetailInsert(SystemClientTrackDetail systemClientTrackDetail) throws CacheException;
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中删除一个对象SystemClientTrackDetail</param>
	 * <param name="AId">PK</param>
	 */
	int systemClientTrackDetailDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中删除一个对象SystemClientTrackDetail</param>
	 */
	int systemClientTrackDetailDeleteByCondition(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	int systemClientTrackDetailUpdate(SystemClientTrackDetail systemClientTrackDetail) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	int systemClientTrackDetailUpdateSelective(SystemClientTrackDetail systemClientTrackDetail) throws CacheException;
	
	/**
	 * 更新一批对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetailQueryCondition">附加的条件</param>
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	int systemClientTrackDetailUpdateByCondition(SystemClientTrackDetail systemClientTrackDetail, SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetailQueryCondition">附加的条件</param>
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	int systemClientTrackDetailUpdateSelectiveByCondition(SystemClientTrackDetail systemClientTrackDetail, SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException;
	
	String getSystemClientTrackDetailExampleConditionSql(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition);
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中查询一个对象SystemClientTrackDetail</param>
	 * <param name="AId">PK</param>
	 */
	SystemClientTrackDetail systemClientTrackDetailSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemClientTrackDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemClientTrackDetail> systemClientTrackDetailSelectObjects(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemClientTrackDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemClientTrackDetailQuerySelectObjectsCount(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要插入的新对象</param>
	 */
	int systemClientVersionInsert(SystemClientVersion systemClientVersion) throws CacheException;
	
	/**
	 * <param name="systemClientVersion">从数据库中删除一个对象SystemClientVersion</param>
	 * <param name="ASystemClientVersionKey">客户端版本控制 主键类</param>
	 */
	int systemClientVersionDeleteByPrimaryKey(SystemClientVersionKey ASystemClientVersionKey) throws CacheException;
	
	/**
	 * <param name="systemClientVersion">从数据库中删除一个对象SystemClientVersion</param>
	 */
	int systemClientVersionDeleteByCondition(SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	int systemClientVersionUpdate(SystemClientVersion systemClientVersion) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	int systemClientVersionUpdateSelective(SystemClientVersion systemClientVersion) throws CacheException;
	
	/**
	 * 更新一批对象SystemClientVersion到数据库中
	 * <param name="systemClientVersionQueryCondition">附加的条件</param>
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	int systemClientVersionUpdateByCondition(SystemClientVersion systemClientVersion, SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemClientVersion到数据库中
	 * <param name="systemClientVersionQueryCondition">附加的条件</param>
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	int systemClientVersionUpdateSelectiveByCondition(SystemClientVersion systemClientVersion, SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException;
	
	String getSystemClientVersionExampleConditionSql(SystemClientVersionExample systemClientVersionQueryCondition);
	
	/**
	 * <param name="systemClientVersion">从数据库中查询一个对象SystemClientVersion</param>
	 * <param name="ASystemClientVersionKey">客户端版本控制 主键类</param>
	 */
	SystemClientVersion systemClientVersionSelectByPrimaryKey(SystemClientVersionKey ASystemClientVersionKey) throws CacheException;
	
	/**
	 * <param name="systemClientVersionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemClientVersion> systemClientVersionSelectObjects(SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemClientVersionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemClientVersionQuerySelectObjectsCount(SystemClientVersionExample systemClientVersionQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemConfig到数据库中
	 * <param name="systemConfig">需要插入的新对象</param>
	 */
	int systemConfigInsert(SystemConfig systemConfig) throws CacheException;
	
	/**
	 * <param name="systemConfig">从数据库中删除一个对象SystemConfig</param>
	 * <param name="ASystemConfigKey">系统配置表 主键类</param>
	 */
	int systemConfigDeleteByPrimaryKey(SystemConfigKey ASystemConfigKey) throws CacheException;
	
	/**
	 * <param name="systemConfig">从数据库中删除一个对象SystemConfig</param>
	 */
	int systemConfigDeleteByCondition(SystemConfigExample systemConfigQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemConfig到数据库中
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	int systemConfigUpdate(SystemConfig systemConfig) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemConfig到数据库中
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	int systemConfigUpdateSelective(SystemConfig systemConfig) throws CacheException;
	
	/**
	 * 更新一批对象SystemConfig到数据库中
	 * <param name="systemConfigQueryCondition">附加的条件</param>
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	int systemConfigUpdateByCondition(SystemConfig systemConfig, SystemConfigExample systemConfigQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemConfig到数据库中
	 * <param name="systemConfigQueryCondition">附加的条件</param>
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	int systemConfigUpdateSelectiveByCondition(SystemConfig systemConfig, SystemConfigExample systemConfigQueryCondition) throws CacheException;
	
	String getSystemConfigExampleConditionSql(SystemConfigExample systemConfigQueryCondition);
	
	/**
	 * <param name="systemConfig">从数据库中查询一个对象SystemConfig</param>
	 * <param name="ASystemConfigKey">系统配置表 主键类</param>
	 */
	SystemConfig systemConfigSelectByPrimaryKey(SystemConfigKey ASystemConfigKey) throws CacheException;
	
	/**
	 * <param name="systemConfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemConfig> systemConfigSelectObjects(SystemConfigExample systemConfigQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemConfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemConfigQuerySelectObjectsCount(SystemConfigExample systemConfigQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemCronJob到数据库中
	 * <param name="systemCronJob">需要插入的新对象</param>
	 */
	int systemCronJobInsert(SystemCronJob systemCronJob) throws CacheException;
	
	/**
	 * <param name="systemCronJob">从数据库中删除一个对象SystemCronJob</param>
	 * <param name="AId"></param>
	 */
	int systemCronJobDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemCronJob">从数据库中删除一个对象SystemCronJob</param>
	 */
	int systemCronJobDeleteByCondition(SystemCronJobExample systemCronJobQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemCronJob到数据库中
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	int systemCronJobUpdate(SystemCronJob systemCronJob) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemCronJob到数据库中
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	int systemCronJobUpdateSelective(SystemCronJob systemCronJob) throws CacheException;
	
	/**
	 * 更新一批对象SystemCronJob到数据库中
	 * <param name="systemCronJobQueryCondition">附加的条件</param>
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	int systemCronJobUpdateByCondition(SystemCronJob systemCronJob, SystemCronJobExample systemCronJobQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemCronJob到数据库中
	 * <param name="systemCronJobQueryCondition">附加的条件</param>
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	int systemCronJobUpdateSelectiveByCondition(SystemCronJob systemCronJob, SystemCronJobExample systemCronJobQueryCondition) throws CacheException;
	
	String getSystemCronJobExampleConditionSql(SystemCronJobExample systemCronJobQueryCondition);
	
	/**
	 * <param name="systemCronJob">从数据库中查询一个对象SystemCronJob</param>
	 * <param name="AId"></param>
	 */
	SystemCronJob systemCronJobSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemCronJobQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemCronJob> systemCronJobSelectObjects(SystemCronJobExample systemCronJobQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemCronJobQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemCronJobQuerySelectObjectsCount(SystemCronJobExample systemCronJobQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要插入的新对象</param>
	 */
	int systemCronJobLogInsert(SystemCronJobLog systemCronJobLog) throws CacheException;
	
	/**
	 * <param name="systemCronJobLog">从数据库中删除一个对象SystemCronJobLog</param>
	 * <param name="AId"></param>
	 */
	int systemCronJobLogDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemCronJobLog">从数据库中删除一个对象SystemCronJobLog</param>
	 */
	int systemCronJobLogDeleteByCondition(SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	int systemCronJobLogUpdate(SystemCronJobLog systemCronJobLog) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	int systemCronJobLogUpdateSelective(SystemCronJobLog systemCronJobLog) throws CacheException;
	
	/**
	 * 更新一批对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLogQueryCondition">附加的条件</param>
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	int systemCronJobLogUpdateByCondition(SystemCronJobLog systemCronJobLog, SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLogQueryCondition">附加的条件</param>
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	int systemCronJobLogUpdateSelectiveByCondition(SystemCronJobLog systemCronJobLog, SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException;
	
	String getSystemCronJobLogExampleConditionSql(SystemCronJobLogExample systemCronJobLogQueryCondition);
	
	/**
	 * <param name="systemCronJobLog">从数据库中查询一个对象SystemCronJobLog</param>
	 * <param name="AId"></param>
	 */
	SystemCronJobLog systemCronJobLogSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemCronJobLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemCronJobLog> systemCronJobLogSelectObjects(SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemCronJobLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemCronJobLogQuerySelectObjectsCount(SystemCronJobLogExample systemCronJobLogQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要插入的新对象</param>
	 */
	int systemExceptionLogInsert(SystemExceptionLog systemExceptionLog) throws CacheException;
	
	/**
	 * <param name="systemExceptionLog">从数据库中删除一个对象SystemExceptionLog</param>
	 * <param name="AId"></param>
	 */
	int systemExceptionLogDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemExceptionLog">从数据库中删除一个对象SystemExceptionLog</param>
	 */
	int systemExceptionLogDeleteByCondition(SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	int systemExceptionLogUpdate(SystemExceptionLog systemExceptionLog) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	int systemExceptionLogUpdateSelective(SystemExceptionLog systemExceptionLog) throws CacheException;
	
	/**
	 * 更新一批对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLogQueryCondition">附加的条件</param>
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	int systemExceptionLogUpdateByCondition(SystemExceptionLog systemExceptionLog, SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLogQueryCondition">附加的条件</param>
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	int systemExceptionLogUpdateSelectiveByCondition(SystemExceptionLog systemExceptionLog, SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException;
	
	String getSystemExceptionLogExampleConditionSql(SystemExceptionLogExample systemExceptionLogQueryCondition);
	
	/**
	 * <param name="systemExceptionLog">从数据库中查询一个对象SystemExceptionLog</param>
	 * <param name="AId"></param>
	 */
	SystemExceptionLog systemExceptionLogSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemExceptionLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemExceptionLog> systemExceptionLogSelectObjects(SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemExceptionLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemExceptionLogQuerySelectObjectsCount(SystemExceptionLogExample systemExceptionLogQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要插入的新对象</param>
	 */
	int systemExtUserRelationInsert(SystemExtUserRelation systemExtUserRelation) throws CacheException;
	
	/**
	 * <param name="systemExtUserRelation">从数据库中删除一个对象SystemExtUserRelation</param>
	 * <param name="AId">PK</param>
	 */
	int systemExtUserRelationDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemExtUserRelation">从数据库中删除一个对象SystemExtUserRelation</param>
	 */
	int systemExtUserRelationDeleteByCondition(SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	int systemExtUserRelationUpdate(SystemExtUserRelation systemExtUserRelation) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	int systemExtUserRelationUpdateSelective(SystemExtUserRelation systemExtUserRelation) throws CacheException;
	
	/**
	 * 更新一批对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelationQueryCondition">附加的条件</param>
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	int systemExtUserRelationUpdateByCondition(SystemExtUserRelation systemExtUserRelation, SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelationQueryCondition">附加的条件</param>
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	int systemExtUserRelationUpdateSelectiveByCondition(SystemExtUserRelation systemExtUserRelation, SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException;
	
	String getSystemExtUserRelationExampleConditionSql(SystemExtUserRelationExample systemExtUserRelationQueryCondition);
	
	/**
	 * <param name="systemExtUserRelation">从数据库中查询一个对象SystemExtUserRelation</param>
	 * <param name="AId">PK</param>
	 */
	SystemExtUserRelation systemExtUserRelationSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemExtUserRelationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemExtUserRelation> systemExtUserRelationSelectObjects(SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemExtUserRelationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemExtUserRelationQuerySelectObjectsCount(SystemExtUserRelationExample systemExtUserRelationQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要插入的新对象</param>
	 */
	int systemHisMsgPushDetailInsert(SystemHisMsgPushDetail systemHisMsgPushDetail) throws CacheException;
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中删除一个对象SystemHisMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	int systemHisMsgPushDetailDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中删除一个对象SystemHisMsgPushDetail</param>
	 */
	int systemHisMsgPushDetailDeleteByCondition(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	int systemHisMsgPushDetailUpdate(SystemHisMsgPushDetail systemHisMsgPushDetail) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	int systemHisMsgPushDetailUpdateSelective(SystemHisMsgPushDetail systemHisMsgPushDetail) throws CacheException;
	
	/**
	 * 更新一批对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetailQueryCondition">附加的条件</param>
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	int systemHisMsgPushDetailUpdateByCondition(SystemHisMsgPushDetail systemHisMsgPushDetail, SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetailQueryCondition">附加的条件</param>
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	int systemHisMsgPushDetailUpdateSelectiveByCondition(SystemHisMsgPushDetail systemHisMsgPushDetail, SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException;
	
	String getSystemHisMsgPushDetailExampleConditionSql(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition);
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中查询一个对象SystemHisMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	SystemHisMsgPushDetail systemHisMsgPushDetailSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemHisMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemHisMsgPushDetail> systemHisMsgPushDetailSelectObjects(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemHisMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemHisMsgPushDetailQuerySelectObjectsCount(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要插入的新对象</param>
	 */
	int systemHisMsgPushTaskInsert(SystemHisMsgPushTask systemHisMsgPushTask) throws CacheException;
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中删除一个对象SystemHisMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	int systemHisMsgPushTaskDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中删除一个对象SystemHisMsgPushTask</param>
	 */
	int systemHisMsgPushTaskDeleteByCondition(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	int systemHisMsgPushTaskUpdate(SystemHisMsgPushTask systemHisMsgPushTask) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	int systemHisMsgPushTaskUpdateSelective(SystemHisMsgPushTask systemHisMsgPushTask) throws CacheException;
	
	/**
	 * 更新一批对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTaskQueryCondition">附加的条件</param>
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	int systemHisMsgPushTaskUpdateByCondition(SystemHisMsgPushTask systemHisMsgPushTask, SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTaskQueryCondition">附加的条件</param>
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	int systemHisMsgPushTaskUpdateSelectiveByCondition(SystemHisMsgPushTask systemHisMsgPushTask, SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException;
	
	String getSystemHisMsgPushTaskExampleConditionSql(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition);
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中查询一个对象SystemHisMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	SystemHisMsgPushTask systemHisMsgPushTaskSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemHisMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemHisMsgPushTask> systemHisMsgPushTaskSelectObjects(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemHisMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemHisMsgPushTaskQuerySelectObjectsCount(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要插入的新对象</param>
	 */
	int systemMsgPushDetailInsert(SystemMsgPushDetail systemMsgPushDetail) throws CacheException;
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中删除一个对象SystemMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	int systemMsgPushDetailDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中删除一个对象SystemMsgPushDetail</param>
	 */
	int systemMsgPushDetailDeleteByCondition(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	int systemMsgPushDetailUpdate(SystemMsgPushDetail systemMsgPushDetail) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	int systemMsgPushDetailUpdateSelective(SystemMsgPushDetail systemMsgPushDetail) throws CacheException;
	
	/**
	 * 更新一批对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetailQueryCondition">附加的条件</param>
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	int systemMsgPushDetailUpdateByCondition(SystemMsgPushDetail systemMsgPushDetail, SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetailQueryCondition">附加的条件</param>
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	int systemMsgPushDetailUpdateSelectiveByCondition(SystemMsgPushDetail systemMsgPushDetail, SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException;
	
	String getSystemMsgPushDetailExampleConditionSql(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition);
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中查询一个对象SystemMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	SystemMsgPushDetail systemMsgPushDetailSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemMsgPushDetail> systemMsgPushDetailSelectObjects(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemMsgPushDetailQuerySelectObjectsCount(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要插入的新对象</param>
	 */
	int systemMsgPushTaskInsert(SystemMsgPushTask systemMsgPushTask) throws CacheException;
	
	/**
	 * <param name="systemMsgPushTask">从数据库中删除一个对象SystemMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	int systemMsgPushTaskDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemMsgPushTask">从数据库中删除一个对象SystemMsgPushTask</param>
	 */
	int systemMsgPushTaskDeleteByCondition(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	int systemMsgPushTaskUpdate(SystemMsgPushTask systemMsgPushTask) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	int systemMsgPushTaskUpdateSelective(SystemMsgPushTask systemMsgPushTask) throws CacheException;
	
	/**
	 * 更新一批对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTaskQueryCondition">附加的条件</param>
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	int systemMsgPushTaskUpdateByCondition(SystemMsgPushTask systemMsgPushTask, SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTaskQueryCondition">附加的条件</param>
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	int systemMsgPushTaskUpdateSelectiveByCondition(SystemMsgPushTask systemMsgPushTask, SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException;
	
	String getSystemMsgPushTaskExampleConditionSql(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition);
	
	/**
	 * <param name="systemMsgPushTask">从数据库中查询一个对象SystemMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	SystemMsgPushTask systemMsgPushTaskSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemMsgPushTask> systemMsgPushTaskSelectObjects(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemMsgPushTaskQuerySelectObjectsCount(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要插入的新对象</param>
	 */
	int systemMsgSendInsert(SystemMsgSend systemMsgSend) throws CacheException;
	
	/**
	 * <param name="systemMsgSend">从数据库中删除一个对象SystemMsgSend</param>
	 * <param name="AId">主键</param>
	 */
	int systemMsgSendDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemMsgSend">从数据库中删除一个对象SystemMsgSend</param>
	 */
	int systemMsgSendDeleteByCondition(SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	int systemMsgSendUpdate(SystemMsgSend systemMsgSend) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	int systemMsgSendUpdateSelective(SystemMsgSend systemMsgSend) throws CacheException;
	
	/**
	 * 更新一批对象SystemMsgSend到数据库中
	 * <param name="systemMsgSendQueryCondition">附加的条件</param>
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	int systemMsgSendUpdateByCondition(SystemMsgSend systemMsgSend, SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemMsgSend到数据库中
	 * <param name="systemMsgSendQueryCondition">附加的条件</param>
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	int systemMsgSendUpdateSelectiveByCondition(SystemMsgSend systemMsgSend, SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException;
	
	String getSystemMsgSendExampleConditionSql(SystemMsgSendExample systemMsgSendQueryCondition);
	
	/**
	 * <param name="systemMsgSend">从数据库中查询一个对象SystemMsgSend</param>
	 * <param name="AId">主键</param>
	 */
	SystemMsgSend systemMsgSendSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemMsgSendQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemMsgSend> systemMsgSendSelectObjects(SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemMsgSendQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemMsgSendQuerySelectObjectsCount(SystemMsgSendExample systemMsgSendQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemParam到数据库中
	 * <param name="systemParam">需要插入的新对象</param>
	 */
	int systemParamInsert(SystemParam systemParam) throws CacheException;
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 * <param name="ASystemParamKey">对象参数表,存放所有系统的参数 主键类</param>
	 */
	int systemParamDeleteByPrimaryKey(SystemParamKey ASystemParamKey) throws CacheException;
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 */
	int systemParamDeleteByCondition(SystemParamExample systemParamQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	int systemParamUpdate(SystemParam systemParam) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	int systemParamUpdateSelective(SystemParam systemParam) throws CacheException;
	
	/**
	 * 更新一批对象SystemParam到数据库中
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	int systemParamUpdateByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemParam到数据库中
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	int systemParamUpdateSelectiveByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) throws CacheException;
	
	String getSystemParamExampleConditionSql(SystemParamExample systemParamQueryCondition);
	
	/**
	 * <param name="systemParam">从数据库中查询一个对象SystemParam</param>
	 * <param name="ASystemParamKey">对象参数表,存放所有系统的参数 主键类</param>
	 */
	SystemParam systemParamSelectByPrimaryKey(SystemParamKey ASystemParamKey) throws CacheException;
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemParam> systemParamSelectObjects(SystemParamExample systemParamQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemParamQuerySelectObjectsCount(SystemParamExample systemParamQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要插入的新对象</param>
	 */
	int systemPrivilegeInsert(SystemPrivilege systemPrivilege) throws CacheException;
	
	/**
	 * <param name="systemPrivilege">从数据库中删除一个对象SystemPrivilege</param>
	 * <param name="AFuncPrivilege">功能权限值</param>
	 */
	int systemPrivilegeDeleteByPrimaryKey(int AFuncPrivilege) throws CacheException;
	
	/**
	 * <param name="systemPrivilege">从数据库中删除一个对象SystemPrivilege</param>
	 */
	int systemPrivilegeDeleteByCondition(SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	int systemPrivilegeUpdate(SystemPrivilege systemPrivilege) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	int systemPrivilegeUpdateSelective(SystemPrivilege systemPrivilege) throws CacheException;
	
	/**
	 * 更新一批对象SystemPrivilege到数据库中
	 * <param name="systemPrivilegeQueryCondition">附加的条件</param>
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	int systemPrivilegeUpdateByCondition(SystemPrivilege systemPrivilege, SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemPrivilege到数据库中
	 * <param name="systemPrivilegeQueryCondition">附加的条件</param>
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	int systemPrivilegeUpdateSelectiveByCondition(SystemPrivilege systemPrivilege, SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException;
	
	String getSystemPrivilegeExampleConditionSql(SystemPrivilegeExample systemPrivilegeQueryCondition);
	
	/**
	 * <param name="systemPrivilege">从数据库中查询一个对象SystemPrivilege</param>
	 * <param name="AFuncPrivilege">功能权限值</param>
	 */
	SystemPrivilege systemPrivilegeSelectByPrimaryKey(int AFuncPrivilege) throws CacheException;
	
	/**
	 * <param name="systemPrivilegeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemPrivilege> systemPrivilegeSelectObjects(SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemPrivilegeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemPrivilegeQuerySelectObjectsCount(SystemPrivilegeExample systemPrivilegeQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemRoles到数据库中
	 * <param name="systemRoles">需要插入的新对象</param>
	 */
	int systemRolesInsert(SystemRoles systemRoles) throws CacheException;
	
	/**
	 * <param name="systemRoles">从数据库中删除一个对象SystemRoles</param>
	 * <param name="AId">角色标识</param>
	 */
	int systemRolesDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemRoles">从数据库中删除一个对象SystemRoles</param>
	 */
	int systemRolesDeleteByCondition(SystemRolesExample systemRolesQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemRoles到数据库中
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	int systemRolesUpdate(SystemRoles systemRoles) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemRoles到数据库中
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	int systemRolesUpdateSelective(SystemRoles systemRoles) throws CacheException;
	
	/**
	 * 更新一批对象SystemRoles到数据库中
	 * <param name="systemRolesQueryCondition">附加的条件</param>
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	int systemRolesUpdateByCondition(SystemRoles systemRoles, SystemRolesExample systemRolesQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemRoles到数据库中
	 * <param name="systemRolesQueryCondition">附加的条件</param>
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	int systemRolesUpdateSelectiveByCondition(SystemRoles systemRoles, SystemRolesExample systemRolesQueryCondition) throws CacheException;
	
	String getSystemRolesExampleConditionSql(SystemRolesExample systemRolesQueryCondition);
	
	/**
	 * <param name="systemRoles">从数据库中查询一个对象SystemRoles</param>
	 * <param name="AId">角色标识</param>
	 */
	SystemRoles systemRolesSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemRoles> systemRolesSelectObjects(SystemRolesExample systemRolesQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemRolesQuerySelectObjectsCount(SystemRolesExample systemRolesQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要插入的新对象</param>
	 */
	int systemValidInfoInsert(SystemValidInfo systemValidInfo) throws CacheException;
	
	/**
	 * <param name="systemValidInfo">从数据库中删除一个对象SystemValidInfo</param>
	 * <param name="AId">PK</param>
	 */
	int systemValidInfoDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemValidInfo">从数据库中删除一个对象SystemValidInfo</param>
	 */
	int systemValidInfoDeleteByCondition(SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	int systemValidInfoUpdate(SystemValidInfo systemValidInfo) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	int systemValidInfoUpdateSelective(SystemValidInfo systemValidInfo) throws CacheException;
	
	/**
	 * 更新一批对象SystemValidInfo到数据库中
	 * <param name="systemValidInfoQueryCondition">附加的条件</param>
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	int systemValidInfoUpdateByCondition(SystemValidInfo systemValidInfo, SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemValidInfo到数据库中
	 * <param name="systemValidInfoQueryCondition">附加的条件</param>
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	int systemValidInfoUpdateSelectiveByCondition(SystemValidInfo systemValidInfo, SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException;
	
	String getSystemValidInfoExampleConditionSql(SystemValidInfoExample systemValidInfoQueryCondition);
	
	/**
	 * <param name="systemValidInfo">从数据库中查询一个对象SystemValidInfo</param>
	 * <param name="AId">PK</param>
	 */
	SystemValidInfo systemValidInfoSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemValidInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemValidInfo> systemValidInfoSelectObjects(SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemValidInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemValidInfoQuerySelectObjectsCount(SystemValidInfoExample systemValidInfoQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要插入的新对象</param>
	 */
	int systemVisitLogInsert(SystemVisitLog systemVisitLog) throws CacheException;
	
	/**
	 * <param name="systemVisitLog">从数据库中删除一个对象SystemVisitLog</param>
	 * <param name="AId">标识</param>
	 */
	int systemVisitLogDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemVisitLog">从数据库中删除一个对象SystemVisitLog</param>
	 */
	int systemVisitLogDeleteByCondition(SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	int systemVisitLogUpdate(SystemVisitLog systemVisitLog) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	int systemVisitLogUpdateSelective(SystemVisitLog systemVisitLog) throws CacheException;
	
	/**
	 * 更新一批对象SystemVisitLog到数据库中
	 * <param name="systemVisitLogQueryCondition">附加的条件</param>
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	int systemVisitLogUpdateByCondition(SystemVisitLog systemVisitLog, SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemVisitLog到数据库中
	 * <param name="systemVisitLogQueryCondition">附加的条件</param>
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	int systemVisitLogUpdateSelectiveByCondition(SystemVisitLog systemVisitLog, SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException;
	
	String getSystemVisitLogExampleConditionSql(SystemVisitLogExample systemVisitLogQueryCondition);
	
	/**
	 * <param name="systemVisitLog">从数据库中查询一个对象SystemVisitLog</param>
	 * <param name="AId">标识</param>
	 */
	SystemVisitLog systemVisitLogSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemVisitLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemVisitLog> systemVisitLogSelectObjects(SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemVisitLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemVisitLogQuerySelectObjectsCount(SystemVisitLogExample systemVisitLogQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要插入的新对象</param>
	 */
	int systemVisitMessageInsert(SystemVisitMessage systemVisitMessage) throws CacheException;
	
	/**
	 * <param name="systemVisitMessage">从数据库中删除一个对象SystemVisitMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	int systemVisitMessageDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemVisitMessage">从数据库中删除一个对象SystemVisitMessage</param>
	 */
	int systemVisitMessageDeleteByCondition(SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	int systemVisitMessageUpdate(SystemVisitMessage systemVisitMessage) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	int systemVisitMessageUpdateSelective(SystemVisitMessage systemVisitMessage) throws CacheException;
	
	/**
	 * 更新一批对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessageQueryCondition">附加的条件</param>
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	int systemVisitMessageUpdateByCondition(SystemVisitMessage systemVisitMessage, SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessageQueryCondition">附加的条件</param>
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	int systemVisitMessageUpdateSelectiveByCondition(SystemVisitMessage systemVisitMessage, SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException;
	
	String getSystemVisitMessageExampleConditionSql(SystemVisitMessageExample systemVisitMessageQueryCondition);
	
	/**
	 * <param name="systemVisitMessage">从数据库中查询一个对象SystemVisitMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	SystemVisitMessage systemVisitMessageSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemVisitMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemVisitMessage> systemVisitMessageSelectObjects(SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemVisitMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemVisitMessageQuerySelectObjectsCount(SystemVisitMessageExample systemVisitMessageQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要插入的新对象</param>
	 */
	int systemWhiteListInsert(SystemWhiteList systemWhiteList) throws CacheException;
	
	/**
	 * <param name="systemWhiteList">从数据库中删除一个对象SystemWhiteList</param>
	 * <param name="AId">主键</param>
	 */
	int systemWhiteListDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemWhiteList">从数据库中删除一个对象SystemWhiteList</param>
	 */
	int systemWhiteListDeleteByCondition(SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	int systemWhiteListUpdate(SystemWhiteList systemWhiteList) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	int systemWhiteListUpdateSelective(SystemWhiteList systemWhiteList) throws CacheException;
	
	/**
	 * 更新一批对象SystemWhiteList到数据库中
	 * <param name="systemWhiteListQueryCondition">附加的条件</param>
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	int systemWhiteListUpdateByCondition(SystemWhiteList systemWhiteList, SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象SystemWhiteList到数据库中
	 * <param name="systemWhiteListQueryCondition">附加的条件</param>
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	int systemWhiteListUpdateSelectiveByCondition(SystemWhiteList systemWhiteList, SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException;
	
	String getSystemWhiteListExampleConditionSql(SystemWhiteListExample systemWhiteListQueryCondition);
	
	/**
	 * <param name="systemWhiteList">从数据库中查询一个对象SystemWhiteList</param>
	 * <param name="AId">主键</param>
	 */
	SystemWhiteList systemWhiteListSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="systemWhiteListQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<SystemWhiteList> systemWhiteListSelectObjects(SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException;
	
	/**
	 * <param name="systemWhiteListQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int systemWhiteListQuerySelectObjectsCount(SystemWhiteListExample systemWhiteListQueryCondition) throws CacheException;
	
	String getVSystemMsgPushDetailExampleConditionSql(VSystemMsgPushDetailExample vSystemMsgPushDetailQueryCondition);
	
	/**
	 * <param name="vSystemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VSystemMsgPushDetail> vSystemMsgPushDetailSelectObjects(VSystemMsgPushDetailExample vSystemMsgPushDetailQueryCondition) throws CacheException;
	
	/**
	 * <param name="vSystemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vSystemMsgPushDetailQuerySelectObjectsCount(VSystemMsgPushDetailExample vSystemMsgPushDetailQueryCondition) throws CacheException;
	
	String getVSystemMsgPushTaskExampleConditionSql(VSystemMsgPushTaskExample vSystemMsgPushTaskQueryCondition);
	
	/**
	 * <param name="vSystemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VSystemMsgPushTask> vSystemMsgPushTaskSelectObjects(VSystemMsgPushTaskExample vSystemMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * <param name="vSystemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vSystemMsgPushTaskQuerySelectObjectsCount(VSystemMsgPushTaskExample vSystemMsgPushTaskQueryCondition) throws CacheException;
	
	/**
	 * 简单的日志接口,调用Dao
	 * <param name="tableName">表名称</param>
	 * <param name="operateName">操作名称</param>
	 * <param name="keyFieldName">主键字段名</param>
	 * <param name="keyFieldValue">主键字段值</param>
	 * <param name="param">附加参数</param>
	 * <param name="updateCount">更新数量</param>
	 */
	void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param, int updateCount);
	
	/**
	 * 根据表名决定是否需要使用缓存
	 * <param name="tableName">原始表名称</param>
	 */
	Boolean needCache(String tableName);
	
	/**
	 * 获得缓存服务
	 */
	Cache getCache();
}
