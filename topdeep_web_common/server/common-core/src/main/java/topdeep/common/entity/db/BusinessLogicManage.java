package topdeep.common.entity.db;
import java.util.*;
import common.util.*;
import java.sql.*;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import common.cache2.*;
/**
 * 基本的逻辑应用层代码，可扩展
 */
public abstract class BusinessLogicManage extends SqlSessionDaoSupport {
	
	/**
	 * 插入一个对象SystemAdmin到数据库中
	 * <param name="SystemAdmin">需要插入的SystemAdmin</param>
	 */
	protected int systemAdminInsert(SystemAdmin systemAdmin) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		return mapperImpl.insertSelective(systemAdmin);
	}
	
	/**
	 * 更新一个对象SystemAdmin到数据库中
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	protected int systemAdminUpdate(SystemAdmin systemAdmin) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemAdmin);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemAdmin到数据库中
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 */
	protected int systemAdminUpdateSelective(SystemAdmin systemAdmin) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemAdmin);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemAdmin到数据库中
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 * <param name="systemAdminQueryCondition">附加的条件</param>
	 */
	protected int systemAdminUpdateByCondition(SystemAdmin systemAdmin, SystemAdminExample systemAdminQueryCondition) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		int ret = mapperImpl.updateByExample(systemAdmin, systemAdminQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemAdmin到数据库中
	 * <param name="systemAdmin">需要更新的SystemAdmin</param>
	 * <param name="systemAdminQueryCondition">附加的条件</param>
	 */
	protected int systemAdminUpdateSelectiveByCondition(SystemAdmin systemAdmin, SystemAdminExample systemAdminQueryCondition) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemAdmin, systemAdminQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemAdmin">从数据库中删除一个对象SystemAdmin</param>
	 * <param name="AId">操作员标识</param>
	 */
	protected int systemAdminDeleteByPrimaryKey(String AId) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemAdmin">从数据库中删除一个对象SystemAdmin</param>
	 */
	protected int systemAdminDeleteByCondition(SystemAdminExample systemAdminQueryCondition) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		return mapperImpl.deleteByExample(systemAdminQueryCondition);
	}
	
	/**
	 * <param name="systemAdmin">从数据库中查询一个对象SystemAdmin</param>
	 * <param name="AId">操作员标识</param>
	 */
	protected SystemAdmin systemAdminSelectByPrimaryKey(String AId) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemAdminQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemAdmin> systemAdminSelectObjects(SystemAdminExample systemAdminQueryCondition) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		return mapperImpl.selectByExample(systemAdminQueryCondition);
	}
	
	/**
	 * <param name="systemAdminQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemAdminQuerySelectObjectsCount(SystemAdminExample systemAdminQueryCondition) {
		SystemAdminMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminMapper.class);
		return mapperImpl.countByExample(systemAdminQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemAdminLog到数据库中
	 * <param name="SystemAdminLog">需要插入的SystemAdminLog</param>
	 */
	protected int systemAdminLogInsert(SystemAdminLog systemAdminLog) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		return mapperImpl.insertSelective(systemAdminLog);
	}
	
	/**
	 * 更新一个对象SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	protected int systemAdminLogUpdate(SystemAdminLog systemAdminLog) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemAdminLog);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 */
	protected int systemAdminLogUpdateSelective(SystemAdminLog systemAdminLog) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemAdminLog);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 * <param name="systemAdminLogQueryCondition">附加的条件</param>
	 */
	protected int systemAdminLogUpdateByCondition(SystemAdminLog systemAdminLog, SystemAdminLogExample systemAdminLogQueryCondition) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		int ret = mapperImpl.updateByExample(systemAdminLog, systemAdminLogQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemAdminLog到数据库中
	 * <param name="systemAdminLog">需要更新的SystemAdminLog</param>
	 * <param name="systemAdminLogQueryCondition">附加的条件</param>
	 */
	protected int systemAdminLogUpdateSelectiveByCondition(SystemAdminLog systemAdminLog, SystemAdminLogExample systemAdminLogQueryCondition) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemAdminLog, systemAdminLogQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemAdminLog">从数据库中删除一个对象SystemAdminLog</param>
	 * <param name="AAdminLogId">操作员日志标识</param>
	 */
	protected int systemAdminLogDeleteByPrimaryKey(String AAdminLogId) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		return mapperImpl.deleteByPrimaryKey(AAdminLogId);
	}
	
	/**
	 * <param name="systemAdminLog">从数据库中删除一个对象SystemAdminLog</param>
	 */
	protected int systemAdminLogDeleteByCondition(SystemAdminLogExample systemAdminLogQueryCondition) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		return mapperImpl.deleteByExample(systemAdminLogQueryCondition);
	}
	
	/**
	 * <param name="systemAdminLog">从数据库中查询一个对象SystemAdminLog</param>
	 * <param name="AAdminLogId">操作员日志标识</param>
	 */
	protected SystemAdminLog systemAdminLogSelectByPrimaryKey(String AAdminLogId) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		return mapperImpl.selectByPrimaryKey(AAdminLogId);
	}
	
	/**
	 * <param name="systemAdminLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemAdminLog> systemAdminLogSelectObjects(SystemAdminLogExample systemAdminLogQueryCondition) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		return mapperImpl.selectByExample(systemAdminLogQueryCondition);
	}
	
	/**
	 * <param name="systemAdminLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemAdminLogQuerySelectObjectsCount(SystemAdminLogExample systemAdminLogQueryCondition) {
		SystemAdminLogMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminLogMapper.class);
		return mapperImpl.countByExample(systemAdminLogQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemAdminRoles到数据库中
	 * <param name="SystemAdminRoles">需要插入的SystemAdminRoles</param>
	 */
	protected int systemAdminRolesInsert(SystemAdminRoles systemAdminRoles) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		return mapperImpl.insertSelective(systemAdminRoles);
	}
	
	/**
	 * 更新一个对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	protected int systemAdminRolesUpdate(SystemAdminRoles systemAdminRoles) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemAdminRoles);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 */
	protected int systemAdminRolesUpdateSelective(SystemAdminRoles systemAdminRoles) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemAdminRoles);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 * <param name="systemAdminRolesQueryCondition">附加的条件</param>
	 */
	protected int systemAdminRolesUpdateByCondition(SystemAdminRoles systemAdminRoles, SystemAdminRolesExample systemAdminRolesQueryCondition) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		int ret = mapperImpl.updateByExample(systemAdminRoles, systemAdminRolesQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemAdminRoles到数据库中
	 * <param name="systemAdminRoles">需要更新的SystemAdminRoles</param>
	 * <param name="systemAdminRolesQueryCondition">附加的条件</param>
	 */
	protected int systemAdminRolesUpdateSelectiveByCondition(SystemAdminRoles systemAdminRoles, SystemAdminRolesExample systemAdminRolesQueryCondition) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemAdminRoles, systemAdminRolesQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemAdminRoles">从数据库中删除一个对象SystemAdminRoles</param>
	 * <param name="AId">主键</param>
	 */
	protected int systemAdminRolesDeleteByPrimaryKey(String AId) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemAdminRoles">从数据库中删除一个对象SystemAdminRoles</param>
	 */
	protected int systemAdminRolesDeleteByCondition(SystemAdminRolesExample systemAdminRolesQueryCondition) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		return mapperImpl.deleteByExample(systemAdminRolesQueryCondition);
	}
	
	/**
	 * <param name="systemAdminRoles">从数据库中查询一个对象SystemAdminRoles</param>
	 * <param name="AId">主键</param>
	 */
	protected SystemAdminRoles systemAdminRolesSelectByPrimaryKey(String AId) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemAdminRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemAdminRoles> systemAdminRolesSelectObjects(SystemAdminRolesExample systemAdminRolesQueryCondition) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		return mapperImpl.selectByExample(systemAdminRolesQueryCondition);
	}
	
	/**
	 * <param name="systemAdminRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemAdminRolesQuerySelectObjectsCount(SystemAdminRolesExample systemAdminRolesQueryCondition) {
		SystemAdminRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemAdminRolesMapper.class);
		return mapperImpl.countByExample(systemAdminRolesQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemBaseInfo到数据库中
	 * <param name="SystemBaseInfo">需要插入的SystemBaseInfo</param>
	 */
	protected int systemBaseInfoInsert(SystemBaseInfo systemBaseInfo) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		return mapperImpl.insertSelective(systemBaseInfo);
	}
	
	/**
	 * 更新一个对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	protected int systemBaseInfoUpdate(SystemBaseInfo systemBaseInfo) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemBaseInfo);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 */
	protected int systemBaseInfoUpdateSelective(SystemBaseInfo systemBaseInfo) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemBaseInfo);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 * <param name="systemBaseInfoQueryCondition">附加的条件</param>
	 */
	protected int systemBaseInfoUpdateByCondition(SystemBaseInfo systemBaseInfo, SystemBaseInfoExample systemBaseInfoQueryCondition) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		int ret = mapperImpl.updateByExample(systemBaseInfo, systemBaseInfoQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemBaseInfo到数据库中
	 * <param name="systemBaseInfo">需要更新的SystemBaseInfo</param>
	 * <param name="systemBaseInfoQueryCondition">附加的条件</param>
	 */
	protected int systemBaseInfoUpdateSelectiveByCondition(SystemBaseInfo systemBaseInfo, SystemBaseInfoExample systemBaseInfoQueryCondition) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemBaseInfo, systemBaseInfoQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemBaseInfo">从数据库中删除一个对象SystemBaseInfo</param>
	 * <param name="ASystemBaseInfoKey">系统基本信息表 主键类</param>
	 */
	protected int systemBaseInfoDeleteByPrimaryKey(SystemBaseInfoKey ASystemBaseInfoKey) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		return mapperImpl.deleteByPrimaryKey(ASystemBaseInfoKey);
	}
	
	/**
	 * <param name="systemBaseInfo">从数据库中删除一个对象SystemBaseInfo</param>
	 */
	protected int systemBaseInfoDeleteByCondition(SystemBaseInfoExample systemBaseInfoQueryCondition) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		return mapperImpl.deleteByExample(systemBaseInfoQueryCondition);
	}
	
	/**
	 * <param name="systemBaseInfo">从数据库中查询一个对象SystemBaseInfo</param>
	 * <param name="ASystemBaseInfoKey">系统基本信息表 主键类</param>
	 */
	protected SystemBaseInfo systemBaseInfoSelectByPrimaryKey(SystemBaseInfoKey ASystemBaseInfoKey) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		return mapperImpl.selectByPrimaryKey(ASystemBaseInfoKey);
	}
	
	/**
	 * <param name="systemBaseInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemBaseInfo> systemBaseInfoSelectObjects(SystemBaseInfoExample systemBaseInfoQueryCondition) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		return mapperImpl.selectByExample(systemBaseInfoQueryCondition);
	}
	
	/**
	 * <param name="systemBaseInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemBaseInfoQuerySelectObjectsCount(SystemBaseInfoExample systemBaseInfoQueryCondition) {
		SystemBaseInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemBaseInfoMapper.class);
		return mapperImpl.countByExample(systemBaseInfoQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemClientActivation到数据库中
	 * <param name="SystemClientActivation">需要插入的SystemClientActivation</param>
	 */
	protected int systemClientActivationInsert(SystemClientActivation systemClientActivation) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		return mapperImpl.insertSelective(systemClientActivation);
	}
	
	/**
	 * 更新一个对象SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	protected int systemClientActivationUpdate(SystemClientActivation systemClientActivation) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemClientActivation);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 */
	protected int systemClientActivationUpdateSelective(SystemClientActivation systemClientActivation) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemClientActivation);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 * <param name="systemClientActivationQueryCondition">附加的条件</param>
	 */
	protected int systemClientActivationUpdateByCondition(SystemClientActivation systemClientActivation, SystemClientActivationExample systemClientActivationQueryCondition) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		int ret = mapperImpl.updateByExample(systemClientActivation, systemClientActivationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemClientActivation到数据库中
	 * <param name="systemClientActivation">需要更新的SystemClientActivation</param>
	 * <param name="systemClientActivationQueryCondition">附加的条件</param>
	 */
	protected int systemClientActivationUpdateSelectiveByCondition(SystemClientActivation systemClientActivation, SystemClientActivationExample systemClientActivationQueryCondition) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemClientActivation, systemClientActivationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemClientActivation">从数据库中删除一个对象SystemClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	protected int systemClientActivationDeleteByPrimaryKey(String AId) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemClientActivation">从数据库中删除一个对象SystemClientActivation</param>
	 */
	protected int systemClientActivationDeleteByCondition(SystemClientActivationExample systemClientActivationQueryCondition) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		return mapperImpl.deleteByExample(systemClientActivationQueryCondition);
	}
	
	/**
	 * <param name="systemClientActivation">从数据库中查询一个对象SystemClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	protected SystemClientActivation systemClientActivationSelectByPrimaryKey(String AId) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemClientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemClientActivation> systemClientActivationSelectObjects(SystemClientActivationExample systemClientActivationQueryCondition) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		return mapperImpl.selectByExample(systemClientActivationQueryCondition);
	}
	
	/**
	 * <param name="systemClientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemClientActivationQuerySelectObjectsCount(SystemClientActivationExample systemClientActivationQueryCondition) {
		SystemClientActivationMapper mapperImpl = this.getSqlSession().getMapper(SystemClientActivationMapper.class);
		return mapperImpl.countByExample(systemClientActivationQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemClientTrack到数据库中
	 * <param name="SystemClientTrack">需要插入的SystemClientTrack</param>
	 */
	protected int systemClientTrackInsert(SystemClientTrack systemClientTrack) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		return mapperImpl.insertSelective(systemClientTrack);
	}
	
	/**
	 * 更新一个对象SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	protected int systemClientTrackUpdate(SystemClientTrack systemClientTrack) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemClientTrack);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 */
	protected int systemClientTrackUpdateSelective(SystemClientTrack systemClientTrack) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemClientTrack);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 * <param name="systemClientTrackQueryCondition">附加的条件</param>
	 */
	protected int systemClientTrackUpdateByCondition(SystemClientTrack systemClientTrack, SystemClientTrackExample systemClientTrackQueryCondition) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		int ret = mapperImpl.updateByExample(systemClientTrack, systemClientTrackQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemClientTrack到数据库中
	 * <param name="systemClientTrack">需要更新的SystemClientTrack</param>
	 * <param name="systemClientTrackQueryCondition">附加的条件</param>
	 */
	protected int systemClientTrackUpdateSelectiveByCondition(SystemClientTrack systemClientTrack, SystemClientTrackExample systemClientTrackQueryCondition) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemClientTrack, systemClientTrackQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemClientTrack">从数据库中删除一个对象SystemClientTrack</param>
	 * <param name="AId">PK</param>
	 */
	protected int systemClientTrackDeleteByPrimaryKey(String AId) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemClientTrack">从数据库中删除一个对象SystemClientTrack</param>
	 */
	protected int systemClientTrackDeleteByCondition(SystemClientTrackExample systemClientTrackQueryCondition) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		return mapperImpl.deleteByExample(systemClientTrackQueryCondition);
	}
	
	/**
	 * <param name="systemClientTrack">从数据库中查询一个对象SystemClientTrack</param>
	 * <param name="AId">PK</param>
	 */
	protected SystemClientTrack systemClientTrackSelectByPrimaryKey(String AId) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemClientTrackQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemClientTrack> systemClientTrackSelectObjects(SystemClientTrackExample systemClientTrackQueryCondition) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		return mapperImpl.selectByExample(systemClientTrackQueryCondition);
	}
	
	/**
	 * <param name="systemClientTrackQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemClientTrackQuerySelectObjectsCount(SystemClientTrackExample systemClientTrackQueryCondition) {
		SystemClientTrackMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackMapper.class);
		return mapperImpl.countByExample(systemClientTrackQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemClientTrackDetail到数据库中
	 * <param name="SystemClientTrackDetail">需要插入的SystemClientTrackDetail</param>
	 */
	protected int systemClientTrackDetailInsert(SystemClientTrackDetail systemClientTrackDetail) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		return mapperImpl.insertSelective(systemClientTrackDetail);
	}
	
	/**
	 * 更新一个对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	protected int systemClientTrackDetailUpdate(SystemClientTrackDetail systemClientTrackDetail) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemClientTrackDetail);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 */
	protected int systemClientTrackDetailUpdateSelective(SystemClientTrackDetail systemClientTrackDetail) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemClientTrackDetail);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 * <param name="systemClientTrackDetailQueryCondition">附加的条件</param>
	 */
	protected int systemClientTrackDetailUpdateByCondition(SystemClientTrackDetail systemClientTrackDetail, SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		int ret = mapperImpl.updateByExample(systemClientTrackDetail, systemClientTrackDetailQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemClientTrackDetail到数据库中
	 * <param name="systemClientTrackDetail">需要更新的SystemClientTrackDetail</param>
	 * <param name="systemClientTrackDetailQueryCondition">附加的条件</param>
	 */
	protected int systemClientTrackDetailUpdateSelectiveByCondition(SystemClientTrackDetail systemClientTrackDetail, SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemClientTrackDetail, systemClientTrackDetailQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中删除一个对象SystemClientTrackDetail</param>
	 * <param name="AId">PK</param>
	 */
	protected int systemClientTrackDetailDeleteByPrimaryKey(String AId) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中删除一个对象SystemClientTrackDetail</param>
	 */
	protected int systemClientTrackDetailDeleteByCondition(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		return mapperImpl.deleteByExample(systemClientTrackDetailQueryCondition);
	}
	
	/**
	 * <param name="systemClientTrackDetail">从数据库中查询一个对象SystemClientTrackDetail</param>
	 * <param name="AId">PK</param>
	 */
	protected SystemClientTrackDetail systemClientTrackDetailSelectByPrimaryKey(String AId) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemClientTrackDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemClientTrackDetail> systemClientTrackDetailSelectObjects(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		return mapperImpl.selectByExample(systemClientTrackDetailQueryCondition);
	}
	
	/**
	 * <param name="systemClientTrackDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemClientTrackDetailQuerySelectObjectsCount(SystemClientTrackDetailExample systemClientTrackDetailQueryCondition) {
		SystemClientTrackDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemClientTrackDetailMapper.class);
		return mapperImpl.countByExample(systemClientTrackDetailQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemClientVersion到数据库中
	 * <param name="SystemClientVersion">需要插入的SystemClientVersion</param>
	 */
	protected int systemClientVersionInsert(SystemClientVersion systemClientVersion) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		return mapperImpl.insertSelective(systemClientVersion);
	}
	
	/**
	 * 更新一个对象SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	protected int systemClientVersionUpdate(SystemClientVersion systemClientVersion) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemClientVersion);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 */
	protected int systemClientVersionUpdateSelective(SystemClientVersion systemClientVersion) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemClientVersion);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 * <param name="systemClientVersionQueryCondition">附加的条件</param>
	 */
	protected int systemClientVersionUpdateByCondition(SystemClientVersion systemClientVersion, SystemClientVersionExample systemClientVersionQueryCondition) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		int ret = mapperImpl.updateByExample(systemClientVersion, systemClientVersionQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemClientVersion到数据库中
	 * <param name="systemClientVersion">需要更新的SystemClientVersion</param>
	 * <param name="systemClientVersionQueryCondition">附加的条件</param>
	 */
	protected int systemClientVersionUpdateSelectiveByCondition(SystemClientVersion systemClientVersion, SystemClientVersionExample systemClientVersionQueryCondition) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemClientVersion, systemClientVersionQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemClientVersion">从数据库中删除一个对象SystemClientVersion</param>
	 * <param name="ASystemClientVersionKey">客户端版本控制 主键类</param>
	 */
	protected int systemClientVersionDeleteByPrimaryKey(SystemClientVersionKey ASystemClientVersionKey) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		return mapperImpl.deleteByPrimaryKey(ASystemClientVersionKey);
	}
	
	/**
	 * <param name="systemClientVersion">从数据库中删除一个对象SystemClientVersion</param>
	 */
	protected int systemClientVersionDeleteByCondition(SystemClientVersionExample systemClientVersionQueryCondition) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		return mapperImpl.deleteByExample(systemClientVersionQueryCondition);
	}
	
	/**
	 * <param name="systemClientVersion">从数据库中查询一个对象SystemClientVersion</param>
	 * <param name="ASystemClientVersionKey">客户端版本控制 主键类</param>
	 */
	protected SystemClientVersion systemClientVersionSelectByPrimaryKey(SystemClientVersionKey ASystemClientVersionKey) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		return mapperImpl.selectByPrimaryKey(ASystemClientVersionKey);
	}
	
	/**
	 * <param name="systemClientVersionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemClientVersion> systemClientVersionSelectObjects(SystemClientVersionExample systemClientVersionQueryCondition) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		return mapperImpl.selectByExample(systemClientVersionQueryCondition);
	}
	
	/**
	 * <param name="systemClientVersionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemClientVersionQuerySelectObjectsCount(SystemClientVersionExample systemClientVersionQueryCondition) {
		SystemClientVersionMapper mapperImpl = this.getSqlSession().getMapper(SystemClientVersionMapper.class);
		return mapperImpl.countByExample(systemClientVersionQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemConfig到数据库中
	 * <param name="SystemConfig">需要插入的SystemConfig</param>
	 */
	protected int systemConfigInsert(SystemConfig systemConfig) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		return mapperImpl.insertSelective(systemConfig);
	}
	
	/**
	 * 更新一个对象SystemConfig到数据库中
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	protected int systemConfigUpdate(SystemConfig systemConfig) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemConfig);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemConfig到数据库中
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 */
	protected int systemConfigUpdateSelective(SystemConfig systemConfig) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemConfig);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemConfig到数据库中
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 * <param name="systemConfigQueryCondition">附加的条件</param>
	 */
	protected int systemConfigUpdateByCondition(SystemConfig systemConfig, SystemConfigExample systemConfigQueryCondition) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		int ret = mapperImpl.updateByExample(systemConfig, systemConfigQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemConfig到数据库中
	 * <param name="systemConfig">需要更新的SystemConfig</param>
	 * <param name="systemConfigQueryCondition">附加的条件</param>
	 */
	protected int systemConfigUpdateSelectiveByCondition(SystemConfig systemConfig, SystemConfigExample systemConfigQueryCondition) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemConfig, systemConfigQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemConfig">从数据库中删除一个对象SystemConfig</param>
	 * <param name="ASystemConfigKey">系统配置表 主键类</param>
	 */
	protected int systemConfigDeleteByPrimaryKey(SystemConfigKey ASystemConfigKey) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		return mapperImpl.deleteByPrimaryKey(ASystemConfigKey);
	}
	
	/**
	 * <param name="systemConfig">从数据库中删除一个对象SystemConfig</param>
	 */
	protected int systemConfigDeleteByCondition(SystemConfigExample systemConfigQueryCondition) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		return mapperImpl.deleteByExample(systemConfigQueryCondition);
	}
	
	/**
	 * <param name="systemConfig">从数据库中查询一个对象SystemConfig</param>
	 * <param name="ASystemConfigKey">系统配置表 主键类</param>
	 */
	protected SystemConfig systemConfigSelectByPrimaryKey(SystemConfigKey ASystemConfigKey) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		return mapperImpl.selectByPrimaryKey(ASystemConfigKey);
	}
	
	/**
	 * <param name="systemConfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemConfig> systemConfigSelectObjects(SystemConfigExample systemConfigQueryCondition) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		return mapperImpl.selectByExample(systemConfigQueryCondition);
	}
	
	/**
	 * <param name="systemConfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemConfigQuerySelectObjectsCount(SystemConfigExample systemConfigQueryCondition) {
		SystemConfigMapper mapperImpl = this.getSqlSession().getMapper(SystemConfigMapper.class);
		return mapperImpl.countByExample(systemConfigQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemCronJob到数据库中
	 * <param name="SystemCronJob">需要插入的SystemCronJob</param>
	 */
	protected int systemCronJobInsert(SystemCronJob systemCronJob) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		return mapperImpl.insertSelective(systemCronJob);
	}
	
	/**
	 * 更新一个对象SystemCronJob到数据库中
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	protected int systemCronJobUpdate(SystemCronJob systemCronJob) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemCronJob);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemCronJob到数据库中
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 */
	protected int systemCronJobUpdateSelective(SystemCronJob systemCronJob) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemCronJob);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemCronJob到数据库中
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 * <param name="systemCronJobQueryCondition">附加的条件</param>
	 */
	protected int systemCronJobUpdateByCondition(SystemCronJob systemCronJob, SystemCronJobExample systemCronJobQueryCondition) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		int ret = mapperImpl.updateByExample(systemCronJob, systemCronJobQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemCronJob到数据库中
	 * <param name="systemCronJob">需要更新的SystemCronJob</param>
	 * <param name="systemCronJobQueryCondition">附加的条件</param>
	 */
	protected int systemCronJobUpdateSelectiveByCondition(SystemCronJob systemCronJob, SystemCronJobExample systemCronJobQueryCondition) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemCronJob, systemCronJobQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemCronJob">从数据库中删除一个对象SystemCronJob</param>
	 * <param name="AId"></param>
	 */
	protected int systemCronJobDeleteByPrimaryKey(String AId) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemCronJob">从数据库中删除一个对象SystemCronJob</param>
	 */
	protected int systemCronJobDeleteByCondition(SystemCronJobExample systemCronJobQueryCondition) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		return mapperImpl.deleteByExample(systemCronJobQueryCondition);
	}
	
	/**
	 * <param name="systemCronJob">从数据库中查询一个对象SystemCronJob</param>
	 * <param name="AId"></param>
	 */
	protected SystemCronJob systemCronJobSelectByPrimaryKey(String AId) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemCronJobQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemCronJob> systemCronJobSelectObjects(SystemCronJobExample systemCronJobQueryCondition) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		return mapperImpl.selectByExample(systemCronJobQueryCondition);
	}
	
	/**
	 * <param name="systemCronJobQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemCronJobQuerySelectObjectsCount(SystemCronJobExample systemCronJobQueryCondition) {
		SystemCronJobMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobMapper.class);
		return mapperImpl.countByExample(systemCronJobQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemCronJobLog到数据库中
	 * <param name="SystemCronJobLog">需要插入的SystemCronJobLog</param>
	 */
	protected int systemCronJobLogInsert(SystemCronJobLog systemCronJobLog) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		return mapperImpl.insertSelective(systemCronJobLog);
	}
	
	/**
	 * 更新一个对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	protected int systemCronJobLogUpdate(SystemCronJobLog systemCronJobLog) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemCronJobLog);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 */
	protected int systemCronJobLogUpdateSelective(SystemCronJobLog systemCronJobLog) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemCronJobLog);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 * <param name="systemCronJobLogQueryCondition">附加的条件</param>
	 */
	protected int systemCronJobLogUpdateByCondition(SystemCronJobLog systemCronJobLog, SystemCronJobLogExample systemCronJobLogQueryCondition) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		int ret = mapperImpl.updateByExample(systemCronJobLog, systemCronJobLogQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemCronJobLog到数据库中
	 * <param name="systemCronJobLog">需要更新的SystemCronJobLog</param>
	 * <param name="systemCronJobLogQueryCondition">附加的条件</param>
	 */
	protected int systemCronJobLogUpdateSelectiveByCondition(SystemCronJobLog systemCronJobLog, SystemCronJobLogExample systemCronJobLogQueryCondition) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemCronJobLog, systemCronJobLogQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemCronJobLog">从数据库中删除一个对象SystemCronJobLog</param>
	 * <param name="AId"></param>
	 */
	protected int systemCronJobLogDeleteByPrimaryKey(String AId) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemCronJobLog">从数据库中删除一个对象SystemCronJobLog</param>
	 */
	protected int systemCronJobLogDeleteByCondition(SystemCronJobLogExample systemCronJobLogQueryCondition) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		return mapperImpl.deleteByExample(systemCronJobLogQueryCondition);
	}
	
	/**
	 * <param name="systemCronJobLog">从数据库中查询一个对象SystemCronJobLog</param>
	 * <param name="AId"></param>
	 */
	protected SystemCronJobLog systemCronJobLogSelectByPrimaryKey(String AId) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemCronJobLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemCronJobLog> systemCronJobLogSelectObjects(SystemCronJobLogExample systemCronJobLogQueryCondition) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		return mapperImpl.selectByExample(systemCronJobLogQueryCondition);
	}
	
	/**
	 * <param name="systemCronJobLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemCronJobLogQuerySelectObjectsCount(SystemCronJobLogExample systemCronJobLogQueryCondition) {
		SystemCronJobLogMapper mapperImpl = this.getSqlSession().getMapper(SystemCronJobLogMapper.class);
		return mapperImpl.countByExample(systemCronJobLogQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemExceptionLog到数据库中
	 * <param name="SystemExceptionLog">需要插入的SystemExceptionLog</param>
	 */
	protected int systemExceptionLogInsert(SystemExceptionLog systemExceptionLog) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		return mapperImpl.insertSelective(systemExceptionLog);
	}
	
	/**
	 * 更新一个对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	protected int systemExceptionLogUpdate(SystemExceptionLog systemExceptionLog) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemExceptionLog);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 */
	protected int systemExceptionLogUpdateSelective(SystemExceptionLog systemExceptionLog) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemExceptionLog);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 * <param name="systemExceptionLogQueryCondition">附加的条件</param>
	 */
	protected int systemExceptionLogUpdateByCondition(SystemExceptionLog systemExceptionLog, SystemExceptionLogExample systemExceptionLogQueryCondition) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		int ret = mapperImpl.updateByExample(systemExceptionLog, systemExceptionLogQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemExceptionLog到数据库中
	 * <param name="systemExceptionLog">需要更新的SystemExceptionLog</param>
	 * <param name="systemExceptionLogQueryCondition">附加的条件</param>
	 */
	protected int systemExceptionLogUpdateSelectiveByCondition(SystemExceptionLog systemExceptionLog, SystemExceptionLogExample systemExceptionLogQueryCondition) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemExceptionLog, systemExceptionLogQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemExceptionLog">从数据库中删除一个对象SystemExceptionLog</param>
	 * <param name="AId"></param>
	 */
	protected int systemExceptionLogDeleteByPrimaryKey(String AId) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemExceptionLog">从数据库中删除一个对象SystemExceptionLog</param>
	 */
	protected int systemExceptionLogDeleteByCondition(SystemExceptionLogExample systemExceptionLogQueryCondition) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		return mapperImpl.deleteByExample(systemExceptionLogQueryCondition);
	}
	
	/**
	 * <param name="systemExceptionLog">从数据库中查询一个对象SystemExceptionLog</param>
	 * <param name="AId"></param>
	 */
	protected SystemExceptionLog systemExceptionLogSelectByPrimaryKey(String AId) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemExceptionLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemExceptionLog> systemExceptionLogSelectObjects(SystemExceptionLogExample systemExceptionLogQueryCondition) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		return mapperImpl.selectByExample(systemExceptionLogQueryCondition);
	}
	
	/**
	 * <param name="systemExceptionLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemExceptionLogQuerySelectObjectsCount(SystemExceptionLogExample systemExceptionLogQueryCondition) {
		SystemExceptionLogMapper mapperImpl = this.getSqlSession().getMapper(SystemExceptionLogMapper.class);
		return mapperImpl.countByExample(systemExceptionLogQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemExtUserRelation到数据库中
	 * <param name="SystemExtUserRelation">需要插入的SystemExtUserRelation</param>
	 */
	protected int systemExtUserRelationInsert(SystemExtUserRelation systemExtUserRelation) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		return mapperImpl.insertSelective(systemExtUserRelation);
	}
	
	/**
	 * 更新一个对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	protected int systemExtUserRelationUpdate(SystemExtUserRelation systemExtUserRelation) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemExtUserRelation);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 */
	protected int systemExtUserRelationUpdateSelective(SystemExtUserRelation systemExtUserRelation) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemExtUserRelation);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 * <param name="systemExtUserRelationQueryCondition">附加的条件</param>
	 */
	protected int systemExtUserRelationUpdateByCondition(SystemExtUserRelation systemExtUserRelation, SystemExtUserRelationExample systemExtUserRelationQueryCondition) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		int ret = mapperImpl.updateByExample(systemExtUserRelation, systemExtUserRelationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemExtUserRelation到数据库中
	 * <param name="systemExtUserRelation">需要更新的SystemExtUserRelation</param>
	 * <param name="systemExtUserRelationQueryCondition">附加的条件</param>
	 */
	protected int systemExtUserRelationUpdateSelectiveByCondition(SystemExtUserRelation systemExtUserRelation, SystemExtUserRelationExample systemExtUserRelationQueryCondition) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemExtUserRelation, systemExtUserRelationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemExtUserRelation">从数据库中删除一个对象SystemExtUserRelation</param>
	 * <param name="AId">PK</param>
	 */
	protected int systemExtUserRelationDeleteByPrimaryKey(String AId) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemExtUserRelation">从数据库中删除一个对象SystemExtUserRelation</param>
	 */
	protected int systemExtUserRelationDeleteByCondition(SystemExtUserRelationExample systemExtUserRelationQueryCondition) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		return mapperImpl.deleteByExample(systemExtUserRelationQueryCondition);
	}
	
	/**
	 * <param name="systemExtUserRelation">从数据库中查询一个对象SystemExtUserRelation</param>
	 * <param name="AId">PK</param>
	 */
	protected SystemExtUserRelation systemExtUserRelationSelectByPrimaryKey(String AId) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemExtUserRelationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemExtUserRelation> systemExtUserRelationSelectObjects(SystemExtUserRelationExample systemExtUserRelationQueryCondition) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		return mapperImpl.selectByExample(systemExtUserRelationQueryCondition);
	}
	
	/**
	 * <param name="systemExtUserRelationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemExtUserRelationQuerySelectObjectsCount(SystemExtUserRelationExample systemExtUserRelationQueryCondition) {
		SystemExtUserRelationMapper mapperImpl = this.getSqlSession().getMapper(SystemExtUserRelationMapper.class);
		return mapperImpl.countByExample(systemExtUserRelationQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemHisMsgPushDetail到数据库中
	 * <param name="SystemHisMsgPushDetail">需要插入的SystemHisMsgPushDetail</param>
	 */
	protected int systemHisMsgPushDetailInsert(SystemHisMsgPushDetail systemHisMsgPushDetail) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		return mapperImpl.insertSelective(systemHisMsgPushDetail);
	}
	
	/**
	 * 更新一个对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	protected int systemHisMsgPushDetailUpdate(SystemHisMsgPushDetail systemHisMsgPushDetail) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemHisMsgPushDetail);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 */
	protected int systemHisMsgPushDetailUpdateSelective(SystemHisMsgPushDetail systemHisMsgPushDetail) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemHisMsgPushDetail);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 * <param name="systemHisMsgPushDetailQueryCondition">附加的条件</param>
	 */
	protected int systemHisMsgPushDetailUpdateByCondition(SystemHisMsgPushDetail systemHisMsgPushDetail, SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		int ret = mapperImpl.updateByExample(systemHisMsgPushDetail, systemHisMsgPushDetailQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemHisMsgPushDetail到数据库中
	 * <param name="systemHisMsgPushDetail">需要更新的SystemHisMsgPushDetail</param>
	 * <param name="systemHisMsgPushDetailQueryCondition">附加的条件</param>
	 */
	protected int systemHisMsgPushDetailUpdateSelectiveByCondition(SystemHisMsgPushDetail systemHisMsgPushDetail, SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemHisMsgPushDetail, systemHisMsgPushDetailQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中删除一个对象SystemHisMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	protected int systemHisMsgPushDetailDeleteByPrimaryKey(String AId) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中删除一个对象SystemHisMsgPushDetail</param>
	 */
	protected int systemHisMsgPushDetailDeleteByCondition(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		return mapperImpl.deleteByExample(systemHisMsgPushDetailQueryCondition);
	}
	
	/**
	 * <param name="systemHisMsgPushDetail">从数据库中查询一个对象SystemHisMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	protected SystemHisMsgPushDetail systemHisMsgPushDetailSelectByPrimaryKey(String AId) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemHisMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemHisMsgPushDetail> systemHisMsgPushDetailSelectObjects(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		return mapperImpl.selectByExample(systemHisMsgPushDetailQueryCondition);
	}
	
	/**
	 * <param name="systemHisMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemHisMsgPushDetailQuerySelectObjectsCount(SystemHisMsgPushDetailExample systemHisMsgPushDetailQueryCondition) {
		SystemHisMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushDetailMapper.class);
		return mapperImpl.countByExample(systemHisMsgPushDetailQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemHisMsgPushTask到数据库中
	 * <param name="SystemHisMsgPushTask">需要插入的SystemHisMsgPushTask</param>
	 */
	protected int systemHisMsgPushTaskInsert(SystemHisMsgPushTask systemHisMsgPushTask) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		return mapperImpl.insertSelective(systemHisMsgPushTask);
	}
	
	/**
	 * 更新一个对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	protected int systemHisMsgPushTaskUpdate(SystemHisMsgPushTask systemHisMsgPushTask) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemHisMsgPushTask);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 */
	protected int systemHisMsgPushTaskUpdateSelective(SystemHisMsgPushTask systemHisMsgPushTask) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemHisMsgPushTask);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 * <param name="systemHisMsgPushTaskQueryCondition">附加的条件</param>
	 */
	protected int systemHisMsgPushTaskUpdateByCondition(SystemHisMsgPushTask systemHisMsgPushTask, SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		int ret = mapperImpl.updateByExample(systemHisMsgPushTask, systemHisMsgPushTaskQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemHisMsgPushTask到数据库中
	 * <param name="systemHisMsgPushTask">需要更新的SystemHisMsgPushTask</param>
	 * <param name="systemHisMsgPushTaskQueryCondition">附加的条件</param>
	 */
	protected int systemHisMsgPushTaskUpdateSelectiveByCondition(SystemHisMsgPushTask systemHisMsgPushTask, SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemHisMsgPushTask, systemHisMsgPushTaskQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中删除一个对象SystemHisMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	protected int systemHisMsgPushTaskDeleteByPrimaryKey(String AId) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中删除一个对象SystemHisMsgPushTask</param>
	 */
	protected int systemHisMsgPushTaskDeleteByCondition(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		return mapperImpl.deleteByExample(systemHisMsgPushTaskQueryCondition);
	}
	
	/**
	 * <param name="systemHisMsgPushTask">从数据库中查询一个对象SystemHisMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	protected SystemHisMsgPushTask systemHisMsgPushTaskSelectByPrimaryKey(String AId) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemHisMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemHisMsgPushTask> systemHisMsgPushTaskSelectObjects(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		return mapperImpl.selectByExample(systemHisMsgPushTaskQueryCondition);
	}
	
	/**
	 * <param name="systemHisMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemHisMsgPushTaskQuerySelectObjectsCount(SystemHisMsgPushTaskExample systemHisMsgPushTaskQueryCondition) {
		SystemHisMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemHisMsgPushTaskMapper.class);
		return mapperImpl.countByExample(systemHisMsgPushTaskQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemMsgPushDetail到数据库中
	 * <param name="SystemMsgPushDetail">需要插入的SystemMsgPushDetail</param>
	 */
	protected int systemMsgPushDetailInsert(SystemMsgPushDetail systemMsgPushDetail) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		return mapperImpl.insertSelective(systemMsgPushDetail);
	}
	
	/**
	 * 更新一个对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	protected int systemMsgPushDetailUpdate(SystemMsgPushDetail systemMsgPushDetail) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemMsgPushDetail);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 */
	protected int systemMsgPushDetailUpdateSelective(SystemMsgPushDetail systemMsgPushDetail) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemMsgPushDetail);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 * <param name="systemMsgPushDetailQueryCondition">附加的条件</param>
	 */
	protected int systemMsgPushDetailUpdateByCondition(SystemMsgPushDetail systemMsgPushDetail, SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		int ret = mapperImpl.updateByExample(systemMsgPushDetail, systemMsgPushDetailQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemMsgPushDetail到数据库中
	 * <param name="systemMsgPushDetail">需要更新的SystemMsgPushDetail</param>
	 * <param name="systemMsgPushDetailQueryCondition">附加的条件</param>
	 */
	protected int systemMsgPushDetailUpdateSelectiveByCondition(SystemMsgPushDetail systemMsgPushDetail, SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemMsgPushDetail, systemMsgPushDetailQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中删除一个对象SystemMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	protected int systemMsgPushDetailDeleteByPrimaryKey(String AId) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中删除一个对象SystemMsgPushDetail</param>
	 */
	protected int systemMsgPushDetailDeleteByCondition(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		return mapperImpl.deleteByExample(systemMsgPushDetailQueryCondition);
	}
	
	/**
	 * <param name="systemMsgPushDetail">从数据库中查询一个对象SystemMsgPushDetail</param>
	 * <param name="AId">主键ID</param>
	 */
	protected SystemMsgPushDetail systemMsgPushDetailSelectByPrimaryKey(String AId) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemMsgPushDetail> systemMsgPushDetailSelectObjects(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		return mapperImpl.selectByExample(systemMsgPushDetailQueryCondition);
	}
	
	/**
	 * <param name="systemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemMsgPushDetailQuerySelectObjectsCount(SystemMsgPushDetailExample systemMsgPushDetailQueryCondition) {
		SystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushDetailMapper.class);
		return mapperImpl.countByExample(systemMsgPushDetailQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemMsgPushTask到数据库中
	 * <param name="SystemMsgPushTask">需要插入的SystemMsgPushTask</param>
	 */
	protected int systemMsgPushTaskInsert(SystemMsgPushTask systemMsgPushTask) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		return mapperImpl.insertSelective(systemMsgPushTask);
	}
	
	/**
	 * 更新一个对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	protected int systemMsgPushTaskUpdate(SystemMsgPushTask systemMsgPushTask) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemMsgPushTask);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 */
	protected int systemMsgPushTaskUpdateSelective(SystemMsgPushTask systemMsgPushTask) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemMsgPushTask);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 * <param name="systemMsgPushTaskQueryCondition">附加的条件</param>
	 */
	protected int systemMsgPushTaskUpdateByCondition(SystemMsgPushTask systemMsgPushTask, SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		int ret = mapperImpl.updateByExample(systemMsgPushTask, systemMsgPushTaskQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemMsgPushTask到数据库中
	 * <param name="systemMsgPushTask">需要更新的SystemMsgPushTask</param>
	 * <param name="systemMsgPushTaskQueryCondition">附加的条件</param>
	 */
	protected int systemMsgPushTaskUpdateSelectiveByCondition(SystemMsgPushTask systemMsgPushTask, SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemMsgPushTask, systemMsgPushTaskQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemMsgPushTask">从数据库中删除一个对象SystemMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	protected int systemMsgPushTaskDeleteByPrimaryKey(String AId) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemMsgPushTask">从数据库中删除一个对象SystemMsgPushTask</param>
	 */
	protected int systemMsgPushTaskDeleteByCondition(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		return mapperImpl.deleteByExample(systemMsgPushTaskQueryCondition);
	}
	
	/**
	 * <param name="systemMsgPushTask">从数据库中查询一个对象SystemMsgPushTask</param>
	 * <param name="AId">主键ID</param>
	 */
	protected SystemMsgPushTask systemMsgPushTaskSelectByPrimaryKey(String AId) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemMsgPushTask> systemMsgPushTaskSelectObjects(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		return mapperImpl.selectByExample(systemMsgPushTaskQueryCondition);
	}
	
	/**
	 * <param name="systemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemMsgPushTaskQuerySelectObjectsCount(SystemMsgPushTaskExample systemMsgPushTaskQueryCondition) {
		SystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgPushTaskMapper.class);
		return mapperImpl.countByExample(systemMsgPushTaskQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemMsgSend到数据库中
	 * <param name="SystemMsgSend">需要插入的SystemMsgSend</param>
	 */
	protected int systemMsgSendInsert(SystemMsgSend systemMsgSend) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		return mapperImpl.insertSelective(systemMsgSend);
	}
	
	/**
	 * 更新一个对象SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	protected int systemMsgSendUpdate(SystemMsgSend systemMsgSend) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemMsgSend);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 */
	protected int systemMsgSendUpdateSelective(SystemMsgSend systemMsgSend) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemMsgSend);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 * <param name="systemMsgSendQueryCondition">附加的条件</param>
	 */
	protected int systemMsgSendUpdateByCondition(SystemMsgSend systemMsgSend, SystemMsgSendExample systemMsgSendQueryCondition) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		int ret = mapperImpl.updateByExample(systemMsgSend, systemMsgSendQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemMsgSend到数据库中
	 * <param name="systemMsgSend">需要更新的SystemMsgSend</param>
	 * <param name="systemMsgSendQueryCondition">附加的条件</param>
	 */
	protected int systemMsgSendUpdateSelectiveByCondition(SystemMsgSend systemMsgSend, SystemMsgSendExample systemMsgSendQueryCondition) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemMsgSend, systemMsgSendQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemMsgSend">从数据库中删除一个对象SystemMsgSend</param>
	 * <param name="AId">主键</param>
	 */
	protected int systemMsgSendDeleteByPrimaryKey(String AId) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemMsgSend">从数据库中删除一个对象SystemMsgSend</param>
	 */
	protected int systemMsgSendDeleteByCondition(SystemMsgSendExample systemMsgSendQueryCondition) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		return mapperImpl.deleteByExample(systemMsgSendQueryCondition);
	}
	
	/**
	 * <param name="systemMsgSend">从数据库中查询一个对象SystemMsgSend</param>
	 * <param name="AId">主键</param>
	 */
	protected SystemMsgSend systemMsgSendSelectByPrimaryKey(String AId) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemMsgSendQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemMsgSend> systemMsgSendSelectObjects(SystemMsgSendExample systemMsgSendQueryCondition) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		return mapperImpl.selectByExample(systemMsgSendQueryCondition);
	}
	
	/**
	 * <param name="systemMsgSendQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemMsgSendQuerySelectObjectsCount(SystemMsgSendExample systemMsgSendQueryCondition) {
		SystemMsgSendMapper mapperImpl = this.getSqlSession().getMapper(SystemMsgSendMapper.class);
		return mapperImpl.countByExample(systemMsgSendQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemParam到数据库中
	 * <param name="SystemParam">需要插入的SystemParam</param>
	 */
	protected int systemParamInsert(SystemParam systemParam) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.insertSelective(systemParam);
	}
	
	/**
	 * 更新一个对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	protected int systemParamUpdate(SystemParam systemParam) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemParam);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	protected int systemParamUpdateSelective(SystemParam systemParam) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemParam);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 */
	protected int systemParamUpdateByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		int ret = mapperImpl.updateByExample(systemParam, systemParamQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 */
	protected int systemParamUpdateSelectiveByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemParam, systemParamQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 * <param name="ASystemParamKey">对象参数表,存放所有系统的参数 主键类</param>
	 */
	protected int systemParamDeleteByPrimaryKey(SystemParamKey ASystemParamKey) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.deleteByPrimaryKey(ASystemParamKey);
	}
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 */
	protected int systemParamDeleteByCondition(SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.deleteByExample(systemParamQueryCondition);
	}
	
	/**
	 * <param name="systemParam">从数据库中查询一个对象SystemParam</param>
	 * <param name="ASystemParamKey">对象参数表,存放所有系统的参数 主键类</param>
	 */
	protected SystemParam systemParamSelectByPrimaryKey(SystemParamKey ASystemParamKey) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.selectByPrimaryKey(ASystemParamKey);
	}
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemParam> systemParamSelectObjects(SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.selectByExample(systemParamQueryCondition);
	}
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemParamQuerySelectObjectsCount(SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.countByExample(systemParamQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemPrivilege到数据库中
	 * <param name="SystemPrivilege">需要插入的SystemPrivilege</param>
	 */
	protected int systemPrivilegeInsert(SystemPrivilege systemPrivilege) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		return mapperImpl.insertSelective(systemPrivilege);
	}
	
	/**
	 * 更新一个对象SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	protected int systemPrivilegeUpdate(SystemPrivilege systemPrivilege) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemPrivilege);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 */
	protected int systemPrivilegeUpdateSelective(SystemPrivilege systemPrivilege) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemPrivilege);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 * <param name="systemPrivilegeQueryCondition">附加的条件</param>
	 */
	protected int systemPrivilegeUpdateByCondition(SystemPrivilege systemPrivilege, SystemPrivilegeExample systemPrivilegeQueryCondition) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		int ret = mapperImpl.updateByExample(systemPrivilege, systemPrivilegeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemPrivilege到数据库中
	 * <param name="systemPrivilege">需要更新的SystemPrivilege</param>
	 * <param name="systemPrivilegeQueryCondition">附加的条件</param>
	 */
	protected int systemPrivilegeUpdateSelectiveByCondition(SystemPrivilege systemPrivilege, SystemPrivilegeExample systemPrivilegeQueryCondition) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemPrivilege, systemPrivilegeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemPrivilege">从数据库中删除一个对象SystemPrivilege</param>
	 * <param name="AFuncPrivilege">功能权限值</param>
	 */
	protected int systemPrivilegeDeleteByPrimaryKey(int AFuncPrivilege) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AFuncPrivilege);
	}
	
	/**
	 * <param name="systemPrivilege">从数据库中删除一个对象SystemPrivilege</param>
	 */
	protected int systemPrivilegeDeleteByCondition(SystemPrivilegeExample systemPrivilegeQueryCondition) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		return mapperImpl.deleteByExample(systemPrivilegeQueryCondition);
	}
	
	/**
	 * <param name="systemPrivilege">从数据库中查询一个对象SystemPrivilege</param>
	 * <param name="AFuncPrivilege">功能权限值</param>
	 */
	protected SystemPrivilege systemPrivilegeSelectByPrimaryKey(int AFuncPrivilege) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		return mapperImpl.selectByPrimaryKey(AFuncPrivilege);
	}
	
	/**
	 * <param name="systemPrivilegeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemPrivilege> systemPrivilegeSelectObjects(SystemPrivilegeExample systemPrivilegeQueryCondition) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		return mapperImpl.selectByExample(systemPrivilegeQueryCondition);
	}
	
	/**
	 * <param name="systemPrivilegeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemPrivilegeQuerySelectObjectsCount(SystemPrivilegeExample systemPrivilegeQueryCondition) {
		SystemPrivilegeMapper mapperImpl = this.getSqlSession().getMapper(SystemPrivilegeMapper.class);
		return mapperImpl.countByExample(systemPrivilegeQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemRoles到数据库中
	 * <param name="SystemRoles">需要插入的SystemRoles</param>
	 */
	protected int systemRolesInsert(SystemRoles systemRoles) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		return mapperImpl.insertSelective(systemRoles);
	}
	
	/**
	 * 更新一个对象SystemRoles到数据库中
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	protected int systemRolesUpdate(SystemRoles systemRoles) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemRoles);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemRoles到数据库中
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 */
	protected int systemRolesUpdateSelective(SystemRoles systemRoles) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemRoles);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemRoles到数据库中
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 * <param name="systemRolesQueryCondition">附加的条件</param>
	 */
	protected int systemRolesUpdateByCondition(SystemRoles systemRoles, SystemRolesExample systemRolesQueryCondition) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		int ret = mapperImpl.updateByExample(systemRoles, systemRolesQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemRoles到数据库中
	 * <param name="systemRoles">需要更新的SystemRoles</param>
	 * <param name="systemRolesQueryCondition">附加的条件</param>
	 */
	protected int systemRolesUpdateSelectiveByCondition(SystemRoles systemRoles, SystemRolesExample systemRolesQueryCondition) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemRoles, systemRolesQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemRoles">从数据库中删除一个对象SystemRoles</param>
	 * <param name="AId">角色标识</param>
	 */
	protected int systemRolesDeleteByPrimaryKey(String AId) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemRoles">从数据库中删除一个对象SystemRoles</param>
	 */
	protected int systemRolesDeleteByCondition(SystemRolesExample systemRolesQueryCondition) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		return mapperImpl.deleteByExample(systemRolesQueryCondition);
	}
	
	/**
	 * <param name="systemRoles">从数据库中查询一个对象SystemRoles</param>
	 * <param name="AId">角色标识</param>
	 */
	protected SystemRoles systemRolesSelectByPrimaryKey(String AId) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemRoles> systemRolesSelectObjects(SystemRolesExample systemRolesQueryCondition) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		return mapperImpl.selectByExample(systemRolesQueryCondition);
	}
	
	/**
	 * <param name="systemRolesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemRolesQuerySelectObjectsCount(SystemRolesExample systemRolesQueryCondition) {
		SystemRolesMapper mapperImpl = this.getSqlSession().getMapper(SystemRolesMapper.class);
		return mapperImpl.countByExample(systemRolesQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemValidInfo到数据库中
	 * <param name="SystemValidInfo">需要插入的SystemValidInfo</param>
	 */
	protected int systemValidInfoInsert(SystemValidInfo systemValidInfo) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		return mapperImpl.insertSelective(systemValidInfo);
	}
	
	/**
	 * 更新一个对象SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	protected int systemValidInfoUpdate(SystemValidInfo systemValidInfo) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemValidInfo);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 */
	protected int systemValidInfoUpdateSelective(SystemValidInfo systemValidInfo) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemValidInfo);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 * <param name="systemValidInfoQueryCondition">附加的条件</param>
	 */
	protected int systemValidInfoUpdateByCondition(SystemValidInfo systemValidInfo, SystemValidInfoExample systemValidInfoQueryCondition) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		int ret = mapperImpl.updateByExample(systemValidInfo, systemValidInfoQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemValidInfo到数据库中
	 * <param name="systemValidInfo">需要更新的SystemValidInfo</param>
	 * <param name="systemValidInfoQueryCondition">附加的条件</param>
	 */
	protected int systemValidInfoUpdateSelectiveByCondition(SystemValidInfo systemValidInfo, SystemValidInfoExample systemValidInfoQueryCondition) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemValidInfo, systemValidInfoQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemValidInfo">从数据库中删除一个对象SystemValidInfo</param>
	 * <param name="AId">PK</param>
	 */
	protected int systemValidInfoDeleteByPrimaryKey(String AId) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemValidInfo">从数据库中删除一个对象SystemValidInfo</param>
	 */
	protected int systemValidInfoDeleteByCondition(SystemValidInfoExample systemValidInfoQueryCondition) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		return mapperImpl.deleteByExample(systemValidInfoQueryCondition);
	}
	
	/**
	 * <param name="systemValidInfo">从数据库中查询一个对象SystemValidInfo</param>
	 * <param name="AId">PK</param>
	 */
	protected SystemValidInfo systemValidInfoSelectByPrimaryKey(String AId) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemValidInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemValidInfo> systemValidInfoSelectObjects(SystemValidInfoExample systemValidInfoQueryCondition) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		return mapperImpl.selectByExample(systemValidInfoQueryCondition);
	}
	
	/**
	 * <param name="systemValidInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemValidInfoQuerySelectObjectsCount(SystemValidInfoExample systemValidInfoQueryCondition) {
		SystemValidInfoMapper mapperImpl = this.getSqlSession().getMapper(SystemValidInfoMapper.class);
		return mapperImpl.countByExample(systemValidInfoQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemVisitLog到数据库中
	 * <param name="SystemVisitLog">需要插入的SystemVisitLog</param>
	 */
	protected int systemVisitLogInsert(SystemVisitLog systemVisitLog) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		return mapperImpl.insertSelective(systemVisitLog);
	}
	
	/**
	 * 更新一个对象SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	protected int systemVisitLogUpdate(SystemVisitLog systemVisitLog) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemVisitLog);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 */
	protected int systemVisitLogUpdateSelective(SystemVisitLog systemVisitLog) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemVisitLog);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 * <param name="systemVisitLogQueryCondition">附加的条件</param>
	 */
	protected int systemVisitLogUpdateByCondition(SystemVisitLog systemVisitLog, SystemVisitLogExample systemVisitLogQueryCondition) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		int ret = mapperImpl.updateByExample(systemVisitLog, systemVisitLogQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemVisitLog到数据库中
	 * <param name="systemVisitLog">需要更新的SystemVisitLog</param>
	 * <param name="systemVisitLogQueryCondition">附加的条件</param>
	 */
	protected int systemVisitLogUpdateSelectiveByCondition(SystemVisitLog systemVisitLog, SystemVisitLogExample systemVisitLogQueryCondition) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemVisitLog, systemVisitLogQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemVisitLog">从数据库中删除一个对象SystemVisitLog</param>
	 * <param name="AId">标识</param>
	 */
	protected int systemVisitLogDeleteByPrimaryKey(String AId) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemVisitLog">从数据库中删除一个对象SystemVisitLog</param>
	 */
	protected int systemVisitLogDeleteByCondition(SystemVisitLogExample systemVisitLogQueryCondition) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		return mapperImpl.deleteByExample(systemVisitLogQueryCondition);
	}
	
	/**
	 * <param name="systemVisitLog">从数据库中查询一个对象SystemVisitLog</param>
	 * <param name="AId">标识</param>
	 */
	protected SystemVisitLog systemVisitLogSelectByPrimaryKey(String AId) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemVisitLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemVisitLog> systemVisitLogSelectObjects(SystemVisitLogExample systemVisitLogQueryCondition) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		return mapperImpl.selectByExample(systemVisitLogQueryCondition);
	}
	
	/**
	 * <param name="systemVisitLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemVisitLogQuerySelectObjectsCount(SystemVisitLogExample systemVisitLogQueryCondition) {
		SystemVisitLogMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitLogMapper.class);
		return mapperImpl.countByExample(systemVisitLogQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemVisitMessage到数据库中
	 * <param name="SystemVisitMessage">需要插入的SystemVisitMessage</param>
	 */
	protected int systemVisitMessageInsert(SystemVisitMessage systemVisitMessage) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		return mapperImpl.insertSelective(systemVisitMessage);
	}
	
	/**
	 * 更新一个对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	protected int systemVisitMessageUpdate(SystemVisitMessage systemVisitMessage) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemVisitMessage);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 */
	protected int systemVisitMessageUpdateSelective(SystemVisitMessage systemVisitMessage) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemVisitMessage);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 * <param name="systemVisitMessageQueryCondition">附加的条件</param>
	 */
	protected int systemVisitMessageUpdateByCondition(SystemVisitMessage systemVisitMessage, SystemVisitMessageExample systemVisitMessageQueryCondition) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		int ret = mapperImpl.updateByExample(systemVisitMessage, systemVisitMessageQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemVisitMessage到数据库中
	 * <param name="systemVisitMessage">需要更新的SystemVisitMessage</param>
	 * <param name="systemVisitMessageQueryCondition">附加的条件</param>
	 */
	protected int systemVisitMessageUpdateSelectiveByCondition(SystemVisitMessage systemVisitMessage, SystemVisitMessageExample systemVisitMessageQueryCondition) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemVisitMessage, systemVisitMessageQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemVisitMessage">从数据库中删除一个对象SystemVisitMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	protected int systemVisitMessageDeleteByPrimaryKey(String AId) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemVisitMessage">从数据库中删除一个对象SystemVisitMessage</param>
	 */
	protected int systemVisitMessageDeleteByCondition(SystemVisitMessageExample systemVisitMessageQueryCondition) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		return mapperImpl.deleteByExample(systemVisitMessageQueryCondition);
	}
	
	/**
	 * <param name="systemVisitMessage">从数据库中查询一个对象SystemVisitMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	protected SystemVisitMessage systemVisitMessageSelectByPrimaryKey(String AId) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemVisitMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemVisitMessage> systemVisitMessageSelectObjects(SystemVisitMessageExample systemVisitMessageQueryCondition) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		return mapperImpl.selectByExample(systemVisitMessageQueryCondition);
	}
	
	/**
	 * <param name="systemVisitMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemVisitMessageQuerySelectObjectsCount(SystemVisitMessageExample systemVisitMessageQueryCondition) {
		SystemVisitMessageMapper mapperImpl = this.getSqlSession().getMapper(SystemVisitMessageMapper.class);
		return mapperImpl.countByExample(systemVisitMessageQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemWhiteList到数据库中
	 * <param name="SystemWhiteList">需要插入的SystemWhiteList</param>
	 */
	protected int systemWhiteListInsert(SystemWhiteList systemWhiteList) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		return mapperImpl.insertSelective(systemWhiteList);
	}
	
	/**
	 * 更新一个对象SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	protected int systemWhiteListUpdate(SystemWhiteList systemWhiteList) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemWhiteList);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 */
	protected int systemWhiteListUpdateSelective(SystemWhiteList systemWhiteList) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemWhiteList);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 * <param name="systemWhiteListQueryCondition">附加的条件</param>
	 */
	protected int systemWhiteListUpdateByCondition(SystemWhiteList systemWhiteList, SystemWhiteListExample systemWhiteListQueryCondition) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		int ret = mapperImpl.updateByExample(systemWhiteList, systemWhiteListQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemWhiteList到数据库中
	 * <param name="systemWhiteList">需要更新的SystemWhiteList</param>
	 * <param name="systemWhiteListQueryCondition">附加的条件</param>
	 */
	protected int systemWhiteListUpdateSelectiveByCondition(SystemWhiteList systemWhiteList, SystemWhiteListExample systemWhiteListQueryCondition) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemWhiteList, systemWhiteListQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemWhiteList">从数据库中删除一个对象SystemWhiteList</param>
	 * <param name="AId">主键</param>
	 */
	protected int systemWhiteListDeleteByPrimaryKey(String AId) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemWhiteList">从数据库中删除一个对象SystemWhiteList</param>
	 */
	protected int systemWhiteListDeleteByCondition(SystemWhiteListExample systemWhiteListQueryCondition) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		return mapperImpl.deleteByExample(systemWhiteListQueryCondition);
	}
	
	/**
	 * <param name="systemWhiteList">从数据库中查询一个对象SystemWhiteList</param>
	 * <param name="AId">主键</param>
	 */
	protected SystemWhiteList systemWhiteListSelectByPrimaryKey(String AId) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="systemWhiteListQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemWhiteList> systemWhiteListSelectObjects(SystemWhiteListExample systemWhiteListQueryCondition) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		return mapperImpl.selectByExample(systemWhiteListQueryCondition);
	}
	
	/**
	 * <param name="systemWhiteListQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemWhiteListQuerySelectObjectsCount(SystemWhiteListExample systemWhiteListQueryCondition) {
		SystemWhiteListMapper mapperImpl = this.getSqlSession().getMapper(SystemWhiteListMapper.class);
		return mapperImpl.countByExample(systemWhiteListQueryCondition);
	}
	
	/**
	 * <param name="vSystemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VSystemMsgPushDetail> vSystemMsgPushDetailSelectObjects(VSystemMsgPushDetailExample vSystemMsgPushDetailQueryCondition) {
		VSystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(VSystemMsgPushDetailMapper.class);
		return mapperImpl.selectByExample(vSystemMsgPushDetailQueryCondition);
	}
	
	/**
	 * <param name="vSystemMsgPushDetailQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int vSystemMsgPushDetailQuerySelectObjectsCount(VSystemMsgPushDetailExample vSystemMsgPushDetailQueryCondition) {
		VSystemMsgPushDetailMapper mapperImpl = this.getSqlSession().getMapper(VSystemMsgPushDetailMapper.class);
		return mapperImpl.countByExample(vSystemMsgPushDetailQueryCondition);
	}
	
	/**
	 * <param name="vSystemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VSystemMsgPushTask> vSystemMsgPushTaskSelectObjects(VSystemMsgPushTaskExample vSystemMsgPushTaskQueryCondition) {
		VSystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(VSystemMsgPushTaskMapper.class);
		return mapperImpl.selectByExample(vSystemMsgPushTaskQueryCondition);
	}
	
	/**
	 * <param name="vSystemMsgPushTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int vSystemMsgPushTaskQuerySelectObjectsCount(VSystemMsgPushTaskExample vSystemMsgPushTaskQueryCondition) {
		VSystemMsgPushTaskMapper mapperImpl = this.getSqlSession().getMapper(VSystemMsgPushTaskMapper.class);
		return mapperImpl.countByExample(vSystemMsgPushTaskQueryCondition);
	}
	
	/**
	 * 简单的日志接口,无任何实现
	 * <param name="tableName">表名称</param>
	 * <param name="operateName">操作名称</param>
	 * <param name="keyFieldName">主键字段名</param>
	 * <param name="keyFieldValue">主键字段值</param>
	 * <param name="param">附加参数</param>
	 * <param name="updateCount">生效行数</param>
	 */
	protected void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param, int updateCount) {
	}
}
