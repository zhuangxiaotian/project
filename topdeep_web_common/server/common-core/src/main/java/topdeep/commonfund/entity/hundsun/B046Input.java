package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * Chinapay手机支付下单(B046)
 */
public class B046Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请日期,
	 */
	private String acceptdate = "";
	
	/**
	 * 金额,
	 */
	private String amount = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 姓名,
	 */
	private String customname = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金类型,
	 */
	private String fundtype = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 资金流水号,
	 */
	private String orderid = "";
	
	/**
	 * 申请时间,
	 */
	private String requesttime = "";
	
	/**
	 * 初始化参数
	 */
	public B046Input() {
		this.setFunction("B046");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请日期,
	 */
	public String getAcceptdate() {
		return this.acceptdate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setAcceptdate(String value)
	 {
		this.acceptdate = value;
	}
	
	/**
	 * 金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
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
	 * 姓名,
	 */
	public String getCustomname() {
		return this.customname;
	}
	
	/**
	 * 姓名,
	 */
	public void setCustomname(String value)
	 {
		this.customname = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
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
	 * 资金流水号,
	 */
	public String getOrderid() {
		return this.orderid;
	}
	
	/**
	 * 资金流水号,
	 */
	public void setOrderid(String value)
	 {
		this.orderid = value;
	}
	
	/**
	 * 申请时间,
	 */
	public String getRequesttime() {
		return this.requesttime;
	}
	
	/**
	 * 申请时间,
	 */
	public void setRequesttime(String value)
	 {
		this.requesttime = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("acceptdate", this.acceptdate);
		inputMap.put("amount", this.amount);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("customname", this.customname);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("fundtype", this.fundtype);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("orderid", this.orderid);
		inputMap.put("requesttime", this.requesttime);
	}
}
