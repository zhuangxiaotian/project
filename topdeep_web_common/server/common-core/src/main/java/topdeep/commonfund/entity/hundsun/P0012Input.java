package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 验证令牌(P012)
 */
public class P0012Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 机器id,
	 */
	private String machineid = "";
	
	/**
	 * 令牌,
	 */
	private String token = "";
	
	/**
	 * 时间戳,
	 */
	private String timestamp = "";
	
	/**
	 * 初始化参数
	 */
	public P0012Input() {
		this.setFunction("P0012");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 机器id,
	 */
	public String getMachineid() {
		return this.machineid;
	}
	
	/**
	 * 机器id,
	 */
	public void setMachineid(String value)
	 {
		this.machineid = value;
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
	 * 时间戳,
	 */
	public String getTimestamp() {
		return this.timestamp;
	}
	
	/**
	 * 时间戳,
	 */
	public void setTimestamp(String value)
	 {
		this.timestamp = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("machineid", this.machineid);
		inputMap.put("token", this.token);
		inputMap.put("timestamp", this.timestamp);
	}
}
