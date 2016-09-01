package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询用户的交易账户列表功能输出明细参数
 */
public class DsTransactionsAccountQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 交易账户,
	 */
	private String transactionAccount;
	
	/**
	 * 基金账户,
	 */
	private String fundAccount;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 银行卡状态,
	 */
	private String state;
	
	/**
	 * 是否开通网上交易,
	 */
	private String isTrade;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
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
	 * 基金账户,
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账户,
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
	
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
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 银行卡状态,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 银行卡状态,
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 是否开通网上交易,
	 */
	public String getIsTrade() {
		return this.isTrade;
	}
	
	/**
	 * 是否开通网上交易,
	 */
	public void setIsTrade(String value)
	 {
		this.isTrade = value;
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
}
