package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 当日交易申请查询功能输出明细参数
 */
public class DsTodayApplicationQueryOutputTransactionsAccountDetail extends Object implements Serializable {
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 交易账号名称,
	 */
	private String transactionsName;
	
	/**
	 * 资金账号名称,
	 */
	private String financialAccountName;
	
	/**
	 * 真实交易账号,
	 */
	private String realTransactionsAccount;
	
	/**
	 * 真实交易账号名称,
	 */
	private String realTransactionsName;
	
	/**
	 * 折扣信息,
	 */
	private String discountInfo;
	
	/**
	 * 业务代码,
	 */
	private String callingCode;
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 明细资金方式,
	 */
	private String detailcapitalmode;
	
	/**
	 * 银行返回错误原因,
	 */
	private String cperrormsg;
	
	/**
	 * 备注,
	 */
	private String explain;
	
	/**
	 * 申请份额,
	 */
	private Double applyshare;
	
	/**
	 * 基金名称,
	 */
	private String fundName;
	
	/**
	 * 转入基金名称,
	 */
	private String fundName2;
	
	/**
	 * 所属交易日,
	 */
	private java.util.Date realTransactionDate;
	
	/**
	 * 银行编号,
	 */
	private String bankserial;
	
	/**
	 * 银行卡号,
	 */
	private String bankNo;
	
	/**
	 * 交易账号,
	 */
	public String getTransactionsAccount() {
		return this.transactionsAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTransactionsAccount(String value)
	 {
		this.transactionsAccount = value;
	}
	
	/**
	 * 交易账号名称,
	 */
	public String getTransactionsName() {
		return this.transactionsName;
	}
	
	/**
	 * 交易账号名称,
	 */
	public void setTransactionsName(String value)
	 {
		this.transactionsName = value;
	}
	
	/**
	 * 资金账号名称,
	 */
	public String getFinancialAccountName() {
		return this.financialAccountName;
	}
	
	/**
	 * 资金账号名称,
	 */
	public void setFinancialAccountName(String value)
	 {
		this.financialAccountName = value;
	}
	
	/**
	 * 真实交易账号,
	 */
	public String getRealTransactionsAccount() {
		return this.realTransactionsAccount;
	}
	
	/**
	 * 真实交易账号,
	 */
	public void setRealTransactionsAccount(String value)
	 {
		this.realTransactionsAccount = value;
	}
	
	/**
	 * 真实交易账号名称,
	 */
	public String getRealTransactionsName() {
		return this.realTransactionsName;
	}
	
	/**
	 * 真实交易账号名称,
	 */
	public void setRealTransactionsName(String value)
	 {
		this.realTransactionsName = value;
	}
	
	/**
	 * 折扣信息,
	 */
	public String getDiscountInfo() {
		return this.discountInfo;
	}
	
	/**
	 * 折扣信息,
	 */
	public void setDiscountInfo(String value)
	 {
		this.discountInfo = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getCallingCode() {
		return this.callingCode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setCallingCode(String value)
	 {
		this.callingCode = value;
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
	 * 明细资金方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 银行返回错误原因,
	 */
	public String getCperrormsg() {
		return this.cperrormsg;
	}
	
	/**
	 * 银行返回错误原因,
	 */
	public void setCperrormsg(String value)
	 {
		this.cperrormsg = value;
	}
	
	/**
	 * 备注,
	 */
	public String getExplain() {
		return this.explain;
	}
	
	/**
	 * 备注,
	 */
	public void setExplain(String value)
	 {
		this.explain = value;
	}
	
	/**
	 * 申请份额,
	 */
	public Double getApplyshare() {
		return this.applyshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setApplyshare(Double value)
	 {
		this.applyshare = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundName() {
		return this.fundName;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundName(String value)
	 {
		this.fundName = value;
	}
	
	/**
	 * 转入基金名称,
	 */
	public String getFundName2() {
		return this.fundName2;
	}
	
	/**
	 * 转入基金名称,
	 */
	public void setFundName2(String value)
	 {
		this.fundName2 = value;
	}
	
	/**
	 * 所属交易日,
	 */
	public java.util.Date getRealTransactionDate() {
		return this.realTransactionDate;
	}
	
	/**
	 * 所属交易日,
	 */
	public void setRealTransactionDate(java.util.Date value)
	 {
		this.realTransactionDate = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
	}
}
