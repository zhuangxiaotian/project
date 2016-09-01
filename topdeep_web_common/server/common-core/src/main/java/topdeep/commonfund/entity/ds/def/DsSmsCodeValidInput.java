package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 验证验证码功能输入参数
 */
public class DsSmsCodeValidInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 短信验证码,
	 */
	private String smsCode;
	
	/**
	 * 手机号,
	 */
	private String mobile;
	
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
	private String capitalMode;
	
	/**
	 * 发送短信的序列号,
	 */
	private String bankSeriseId;
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 姓名,
	 */
	private String custName;
	
	public DsSmsCodeValidInput() {
		this.setZ_funcCode("u05");
	}
	
	/**
	 * 短信验证码,
	 */
	public String getSmsCode() {
		return this.smsCode;
	}
	
	/**
	 * 短信验证码,
	 */
	public void setSmsCode(String value)
	 {
		this.smsCode = value;
	}
	
	/**
	 * 手机号,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机号,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
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
	public String getCapitalMode() {
		return this.capitalMode;
	}
	
	/**
	 * 渠道，资金方式,
	 */
	public void setCapitalMode(String value)
	 {
		this.capitalMode = value;
	}
	
	/**
	 * 发送短信的序列号,
	 */
	public String getBankSeriseId() {
		return this.bankSeriseId;
	}
	
	/**
	 * 发送短信的序列号,
	 */
	public void setBankSeriseId(String value)
	 {
		this.bankSeriseId = value;
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
	 * 姓名,
	 */
	public String getCustName() {
		return this.custName;
	}
	
	/**
	 * 姓名,
	 */
	public void setCustName(String value)
	 {
		this.custName = value;
	}
}
