package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 银联通开户签名生成功能输入参数
 */
public class ISChinaPayMobileOpenAccoOrderInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco;
	
	/**
	 * 开户行名称,
	 */
	private String bankname;
	
	/**
	 * 银行编号,
	 */
	private String bankserial;
	
	/**
	 * 业务类别,
	 */
	private String busintype;
	
	/**
	 * 持卡人姓名,
	 */
	private String customerappellation;
	
	/**
	 * 邮箱,
	 */
	private String email;
	
	/**
	 * 证件号码,
	 */
	private String identityno;
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	/**
	 * 银行预留的手机号码,
	 */
	private String mobile;
	
	/**
	 * 姓别(对应直销的性别字典),
	 */
	private String sex;
	
	/**
	 * 银联回调地址,该值不为空时，以此为准。为空时，仍然取原系统参数“CHINAPAY_MOBILE_RCVOPENACCOACTION”
	 */
	private String returnurl;
	
	public ISChinaPayMobileOpenAccoOrderInput() {
		this.setZ_funcCode("n1c");
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
}
