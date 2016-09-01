package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 预约申购功能输入参数
 */
public class ISAppointmentPurchaseInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 客户编号,
	 */
	private String customerNo;
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 预约名称,
	 */
	private String appointmentName;
	
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
	 * 预约方式,说明：预约方式决定了一系列复用条件，以下作一说明，其余预约交易类同：
	 *style_0:按收盘点位预约,indexCodeCondition是预约指数条件，binaryOperation是比较操作符，expectValueCondition是比较值
	 *style_1:指定日期预约，只使用appointmentTerminationDate作为预约条件
	 *style_2:
	 *style_3:按基金涨跌预约，fundCodeCondition用来选择基金，expectValueCondition用来设置涨跌的条件，indexCodeCondition用来设置关联条件
	 *style_4:按指数波动预约，fundCodeCondition复用来设置交易日设置，indexCodeCondition用来设置指数条件，expectValueCondition用来设置参考值
	 *style_5:按相对点位预约，indexCodeCondition用来设置指数条件，binaryOperation用来设置比较条件，fundCodeCondition复用来设置N日均线，expectValueCondition用来设置浮动系数
	 *style_6:按均线事件预约，indexCodeCondition用来设置选择的指数，fundCodeCondition复用来设置均线一，binaryOperation用来设置比较条件，expectValueCondition用来设置均线二
	 */
	private String appointmentStyle;
	
	/**
	 * 指数代码条件,
	 */
	private String indexCodeCondition;
	
	/**
	 * 基金净值条件中的基金代码,还用来复用作为其它预约类型的条件
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
	 * 资金来源,
	 */
	private String capsource;
	
	public ISAppointmentPurchaseInput() {
		this.setZ_funcCode("u0n");
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
	 * 预约方式,说明：预约方式决定了一系列复用条件，以下作一说明，其余预约交易类同：
	 *style_0:按收盘点位预约,indexCodeCondition是预约指数条件，binaryOperation是比较操作符，expectValueCondition是比较值
	 *style_1:指定日期预约，只使用appointmentTerminationDate作为预约条件
	 *style_2:
	 *style_3:按基金涨跌预约，fundCodeCondition用来选择基金，expectValueCondition用来设置涨跌的条件，indexCodeCondition用来设置关联条件
	 *style_4:按指数波动预约，fundCodeCondition复用来设置交易日设置，indexCodeCondition用来设置指数条件，expectValueCondition用来设置参考值
	 *style_5:按相对点位预约，indexCodeCondition用来设置指数条件，binaryOperation用来设置比较条件，fundCodeCondition复用来设置N日均线，expectValueCondition用来设置浮动系数
	 *style_6:按均线事件预约，indexCodeCondition用来设置选择的指数，fundCodeCondition复用来设置均线一，binaryOperation用来设置比较条件，expectValueCondition用来设置均线二
	 */
	public String getAppointmentStyle() {
		return this.appointmentStyle;
	}
	
	/**
	 * 预约方式,说明：预约方式决定了一系列复用条件，以下作一说明，其余预约交易类同：
	 *style_0:按收盘点位预约,indexCodeCondition是预约指数条件，binaryOperation是比较操作符，expectValueCondition是比较值
	 *style_1:指定日期预约，只使用appointmentTerminationDate作为预约条件
	 *style_2:
	 *style_3:按基金涨跌预约，fundCodeCondition用来选择基金，expectValueCondition用来设置涨跌的条件，indexCodeCondition用来设置关联条件
	 *style_4:按指数波动预约，fundCodeCondition复用来设置交易日设置，indexCodeCondition用来设置指数条件，expectValueCondition用来设置参考值
	 *style_5:按相对点位预约，indexCodeCondition用来设置指数条件，binaryOperation用来设置比较条件，fundCodeCondition复用来设置N日均线，expectValueCondition用来设置浮动系数
	 *style_6:按均线事件预约，indexCodeCondition用来设置选择的指数，fundCodeCondition复用来设置均线一，binaryOperation用来设置比较条件，expectValueCondition用来设置均线二
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
	 * 基金净值条件中的基金代码,还用来复用作为其它预约类型的条件
	 */
	public String getFundCodeCondition() {
		return this.fundCodeCondition;
	}
	
	/**
	 * 基金净值条件中的基金代码,还用来复用作为其它预约类型的条件
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
	 * 资金来源,
	 */
	public String getCapsource() {
		return this.capsource;
	}
	
	/**
	 * 资金来源,
	 */
	public void setCapsource(String value)
	 {
		this.capsource = value;
	}
}
