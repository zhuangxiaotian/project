package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金历史净值功能输出明细参数
 */
public class ISHisNetValueQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 净值日期,
	 */
	private java.util.Date priceDate;
	
	/**
	 * 基金净值,
	 */
	private Double netValue;
	
	/**
	 * 累计净值,
	 */
	private Double totalNetValue;
	
	/**
	 * 涨跌幅,
	 */
	private Double changeRate;
	
	/**
	 * 绩效指数,
	 */
	private Double performanceIndex;
	
	/**
	 * 基金名称,
	 */
	private String fundname;
	
	/**
	 * 基金状态,
	 */
	private String fundstate;
	
	/**
	 * 基金总份额,
	 */
	private Double fundtotalshare;
	
	/**
	 * 万份基金单位收益,
	 */
	private String hf_incomeratio;
	
	/**
	 * 基金收益率,
	 */
	private String incomeratio;
	
	/**
	 * 基金类型,
	 */
	private String fundtype;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
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
	 * 基金净值,
	 */
	public Double getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 基金净值,
	 */
	public void setNetValue(Double value)
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
	 * 绩效指数,
	 */
	public Double getPerformanceIndex() {
		return this.performanceIndex;
	}
	
	/**
	 * 绩效指数,
	 */
	public void setPerformanceIndex(Double value)
	 {
		this.performanceIndex = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 基金状态,
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 基金总份额,
	 */
	public Double getFundtotalshare() {
		return this.fundtotalshare;
	}
	
	/**
	 * 基金总份额,
	 */
	public void setFundtotalshare(Double value)
	 {
		this.fundtotalshare = value;
	}
	
	/**
	 * 万份基金单位收益,
	 */
	public String getHf_incomeratio() {
		return this.hf_incomeratio;
	}
	
	/**
	 * 万份基金单位收益,
	 */
	public void setHf_incomeratio(String value)
	 {
		this.hf_incomeratio = value;
	}
	
	/**
	 * 基金收益率,
	 */
	public String getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 基金收益率,
	 */
	public void setIncomeratio(String value)
	 {
		this.incomeratio = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
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
