package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户信息查询(S086)
 */
public class S086Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 手机号,
	 */
	private String mobileno = "";
	
	/**
	 * 初始化参数
	 */
	public S086Input() {
		this.setFunction("S086");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 手机号,
	 */
	public String getMobileno() {
		return this.mobileno;
	}
	
	/**
	 * 手机号,
	 */
	public void setMobileno(String value)
	 {
		this.mobileno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("mobileno", this.mobileno);
	}
}
