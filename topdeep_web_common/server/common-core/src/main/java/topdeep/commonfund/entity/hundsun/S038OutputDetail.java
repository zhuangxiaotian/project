package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * T+0划款流水查询(S038)功能输出明细参数
 */
public class S038OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务原因,
	 */
	private String callingreason = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 资金流水号,
	 */
	private String otherfundserialno = "";
	
	/**
	 * 外部申请编号,
	 */
	private String otherrequestno = "";
	
	/**
	 * 申请金额,
	 */
	private String applysum = "";
	
	/**
	 * 币种,
	 */
	private String balancecoin = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行户名,
	 */
	private String bankacconame = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankno = "";
	
	/**
	 * 客户类别,
	 */
	private String customertype = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 划款状态,
	 */
	private String state = "";
	
	/**
	 * 业务原因,
	 */
	public String getCallingreason() {
		return this.callingreason;
	}
	
	/**
	 * 业务原因,
	 */
	public void setCallingreason(String value)
	 {
		this.callingreason = value;
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
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 资金流水号,
	 */
	public String getOtherfundserialno() {
		return this.otherfundserialno;
	}
	
	/**
	 * 资金流水号,
	 */
	public void setOtherfundserialno(String value)
	 {
		this.otherfundserialno = value;
	}
	
	/**
	 * 外部申请编号,
	 */
	public String getOtherrequestno() {
		return this.otherrequestno;
	}
	
	/**
	 * 外部申请编号,
	 */
	public void setOtherrequestno(String value)
	 {
		this.otherrequestno = value;
	}
	
	/**
	 * 申请金额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 币种,
	 */
	public String getBalancecoin() {
		return this.balancecoin;
	}
	
	/**
	 * 币种,
	 */
	public void setBalancecoin(String value)
	 {
		this.balancecoin = value;
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
	 * 银行户名,
	 */
	public String getBankacconame() {
		return this.bankacconame;
	}
	
	/**
	 * 银行户名,
	 */
	public void setBankacconame(String value)
	 {
		this.bankacconame = value;
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
	 * 客户类别,
	 */
	public String getCustomertype() {
		return this.customertype;
	}
	
	/**
	 * 客户类别,
	 */
	public void setCustomertype(String value)
	 {
		this.customertype = value;
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
	 * 划款状态,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 划款状态,
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
}
