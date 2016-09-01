package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询交易帐号(后台模式)(C034)
 */
public class C034Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 账号号码,logtype为2时:证件号码;为1时:基金账号;其他类推
	 */
	private String lognumber = "";
	
	/**
	 * 账号类型,0:交易账号;1:基金账号;2:证件号码;3:绑定用户
	 */
	private String logtype = "";
	
	/**
	 * 银联CD卡号,
	 */
	private String yinliancdcard = "";
	
	/**
	 * 客户名称,
	 */
	private String custname = "";
	
	/**
	 * 证件类型,读取字典项(网上交易个人证件类型)，当为绑定用户时，weixin/ios/adndroid/winphone
	 */
	private String identitytype = "";
	
	/**
	 * 交易账号状态,不传查询全部状态
	 */
	private String state = "";
	
	/**
	 * 交易密码,如果输入将会用于判断密码是否正确
	 */
	private String tradepassword = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 电子邮箱,
	 */
	private String email = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 用户类型不等于,
	 */
	private String usertypenoteq = "";
	
	/**
	 * 初始化参数
	 */
	public C034Input() {
		this.setFunction("C034");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 账号号码,logtype为2时:证件号码;为1时:基金账号;其他类推
	 */
	public String getLognumber() {
		return this.lognumber;
	}
	
	/**
	 * 账号号码,logtype为2时:证件号码;为1时:基金账号;其他类推
	 */
	public void setLognumber(String value)
	 {
		this.lognumber = value;
	}
	
	/**
	 * 账号类型,0:交易账号;1:基金账号;2:证件号码;3:绑定用户
	 */
	public String getLogtype() {
		return this.logtype;
	}
	
	/**
	 * 账号类型,0:交易账号;1:基金账号;2:证件号码;3:绑定用户
	 */
	public void setLogtype(String value)
	 {
		this.logtype = value;
	}
	
	/**
	 * 银联CD卡号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联CD卡号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 证件类型,读取字典项(网上交易个人证件类型)，当为绑定用户时，weixin/ios/adndroid/winphone
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,读取字典项(网上交易个人证件类型)，当为绑定用户时，weixin/ios/adndroid/winphone
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 交易账号状态,不传查询全部状态
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 交易账号状态,不传查询全部状态
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 交易密码,如果输入将会用于判断密码是否正确
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,如果输入将会用于判断密码是否正确
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
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
	 * 电子邮箱,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 电子邮箱,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 用户类型不等于,
	 */
	public String getUsertypenoteq() {
		return this.usertypenoteq;
	}
	
	/**
	 * 用户类型不等于,
	 */
	public void setUsertypenoteq(String value)
	 {
		this.usertypenoteq = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("lognumber", this.lognumber);
		inputMap.put("logtype", this.logtype);
		inputMap.put("yinliancdcard", this.yinliancdcard);
		inputMap.put("custname", this.custname);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("state", this.state);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("mobile", this.mobile);
		inputMap.put("email", this.email);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("usertypenoteq", this.usertypenoteq);
	}
}
