package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 销基金账号(C027)
 */
public class C027Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金账号,默认自建TA的基金账号
	 */
	private String fundacco = "";
	
	/**
	 * 交易密码,如果为空则自动取登录密码（无密码登录必填）
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public C027Input() {
		this.setFunction("C027");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金账号,默认自建TA的基金账号
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,默认自建TA的基金账号
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 交易密码,如果为空则自动取登录密码（无密码登录必填）
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,如果为空则自动取登录密码（无密码登录必填）
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
