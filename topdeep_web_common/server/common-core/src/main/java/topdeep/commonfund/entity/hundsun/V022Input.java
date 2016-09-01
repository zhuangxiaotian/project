package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 充值码信息查询(V022)
 */
public class V022Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 充值码,
	 */
	private String chargecode = "";
	
	/**
	 * 状态,1-正常，0-失效，空-不限制
	 */
	private String state = "";
	
	/**
	 * 初始化参数
	 */
	public V022Input() {
		this.setFunction("V022");
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
	 * 状态,1-正常，0-失效，空-不限制
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 状态,1-正常，0-失效，空-不限制
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("chargecode", this.chargecode);
		inputMap.put("state", this.state);
	}
}
