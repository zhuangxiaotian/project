package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 在途资产查询(S095)
 */
public class S095Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户类型,
	 */
	private String custtype = "p:个人,o:机构（默认为p）";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 证件号,
	 */
	private String identityno = "传入sessionkey，则可以不传。不传sessionkey，必须传入";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "传入sessionkey，则可以不传。不传sessionkey，必须传入";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S095Input() {
		this.setFunction("S095");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户类型,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 证件号,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号,
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
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custtype", this.custtype);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
