package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史基金行情查询(S006)功能输出明细参数
 */
public class S006OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 基金状态,取字典“基金状态”
	 */
	private String fundstate;
	
	/**
	 * 单位净值,
	 */
	private String pernetvalue = "";
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	private String sharetype;
	
	/**
	 * 基金总份额,
	 */
	private Double fundtotalshare;
	
	/**
	 * 万份基金单位收益,
	 */
	private String hf_incomeratio = "";
	
	/**
	 * 基金收益率(华夏),
	 */
	private String hx_f_incomeratio = "";
	
	/**
	 * 万份基金单位收益(华夏),
	 */
	private String hx_hf_incomeratio = "";
	
	/**
	 * 基金收益,
	 */
	private String income = "";
	
	/**
	 * 基金收益率,
	 */
	private String incomeratio = "";
	
	/**
	 * 行情日期,
	 */
	private String navdate = "";
	
	/**
	 * 基金类型,只有数据中心返回才有
	 */
	private String fundtype;
	
	/**
	 * 累计净值,只有数据中心返回才有
	 */
	private Double totalnetvalue;
	
	/**
	 * 净值日期,
	 */
	private String valdate = "";
	
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
	 * 基金状态,取字典“基金状态”
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,取字典“基金状态”
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 单位净值,
	 */
	public String getPernetvalue() {
		return this.pernetvalue;
	}
	
	/**
	 * 单位净值,
	 */
	public void setPernetvalue(String value)
	 {
		this.pernetvalue = value;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
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
	 * 基金收益率(华夏),
	 */
	public String getHx_f_incomeratio() {
		return this.hx_f_incomeratio;
	}
	
	/**
	 * 基金收益率(华夏),
	 */
	public void setHx_f_incomeratio(String value)
	 {
		this.hx_f_incomeratio = value;
	}
	
	/**
	 * 万份基金单位收益(华夏),
	 */
	public String getHx_hf_incomeratio() {
		return this.hx_hf_incomeratio;
	}
	
	/**
	 * 万份基金单位收益(华夏),
	 */
	public void setHx_hf_incomeratio(String value)
	 {
		this.hx_hf_incomeratio = value;
	}
	
	/**
	 * 基金收益,
	 */
	public String getIncome() {
		return this.income;
	}
	
	/**
	 * 基金收益,
	 */
	public void setIncome(String value)
	 {
		this.income = value;
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
	 * 行情日期,
	 */
	public String getNavdate() {
		return this.navdate;
	}
	
	/**
	 * 行情日期,
	 */
	public void setNavdate(String value)
	 {
		this.navdate = value;
	}
	
	/**
	 * 基金类型,只有数据中心返回才有
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,只有数据中心返回才有
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 累计净值,只有数据中心返回才有
	 */
	public Double getTotalnetvalue() {
		return this.totalnetvalue;
	}
	
	/**
	 * 累计净值,只有数据中心返回才有
	 */
	public void setTotalnetvalue(Double value)
	 {
		this.totalnetvalue = value;
	}
	
	/**
	 * 净值日期,
	 */
	public String getValdate() {
		return this.valdate;
	}
	
	/**
	 * 净值日期,
	 */
	public void setValdate(String value)
	 {
		this.valdate = value;
	}
}
