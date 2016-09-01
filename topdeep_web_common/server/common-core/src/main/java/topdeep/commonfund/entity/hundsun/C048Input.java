package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 随机密码生成(C048)
 */
public class C048Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户名称,
	 */
	private String custname = "";
	
	/**
	 * 证件号码,
	 */
	private String lognumber = "";
	
	/**
	 * 号码类型,1:基金账号;2:证件号码
	 */
	private String logtype = "";
	
	/**
	 * 返回信息,
	 */
	private String message = "";
	
	/**
	 * 电子邮箱,邮件发送时作为验证项
	 */
	private String email = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 手机号码,短信发送时作为验证项
	 */
	private String mobile = "";
	
	/**
	 * 随机密码,
	 */
	private String randompwd = "";
	
	/**
	 * 重置类型,0:邮箱;空或1:短信;
	 */
	private String sendtype = "";
	
	/**
	 * 新密码,
	 */
	private String newPwd = "";
	
	/**
	 * 初始化参数
	 */
	public C048Input() {
		this.setFunction("C048");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getLognumber() {
		return this.lognumber;
	}
	
	/**
	 * 证件号码,
	 */
	public void setLognumber(String value)
	 {
		this.lognumber = value;
	}
	
	/**
	 * 号码类型,1:基金账号;2:证件号码
	 */
	public String getLogtype() {
		return this.logtype;
	}
	
	/**
	 * 号码类型,1:基金账号;2:证件号码
	 */
	public void setLogtype(String value)
	 {
		this.logtype = value;
	}
	
	/**
	 * 返回信息,
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * 返回信息,
	 */
	public void setMessage(String value)
	 {
		this.message = value;
	}
	
	/**
	 * 电子邮箱,邮件发送时作为验证项
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 电子邮箱,邮件发送时作为验证项
	 */
	public void setEmail(String value)
	 {
		this.email = value;
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
	 * 手机号码,短信发送时作为验证项
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机号码,短信发送时作为验证项
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	/**
	 * 随机密码,
	 */
	public String getRandompwd() {
		return this.randompwd;
	}
	
	/**
	 * 随机密码,
	 */
	public void setRandompwd(String value)
	 {
		this.randompwd = value;
	}
	
	/**
	 * 重置类型,0:邮箱;空或1:短信;
	 */
	public String getSendtype() {
		return this.sendtype;
	}
	
	/**
	 * 重置类型,0:邮箱;空或1:短信;
	 */
	public void setSendtype(String value)
	 {
		this.sendtype = value;
	}
	
	/**
	 * 新密码,
	 */
	public String getNewPwd() {
		return this.newPwd;
	}
	
	/**
	 * 新密码,
	 */
	public void setNewPwd(String value)
	 {
		this.newPwd = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custname", this.custname);
		inputMap.put("lognumber", this.lognumber);
		inputMap.put("logtype", this.logtype);
		inputMap.put("message", this.message);
		inputMap.put("email", this.email);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("mobile", this.mobile);
		inputMap.put("randompwd", this.randompwd);
		inputMap.put("sendtype", this.sendtype);
		inputMap.put("newPwd", this.newPwd);
	}
}
