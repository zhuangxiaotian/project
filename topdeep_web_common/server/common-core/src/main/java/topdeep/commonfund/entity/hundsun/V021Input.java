package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改邮箱绑定状态(V021)
 */
public class V021Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 邮箱地址,
	 */
	private String email = "";
	
	/**
	 * 绑定状态,0：解除绑定；1：绑定
	 */
	private String emailbind = "";
	
	/**
	 * 证件号码,（参考字典：网上交易个人证件类型）
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public V021Input() {
		this.setFunction("V021");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 邮箱地址,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱地址,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 绑定状态,0：解除绑定；1：绑定
	 */
	public String getEmailbind() {
		return this.emailbind;
	}
	
	/**
	 * 绑定状态,0：解除绑定；1：绑定
	 */
	public void setEmailbind(String value)
	 {
		this.emailbind = value;
	}
	
	/**
	 * 证件号码,（参考字典：网上交易个人证件类型）
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,（参考字典：网上交易个人证件类型）
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("email", this.email);
		inputMap.put("emailbind", this.emailbind);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
