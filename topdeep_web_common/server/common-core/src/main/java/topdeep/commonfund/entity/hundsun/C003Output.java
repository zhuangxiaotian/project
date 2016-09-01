package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 验证银行开户签名数据(C003)
 */
public class C003Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	private String busytype = "";
	
	/**
	 * 申请编号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 银行编号,
	 */
	private String bankno = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 银行账户名称,
	 */
	private String custnamebank = "";
	
	/**
	 * 证件号码,
	 */
	private String identitynobank = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytypebank = "";
	
	/**
	 * 银联cd号,
	 */
	private String yinliancdcard = "";
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,返回验证签名后银行返回的银行名称
	 */
	private String bankname = "";
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	public String getBusytype() {
		return this.busytype;
	}
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	public void setBusytype(String value)
	 {
		this.busytype = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankno() {
		return this.bankno;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankno(String value)
	 {
		this.bankno = value;
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
	
	/**
	 * 银行账户名称,
	 */
	public String getCustnamebank() {
		return this.custnamebank;
	}
	
	/**
	 * 银行账户名称,
	 */
	public void setCustnamebank(String value)
	 {
		this.custnamebank = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentitynobank() {
		return this.identitynobank;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentitynobank(String value)
	 {
		this.identitynobank = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytypebank() {
		return this.identitytypebank;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytypebank(String value)
	 {
		this.identitytypebank = value;
	}
	
	/**
	 * 银联cd号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联cd号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
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
	 * 银行名称,返回验证签名后银行返回的银行名称
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,返回验证签名后银行返回的银行名称
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
}
