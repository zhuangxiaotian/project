package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 充值码兑换记录查询(V024)
 */
public class V024Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 充值码,
	 */
	private String chargecode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public V024Input() {
		this.setFunction("V024");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 充值码,
	 */
	public String getChargecode() {
		return this.chargecode;
	}
	
	/**
	 * 充值码,
	 */
	public void setChargecode(String value)
	 {
		this.chargecode = value;
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
		inputMap.put("chargecode", this.chargecode);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
