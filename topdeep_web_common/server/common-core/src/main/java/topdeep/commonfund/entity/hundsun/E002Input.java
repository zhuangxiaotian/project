package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取专户用户授权信息(E002)
 */
public class E002Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	private String custno = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,未传sessionkey，则 判断 “客户编号 基金帐号（交易账号）”或“证件类型+证件号码”，必填一组
	 */
	private String identitytype = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,未传sessionkey且系统参数ALLOW_NO_PWD_TRADE_SOURCE不包含交易来源，密码必须传
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含的交易来源可以不输入密码
	 */
	private String comefrom = "";
	
	/**
	 * 初始化参数
	 */
	public E002Input() {
		this.setFunction("E002");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 证件类型,未传sessionkey，则 判断 “客户编号 基金帐号（交易账号）”或“证件类型+证件号码”，必填一组
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,未传sessionkey，则 判断 “客户编号 基金帐号（交易账号）”或“证件类型+证件号码”，必填一组
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 交易密码,未传sessionkey且系统参数ALLOW_NO_PWD_TRADE_SOURCE不包含交易来源，密码必须传
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,未传sessionkey且系统参数ALLOW_NO_PWD_TRADE_SOURCE不包含交易来源，密码必须传
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 交易来源,系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含的交易来源可以不输入密码
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含的交易来源可以不输入密码
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("comefrom", this.comefrom);
	}
}
