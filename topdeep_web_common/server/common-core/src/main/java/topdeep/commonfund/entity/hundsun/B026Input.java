package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银联通SDK开户签名生成(B026)
 */
public class B026Input extends HundsunBaseInput implements Serializable {
	
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
	 * 姓别(对应直销的性别字典),
	 */
	private String sex = "0--女，1-- 男";
	
	/**
	 * 开户行名称,
	 */
	private String bankname = "";
	
	/**
	 * 业务类别,
	 */
	private String busintype = "";
	
	/**
	 * 邮箱,
	 */
	private String email = "";
	
	/**
	 * 银行预留的手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 银联回调地址,该值不为空时，以此为准。为空时，仍然取原系统参数“CHINAPAY_MOBILE_RCVOPENACCOACTION”
	 */
	private String returnurl = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 初始化参数
	 */
	public B026Input() {
		this.setFunction("B026");
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
	 * 姓别(对应直销的性别字典),
	 */
	public String getSex() {
		return this.sex;
	}
	
	/**
	 * 姓别(对应直销的性别字典),
	 */
	public void setSex(String value)
	 {
		this.sex = value;
	}
	
	/**
	 * 开户行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 开户行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 业务类别,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务类别,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
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
	 * 银行预留的手机号码,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 银行预留的手机号码,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	/**
	 * 银联回调地址,该值不为空时，以此为准。为空时，仍然取原系统参数“CHINAPAY_MOBILE_RCVOPENACCOACTION”
	 */
	public String getReturnurl() {
		return this.returnurl;
	}
	
	/**
	 * 银联回调地址,该值不为空时，以此为准。为空时，仍然取原系统参数“CHINAPAY_MOBILE_RCVOPENACCOACTION”
	 */
	public void setReturnurl(String value)
	 {
		this.returnurl = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("sex", this.sex);
		inputMap.put("bankname", this.bankname);
		inputMap.put("busintype", this.busintype);
		inputMap.put("email", this.email);
		inputMap.put("mobile", this.mobile);
		inputMap.put("returnurl", this.returnurl);
		inputMap.put("capitalmode", this.capitalmode);
	}
}
