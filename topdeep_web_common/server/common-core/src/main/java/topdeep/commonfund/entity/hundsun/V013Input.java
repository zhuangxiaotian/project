package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 验证手机验证码(V013)
 */
public class V013Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 验证码,
	 */
	private String authcode = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 客户编号,除了V012的sendintent为openacco以外，其他必传
	 */
	private String custno = "";
	
	/**
	 * 证件号码,V012的sendintent为openacco必传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,V012的sendintent为openacco必传
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public V013Input() {
		this.setFunction("V013");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 验证码,
	 */
	public String getAuthcode() {
		return this.authcode;
	}
	
	/**
	 * 验证码,
	 */
	public void setAuthcode(String value)
	 {
		this.authcode = value;
	}
	
	/**
	 * 手机号码,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机号码,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	/**
	 * 客户编号,除了V012的sendintent为openacco以外，其他必传
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,除了V012的sendintent为openacco以外，其他必传
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 证件号码,V012的sendintent为openacco必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,V012的sendintent为openacco必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,V012的sendintent为openacco必传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,V012的sendintent为openacco必传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("authcode", this.authcode);
		inputMap.put("mobile", this.mobile);
		inputMap.put("custno", this.custno);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
