package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 发送验证码功能输入参数
 */
public class DsSmsCodeSendInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 手机号,
	 */
	private String mobile;
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 客户姓名,
	 */
	private String custName;
	
	/**
	 * 资金方式,
	 */
	private String capitalMode;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	public DsSmsCodeSendInput() {
		this.setZ_funcCode("u04");
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
	 * 客户姓名,
	 */
	public String getCustName() {
		return this.custName;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustName(String value)
	 {
		this.custName = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalMode() {
		return this.capitalMode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalMode(String value)
	 {
		this.capitalMode = value;
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
}
