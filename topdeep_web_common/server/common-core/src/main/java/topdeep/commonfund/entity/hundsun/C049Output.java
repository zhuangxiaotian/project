package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取开户留痕(C049)
 */
public class C049Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 城市编号,
	 */
	private String citycode = "";
	
	/**
	 * 用户姓名,
	 */
	private String customerappellation = "";
	
	/**
	 * 邮箱,
	 */
	private String email = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 省市编号,
	 */
	private String provincecode = "";
	
	/**
	 * 手机号码,
	 */
	private String telphone = "";
	
	/**
	 * 银行卡号,
	 */
	private String yinliancdcard = "";
	
	/**
	 * 开户请求流水号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 银联使用标志,
	 */
	private String cpflag = "";
	
	/**
	 * 开户请求流水号,
	 */
	private String custcardstat = "";
	
	/**
	 * 客户实名状态,
	 */
	private String custstat = "";
	
	/**
	 * 用户类型,
	 */
	private String custtype = "";
	
	/**
	 * 详细资金方式,
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 银行账号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,
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
	 * 城市编号,
	 */
	public String getCitycode() {
		return this.citycode;
	}
	
	/**
	 * 城市编号,
	 */
	public void setCitycode(String value)
	 {
		this.citycode = value;
	}
	
	/**
	 * 用户姓名,
	 */
	public String getCustomerappellation() {
		return this.customerappellation;
	}
	
	/**
	 * 用户姓名,
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
	 * 省市编号,
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 省市编号,
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
	}
	
	/**
	 * 手机号码,
	 */
	public String getTelphone() {
		return this.telphone;
	}
	
	/**
	 * 手机号码,
	 */
	public void setTelphone(String value)
	 {
		this.telphone = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
	
	/**
	 * 开户请求流水号,
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 开户请求流水号,
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 银联使用标志,
	 */
	public String getCpflag() {
		return this.cpflag;
	}
	
	/**
	 * 银联使用标志,
	 */
	public void setCpflag(String value)
	 {
		this.cpflag = value;
	}
	
	/**
	 * 开户请求流水号,
	 */
	public String getCustcardstat() {
		return this.custcardstat;
	}
	
	/**
	 * 开户请求流水号,
	 */
	public void setCustcardstat(String value)
	 {
		this.custcardstat = value;
	}
	
	/**
	 * 客户实名状态,
	 */
	public String getCuststat() {
		return this.custstat;
	}
	
	/**
	 * 客户实名状态,
	 */
	public void setCuststat(String value)
	 {
		this.custstat = value;
	}
	
	/**
	 * 用户类型,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 用户类型,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 详细资金方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 详细资金方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
}
