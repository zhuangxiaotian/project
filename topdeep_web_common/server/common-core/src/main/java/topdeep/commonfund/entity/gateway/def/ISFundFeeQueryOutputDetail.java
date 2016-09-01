package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金费用功能输出明细参数
 */
public class ISFundFeeQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 费用类型,
	 */
	private String feeType;
	
	/**
	 * 费用名称,
	 */
	private String feeName;
	
	/**
	 * 费用,
	 */
	private String feeValue;
	
	/**
	 * 显示区间,
	 */
	private String feeIntervalDisplay;
	
	/**
	 * 费用类型,
	 */
	public String getFeeType() {
		return this.feeType;
	}
	
	/**
	 * 费用类型,
	 */
	public void setFeeType(String value)
	 {
		this.feeType = value;
	}
	
	/**
	 * 费用名称,
	 */
	public String getFeeName() {
		return this.feeName;
	}
	
	/**
	 * 费用名称,
	 */
	public void setFeeName(String value)
	 {
		this.feeName = value;
	}
	
	/**
	 * 费用,
	 */
	public String getFeeValue() {
		return this.feeValue;
	}
	
	/**
	 * 费用,
	 */
	public void setFeeValue(String value)
	 {
		this.feeValue = value;
	}
	
	/**
	 * 显示区间,
	 */
	public String getFeeIntervalDisplay() {
		return this.feeIntervalDisplay;
	}
	
	/**
	 * 显示区间,
	 */
	public void setFeeIntervalDisplay(String value)
	 {
		this.feeIntervalDisplay = value;
	}
}
