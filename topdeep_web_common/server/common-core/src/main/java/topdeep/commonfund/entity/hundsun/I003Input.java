package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行解约签名数据生成(I003)
 */
public class I003Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易账号,调用I001返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public I003Input() {
		this.setFunction("I003");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 交易账号,调用I001返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用I001返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
