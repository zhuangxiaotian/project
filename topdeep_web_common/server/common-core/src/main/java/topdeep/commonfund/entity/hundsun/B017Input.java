package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银联渠道无密身份验证(B017)
 */
public class B017Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 银行证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 业务类型,
	 */
	private String busitype = "空";
	
	/**
	 * 银行卡户名,
	 */
	private String custname = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "如果要使用手机发起实名认证，手机号码必须传";
	
	/**
	 * 初始化参数
	 */
	public B017Input() {
		this.setFunction("B017");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 银行证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 银行证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 银行证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 业务类型,
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 银行卡户名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 银行卡户名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("busitype", this.busitype);
		inputMap.put("custname", this.custname);
		inputMap.put("mobile", this.mobile);
	}
}
