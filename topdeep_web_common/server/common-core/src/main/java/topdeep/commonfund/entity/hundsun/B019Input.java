package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道后台充值(B019)
 */
public class B019Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易金额,
	 */
	private String transAmt = "单位为元";
	
	/**
	 * 初始化参数
	 */
	public B019Input() {
		this.setFunction("B019");
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
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("transAmt", this.transAmt);
	}
}
