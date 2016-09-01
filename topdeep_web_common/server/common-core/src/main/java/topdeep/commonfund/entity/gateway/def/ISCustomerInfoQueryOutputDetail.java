package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 个人客户信息查询功能输出明细参数
 */
public class ISCustomerInfoQueryOutputDetail extends Object implements Serializable {
	
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
	private String customerNo;
	
	/**
	 * 交易账号,
	 */
	private String transactionAccount;
	
	/**
	 * 协议号,
	 */
	private String agreenmentNo;
	
	/**
	 * 渠道代码,
	 */
	private String channelNo;
	
	/**
	 * 投资者名称,
	 */
	private String name;
	
	/**
	 * 投资者简称,
	 */
	private String shortName;
	
	/**
	 * 公司代码,
	 */
	private String companyNo;
	
	/**
	 * 银行开户资金账户名称,
	 */
	private String bankName;
	
	/**
	 * 银行代码,
	 */
	private String bankCode;
	
	/**
	 * 银行账号,
	 */
	private String bankAccount;
	
	/**
	 * 上交所股东账号,
	 */
	private String shStockAccount;
	
	/**
	 * 深交所股东账号,
	 */
	private String szStockAccount;
	
	/**
	 * 法人代表,
	 */
	private String legalRepresentative;
	
	/**
	 * 密码,
	 */
	private String password;
	
	/**
	 * 法人证件类型,
	 */
	private String lrIdType;
	
	/**
	 * 法人证件号码,
	 */
	private String lrIdNo;
	
	/**
	 * 地址,
	 */
	private String address;
	
	/**
	 * 联系电话,
	 */
	private String telphone;
	
	/**
	 * 经办人,
	 */
	private String linkMan;
	
	/**
	 * 经办人电话,
	 */
	private String linkManTelephone;
	
	/**
	 * 经办人证件类型,
	 */
	private String linkManIdType;
	
	/**
	 * 经办人证件号码,
	 */
	private String linkManIdNo;
	
	/**
	 * 传真,
	 */
	private String fax;
	
	/**
	 * 邮政编码,
	 */
	private String postcode;
	
	/**
	 * Email,
	 */
	private String email;
	
	/**
	 * 手机,
	 */
	private String mobileTelephone;
	
	/**
	 * 登记日期,
	 */
	private java.util.Date registerDate;
	
	/**
	 * 最后修改日期,
	 */
	private java.util.Date lastUpdateDate;
	
	/**
	 * 投资者类型,
	 */
	private String investType;
	
	/**
	 * 客户状态,
	 */
	private String customerState;
	
	/**
	 * 红利红投标志,
	 */
	private String bonusMode;
	
	/**
	 * 主管单位名称,
	 */
	private String directorName;
	
	/**
	 * 传真授权标志,
	 */
	private String faxFlag;
	
	/**
	 * 睡眠账户计数器,
	 */
	private Integer sleepCount;
	
	/**
	 * 开户银行网点名称,
	 */
	private String openBankName;
	
	/**
	 * 是否本地网点标志,
	 */
	private String localFlag;
	
	/**
	 * 对账单接收标志,
	 */
	private String recvFlag;
	
	/**
	 * 投顾代码,
	 */
	private String investmentAdvisorNo;
	
	/**
	 * 地区号,
	 */
	private String areaCode;
	
	/**
	 * 15位证件号码,
	 */
	private String idNo18;
	
	/**
	 * 基金账户卡号,
	 */
	private String fundAccountCard;
	
	/**
	 * 网点,
	 */
	private String branchCode;
	
	/**
	 * 交易方式,
	 */
	private String transactionsStyle;
	
	/**
	 * 职业,
	 */
	private String vocationCode;
	
	/**
	 * 年薪,
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
	 * 资金结算方式,
	 */
	private String finaStat;
	
	/**
	 * 收件人,
	 */
	private String receiveName;
	
	/**
	 * 证件有效期,
	 */
	private String validityDate;
	
