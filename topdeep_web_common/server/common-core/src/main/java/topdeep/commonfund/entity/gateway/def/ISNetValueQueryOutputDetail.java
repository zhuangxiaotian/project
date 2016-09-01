package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金净值功能输出明细参数
 */
public class ISNetValueQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 基金净值,
	 */
	private Double netValue;
	
	/**
	 * 基金收益率,
	 */
	private Double incomeratio;
	
	/**
	 * 净值日期,
	 */
	private java.util.Date priceDate;
	
	/**
	 * 涨跌幅,
	 */
	private Double changeRate;
	
	/**
	 * 基金名称,
	 */
	private String fundname;
	
	/**
	 * 基金状态,
	 */
	private String fundstate;
	
	/**
	 * 万份基金单位收益,
	 */
	private Double hf_incomeratio;
	
	/**
	 * 累计净值,
	 */
	private Double totalnetvalue;
	
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
	 * 基金收益率,
	 */
	public Double getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 基金收益率,
	 */
	public void setIncomeratio(Double value)
	 {
		this.incomeratio = value;
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
	 * 万份基金单位收益,
	 */
	public Double getHf_incomeratio() {
		return this.hf_incomeratio;
	}
	
	/**
	 * 万份基金单位收益,
	 */
	public void setHf_incomeratio(Double value)
	 {
		this.hf_incomeratio = value;
	}
	
	/**
	 * 累计净值,
	 */
	public Double getTotalnetvalue() {
		return this.totalnetvalue;
	}
	
	/**
	 * 累计净值,
	 */
	public void setTotalnetvalue(Double value)
	 {
		this.totalnetvalue = value;
	}
}
