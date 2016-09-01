package topdeep.commonfund.entity.db;
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
	 * 插入一个对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要插入的新对象</param>
	 */
	int fundBankCardBinInsert(FundBankCardBin fundBankCardBin) throws CacheException;
	
	/**
	 * <param name="fundBankCardBin">从数据库中删除一个对象FundBankCardBin</param>
	 * <param name="AId">银行卡BinID</param>
	 */
	int fundBankCardBinDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundBankCardBin">从数据库中删除一个对象FundBankCardBin</param>
	 */
	int fundBankCardBinDeleteByCondition(FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	int fundBankCardBinUpdate(FundBankCardBin fundBankCardBin) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	int fundBankCardBinUpdateSelective(FundBankCardBin fundBankCardBin) throws CacheException;
	
	/**
	 * 更新一批对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBinQueryCondition">附加的条件</param>
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	int fundBankCardBinUpdateByCondition(FundBankCardBin fundBankCardBin, FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBinQueryCondition">附加的条件</param>
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	int fundBankCardBinUpdateSelectiveByCondition(FundBankCardBin fundBankCardBin, FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException;
	
	String getFundBankCardBinExampleConditionSql(FundBankCardBinExample fundBankCardBinQueryCondition);
	
	/**
	 * <param name="fundBankCardBin">从数据库中查询一个对象FundBankCardBin</param>
	 * <param name="AId">银行卡BinID</param>
	 */
	FundBankCardBin fundBankCardBinSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundBankCardBinQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundBankCardBin> fundBankCardBinSelectObjects(FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundBankCardBinQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundBankCardBinQuerySelectObjectsCount(FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要插入的新对象</param>
	 */
	int fundBindInfoInsert(FundBindInfo fundBindInfo) throws CacheException;
	
	/**
	 * <param name="fundBindInfo">从数据库中删除一个对象FundBindInfo</param>
	 * <param name="AFundBindInfoKey">绑定信息表 主键类</param>
	 */
	int fundBindInfoDeleteByPrimaryKey(FundBindInfoKey AFundBindInfoKey) throws CacheException;
	
	/**
	 * <param name="fundBindInfo">从数据库中删除一个对象FundBindInfo</param>
	 */
	int fundBindInfoDeleteByCondition(FundBindInfoExample fundBindInfoQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	int fundBindInfoUpdate(FundBindInfo fundBindInfo) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	int fundBindInfoUpdateSelective(FundBindInfo fundBindInfo) throws CacheException;
	
	/**
	 * 更新一批对象FundBindInfo到数据库中
	 * <param name="fundBindInfoQueryCondition">附加的条件</param>
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	int fundBindInfoUpdateByCondition(FundBindInfo fundBindInfo, FundBindInfoExample fundBindInfoQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundBindInfo到数据库中
	 * <param name="fundBindInfoQueryCondition">附加的条件</param>
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	int fundBindInfoUpdateSelectiveByCondition(FundBindInfo fundBindInfo, FundBindInfoExample fundBindInfoQueryCondition) throws CacheException;
	
	String getFundBindInfoExampleConditionSql(FundBindInfoExample fundBindInfoQueryCondition);
	
	/**
	 * <param name="fundBindInfo">从数据库中查询一个对象FundBindInfo</param>
	 * <param name="AFundBindInfoKey">绑定信息表 主键类</param>
	 */
	FundBindInfo fundBindInfoSelectByPrimaryKey(FundBindInfoKey AFundBindInfoKey) throws CacheException;
	
	/**
	 * <param name="fundBindInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundBindInfo> fundBindInfoSelectObjects(FundBindInfoExample fundBindInfoQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundBindInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundBindInfoQuerySelectObjectsCount(FundBindInfoExample fundBindInfoQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要插入的新对象</param>
	 */
	int fundCustMessageInsert(FundCustMessage fundCustMessage) throws CacheException;
	
	/**
	 * <param name="fundCustMessage">从数据库中删除一个对象FundCustMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	int fundCustMessageDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundCustMessage">从数据库中删除一个对象FundCustMessage</param>
	 */
	int fundCustMessageDeleteByCondition(FundCustMessageExample fundCustMessageQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	int fundCustMessageUpdate(FundCustMessage fundCustMessage) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	int fundCustMessageUpdateSelective(FundCustMessage fundCustMessage) throws CacheException;
	
	/**
	 * 更新一批对象FundCustMessage到数据库中
	 * <param name="fundCustMessageQueryCondition">附加的条件</param>
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	int fundCustMessageUpdateByCondition(FundCustMessage fundCustMessage, FundCustMessageExample fundCustMessageQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundCustMessage到数据库中
	 * <param name="fundCustMessageQueryCondition">附加的条件</param>
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	int fundCustMessageUpdateSelectiveByCondition(FundCustMessage fundCustMessage, FundCustMessageExample fundCustMessageQueryCondition) throws CacheException;
	
	String getFundCustMessageExampleConditionSql(FundCustMessageExample fundCustMessageQueryCondition);
	
	/**
	 * <param name="fundCustMessage">从数据库中查询一个对象FundCustMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	FundCustMessage fundCustMessageSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundCustMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundCustMessage> fundCustMessageSelectObjects(FundCustMessageExample fundCustMessageQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundCustMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundCustMessageQuerySelectObjectsCount(FundCustMessageExample fundCustMessageQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要插入的新对象</param>
	 */
	int fundCustomerLogInsert(FundCustomerLog fundCustomerLog) throws CacheException;
	
	/**
	 * <param name="fundCustomerLog">从数据库中删除一个对象FundCustomerLog</param>
	 * <param name="AId">主键</param>
	 */
	int fundCustomerLogDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundCustomerLog">从数据库中删除一个对象FundCustomerLog</param>
	 */
	int fundCustomerLogDeleteByCondition(FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	int fundCustomerLogUpdate(FundCustomerLog fundCustomerLog) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	int fundCustomerLogUpdateSelective(FundCustomerLog fundCustomerLog) throws CacheException;
	
	/**
	 * 更新一批对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLogQueryCondition">附加的条件</param>
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	int fundCustomerLogUpdateByCondition(FundCustomerLog fundCustomerLog, FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLogQueryCondition">附加的条件</param>
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	int fundCustomerLogUpdateSelectiveByCondition(FundCustomerLog fundCustomerLog, FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException;
	
	String getFundCustomerLogExampleConditionSql(FundCustomerLogExample fundCustomerLogQueryCondition);
	
	/**
	 * <param name="fundCustomerLog">从数据库中查询一个对象FundCustomerLog</param>
	 * <param name="AId">主键</param>
	 */
	FundCustomerLog fundCustomerLogSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundCustomerLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundCustomerLog> fundCustomerLogSelectObjects(FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundCustomerLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundCustomerLogQuerySelectObjectsCount(FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要插入的新对象</param>
	 */
	int fundCustomerPasswordInsert(FundCustomerPassword fundCustomerPassword) throws CacheException;
	
	/**
	 * <param name="fundCustomerPassword">从数据库中删除一个对象FundCustomerPassword</param>
	 * <param name="AId">PK</param>
	 */
	int fundCustomerPasswordDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundCustomerPassword">从数据库中删除一个对象FundCustomerPassword</param>
	 */
	int fundCustomerPasswordDeleteByCondition(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	int fundCustomerPasswordUpdate(FundCustomerPassword fundCustomerPassword) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	int fundCustomerPasswordUpdateSelective(FundCustomerPassword fundCustomerPassword) throws CacheException;
	
	/**
	 * 更新一批对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPasswordQueryCondition">附加的条件</param>
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	int fundCustomerPasswordUpdateByCondition(FundCustomerPassword fundCustomerPassword, FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPasswordQueryCondition">附加的条件</param>
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	int fundCustomerPasswordUpdateSelectiveByCondition(FundCustomerPassword fundCustomerPassword, FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException;
	
	String getFundCustomerPasswordExampleConditionSql(FundCustomerPasswordExample fundCustomerPasswordQueryCondition);
	
	/**
	 * <param name="fundCustomerPassword">从数据库中查询一个对象FundCustomerPassword</param>
	 * <param name="AId">PK</param>
	 */
	FundCustomerPassword fundCustomerPasswordSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundCustomerPasswordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundCustomerPassword> fundCustomerPasswordSelectObjects(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundCustomerPasswordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundCustomerPasswordQuerySelectObjectsCount(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要插入的新对象</param>
	 */
	int fundEcTradeSeatInsert(FundEcTradeSeat fundEcTradeSeat) throws CacheException;
	
	/**
	 * <param name="fundEcTradeSeat">从数据库中删除一个对象FundEcTradeSeat</param>
	 * <param name="AId">PK</param>
	 */
	int fundEcTradeSeatDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundEcTradeSeat">从数据库中删除一个对象FundEcTradeSeat</param>
	 */
	int fundEcTradeSeatDeleteByCondition(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	int fundEcTradeSeatUpdate(FundEcTradeSeat fundEcTradeSeat) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	int fundEcTradeSeatUpdateSelective(FundEcTradeSeat fundEcTradeSeat) throws CacheException;
	
	/**
	 * 更新一批对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeatQueryCondition">附加的条件</param>
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	int fundEcTradeSeatUpdateByCondition(FundEcTradeSeat fundEcTradeSeat, FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeatQueryCondition">附加的条件</param>
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	int fundEcTradeSeatUpdateSelectiveByCondition(FundEcTradeSeat fundEcTradeSeat, FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException;
	
	String getFundEcTradeSeatExampleConditionSql(FundEcTradeSeatExample fundEcTradeSeatQueryCondition);
	
	/**
	 * <param name="fundEcTradeSeat">从数据库中查询一个对象FundEcTradeSeat</param>
	 * <param name="AId">PK</param>
	 */
	FundEcTradeSeat fundEcTradeSeatSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundEcTradeSeatQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundEcTradeSeat> fundEcTradeSeatSelectObjects(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundEcTradeSeatQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundEcTradeSeatQuerySelectObjectsCount(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要插入的新对象</param>
	 */
	int fundFundCatagoryFundRelaInsert(FundFundCatagoryFundRela fundFundCatagoryFundRela) throws CacheException;
	
	/**
	 * <param name="fundFundCatagoryFundRela">从数据库中删除一个对象FundFundCatagoryFundRela</param>
	 * <param name="AFundFundCatagoryFundRelaKey">分类基金关联表 主键类</param>
	 */
	int fundFundCatagoryFundRelaDeleteByPrimaryKey(FundFundCatagoryFundRelaKey AFundFundCatagoryFundRelaKey) throws CacheException;
	
	/**
	 * <param name="fundFundCatagoryFundRela">从数据库中删除一个对象FundFundCatagoryFundRela</param>
	 */
	int fundFundCatagoryFundRelaDeleteByCondition(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	int fundFundCatagoryFundRelaUpdate(FundFundCatagoryFundRela fundFundCatagoryFundRela) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	int fundFundCatagoryFundRelaUpdateSelective(FundFundCatagoryFundRela fundFundCatagoryFundRela) throws CacheException;
	
	/**
	 * 更新一批对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加的条件</param>
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	int fundFundCatagoryFundRelaUpdateByCondition(FundFundCatagoryFundRela fundFundCatagoryFundRela, FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加的条件</param>
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	int fundFundCatagoryFundRelaUpdateSelectiveByCondition(FundFundCatagoryFundRela fundFundCatagoryFundRela, FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException;
	
	String getFundFundCatagoryFundRelaExampleConditionSql(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition);
	
	/**
	 * <param name="fundFundCatagoryFundRela">从数据库中查询一个对象FundFundCatagoryFundRela</param>
	 * <param name="AFundFundCatagoryFundRelaKey">分类基金关联表 主键类</param>
	 */
	FundFundCatagoryFundRela fundFundCatagoryFundRelaSelectByPrimaryKey(FundFundCatagoryFundRelaKey AFundFundCatagoryFundRelaKey) throws CacheException;
	
	/**
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundFundCatagoryFundRela> fundFundCatagoryFundRelaSelectObjects(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundFundCatagoryFundRelaQuerySelectObjectsCount(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要插入的新对象</param>
	 */
	int fundFundCategoryInsert(FundFundCategory fundFundCategory) throws CacheException;
	
	/**
	 * <param name="fundFundCategory">从数据库中删除一个对象FundFundCategory</param>
	 * <param name="AId">分类ID</param>
	 */
	int fundFundCategoryDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundFundCategory">从数据库中删除一个对象FundFundCategory</param>
	 */
	int fundFundCategoryDeleteByCondition(FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	int fundFundCategoryUpdate(FundFundCategory fundFundCategory) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	int fundFundCategoryUpdateSelective(FundFundCategory fundFundCategory) throws CacheException;
	
	/**
	 * 更新一批对象FundFundCategory到数据库中
	 * <param name="fundFundCategoryQueryCondition">附加的条件</param>
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	int fundFundCategoryUpdateByCondition(FundFundCategory fundFundCategory, FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundFundCategory到数据库中
	 * <param name="fundFundCategoryQueryCondition">附加的条件</param>
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	int fundFundCategoryUpdateSelectiveByCondition(FundFundCategory fundFundCategory, FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException;
	
	String getFundFundCategoryExampleConditionSql(FundFundCategoryExample fundFundCategoryQueryCondition);
	
	/**
	 * <param name="fundFundCategory">从数据库中查询一个对象FundFundCategory</param>
	 * <param name="AId">分类ID</param>
	 */
	FundFundCategory fundFundCategorySelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundFundCategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundFundCategory> fundFundCategorySelectObjects(FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundFundCategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundFundCategoryQuerySelectObjectsCount(FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要插入的新对象</param>
	 */
	int fundFundInfoInsert(FundFundInfo fundFundInfo) throws CacheException;
	
	/**
	 * <param name="fundFundInfo">从数据库中删除一个对象FundFundInfo</param>
	 * <param name="AFundCode">基金代码</param>
	 */
	int fundFundInfoDeleteByPrimaryKey(String AFundCode) throws CacheException;
	
	/**
	 * <param name="fundFundInfo">从数据库中删除一个对象FundFundInfo</param>
	 */
	int fundFundInfoDeleteByCondition(FundFundInfoExample fundFundInfoQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	int fundFundInfoUpdate(FundFundInfo fundFundInfo) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	int fundFundInfoUpdateSelective(FundFundInfo fundFundInfo) throws CacheException;
	
	/**
	 * 更新一批对象FundFundInfo到数据库中
	 * <param name="fundFundInfoQueryCondition">附加的条件</param>
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	int fundFundInfoUpdateByCondition(FundFundInfo fundFundInfo, FundFundInfoExample fundFundInfoQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundFundInfo到数据库中
	 * <param name="fundFundInfoQueryCondition">附加的条件</param>
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	int fundFundInfoUpdateSelectiveByCondition(FundFundInfo fundFundInfo, FundFundInfoExample fundFundInfoQueryCondition) throws CacheException;
	
	String getFundFundInfoExampleConditionSql(FundFundInfoExample fundFundInfoQueryCondition);
	
	/**
	 * <param name="fundFundInfo">从数据库中查询一个对象FundFundInfo</param>
	 * <param name="AFundCode">基金代码</param>
	 */
	FundFundInfo fundFundInfoSelectByPrimaryKey(String AFundCode) throws CacheException;
	
	/**
	 * <param name="fundFundInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundFundInfo> fundFundInfoSelectObjects(FundFundInfoExample fundFundInfoQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundFundInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundFundInfoQuerySelectObjectsCount(FundFundInfoExample fundFundInfoQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要插入的新对象</param>
	 */
	int fundFundPropertyInsert(FundFundProperty fundFundProperty) throws CacheException;
	
	/**
	 * <param name="fundFundProperty">从数据库中删除一个对象FundFundProperty</param>
	 * <param name="AFundFundPropertyKey">基金属性表 主键类</param>
	 */
	int fundFundPropertyDeleteByPrimaryKey(FundFundPropertyKey AFundFundPropertyKey) throws CacheException;
	
	/**
	 * <param name="fundFundProperty">从数据库中删除一个对象FundFundProperty</param>
	 */
	int fundFundPropertyDeleteByCondition(FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	int fundFundPropertyUpdate(FundFundProperty fundFundProperty) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	int fundFundPropertyUpdateSelective(FundFundProperty fundFundProperty) throws CacheException;
	
	/**
	 * 更新一批对象FundFundProperty到数据库中
	 * <param name="fundFundPropertyQueryCondition">附加的条件</param>
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	int fundFundPropertyUpdateByCondition(FundFundProperty fundFundProperty, FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundFundProperty到数据库中
	 * <param name="fundFundPropertyQueryCondition">附加的条件</param>
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	int fundFundPropertyUpdateSelectiveByCondition(FundFundProperty fundFundProperty, FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException;
	
	String getFundFundPropertyExampleConditionSql(FundFundPropertyExample fundFundPropertyQueryCondition);
	
	/**
	 * <param name="fundFundProperty">从数据库中查询一个对象FundFundProperty</param>
	 * <param name="AFundFundPropertyKey">基金属性表 主键类</param>
	 */
	FundFundProperty fundFundPropertySelectByPrimaryKey(FundFundPropertyKey AFundFundPropertyKey) throws CacheException;
	
	/**
	 * <param name="fundFundPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundFundProperty> fundFundPropertySelectObjects(FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundFundPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundFundPropertyQuerySelectObjectsCount(FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundMessageRecord到数据库中
	 * <param name="fundMessageRecord">需要插入的新对象</param>
	 */
	int fundMessageRecordInsert(FundMessageRecord fundMessageRecord) throws CacheException;
	
	/**
	 * <param name="fundMessageRecord">从数据库中删除一个对象FundMessageRecord</param>
	 */
	int fundMessageRecordDeleteByCondition(FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundMessageRecord到数据库中
	 * <param name="fundMessageRecordQueryCondition">附加的条件</param>
	 * <param name="fundMessageRecord">需要更新的FundMessageRecord</param>
	 */
	int fundMessageRecordUpdateByCondition(FundMessageRecord fundMessageRecord, FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundMessageRecord到数据库中
	 * <param name="fundMessageRecordQueryCondition">附加的条件</param>
	 * <param name="fundMessageRecord">需要更新的FundMessageRecord</param>
	 */
	int fundMessageRecordUpdateSelectiveByCondition(FundMessageRecord fundMessageRecord, FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException;
	
	String getFundMessageRecordExampleConditionSql(FundMessageRecordExample fundMessageRecordQueryCondition);
	
	/**
	 * <param name="fundMessageRecordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundMessageRecord> fundMessageRecordSelectObjects(FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundMessageRecordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundMessageRecordQuerySelectObjectsCount(FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException;
	
	/**
	 * 插入一个对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要插入的新对象</param>
	 */
	int fundTradeParamConvertInsert(FundTradeParamConvert fundTradeParamConvert) throws CacheException;
	
	/**
	 * <param name="fundTradeParamConvert">从数据库中删除一个对象FundTradeParamConvert</param>
	 * <param name="AId">PK</param>
	 */
	int fundTradeParamConvertDeleteByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundTradeParamConvert">从数据库中删除一个对象FundTradeParamConvert</param>
	 */
	int fundTradeParamConvertDeleteByCondition(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException;
	
	/**
	 * 更新一个对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	int fundTradeParamConvertUpdate(FundTradeParamConvert fundTradeParamConvert) throws CacheException;
	
	/**
	 * 更新一个对象的部分属性FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	int fundTradeParamConvertUpdateSelective(FundTradeParamConvert fundTradeParamConvert) throws CacheException;
	
	/**
	 * 更新一批对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvertQueryCondition">附加的条件</param>
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	int fundTradeParamConvertUpdateByCondition(FundTradeParamConvert fundTradeParamConvert, FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException;
	
	/**
	 * 更新一批对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvertQueryCondition">附加的条件</param>
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	int fundTradeParamConvertUpdateSelectiveByCondition(FundTradeParamConvert fundTradeParamConvert, FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException;
	
	String getFundTradeParamConvertExampleConditionSql(FundTradeParamConvertExample fundTradeParamConvertQueryCondition);
	
	/**
	 * <param name="fundTradeParamConvert">从数据库中查询一个对象FundTradeParamConvert</param>
	 * <param name="AId">PK</param>
	 */
	FundTradeParamConvert fundTradeParamConvertSelectByPrimaryKey(String AId) throws CacheException;
	
	/**
	 * <param name="fundTradeParamConvertQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<FundTradeParamConvert> fundTradeParamConvertSelectObjects(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException;
	
	/**
	 * <param name="fundTradeParamConvertQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int fundTradeParamConvertQuerySelectObjectsCount(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException;
	
	String getVFundFundCategoryFundExampleConditionSql(VFundFundCategoryFundExample vFundFundCategoryFundQueryCondition);
	
	/**
	 * <param name="vFundFundCategoryFundQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VFundFundCategoryFund> vFundFundCategoryFundSelectObjects(VFundFundCategoryFundExample vFundFundCategoryFundQueryCondition) throws CacheException;
	
	/**
	 * <param name="vFundFundCategoryFundQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vFundFundCategoryFundQuerySelectObjectsCount(VFundFundCategoryFundExample vFundFundCategoryFundQueryCondition) throws CacheException;
	
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
