package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询开通支付转让协议的交易账户功能输出明细参数
 */
public class ISSupportPayTransactionsAccountOutputDetail extends Object implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 交易账户,
	 */
	private String transactionAccount;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
	/**
	 * 资金方式,
	 */
	private String capitalMode;
	
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
}
