package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 个人客户信息修改功能输入参数
 */
public class ISCustomerInfoModifyInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 联系地址,
	 */
	private String address;
	
	/**
	 * 家庭电话,
	 */
	private String telphone;
	
	/**
	 * 联系人(代办人),
	 */
	private String linkMan;
	
	/**
	 * 联系人电话,
	 */
	private String linkManTelephone;
	
	/**
	 * 联系人证件类型,
	 */
	private String linkManIdType;
	
	/**
	 * 联系人证件号码,
	 */
	private String linkManIdNo;
	
	/**
	 * 传真号码,
	 */
	private String fax;
	
	/**
	 * 邮编,
	 */
	private String postcode;
	
	/**
	 * Email,
	 */
	private String email;
	
	/**
	 * 手机号码,
	 */
	private String mobileTelephone;
	
	/**
	 * 分红方式,
	 */
	private String bonusMode;
	
	/**
	 * 对账单接收标志,
	 */
	private String recvFlag;
	
	/**
	 * 工作（职业）,
	 */
	private String vocationCode;
	
	/**
	 * 年薪（年收入）,
	 */
	private String annualIncome;
	
	/**
	 * 性别,
	 */
	private String sex;
	
	/**
	 * 学历,
	 */
	private String educationCode;
	
	/**
	 * 银行账号,
	 */
	private String bankAccount;
	
	/**
	 * 银行编号,
	 */
	private String bankCode;
	
	/**
	 * 单位性质,
	 */
	private String companyNature;
	
	/**
	 * 单位名称2,
	 */
	private String companyName2;
	
	/**
	 * 开户银行网点名称,
	 */
	private String openBankName;
	
	/**
	 * 银行开户资金账户名称,
	 */
	private String bankName;
	
	/**
	 * 证件有效期,
	 */
	private String validityDate;
	
	/**
	 * 出生日期,
	 */
	private String birthday;
	
	/**
	 * 婚姻状况,
	 */
	private String marrytype;
	
	/**
	 * 家庭年收入,
	 */
	private String familyincome;
	
	/**
	 * 子女状况,
	 */
	private String familygenaration;
	
	/**
	 * 经纪人,
	 */
	private String broker;
	
	/**
	 * 工作单位名称,
	 */
	private String companyName;
	
	/**
	 * 客户预留信息,
	 */
	private String customerPreInfo;
	
	/**
	 * 工作单位电话,
	 */
	private String companyTelephone;
	
	/**
	 * 交易密码,
	 */
	private String password;
	
	public ISCustomerInfoModifyInput() {
		this.setZ_funcCode("u0m");
	}
	
	/**
	 * 联系地址,
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * 联系地址,
	 */
	public void setAddress(String value)
	 {
		this.address = value;
	}
	
	/**
	 * 家庭电话,
	 */
	public String getTelphone() {
		return this.telphone;
	}
	
	/**
	 * 家庭电话,
	 */
	public void setTelphone(String value)
	 {
		this.telphone = value;
	}
	
	/**
	 * 联系人(代办人),
	 */
	public String getLinkMan() {
		return this.linkMan;
	}
	
	/**
	 * 联系人(代办人),
	 */
	public void setLinkMan(String value)
	 {
		this.linkMan = value;
	}
	
	/**
	 * 联系人电话,
	 */
	public String getLinkManTelephone() {
		return this.linkManTelephone;
	}
	
	/**
	 * 联系人电话,
	 */
	public void setLinkManTelephone(String value)
	 {
		this.linkManTelephone = value;
	}
	
	/**
	 * 联系人证件类型,
	 */
	public String getLinkManIdType() {
		return this.linkManIdType;
	}
	
	/**
	 * 联系人证件类型,
	 */
	public void setLinkManIdType(String value)
	 {
		this.linkManIdType = value;
	}
	
	/**
	 * 联系人证件号码,
	 */
	public String getLinkManIdNo() {
		return this.linkManIdNo;
	}
	
	/**
	 * 联系人证件号码,
	 */
	public void setLinkManIdNo(String value)
	 {
		this.linkManIdNo = value;
	}
	
	/**
	 * 传真号码,
	 */
	public String getFax() {
		return this.fax;
	}
	
	/**
	 * 传真号码,
	 */
	public void setFax(String value)
	 {
		this.fax = value;
	}
	
	/**
	 * 邮编,
	 */
	public String getPostcode() {
		return this.postcode;
	}
	
	/**
	 * 邮编,
	 */
	public void setPostcode(String value)
	 {
		this.postcode = value;
	}
	
	/**
	 * Email,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Email,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 手机号码,
	 */
	public String getMobileTelephone() {
		return this.mobileTelephone;
	}
	
	/**
	 * 手机号码,
	 */
	public void setMobileTelephone(String value)
	 {
		this.mobileTelephone = value;
	}
	
	/**
	 * 分红方式,
	 */
	public String getBonusMode() {
		return this.bonusMode;
	}
	
	/**
	 * 分红方式,
	 */
	public void setBonusMode(String value)
	 {
		this.bonusMode = value;
	}
	
	/**
	 * 对账单接收标志,
	 */
	public String getRecvFlag() {
		return this.recvFlag;
	}
	
	/**
	 * 对账单接收标志,
	 */
	public void setRecvFlag(String value)
	 {
		this.recvFlag = value;
	}
	
	/**
	 * 工作（职业）,
	 */
	public String getVocationCode() {
		return this.vocationCode;
	}
	
	/**
	 * 工作（职业）,
	 */
	public void setVocationCode(String value)
	 {
		this.vocationCode = value;
	}
	
	/**
	 * 年薪（年收入）,
	 */
	public String getAnnualIncome() {
		return this.annualIncome;
	}
	
	/**
	 * 年薪（年收入）,
	 */
	public void setAnnualIncome(String value)
	 {
		this.annualIncome = value;
	}
	
	/**
	 * 性别,
	 */
	public String getSex() {
		return this.sex;
	}
	
	/**
	 * 性别,
	 */
	public void setSex(String value)
	 {
		this.sex = value;
	}
	
	/**
	 * 学历,
	 */
	public String getEducationCode() {
		return this.educationCode;
	}
	
	/**
	 * 学历,
	 */
	public void setEducationCode(String value)
	 {
		this.educationCode = value;
	}
	
	/**
	 * 银行账号,
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}
	
	/**
	 * 银行账号,
	 */
	public void setBankAccount(String value)
	 {
		this.bankAccount = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankCode() {
		return this.bankCode;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankCode(String value)
	 {
		this.bankCode = value;
	}
	
	/**
	 * 单位性质,
	 */
	public String getCompanyNature() {
		return this.companyNature;
	}
	
	/**
	 * 单位性质,
	 */
	public void setCompanyNature(String value)
	 {
		this.companyNature = value;
	}
	
	/**
	 * 单位名称2,
	 */
	public String getCompanyName2() {
		return this.companyName2;
	}
	
	/**
	 * 单位名称2,
	 */
	public void setCompanyName2(String value)
	 {
		this.companyName2 = value;
	}
	
	/**
	 * 开户银行网点名称,
	 */
	public String getOpenBankName() {
		return this.openBankName;
	}
	
	/**
	 * 开户银行网点名称,
	 */
	public void setOpenBankName(String value)
	 {
		this.openBankName = value;
	}
	
	/**
	 * 银行开户资金账户名称,
	 */
	public String getBankName() {
		return this.bankName;
	}
	
	/**
	 * 银行开户资金账户名称,
	 */
	public void setBankName(String value)
	 {
		this.bankName = value;
	}
	
	/**
	 * 证件有效期,
	 */
	public String getValidityDate() {
		return this.validityDate;
	}
	
	/**
	 * 证件有效期,
	 */
	public void setValidityDate(String value)
	 {
		this.validityDate = value;
	}
	
	/**
	 * 出生日期,
	 */
	public String getBirthday() {
		return this.birthday;
	}
	
	/**
	 * 出生日期,
	 */
	public void setBirthday(String value)
	 {
		this.birthday = value;
	}
	
	/**
	 * 婚姻状况,
	 */
	public String getMarrytype() {
		return this.marrytype;
	}
	
	/**
	 * 婚姻状况,
	 */
	public void setMarrytype(String value)
	 {
		this.marrytype = value;
	}
	
	/**
	 * 家庭年收入,
	 */
	public String getFamilyincome() {
		return this.familyincome;
	}
	
	/**
	 * 家庭年收入,
	 */
	public void setFamilyincome(String value)
	 {
		this.familyincome = value;
	}
	
	/**
	 * 子女状况,
	 */
	public String getFamilygenaration() {
		return this.familygenaration;
	}
	
	/**
	 * 子女状况,
	 */
	public void setFamilygenaration(String value)
	 {
		this.familygenaration = value;
	}
	
	/**
	 * 经纪人,
	 */
	public String getBroker() {
		return this.broker;
	}
	
	/**
	 * 经纪人,
	 */
	public void setBroker(String value)
	 {
		this.broker = value;
	}
	
	/**
	 * 工作单位名称,
	 */
	public String getCompanyName() {
		return this.companyName;
	}
	
	/**
	 * 工作单位名称,
	 */
	public void setCompanyName(String value)
	 {
		this.companyName = value;
	}
	
	/**
	 * 客户预留信息,
	 */
	public String getCustomerPreInfo() {
		return this.customerPreInfo;
	}
	
	/**
	 * 客户预留信息,
	 */
	public void setCustomerPreInfo(String value)
	 {
		this.customerPreInfo = value;
	}
	
	/**
	 * 工作单位电话,
	 */
	public String getCompanyTelephone() {
		return this.companyTelephone;
	}
	
	/**
	 * 工作单位电话,
	 */
	public void setCompanyTelephone(String value)
	 {
		this.companyTelephone = value;
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
}
