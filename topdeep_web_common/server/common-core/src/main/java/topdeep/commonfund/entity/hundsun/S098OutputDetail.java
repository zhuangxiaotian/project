package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 注册信息查询(S098)功能输出明细参数
 */
public class S098OutputDetail extends Object implements Serializable {
	
	/**
	 * 用户名,
	 */
	private String custname = "";
	
	/**
	 * 邮箱,
	 */
	private String email = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 手机,
	 */
	private String mobile = "";
	
	/**
	 * 用户名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 用户名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 邮箱,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
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
	
	/**
	 * 手机,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
}
