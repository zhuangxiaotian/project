package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银联渠道无密身份验证(B017)
 */
public class B017Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 请求序列号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 银行返回码,
	 */
	private String respcode = "";
	
	/**
	 * 银行返回信息,
	 */
	private String respdesc = "";
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 资金模式,
	 */
	private String capitalmode = "";
	
	/**
	 * 认证成功与否的标志,
	 */
	private String cpflag = "0--失败，1--成功";
	
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
	 * 请求序列号,
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
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
	 * 银行返回码,
	 */
	public String getRespcode() {
		return this.respcode;
	}
	
	/**
	 * 银行返回码,
	 */
	public void setRespcode(String value)
	 {
		this.respcode = value;
	}
	
	/**
	 * 银行返回信息,
	 */
	public String getRespdesc() {
		return this.respdesc;
	}
	
	/**
	 * 银行返回信息,
	 */
	public void setRespdesc(String value)
	 {
		this.respdesc = value;
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
	 * 资金模式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金模式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 认证成功与否的标志,
	 */
	public String getCpflag() {
		return this.cpflag;
	}
	
	/**
	 * 认证成功与否的标志,
	 */
	public void setCpflag(String value)
	 {
		this.cpflag = value;
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
}
