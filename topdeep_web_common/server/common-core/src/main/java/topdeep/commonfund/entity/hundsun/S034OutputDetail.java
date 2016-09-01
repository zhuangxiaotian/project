package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 费率折扣查询(S034)功能输出明细参数
 */
public class S034OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 目标基金,
	 */
	private String otherfundcode = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 补差折扣率,
	 */
	private String enddiscount = "";
	
	/**
	 * 后收费折扣率,
	 */
	private String otherdiscount = "";
	
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
	 * 目标基金,
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 目标基金,
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
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
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 补差折扣率,
	 */
	public String getEnddiscount() {
		return this.enddiscount;
	}
	
	/**
	 * 补差折扣率,
	 */
	public void setEnddiscount(String value)
	 {
		this.enddiscount = value;
	}
	
	/**
	 * 后收费折扣率,
	 */
	public String getOtherdiscount() {
		return this.otherdiscount;
	}
	
	/**
	 * 后收费折扣率,
	 */
	public void setOtherdiscount(String value)
	 {
		this.otherdiscount = value;
	}
}
