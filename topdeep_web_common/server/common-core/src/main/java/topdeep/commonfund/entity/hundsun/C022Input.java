package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开通/取消手机委托(C022)
 */
public class C022Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 登陆类型,1:基金账号;2:证件号码
	 */
	private String logtype = "2";
	
	/**
	 * 手机交易业务,1:开通;0:取消
	 */
	private String mobiletrust = "";
	
	/**
	 * 密码,密码登陆（系统参数“API_LOGIN_ENCRYPTPWD”为1)，传递密文。 用des进行加密传输，密钥为商户密码（暂未实现，目前是明文密码）
	 */
	private String password = "";
	
	/**
	 * 证件类型,读取字典项返回
	 */
	private String certificatetype = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 证件号码,
	 */
	private String lognumber = "";
	
	/**
	 * 初始化参数
	 */
	public C022Input() {
		this.setFunction("C022");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 登陆类型,1:基金账号;2:证件号码
	 */
	public String getLogtype() {
		return this.logtype;
	}
	
	/**
	 * 登陆类型,1:基金账号;2:证件号码
	 */
	public void setLogtype(String value)
	 {
		this.logtype = value;
	}
	
	/**
	 * 手机交易业务,1:开通;0:取消
	 */
	public String getMobiletrust() {
		return this.mobiletrust;
	}
	
	/**
	 * 手机交易业务,1:开通;0:取消
	 */
	public void setMobiletrust(String value)
	 {
		this.mobiletrust = value;
	}
	
	/**
	 * 密码,密码登陆（系统参数“API_LOGIN_ENCRYPTPWD”为1)，传递密文。 用des进行加密传输，密钥为商户密码（暂未实现，目前是明文密码）
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码,密码登陆（系统参数“API_LOGIN_ENCRYPTPWD”为1)，传递密文。 用des进行加密传输，密钥为商户密码（暂未实现，目前是明文密码）
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 证件类型,读取字典项返回
	 */
	public String getCertificatetype() {
		return this.certificatetype;
	}
	
	/**
	 * 证件类型,读取字典项返回
	 */
	public void setCertificatetype(String value)
	 {
		this.certificatetype = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("logtype", this.logtype);
		inputMap.put("mobiletrust", this.mobiletrust);
		inputMap.put("password", this.password);
		inputMap.put("certificatetype", this.certificatetype);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("lognumber", this.lognumber);
	}
}
