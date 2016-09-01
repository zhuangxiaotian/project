package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金净值查询(S007)功能输出明细参数
 */
public class S007OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 基金状态,取字典“基金状态”，当datasource=DC的时候，该字段不返回
	 */
	private String fundstate;
	
	/**
	 * 单位净值,
	 */
	private Double pernetvalue;
	
	/**
	 * 份额类别,取字典“份额类别”，当datasource=DC的时候，该字段不返回
	 */
	private String sharetype;
	
	/**
	 * 结算币种,"156":人民币,"840":美元
	 */
	private String balancecoin = "";
	
	/**
	 * 基金总份额,当datasource=DC的时候，该字段不返回
	 */
	private Double fundtotalshare;
	
	/**
	 * 万份基金单位收益,
	 */
	private Double hf_incomeratio;
	
	/**
	 * 基金收益率(华夏),非华夏基金无效
	 */
	private Double hx_f_incomeratio;
	
	/**
	 * 万份基金单位收益(华夏),非华夏基金无效
	 */
	private Double hx_hf_incomeratio;
	
	/**
	 * 基金收益,
	 */
	private Double income;
	
	/**
	 * 基金收益率,
	 */
	private Double incomeratio;
	
	/**
	 * 行情日期（净值日期）,一般是昨天
	 */
	private String navdate = "";
	
	/**
	 * 基金管理人代码,取字典“基金管理人名称”，当datasource=DC的时候，该字段不返回
	 */
	private String managercode = "";
	
	/**
	 * 基金最小持有份额,当datasource=DC的时候，该字段不返回
	 */
	private String minshare = "";
	
	/**
	 * 接收行情日期,一般是今天
	 */
	private String date = "";
	
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
	 * 基金状态,取字典“基金状态”，当datasource=DC的时候，该字段不返回
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,取字典“基金状态”，当datasource=DC的时候，该字段不返回
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 单位净值,
	 */
	public Double getPernetvalue() {
		return this.pernetvalue;
	}
	
	/**
	 * 单位净值,
	 */
	public void setPernetvalue(Double value)
	 {
		this.pernetvalue = value;
	}
	
	/**
	 * 份额类别,取字典“份额类别”，当datasource=DC的时候，该字段不返回
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”，当datasource=DC的时候，该字段不返回
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 结算币种,"156":人民币,"840":美元
	 */
	public String getBalancecoin() {
		return this.balancecoin;
	}
	
	/**
	 * 结算币种,"156":人民币,"840":美元
	 */
	public void setBalancecoin(String value)
	 {
		this.balancecoin = value;
	}
	
	/**
	 * 基金总份额,当datasource=DC的时候，该字段不返回
	 */
	public Double getFundtotalshare() {
		return this.fundtotalshare;
	}
	
	/**
	 * 基金总份额,当datasource=DC的时候，该字段不返回
	 */
	public void setFundtotalshare(Double value)
	 {
		this.fundtotalshare = value;
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
	 * 基金收益率(华夏),非华夏基金无效
	 */
	public Double getHx_f_incomeratio() {
		return this.hx_f_incomeratio;
	}
	
	/**
	 * 基金收益率(华夏),非华夏基金无效
	 */
	public void setHx_f_incomeratio(Double value)
	 {
		this.hx_f_incomeratio = value;
	}
	
	/**
	 * 万份基金单位收益(华夏),非华夏基金无效
	 */
	public Double getHx_hf_incomeratio() {
		return this.hx_hf_incomeratio;
	}
	
	/**
	 * 万份基金单位收益(华夏),非华夏基金无效
	 */
	public void setHx_hf_incomeratio(Double value)
	 {
		this.hx_hf_incomeratio = value;
	}
	
	/**
	 * 基金收益,
	 */
	public Double getIncome() {
		return this.income;
	}
	
	/**
	 * 基金收益,
	 */
	public void setIncome(Double value)
	 {
		this.income = value;
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
	 * 行情日期（净值日期）,一般是昨天
	 */
	public String getNavdate() {
		return this.navdate;
	}
	
	/**
	 * 行情日期（净值日期）,一般是昨天
	 */
	public void setNavdate(String value)
	 {
		this.navdate = value;
	}
	
	/**
	 * 基金管理人代码,取字典“基金管理人名称”，当datasource=DC的时候，该字段不返回
	 */
	public String getManagercode() {
		return this.managercode;
	}
	
	/**
	 * 基金管理人代码,取字典“基金管理人名称”，当datasource=DC的时候，该字段不返回
	 */
	public void setManagercode(String value)
	 {
		this.managercode = value;
	}
	
	/**
	 * 基金最小持有份额,当datasource=DC的时候，该字段不返回
	 */
	public String getMinshare() {
		return this.minshare;
	}
	
	/**
	 * 基金最小持有份额,当datasource=DC的时候，该字段不返回
	 */
	public void setMinshare(String value)
	 {
		this.minshare = value;
	}
	
	/**
	 * 接收行情日期,一般是今天
	 */
	public String getDate() {
		return this.date;
	}
	
	/**
	 * 接收行情日期,一般是今天
	 */
	public void setDate(String value)
	 {
		this.date = value;
	}
}
