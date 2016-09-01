package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改手机绑定状态(V014)
 */
public class V014Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 手机绑定状态,空不修改，1开通，0关闭
	 */
	private String mobilebind = "";
	
	/**
	 * 手机登陆绑定状态,空不修改，1开通，0关闭
	 */
	private String mobileloginbind = "";
	
	/**
	 * 初始化参数
	 */
	public V014Input() {
		this.setFunction("V014");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 手机绑定状态,空不修改，1开通，0关闭
	 */
	public String getMobilebind() {
		return this.mobilebind;
	}
	
	/**
	 * 手机绑定状态,空不修改，1开通，0关闭
	 */
	public void setMobilebind(String value)
	 {
		this.mobilebind = value;
	}
	
	/**
	 * 手机登陆绑定状态,空不修改，1开通，0关闭
	 */
	public String getMobileloginbind() {
		return this.mobileloginbind;
	}
	
	/**
	 * 手机登陆绑定状态,空不修改，1开通，0关闭
	 */
	public void setMobileloginbind(String value)
	 {
		this.mobileloginbind = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("mobile", this.mobile);
		inputMap.put("mobilebind", this.mobilebind);
		inputMap.put("mobileloginbind", this.mobileloginbind);
	}
}
