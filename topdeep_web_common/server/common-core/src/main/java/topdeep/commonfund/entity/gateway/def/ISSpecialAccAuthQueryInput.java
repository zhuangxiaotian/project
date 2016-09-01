package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 获取专户用户授权信息功能输入参数
 */
public class ISSpecialAccAuthQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	private String custno;
	
	/**
	 * 基金帐号,
	 */
	private String fundacco;
	
	/**
	 * 证件号码,
	 */
	private String identityno;
	
	/**
	 * 证件类型,未传sessionkey，则 判断 “客户编号 基金帐号 （交易账号）”或“证件类型+证件号码”， 必填一组
	 */
	private String identitytype;
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco;
	
	/**
	 * 交易密码,未传sessionkey，密码比传
	 */
	private String tradepassword;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 客户编号,
	 */
	private String custNo;
	
	public ISSpecialAccAuthQueryInput() {
		this.setZ_funcCode("u0x");
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
	 * 基金帐号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,
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
	 * 证件类型,未传sessionkey，则 判断 “客户编号 基金帐号 （交易账号）”或“证件类型+证件号码”， 必填一组
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,未传sessionkey，则 判断 “客户编号 基金帐号 （交易账号）”或“证件类型+证件号码”， 必填一组
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 交易帐号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 交易密码,未传sessionkey，密码比传
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,未传sessionkey，密码比传
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustNo() {
		return this.custNo;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustNo(String value)
	 {
		this.custNo = value;
	}
}
