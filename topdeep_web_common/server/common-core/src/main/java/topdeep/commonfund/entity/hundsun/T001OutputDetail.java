package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可购买基金列表(T001)功能输出明细参数
 */
public class T001OutputDetail extends Object implements Serializable {
	
	/**
	 * 是否集合基金,1:基金为集合基金
	 */
	private String collectprodct = "";
	
	/**
	 * 基金是否已经签约,1：基金已经签约
	 */
	private String iscontract = "";
	
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
	private String fundstate = "";
	
	/**
	 * 是否为现金宝基金,1是0否
	 */
	private String ismoneyfund = "";
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	private String risklevel = "";
	
	/**
	 * 收费方式,取字典“份额类别”
	 */
	private String sharetype = "";
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 万份收益率,
	 */
	private String hf_incomeratio = "";
	
	/**
	 * 收益,
	 */
	private String income = "";
	
	/**
	 * 收益率,
	 */
	private String incomeratio = "";
	
	/**
	 * 净值日期,yyyymmdd格式
	 */
	private String navdate = "";
	
	/**
	 * 基金净值,已经按##.0000格式化
	 */
	private String pernetvalue = "";
	
	/**
	 * 是否集合基金,1:基金为集合基金
	 */
	public String getCollectprodct() {
		return this.collectprodct;
	}
	
	/**
	 * 是否集合基金,1:基金为集合基金
	 */
	public void setCollectprodct(String value)
	 {
		this.collectprodct = value;
	}
	
	/**
	 * 基金是否已经签约,1：基金已经签约
	 */
	public String getIscontract() {
		return this.iscontract;
	}
	
	/**
	 * 基金是否已经签约,1：基金已经签约
	 */
	public void setIscontract(String value)
	 {
		this.iscontract = value;
	}
	
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
	 * 是否为现金宝基金,1是0否
	 */
	public String getIsmoneyfund() {
		return this.ismoneyfund;
	}
	
	/**
	 * 是否为现金宝基金,1是0否
	 */
	public void setIsmoneyfund(String value)
	 {
		this.ismoneyfund = value;
	}
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	public String getRisklevel() {
		return this.risklevel;
	}
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	public void setRisklevel(String value)
	 {
		this.risklevel = value;
	}
	
	/**
	 * 收费方式,取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,取字典“份额类别”
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 万份收益率,
	 */
	public String getHf_incomeratio() {
		return this.hf_incomeratio;
	}
	
	/**
	 * 万份收益率,
	 */
	public void setHf_incomeratio(String value)
	 {
		this.hf_incomeratio = value;
	}
	
	/**
	 * 收益,
	 */
	public String getIncome() {
		return this.income;
	}
	
	/**
	 * 收益,
	 */
	public void setIncome(String value)
	 {
		this.income = value;
	}
	
	/**
	 * 收益率,
	 */
	public String getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 收益率,
	 */
	public void setIncomeratio(String value)
	 {
		this.incomeratio = value;
	}
	
	/**
	 * 净值日期,yyyymmdd格式
	 */
	public String getNavdate() {
		return this.navdate;
	}
	
	/**
	 * 净值日期,yyyymmdd格式
	 */
	public void setNavdate(String value)
	 {
		this.navdate = value;
	}
	
	/**
	 * 基金净值,已经按##.0000格式化
	 */
	public String getPernetvalue() {
		return this.pernetvalue;
	}
	
	/**
	 * 基金净值,已经按##.0000格式化
	 */
	public void setPernetvalue(String value)
	 {
		this.pernetvalue = value;
	}
}
