package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 预约赎回功能输入参数
 */
public class ISAppointmentRedeemInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 预约名称,
	 */
	private String appointmentName;
	
	/**
	 * 赎回基金代码,
	 */
	private String fundCode;
	
	/**
	 * 赎回份额类别,
	 */
	private String shareType;
	
	/**
	 * 赎回份额,
	 */
	private Double amount;
	
	/**
	 * 预约方式,
	 */
	private String appointmentStyle;
	
	/**
	 * 指数代码条件,
	 */
	private String indexCodeCondition;
	
	/**
	 * 基金净值条件中的基金代码,
	 */
	private String fundCodeCondition;
	
	/**
	 * 二元操作符,
	 */
	private String binaryOperation;
	
	/**
	 * 期望值条件,
	 */
	private String expectValueCondition;
	
	/**
	 * 预约终止日期,
	 */
	private java.util.Date appointmentTerminationDate;
	
	/**
	 * 交易密码,
	 */
	private String password;
	
	/**
	 * 赎回标志,
	 */
	private String redeemFlag;
	
	public ISAppointmentRedeemInput() {
		this.setZ_funcCode("u0o");
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
	 * 预约名称,
	 */
	public String getAppointmentName() {
		return this.appointmentName;
	}
	
	/**
	 * 预约名称,
	 */
	public void setAppointmentName(String value)
	 {
		this.appointmentName = value;
	}
	
	/**
	 * 赎回基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 赎回基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 赎回份额类别,
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 赎回份额类别,
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 赎回份额,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 赎回份额,
	 */
	public void setAmount(Double value)
	 {
		this.amount = value;
	}
	
	/**
	 * 预约方式,
	 */
	public String getAppointmentStyle() {
		return this.appointmentStyle;
	}
	
	/**
	 * 预约方式,
	 */
	public void setAppointmentStyle(String value)
	 {
		this.appointmentStyle = value;
	}
	
	/**
	 * 指数代码条件,
	 */
	public String getIndexCodeCondition() {
		return this.indexCodeCondition;
	}
	
	/**
	 * 指数代码条件,
	 */
	public void setIndexCodeCondition(String value)
	 {
		this.indexCodeCondition = value;
	}
	
	/**
	 * 基金净值条件中的基金代码,
	 */
	public String getFundCodeCondition() {
		return this.fundCodeCondition;
	}
	
	/**
	 * 基金净值条件中的基金代码,
	 */
	public void setFundCodeCondition(String value)
	 {
		this.fundCodeCondition = value;
	}
	
	/**
	 * 二元操作符,
	 */
	public String getBinaryOperation() {
		return this.binaryOperation;
	}
	
	/**
	 * 二元操作符,
	 */
	public void setBinaryOperation(String value)
	 {
		this.binaryOperation = value;
	}
	
	/**
	 * 期望值条件,
	 */
	public String getExpectValueCondition() {
		return this.expectValueCondition;
	}
	
	/**
	 * 期望值条件,
	 */
	public void setExpectValueCondition(String value)
	 {
		this.expectValueCondition = value;
	}
	
	/**
	 * 预约终止日期,
	 */
	public java.util.Date getAppointmentTerminationDate() {
		return this.appointmentTerminationDate;
	}
	
	/**
	 * 预约终止日期,
	 */
	public void setAppointmentTerminationDate(java.util.Date value)
	 {
		this.appointmentTerminationDate = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 交易密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 赎回标志,
	 */
	public String getRedeemFlag() {
		return this.redeemFlag;
	}
	
	/**
	 * 赎回标志,
	 */
	public void setRedeemFlag(String value)
	 {
		this.redeemFlag = value;
	}
}
