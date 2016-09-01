package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息修改(T044)
 */
public class T044Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 过户类别,0继承，1赠与，2司法执行，3协议转让
	 */
	private String changetype = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 过户入方交易账号,
	 */
	private String othertradeacco = "";
	
	/**
	 * 申请份额,
	 */
	private String requestshare = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 过户出方交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 过户出方基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 过户入方基金账号,
	 */
	private String otheracco = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public T044Input() {
		this.setFunction("T044");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 过户类别,0继承，1赠与，2司法执行，3协议转让
	 */
	public String getChangetype() {
		return this.changetype;
	}
	
	/**
	 * 过户类别,0继承，1赠与，2司法执行，3协议转让
	 */
	public void setChangetype(String value)
	 {
		this.changetype = value;
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
	 * 过户入方交易账号,
	 */
	public String getOthertradeacco() {
		return this.othertradeacco;
	}
	
	/**
	 * 过户入方交易账号,
	 */
	public void setOthertradeacco(String value)
	 {
		this.othertradeacco = value;
	}
	
	/**
	 * 申请份额,
	 */
	public String getRequestshare() {
		return this.requestshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setRequestshare(String value)
	 {
		this.requestshare = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 过户出方交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 过户出方交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 过户出方基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 过户出方基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 过户入方基金账号,
	 */
	public String getOtheracco() {
		return this.otheracco;
	}
	
	/**
	 * 过户入方基金账号,
	 */
	public void setOtheracco(String value)
	 {
		this.otheracco = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("changetype", this.changetype);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("othertradeacco", this.othertradeacco);
		inputMap.put("requestshare", this.requestshare);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("otheracco", this.otheracco);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
