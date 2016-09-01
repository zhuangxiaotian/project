package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 验证令牌(K002)
 */
public class K002Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 令牌,
	 */
	private String token;
	
	/**
	 * 填写固定值2,
	 */
	private String type;
	
	/**
	 * 初始化参数
	 */
	public K002Input() {
		this.setFunction("K002");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 令牌,
	 */
	public String getToken() {
		return this.token;
	}
	
	/**
	 * 令牌,
	 */
	public void setToken(String value)
	 {
		this.token = value;
	}
	
	/**
	 * 填写固定值2,
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 填写固定值2,
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("token", this.token.toString());
		inputMap.put("type", this.type.toString());
	}
}
