package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 联动优势身份验证(B024)
 */
public class B024Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 持卡人姓名,
	 */
	private String customerappellation = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 业务类型,
	 */
	private String busintype = "";
	
	/**
	 * 开户时在银行预留手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 初始化参数
	 */
	public B024Input() {
		this.setFunction("B024");
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
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 持卡人姓名,
	 */
	public String getCustomerappellation() {
		return this.customerappellation;
	}
	
	/**
	 * 持卡人姓名,
	 */
	public void setCustomerappellation(String value)
	 {
		this.customerappellation = value;
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
	 * 业务类型,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 开户时在银行预留手机号码,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 开户时在银行预留手机号码,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("busintype", this.busintype);
		inputMap.put("mobile", this.mobile);
	}
}
