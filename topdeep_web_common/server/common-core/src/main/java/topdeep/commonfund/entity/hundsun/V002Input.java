package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 服务定制(V002)
 */
public class V002Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 是否重新订阅,true:完全抛弃原有的订阅的内容,重新订阅false:在现有订阅的基础上,订阅新的内容
	 */
	private String subscribe = "";
	
	/**
	 * 订阅邮件列表,示例:1007,2102
	 */
	private String mailOrderList = "";
	
	/**
	 * 订阅短信列表,示例:2011,2003
	 */
	private String smsOrderList = "";
	
	/**
	 * 证件号,证件号
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,证件类型
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public V002Input() {
		this.setFunction("V002");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 是否重新订阅,true:完全抛弃原有的订阅的内容,重新订阅false:在现有订阅的基础上,订阅新的内容
	 */
	public String getSubscribe() {
		return this.subscribe;
	}
	
	/**
	 * 是否重新订阅,true:完全抛弃原有的订阅的内容,重新订阅false:在现有订阅的基础上,订阅新的内容
	 */
	public void setSubscribe(String value)
	 {
		this.subscribe = value;
	}
	
	/**
	 * 订阅邮件列表,示例:1007,2102
	 */
	public String getMailOrderList() {
		return this.mailOrderList;
	}
	
	/**
	 * 订阅邮件列表,示例:1007,2102
	 */
	public void setMailOrderList(String value)
	 {
		this.mailOrderList = value;
	}
	
	/**
	 * 订阅短信列表,示例:2011,2003
	 */
	public String getSmsOrderList() {
		return this.smsOrderList;
	}
	
	/**
	 * 订阅短信列表,示例:2011,2003
	 */
	public void setSmsOrderList(String value)
	 {
		this.smsOrderList = value;
	}
	
	/**
	 * 证件号,证件号
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号,证件号
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,证件类型
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,证件类型
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("subscribe", this.subscribe);
		inputMap.put("mailOrderList", this.mailOrderList);
		inputMap.put("smsOrderList", this.smsOrderList);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
