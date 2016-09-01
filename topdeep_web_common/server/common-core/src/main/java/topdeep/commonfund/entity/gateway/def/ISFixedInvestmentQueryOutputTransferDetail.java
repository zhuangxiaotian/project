package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期定额查询功能输出明细参数
 */
public class ISFixedInvestmentQueryOutputTransferDetail extends Object implements Serializable {
	
	/**
	 * 协议号,
	 */
	private String agreementNo;
	
	/**
	 * 开通日期,
	 */
	private java.util.Date startDate;
	
	/**
	 * 计划名称,
	 */
	private String projectName;
	
	/**
	 * 转出基金代码,
	 */
	private String outFundCode;
	
	/**
	 * 转出份额类别,
	 */
	private String outShareType;
	
	/**
	 * 转出交易账号,
	 */
	private String outTransactionsAccount;
	
	/**
	 * 转出份额,
	 */
	private Double amount;
	
	/**
	 * 转入基金代码,
	 */
	private String inFundCode;
	
	/**
	 * 转入份额类别,
	 */
	private String inShareType;
	
	/**
	 * 转入交易账号,
	 */
	private String inTransactionsAccount;
	
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
	 * 协议状态,
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
	 * 转出基金代码,
	 */
	public String getOutFundCode() {
		return this.outFundCode;
	}
	
	/**
	 * 转出基金代码,
	 */
	public void setOutFundCode(String value)
	 {
		this.outFundCode = value;
	}
	
	/**
	 * 转出份额类别,
	 */
	public String getOutShareType() {
		return this.outShareType;
	}
	
	/**
	 * 转出份额类别,
	 */
	public void setOutShareType(String value)
	 {
		this.outShareType = value;
	}
	
	/**
	 * 转出交易账号,
	 */
	public String getOutTransactionsAccount() {
		return this.outTransactionsAccount;
	}
	
	/**
	 * 转出交易账号,
	 */
	public void setOutTransactionsAccount(String value)
	 {
		this.outTransactionsAccount = value;
	}
	
	/**
	 * 转出份额,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 转出份额,
	 */
	public void setAmount(Double value)
	 {
		this.amount = value;
	}
	
	/**
	 * 转入基金代码,
	 */
	public String getInFundCode() {
		return this.inFundCode;
	}
	
	/**
	 * 转入基金代码,
	 */
	public void setInFundCode(String value)
	 {
		this.inFundCode = value;
	}
	
	/**
	 * 转入份额类别,
	 */
	public String getInShareType() {
		return this.inShareType;
	}
	
	/**
	 * 转入份额类别,
	 */
	public void setInShareType(String value)
	 {
		this.inShareType = value;
	}
	
	/**
	 * 转入交易账号,
	 */
	public String getInTransactionsAccount() {
		return this.inTransactionsAccount;
	}
	
	/**
	 * 转入交易账号,
	 */
	public void setInTransactionsAccount(String value)
	 {
		this.inTransactionsAccount = value;
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
	 * 协议状态,
	 */
	public String getAgreementState() {
		return this.agreementState;
	}
	
	/**
	 * 协议状态,
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
