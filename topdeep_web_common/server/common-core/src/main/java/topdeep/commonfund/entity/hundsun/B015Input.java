package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道当前银行卡变更(B015)
 */
public class B015Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 城市代码,
	 */
	private String citycode = "";
	
	/**
	 * 省份代码,
	 */
	private String provincecode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public B015Input() {
		this.setFunction("B015");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 城市代码,
	 */
	public String getCitycode() {
		return this.citycode;
	}
	
	/**
	 * 城市代码,
	 */
	public void setCitycode(String value)
	 {
		this.citycode = value;
	}
	
	/**
	 * 省份代码,
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 省份代码,
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
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
		inputMap.put("citycode", this.citycode);
		inputMap.put("provincecode", this.provincecode);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
