package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 验证码验证功能输入参数
 */
public class ISValidInfoValidInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 验证码,
	 */
	private String smsCode;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 渠道，资金方式,
	 */
	private String payseatNo;
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 手机号码,
	 */
	private String mobile;
	
	/**
	 * 用户姓名,
	 */
	private String userName;
	
	public ISValidInfoValidInput() {
		this.setZ_funcCode("n0w");
	}
	
	/**
	 * 验证码,
	 */
	public String getSmsCode() {
		return this.smsCode;
	}
	
	/**
	 * 验证码,
	 */
	public void setSmsCode(String value)
	 {
		this.smsCode = value;
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
	 * 银行编号,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
	}
	
	/**
	 * 渠道，资金方式,
	 */
	public String getPayseatNo() {
		return this.payseatNo;
	}
	
	/**
	 * 渠道，资金方式,
	 */
	public void setPayseatNo(String value)
	 {
		this.payseatNo = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankAccount(String value)
	 {
		this.bankAccount = value;
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
	 * 用户姓名,
	 */
	public String getUserName() {
		return this.userName;
	}
	
	/**
	 * 用户姓名,
	 */
	public void setUserName(String value)
	 {
		this.userName = value;
	}
}