	/**
	 * 生日,
	 */
	private java.util.Date birthday;
	
	/**
	 * 婚姻状态,
	 */
	private String marrytype;
	
	/**
	 * 投资经验,
	 */
	private String investexperience;
	
	/**
	 * 国籍,
	 */
	private String nationality;
	
	/**
	 * 家庭收入,
	 */
	private String familyincome;
	
	/**
	 * 是否有子女,
	 */
	private String familygenaration;
	
	/**
	 * 英文地址,
	 */
	private String englishaddress;
	
	/**
	 * 英文第一个名字,
	 */
	private String englishfirstname;
	
	/**
	 * 英文最后一个名字,
	 */
	private String englishlastname;
	
	/**
	 * 经纪人,
	 */
	private String broker;
	
	/**
	 * ,
	 */
	private String province;
	
	/**
	 * ,
	 */
	private String salespromotion;
	
	/**
	 * 投资人预留信息,
	 */
	private String obligateinfo;
	
	/**
	 * ,
	 */
	private String officetelno;
	
	/**
	 * 风险级别,
	 */
	private String custRiskLevel;
	
	/**
	 * 风险级别更新日期,
	 */
	private String custRiskDate;
	
	/**
	 * 风险标识,
	 */
	private String custRiskTip;
	
	/**
	 * 问卷是否过期,
	 */
	private String custRiskInvalid;
	
