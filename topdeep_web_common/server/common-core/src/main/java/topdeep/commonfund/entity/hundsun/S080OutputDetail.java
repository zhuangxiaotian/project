package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史份额查询(S080)功能输出明细参数
 */
public class S080OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 份额,
	 */
	private String lastshares = "";
	
	/**
	 * 市值,
	 */
	private String marketvalue = "";
	
	/**
	 * 销售机构,
	 */
	private String agencyno = "";
	
	/**
	 * 分红方式,
	 */
	private String bonustype = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 净值,
	 */
	private String fundvalue = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
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
	 * 份额,
	 */
	public String getLastshares() {
		return this.lastshares;
	}
	
	/**
	 * 份额,
	 */
	public void setLastshares(String value)
	 {
		this.lastshares = value;
	}
	
	/**
	 * 市值,
	 */
	public String getMarketvalue() {
		return this.marketvalue;
	}
	
	/**
	 * 市值,
	 */
	public void setMarketvalue(String value)
	 {
		this.marketvalue = value;
	}
	
	/**
	 * 销售机构,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售机构,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 分红方式,
	 */
	public String getBonustype() {
		return this.bonustype;
	}
	
	/**
	 * 分红方式,
	 */
	public void setBonustype(String value)
	 {
		this.bonustype = value;
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
	 * 净值,
	 */
	public String getFundvalue() {
		return this.fundvalue;
	}
	
	/**
	 * 净值,
	 */
	public void setFundvalue(String value)
	 {
		this.fundvalue = value;
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
}
