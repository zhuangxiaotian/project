package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇款交易退款(T019)
 */
public class T019Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 退款金额,
	 */
	private String payout = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public T019Input() {
		this.setFunction("T019");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 退款金额,
	 */
	public String getPayout() {
		return this.payout;
	}
	
	/**
	 * 退款金额,
	 */
	public void setPayout(String value)
	 {
		this.payout = value;
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
		inputMap.put("payout", this.payout);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
