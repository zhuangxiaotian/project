package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 销毁令牌(P013)
 */
public class P0013Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 令牌,
	 */
	private String token = "";
	
	/**
	 * 初始化参数
	 */
	public P0013Input() {
		this.setFunction("P0013");
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("token", this.token);
	}
}
