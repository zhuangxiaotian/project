package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期定额申购功能输入参数
 */
public class ISFixedInvestmentPurchaseInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 客户编号,
	 */
	private String customerNo;
	
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
	 * 定期日期,
	 */
	private String cycleDate;
	
	/**
	 * 交易密码,
	 */
	private String tradePwd;
	
	public ISFixedInvestmentPurchaseInput() {
		this.setZ_funcCode("u0q");
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustomerNo() {
		return this.customerNo;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustomerNo(String value)
	 {
		this.customerNo = value;
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
	 * 定期日期,
	 */
	public String getCycleDate() {
		return this.cycleDate;
	}
	
	/**
	 * 定期日期,
	 */
	public void setCycleDate(String value)
	 {
		this.cycleDate = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getTradePwd() {
		return this.tradePwd;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradePwd(String value)
	 {
		this.tradePwd = value;
	}
}
