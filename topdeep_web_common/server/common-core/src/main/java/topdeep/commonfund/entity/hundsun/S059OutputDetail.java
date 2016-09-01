package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝基金行情查询(S059)功能输出明细参数
 */
public class S059OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 基金总份额,
	 */
	private Double fundtotalshare;
	
	/**
	 * 万份基金单位收益,
	 */
	private Double hfincomeratio;
	
	/**
	 * 七日年化收益率,
	 */
	private Double incomeratio;
	
	/**
	 * 基金总资产,
	 */
	private Double lastasset;
	
	/**
	 * 净值日期,
	 */
	private String navdate = "";
	
	/**
	 * 基金净值,
	 */
	private Double pernetvalue;
	
	/**
	 * 基金累计净值,
	 */
	private Double totalnetvalue;
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
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
	public Double getHfincomeratio() {
		return this.hfincomeratio;
	}
	
	/**
	 * 万份基金单位收益,
	 */
	public void setHfincomeratio(Double value)
	 {
		this.hfincomeratio = value;
	}
	
	/**
	 * 七日年化收益率,
	 */
	public Double getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 七日年化收益率,
	 */
	public void setIncomeratio(Double value)
	 {
		this.incomeratio = value;
	}
	
	/**
	 * 基金总资产,
	 */
	public Double getLastasset() {
		return this.lastasset;
	}
	
	/**
	 * 基金总资产,
	 */
	public void setLastasset(Double value)
	 {
		this.lastasset = value;
	}
	
	/**
	 * 净值日期,
	 */
	public String getNavdate() {
		return this.navdate;
	}
	
	/**
	 * 净值日期,
	 */
	public void setNavdate(String value)
	 {
		this.navdate = value;
	}
	
	/**
	 * 基金净值,
	 */
	public Double getPernetvalue() {
		return this.pernetvalue;
	}
	
	/**
	 * 基金净值,
	 */
	public void setPernetvalue(Double value)
	 {
		this.pernetvalue = value;
	}
	
	/**
	 * 基金累计净值,
	 */
	public Double getTotalnetvalue() {
		return this.totalnetvalue;
	}
	
	/**
	 * 基金累计净值,
	 */
	public void setTotalnetvalue(Double value)
	 {
		this.totalnetvalue = value;
	}
}
