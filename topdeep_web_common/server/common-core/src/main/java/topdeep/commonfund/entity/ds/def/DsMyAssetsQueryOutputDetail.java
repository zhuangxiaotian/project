package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 资产查询功能输出明细参数
 */
public class DsMyAssetsQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 当前份额余额,
	 */
	private String currentShare;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
	/**
	 * 资金方式,
	 */
	private String capitalMode;
	
	/**
	 * 基金账户,
	 */
	private String fundAccount;
	
	/**
	 * 当日收益,
	 */
	private String dayIncome;
	
	/**
	 * 累计收益,
	 */
	private String totalIncome;
	
	/**
	 * 净值,
	 */
	private String netValue;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 可用份额余额,
	 */
	private String avaliableShare;
	
	/**
	 * 交易账户,
	 */
	private String transactionAccount;
	
	/**
	 * 当前份额余额,
	 */
	public String getCurrentShare() {
		return this.currentShare;
	}
	
	/**
	 * 当前份额余额,
	 */
	public void setCurrentShare(String value)
	 {
		this.currentShare = value;
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
	 * 当日收益,
	 */
	public String getDayIncome() {
		return this.dayIncome;
	}
	
	/**
	 * 当日收益,
	 */
	public void setDayIncome(String value)
	 {
		this.dayIncome = value;
	}
	
	/**
	 * 累计收益,
	 */
	public String getTotalIncome() {
		return this.totalIncome;
	}
	
	/**
	 * 累计收益,
	 */
	public void setTotalIncome(String value)
	 {
		this.totalIncome = value;
	}
	
	/**
	 * 净值,
	 */
	public String getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 净值,
	 */
	public void setNetValue(String value)
	 {
		this.netValue = value;
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
	 * 可用份额余额,
	 */
	public String getAvaliableShare() {
		return this.avaliableShare;
	}
	
	/**
	 * 可用份额余额,
	 */
	public void setAvaliableShare(String value)
	 {
		this.avaliableShare = value;
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
}
