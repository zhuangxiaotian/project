package topdeep.commonfund.entity.db;
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
	 * 插入一个对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要插入的新对象</param>
	 */
	public int fundBankCardBinInsert(FundBankCardBin fundBankCardBin) throws CacheException {
		int ret = this.getDao().fundBankCardBinInsert(fundBankCardBin);
		if (this.needCache("T_FUND_BANK_CARD_BIN")) {
			this.getCache().clear("T_FUND_BANK_CARD_BIN");
		}
		String kvalue = "";
		kvalue = (kvalue + fundBankCardBin.getId());
		this.operatesLogSimpleAdd("T_FUND_BANK_CARD_BIN", "插入", "ID", kvalue, fundBankCardBin, ret);
		return ret;
	}
	
	/**
	 * <param name="fundBankCardBin">从数据库中删除一个对象FundBankCardBin</param>
	 * <param name="AId">银行卡BinID</param>
	 */
	public int fundBankCardBinDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().fundBankCardBinDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BANK_CARD_BIN")) {
				this.getCache().clear("T_FUND_BANK_CARD_BIN");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_FUND_BANK_CARD_BIN", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="fundBankCardBin">从数据库中删除一个对象FundBankCardBin</param>
	 */
	public int fundBankCardBinDeleteByCondition(FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException {
		int ret = this.getDao().fundBankCardBinDeleteByCondition(fundBankCardBinQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BANK_CARD_BIN")) {
				this.getCache().clear("T_FUND_BANK_CARD_BIN");
			}
		}
		String kvalue = this.getFundBankCardBinExampleConditionSql(fundBankCardBinQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_BANK_CARD_BIN", "条件删除", "conditionSql", kvalue, fundBankCardBinQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	public int fundBankCardBinUpdate(FundBankCardBin fundBankCardBin) throws CacheException {
		int ret = this.getDao().fundBankCardBinUpdate(fundBankCardBin);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BANK_CARD_BIN")) {
				this.getCache().clear("T_FUND_BANK_CARD_BIN");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundBankCardBin.getId());
		this.operatesLogSimpleAdd("T_FUND_BANK_CARD_BIN", "更新", "ID", kvalue, fundBankCardBin, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundBankCardBin到数据库中
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	public int fundBankCardBinUpdateSelective(FundBankCardBin fundBankCardBin) throws CacheException {
		int ret = this.getDao().fundBankCardBinUpdateSelective(fundBankCardBin);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BANK_CARD_BIN")) {
				this.getCache().clear("T_FUND_BANK_CARD_BIN");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundBankCardBin.getId());
		this.operatesLogSimpleAdd("T_FUND_BANK_CARD_BIN", "部分更新", "ID", kvalue, fundBankCardBin, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBinQueryCondition">附加的条件</param>
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	public int fundBankCardBinUpdateByCondition(FundBankCardBin fundBankCardBin, FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException {
		int ret = this.getDao().fundBankCardBinUpdateByCondition(fundBankCardBin, fundBankCardBinQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BANK_CARD_BIN")) {
				this.getCache().clear("T_FUND_BANK_CARD_BIN");
			}
		}
		String kvalue = this.getFundBankCardBinExampleConditionSql(fundBankCardBinQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_BANK_CARD_BIN", "条件更新", "conditionSql", kvalue, fundBankCardBin, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundBankCardBin到数据库中
	 * <param name="fundBankCardBinQueryCondition">附加的条件</param>
	 * <param name="fundBankCardBin">需要更新的FundBankCardBin</param>
	 */
	public int fundBankCardBinUpdateSelectiveByCondition(FundBankCardBin fundBankCardBin, FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException {
		int ret = this.getDao().fundBankCardBinUpdateSelectiveByCondition(fundBankCardBin, fundBankCardBinQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BANK_CARD_BIN")) {
				this.getCache().clear("T_FUND_BANK_CARD_BIN");
			}
		}
		String kvalue = this.getFundBankCardBinExampleConditionSql(fundBankCardBinQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_BANK_CARD_BIN", "批量部分更新", "conditionSql", kvalue, fundBankCardBin, ret);
		return ret;
	}
	
	public String getFundBankCardBinExampleConditionSql(FundBankCardBinExample fundBankCardBinQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundBankCardBinQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundBankCardBinExample.Criteria item = fundBankCardBinQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundBankCardBinExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundBankCardBin">从数据库中查询一个对象FundBankCardBin</param>
	 * <param name="AId">银行卡BinID</param>
	 */
	public FundBankCardBin fundBankCardBinSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_FUND_BANK_CARD_BIN")) {
			String key = ("T_FUND_BANK_CARD_BIN_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			FundBankCardBin obj = ((FundBankCardBin)(this.getCache().get("T_FUND_BANK_CARD_BIN", key)));
			if ((obj == null)) {
				obj = this.getDao().fundBankCardBinSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_FUND_BANK_CARD_BIN", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundBankCardBinSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="fundBankCardBinQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundBankCardBin> fundBankCardBinSelectObjects(FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_BANK_CARD_BIN")) {
			String key = ("T_FUND_BANK_CARD_BIN_" 
						+ ("queryObject_" + this.getFundBankCardBinExampleConditionSql(fundBankCardBinQueryCondition)));
			List<FundBankCardBin> obj = ((List<FundBankCardBin>)(this.getCache().get("T_FUND_BANK_CARD_BIN", key)));
			if ((obj == null)) {
				obj = this.getDao().fundBankCardBinSelectObjects(fundBankCardBinQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_BANK_CARD_BIN", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundBankCardBinSelectObjects(fundBankCardBinQueryCondition);
		}
	}
	
	/**
	 * <param name="fundBankCardBinQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundBankCardBinQuerySelectObjectsCount(FundBankCardBinExample fundBankCardBinQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_BANK_CARD_BIN")) {
			String key = ("T_FUND_BANK_CARD_BIN_" 
						+ ("queryCount_" + this.getFundBankCardBinExampleConditionSql(fundBankCardBinQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_BANK_CARD_BIN", key)));
			if ((obj == null)) {
				obj = this.getDao().fundBankCardBinQuerySelectObjectsCount(fundBankCardBinQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_BANK_CARD_BIN", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundBankCardBinQuerySelectObjectsCount(fundBankCardBinQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要插入的新对象</param>
	 */
	public int fundBindInfoInsert(FundBindInfo fundBindInfo) throws CacheException {
		int ret = this.getDao().fundBindInfoInsert(fundBindInfo);
		if (this.needCache("T_FUND_BIND_INFO")) {
			this.getCache().clear("T_FUND_BIND_INFO");
		}
		String kvalue = "";
		kvalue = (kvalue + fundBindInfo.getBindSrc());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundBindInfo.getOpenid());
		this.operatesLogSimpleAdd("T_FUND_BIND_INFO", "插入", "BIND_SRC,OPENID", kvalue, fundBindInfo, ret);
		return ret;
	}
	
	/**
	 * <param name="fundBindInfo">从数据库中删除一个对象FundBindInfo</param>
	 * <param name="AFundBindInfoKey">绑定信息表 主键类</param>
	 */
	public int fundBindInfoDeleteByPrimaryKey(FundBindInfoKey AFundBindInfoKey) throws CacheException {
		int ret = this.getDao().fundBindInfoDeleteByPrimaryKey(AFundBindInfoKey);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BIND_INFO")) {
				this.getCache().clear("T_FUND_BIND_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AFundBindInfoKey.getBindSrc());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + AFundBindInfoKey.getOpenid());
		this.operatesLogSimpleAdd("T_FUND_BIND_INFO", "删除", "BIND_SRC,OPENID", kvalue, AFundBindInfoKey, ret);
		return ret;
	}
	
	/**
	 * <param name="fundBindInfo">从数据库中删除一个对象FundBindInfo</param>
	 */
	public int fundBindInfoDeleteByCondition(FundBindInfoExample fundBindInfoQueryCondition) throws CacheException {
		int ret = this.getDao().fundBindInfoDeleteByCondition(fundBindInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BIND_INFO")) {
				this.getCache().clear("T_FUND_BIND_INFO");
			}
		}
		String kvalue = this.getFundBindInfoExampleConditionSql(fundBindInfoQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_BIND_INFO", "条件删除", "conditionSql", kvalue, fundBindInfoQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	public int fundBindInfoUpdate(FundBindInfo fundBindInfo) throws CacheException {
		int ret = this.getDao().fundBindInfoUpdate(fundBindInfo);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BIND_INFO")) {
				this.getCache().clear("T_FUND_BIND_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundBindInfo.getBindSrc());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundBindInfo.getOpenid());
		this.operatesLogSimpleAdd("T_FUND_BIND_INFO", "更新", "BIND_SRC,OPENID", kvalue, fundBindInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundBindInfo到数据库中
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	public int fundBindInfoUpdateSelective(FundBindInfo fundBindInfo) throws CacheException {
		int ret = this.getDao().fundBindInfoUpdateSelective(fundBindInfo);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BIND_INFO")) {
				this.getCache().clear("T_FUND_BIND_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundBindInfo.getBindSrc());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundBindInfo.getOpenid());
		this.operatesLogSimpleAdd("T_FUND_BIND_INFO", "部分更新", "BIND_SRC,OPENID", kvalue, fundBindInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundBindInfo到数据库中
	 * <param name="fundBindInfoQueryCondition">附加的条件</param>
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	public int fundBindInfoUpdateByCondition(FundBindInfo fundBindInfo, FundBindInfoExample fundBindInfoQueryCondition) throws CacheException {
		int ret = this.getDao().fundBindInfoUpdateByCondition(fundBindInfo, fundBindInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BIND_INFO")) {
				this.getCache().clear("T_FUND_BIND_INFO");
			}
		}
		String kvalue = this.getFundBindInfoExampleConditionSql(fundBindInfoQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_BIND_INFO", "条件更新", "conditionSql", kvalue, fundBindInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundBindInfo到数据库中
	 * <param name="fundBindInfoQueryCondition">附加的条件</param>
	 * <param name="fundBindInfo">需要更新的FundBindInfo</param>
	 */
	public int fundBindInfoUpdateSelectiveByCondition(FundBindInfo fundBindInfo, FundBindInfoExample fundBindInfoQueryCondition) throws CacheException {
		int ret = this.getDao().fundBindInfoUpdateSelectiveByCondition(fundBindInfo, fundBindInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_BIND_INFO")) {
				this.getCache().clear("T_FUND_BIND_INFO");
			}
		}
		String kvalue = this.getFundBindInfoExampleConditionSql(fundBindInfoQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_BIND_INFO", "批量部分更新", "conditionSql", kvalue, fundBindInfo, ret);
		return ret;
	}
	
	public String getFundBindInfoExampleConditionSql(FundBindInfoExample fundBindInfoQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundBindInfoQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundBindInfoExample.Criteria item = fundBindInfoQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundBindInfoExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundBindInfo">从数据库中查询一个对象FundBindInfo</param>
	 * <param name="AFundBindInfoKey">绑定信息表 主键类</param>
	 */
	public FundBindInfo fundBindInfoSelectByPrimaryKey(FundBindInfoKey AFundBindInfoKey) throws CacheException {
		if (this.needCache("T_FUND_BIND_INFO")) {
			String key = ("T_FUND_BIND_INFO_" + "_BYUNIINDEX_");
			FundBindInfo obj = ((FundBindInfo)(this.getCache().get("T_FUND_BIND_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().fundBindInfoSelectByPrimaryKey(AFundBindInfoKey);
				if ((obj != null)) {
					this.getCache().put("T_FUND_BIND_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundBindInfoSelectByPrimaryKey(AFundBindInfoKey);
		}
	}
	
	/**
	 * <param name="fundBindInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundBindInfo> fundBindInfoSelectObjects(FundBindInfoExample fundBindInfoQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_BIND_INFO")) {
			String key = ("T_FUND_BIND_INFO_" 
						+ ("queryObject_" + this.getFundBindInfoExampleConditionSql(fundBindInfoQueryCondition)));
			List<FundBindInfo> obj = ((List<FundBindInfo>)(this.getCache().get("T_FUND_BIND_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().fundBindInfoSelectObjects(fundBindInfoQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_BIND_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundBindInfoSelectObjects(fundBindInfoQueryCondition);
		}
	}
	
	/**
	 * <param name="fundBindInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundBindInfoQuerySelectObjectsCount(FundBindInfoExample fundBindInfoQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_BIND_INFO")) {
			String key = ("T_FUND_BIND_INFO_" 
						+ ("queryCount_" + this.getFundBindInfoExampleConditionSql(fundBindInfoQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_BIND_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().fundBindInfoQuerySelectObjectsCount(fundBindInfoQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_BIND_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundBindInfoQuerySelectObjectsCount(fundBindInfoQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要插入的新对象</param>
	 */
	public int fundCustMessageInsert(FundCustMessage fundCustMessage) throws CacheException {
		int ret = this.getDao().fundCustMessageInsert(fundCustMessage);
		if (this.needCache("T_FUND_CUST_MESSAGE")) {
			this.getCache().clear("T_FUND_CUST_MESSAGE");
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustMessage.getId());
		this.operatesLogSimpleAdd("T_FUND_CUST_MESSAGE", "插入", "ID", kvalue, fundCustMessage, ret);
		return ret;
	}
	
	/**
	 * <param name="fundCustMessage">从数据库中删除一个对象FundCustMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	public int fundCustMessageDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().fundCustMessageDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUST_MESSAGE")) {
				this.getCache().clear("T_FUND_CUST_MESSAGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_FUND_CUST_MESSAGE", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="fundCustMessage">从数据库中删除一个对象FundCustMessage</param>
	 */
	public int fundCustMessageDeleteByCondition(FundCustMessageExample fundCustMessageQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustMessageDeleteByCondition(fundCustMessageQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUST_MESSAGE")) {
				this.getCache().clear("T_FUND_CUST_MESSAGE");
			}
		}
		String kvalue = this.getFundCustMessageExampleConditionSql(fundCustMessageQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUST_MESSAGE", "条件删除", "conditionSql", kvalue, fundCustMessageQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	public int fundCustMessageUpdate(FundCustMessage fundCustMessage) throws CacheException {
		int ret = this.getDao().fundCustMessageUpdate(fundCustMessage);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUST_MESSAGE")) {
				this.getCache().clear("T_FUND_CUST_MESSAGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustMessage.getId());
		this.operatesLogSimpleAdd("T_FUND_CUST_MESSAGE", "更新", "ID", kvalue, fundCustMessage, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundCustMessage到数据库中
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	public int fundCustMessageUpdateSelective(FundCustMessage fundCustMessage) throws CacheException {
		int ret = this.getDao().fundCustMessageUpdateSelective(fundCustMessage);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUST_MESSAGE")) {
				this.getCache().clear("T_FUND_CUST_MESSAGE");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustMessage.getId());
		this.operatesLogSimpleAdd("T_FUND_CUST_MESSAGE", "部分更新", "ID", kvalue, fundCustMessage, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundCustMessage到数据库中
	 * <param name="fundCustMessageQueryCondition">附加的条件</param>
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	public int fundCustMessageUpdateByCondition(FundCustMessage fundCustMessage, FundCustMessageExample fundCustMessageQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustMessageUpdateByCondition(fundCustMessage, fundCustMessageQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUST_MESSAGE")) {
				this.getCache().clear("T_FUND_CUST_MESSAGE");
			}
		}
		String kvalue = this.getFundCustMessageExampleConditionSql(fundCustMessageQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUST_MESSAGE", "条件更新", "conditionSql", kvalue, fundCustMessage, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundCustMessage到数据库中
	 * <param name="fundCustMessageQueryCondition">附加的条件</param>
	 * <param name="fundCustMessage">需要更新的FundCustMessage</param>
	 */
	public int fundCustMessageUpdateSelectiveByCondition(FundCustMessage fundCustMessage, FundCustMessageExample fundCustMessageQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustMessageUpdateSelectiveByCondition(fundCustMessage, fundCustMessageQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUST_MESSAGE")) {
				this.getCache().clear("T_FUND_CUST_MESSAGE");
			}
		}
		String kvalue = this.getFundCustMessageExampleConditionSql(fundCustMessageQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUST_MESSAGE", "批量部分更新", "conditionSql", kvalue, fundCustMessage, ret);
		return ret;
	}
	
	public String getFundCustMessageExampleConditionSql(FundCustMessageExample fundCustMessageQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundCustMessageQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundCustMessageExample.Criteria item = fundCustMessageQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundCustMessageExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundCustMessage">从数据库中查询一个对象FundCustMessage</param>
	 * <param name="AId">消息ID</param>
	 */
	public FundCustMessage fundCustMessageSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_FUND_CUST_MESSAGE")) {
			String key = ("T_FUND_CUST_MESSAGE_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			FundCustMessage obj = ((FundCustMessage)(this.getCache().get("T_FUND_CUST_MESSAGE", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustMessageSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUST_MESSAGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustMessageSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="fundCustMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundCustMessage> fundCustMessageSelectObjects(FundCustMessageExample fundCustMessageQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_CUST_MESSAGE")) {
			String key = ("T_FUND_CUST_MESSAGE_" 
						+ ("queryObject_" + this.getFundCustMessageExampleConditionSql(fundCustMessageQueryCondition)));
			List<FundCustMessage> obj = ((List<FundCustMessage>)(this.getCache().get("T_FUND_CUST_MESSAGE", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustMessageSelectObjects(fundCustMessageQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUST_MESSAGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustMessageSelectObjects(fundCustMessageQueryCondition);
		}
	}
	
	/**
	 * <param name="fundCustMessageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundCustMessageQuerySelectObjectsCount(FundCustMessageExample fundCustMessageQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_CUST_MESSAGE")) {
			String key = ("T_FUND_CUST_MESSAGE_" 
						+ ("queryCount_" + this.getFundCustMessageExampleConditionSql(fundCustMessageQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_CUST_MESSAGE", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustMessageQuerySelectObjectsCount(fundCustMessageQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUST_MESSAGE", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustMessageQuerySelectObjectsCount(fundCustMessageQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要插入的新对象</param>
	 */
	public int fundCustomerLogInsert(FundCustomerLog fundCustomerLog) throws CacheException {
		int ret = this.getDao().fundCustomerLogInsert(fundCustomerLog);
		if (this.needCache("T_FUND_CUSTOMER_LOG")) {
			this.getCache().clear("T_FUND_CUSTOMER_LOG");
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustomerLog.getId());
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_LOG", "插入", "ID", kvalue, fundCustomerLog, ret);
		return ret;
	}
	
	/**
	 * <param name="fundCustomerLog">从数据库中删除一个对象FundCustomerLog</param>
	 * <param name="AId">主键</param>
	 */
	public int fundCustomerLogDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().fundCustomerLogDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_LOG")) {
				this.getCache().clear("T_FUND_CUSTOMER_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_LOG", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="fundCustomerLog">从数据库中删除一个对象FundCustomerLog</param>
	 */
	public int fundCustomerLogDeleteByCondition(FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustomerLogDeleteByCondition(fundCustomerLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_LOG")) {
				this.getCache().clear("T_FUND_CUSTOMER_LOG");
			}
		}
		String kvalue = this.getFundCustomerLogExampleConditionSql(fundCustomerLogQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_LOG", "条件删除", "conditionSql", kvalue, fundCustomerLogQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	public int fundCustomerLogUpdate(FundCustomerLog fundCustomerLog) throws CacheException {
		int ret = this.getDao().fundCustomerLogUpdate(fundCustomerLog);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_LOG")) {
				this.getCache().clear("T_FUND_CUSTOMER_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustomerLog.getId());
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_LOG", "更新", "ID", kvalue, fundCustomerLog, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundCustomerLog到数据库中
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	public int fundCustomerLogUpdateSelective(FundCustomerLog fundCustomerLog) throws CacheException {
		int ret = this.getDao().fundCustomerLogUpdateSelective(fundCustomerLog);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_LOG")) {
				this.getCache().clear("T_FUND_CUSTOMER_LOG");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustomerLog.getId());
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_LOG", "部分更新", "ID", kvalue, fundCustomerLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLogQueryCondition">附加的条件</param>
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	public int fundCustomerLogUpdateByCondition(FundCustomerLog fundCustomerLog, FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustomerLogUpdateByCondition(fundCustomerLog, fundCustomerLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_LOG")) {
				this.getCache().clear("T_FUND_CUSTOMER_LOG");
			}
		}
		String kvalue = this.getFundCustomerLogExampleConditionSql(fundCustomerLogQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_LOG", "条件更新", "conditionSql", kvalue, fundCustomerLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundCustomerLog到数据库中
	 * <param name="fundCustomerLogQueryCondition">附加的条件</param>
	 * <param name="fundCustomerLog">需要更新的FundCustomerLog</param>
	 */
	public int fundCustomerLogUpdateSelectiveByCondition(FundCustomerLog fundCustomerLog, FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustomerLogUpdateSelectiveByCondition(fundCustomerLog, fundCustomerLogQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_LOG")) {
				this.getCache().clear("T_FUND_CUSTOMER_LOG");
			}
		}
		String kvalue = this.getFundCustomerLogExampleConditionSql(fundCustomerLogQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_LOG", "批量部分更新", "conditionSql", kvalue, fundCustomerLog, ret);
		return ret;
	}
	
	public String getFundCustomerLogExampleConditionSql(FundCustomerLogExample fundCustomerLogQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundCustomerLogQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundCustomerLogExample.Criteria item = fundCustomerLogQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundCustomerLogExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundCustomerLog">从数据库中查询一个对象FundCustomerLog</param>
	 * <param name="AId">主键</param>
	 */
	public FundCustomerLog fundCustomerLogSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_FUND_CUSTOMER_LOG")) {
			String key = ("T_FUND_CUSTOMER_LOG_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			FundCustomerLog obj = ((FundCustomerLog)(this.getCache().get("T_FUND_CUSTOMER_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustomerLogSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUSTOMER_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustomerLogSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="fundCustomerLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundCustomerLog> fundCustomerLogSelectObjects(FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_CUSTOMER_LOG")) {
			String key = ("T_FUND_CUSTOMER_LOG_" 
						+ ("queryObject_" + this.getFundCustomerLogExampleConditionSql(fundCustomerLogQueryCondition)));
			List<FundCustomerLog> obj = ((List<FundCustomerLog>)(this.getCache().get("T_FUND_CUSTOMER_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustomerLogSelectObjects(fundCustomerLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUSTOMER_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustomerLogSelectObjects(fundCustomerLogQueryCondition);
		}
	}
	
	/**
	 * <param name="fundCustomerLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundCustomerLogQuerySelectObjectsCount(FundCustomerLogExample fundCustomerLogQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_CUSTOMER_LOG")) {
			String key = ("T_FUND_CUSTOMER_LOG_" 
						+ ("queryCount_" + this.getFundCustomerLogExampleConditionSql(fundCustomerLogQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_CUSTOMER_LOG", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustomerLogQuerySelectObjectsCount(fundCustomerLogQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUSTOMER_LOG", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustomerLogQuerySelectObjectsCount(fundCustomerLogQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要插入的新对象</param>
	 */
	public int fundCustomerPasswordInsert(FundCustomerPassword fundCustomerPassword) throws CacheException {
		int ret = this.getDao().fundCustomerPasswordInsert(fundCustomerPassword);
		if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
			this.getCache().clear("T_FUND_CUSTOMER_PASSWORD");
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustomerPassword.getId());
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_PASSWORD", "插入", "ID", kvalue, fundCustomerPassword, ret);
		return ret;
	}
	
	/**
	 * <param name="fundCustomerPassword">从数据库中删除一个对象FundCustomerPassword</param>
	 * <param name="AId">PK</param>
	 */
	public int fundCustomerPasswordDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().fundCustomerPasswordDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
				this.getCache().clear("T_FUND_CUSTOMER_PASSWORD");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_PASSWORD", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="fundCustomerPassword">从数据库中删除一个对象FundCustomerPassword</param>
	 */
	public int fundCustomerPasswordDeleteByCondition(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustomerPasswordDeleteByCondition(fundCustomerPasswordQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
				this.getCache().clear("T_FUND_CUSTOMER_PASSWORD");
			}
		}
		String kvalue = this.getFundCustomerPasswordExampleConditionSql(fundCustomerPasswordQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_PASSWORD", "条件删除", "conditionSql", kvalue, fundCustomerPasswordQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	public int fundCustomerPasswordUpdate(FundCustomerPassword fundCustomerPassword) throws CacheException {
		int ret = this.getDao().fundCustomerPasswordUpdate(fundCustomerPassword);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
				this.getCache().clear("T_FUND_CUSTOMER_PASSWORD");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustomerPassword.getId());
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_PASSWORD", "更新", "ID", kvalue, fundCustomerPassword, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundCustomerPassword到数据库中
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	public int fundCustomerPasswordUpdateSelective(FundCustomerPassword fundCustomerPassword) throws CacheException {
		int ret = this.getDao().fundCustomerPasswordUpdateSelective(fundCustomerPassword);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
				this.getCache().clear("T_FUND_CUSTOMER_PASSWORD");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundCustomerPassword.getId());
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_PASSWORD", "部分更新", "ID", kvalue, fundCustomerPassword, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPasswordQueryCondition">附加的条件</param>
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	public int fundCustomerPasswordUpdateByCondition(FundCustomerPassword fundCustomerPassword, FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustomerPasswordUpdateByCondition(fundCustomerPassword, fundCustomerPasswordQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
				this.getCache().clear("T_FUND_CUSTOMER_PASSWORD");
			}
		}
		String kvalue = this.getFundCustomerPasswordExampleConditionSql(fundCustomerPasswordQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_PASSWORD", "条件更新", "conditionSql", kvalue, fundCustomerPassword, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundCustomerPassword到数据库中
	 * <param name="fundCustomerPasswordQueryCondition">附加的条件</param>
	 * <param name="fundCustomerPassword">需要更新的FundCustomerPassword</param>
	 */
	public int fundCustomerPasswordUpdateSelectiveByCondition(FundCustomerPassword fundCustomerPassword, FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException {
		int ret = this.getDao().fundCustomerPasswordUpdateSelectiveByCondition(fundCustomerPassword, fundCustomerPasswordQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
				this.getCache().clear("T_FUND_CUSTOMER_PASSWORD");
			}
		}
		String kvalue = this.getFundCustomerPasswordExampleConditionSql(fundCustomerPasswordQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_CUSTOMER_PASSWORD", "批量部分更新", "conditionSql", kvalue, fundCustomerPassword, ret);
		return ret;
	}
	
	public String getFundCustomerPasswordExampleConditionSql(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundCustomerPasswordQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundCustomerPasswordExample.Criteria item = fundCustomerPasswordQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundCustomerPasswordExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundCustomerPassword">从数据库中查询一个对象FundCustomerPassword</param>
	 * <param name="AId">PK</param>
	 */
	public FundCustomerPassword fundCustomerPasswordSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
			String key = ("T_FUND_CUSTOMER_PASSWORD_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			FundCustomerPassword obj = ((FundCustomerPassword)(this.getCache().get("T_FUND_CUSTOMER_PASSWORD", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustomerPasswordSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUSTOMER_PASSWORD", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustomerPasswordSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="fundCustomerPasswordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundCustomerPassword> fundCustomerPasswordSelectObjects(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
			String key = ("T_FUND_CUSTOMER_PASSWORD_" 
						+ ("queryObject_" + this.getFundCustomerPasswordExampleConditionSql(fundCustomerPasswordQueryCondition)));
			List<FundCustomerPassword> obj = ((List<FundCustomerPassword>)(this.getCache().get("T_FUND_CUSTOMER_PASSWORD", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustomerPasswordSelectObjects(fundCustomerPasswordQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUSTOMER_PASSWORD", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustomerPasswordSelectObjects(fundCustomerPasswordQueryCondition);
		}
	}
	
	/**
	 * <param name="fundCustomerPasswordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundCustomerPasswordQuerySelectObjectsCount(FundCustomerPasswordExample fundCustomerPasswordQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_CUSTOMER_PASSWORD")) {
			String key = ("T_FUND_CUSTOMER_PASSWORD_" 
						+ ("queryCount_" + this.getFundCustomerPasswordExampleConditionSql(fundCustomerPasswordQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_CUSTOMER_PASSWORD", key)));
			if ((obj == null)) {
				obj = this.getDao().fundCustomerPasswordQuerySelectObjectsCount(fundCustomerPasswordQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_CUSTOMER_PASSWORD", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundCustomerPasswordQuerySelectObjectsCount(fundCustomerPasswordQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要插入的新对象</param>
	 */
	public int fundEcTradeSeatInsert(FundEcTradeSeat fundEcTradeSeat) throws CacheException {
		int ret = this.getDao().fundEcTradeSeatInsert(fundEcTradeSeat);
		if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
			this.getCache().clear("T_FUND_EC_TRADE_SEAT");
		}
		String kvalue = "";
		kvalue = (kvalue + fundEcTradeSeat.getId());
		this.operatesLogSimpleAdd("T_FUND_EC_TRADE_SEAT", "插入", "ID", kvalue, fundEcTradeSeat, ret);
		return ret;
	}
	
	/**
	 * <param name="fundEcTradeSeat">从数据库中删除一个对象FundEcTradeSeat</param>
	 * <param name="AId">PK</param>
	 */
	public int fundEcTradeSeatDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().fundEcTradeSeatDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
				this.getCache().clear("T_FUND_EC_TRADE_SEAT");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_FUND_EC_TRADE_SEAT", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="fundEcTradeSeat">从数据库中删除一个对象FundEcTradeSeat</param>
	 */
	public int fundEcTradeSeatDeleteByCondition(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException {
		int ret = this.getDao().fundEcTradeSeatDeleteByCondition(fundEcTradeSeatQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
				this.getCache().clear("T_FUND_EC_TRADE_SEAT");
			}
		}
		String kvalue = this.getFundEcTradeSeatExampleConditionSql(fundEcTradeSeatQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_EC_TRADE_SEAT", "条件删除", "conditionSql", kvalue, fundEcTradeSeatQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	public int fundEcTradeSeatUpdate(FundEcTradeSeat fundEcTradeSeat) throws CacheException {
		int ret = this.getDao().fundEcTradeSeatUpdate(fundEcTradeSeat);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
				this.getCache().clear("T_FUND_EC_TRADE_SEAT");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundEcTradeSeat.getId());
		this.operatesLogSimpleAdd("T_FUND_EC_TRADE_SEAT", "更新", "ID", kvalue, fundEcTradeSeat, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	public int fundEcTradeSeatUpdateSelective(FundEcTradeSeat fundEcTradeSeat) throws CacheException {
		int ret = this.getDao().fundEcTradeSeatUpdateSelective(fundEcTradeSeat);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
				this.getCache().clear("T_FUND_EC_TRADE_SEAT");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundEcTradeSeat.getId());
		this.operatesLogSimpleAdd("T_FUND_EC_TRADE_SEAT", "部分更新", "ID", kvalue, fundEcTradeSeat, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeatQueryCondition">附加的条件</param>
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	public int fundEcTradeSeatUpdateByCondition(FundEcTradeSeat fundEcTradeSeat, FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException {
		int ret = this.getDao().fundEcTradeSeatUpdateByCondition(fundEcTradeSeat, fundEcTradeSeatQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
				this.getCache().clear("T_FUND_EC_TRADE_SEAT");
			}
		}
		String kvalue = this.getFundEcTradeSeatExampleConditionSql(fundEcTradeSeatQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_EC_TRADE_SEAT", "条件更新", "conditionSql", kvalue, fundEcTradeSeat, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundEcTradeSeat到数据库中
	 * <param name="fundEcTradeSeatQueryCondition">附加的条件</param>
	 * <param name="fundEcTradeSeat">需要更新的FundEcTradeSeat</param>
	 */
	public int fundEcTradeSeatUpdateSelectiveByCondition(FundEcTradeSeat fundEcTradeSeat, FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException {
		int ret = this.getDao().fundEcTradeSeatUpdateSelectiveByCondition(fundEcTradeSeat, fundEcTradeSeatQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
				this.getCache().clear("T_FUND_EC_TRADE_SEAT");
			}
		}
		String kvalue = this.getFundEcTradeSeatExampleConditionSql(fundEcTradeSeatQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_EC_TRADE_SEAT", "批量部分更新", "conditionSql", kvalue, fundEcTradeSeat, ret);
		return ret;
	}
	
	public String getFundEcTradeSeatExampleConditionSql(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundEcTradeSeatQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundEcTradeSeatExample.Criteria item = fundEcTradeSeatQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundEcTradeSeatExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundEcTradeSeat">从数据库中查询一个对象FundEcTradeSeat</param>
	 * <param name="AId">PK</param>
	 */
	public FundEcTradeSeat fundEcTradeSeatSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
			String key = ("T_FUND_EC_TRADE_SEAT_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			FundEcTradeSeat obj = ((FundEcTradeSeat)(this.getCache().get("T_FUND_EC_TRADE_SEAT", key)));
			if ((obj == null)) {
				obj = this.getDao().fundEcTradeSeatSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_FUND_EC_TRADE_SEAT", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundEcTradeSeatSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="fundEcTradeSeatQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundEcTradeSeat> fundEcTradeSeatSelectObjects(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
			String key = ("T_FUND_EC_TRADE_SEAT_" 
						+ ("queryObject_" + this.getFundEcTradeSeatExampleConditionSql(fundEcTradeSeatQueryCondition)));
			List<FundEcTradeSeat> obj = ((List<FundEcTradeSeat>)(this.getCache().get("T_FUND_EC_TRADE_SEAT", key)));
			if ((obj == null)) {
				obj = this.getDao().fundEcTradeSeatSelectObjects(fundEcTradeSeatQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_EC_TRADE_SEAT", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundEcTradeSeatSelectObjects(fundEcTradeSeatQueryCondition);
		}
	}
	
	/**
	 * <param name="fundEcTradeSeatQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundEcTradeSeatQuerySelectObjectsCount(FundEcTradeSeatExample fundEcTradeSeatQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_EC_TRADE_SEAT")) {
			String key = ("T_FUND_EC_TRADE_SEAT_" 
						+ ("queryCount_" + this.getFundEcTradeSeatExampleConditionSql(fundEcTradeSeatQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_EC_TRADE_SEAT", key)));
			if ((obj == null)) {
				obj = this.getDao().fundEcTradeSeatQuerySelectObjectsCount(fundEcTradeSeatQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_EC_TRADE_SEAT", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundEcTradeSeatQuerySelectObjectsCount(fundEcTradeSeatQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要插入的新对象</param>
	 */
	public int fundFundCatagoryFundRelaInsert(FundFundCatagoryFundRela fundFundCatagoryFundRela) throws CacheException {
		int ret = this.getDao().fundFundCatagoryFundRelaInsert(fundFundCatagoryFundRela);
		if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
			this.getCache().clear("T_FUND_FUND_CATAGORY_FUND_RELA");
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundCatagoryFundRela.getCategoryId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundFundCatagoryFundRela.getFundCode());
		this.operatesLogSimpleAdd("T_FUND_FUND_CATAGORY_FUND_RELA", "插入", "CATEGORY_ID,FUND_CODE", kvalue, fundFundCatagoryFundRela, ret);
		return ret;
	}
	
	/**
	 * <param name="fundFundCatagoryFundRela">从数据库中删除一个对象FundFundCatagoryFundRela</param>
	 * <param name="AFundFundCatagoryFundRelaKey">分类基金关联表 主键类</param>
	 */
	public int fundFundCatagoryFundRelaDeleteByPrimaryKey(FundFundCatagoryFundRelaKey AFundFundCatagoryFundRelaKey) throws CacheException {
		int ret = this.getDao().fundFundCatagoryFundRelaDeleteByPrimaryKey(AFundFundCatagoryFundRelaKey);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
				this.getCache().clear("T_FUND_FUND_CATAGORY_FUND_RELA");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AFundFundCatagoryFundRelaKey.getCategoryId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + AFundFundCatagoryFundRelaKey.getFundCode());
		this.operatesLogSimpleAdd("T_FUND_FUND_CATAGORY_FUND_RELA", "删除", "CATEGORY_ID,FUND_CODE", kvalue, AFundFundCatagoryFundRelaKey, ret);
		return ret;
	}
	
	/**
	 * <param name="fundFundCatagoryFundRela">从数据库中删除一个对象FundFundCatagoryFundRela</param>
	 */
	public int fundFundCatagoryFundRelaDeleteByCondition(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundCatagoryFundRelaDeleteByCondition(fundFundCatagoryFundRelaQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
				this.getCache().clear("T_FUND_FUND_CATAGORY_FUND_RELA");
			}
		}
		String kvalue = this.getFundFundCatagoryFundRelaExampleConditionSql(fundFundCatagoryFundRelaQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_CATAGORY_FUND_RELA", "条件删除", "conditionSql", kvalue, fundFundCatagoryFundRelaQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	public int fundFundCatagoryFundRelaUpdate(FundFundCatagoryFundRela fundFundCatagoryFundRela) throws CacheException {
		int ret = this.getDao().fundFundCatagoryFundRelaUpdate(fundFundCatagoryFundRela);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
				this.getCache().clear("T_FUND_FUND_CATAGORY_FUND_RELA");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundCatagoryFundRela.getCategoryId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundFundCatagoryFundRela.getFundCode());
		this.operatesLogSimpleAdd("T_FUND_FUND_CATAGORY_FUND_RELA", "更新", "CATEGORY_ID,FUND_CODE", kvalue, fundFundCatagoryFundRela, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	public int fundFundCatagoryFundRelaUpdateSelective(FundFundCatagoryFundRela fundFundCatagoryFundRela) throws CacheException {
		int ret = this.getDao().fundFundCatagoryFundRelaUpdateSelective(fundFundCatagoryFundRela);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
				this.getCache().clear("T_FUND_FUND_CATAGORY_FUND_RELA");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundCatagoryFundRela.getCategoryId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundFundCatagoryFundRela.getFundCode());
		this.operatesLogSimpleAdd("T_FUND_FUND_CATAGORY_FUND_RELA", "部分更新", "CATEGORY_ID,FUND_CODE", kvalue, fundFundCatagoryFundRela, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加的条件</param>
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	public int fundFundCatagoryFundRelaUpdateByCondition(FundFundCatagoryFundRela fundFundCatagoryFundRela, FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundCatagoryFundRelaUpdateByCondition(fundFundCatagoryFundRela, fundFundCatagoryFundRelaQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
				this.getCache().clear("T_FUND_FUND_CATAGORY_FUND_RELA");
			}
		}
		String kvalue = this.getFundFundCatagoryFundRelaExampleConditionSql(fundFundCatagoryFundRelaQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_CATAGORY_FUND_RELA", "条件更新", "conditionSql", kvalue, fundFundCatagoryFundRela, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundFundCatagoryFundRela到数据库中
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加的条件</param>
	 * <param name="fundFundCatagoryFundRela">需要更新的FundFundCatagoryFundRela</param>
	 */
	public int fundFundCatagoryFundRelaUpdateSelectiveByCondition(FundFundCatagoryFundRela fundFundCatagoryFundRela, FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundCatagoryFundRelaUpdateSelectiveByCondition(fundFundCatagoryFundRela, fundFundCatagoryFundRelaQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
				this.getCache().clear("T_FUND_FUND_CATAGORY_FUND_RELA");
			}
		}
		String kvalue = this.getFundFundCatagoryFundRelaExampleConditionSql(fundFundCatagoryFundRelaQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_CATAGORY_FUND_RELA", "批量部分更新", "conditionSql", kvalue, fundFundCatagoryFundRela, ret);
		return ret;
	}
	
	public String getFundFundCatagoryFundRelaExampleConditionSql(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundFundCatagoryFundRelaQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundFundCatagoryFundRelaExample.Criteria item = fundFundCatagoryFundRelaQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundFundCatagoryFundRelaExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundFundCatagoryFundRela">从数据库中查询一个对象FundFundCatagoryFundRela</param>
	 * <param name="AFundFundCatagoryFundRelaKey">分类基金关联表 主键类</param>
	 */
	public FundFundCatagoryFundRela fundFundCatagoryFundRelaSelectByPrimaryKey(FundFundCatagoryFundRelaKey AFundFundCatagoryFundRelaKey) throws CacheException {
		if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
			String key = ("T_FUND_FUND_CATAGORY_FUND_RELA_" + "_BYUNIINDEX_");
			FundFundCatagoryFundRela obj = ((FundFundCatagoryFundRela)(this.getCache().get("T_FUND_FUND_CATAGORY_FUND_RELA", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundCatagoryFundRelaSelectByPrimaryKey(AFundFundCatagoryFundRelaKey);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_CATAGORY_FUND_RELA", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundCatagoryFundRelaSelectByPrimaryKey(AFundFundCatagoryFundRelaKey);
		}
	}
	
	/**
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundFundCatagoryFundRela> fundFundCatagoryFundRelaSelectObjects(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
			String key = ("T_FUND_FUND_CATAGORY_FUND_RELA_" 
						+ ("queryObject_" + this.getFundFundCatagoryFundRelaExampleConditionSql(fundFundCatagoryFundRelaQueryCondition)));
			List<FundFundCatagoryFundRela> obj = ((List<FundFundCatagoryFundRela>)(this.getCache().get("T_FUND_FUND_CATAGORY_FUND_RELA", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundCatagoryFundRelaSelectObjects(fundFundCatagoryFundRelaQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_CATAGORY_FUND_RELA", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundCatagoryFundRelaSelectObjects(fundFundCatagoryFundRelaQueryCondition);
		}
	}
	
	/**
	 * <param name="fundFundCatagoryFundRelaQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundFundCatagoryFundRelaQuerySelectObjectsCount(FundFundCatagoryFundRelaExample fundFundCatagoryFundRelaQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_FUND_CATAGORY_FUND_RELA")) {
			String key = ("T_FUND_FUND_CATAGORY_FUND_RELA_" 
						+ ("queryCount_" + this.getFundFundCatagoryFundRelaExampleConditionSql(fundFundCatagoryFundRelaQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_FUND_CATAGORY_FUND_RELA", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundCatagoryFundRelaQuerySelectObjectsCount(fundFundCatagoryFundRelaQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_CATAGORY_FUND_RELA", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundCatagoryFundRelaQuerySelectObjectsCount(fundFundCatagoryFundRelaQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要插入的新对象</param>
	 */
	public int fundFundCategoryInsert(FundFundCategory fundFundCategory) throws CacheException {
		int ret = this.getDao().fundFundCategoryInsert(fundFundCategory);
		if (this.needCache("T_FUND_FUND_CATEGORY")) {
			this.getCache().clear("T_FUND_FUND_CATEGORY");
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundCategory.getId());
		this.operatesLogSimpleAdd("T_FUND_FUND_CATEGORY", "插入", "ID", kvalue, fundFundCategory, ret);
		return ret;
	}
	
	/**
	 * <param name="fundFundCategory">从数据库中删除一个对象FundFundCategory</param>
	 * <param name="AId">分类ID</param>
	 */
	public int fundFundCategoryDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().fundFundCategoryDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATEGORY")) {
				this.getCache().clear("T_FUND_FUND_CATEGORY");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_FUND_FUND_CATEGORY", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="fundFundCategory">从数据库中删除一个对象FundFundCategory</param>
	 */
	public int fundFundCategoryDeleteByCondition(FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundCategoryDeleteByCondition(fundFundCategoryQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATEGORY")) {
				this.getCache().clear("T_FUND_FUND_CATEGORY");
			}
		}
		String kvalue = this.getFundFundCategoryExampleConditionSql(fundFundCategoryQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_CATEGORY", "条件删除", "conditionSql", kvalue, fundFundCategoryQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	public int fundFundCategoryUpdate(FundFundCategory fundFundCategory) throws CacheException {
		int ret = this.getDao().fundFundCategoryUpdate(fundFundCategory);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATEGORY")) {
				this.getCache().clear("T_FUND_FUND_CATEGORY");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundCategory.getId());
		this.operatesLogSimpleAdd("T_FUND_FUND_CATEGORY", "更新", "ID", kvalue, fundFundCategory, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundFundCategory到数据库中
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	public int fundFundCategoryUpdateSelective(FundFundCategory fundFundCategory) throws CacheException {
		int ret = this.getDao().fundFundCategoryUpdateSelective(fundFundCategory);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATEGORY")) {
				this.getCache().clear("T_FUND_FUND_CATEGORY");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundCategory.getId());
		this.operatesLogSimpleAdd("T_FUND_FUND_CATEGORY", "部分更新", "ID", kvalue, fundFundCategory, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundFundCategory到数据库中
	 * <param name="fundFundCategoryQueryCondition">附加的条件</param>
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	public int fundFundCategoryUpdateByCondition(FundFundCategory fundFundCategory, FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundCategoryUpdateByCondition(fundFundCategory, fundFundCategoryQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATEGORY")) {
				this.getCache().clear("T_FUND_FUND_CATEGORY");
			}
		}
		String kvalue = this.getFundFundCategoryExampleConditionSql(fundFundCategoryQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_CATEGORY", "条件更新", "conditionSql", kvalue, fundFundCategory, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundFundCategory到数据库中
	 * <param name="fundFundCategoryQueryCondition">附加的条件</param>
	 * <param name="fundFundCategory">需要更新的FundFundCategory</param>
	 */
	public int fundFundCategoryUpdateSelectiveByCondition(FundFundCategory fundFundCategory, FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundCategoryUpdateSelectiveByCondition(fundFundCategory, fundFundCategoryQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_CATEGORY")) {
				this.getCache().clear("T_FUND_FUND_CATEGORY");
			}
		}
		String kvalue = this.getFundFundCategoryExampleConditionSql(fundFundCategoryQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_CATEGORY", "批量部分更新", "conditionSql", kvalue, fundFundCategory, ret);
		return ret;
	}
	
	public String getFundFundCategoryExampleConditionSql(FundFundCategoryExample fundFundCategoryQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundFundCategoryQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundFundCategoryExample.Criteria item = fundFundCategoryQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundFundCategoryExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundFundCategory">从数据库中查询一个对象FundFundCategory</param>
	 * <param name="AId">分类ID</param>
	 */
	public FundFundCategory fundFundCategorySelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_FUND_FUND_CATEGORY")) {
			String key = ("T_FUND_FUND_CATEGORY_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			FundFundCategory obj = ((FundFundCategory)(this.getCache().get("T_FUND_FUND_CATEGORY", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundCategorySelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_CATEGORY", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundCategorySelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="fundFundCategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundFundCategory> fundFundCategorySelectObjects(FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_FUND_CATEGORY")) {
			String key = ("T_FUND_FUND_CATEGORY_" 
						+ ("queryObject_" + this.getFundFundCategoryExampleConditionSql(fundFundCategoryQueryCondition)));
			List<FundFundCategory> obj = ((List<FundFundCategory>)(this.getCache().get("T_FUND_FUND_CATEGORY", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundCategorySelectObjects(fundFundCategoryQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_CATEGORY", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundCategorySelectObjects(fundFundCategoryQueryCondition);
		}
	}
	
	/**
	 * <param name="fundFundCategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundFundCategoryQuerySelectObjectsCount(FundFundCategoryExample fundFundCategoryQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_FUND_CATEGORY")) {
			String key = ("T_FUND_FUND_CATEGORY_" 
						+ ("queryCount_" + this.getFundFundCategoryExampleConditionSql(fundFundCategoryQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_FUND_CATEGORY", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundCategoryQuerySelectObjectsCount(fundFundCategoryQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_CATEGORY", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundCategoryQuerySelectObjectsCount(fundFundCategoryQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要插入的新对象</param>
	 */
	public int fundFundInfoInsert(FundFundInfo fundFundInfo) throws CacheException {
		int ret = this.getDao().fundFundInfoInsert(fundFundInfo);
		if (this.needCache("T_FUND_FUND_INFO")) {
			this.getCache().clear("T_FUND_FUND_INFO");
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundInfo.getFundCode());
		this.operatesLogSimpleAdd("T_FUND_FUND_INFO", "插入", "FUND_CODE", kvalue, fundFundInfo, ret);
		return ret;
	}
	
	/**
	 * <param name="fundFundInfo">从数据库中删除一个对象FundFundInfo</param>
	 * <param name="AFundCode">基金代码</param>
	 */
	public int fundFundInfoDeleteByPrimaryKey(String AFundCode) throws CacheException {
		int ret = this.getDao().fundFundInfoDeleteByPrimaryKey(AFundCode);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_INFO")) {
				this.getCache().clear("T_FUND_FUND_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AFundCode);
		this.operatesLogSimpleAdd("T_FUND_FUND_INFO", "删除", "FUND_CODE", kvalue, AFundCode, ret);
		return ret;
	}
	
	/**
	 * <param name="fundFundInfo">从数据库中删除一个对象FundFundInfo</param>
	 */
	public int fundFundInfoDeleteByCondition(FundFundInfoExample fundFundInfoQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundInfoDeleteByCondition(fundFundInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_INFO")) {
				this.getCache().clear("T_FUND_FUND_INFO");
			}
		}
		String kvalue = this.getFundFundInfoExampleConditionSql(fundFundInfoQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_INFO", "条件删除", "conditionSql", kvalue, fundFundInfoQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	public int fundFundInfoUpdate(FundFundInfo fundFundInfo) throws CacheException {
		int ret = this.getDao().fundFundInfoUpdate(fundFundInfo);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_INFO")) {
				this.getCache().clear("T_FUND_FUND_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundInfo.getFundCode());
		this.operatesLogSimpleAdd("T_FUND_FUND_INFO", "更新", "FUND_CODE", kvalue, fundFundInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundFundInfo到数据库中
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	public int fundFundInfoUpdateSelective(FundFundInfo fundFundInfo) throws CacheException {
		int ret = this.getDao().fundFundInfoUpdateSelective(fundFundInfo);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_INFO")) {
				this.getCache().clear("T_FUND_FUND_INFO");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundInfo.getFundCode());
		this.operatesLogSimpleAdd("T_FUND_FUND_INFO", "部分更新", "FUND_CODE", kvalue, fundFundInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundFundInfo到数据库中
	 * <param name="fundFundInfoQueryCondition">附加的条件</param>
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	public int fundFundInfoUpdateByCondition(FundFundInfo fundFundInfo, FundFundInfoExample fundFundInfoQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundInfoUpdateByCondition(fundFundInfo, fundFundInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_INFO")) {
				this.getCache().clear("T_FUND_FUND_INFO");
			}
		}
		String kvalue = this.getFundFundInfoExampleConditionSql(fundFundInfoQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_INFO", "条件更新", "conditionSql", kvalue, fundFundInfo, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundFundInfo到数据库中
	 * <param name="fundFundInfoQueryCondition">附加的条件</param>
	 * <param name="fundFundInfo">需要更新的FundFundInfo</param>
	 */
	public int fundFundInfoUpdateSelectiveByCondition(FundFundInfo fundFundInfo, FundFundInfoExample fundFundInfoQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundInfoUpdateSelectiveByCondition(fundFundInfo, fundFundInfoQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_INFO")) {
				this.getCache().clear("T_FUND_FUND_INFO");
			}
		}
		String kvalue = this.getFundFundInfoExampleConditionSql(fundFundInfoQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_INFO", "批量部分更新", "conditionSql", kvalue, fundFundInfo, ret);
		return ret;
	}
	
	public String getFundFundInfoExampleConditionSql(FundFundInfoExample fundFundInfoQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundFundInfoQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundFundInfoExample.Criteria item = fundFundInfoQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundFundInfoExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundFundInfo">从数据库中查询一个对象FundFundInfo</param>
	 * <param name="AFundCode">基金代码</param>
	 */
	public FundFundInfo fundFundInfoSelectByPrimaryKey(String AFundCode) throws CacheException {
		if (this.needCache("T_FUND_FUND_INFO")) {
			String key = ("T_FUND_FUND_INFO_" 
						+ (("_BYUNIINDEX_" + AFundCode) 
						+ "_"));
			FundFundInfo obj = ((FundFundInfo)(this.getCache().get("T_FUND_FUND_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundInfoSelectByPrimaryKey(AFundCode);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundInfoSelectByPrimaryKey(AFundCode);
		}
	}
	
	/**
	 * <param name="fundFundInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundFundInfo> fundFundInfoSelectObjects(FundFundInfoExample fundFundInfoQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_FUND_INFO")) {
			String key = ("T_FUND_FUND_INFO_" 
						+ ("queryObject_" + this.getFundFundInfoExampleConditionSql(fundFundInfoQueryCondition)));
			List<FundFundInfo> obj = ((List<FundFundInfo>)(this.getCache().get("T_FUND_FUND_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundInfoSelectObjects(fundFundInfoQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundInfoSelectObjects(fundFundInfoQueryCondition);
		}
	}
	
	/**
	 * <param name="fundFundInfoQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundFundInfoQuerySelectObjectsCount(FundFundInfoExample fundFundInfoQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_FUND_INFO")) {
			String key = ("T_FUND_FUND_INFO_" 
						+ ("queryCount_" + this.getFundFundInfoExampleConditionSql(fundFundInfoQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_FUND_INFO", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundInfoQuerySelectObjectsCount(fundFundInfoQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_INFO", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundInfoQuerySelectObjectsCount(fundFundInfoQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要插入的新对象</param>
	 */
	public int fundFundPropertyInsert(FundFundProperty fundFundProperty) throws CacheException {
		int ret = this.getDao().fundFundPropertyInsert(fundFundProperty);
		if (this.needCache("T_FUND_FUND_PROPERTY")) {
			this.getCache().clear("T_FUND_FUND_PROPERTY");
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundProperty.getFundCode());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundFundProperty.getPropertyType());
		this.operatesLogSimpleAdd("T_FUND_FUND_PROPERTY", "插入", "FUND_CODE,PROPERTY_TYPE", kvalue, fundFundProperty, ret);
		return ret;
	}
	
	/**
	 * <param name="fundFundProperty">从数据库中删除一个对象FundFundProperty</param>
	 * <param name="AFundFundPropertyKey">基金属性表 主键类</param>
	 */
	public int fundFundPropertyDeleteByPrimaryKey(FundFundPropertyKey AFundFundPropertyKey) throws CacheException {
		int ret = this.getDao().fundFundPropertyDeleteByPrimaryKey(AFundFundPropertyKey);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_PROPERTY")) {
				this.getCache().clear("T_FUND_FUND_PROPERTY");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AFundFundPropertyKey.getFundCode());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + AFundFundPropertyKey.getPropertyType());
		this.operatesLogSimpleAdd("T_FUND_FUND_PROPERTY", "删除", "FUND_CODE,PROPERTY_TYPE", kvalue, AFundFundPropertyKey, ret);
		return ret;
	}
	
	/**
	 * <param name="fundFundProperty">从数据库中删除一个对象FundFundProperty</param>
	 */
	public int fundFundPropertyDeleteByCondition(FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundPropertyDeleteByCondition(fundFundPropertyQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_PROPERTY")) {
				this.getCache().clear("T_FUND_FUND_PROPERTY");
			}
		}
		String kvalue = this.getFundFundPropertyExampleConditionSql(fundFundPropertyQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_PROPERTY", "条件删除", "conditionSql", kvalue, fundFundPropertyQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	public int fundFundPropertyUpdate(FundFundProperty fundFundProperty) throws CacheException {
		int ret = this.getDao().fundFundPropertyUpdate(fundFundProperty);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_PROPERTY")) {
				this.getCache().clear("T_FUND_FUND_PROPERTY");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundProperty.getFundCode());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundFundProperty.getPropertyType());
		this.operatesLogSimpleAdd("T_FUND_FUND_PROPERTY", "更新", "FUND_CODE,PROPERTY_TYPE", kvalue, fundFundProperty, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundFundProperty到数据库中
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	public int fundFundPropertyUpdateSelective(FundFundProperty fundFundProperty) throws CacheException {
		int ret = this.getDao().fundFundPropertyUpdateSelective(fundFundProperty);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_PROPERTY")) {
				this.getCache().clear("T_FUND_FUND_PROPERTY");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundFundProperty.getFundCode());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + fundFundProperty.getPropertyType());
		this.operatesLogSimpleAdd("T_FUND_FUND_PROPERTY", "部分更新", "FUND_CODE,PROPERTY_TYPE", kvalue, fundFundProperty, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundFundProperty到数据库中
	 * <param name="fundFundPropertyQueryCondition">附加的条件</param>
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	public int fundFundPropertyUpdateByCondition(FundFundProperty fundFundProperty, FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundPropertyUpdateByCondition(fundFundProperty, fundFundPropertyQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_PROPERTY")) {
				this.getCache().clear("T_FUND_FUND_PROPERTY");
			}
		}
		String kvalue = this.getFundFundPropertyExampleConditionSql(fundFundPropertyQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_PROPERTY", "条件更新", "conditionSql", kvalue, fundFundProperty, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundFundProperty到数据库中
	 * <param name="fundFundPropertyQueryCondition">附加的条件</param>
	 * <param name="fundFundProperty">需要更新的FundFundProperty</param>
	 */
	public int fundFundPropertyUpdateSelectiveByCondition(FundFundProperty fundFundProperty, FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException {
		int ret = this.getDao().fundFundPropertyUpdateSelectiveByCondition(fundFundProperty, fundFundPropertyQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_FUND_PROPERTY")) {
				this.getCache().clear("T_FUND_FUND_PROPERTY");
			}
		}
		String kvalue = this.getFundFundPropertyExampleConditionSql(fundFundPropertyQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_FUND_PROPERTY", "批量部分更新", "conditionSql", kvalue, fundFundProperty, ret);
		return ret;
	}
	
	public String getFundFundPropertyExampleConditionSql(FundFundPropertyExample fundFundPropertyQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundFundPropertyQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundFundPropertyExample.Criteria item = fundFundPropertyQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundFundPropertyExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundFundProperty">从数据库中查询一个对象FundFundProperty</param>
	 * <param name="AFundFundPropertyKey">基金属性表 主键类</param>
	 */
	public FundFundProperty fundFundPropertySelectByPrimaryKey(FundFundPropertyKey AFundFundPropertyKey) throws CacheException {
		if (this.needCache("T_FUND_FUND_PROPERTY")) {
			String key = ("T_FUND_FUND_PROPERTY_" + "_BYUNIINDEX_");
			FundFundProperty obj = ((FundFundProperty)(this.getCache().get("T_FUND_FUND_PROPERTY", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundPropertySelectByPrimaryKey(AFundFundPropertyKey);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_PROPERTY", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundPropertySelectByPrimaryKey(AFundFundPropertyKey);
		}
	}
	
	/**
	 * <param name="fundFundPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundFundProperty> fundFundPropertySelectObjects(FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_FUND_PROPERTY")) {
			String key = ("T_FUND_FUND_PROPERTY_" 
						+ ("queryObject_" + this.getFundFundPropertyExampleConditionSql(fundFundPropertyQueryCondition)));
			List<FundFundProperty> obj = ((List<FundFundProperty>)(this.getCache().get("T_FUND_FUND_PROPERTY", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundPropertySelectObjects(fundFundPropertyQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_PROPERTY", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundPropertySelectObjects(fundFundPropertyQueryCondition);
		}
	}
	
	/**
	 * <param name="fundFundPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundFundPropertyQuerySelectObjectsCount(FundFundPropertyExample fundFundPropertyQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_FUND_PROPERTY")) {
			String key = ("T_FUND_FUND_PROPERTY_" 
						+ ("queryCount_" + this.getFundFundPropertyExampleConditionSql(fundFundPropertyQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_FUND_PROPERTY", key)));
			if ((obj == null)) {
				obj = this.getDao().fundFundPropertyQuerySelectObjectsCount(fundFundPropertyQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_FUND_PROPERTY", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundFundPropertyQuerySelectObjectsCount(fundFundPropertyQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundMessageRecord到数据库中
	 * <param name="fundMessageRecord">需要插入的新对象</param>
	 */
	public int fundMessageRecordInsert(FundMessageRecord fundMessageRecord) throws CacheException {
		int ret = this.getDao().fundMessageRecordInsert(fundMessageRecord);
		if (this.needCache("T_FUND_MESSAGE_RECORD")) {
			this.getCache().clear("T_FUND_MESSAGE_RECORD");
		}
		String kvalue = "";
		this.operatesLogSimpleAdd("T_FUND_MESSAGE_RECORD", "插入", "", kvalue, fundMessageRecord, ret);
		return ret;
	}
	
	/**
	 * <param name="fundMessageRecord">从数据库中删除一个对象FundMessageRecord</param>
	 */
	public int fundMessageRecordDeleteByCondition(FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException {
		int ret = this.getDao().fundMessageRecordDeleteByCondition(fundMessageRecordQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_MESSAGE_RECORD")) {
				this.getCache().clear("T_FUND_MESSAGE_RECORD");
			}
		}
		String kvalue = this.getFundMessageRecordExampleConditionSql(fundMessageRecordQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_MESSAGE_RECORD", "条件删除", "conditionSql", kvalue, fundMessageRecordQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundMessageRecord到数据库中
	 * <param name="fundMessageRecordQueryCondition">附加的条件</param>
	 * <param name="fundMessageRecord">需要更新的FundMessageRecord</param>
	 */
	public int fundMessageRecordUpdateByCondition(FundMessageRecord fundMessageRecord, FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException {
		int ret = this.getDao().fundMessageRecordUpdateByCondition(fundMessageRecord, fundMessageRecordQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_MESSAGE_RECORD")) {
				this.getCache().clear("T_FUND_MESSAGE_RECORD");
			}
		}
		String kvalue = this.getFundMessageRecordExampleConditionSql(fundMessageRecordQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_MESSAGE_RECORD", "条件更新", "conditionSql", kvalue, fundMessageRecord, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundMessageRecord到数据库中
	 * <param name="fundMessageRecordQueryCondition">附加的条件</param>
	 * <param name="fundMessageRecord">需要更新的FundMessageRecord</param>
	 */
	public int fundMessageRecordUpdateSelectiveByCondition(FundMessageRecord fundMessageRecord, FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException {
		int ret = this.getDao().fundMessageRecordUpdateSelectiveByCondition(fundMessageRecord, fundMessageRecordQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_MESSAGE_RECORD")) {
				this.getCache().clear("T_FUND_MESSAGE_RECORD");
			}
		}
		String kvalue = this.getFundMessageRecordExampleConditionSql(fundMessageRecordQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_MESSAGE_RECORD", "批量部分更新", "conditionSql", kvalue, fundMessageRecord, ret);
		return ret;
	}
	
	public String getFundMessageRecordExampleConditionSql(FundMessageRecordExample fundMessageRecordQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundMessageRecordQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundMessageRecordExample.Criteria item = fundMessageRecordQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundMessageRecordExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundMessageRecordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundMessageRecord> fundMessageRecordSelectObjects(FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_MESSAGE_RECORD")) {
			String key = ("T_FUND_MESSAGE_RECORD_" 
						+ ("queryObject_" + this.getFundMessageRecordExampleConditionSql(fundMessageRecordQueryCondition)));
			List<FundMessageRecord> obj = ((List<FundMessageRecord>)(this.getCache().get("T_FUND_MESSAGE_RECORD", key)));
			if ((obj == null)) {
				obj = this.getDao().fundMessageRecordSelectObjects(fundMessageRecordQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_MESSAGE_RECORD", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundMessageRecordSelectObjects(fundMessageRecordQueryCondition);
		}
	}
	
	/**
	 * <param name="fundMessageRecordQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundMessageRecordQuerySelectObjectsCount(FundMessageRecordExample fundMessageRecordQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_MESSAGE_RECORD")) {
			String key = ("T_FUND_MESSAGE_RECORD_" 
						+ ("queryCount_" + this.getFundMessageRecordExampleConditionSql(fundMessageRecordQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_MESSAGE_RECORD", key)));
			if ((obj == null)) {
				obj = this.getDao().fundMessageRecordQuerySelectObjectsCount(fundMessageRecordQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_MESSAGE_RECORD", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundMessageRecordQuerySelectObjectsCount(fundMessageRecordQueryCondition);
		}
	}
	
	/**
	 * 插入一个对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要插入的新对象</param>
	 */
	public int fundTradeParamConvertInsert(FundTradeParamConvert fundTradeParamConvert) throws CacheException {
		int ret = this.getDao().fundTradeParamConvertInsert(fundTradeParamConvert);
		if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
			this.getCache().clear("T_FUND_TRADE_PARAM_CONVERT");
		}
		String kvalue = "";
		kvalue = (kvalue + fundTradeParamConvert.getId());
		this.operatesLogSimpleAdd("T_FUND_TRADE_PARAM_CONVERT", "插入", "ID", kvalue, fundTradeParamConvert, ret);
		return ret;
	}
	
	/**
	 * <param name="fundTradeParamConvert">从数据库中删除一个对象FundTradeParamConvert</param>
	 * <param name="AId">PK</param>
	 */
	public int fundTradeParamConvertDeleteByPrimaryKey(String AId) throws CacheException {
		int ret = this.getDao().fundTradeParamConvertDeleteByPrimaryKey(AId);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
				this.getCache().clear("T_FUND_TRADE_PARAM_CONVERT");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_FUND_TRADE_PARAM_CONVERT", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="fundTradeParamConvert">从数据库中删除一个对象FundTradeParamConvert</param>
	 */
	public int fundTradeParamConvertDeleteByCondition(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException {
		int ret = this.getDao().fundTradeParamConvertDeleteByCondition(fundTradeParamConvertQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
				this.getCache().clear("T_FUND_TRADE_PARAM_CONVERT");
			}
		}
		String kvalue = this.getFundTradeParamConvertExampleConditionSql(fundTradeParamConvertQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_TRADE_PARAM_CONVERT", "条件删除", "conditionSql", kvalue, fundTradeParamConvertQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	public int fundTradeParamConvertUpdate(FundTradeParamConvert fundTradeParamConvert) throws CacheException {
		int ret = this.getDao().fundTradeParamConvertUpdate(fundTradeParamConvert);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
				this.getCache().clear("T_FUND_TRADE_PARAM_CONVERT");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundTradeParamConvert.getId());
		this.operatesLogSimpleAdd("T_FUND_TRADE_PARAM_CONVERT", "更新", "ID", kvalue, fundTradeParamConvert, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	public int fundTradeParamConvertUpdateSelective(FundTradeParamConvert fundTradeParamConvert) throws CacheException {
		int ret = this.getDao().fundTradeParamConvertUpdateSelective(fundTradeParamConvert);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
				this.getCache().clear("T_FUND_TRADE_PARAM_CONVERT");
			}
		}
		String kvalue = "";
		kvalue = (kvalue + fundTradeParamConvert.getId());
		this.operatesLogSimpleAdd("T_FUND_TRADE_PARAM_CONVERT", "部分更新", "ID", kvalue, fundTradeParamConvert, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvertQueryCondition">附加的条件</param>
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	public int fundTradeParamConvertUpdateByCondition(FundTradeParamConvert fundTradeParamConvert, FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException {
		int ret = this.getDao().fundTradeParamConvertUpdateByCondition(fundTradeParamConvert, fundTradeParamConvertQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
				this.getCache().clear("T_FUND_TRADE_PARAM_CONVERT");
			}
		}
		String kvalue = this.getFundTradeParamConvertExampleConditionSql(fundTradeParamConvertQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_TRADE_PARAM_CONVERT", "条件更新", "conditionSql", kvalue, fundTradeParamConvert, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FundTradeParamConvert到数据库中
	 * <param name="fundTradeParamConvertQueryCondition">附加的条件</param>
	 * <param name="fundTradeParamConvert">需要更新的FundTradeParamConvert</param>
	 */
	public int fundTradeParamConvertUpdateSelectiveByCondition(FundTradeParamConvert fundTradeParamConvert, FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException {
		int ret = this.getDao().fundTradeParamConvertUpdateSelectiveByCondition(fundTradeParamConvert, fundTradeParamConvertQueryCondition);
		if ((ret > 0)) {
			if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
				this.getCache().clear("T_FUND_TRADE_PARAM_CONVERT");
			}
		}
		String kvalue = this.getFundTradeParamConvertExampleConditionSql(fundTradeParamConvertQueryCondition);
		this.operatesLogSimpleAdd("T_FUND_TRADE_PARAM_CONVERT", "批量部分更新", "conditionSql", kvalue, fundTradeParamConvert, ret);
		return ret;
	}
	
	public String getFundTradeParamConvertExampleConditionSql(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < fundTradeParamConvertQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FundTradeParamConvertExample.Criteria item = fundTradeParamConvertQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FundTradeParamConvertExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="fundTradeParamConvert">从数据库中查询一个对象FundTradeParamConvert</param>
	 * <param name="AId">PK</param>
	 */
	public FundTradeParamConvert fundTradeParamConvertSelectByPrimaryKey(String AId) throws CacheException {
		if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
			String key = ("T_FUND_TRADE_PARAM_CONVERT_" 
						+ (("_BYUNIINDEX_" + AId) 
						+ "_"));
			FundTradeParamConvert obj = ((FundTradeParamConvert)(this.getCache().get("T_FUND_TRADE_PARAM_CONVERT", key)));
			if ((obj == null)) {
				obj = this.getDao().fundTradeParamConvertSelectByPrimaryKey(AId);
				if ((obj != null)) {
					this.getCache().put("T_FUND_TRADE_PARAM_CONVERT", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundTradeParamConvertSelectByPrimaryKey(AId);
		}
	}
	
	/**
	 * <param name="fundTradeParamConvertQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FundTradeParamConvert> fundTradeParamConvertSelectObjects(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
			String key = ("T_FUND_TRADE_PARAM_CONVERT_" 
						+ ("queryObject_" + this.getFundTradeParamConvertExampleConditionSql(fundTradeParamConvertQueryCondition)));
			List<FundTradeParamConvert> obj = ((List<FundTradeParamConvert>)(this.getCache().get("T_FUND_TRADE_PARAM_CONVERT", key)));
			if ((obj == null)) {
				obj = this.getDao().fundTradeParamConvertSelectObjects(fundTradeParamConvertQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_TRADE_PARAM_CONVERT", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundTradeParamConvertSelectObjects(fundTradeParamConvertQueryCondition);
		}
	}
	
	/**
	 * <param name="fundTradeParamConvertQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int fundTradeParamConvertQuerySelectObjectsCount(FundTradeParamConvertExample fundTradeParamConvertQueryCondition) throws CacheException {
		if (this.needCache("T_FUND_TRADE_PARAM_CONVERT")) {
			String key = ("T_FUND_TRADE_PARAM_CONVERT_" 
						+ ("queryCount_" + this.getFundTradeParamConvertExampleConditionSql(fundTradeParamConvertQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("T_FUND_TRADE_PARAM_CONVERT", key)));
			if ((obj == null)) {
				obj = this.getDao().fundTradeParamConvertQuerySelectObjectsCount(fundTradeParamConvertQueryCondition);
				if ((obj != null)) {
					this.getCache().put("T_FUND_TRADE_PARAM_CONVERT", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().fundTradeParamConvertQuerySelectObjectsCount(fundTradeParamConvertQueryCondition);
		}
	}
	
	public String getVFundFundCategoryFundExampleConditionSql(VFundFundCategoryFundExample vFundFundCategoryFundQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < vFundFundCategoryFundQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			VFundFundCategoryFundExample.Criteria item = vFundFundCategoryFundQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					VFundFundCategoryFundExample.Criterion item1 = item.getCriteria().get(j);
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
	 * <param name="vFundFundCategoryFundQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VFundFundCategoryFund> vFundFundCategoryFundSelectObjects(VFundFundCategoryFundExample vFundFundCategoryFundQueryCondition) throws CacheException {
		if (this.needCache("V_FUND_FUND_CATEGORY_FUND")) {
			String key = ("V_FUND_FUND_CATEGORY_FUND_" 
						+ ("queryObject_" + this.getVFundFundCategoryFundExampleConditionSql(vFundFundCategoryFundQueryCondition)));
			List<VFundFundCategoryFund> obj = ((List<VFundFundCategoryFund>)(this.getCache().get("V_FUND_FUND_CATEGORY_FUND", key)));
			if ((obj == null)) {
				obj = this.getDao().vFundFundCategoryFundSelectObjects(vFundFundCategoryFundQueryCondition);
				if ((obj != null)) {
					this.getCache().put("V_FUND_FUND_CATEGORY_FUND", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().vFundFundCategoryFundSelectObjects(vFundFundCategoryFundQueryCondition);
		}
	}
	
	/**
	 * <param name="vFundFundCategoryFundQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vFundFundCategoryFundQuerySelectObjectsCount(VFundFundCategoryFundExample vFundFundCategoryFundQueryCondition) throws CacheException {
		if (this.needCache("V_FUND_FUND_CATEGORY_FUND")) {
			String key = ("V_FUND_FUND_CATEGORY_FUND_" 
						+ ("queryCount_" + this.getVFundFundCategoryFundExampleConditionSql(vFundFundCategoryFundQueryCondition)));
			Integer obj = ((Integer)(this.getCache().get("V_FUND_FUND_CATEGORY_FUND", key)));
			if ((obj == null)) {
				obj = this.getDao().vFundFundCategoryFundQuerySelectObjectsCount(vFundFundCategoryFundQueryCondition);
				if ((obj != null)) {
					this.getCache().put("V_FUND_FUND_CATEGORY_FUND", key, obj);
				}
			}
			return obj;
		}
		else {
			return this.getDao().vFundFundCategoryFundQuerySelectObjectsCount(vFundFundCategoryFundQueryCondition);
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
