package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金购买(现金宝)功能输入参数
 */
public class DsFundCurrencyPurchaseInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 交易账号,
	 */
	private String transactionAccount;
	
	/**
	 * 申购金额,
	 */
	private String amount;
	
	/**
	 * 付费方式,
	 */
	private String shareType;
	
	/**
	 * 基金编号,
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
	 * 支付方式,
	 */
	private String detailcapitalmode;
	
	public DsFundCurrencyPurchaseInput() {
		this.setZ_funcCode("u09");
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
	 * 申购金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 申购金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 付费方式,
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 付费方式,
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 基金编号,
	 */
	public String getBranchCode() {
		return this.branchCode;
	}
	
	/**
	 * 基金编号,
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
	 * 支付方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 支付方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
}
