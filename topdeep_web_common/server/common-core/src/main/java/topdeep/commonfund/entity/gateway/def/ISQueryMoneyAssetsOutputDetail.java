package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询现金宝资产功能输出明细参数
 */
public class ISQueryMoneyAssetsOutputDetail extends Object implements Serializable {
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
	/**
	 * 交易账户,
	 */
	private String transactionAccount;
	
	/**
	 * 可用份额,
	 */
	private String share;
	
	/**
	 * 资金方式,
	 */
	private String capitalMode;
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 总份额,
	 */
	private String currentShare;
	
	/**
	 * 是否开通转让支付０否１是,
	 */
	private String isOpenPay;
	
	/**
	 * 银行编号,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankName() {
		return this.bankName;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankName(String value)
	 {
		this.bankName = value;
	}
	
	/**
	 * 交易账户,
	 */
	public String getTransactionAccount() {
		return this.transactionAccount;
	}
	
	/**
	 * 交易账户,
	 */
	public void setTransactionAccount(String value)
	 {
		this.transactionAccount = value;
	}
	
	/**
	 * 可用份额,
	 */
	public String getShare() {
		return this.share;
	}
	
	/**
	 * 可用份额,
	 */
	public void setShare(String value)
	 {
		this.share = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalMode() {
		return this.capitalMode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalMode(String value)
	 {
		this.capitalMode = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankAccount(String value)
	 {
		this.bankAccount = value;
	}
	
	/**
	 * 总份额,
	 */
	public String getCurrentShare() {
		return this.currentShare;
	}
	
	/**
	 * 总份额,
	 */
	public void setCurrentShare(String value)
	 {
		this.currentShare = value;
	}
	
	/**
	 * 是否开通转让支付０否１是,
	 */
	public String getIsOpenPay() {
		return this.isOpenPay;
	}
	
	/**
	 * 是否开通转让支付０否１是,
	 */
	public void setIsOpenPay(String value)
	 {
		this.isOpenPay = value;
	}
}
