package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史收益模拟计算(I018)功能输出明细参数
 */
public class I018OutputDetail extends Object implements Serializable {
	
	/**
	 * 上证综指,
	 */
	private String exponentclosevalue = "";
	
	/**
	 * 普通定投,
	 */
	private String generalvalue = "";
	
	/**
	 * 日期,
	 */
	private String requestdate = "";
	
	/**
	 * 本金投入,
	 */
	private String totalvalue = "";
	
	/**
	 * 趋势定投,
	 */
	private String trendvalue = "";
	
	/**
	 * 上证综指,
	 */
	public String getExponentclosevalue() {
		return this.exponentclosevalue;
	}
	
	/**
	 * 上证综指,
	 */
	public void setExponentclosevalue(String value)
	 {
		this.exponentclosevalue = value;
	}
	
	/**
	 * 普通定投,
	 */
	public String getGeneralvalue() {
		return this.generalvalue;
	}
	
	/**
	 * 普通定投,
	 */
	public void setGeneralvalue(String value)
	 {
		this.generalvalue = value;
	}
	
	/**
	 * 日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 本金投入,
	 */
	public String getTotalvalue() {
		return this.totalvalue;
	}
	
	/**
	 * 本金投入,
	 */
	public void setTotalvalue(String value)
	 {
		this.totalvalue = value;
	}
	
	/**
	 * 趋势定投,
	 */
	public String getTrendvalue() {
		return this.trendvalue;
	}
	
	/**
	 * 趋势定投,
	 */
	public void setTrendvalue(String value)
	 {
		this.trendvalue = value;
	}
}
