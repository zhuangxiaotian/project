package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金列表功能输出明细参数
 */
public class DsFundListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 基金名称,
	 */
	private String fundName;
	
	/**
	 * 基金类型,
	 */
	private String fundType;
	
	/**
	 * 万份收益,
	 */
	private String netValue;
	
	/**
	 * 七日年化,
	 */
	private String totalNetValue;
	
	/**
	 * 净值日期,
	 */
	private String navDate;
	
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
	 * 基金类型,
	 */
	public String getFundType() {
		return this.fundType;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundType(String value)
	 {
		this.fundType = value;
	}
	
	/**
	 * 万份收益,
	 */
	public String getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 万份收益,
	 */
	public void setNetValue(String value)
	 {
		this.netValue = value;
	}
	
	/**
	 * 七日年化,
	 */
	public String getTotalNetValue() {
		return this.totalNetValue;
	}
	
	/**
	 * 七日年化,
	 */
	public void setTotalNetValue(String value)
	 {
		this.totalNetValue = value;
	}
	
	/**
	 * 净值日期,
	 */
	public String getNavDate() {
		return this.navDate;
	}
	
	/**
	 * 净值日期,
	 */
	public void setNavDate(String value)
	 {
		this.navDate = value;
	}
}
