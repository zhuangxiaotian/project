package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收益变动曲线功能输出明细参数
 */
public class ISIncomeChangeListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 收益日期,
	 */
	private java.util.Date incomeDate;
	
	/**
	 * 收益,
	 */
	private Double incomeValue;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 收益日期,
	 */
	public java.util.Date getIncomeDate() {
		return this.incomeDate;
	}
	
	/**
	 * 收益日期,
	 */
	public void setIncomeDate(java.util.Date value)
	 {
		this.incomeDate = value;
	}
	
	/**
	 * 收益,
	 */
	public Double getIncomeValue() {
		return this.incomeValue;
	}
	
	/**
	 * 收益,
	 */
	public void setIncomeValue(Double value)
	 {
		this.incomeValue = value;
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
}
