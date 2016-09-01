package topdeep.commonfund.entity.db;
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
	 * 插入一个对象FundBankCardBin到数据库中
	 * <param name="FundBankCardBin">需要插入的FundBankCardBin</param>
	 */
	protected int fundBankCardBinInsert(FundBankCardBin fundBankCardBin) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		return mapperImpl.insertSelective(fundBankCardBin);
	}
	
	/**
	 * 更新一个对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	protected int fundBankCardBinUpdate(FundBankCardBin fundBankCardBin) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundBankCardBin);
		return ret;
	}
	
	/**
	 * 更新一个对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	protected int fundBankCardBinUpdateSelective(FundBankCardBin fundBankCardBin) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundBankCardBin);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 * <param name="fundBankCardBinQueryCondition">附加的条件</param>
	 */
	protected int fundBankCardBinUpdateByCondition(FundBankCardBin fundBankCardBin, FundBankCardBinExample fundBankCardBinQueryCondition) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		int ret = mapperImpl.updateByExample(fundBankCardBin, fundBankCardBinQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 * <param name="fundBankCardBinQueryCondition">附加的条件</param>
	 */
	protected int fundBankCardBinUpdateSelectiveByCondition(FundBankCardBin fundBankCardBin, FundBankCardBinExample fundBankCardBinQueryCondition) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundBankCardBin, fundBankCardBinQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundBankCardBin">从数据库中删除一个对象FundBankCardBin</param>
	 * <param name="AId">银行卡BinID</param>
	 */
	protected int fundBankCardBinDeleteByPrimaryKey(String AId) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundBankCardBin">从数据库中删除一个对象FundBankCardBin</param>
	 */
	protected int fundBankCardBinDeleteByCondition(FundBankCardBinExample fundBankCardBinQueryCondition) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		return mapperImpl.deleteByExample(fundBankCardBinQueryCondition);
	}
	
	/**
	 * <param name="fundBankCardBin">从数据库中查询一个对象FundBankCardBin</param>
	 * <param name="AId">银行卡BinID</param>
	 */
	protected FundBankCardBin fundBankCardBinSelectByPrimaryKey(String AId) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundBankCardBinQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundBankCardBin> fundBankCardBinSelectObjects(FundBankCardBinExample fundBankCardBinQueryCondition) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		return mapperImpl.selectByExample(fundBankCardBinQueryCondition);
	}
	
	/**
	 * <param name="fundBankCardBinQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundBankCardBinQuerySelectObjectsCount(FundBankCardBinExample fundBankCardBinQueryCondition) {
		FundBankCardBinMapper mapperImpl = this.getSqlSession().getMapper(FundBankCardBinMapper.class);
		return mapperImpl.countByExample(fundBankCardBinQueryCondition);
	}
	
	/**
	 * 插入一个对象FundBindInfo到数据库中
	 * <param name="FundBindInfo">需要插入的FundBindInfo</param>
	 */
	protected int fundBindInfoInsert(FundBindInfo fundBindInfo) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		return mapperImpl.insertSelective(fundBindInfo);
	}
	
	/**
	 * 更新一个对象FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	protected int fundBindInfoUpdate(FundBindInfo fundBindInfo) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundBindInfo);
		return ret;
	}
	
	/**
	 * 更新一个对象FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	protected int fundBindInfoUpdateSelective(FundBindInfo fundBindInfo) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundBindInfo);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 * <param name="fundBindInfoQueryCondition">附加的条件</param>
	 */
	protected int fundBindInfoUpdateByCondition(FundBindInfo fundBindInfo, FundBindInfoExample fundBindInfoQueryCondition) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		int ret = mapperImpl.updateByExample(fundBindInfo, fundBindInfoQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 * <param name="fundBindInfoQueryCondition">附加的条件</param>
	 */
	protected int fundBindInfoUpdateSelectiveByCondition(FundBindInfo fundBindInfo, FundBindInfoExample fundBindInfoQueryCondition) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundBindInfo, fundBindInfoQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundBindInfo">从数据库中删除一个对象FundBindInfo</param>
	 * <param name="AFundBindInfoKey">绑定信息表 主键类</param>
	 */
	protected int fundBindInfoDeleteByPrimaryKey(FundBindInfoKey AFundBindInfoKey) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		return mapperImpl.deleteByPrimaryKey(AFundBindInfoKey);
	}
	
	/**
	 * <param name="fundBindInfo">从数据库中删除一个对象FundBindInfo</param>
	 */
	protected int fundBindInfoDeleteByCondition(FundBindInfoExample fundBindInfoQueryCondition) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		return mapperImpl.deleteByExample(fundBindInfoQueryCondition);
	}
	
	/**
	 * <param name="fundBindInfo">从数据库中查询一个对象FundBindInfo</param>
	 * <param name="AFundBindInfoKey">绑定信息表 主键类</param>
	 */
	protected FundBindInfo fundBindInfoSelectByPrimaryKey(FundBindInfoKey AFundBindInfoKey) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		return mapperImpl.selectByPrimaryKey(AFundBindInfoKey);
	}
	
	/**
	 * <param name="fundBindInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundBindInfo> fundBindInfoSelectObjects(FundBindInfoExample fundBindInfoQueryCondition) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		return mapperImpl.selectByExample(fundBindInfoQueryCondition);
	}
	
	/**
	 * <param name="fundBindInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundBindInfoQuerySelectObjectsCount(FundBindInfoExample fundBindInfoQueryCondition) {
		FundBindInfoMapper mapperImpl = this.getSqlSession().getMapper(FundBindInfoMapper.class);
		return mapperImpl.countByExample(fundBindInfoQueryCondition);
	}
	
	/**
	 * 插入一个对象FundCustMessage到数据库中
	 * <param name="FundCustMessage">需要插入的FundCustMessage</param>
	 */
	protected int fundCustMessageInsert(FundCustMessage fundCustMessage) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		return mapperImpl.insertSelective(fundCustMessage);
	}
	
	/**
	 * 更新一个对象FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	protected int fundCustMessageUpdate(FundCustMessage fundCustMessage) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundCustMessage);
		return ret;
	}
	
	/**
	 * 更新一个对象FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	protected int fundCustMessageUpdateSelective(FundCustMessage fundCustMessage) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundCustMessage);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 * <param name="fundCustMessageQueryCondition">附加的条件</param>
	 */
	protected int fundCustMessageUpdateByCondition(FundCustMessage fundCustMessage, FundCustMessageExample fundCustMessageQueryCondition) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		int ret = mapperImpl.updateByExample(fundCustMessage, fundCustMessageQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 * <param name="fundCustMessageQueryCondition">附加的条件</param>
	 */
	protected int fundCustMessageUpdateSelectiveByCondition(FundCustMessage fundCustMessage, FundCustMessageExample fundCustMessageQueryCondition) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundCustMessage, fundCustMessageQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundCustMessage">从数据库中删除一个对象FundCustMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	protected int fundCustMessageDeleteByPrimaryKey(String AId) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundCustMessage">从数据库中删除一个对象FundCustMessage</param>
	 */
	protected int fundCustMessageDeleteByCondition(FundCustMessageExample fundCustMessageQueryCondition) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		return mapperImpl.deleteByExample(fundCustMessageQueryCondition);
	}
	
	/**
	 * <param name="fundCustMessage">从数据库中查询一个对象FundCustMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	protected FundCustMessage fundCustMessageSelectByPrimaryKey(String AId) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundCustMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundCustMessage> fundCustMessageSelectObjects(FundCustMessageExample fundCustMessageQueryCondition) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		return mapperImpl.selectByExample(fundCustMessageQueryCondition);
	}
	
	/**
	 * <param name="fundCustMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundCustMessageQuerySelectObjectsCount(FundCustMessageExample fundCustMessageQueryCondition) {
		FundCustMessageMapper mapperImpl = this.getSqlSession().getMapper(FundCustMessageMapper.class);
		return mapperImpl.countByExample(fundCustMessageQueryCondition);
	}
	
	/**
	 * 插入一个对象FundCustomerLog到数据库中
	 * <param name="FundCustomerLog">需要插入的FundCustomerLog</param>
	 */
	protected int fundCustomerLogInsert(FundCustomerLog fundCustomerLog) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		return mapperImpl.insertSelective(fundCustomerLog);
	}
	
	/**
	 * 更新一个对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	protected int fundCustomerLogUpdate(FundCustomerLog fundCustomerLog) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundCustomerLog);
		return ret;
	}
	
	/**
	 * 更新一个对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	protected int fundCustomerLogUpdateSelective(FundCustomerLog fundCustomerLog) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundCustomerLog);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 * <param name="fundCustomerLogQueryCondition">附加的条件</param>
	 */
	protected int fundCustomerLogUpdateByCondition(FundCustomerLog fundCustomerLog, FundCustomerLogExample fundCustomerLogQueryCondition) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		int ret = mapperImpl.updateByExample(fundCustomerLog, fundCustomerLogQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 * <param name="fundCustomerLogQueryCondition">附加的条件</param>
	 */
	protected int fundCustomerLogUpdateSelectiveByCondition(FundCustomerLog fundCustomerLog, FundCustomerLogExample fundCustomerLogQueryCondition) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundCustomerLog, fundCustomerLogQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundCustomerLog">从数据库中删除一个对象FundCustomerLog</param>
	 * <param name="AId">主键</param>
	 */
	protected int fundCustomerLogDeleteByPrimaryKey(String AId) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundCustomerLog">从数据库中删除一个对象FundCustomerLog</param>
	 */
	protected int fundCustomerLogDeleteByCondition(FundCustomerLogExample fundCustomerLogQueryCondition) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		return mapperImpl.deleteByExample(fundCustomerLogQueryCondition);
	}
	
	/**
	 * <param name="fundCustomerLog">从数据库中查询一个对象FundCustomerLog</param>
	 * <param name="AId">主键</param>
	 */
	protected FundCustomerLog fundCustomerLogSelectByPrimaryKey(String AId) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundCustomerLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundCustomerLog> fundCustomerLogSelectObjects(FundCustomerLogExample fundCustomerLogQueryCondition) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		return mapperImpl.selectByExample(fundCustomerLogQueryCondition);
	}
	
	/**
	 * <param name="fundCustomerLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundCustomerLogQuerySelectObjectsCount(FundCustomerLogExample fundCustomerLogQueryCondition) {
		FundCustomerLogMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogMapper.class);
		return mapperImpl.countByExample(fundCustomerLogQueryCondition);
	}
	
	/**
	 * 插入一个对象FundCustomerPassword到数据库中
	 * <param name="FundCustomerPassword">需要插入的FundCustomerPassword</param>
	 */
	protected int fundCustomerPasswordInsert(FundCustomerPassword fundCustomerPassword) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		return mapperImpl.insertSelective(fundCustomerPassword);
	}
	
	/**
	 * 更新一个对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	protected int fundCustomerPasswordUpdate(FundCustomerPassword fundCustomerPassword) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundCustomerPassword);
		return ret;
	}
	
	/**
	 * 更新一个对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	protected int fundCustomerPasswordUpdateSelective(FundCustomerPassword fundCustomerPassword) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundCustomerPassword);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 * <param name="fundCustomerPasswordQueryCondition">附加的条件</param>
	 */
	protected int fundCustomerPasswordUpdateByCondition(FundCustomerPassword fundCustomerPassword, FundCustomerPasswordExample fundCustomerPasswordQueryCondition) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		int ret = mapperImpl.updateByExample(fundCustomerPassword, fundCustomerPasswordQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 * <param name="fundCustomerPasswordQueryCondition">附加的条件</param>
	 */
	protected int fundCustomerPasswordUpdateSelectiveByCondition(FundCustomerPassword fundCustomerPassword, FundCustomerPasswordExample fundCustomerPasswordQueryCondition) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundCustomerPassword, fundCustomerPasswordQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundCustomerPassword">从数据库中删除一个对象FundCustomerPassword</param>
	 * <param name="AId">PK</param>
	 */
	protected int fundCustomerPasswordDeleteByPrimaryKey(String AId) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundCustomerPassword">从数据库中删除一个对象FundCustomerPassword</param>
	 */
	protected int fundCustomerPasswordDeleteByCondition(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		return mapperImpl.deleteByExample(fundCustomerPasswordQueryCondition);
	}
	
	/**
	 * <param name="fundCustomerPassword">从数据库中查询一个对象FundCustomerPassword</param>
	 * <param name="AId">PK</param>
	 */
	protected FundCustomerPassword fundCustomerPasswordSelectByPrimaryKey(String AId) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundCustomerPasswordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundCustomerPassword> fundCustomerPasswordSelectObjects(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		return mapperImpl.selectByExample(fundCustomerPasswordQueryCondition);
	}
	
	/**
	 * <param name="fundCustomerPasswordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundCustomerPasswordQuerySelectObjectsCount(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) {
		FundCustomerPasswordMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerPasswordMapper.class);
		return mapperImpl.countByExample(fundCustomerPasswordQueryCondition);
	}
	
	/**
	 * 插入一个对象FundEcTradeSeat到数据库中
	 * <param name="FundEcTradeSeat">需要插入的FundEcTradeSeat</param>
	 */
	protected int fundEcTradeSeatInsert(FundEcTradeSeat fundEcTradeSeat) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		return mapperImpl.insertSelective(fundEcTradeSeat);
	}
	
	/**
	 * 更新一个对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	protected int fundEcTradeSeatUpdate(FundEcTradeSeat fundEcTradeSeat) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundEcTradeSeat);
		return ret;
	}
	
	/**
	 * 更新一个对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	protected int fundEcTradeSeatUpdateSelective(FundEcTradeSeat fundEcTradeSeat) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundEcTradeSeat);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 * <param name="fundEcTradeSeatQueryCondition">附加的条件</param>
	 */
	protected int fundEcTradeSeatUpdateByCondition(FundEcTradeSeat fundEcTradeSeat, FundEcTradeSeatExample fundEcTradeSeatQueryCondition) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		int ret = mapperImpl.updateByExample(fundEcTradeSeat, fundEcTradeSeatQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 * <param name="fundEcTradeSeatQueryCondition">附加的条件</param>
	 */
	protected int fundEcTradeSeatUpdateSelectiveByCondition(FundEcTradeSeat fundEcTradeSeat, FundEcTradeSeatExample fundEcTradeSeatQueryCondition) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundEcTradeSeat, fundEcTradeSeatQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundEcTradeSeat">从数据库中删除一个对象FundEcTradeSeat</param>
	 * <param name="AId">PK</param>
	 */
	protected int fundEcTradeSeatDeleteByPrimaryKey(String AId) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundEcTradeSeat">从数据库中删除一个对象FundEcTradeSeat</param>
	 */
	protected int fundEcTradeSeatDeleteByCondition(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		return mapperImpl.deleteByExample(fundEcTradeSeatQueryCondition);
	}
	
	/**
	 * <param name="fundEcTradeSeat">从数据库中查询一个对象FundEcTradeSeat</param>
	 * <param name="AId">PK</param>
	 */
	protected FundEcTradeSeat fundEcTradeSeatSelectByPrimaryKey(String AId) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundEcTradeSeatQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundEcTradeSeat> fundEcTradeSeatSelectObjects(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		return mapperImpl.selectByExample(fundEcTradeSeatQueryCondition);
	}
	
	/**
	 * <param name="fundEcTradeSeatQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundEcTradeSeatQuerySelectObjectsCount(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) {
		FundEcTradeSeatMapper mapperImpl = this.getSqlSession().getMapper(FundEcTradeSeatMapper.class);
		return mapperImpl.countByExample(fundEcTradeSeatQueryCondition);
	}
	
	/**
	 * 插入一个对象FundFundCatagoryFundRela到数据库中
	 * <param name="FundFundCatagoryFundRela">需要插入的FundFundCatagoryFundRela</param>
	 */
	protected int fundFundCatagoryFundRelaInsert(FundFundCatagoryFundRela fundFundCatagoryFundRela) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		return mapperImpl.insertSelective(fundFundCatagoryFundRela);
	}
	
	/**
	 * 更新一个对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	protected int fundFundCatagoryFundRelaUpdate(FundFundCatagoryFundRela fundFundCatagoryFundRela) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundFundCatagoryFundRela);
		return ret;
	}
	
	/**
	 * 更新一个对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	protected int fundFundCatagoryFundRelaUpdateSelective(FundFundCatagoryFundRela fundFundCatagoryFundRela) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundFundCatagoryFundRela);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加的条件</param>
	 */
	protected int fundFundCatagoryFundRelaUpdateByCondition(FundFundCatagoryFundRela fundFundCatagoryFundRela, FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		int ret = mapperImpl.updateByExample(fundFundCatagoryFundRela, fundFundCatagoryFundRelaQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加的条件</param>
	 */
	protected int fundFundCatagoryFundRelaUpdateSelectiveByCondition(FundFundCatagoryFundRela fundFundCatagoryFundRela, FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundFundCatagoryFundRela, fundFundCatagoryFundRelaQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundFundCatagoryFundRela">从数据库中删除一个对象FundFundCatagoryFundRela</param>
	 * <param name="AFundFundCatagoryFundRelaKey">分类基金关联表 主键类</param>
	 */
	protected int fundFundCatagoryFundRelaDeleteByPrimaryKey(FundFundCatagoryFundRelaKey AFundFundCatagoryFundRelaKey) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		return mapperImpl.deleteByPrimaryKey(AFundFundCatagoryFundRelaKey);
	}
	
	/**
	 * <param name="fundFundCatagoryFundRela">从数据库中删除一个对象FundFundCatagoryFundRela</param>
	 */
	protected int fundFundCatagoryFundRelaDeleteByCondition(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		return mapperImpl.deleteByExample(fundFundCatagoryFundRelaQueryCondition);
	}
	
	/**
	 * <param name="fundFundCatagoryFundRela">从数据库中查询一个对象FundFundCatagoryFundRela</param>
	 * <param name="AFundFundCatagoryFundRelaKey">分类基金关联表 主键类</param>
	 */
	protected FundFundCatagoryFundRela fundFundCatagoryFundRelaSelectByPrimaryKey(FundFundCatagoryFundRelaKey AFundFundCatagoryFundRelaKey) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		return mapperImpl.selectByPrimaryKey(AFundFundCatagoryFundRelaKey);
	}
	
	/**
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundFundCatagoryFundRela> fundFundCatagoryFundRelaSelectObjects(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		return mapperImpl.selectByExample(fundFundCatagoryFundRelaQueryCondition);
	}
	
	/**
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundFundCatagoryFundRelaQuerySelectObjectsCount(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) {
		FundFundCatagoryFundRelaMapper mapperImpl = this.getSqlSession().getMapper(FundFundCatagoryFundRelaMapper.class);
		return mapperImpl.countByExample(fundFundCatagoryFundRelaQueryCondition);
	}
	
	/**
	 * 插入一个对象FundFundCategory到数据库中
	 * <param name="FundFundCategory">需要插入的FundFundCategory</param>
	 */
	protected int fundFundCategoryInsert(FundFundCategory fundFundCategory) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		return mapperImpl.insertSelective(fundFundCategory);
	}
	
	/**
	 * 更新一个对象FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	protected int fundFundCategoryUpdate(FundFundCategory fundFundCategory) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundFundCategory);
		return ret;
	}
	
	/**
	 * 更新一个对象FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	protected int fundFundCategoryUpdateSelective(FundFundCategory fundFundCategory) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundFundCategory);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 * <param name="fundFundCategoryQueryCondition">附加的条件</param>
	 */
	protected int fundFundCategoryUpdateByCondition(FundFundCategory fundFundCategory, FundFundCategoryExample fundFundCategoryQueryCondition) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		int ret = mapperImpl.updateByExample(fundFundCategory, fundFundCategoryQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 * <param name="fundFundCategoryQueryCondition">附加的条件</param>
	 */
	protected int fundFundCategoryUpdateSelectiveByCondition(FundFundCategory fundFundCategory, FundFundCategoryExample fundFundCategoryQueryCondition) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundFundCategory, fundFundCategoryQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundFundCategory">从数据库中删除一个对象FundFundCategory</param>
	 * <param name="AId">分类ID</param>
	 */
	protected int fundFundCategoryDeleteByPrimaryKey(String AId) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundFundCategory">从数据库中删除一个对象FundFundCategory</param>
	 */
	protected int fundFundCategoryDeleteByCondition(FundFundCategoryExample fundFundCategoryQueryCondition) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		return mapperImpl.deleteByExample(fundFundCategoryQueryCondition);
	}
	
	/**
	 * <param name="fundFundCategory">从数据库中查询一个对象FundFundCategory</param>
	 * <param name="AId">分类ID</param>
	 */
	protected FundFundCategory fundFundCategorySelectByPrimaryKey(String AId) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundFundCategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundFundCategory> fundFundCategorySelectObjects(FundFundCategoryExample fundFundCategoryQueryCondition) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		return mapperImpl.selectByExample(fundFundCategoryQueryCondition);
	}
	
	/**
	 * <param name="fundFundCategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundFundCategoryQuerySelectObjectsCount(FundFundCategoryExample fundFundCategoryQueryCondition) {
		FundFundCategoryMapper mapperImpl = this.getSqlSession().getMapper(FundFundCategoryMapper.class);
		return mapperImpl.countByExample(fundFundCategoryQueryCondition);
	}
	
	/**
	 * 插入一个对象FundFundInfo到数据库中
	 * <param name="FundFundInfo">需要插入的FundFundInfo</param>
	 */
	protected int fundFundInfoInsert(FundFundInfo fundFundInfo) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		return mapperImpl.insertSelective(fundFundInfo);
	}
	
	/**
	 * 更新一个对象FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	protected int fundFundInfoUpdate(FundFundInfo fundFundInfo) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundFundInfo);
		return ret;
	}
	
	/**
	 * 更新一个对象FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	protected int fundFundInfoUpdateSelective(FundFundInfo fundFundInfo) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundFundInfo);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 * <param name="fundFundInfoQueryCondition">附加的条件</param>
	 */
	protected int fundFundInfoUpdateByCondition(FundFundInfo fundFundInfo, FundFundInfoExample fundFundInfoQueryCondition) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		int ret = mapperImpl.updateByExample(fundFundInfo, fundFundInfoQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 * <param name="fundFundInfoQueryCondition">附加的条件</param>
	 */
	protected int fundFundInfoUpdateSelectiveByCondition(FundFundInfo fundFundInfo, FundFundInfoExample fundFundInfoQueryCondition) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundFundInfo, fundFundInfoQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundFundInfo">从数据库中删除一个对象FundFundInfo</param>
	 * <param name="AFundCode">基金代码</param>
	 */
	protected int fundFundInfoDeleteByPrimaryKey(String AFundCode) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		return mapperImpl.deleteByPrimaryKey(AFundCode);
	}
	
	/**
	 * <param name="fundFundInfo">从数据库中删除一个对象FundFundInfo</param>
	 */
	protected int fundFundInfoDeleteByCondition(FundFundInfoExample fundFundInfoQueryCondition) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		return mapperImpl.deleteByExample(fundFundInfoQueryCondition);
	}
	
	/**
	 * <param name="fundFundInfo">从数据库中查询一个对象FundFundInfo</param>
	 * <param name="AFundCode">基金代码</param>
	 */
	protected FundFundInfo fundFundInfoSelectByPrimaryKey(String AFundCode) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		return mapperImpl.selectByPrimaryKey(AFundCode);
	}
	
	/**
	 * <param name="fundFundInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundFundInfo> fundFundInfoSelectObjects(FundFundInfoExample fundFundInfoQueryCondition) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		return mapperImpl.selectByExample(fundFundInfoQueryCondition);
	}
	
	/**
	 * <param name="fundFundInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundFundInfoQuerySelectObjectsCount(FundFundInfoExample fundFundInfoQueryCondition) {
		FundFundInfoMapper mapperImpl = this.getSqlSession().getMapper(FundFundInfoMapper.class);
		return mapperImpl.countByExample(fundFundInfoQueryCondition);
	}
	
	/**
	 * 插入一个对象FundFundProperty到数据库中
	 * <param name="FundFundProperty">需要插入的FundFundProperty</param>
	 */
	protected int fundFundPropertyInsert(FundFundProperty fundFundProperty) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		return mapperImpl.insertSelective(fundFundProperty);
	}
	
	/**
	 * 更新一个对象FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	protected int fundFundPropertyUpdate(FundFundProperty fundFundProperty) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundFundProperty);
		return ret;
	}
	
	/**
	 * 更新一个对象FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	protected int fundFundPropertyUpdateSelective(FundFundProperty fundFundProperty) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundFundProperty);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 * <param name="fundFundPropertyQueryCondition">附加的条件</param>
	 */
	protected int fundFundPropertyUpdateByCondition(FundFundProperty fundFundProperty, FundFundPropertyExample fundFundPropertyQueryCondition) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		int ret = mapperImpl.updateByExample(fundFundProperty, fundFundPropertyQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 * <param name="fundFundPropertyQueryCondition">附加的条件</param>
	 */
	protected int fundFundPropertyUpdateSelectiveByCondition(FundFundProperty fundFundProperty, FundFundPropertyExample fundFundPropertyQueryCondition) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundFundProperty, fundFundPropertyQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundFundProperty">从数据库中删除一个对象FundFundProperty</param>
	 * <param name="AFundFundPropertyKey">基金属性表 主键类</param>
	 */
	protected int fundFundPropertyDeleteByPrimaryKey(FundFundPropertyKey AFundFundPropertyKey) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		return mapperImpl.deleteByPrimaryKey(AFundFundPropertyKey);
	}
	
	/**
	 * <param name="fundFundProperty">从数据库中删除一个对象FundFundProperty</param>
	 */
	protected int fundFundPropertyDeleteByCondition(FundFundPropertyExample fundFundPropertyQueryCondition) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		return mapperImpl.deleteByExample(fundFundPropertyQueryCondition);
	}
	
	/**
	 * <param name="fundFundProperty">从数据库中查询一个对象FundFundProperty</param>
	 * <param name="AFundFundPropertyKey">基金属性表 主键类</param>
	 */
	protected FundFundProperty fundFundPropertySelectByPrimaryKey(FundFundPropertyKey AFundFundPropertyKey) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		return mapperImpl.selectByPrimaryKey(AFundFundPropertyKey);
	}
	
	/**
	 * <param name="fundFundPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundFundProperty> fundFundPropertySelectObjects(FundFundPropertyExample fundFundPropertyQueryCondition) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		return mapperImpl.selectByExample(fundFundPropertyQueryCondition);
	}
	
	/**
	 * <param name="fundFundPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundFundPropertyQuerySelectObjectsCount(FundFundPropertyExample fundFundPropertyQueryCondition) {
		FundFundPropertyMapper mapperImpl = this.getSqlSession().getMapper(FundFundPropertyMapper.class);
		return mapperImpl.countByExample(fundFundPropertyQueryCondition);
	}
	
	/**
	 * 插入一个对象FundMessageRecord到数据库中
	 * <param name="FundMessageRecord">需要插入的FundMessageRecord</param>
	 */
	protected int fundMessageRecordInsert(FundMessageRecord fundMessageRecord) {
		FundMessageRecordMapper mapperImpl = this.getSqlSession().getMapper(FundMessageRecordMapper.class);
		return mapperImpl.insertSelective(fundMessageRecord);
	}
	
	/**
	 * 根据条件更新一批对象FundMessageRecord到数据库中
	 * <param name="fundMessageRecord">需要更新的FundMessageRecord</param>
	 * <param name="fundMessageRecordQueryCondition">附加的条件</param>
	 */
	protected int fundMessageRecordUpdateByCondition(FundMessageRecord fundMessageRecord, FundMessageRecordExample fundMessageRecordQueryCondition) {
		FundMessageRecordMapper mapperImpl = this.getSqlSession().getMapper(FundMessageRecordMapper.class);
		int ret = mapperImpl.updateByExample(fundMessageRecord, fundMessageRecordQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundMessageRecord到数据库中
	 * <param name="fundMessageRecord">需要更新的FundMessageRecord</param>
	 * <param name="fundMessageRecordQueryCondition">附加的条件</param>
	 */
	protected int fundMessageRecordUpdateSelectiveByCondition(FundMessageRecord fundMessageRecord, FundMessageRecordExample fundMessageRecordQueryCondition) {
		FundMessageRecordMapper mapperImpl = this.getSqlSession().getMapper(FundMessageRecordMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundMessageRecord, fundMessageRecordQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundMessageRecord">从数据库中删除一个对象FundMessageRecord</param>
	 */
	protected int fundMessageRecordDeleteByCondition(FundMessageRecordExample fundMessageRecordQueryCondition) {
		FundMessageRecordMapper mapperImpl = this.getSqlSession().getMapper(FundMessageRecordMapper.class);
		return mapperImpl.deleteByExample(fundMessageRecordQueryCondition);
	}
	
	/**
	 * <param name="fundMessageRecordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundMessageRecord> fundMessageRecordSelectObjects(FundMessageRecordExample fundMessageRecordQueryCondition) {
		FundMessageRecordMapper mapperImpl = this.getSqlSession().getMapper(FundMessageRecordMapper.class);
		return mapperImpl.selectByExample(fundMessageRecordQueryCondition);
	}
	
	/**
	 * <param name="fundMessageRecordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundMessageRecordQuerySelectObjectsCount(FundMessageRecordExample fundMessageRecordQueryCondition) {
		FundMessageRecordMapper mapperImpl = this.getSqlSession().getMapper(FundMessageRecordMapper.class);
		return mapperImpl.countByExample(fundMessageRecordQueryCondition);
	}
	
	/**
	 * 插入一个对象FundTradeParamConvert到数据库中
	 * <param name="FundTradeParamConvert">需要插入的FundTradeParamConvert</param>
	 */
	protected int fundTradeParamConvertInsert(FundTradeParamConvert fundTradeParamConvert) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		return mapperImpl.insertSelective(fundTradeParamConvert);
	}
	
	/**
	 * 更新一个对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	protected int fundTradeParamConvertUpdate(FundTradeParamConvert fundTradeParamConvert) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fundTradeParamConvert);
		return ret;
	}
	
	/**
	 * 更新一个对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	protected int fundTradeParamConvertUpdateSelective(FundTradeParamConvert fundTradeParamConvert) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fundTradeParamConvert);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 * <param name="fundTradeParamConvertQueryCondition">附加的条件</param>
	 */
	protected int fundTradeParamConvertUpdateByCondition(FundTradeParamConvert fundTradeParamConvert, FundTradeParamConvertExample fundTradeParamConvertQueryCondition) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		int ret = mapperImpl.updateByExample(fundTradeParamConvert, fundTradeParamConvertQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 * <param name="fundTradeParamConvertQueryCondition">附加的条件</param>
	 */
	protected int fundTradeParamConvertUpdateSelectiveByCondition(FundTradeParamConvert fundTradeParamConvert, FundTradeParamConvertExample fundTradeParamConvertQueryCondition) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fundTradeParamConvert, fundTradeParamConvertQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fundTradeParamConvert">从数据库中删除一个对象FundTradeParamConvert</param>
	 * <param name="AId">PK</param>
	 */
	protected int fundTradeParamConvertDeleteByPrimaryKey(String AId) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundTradeParamConvert">从数据库中删除一个对象FundTradeParamConvert</param>
	 */
	protected int fundTradeParamConvertDeleteByCondition(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		return mapperImpl.deleteByExample(fundTradeParamConvertQueryCondition);
	}
	
	/**
	 * <param name="fundTradeParamConvert">从数据库中查询一个对象FundTradeParamConvert</param>
	 * <param name="AId">PK</param>
	 */
	protected FundTradeParamConvert fundTradeParamConvertSelectByPrimaryKey(String AId) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fundTradeParamConvertQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundTradeParamConvert> fundTradeParamConvertSelectObjects(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		return mapperImpl.selectByExample(fundTradeParamConvertQueryCondition);
	}
	
	/**
	 * <param name="fundTradeParamConvertQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fundTradeParamConvertQuerySelectObjectsCount(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) {
		FundTradeParamConvertMapper mapperImpl = this.getSqlSession().getMapper(FundTradeParamConvertMapper.class);
		return mapperImpl.countByExample(fundTradeParamConvertQueryCondition);
	}
	
	/**
	 * <param name="vFundFundCategoryFundQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VFundFundCategoryFund> vFundFundCategoryFundSelectObjects(VFundFundCategoryFundExample vFundFundCategoryFundQueryCondition) {
		VFundFundCategoryFundMapper mapperImpl = this.getSqlSession().getMapper(VFundFundCategoryFundMapper.class);
		return mapperImpl.selectByExample(vFundFundCategoryFundQueryCondition);
	}
	
	/**
	 * <param name="vFundFundCategoryFundQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int vFundFundCategoryFundQuerySelectObjectsCount(VFundFundCategoryFundExample vFundFundCategoryFundQueryCondition) {
		VFundFundCategoryFundMapper mapperImpl = this.getSqlSession().getMapper(VFundFundCategoryFundMapper.class);
		return mapperImpl.countByExample(vFundFundCategoryFundQueryCondition);
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
