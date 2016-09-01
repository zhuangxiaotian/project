package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 用户资产查询(S097)
 */
public class S097Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 证件号码,传入sessionkey可不传，不传sessionkey必须传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,传入sessionkey可不传，不传sessionkey必须传
	 */
	private String identitytype = "";
	
	/**
	 * 专户选项,0：不包含专户；1：包含专户；2：只查专户；默认0
	 */
	private String special = "";
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S097Input() {
		this.setFunction("S097");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 证件号码,传入sessionkey可不传，不传sessionkey必须传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,传入sessionkey可不传，不传sessionkey必须传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,传入sessionkey可不传，不传sessionkey必须传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,传入sessionkey可不传，不传sessionkey必须传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 专户选项,0：不包含专户；1：包含专户；2：只查专户；默认0
	 */
	public String getSpecial() {
		return this.special;
	}
	
	/**
	 * 专户选项,0：不包含专户；1：包含专户；2：只查专户；默认0
	 */
	public void setSpecial(String value)
	 {
		this.special = value;
	}
	
	/**
	 * 交易帐号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("special", this.special);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
