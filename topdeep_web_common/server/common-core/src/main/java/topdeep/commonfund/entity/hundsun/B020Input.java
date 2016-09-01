package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道快速取现(B020)
 */
public class B020Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易账号,
	 */
	private String tradeAccount = "";
	
	/**
	 * 交易金额,
	 */
	private String transAmt = "单位为元";
	
	/**
	 * 初始化参数
	 */
	public B020Input() {
		this.setFunction("B020");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeAccount() {
		return this.tradeAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeAccount(String value)
	 {
		this.tradeAccount = value;
	}
	
	/**
	 * 交易金额,
	 */
	public String getTransAmt() {
		return this.transAmt;
	}
	
	/**
	 * 交易金额,
	 */
	public void setTransAmt(String value)
	 {
		this.transAmt = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("tradeAccount", this.tradeAccount);
		inputMap.put("transAmt", this.transAmt);
	}
}
