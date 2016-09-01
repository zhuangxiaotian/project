package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 用户注册(P015)
 */
public class P0015Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 注册方式,1：邮箱，2：手机
	 */
	private String authmode = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 注册密码,
	 */
	private String loginpwd = "";
	
	/**
	 * 用户名,
	 */
	private String custname = "";
	
	/**
	 * 邮箱,authmode=1时，必填
	 */
	private String email = "";
	
	/**
	 * 手机,authmode=2时，必填
	 */
	private String mobile = "";
	
	/**
	 * 初始化参数
	 */
	public P0015Input() {
		this.setFunction("P0015");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 注册方式,1：邮箱，2：手机
	 */
	public String getAuthmode() {
		return this.authmode;
	}
	
	/**
	 * 注册方式,1：邮箱，2：手机
	 */
	public void setAuthmode(String value)
	 {
		this.authmode = value;
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
	 * 注册密码,
	 */
	public String getLoginpwd() {
		return this.loginpwd;
	}
	
	/**
	 * 注册密码,
	 */
	public void setLoginpwd(String value)
	 {
		this.loginpwd = value;
	}
	
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
	 * 邮箱,authmode=1时，必填
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱,authmode=1时，必填
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 手机,authmode=2时，必填
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机,authmode=2时，必填
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("authmode", this.authmode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("loginpwd", this.loginpwd);
		inputMap.put("custname", this.custname);
		inputMap.put("email", this.email);
		inputMap.put("mobile", this.mobile);
	}
}
