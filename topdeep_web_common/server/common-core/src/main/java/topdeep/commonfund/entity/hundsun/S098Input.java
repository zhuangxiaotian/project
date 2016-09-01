package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 注册信息查询(S098)
 */
public class S098Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 注册方式,
	 */
	private String authmode = "1：邮箱，2：手机";
	
	/**
	 * 注册密码,
	 */
	private String loginpwd = "";
	
	/**
	 * 邮箱,
	 */
	private String email = "authmode=1时，必填";
	
	/**
	 * 手机,
	 */
	private String mobile = "authmode=2时，必填";
	
	/**
	 * 初始化参数
	 */
	public S098Input() {
		this.setFunction("S098");
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("authmode", this.authmode);
		inputMap.put("loginpwd", this.loginpwd);
		inputMap.put("email", this.email);
		inputMap.put("mobile", this.mobile);
	}
}
