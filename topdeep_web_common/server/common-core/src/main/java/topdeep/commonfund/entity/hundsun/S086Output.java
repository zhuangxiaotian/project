package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户信息查询(S086)
 */
public class S086Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 客户名,
	 */
	private String custname = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 客户类型,
	 */
	private String custtype = "";
	
	/**
	 * 交易密码,
	 */
	private String dealpwd = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 客户名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 客户类型,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getDealpwd() {
		return this.dealpwd;
	}
	
	/**
	 * 交易密码,
	 */
	public void setDealpwd(String value)
	 {
		this.dealpwd = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
}
