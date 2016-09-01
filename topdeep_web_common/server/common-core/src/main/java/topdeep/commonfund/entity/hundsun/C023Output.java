package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 实名认证(C023)
 */
public class C023Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 业务类型,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	private String busitype = "";
	
	/**
	 * 是否通过实名认证,true：通过实名认证 false：实名认证失败
	 */
	private String realname = "";
	
	/**
	 * 客户姓名,
	 */
	private String custname = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 请求序列号,网上交易生成返回此序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 业务类型,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 是否通过实名认证,true：通过实名认证 false：实名认证失败
	 */
	public String getRealname() {
		return this.realname;
	}
	
	/**
	 * 是否通过实名认证,true：通过实名认证 false：实名认证失败
	 */
	public void setRealname(String value)
	 {
		this.realname = value;
	}
	
	/**
	 * 客户姓名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
	 * 请求序列号,网上交易生成返回此序列号
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,网上交易生成返回此序列号
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
}
