package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 赎回渠道查询(T040)
 */
public class T040Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请金额,
	 */
	private String amount = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 证件号,sessionkey不填时，必填
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,sessionkey不填时，必填
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public T040Input() {
		this.setFunction("T040");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 申请金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
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
	 * 证件号,sessionkey不填时，必填
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号,sessionkey不填时，必填
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,sessionkey不填时，必填
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,sessionkey不填时，必填
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("amount", this.amount);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
