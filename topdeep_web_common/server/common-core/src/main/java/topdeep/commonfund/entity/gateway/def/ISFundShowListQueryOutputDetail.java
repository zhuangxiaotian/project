package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金显示列表功能输出明细参数
 */
public class ISFundShowListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 基金名称,
	 */
	private String fundName;
	
	/**
	 * 是否货币基金,
	 */
	private Boolean isMoneyFund;
	
	/**
	 * 基金分类代码,
	 */
	private String fundCategoryCode;
	
	/**
	 * 基金净值,
	 */
	private String netValue;
	
	/**
	 * 累计净值,
	 */
	private Double totalNetValue;
	
	/**
	 * 净值日期,
	 */
	private java.util.Date priceDate;
	
	/**
	 * 涨跌幅,
	 */
	private Double changeRate;
	
	/**
	 * 基金状态,
	 */
	private String fundStatus;
	
	/**
	 * 风险等级,
	 */
	private String fundrisklevel;
	
	/**
	 * 万份收益率,
	 */
	private String hfincomeratio;
	
	/**
	 * 七日年化收益率,
	 */
	private String incomeratio;
	
	/**
	 * 累计净值,
	 */
	private String totalnetvalue;
	
	/**
	 * 基金最小持有份额,
	 */
	private String minshare;
	
	/**
	 * 产品开放日,
	 */
	private String openday;
	
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
	 * 是否货币基金,
	 */
	public Boolean getIsMoneyFund() {
		return this.isMoneyFund;
	}
	
	/**
	 * 是否货币基金,
	 */
	public void setIsMoneyFund(Boolean value)
	 {
		this.isMoneyFund = value;
	}
	
	/**
	 * 基金分类代码,
	 */
	public String getFundCategoryCode() {
		return this.fundCategoryCode;
	}
	
	/**
	 * 基金分类代码,
	 */
	public void setFundCategoryCode(String value)
	 {
		this.fundCategoryCode = value;
	}
	
	/**
	 * 基金净值,
	 */
	public String getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 基金净值,
	 */
	public void setNetValue(String value)
	 {
		this.netValue = value;
	}
	
	/**
	 * 累计净值,
	 */
	public Double getTotalNetValue() {
		return this.totalNetValue;
	}
	
	/**
	 * 累计净值,
	 */
	public void setTotalNetValue(Double value)
	 {
		this.totalNetValue = value;
	}
	
	/**
	 * 净值日期,
	 */
	public java.util.Date getPriceDate() {
		return this.priceDate;
	}
	
	/**
	 * 净值日期,
	 */
	public void setPriceDate(java.util.Date value)
	 {
		this.priceDate = value;
	}
	
	/**
	 * 涨跌幅,
	 */
	public Double getChangeRate() {
		return this.changeRate;
	}
	
	/**
	 * 涨跌幅,
	 */
	public void setChangeRate(Double value)
	 {
		this.changeRate = value;
	}
	
	/**
	 * 基金状态,
	 */
	public String getFundStatus() {
		return this.fundStatus;
	}
	
	/**
	 * 基金状态,
	 */
	public void setFundStatus(String value)
	 {
		this.fundStatus = value;
	}
	
	/**
	 * 风险等级,
	 */
	public String getFundrisklevel() {
		return this.fundrisklevel;
	}
	
	/**
	 * 风险等级,
	 */
	public void setFundrisklevel(String value)
	 {
		this.fundrisklevel = value;
	}
	
	/**
	 * 万份收益率,
	 */
	public String getHfincomeratio() {
		return this.hfincomeratio;
	}
	
	/**
	 * 万份收益率,
	 */
	public void setHfincomeratio(String value)
	 {
		this.hfincomeratio = value;
	}
	
	/**
	 * 七日年化收益率,
	 */
	public String getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 七日年化收益率,
	 */
	public void setIncomeratio(String value)
	 {
		this.incomeratio = value;
	}
	
	/**
	 * 累计净值,
	 */
	public String getTotalnetvalue() {
		return this.totalnetvalue;
	}
	
	/**
	 * 累计净值,
	 */
	public void setTotalnetvalue(String value)
	 {
		this.totalnetvalue = value;
	}
	
	/**
	 * 基金最小持有份额,
	 */
	public String getMinshare() {
		return this.minshare;
	}
	
	/**
	 * 基金最小持有份额,
	 */
	public void setMinshare(String value)
	 {
		this.minshare = value;
	}
	
	/**
	 * 产品开放日,
	 */
	public String getOpenday() {
		return this.openday;
	}
	
	/**
	 * 产品开放日,
	 */
	public void setOpenday(String value)
	 {
		this.openday = value;
	}
}
