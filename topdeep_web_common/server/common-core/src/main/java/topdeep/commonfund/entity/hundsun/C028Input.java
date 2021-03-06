package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 销交易账号(C028)
 */
public class C028Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,如果为空则自动取登录密码（无密码登录必填）
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public C028Input() {
		this.setFunction("C028");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
