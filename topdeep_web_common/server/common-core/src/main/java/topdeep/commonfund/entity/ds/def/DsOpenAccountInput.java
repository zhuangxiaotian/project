package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 开户功能输入参数
 */
public class DsOpenAccountInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 资金方式,
	 */
	private String payseatNo;
	
	/**
	 * 客户名称,
	 */
	private String custName;
	
	/**
	 * 手机号码,
	 */
	private String mobile;
	
	/**
	 * 交易密码,
	 */
	private String password;
	
	/**
	 * 证件有效期,
	 */
	private String idValidate;
	
	/**
	 * 职业代码,
	 */
	private String vocationCode;
	
	/**
	 * 邮箱,
	 */
	private String email;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	public DsOpenAccountInput() {
		this.setZ_funcCode("u02");
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
	 * 资金方式,
	 */
	public String getPayseatNo() {
		return this.payseatNo;
	}
	
	/**
	 * 资金方式,
	 */
	public void setPayseatNo(String value)
	 {
		this.payseatNo = value;
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustName() {
		return this.custName;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustName(String value)
	 {
		this.custName = value;
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
	 * 交易密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 交易密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 证件有效期,
	 */
	public String getIdValidate() {
		return this.idValidate;
	}
	
	/**
	 * 证件有效期,
	 */
	public void setIdValidate(String value)
	 {
		this.idValidate = value;
	}
	
	/**
	 * 职业代码,
	 */
	public String getVocationCode() {
		return this.vocationCode;
	}
	
	/**
	 * 职业代码,
	 */
	public void setVocationCode(String value)
	 {
		this.vocationCode = value;
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
}
