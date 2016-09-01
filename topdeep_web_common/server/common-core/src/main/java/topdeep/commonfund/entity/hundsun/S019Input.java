package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 未处理汇款余额查询(S019)
 */
public class S019Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco = "";
	
	/**
	 * 查询类型,
	 */
	private String querytype;
	
	/**
	 * 初始化参数
	 */
	public S019Input() {
		this.setFunction("S019");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	
	/**
	 * 查询类型,
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("querytype", this.querytype.toString());
	}
}
