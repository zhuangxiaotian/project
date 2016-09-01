package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 微信绑定(C041)
 */
public class C041Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 绑定ID,
	 */
	private String systemid = "";
	
	/**
	 * 绑定系统类型：weixin/ios/adndroid/winphone,weixin/ios/adndroid/winphone
	 */
	private String systemtype = "";
	
	/**
	 * 客户名称,
	 */
	private String custname = "";
	
	/**
	 * 数据中心客户编号,
	 */
	private String dccustno = "";
	
	/**
	 * 直销客户编号,
	 */
	private String dscustno = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public C041Input() {
		this.setFunction("C041");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 绑定ID,
	 */
	public String getSystemid() {
		return this.systemid;
	}
	
	/**
	 * 绑定ID,
	 */
	public void setSystemid(String value)
	 {
		this.systemid = value;
	}
	
	/**
	 * 绑定系统类型：weixin/ios/adndroid/winphone,weixin/ios/adndroid/winphone
	 */
	public String getSystemtype() {
		return this.systemtype;
	}
	
	/**
	 * 绑定系统类型：weixin/ios/adndroid/winphone,weixin/ios/adndroid/winphone
	 */
	public void setSystemtype(String value)
	 {
		this.systemtype = value;
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
	 * 数据中心客户编号,
	 */
	public String getDccustno() {
		return this.dccustno;
	}
	
	/**
	 * 数据中心客户编号,
	 */
	public void setDccustno(String value)
	 {
		this.dccustno = value;
	}
	
	/**
	 * 直销客户编号,
	 */
	public String getDscustno() {
		return this.dscustno;
	}
	
	/**
	 * 直销客户编号,
	 */
	public void setDscustno(String value)
	 {
		this.dscustno = value;
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
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("systemid", this.systemid);
		inputMap.put("systemtype", this.systemtype);
		inputMap.put("custname", this.custname);
		inputMap.put("dccustno", this.dccustno);
		inputMap.put("dscustno", this.dscustno);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
