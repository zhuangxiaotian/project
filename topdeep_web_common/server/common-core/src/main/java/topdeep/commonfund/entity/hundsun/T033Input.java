package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 免sessionkey基金买入(T033)
 */
public class T033Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请额度,
	 */
	private String applysum = "";
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 收费方式,S010返回的sharetype
	 */
	private String sharetype = "";
	
	/**
	 * 理财平台流水号,
	 */
	private String chinapayserialno = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public T033Input() {
		this.setFunction("T033");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请额度,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请额度,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
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
	 * 收费方式,S010返回的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,S010返回的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 理财平台流水号,
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 理财平台流水号,
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
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
		inputMap.put("applysum", this.applysum);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
