package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 明细查询功能输出明细参数
 */
public class ISTransactionRecordDetailQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 业务名称,
	 */
	private String businessName;
	
	/**
	 * 基金名称,
	 */
	private String fundName;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 资金来源,
	 */
	private String capitalMode;
	
	/**
	 * 支付账号,
	 */
	private String occurBankAccount;
	
	/**
	 * 基金账号,
	 */
	private String fundAccount;
	
	/**
	 * 交易编号,
	 */
	private String applySerial;
	
	/**
	 * 下单日期,
	 */
	private String applyDate;
	
	/**
	 * 下单时间,
	 */
	private String acceptTime;
	
	/**
	 * 交易确认金额,
	 */
	private String applySum;
	
	/**
	 * 所属交易日,
	 */
	private String workDate;
	
	/**
	 * 支付时间,
	 */
	private String purchaseDate;
	
	/**
	 * 资金状态,
	 */
	private String kkstat;
	
	/**
	 * 确认标志,
	 */
	private String confirmFlag;
	
	/**
	 * 确认状态,
	 */
	private String confirmStat;
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 开始时间,
	 */
	private java.util.Date beginDate;
	
	/**
	 * 结束时间,
	 */
	private java.util.Date endDate;
	
	/**
	 * 存入申请,
	 */
	private String purchaseApply;
	
	/**
	 * 存入,
	 */
	private String purchase;
	
	/**
	 * 取现申请,
	 */
	private String redeemApply;
	
	/**
	 * 取现,
	 */
	private String redeem;
	
	/**
	 * 收益,
	 */
	private String income;
	
	/**
	 * 银行卡对应的原申请编号,
	 */
	private String bankApplySerial;
	
	/**
	 * 业务名称,
	 */
	public String getBusinessName() {
		return this.businessName;
	}
	
	/**
	 * 业务名称,
	 */
	public void setBusinessName(String value)
	 {
		this.businessName = value;
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
	 * 资金来源,
	 */
	public String getCapitalMode() {
		return this.capitalMode;
	}
	
	/**
	 * 资金来源,
	 */
	public void setCapitalMode(String value)
	 {
		this.capitalMode = value;
	}
	
	/**
	 * 支付账号,
	 */
	public String getOccurBankAccount() {
		return this.occurBankAccount;
	}
	
	/**
	 * 支付账号,
	 */
	public void setOccurBankAccount(String value)
	 {
		this.occurBankAccount = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
	
	/**
	 * 交易编号,
	 */
	public String getApplySerial() {
		return this.applySerial;
	}
	
	/**
	 * 交易编号,
	 */
	public void setApplySerial(String value)
	 {
		this.applySerial = value;
	}
	
	/**
	 * 下单日期,
	 */
	public String getApplyDate() {
		return this.applyDate;
	}
	
	/**
	 * 下单日期,
	 */
	public void setApplyDate(String value)
	 {
		this.applyDate = value;
	}
	
	/**
	 * 下单时间,
	 */
	public String getAcceptTime() {
		return this.acceptTime;
	}
	
	/**
	 * 下单时间,
	 */
	public void setAcceptTime(String value)
	 {
		this.acceptTime = value;
	}
	
	/**
	 * 交易确认金额,
	 */
	public String getApplySum() {
		return this.applySum;
	}
	
	/**
	 * 交易确认金额,
	 */
	public void setApplySum(String value)
	 {
		this.applySum = value;
	}
	
	/**
	 * 所属交易日,
	 */
	public String getWorkDate() {
		return this.workDate;
	}
	
	/**
	 * 所属交易日,
	 */
	public void setWorkDate(String value)
	 {
		this.workDate = value;
	}
	
	/**
	 * 支付时间,
	 */
	public String getPurchaseDate() {
		return this.purchaseDate;
	}
	
	/**
	 * 支付时间,
	 */
	public void setPurchaseDate(String value)
	 {
		this.purchaseDate = value;
	}
	
	/**
	 * 资金状态,
	 */
	public String getKkstat() {
		return this.kkstat;
	}
	
	/**
	 * 资金状态,
	 */
	public void setKkstat(String value)
	 {
		this.kkstat = value;
	}
	
	/**
	 * 确认标志,
	 */
	public String getConfirmFlag() {
		return this.confirmFlag;
	}
	
	/**
	 * 确认标志,
	 */
	public void setConfirmFlag(String value)
	 {
		this.confirmFlag = value;
	}
	
	/**
	 * 确认状态,
	 */
	public String getConfirmStat() {
		return this.confirmStat;
	}
	
	/**
	 * 确认状态,
	 */
	public void setConfirmStat(String value)
	 {
		this.confirmStat = value;
	}
	
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
	 * 开始时间,
	 */
	public java.util.Date getBeginDate() {
		return this.beginDate;
	}
	
	/**
	 * 开始时间,
	 */
	public void setBeginDate(java.util.Date value)
	 {
		this.beginDate = value;
	}
	
	/**
	 * 结束时间,
	 */
	public java.util.Date getEndDate() {
		return this.endDate;
	}
	
	/**
	 * 结束时间,
	 */
	public void setEndDate(java.util.Date value)
	 {
		this.endDate = value;
	}
	
	/**
	 * 存入申请,
	 */
	public String getPurchaseApply() {
		return this.purchaseApply;
	}
	
	/**
	 * 存入申请,
	 */
	public void setPurchaseApply(String value)
	 {
		this.purchaseApply = value;
	}
	
	/**
	 * 存入,
	 */
	public String getPurchase() {
		return this.purchase;
	}
	
	/**
	 * 存入,
	 */
	public void setPurchase(String value)
	 {
		this.purchase = value;
	}
	
	/**
	 * 取现申请,
	 */
	public String getRedeemApply() {
		return this.redeemApply;
	}
	
	/**
	 * 取现申请,
	 */
	public void setRedeemApply(String value)
	 {
		this.redeemApply = value;
	}
	
	/**
	 * 取现,
	 */
	public String getRedeem() {
		return this.redeem;
	}
	
	/**
	 * 取现,
	 */
	public void setRedeem(String value)
	 {
		this.redeem = value;
	}
	
	/**
	 * 收益,
	 */
	public String getIncome() {
		return this.income;
	}
	
	/**
	 * 收益,
	 */
	public void setIncome(String value)
	 {
		this.income = value;
	}
	
	/**
	 * 银行卡对应的原申请编号,
	 */
	public String getBankApplySerial() {
		return this.bankApplySerial;
	}
	
	/**
	 * 银行卡对应的原申请编号,
	 */
	public void setBankApplySerial(String value)
	 {
		this.bankApplySerial = value;
	}
}
