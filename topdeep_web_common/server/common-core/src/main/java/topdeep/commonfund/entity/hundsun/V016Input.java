package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改第三方账号绑定状态(V016)
 */
public class V016Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * access_token过期时间,yyyymmddhhmmss
	 */
	private String accessendtime = "";
	
	/**
	 * access_token,
	 */
	private String accesstoken = "";
	
	/**
	 * 绑定时间,yyyymmddhhmmss
	 */
	private String bindtime = "";
	
	/**
	 * 绑定渠道,weibo：新浪微博、qq：QQ
	 */
	private String channel = "";
	
	/**
	 * 客户类型,0:机构、1:个人呢
	 */
	private String custtype = "";
	
	/**
	 * 头像图片,
	 */
	private String headimg = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 昵称,
	 */
	private String nickname = "";
	
	/**
	 * 绑定第三方账号,
	 */
	private String userid = "";
	
	/**
	 * 初始化参数
	 */
	public V016Input() {
		this.setFunction("V016");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * access_token过期时间,yyyymmddhhmmss
	 */
	public String getAccessendtime() {
		return this.accessendtime;
	}
	
	/**
	 * access_token过期时间,yyyymmddhhmmss
	 */
	public void setAccessendtime(String value)
	 {
		this.accessendtime = value;
	}
	
	/**
	 * access_token,
	 */
	public String getAccesstoken() {
		return this.accesstoken;
	}
	
	/**
	 * access_token,
	 */
	public void setAccesstoken(String value)
	 {
		this.accesstoken = value;
	}
	
	/**
	 * 绑定时间,yyyymmddhhmmss
	 */
	public String getBindtime() {
		return this.bindtime;
	}
	
	/**
	 * 绑定时间,yyyymmddhhmmss
	 */
	public void setBindtime(String value)
	 {
		this.bindtime = value;
	}
	
	/**
	 * 绑定渠道,weibo：新浪微博、qq：QQ
	 */
	public String getChannel() {
		return this.channel;
	}
	
	/**
	 * 绑定渠道,weibo：新浪微博、qq：QQ
	 */
	public void setChannel(String value)
	 {
		this.channel = value;
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
	 * 头像图片,
	 */
	public String getHeadimg() {
		return this.headimg;
	}
	
	/**
	 * 头像图片,
	 */
	public void setHeadimg(String value)
	 {
		this.headimg = value;
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
	 * 昵称,
	 */
	public String getNickname() {
		return this.nickname;
	}
	
	/**
	 * 昵称,
	 */
	public void setNickname(String value)
	 {
		this.nickname = value;
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
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("accessendtime", this.accessendtime);
		inputMap.put("accesstoken", this.accesstoken);
		inputMap.put("bindtime", this.bindtime);
		inputMap.put("channel", this.channel);
		inputMap.put("custtype", this.custtype);
		inputMap.put("headimg", this.headimg);
		inputMap.put("identityno", this.identityno);
		inputMap.put("nickname", this.nickname);
		inputMap.put("userid", this.userid);
	}
}
