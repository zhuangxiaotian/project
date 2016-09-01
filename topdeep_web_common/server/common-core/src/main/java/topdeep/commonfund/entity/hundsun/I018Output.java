package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史收益模拟计算(I018)
 */
public class I018Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 普通定投收益率,
	 */
	private String generalprofit = "";
	
	/**
	 * 普通定投期末资产,
	 */
	private String generalvalue = "";
	
	/**
	 * 累计投入本金,
	 */
	private String totalvalue = "";
	
	/**
	 * 趋势定投期末资产,
	 */
	private String trendvalue = "";
	
	/**
	 * 趋势定投收益率,
	 */
	private String trendprofit = "";
	
	private List<I018OutputDetail> detail = new ArrayList<I018OutputDetail>();
	
	/**
	 * 普通定投收益率,
	 */
	public String getGeneralprofit() {
		return this.generalprofit;
	}
	
	/**
	 * 普通定投收益率,
	 */
	public void setGeneralprofit(String value)
	 {
		this.generalprofit = value;
	}
	
	/**
	 * 普通定投期末资产,
	 */
	public String getGeneralvalue() {
		return this.generalvalue;
	}
	
	/**
	 * 普通定投期末资产,
	 */
	public void setGeneralvalue(String value)
	 {
		this.generalvalue = value;
	}
	
	/**
	 * 累计投入本金,
	 */
	public String getTotalvalue() {
		return this.totalvalue;
	}
	
	/**
	 * 累计投入本金,
	 */
	public void setTotalvalue(String value)
	 {
		this.totalvalue = value;
	}
	
	/**
	 * 趋势定投期末资产,
	 */
	public String getTrendvalue() {
		return this.trendvalue;
	}
	
	/**
	 * 趋势定投期末资产,
	 */
	public void setTrendvalue(String value)
	 {
		this.trendvalue = value;
	}
	
	/**
	 * 趋势定投收益率,
	 */
	public String getTrendprofit() {
		return this.trendprofit;
	}
	
	/**
	 * 趋势定投收益率,
	 */
	public void setTrendprofit(String value)
	 {
		this.trendprofit = value;
	}
	
	public List<I018OutputDetail> getDetail() {
		return this.detail;
	}
	
}
