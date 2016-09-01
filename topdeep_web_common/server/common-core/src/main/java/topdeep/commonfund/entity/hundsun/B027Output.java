package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银联通SDK开户返回信息验证(B027)
 */
public class B027Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 支行信息,
	 */
	private String branchbank = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 银联标志,
	 */
	private String cpflag = "";
	
	/**
	 * 银行卡实名状态,
	 */
	private String custcardstat = "";
	
	/**
	 * 持卡人姓名,
	 */
	private String customerappellation = "";
	
	/**
	 * 客户实名状态,
	 */
	private String custstat = "";
	
	/**
	 * 用户类别,
	 */
	private String custtype = "";
	
	/**
	 * 明细资金方式,
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 证件号码,
	 */
	private String identitynobank = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytypebank = "";
	
	/**
	 * 银行返回订单号,
	 */
	private String orderid = "";
	
	/**
	 * 银联cd卡号,
	 */
	private String yinliancdcard = "";
	
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
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
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
	 * 支行信息,
	 */
	public String getBranchbank() {
		return this.branchbank;
	}
	
	/**
	 * 支行信息,
	 */
	public void setBranchbank(String value)
	 {
		this.branchbank = value;
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
	 * 银联标志,
	 */
	public String getCpflag() {
		return this.cpflag;
	}
	
	/**
	 * 银联标志,
	 */
	public void setCpflag(String value)
	 {
		this.cpflag = value;
	}
	
	/**
	 * 银行卡实名状态,
	 */
	public String getCustcardstat() {
		return this.custcardstat;
	}
	
	/**
	 * 银行卡实名状态,
	 */
	public void setCustcardstat(String value)
	 {
		this.custcardstat = value;
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
	 * 用户类别,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 用户类别,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 明细资金方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
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
	 * 银行返回订单号,
	 */
	public String getOrderid() {
		return this.orderid;
	}
	
	/**
	 * 银行返回订单号,
	 */
	public void setOrderid(String value)
	 {
		this.orderid = value;
	}
	
	/**
	 * 银联cd卡号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联cd卡号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
}
