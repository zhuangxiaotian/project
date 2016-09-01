package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期定额查询功能输出明细参数
 */
public class ISFixedInvestmentQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 协议号,
	 */
	private String agreementNo;
	
	/**
	 * 开通日期,
	 */
	private java.util.Date startDate;
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 计划名称,
	 */
	private String projectName;
	
	/**
	 * 申购基金代码,
	 */
	private String fundCode;
	
	/**
	 * 申购份额类别,
	 */
	private String shareType;
	
	/**
	 * 申购金额,
	 */
	private Double amount;
	
	/**
	 * 周期单位,
	 */
	private String cycleUnit;
	
	/**
	 * 周期值,
	 */
	private String cycleValue;
	
	/**
	 * 交易触发日期,
	 */
	private String transactionsDate;
	
	/**
	 * 独立核算标志,
	 */
	private String separatelyCalculateFlag;
	
	/**
	 * 终止日期,
	 */
	private java.util.Date terminationDate;
	
	/**
	 * 协议状态,1 正常 2 取消 3暂停
	 */
	private String agreementState;
	
	/**
	 * 成功执行次数,
	 */
	private Integer successExecuteCount;
	
	/**
	 * 失败执行次数,
	 */
	private Integer failExecuteCount;
	
	/**
	 * 最后执行日期,
	 */
	private java.util.Date lastExecuteDate;
	
	/**
	 * 独立核算资产余额,
	 */
	private Double assetsBalance;
	
	/**
	 * 独立核算的收益,
	 */
	private Double income;
	
	/**
	 * 协议号,
	 */
	public String getAgreementNo() {
		return this.agreementNo;
	}
	
	/**
	 * 协议号,
	 */
	public void setAgreementNo(String value)
	 {
		this.agreementNo = value;
	}
	
	/**
	 * 开通日期,
	 */
	public java.util.Date getStartDate() {
		return this.startDate;
	}
	
	/**
	 * 开通日期,
	 */
	public void setStartDate(java.util.Date value)
	 {
		this.startDate = value;
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
	 * 计划名称,
	 */
	public String getProjectName() {
		return this.projectName;
	}
	
	/**
	 * 计划名称,
	 */
	public void setProjectName(String value)
	 {
		this.projectName = value;
	}
	
	/**
	 * 申购基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 申购基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 申购份额类别,
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 申购份额类别,
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 申购金额,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 申购金额,
	 */
	public void setAmount(Double value)
	 {
		this.amount = value;
	}
	
	/**
	 * 周期单位,
	 */
	public String getCycleUnit() {
		return this.cycleUnit;
	}
	
	/**
	 * 周期单位,
	 */
	public void setCycleUnit(String value)
	 {
		this.cycleUnit = value;
	}
	
	/**
	 * 周期值,
	 */
	public String getCycleValue() {
		return this.cycleValue;
	}
	
	/**
	 * 周期值,
	 */
	public void setCycleValue(String value)
	 {
		this.cycleValue = value;
	}
	
	/**
	 * 交易触发日期,
	 */
	public String getTransactionsDate() {
		return this.transactionsDate;
	}
	
	/**
	 * 交易触发日期,
	 */
	public void setTransactionsDate(String value)
	 {
		this.transactionsDate = value;
	}
	
	/**
	 * 独立核算标志,
	 */
	public String getSeparatelyCalculateFlag() {
		return this.separatelyCalculateFlag;
	}
	
	/**
	 * 独立核算标志,
	 */
	public void setSeparatelyCalculateFlag(String value)
	 {
		this.separatelyCalculateFlag = value;
	}
	
	/**
	 * 终止日期,
	 */
	public java.util.Date getTerminationDate() {
		return this.terminationDate;
	}
	
	/**
	 * 终止日期,
	 */
	public void setTerminationDate(java.util.Date value)
	 {
		this.terminationDate = value;
	}
	
	/**
	 * 协议状态,1 正常 2 取消 3暂停
	 */
	public String getAgreementState() {
		return this.agreementState;
	}
	
	/**
	 * 协议状态,1 正常 2 取消 3暂停
	 */
	public void setAgreementState(String value)
	 {
		this.agreementState = value;
	}
	
	/**
	 * 成功执行次数,
	 */
	public Integer getSuccessExecuteCount() {
		return this.successExecuteCount;
	}
	
	/**
	 * 成功执行次数,
	 */
	public void setSuccessExecuteCount(Integer value)
	 {
		this.successExecuteCount = value;
	}
	
	/**
	 * 失败执行次数,
	 */
	public Integer getFailExecuteCount() {
		return this.failExecuteCount;
	}
	
	/**
	 * 失败执行次数,
	 */
	public void setFailExecuteCount(Integer value)
	 {
		this.failExecuteCount = value;
	}
	
	/**
	 * 最后执行日期,
	 */
	public java.util.Date getLastExecuteDate() {
		return this.lastExecuteDate;
	}
	
	/**
	 * 最后执行日期,
	 */
	public void setLastExecuteDate(java.util.Date value)
	 {
		this.lastExecuteDate = value;
	}
	
	/**
	 * 独立核算资产余额,
	 */
	public Double getAssetsBalance() {
		return this.assetsBalance;
	}
	
	/**
	 * 独立核算资产余额,
	 */
	public void setAssetsBalance(Double value)
	 {
		this.assetsBalance = value;
	}
	
	/**
	 * 独立核算的收益,
	 */
	public Double getIncome() {
		return this.income;
	}
	
	/**
	 * 独立核算的收益,
	 */
	public void setIncome(Double value)
	 {
		this.income = value;
	}
}
