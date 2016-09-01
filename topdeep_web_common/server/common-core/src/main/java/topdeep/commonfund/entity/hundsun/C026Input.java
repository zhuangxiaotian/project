package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开通/取消委托方式(C026)
 */
public class C026Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 开通/取消,1:开通;0:取消
	 */
	private String netconsign = "";
	
	/**
	 * 委托方式,1:电话;7:手机
	 */
	private String trust = "";
	
	/**
	 * 证件号码,不登录调用时必传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,不登录调用时必传
	 */
	private String identitytype = "";
	
	/**
	 * 交易密码,不登录调用时必传
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,不登录调用时必传
	 */
	private String tradesource = "";
	
	/**
	 * 电话交易密码,开通电话交易时必填
	 */
	private String newpassword = "";
	
	/**
	 * 预留电话1,开通电话交易时必填
	 */
	private String tradephone1 = "";
	
	/**
	 * 预留电话2,开通电话交易时必填
	 */
	private String tradephone2 = "";
	
	/**
	 * 初始化参数
	 */
	public C026Input() {
		this.setFunction("C026");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 开通/取消,1:开通;0:取消
	 */
	public String getNetconsign() {
		return this.netconsign;
	}
	
	/**
	 * 开通/取消,1:开通;0:取消
	 */
	public void setNetconsign(String value)
	 {
		this.netconsign = value;
	}
	
	/**
	 * 委托方式,1:电话;7:手机
	 */
	public String getTrust() {
		return this.trust;
	}
	
	/**
	 * 委托方式,1:电话;7:手机
	 */
	public void setTrust(String value)
	 {
		this.trust = value;
	}
	
	/**
	 * 证件号码,不登录调用时必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,不登录调用时必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,不登录调用时必传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,不登录调用时必传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 交易密码,不登录调用时必传
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,不登录调用时必传
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 交易来源,不登录调用时必传
	 */
	public String getTradesource() {
		return this.tradesource;
	}
	
	/**
	 * 交易来源,不登录调用时必传
	 */
	public void setTradesource(String value)
	 {
		this.tradesource = value;
	}
	
	/**
	 * 电话交易密码,开通电话交易时必填
	 */
	public String getNewpassword() {
		return this.newpassword;
	}
	
	/**
	 * 电话交易密码,开通电话交易时必填
	 */
	public void setNewpassword(String value)
	 {
		this.newpassword = value;
	}
	
	/**
	 * 预留电话1,开通电话交易时必填
	 */
	public String getTradephone1() {
		return this.tradephone1;
	}
	
	/**
	 * 预留电话1,开通电话交易时必填
	 */
	public void setTradephone1(String value)
	 {
		this.tradephone1 = value;
	}
	
	/**
	 * 预留电话2,开通电话交易时必填
	 */
	public String getTradephone2() {
		return this.tradephone2;
	}
	
	/**
	 * 预留电话2,开通电话交易时必填
	 */
	public void setTradephone2(String value)
	 {
		this.tradephone2 = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("netconsign", this.netconsign);
		inputMap.put("trust", this.trust);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("newpassword", this.newpassword);
		inputMap.put("tradephone1", this.tradephone1);
		inputMap.put("tradephone2", this.tradephone2);
	}
}
