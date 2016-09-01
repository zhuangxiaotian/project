package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 第三方账号绑定状态查询(V015)
 */
public class V015Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户类型,0:机构、1:个人呢
	 */
	private String custtype = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 绑定渠道,weibo：新浪微博、qq：QQ
	 */
	private String oauthChannel = "";
	
	/**
	 * 绑定第三方账号,
	 */
	private String userid = "";
	
	/**
	 * 初始化参数
	 */
	public V015Input() {
		this.setFunction("V015");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户类型,0:机构、1:个人呢
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,0:机构、1:个人呢
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
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
	 * 绑定渠道,weibo：新浪微博、qq：QQ
	 */
	public String getOauthChannel() {
		return this.oauthChannel;
	}
	
	/**
	 * 绑定渠道,weibo：新浪微博、qq：QQ
	 */
	public void setOauthChannel(String value)
	 {
		this.oauthChannel = value;
	}
	
	/**
	 * 绑定第三方账号,
	 */
	public String getUserid() {
		return this.userid;
	}
	
	/**
	 * 绑定第三方账号,
	 */
	public void setUserid(String value)
	 {
		this.userid = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custtype", this.custtype);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("oauthChannel", this.oauthChannel);
		inputMap.put("userid", this.userid);
	}
}