	/**
	 * 网上委托状态,
	 */
	private String netTradeState;
	
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
	public String getCustomerNo() {
		return this.customerNo;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustomerNo(String value)
	 {
		this.customerNo = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTransactionAccount() {
		return this.transactionAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTransactionAccount(String value)
	 {
		this.transactionAccount = value;
	}
	
	/**
	 * 协议号,
	 */
	public String getAgreenmentNo() {
		return this.agreenmentNo;
	}
	
	/**
	 * 协议号,
	 */
	public void setAgreenmentNo(String value)
	 {
		this.agreenmentNo = value;
	}
	
	/**
	 * 渠道代码,
	 */
	public String getChannelNo() {
		return this.channelNo;
	}
	
	/**
	 * 渠道代码,
	 */
	public void setChannelNo(String value)
	 {
		this.channelNo = value;
	}
	
	/**
	 * 投资者名称,
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 投资者名称,
	 */
	public void setName(String value)
	 {
		this.name = value;
	}
	
	/**
	 * 投资者简称,
	 */
	public String getShortName() {
		return this.shortName;
	}
	
	/**
	 * 投资者简称,
	 */
	public void setShortName(String value)
	 {
		this.shortName = value;
	}
	
	/**
	 * 公司代码,
	 */
	public String getCompanyNo() {
		return this.companyNo;
	}
	
	/**
	 * 公司代码,
	 */
	public void setCompanyNo(String value)
	 {
		this.companyNo = value;
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
	 * 银行代码,
	 */
	public String getBankCode() {
		return this.bankCode;
	}
	
	/**
	 * 银行代码,
	 */
	public void setBankCode(String value)
	 {
		this.bankCode = value;
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
	 * 上交所股东账号,
	 */
	public String getShStockAccount() {
		return this.shStockAccount;
	}
	
	/**
	 * 上交所股东账号,
	 */
	public void setShStockAccount(String value)
	 {
		this.shStockAccount = value;
	}
	
	/**
	 * 深交所股东账号,
	 */
	public String getSzStockAccount() {
		return this.szStockAccount;
	}
	
	/**
	 * 深交所股东账号,
	 */
	public void setSzStockAccount(String value)
	 {
		this.szStockAccount = value;
	}
	
	/**
	 * 法人代表,
	 */
	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}
	
	/**
	 * 法人代表,
	 */
	public void setLegalRepresentative(String value)
	 {
		this.legalRepresentative = value;
	}
	
	/**
	 * 密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 法人证件类型,
	 */
	public String getLrIdType() {
		return this.lrIdType;
	}
	
	/**
	 * 法人证件类型,
	 */
	public void setLrIdType(String value)
	 {
		this.lrIdType = value;
	}
	
	/**
	 * 法人证件号码,
	 */
	public String getLrIdNo() {
		return this.lrIdNo;
	}
	
	/**
	 * 法人证件号码,
	 */
	public void setLrIdNo(String value)
	 {
		this.lrIdNo = value;
	}
	
	/**
	 * 地址,
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * 地址,
	 */
	public void setAddress(String value)
	 {
		this.address = value;
	}
	
	/**
	 * 联系电话,
	 */
	public String getTelphone() {
		return this.telphone;
	}
	
	/**
	 * 联系电话,
	 */
	public void setTelphone(String value)
	 {
		this.telphone = value;
	}
	
	/**
	 * 经办人,
	 */
	public String getLinkMan() {
		return this.linkMan;
	}
	
	/**
	 * 经办人,
	 */
	public void setLinkMan(String value)
	 {
		this.linkMan = value;
	}
	
	/**
	 * 经办人电话,
	 */
	public String getLinkManTelephone() {
		return this.linkManTelephone;
	}
	
	/**
	 * 经办人电话,
	 */
	public void setLinkManTelephone(String value)
	 {
		this.linkManTelephone = value;
	}
	
	/**
	 * 经办人证件类型,
	 */
	public String getLinkManIdType() {
		return this.linkManIdType;
	}
	
	/**
	 * 经办人证件类型,
	 */
	public void setLinkManIdType(String value)
	 {
		this.linkManIdType = value;
	}
	
	/**
	 * 经办人证件号码,
	 */
	public String getLinkManIdNo() {
		return this.linkManIdNo;
	}
	
	/**
	 * 经办人证件号码,
	 */
	public void setLinkManIdNo(String value)
	 {
		this.linkManIdNo = value;
	}
	
	/**
	 * 传真,
	 */
	public String getFax() {
		return this.fax;
	}
	
	/**
	 * 传真,
	 */
	public void setFax(String value)
	 {
		this.fax = value;
	}
	
	/**
	 * 邮政编码,
	 */
	public String getPostcode() {
		return this.postcode;
	}
	
	/**
	 * 邮政编码,
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
	 * 手机,
	 */
	public String getMobileTelephone() {
		return this.mobileTelephone;
	}
	
	/**
	 * 手机,
	 */
	public void setMobileTelephone(String value)
	 {
		this.mobileTelephone = value;
	}
	
	/**
	 * 登记日期,
	 */
	public java.util.Date getRegisterDate() {
		return this.registerDate;
	}
	
	/**
	 * 登记日期,
	 */
	public void setRegisterDate(java.util.Date value)
	 {
		this.registerDate = value;
	}
	
	/**
	 * 最后修改日期,
	 */
	public java.util.Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}
	
	/**
	 * 最后修改日期,
	 */
	public void setLastUpdateDate(java.util.Date value)
	 {
		this.lastUpdateDate = value;
	}
	
	/**
	 * 投资者类型,
	 */
	public String getInvestType() {
		return this.investType;
	}
	
	/**
	 * 投资者类型,
	 */
	public void setInvestType(String value)
	 {
		this.investType = value;
	}
	
	/**
	 * 客户状态,
	 */
	public String getCustomerState() {
		return this.customerState;
	}
	
	/**
	 * 客户状态,
	 */
	public void setCustomerState(String value)
	 {
		this.customerState = value;
	}
	
	/**
	 * 红利红投标志,
	 */
	public String getBonusMode() {
		return this.bonusMode;
	}
	
	/**
	 * 红利红投标志,
	 */
	public void setBonusMode(String value)
	 {
		this.bonusMode = value;
	}
	
	/**
	 * 主管单位名称,
	 */
	public String getDirectorName() {
		return this.directorName;
	}
	
	/**
	 * 主管单位名称,
	 */
	public void setDirectorName(String value)
	 {
		this.directorName = value;
	}
	
	/**
	 * 传真授权标志,
	 */
	public String getFaxFlag() {
		return this.faxFlag;
	}
	
	/**
	 * 传真授权标志,
	 */
	public void setFaxFlag(String value)
	 {
		this.faxFlag = value;
	}
	
	/**
	 * 睡眠账户计数器,
	 */
	public Integer getSleepCount() {
		return this.sleepCount;
	}
	
	/**
	 * 睡眠账户计数器,
	 */
	public void setSleepCount(Integer value)
	 {
		this.sleepCount = value;
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
	 * 是否本地网点标志,
	 */
	public String getLocalFlag() {
		return this.localFlag;
	}
	
	/**
	 * 是否本地网点标志,
	 */
	public void setLocalFlag(String value)
	 {
		this.localFlag = value;
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
	 * 投顾代码,
	 */
	public String getInvestmentAdvisorNo() {
		return this.investmentAdvisorNo;
	}
	
	/**
	 * 投顾代码,
	 */
	public void setInvestmentAdvisorNo(String value)
	 {
		this.investmentAdvisorNo = value;
	}
	
	/**
	 * 地区号,
	 */
	public String getAreaCode() {
		return this.areaCode;
	}
	
	/**
	 * 地区号,
	 */
	public void setAreaCode(String value)
	 {
		this.areaCode = value;
	}
	
	/**
	 * 15位证件号码,
	 */
	public String getIdNo18() {
		return this.idNo18;
	}
	
	/**
	 * 15位证件号码,
	 */
	public void setIdNo18(String value)
	 {
		this.idNo18 = value;
	}
	
	/**
	 * 基金账户卡号,
	 */
	public String getFundAccountCard() {
		return this.fundAccountCard;
	}
	
	/**
	 * 基金账户卡号,
	 */
	public void setFundAccountCard(String value)
	 {
		this.fundAccountCard = value;
	}
	
	/**
	 * 网点,
	 */
	public String getBranchCode() {
		return this.branchCode;
	}
	
	/**
	 * 网点,
	 */
	public void setBranchCode(String value)
	 {
		this.branchCode = value;
	}
	
	/**
	 * 交易方式,
	 */
	public String getTransactionsStyle() {
		return this.transactionsStyle;
	}
	
	/**
	 * 交易方式,
	 */
	public void setTransactionsStyle(String value)
	 {
		this.transactionsStyle = value;
	}
	
	/**
	 * 职业,
	 */
	public String getVocationCode() {
		return this.vocationCode;
	}
	
	/**
	 * 职业,
	 */
	public void setVocationCode(String value)
	 {
		this.vocationCode = value;
	}
	
	/**
	 * 年薪,
	 */
	public String getAnnualIncome() {
		return this.annualIncome;
	}
	
	/**
	 * 年薪,
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
	 * 资金结算方式,
	 */
	public String getFinaStat() {
		return this.finaStat;
	}
	
	/**
	 * 资金结算方式,
	 */
	public void setFinaStat(String value)
	 {
		this.finaStat = value;
	}
	
	/**
	 * 收件人,
	 */
	public String getReceiveName() {
		return this.receiveName;
	}
	
	/**
	 * 收件人,
	 */
	public void setReceiveName(String value)
	 {
		this.receiveName = value;
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
	 * 生日,
	 */
	public java.util.Date getBirthday() {
		return this.birthday;
	}
	
	/**
	 * 生日,
	 */
	public void setBirthday(java.util.Date value)
	 {
		this.birthday = value;
	}
	
	/**
	 * 婚姻状态,
	 */
	public String getMarrytype() {
		return this.marrytype;
	}
	
	/**
	 * 婚姻状态,
	 */
	public void setMarrytype(String value)
	 {
		this.marrytype = value;
	}
	
	/**
	 * 投资经验,
	 */
	public String getInvestexperience() {
		return this.investexperience;
	}
	
	/**
	 * 投资经验,
	 */
	public void setInvestexperience(String value)
	 {
		this.investexperience = value;
	}
	
	/**
	 * 国籍,
	 */
	public String getNationality() {
		return this.nationality;
	}
	
	/**
	 * 国籍,
	 */
	public void setNationality(String value)
	 {
		this.nationality = value;
	}
	
	/**
	 * 家庭收入,
	 */
	public String getFamilyincome() {
		return this.familyincome;
	}
	
	/**
	 * 家庭收入,
	 */
	public void setFamilyincome(String value)
	 {
		this.familyincome = value;
	}
	
	/**
	 * 是否有子女,
	 */
	public String getFamilygenaration() {
		return this.familygenaration;
	}
	
	/**
	 * 是否有子女,
	 */
	public void setFamilygenaration(String value)
	 {
		this.familygenaration = value;
	}
	
	/**
	 * 英文地址,
	 */
	public String getEnglishaddress() {
		return this.englishaddress;
	}
	
	/**
	 * 英文地址,
	 */
	public void setEnglishaddress(String value)
	 {
		this.englishaddress = value;
	}
	
	/**
	 * 英文第一个名字,
	 */
	public String getEnglishfirstname() {
		return this.englishfirstname;
	}
	
	/**
	 * 英文第一个名字,
	 */
	public void setEnglishfirstname(String value)
	 {
		this.englishfirstname = value;
	}
	
	/**
	 * 英文最后一个名字,
	 */
	public String getEnglishlastname() {
		return this.englishlastname;
	}
	
	/**
	 * 英文最后一个名字,
	 */
	public void setEnglishlastname(String value)
	 {
		this.englishlastname = value;
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
	 * ,
	 */
	public String getProvince() {
		return this.province;
	}
	
	/**
	 * ,
	 */
	public void setProvince(String value)
	 {
		this.province = value;
	}
	
	/**
	 * ,
	 */
	public String getSalespromotion() {
		return this.salespromotion;
	}
	
	/**
	 * ,
	 */
	public void setSalespromotion(String value)
	 {
		this.salespromotion = value;
	}
	
	/**
	 * 投资人预留信息,
	 */
	public String getObligateinfo() {
		return this.obligateinfo;
	}
	
	/**
	 * 投资人预留信息,
	 */
	public void setObligateinfo(String value)
	 {
		this.obligateinfo = value;
	}
	
	/**
	 * ,
	 */
	public String getOfficetelno() {
		return this.officetelno;
	}
	
	/**
	 * ,
	 */
	public void setOfficetelno(String value)
	 {
		this.officetelno = value;
	}
	
	/**
	 * 风险级别,
	 */
	public String getCustRiskLevel() {
		return this.custRiskLevel;
	}
	
	/**
	 * 风险级别,
	 */
	public void setCustRiskLevel(String value)
	 {
		this.custRiskLevel = value;
	}
	
	/**
	 * 风险级别更新日期,
	 */
	public String getCustRiskDate() {
		return this.custRiskDate;
	}
	
	/**
	 * 风险级别更新日期,
	 */
	public void setCustRiskDate(String value)
	 {
		this.custRiskDate = value;
	}
	
	/**
	 * 风险标识,
	 */
	public String getCustRiskTip() {
		return this.custRiskTip;
	}
	
	/**
	 * 风险标识,
	 */
	public void setCustRiskTip(String value)
	 {
		this.custRiskTip = value;
	}
	
	/**
	 * 问卷是否过期,
	 */
	public String getCustRiskInvalid() {
		return this.custRiskInvalid;
	}
	
	/**
	 * 问卷是否过期,
	 */
	public void setCustRiskInvalid(String value)
	 {
		this.custRiskInvalid = value;
	}
	
	/**
	 * 网上委托状态,
	 */
	public String getNetTradeState() {
		return this.netTradeState;
	}
	
	/**
	 * 网上委托状态,
	 */
	public void setNetTradeState(String value)
	 {
		this.netTradeState = value;
	}
}
