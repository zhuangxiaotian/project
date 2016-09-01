package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投基金列表(I021)功能输出明细参数
 */
public class I021OutputComfundsDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 基金类型,
	 */
	private String fundtype = "";
	
	/**
	 * 基金类型字符串,
	 */
	private String fundtypeStr = "";
	
	/**
	 * 投资金额,
	 */
	private String investment = "";
	
	/**
	 * 投资比率,
	 */
	private String proportion = "";
	
	/**
	 * 投资比率字符串,
	 */
	private String proportionStr = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 收费方式字符串,
	 */
	private String sharetypeValue = "";
	
	/**
	 * TA代码,
	 */
	private String tacode = "";
	
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
	 * 基金类型字符串,
	 */
	public String getFundtypeStr() {
		return this.fundtypeStr;
	}
	
	/**
	 * 基金类型字符串,
	 */
	public void setFundtypeStr(String value)
	 {
		this.fundtypeStr = value;
	}
	
	/**
	 * 投资金额,
	 */
	public String getInvestment() {
		return this.investment;
	}
	
	/**
	 * 投资金额,
	 */
	public void setInvestment(String value)
	 {
		this.investment = value;
	}
	
	/**
	 * 投资比率,
	 */
	public String getProportion() {
		return this.proportion;
	}
	
	/**
	 * 投资比率,
	 */
	public void setProportion(String value)
	 {
		this.proportion = value;
	}
	
	/**
	 * 投资比率字符串,
	 */
	public String getProportionStr() {
		return this.proportionStr;
	}
	
	/**
	 * 投资比率字符串,
	 */
	public void setProportionStr(String value)
	 {
		this.proportionStr = value;
	}
	
	/**
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 收费方式字符串,
	 */
	public String getSharetypeValue() {
		return this.sharetypeValue;
	}
	
	/**
	 * 收费方式字符串,
	 */
	public void setSharetypeValue(String value)
	 {
		this.sharetypeValue = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
}
