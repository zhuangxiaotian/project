package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 颁发令牌(K001)
 */
public class K001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 号码,
	 */
	private String id;
	
	/**
	 * 号码类型,
	 */
	private String idType;
	
	/**
	 * 访客IP,
	 */
	private String ipAddr;
	
	/**
	 * 访问目标URL,
	 */
	private String url;
	
	/**
	 * 初始化参数
	 */
	public K001Input() {
		this.setFunction("K001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 号码,
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * 号码,
	 */
	public void setId(String value)
	 {
		this.id = value;
	}
	
	/**
	 * 号码类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 号码类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
	
	/**
	 * 访客IP,
	 */
	public String getIpAddr() {
		return this.ipAddr;
	}
	
	/**
	 * 访客IP,
	 */
	public void setIpAddr(String value)
	 {
		this.ipAddr = value;
	}
	
	/**
	 * 访问目标URL,
	 */
	public String getUrl() {
		return this.url;
	}
	
	/**
	 * 访问目标URL,
	 */
	public void setUrl(String value)
	 {
		this.url = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("id", this.id.toString());
		inputMap.put("idType", this.idType.toString());
		inputMap.put("ipAddr", this.ipAddr.toString());
		inputMap.put("url", this.url.toString());
	}
}
