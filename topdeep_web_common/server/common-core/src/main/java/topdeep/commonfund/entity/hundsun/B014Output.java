package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道当前银行卡查询(B014)
 */
public class B014Output extends HundsunBaseOutput implements Serializable {
	
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
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 客户名称,
	 */
	private String custname = "";
	
	/**
	 * 银行证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 银行证件类型,
	 */
	private String identitytype = "";
	
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
	 * 客户名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
}
