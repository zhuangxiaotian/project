package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 注册信息修改(C063)
 */
public class C063Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 注册方式,
	 */
	private String authmode = "已废弃";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 旧注册密码,
	 */
	private String oldloginpwd = "";
	
	/**
	 * 用户名,
	 */
	private String custname = "";
	
	/**
	 * 邮箱,
	 */
	private String email = "authmode=1时，必填";
	
	/**
	 * 手机,
	 */
	private String mobile = "authmode=2时，必填";
	
	/**
	 * 新注册密码,
	 */
	private String newloginpwd = "";
	
	/**
	 * 初始化参数
	 */
	public C063Input() {
		this.setFunction("C063");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 注册方式,
	 */
	public String getAuthmode() {
		return this.authmode;
	}
	
	/**
	 * 注册方式,
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
	 * 旧注册密码,
	 */
	public String getOldloginpwd() {
		return this.oldloginpwd;
	}
	
	/**
	 * 旧注册密码,
	 */
	public void setOldloginpwd(String value)
	 {
		this.oldloginpwd = value;
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
	
	/**
	 * 新注册密码,
	 */
	public String getNewloginpwd() {
		return this.newloginpwd;
	}
	
	/**
	 * 新注册密码,
	 */
	public void setNewloginpwd(String value)
	 {
		this.newloginpwd = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("authmode", this.authmode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("oldloginpwd", this.oldloginpwd);
		inputMap.put("custname", this.custname);
		inputMap.put("email", this.email);
		inputMap.put("mobile", this.mobile);
		inputMap.put("newloginpwd", this.newloginpwd);
	}
}
