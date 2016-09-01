package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 登录系统(P003)
 */
public class P003Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,logtype为3时客户编号;为2时:证件号码;为1时:基金账号;N\R类推；logintype为4时代表手机号码
	 */
	private String lognumber = "";
	
	/**
	 * 登陆类型,0:交易账号;1:基金账号;2:证件号码;3:客户编号(暂只支持ET模式);N：基金昵称;R:注册用户,S：子账户登陆模式;4:手机号登陆（配合loginnumber代表手机号码）
	 */
	private String logtype = "";
	
	/**
	 * 证件类型,读取字典项返回
	 */
	private String certificatetype = "";
	
	/**
	 * 密码,1.明文密码（默认支持方式）2.支持密文密码登陆（系统参数“API_LOGIN_ENCRYPTPWD”为1)3.fundapi支持无密码登陆时（系统参数“API_LOGIN_NOPWD”为1），可以为空。不支持时，为必填。
	 */
	private String password = "";
	
	/**
	 * 用户级系统模式,可以在登录时指定该用户的系统模式，例：系统模式是ETQ，直销交易用户，可以通过该参数指定进行查询登录
	 */
	private String systype = "";
	
	/**
	 * 交易来源,养老宝等项目需要传入此字段，防止非此类客户登陆
	 */
	private String comefrom = "";
	
	/**
	 * 初始化参数
	 */
	public P003Input() {
		this.setFunction("P003");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 证件号码,logtype为3时客户编号;为2时:证件号码;为1时:基金账号;N\R类推；logintype为4时代表手机号码
	 */
	public String getLognumber() {
		return this.lognumber;
	}
	
	/**
	 * 证件号码,logtype为3时客户编号;为2时:证件号码;为1时:基金账号;N\R类推；logintype为4时代表手机号码
	 */
	public void setLognumber(String value)
	 {
		this.lognumber = value;
	}
	
	/**
	 * 登陆类型,0:交易账号;1:基金账号;2:证件号码;3:客户编号(暂只支持ET模式);N：基金昵称;R:注册用户,S：子账户登陆模式;4:手机号登陆（配合loginnumber代表手机号码）
	 */
	public String getLogtype() {
		return this.logtype;
	}
	
	/**
	 * 登陆类型,0:交易账号;1:基金账号;2:证件号码;3:客户编号(暂只支持ET模式);N：基金昵称;R:注册用户,S：子账户登陆模式;4:手机号登陆（配合loginnumber代表手机号码）
	 */
	public void setLogtype(String value)
	 {
		this.logtype = value;
	}
	
	/**
	 * 证件类型,读取字典项返回
	 */
	public String getCertificatetype() {
		return this.certificatetype;
	}
	
	/**
	 * 证件类型,读取字典项返回
	 */
	public void setCertificatetype(String value)
	 {
		this.certificatetype = value;
	}
	
	/**
	 * 密码,1.明文密码（默认支持方式）2.支持密文密码登陆（系统参数“API_LOGIN_ENCRYPTPWD”为1)3.fundapi支持无密码登陆时（系统参数“API_LOGIN_NOPWD”为1），可以为空。不支持时，为必填。
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码,1.明文密码（默认支持方式）2.支持密文密码登陆（系统参数“API_LOGIN_ENCRYPTPWD”为1)3.fundapi支持无密码登陆时（系统参数“API_LOGIN_NOPWD”为1），可以为空。不支持时，为必填。
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 用户级系统模式,可以在登录时指定该用户的系统模式，例：系统模式是ETQ，直销交易用户，可以通过该参数指定进行查询登录
	 */
	public String getSystype() {
		return this.systype;
	}
	
	/**
	 * 用户级系统模式,可以在登录时指定该用户的系统模式，例：系统模式是ETQ，直销交易用户，可以通过该参数指定进行查询登录
	 */
	public void setSystype(String value)
	 {
		this.systype = value;
	}
	
	/**
	 * 交易来源,养老宝等项目需要传入此字段，防止非此类客户登陆
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,养老宝等项目需要传入此字段，防止非此类客户登陆
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("lognumber", this.lognumber);
		inputMap.put("logtype", this.logtype);
		inputMap.put("certificatetype", this.certificatetype);
		inputMap.put("password", this.password);
		inputMap.put("systype", this.systype);
		inputMap.put("comefrom", this.comefrom);
	}
}
