package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金赎回(银行卡)功能输入参数
 */
public class DsFundRedeemInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 交易账号,
	 */
	private String transactionAccount;
	
	/**
	 * 赎回份额,
	 */
	private String share;
	
	/**
	 * 网点编号,
	 */
	private String branchCode;
	
	/**
	 * 客户编号或者sessionKey,
	 */
	private String customerId;
	
	/**
	 * 密码,
	 */
	private String password;
	
	/**
	 * 取现用途,1.取现 3.信用卡还款 a.申购保险 A.还贷款
	 */
	private String useFlag;
	
	/**
	 * 快速赎回标示0普通赎回１快速赎回,
	 */
	private String fastFlag;
	
	/**
	 * 巨额赎回标识１继续０放弃,
	 */
	private String largeFlag;
	
	public DsFundRedeemInput() {
		this.setZ_funcCode("u0a");
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTransactionAccount() {
		return this.transactionAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTransactionAccount(String value)
	 {
		this.transactionAccount = value;
	}
	
	/**
	 * 赎回份额,
	 */
	public String getShare() {
		return this.share;
	}
	
	/**
	 * 赎回份额,
	 */
	public void setShare(String value)
	 {
		this.share = value;
	}
	
	/**
	 * 网点编号,
	 */
	public String getBranchCode() {
		return this.branchCode;
	}
	
	/**
	 * 网点编号,
	 */
	public void setBranchCode(String value)
	 {
		this.branchCode = value;
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public String getCustomerId() {
		return this.customerId;
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public void setCustomerId(String value)
	 {
		this.customerId = value;
	}
	
	/**
	 * 密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 取现用途,1.取现 3.信用卡还款 a.申购保险 A.还贷款
	 */
	public String getUseFlag() {
		return this.useFlag;
	}
	
	/**
	 * 取现用途,1.取现 3.信用卡还款 a.申购保险 A.还贷款
	 */
	public void setUseFlag(String value)
	 {
		this.useFlag = value;
	}
	
	/**
	 * 快速赎回标示0普通赎回１快速赎回,
	 */
	public String getFastFlag() {
		return this.fastFlag;
	}
	
	/**
	 * 快速赎回标示0普通赎回１快速赎回,
	 */
	public void setFastFlag(String value)
	 {
		this.fastFlag = value;
	}
	
	/**
	 * 巨额赎回标识１继续０放弃,
	 */
	public String getLargeFlag() {
		return this.largeFlag;
	}
	
	/**
	 * 巨额赎回标识１继续０放弃,
	 */
	public void setLargeFlag(String value)
	 {
		this.largeFlag = value;
	}
}
