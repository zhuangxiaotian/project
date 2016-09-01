package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 发送手机验证码(V012)
 */
public class V012Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 发送内容,way为1时必传
	 */
	private String content = "";
	
	/**
	 * 客户编号,除了sendintent为openacco以外，其他必传
	 */
	private String custno = "";
	
	/**
	 * 证件号码,sendintent为openacco必传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,sendintent为openacco必传
	 */
	private String identitytype = "";
	
	/**
	 * 发送目的,way为0时必传，登陆：login，modifyacco：更换资料，openacco：开户，open:绑定，reset：重置密码，toOld：发送老手机，toNew：发送新手机
	 */
	private String sendintent = "";
	
	/**
	 * 发送方式,0-直销模式，1-主动服务模式，默认为1
	 */
	private String way = "";
	
	/**
	 * 是否需要返回验证码,0：不返回，1：返回。默认0
	 */
	private String isauthcodereturn = "";
	
	/**
	 * 子账户,
	 */
	private String subaccono = "";
	
	/**
	 * 邮箱,
	 */
	private String email = "";
	
	/**
	 * 初始化参数
	 */
	public V012Input() {
		this.setFunction("V012");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 手机号码,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机号码,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	/**
	 * 发送内容,way为1时必传
	 */
	public String getContent() {
		return this.content;
	}
	
	/**
	 * 发送内容,way为1时必传
	 */
	public void setContent(String value)
	 {
		this.content = value;
	}
	
	/**
	 * 客户编号,除了sendintent为openacco以外，其他必传
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,除了sendintent为openacco以外，其他必传
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 证件号码,sendintent为openacco必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,sendintent为openacco必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,sendintent为openacco必传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,sendintent为openacco必传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 发送目的,way为0时必传，登陆：login，modifyacco：更换资料，openacco：开户，open:绑定，reset：重置密码，toOld：发送老手机，toNew：发送新手机
	 */
	public String getSendintent() {
		return this.sendintent;
	}
	
	/**
	 * 发送目的,way为0时必传，登陆：login，modifyacco：更换资料，openacco：开户，open:绑定，reset：重置密码，toOld：发送老手机，toNew：发送新手机
	 */
	public void setSendintent(String value)
	 {
		this.sendintent = value;
	}
	
	/**
	 * 发送方式,0-直销模式，1-主动服务模式，默认为1
	 */
	public String getWay() {
		return this.way;
	}
	
	/**
	 * 发送方式,0-直销模式，1-主动服务模式，默认为1
	 */
	public void setWay(String value)
	 {
		this.way = value;
	}
	
	/**
	 * 是否需要返回验证码,0：不返回，1：返回。默认0
	 */
	public String getIsauthcodereturn() {
		return this.isauthcodereturn;
	}
	
	/**
	 * 是否需要返回验证码,0：不返回，1：返回。默认0
	 */
	public void setIsauthcodereturn(String value)
	 {
		this.isauthcodereturn = value;
	}
	
	/**
	 * 子账户,
	 */
	public String getSubaccono() {
		return this.subaccono;
	}
	
	/**
	 * 子账户,
	 */
	public void setSubaccono(String value)
	 {
		this.subaccono = value;
	}
	
	/**
	 * 邮箱,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("mobile", this.mobile);
		inputMap.put("content", this.content);
		inputMap.put("custno", this.custno);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("sendintent", this.sendintent);
		inputMap.put("way", this.way);
		inputMap.put("isauthcodereturn", this.isauthcodereturn);
		inputMap.put("subaccono", this.subaccono);
		inputMap.put("email", this.email);
	}
}
