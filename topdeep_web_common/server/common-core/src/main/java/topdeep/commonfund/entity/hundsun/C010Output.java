package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 读取用户信息(C010)
 */
public class C010Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 出生日期,
	 */
	private String birthday = "";
	
	/**
	 * 通讯地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 姓名,
	 */
	private String customerappellation = "";
	
	/**
	 * E-MAIL地址,
	 */
	private String email = "";
	
	/**
	 * 手机,
	 */
	private String handset = "";
	
	/**
	 * 证件号码,
	 */
	private String idno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String idtype = "";
	
	/**
	 * 证件有效期,YYYYMMDD
	 */
	private String invalidate = "";
	
	/**
	 * 国籍,详见字典项说明（参考字典：国籍代码）
	 */
	private String nationality2 = "";
	
	/**
	 * 对账单寄送途径,详见字典项说明（参考字典：对账单寄送途径）
	 */
	private String reckoningmailtype = "";
	
	/**
	 * 对账单寄送方式,详见字典项说明（参考字典：对账单寄送方式）
	 */
	private String reckoningsendtype = "";
	
	/**
	 * 性别,详见字典项说明（参考字典：性别）
	 */
	private String sex = "";
	
	/**
	 * 职业,详见字典项说明（参考字典：职业）
	 */
	private String workcode = "";
	
	/**
	 * 邮政编码,
	 */
	private String zipcode = "";
	
	/**
	 * 年收入,详见字典项说明（参考字典：年收入）
	 */
	private String annualsalary = "";
	
	/**
	 * 账户实际受益人,
	 */
	private String beneficiary = "";
	
	/**
	 * 学历,详见字典项说明（参考字典：学历）
	 */
	private String educational = "";
	
	/**
	 * 传真号码,
	 */
	private String fax = "";
	
	/**
	 * 是否有投资经历,1;有;空:没有;
	 */
	private String investexp = "";
	
	/**
	 * 婚姻,详见字典项说明（参考字典：婚姻）
	 */
	private String marriage = "";
	
	/**
	 * 推荐人,
	 */
	private String recommender = "";
	
	/**
	 * 预留信息,
	 */
	private String reservwords = "";
	
	/**
	 * 特殊代码,
	 */
	private String specialcode = "";
	
	/**
	 * 电话号码,
	 */
	private String telephone = "";
	
	/**
	 * 账户状态,
	 */
	private String accoStatus = "";
	
	/**
	 * 所属机构,
	 */
	private String belongorgan = "";
	
	/**
	 * 客户分类,
	 */
	private String custkind = "";
	
	/**
	 * 客户简称,
	 */
	private String customershortname = "";
	
	/**
	 * 客户类型,个人：1,机构：0
	 */
	private String custtype = "";
	
	/**
	 * 数据中心客户编号,
	 */
	private String eqcustno = "";
	
	/**
	 * 备注,
	 */
	private String explain = "";
	
	/**
	 * 传真委托状态,1:开通;0:未开通
	 */
	private String faxconsign = "";
	
	/**
	 * 风险问卷辅助代码,
	 */
	private String fixBusinFlag = "";
	
	/**
	 * 基金账号,多个基金账号,号分隔
	 */
	private String fundacco = "";
	
	/**
	 * 是否公募,
	 */
	private String isnormal = "";
	
	/**
	 * 是否专户,
	 */
	private String isspecialaccount = "";
	
	/**
	 * 手机委托状态,1:开通;0:未开通
	 */
	private String mobiletrust = "";
	
	/**
	 * 网上委托状态,1:开通;0:未开通
	 */
	private String netconsign = "";
	
	/**
	 * 用户风险等级,（参考字典：投资人风险承受能力）
	 */
	private String riskability = "";
	
	/**
	 * 问卷是否过期,true：已过期，false:未过期
	 */
	private Boolean riskexpired;
	
	/**
	 * 风险标识,
	 */
	private Boolean riskFlag;
	
	/**
	 * 风险问卷更新日期,
	 */
	private String riskUpdateTime = "";
	
	/**
	 * 电话委托状态,1:开通;0:未开通
	 */
	private String telephoneconsign = "";
	
	/**
	 * 是否支持现金宝,0：不支持，1：支持
	 */
	private String emoneyfundflag;
	
	/**
	 * 外部集团编号,
	 */
	private String extcompany = "";
	
	/**
	 * 外部客户编号,
	 */
	private String extcustno = "";
	
	/**
	 * 理财师工号,
	 */
	private String fundmanagerid = "";
	
	/**
	 * 理财师姓名,
	 */
	private String fundmanagername = "";
	
	/**
	 * 长账单寄送地址,8位字符串，第1位：邮寄，第2位：传真，第3位：E-mail，第4位：短消息。每位字符取1表示采用此种手段，取0表示不使用。第5~8位：全部传0
	 */
	private String longbillway = "";
	
	/**
	 * 资金来源,
	 */
	private String moneysource;
	
	/**
	 * 管理员证件号码,机构客户有效，个人客户无此返回值
	 */
	private String adminidno = "";
	
	/**
	 * 管理员证件类型,机构客户有效，个人客户无此返回值
	 */
	private String adminidtype = "";
	
	/**
	 * 管理员证件有效期,机构客户有效，个人客户无此返回值
	 */
	private String admininvalidate = "";
	
	/**
	 * 管理员手机号,机构客户有效，个人客户无此返回值
	 */
	private String adminmobile = "";
	
	/**
	 * 管理员姓名,机构客户有效，个人客户无此返回值
	 */
	private String adminname = "";
	
	/**
	 * 组织机构代码,机构客户有效，个人客户无此返回值
	 */
	private String agencyno = "";
	
	/**
	 * 企业名称,机构客户有效，个人客户无此返回值
	 */
	private String companyname = "";
	
	/**
	 * 注册地址,机构客户有效，个人客户无此返回值
	 */
	private String registaddr = "";
	
	/**
	 * 税务登记证号码,机构客户有效，个人客户无此返回值
	 */
	private String taxregno = "";
	
	/**
	 * 法人姓名,机构客户有效，个人客户无此返回值
	 */
	private String artificialname = "";
	
	/**
	 * 法人证件号码,机构客户有效，个人客户无此返回值
	 */
	private String artificialnumber = "";
	
	/**
	 * 法人证件类型,机构客户有效，个人客户无此返回值
	 */
	private String artificialtype = "";
	
	/**
	 * 法人证件有效期,机构客户有效，个人客户无此返回值
	 */
	private String instreprrvalidate = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 经办人手机号码,
	 */
	private String contmobileno = "";
	
	/**
	 * 经办人证件有效期,
	 */
	private String contvalidate = "";
	
	/**
	 * 风险问卷分值,
	 */
	private String riskscore = "";
	
	/**
	 * 经办人证件号码,
	 */
	private String transactorcertinumber = "";
	
	/**
	 * 经办人证件类型,
	 */
	private String transactorcertitype = "";
	
	/**
	 * 经办人电子信箱,
	 */
	private String transactoremail = "";
	
	/**
	 * 经办人姓名,
	 */
	private String transactorname = "";
	
	/**
	 * 经办人联系电话,
	 */
	private String transactortelephone = "";
	
	/**
	 * 是否允许信息共享,
	 */
	private String msgsendtype = "";
	
	/**
	 * 基金账号状态,
	 */
	private String fundaccostate = "多个基金账号状态以,分隔";
	
	/**
	 * 基金账号TA代码,
	 */
	private String fundaccotacode = "多个基金账号TA代码以,分隔";
	
	/**
	 * 开户日期,
	 */
	private String opendate = "";
	
	/**
	 * 客户网点信息,
	 */
	private String acconetno = "";
	
	/**
	 * 合格投资人生效日期,
	 */
	private Double effectdate;
	
	/**
	 * 合格投资人截止日期,
	 */
	private Double effectenddate;
	
	/**
	 * IC姓名,
	 */
	private String icname = "";
	
	/**
	 * IC工号,
	 */
	private Double icno;
	
	/**
	 * 合格投资人标识,
	 */
	private String qualifiedflag;
	
	/**
	 * 经办人与申请人关系,
	 */
	private String transactorcontrelation = "";
	
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
	 * 通讯地址,
	 */
	public String getCommunicationaddr() {
		return this.communicationaddr;
	}
	
	/**
	 * 通讯地址,
	 */
	public void setCommunicationaddr(String value)
	 {
		this.communicationaddr = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 姓名,
	 */
	public String getCustomerappellation() {
		return this.customerappellation;
	}
	
	/**
	 * 姓名,
	 */
	public void setCustomerappellation(String value)
	 {
		this.customerappellation = value;
	}
	
	/**
	 * E-MAIL地址,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * E-MAIL地址,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 手机,
	 */
	public String getHandset() {
		return this.handset;
	}
	
	/**
	 * 手机,
	 */
	public void setHandset(String value)
	 {
		this.handset = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdno() {
		return this.idno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdno(String value)
	 {
		this.idno = value;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public String getIdtype() {
		return this.idtype;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public void setIdtype(String value)
	 {
		this.idtype = value;
	}
	
	/**
	 * 证件有效期,YYYYMMDD
	 */
	public String getInvalidate() {
		return this.invalidate;
	}
	
	/**
	 * 证件有效期,YYYYMMDD
	 */
	public void setInvalidate(String value)
	 {
		this.invalidate = value;
	}
	
	/**
	 * 国籍,详见字典项说明（参考字典：国籍代码）
	 */
	public String getNationality2() {
		return this.nationality2;
	}
	
	/**
	 * 国籍,详见字典项说明（参考字典：国籍代码）
	 */
	public void setNationality2(String value)
	 {
		this.nationality2 = value;
	}
	
	/**
	 * 对账单寄送途径,详见字典项说明（参考字典：对账单寄送途径）
	 */
	public String getReckoningmailtype() {
		return this.reckoningmailtype;
	}
	
	/**
	 * 对账单寄送途径,详见字典项说明（参考字典：对账单寄送途径）
	 */
	public void setReckoningmailtype(String value)
	 {
		this.reckoningmailtype = value;
	}
	
	/**
	 * 对账单寄送方式,详见字典项说明（参考字典：对账单寄送方式）
	 */
	public String getReckoningsendtype() {
		return this.reckoningsendtype;
	}
	
	/**
	 * 对账单寄送方式,详见字典项说明（参考字典：对账单寄送方式）
	 */
	public void setReckoningsendtype(String value)
	 {
		this.reckoningsendtype = value;
	}
	
	/**
	 * 性别,详见字典项说明（参考字典：性别）
	 */
	public String getSex() {
		return this.sex;
	}
	
	/**
	 * 性别,详见字典项说明（参考字典：性别）
	 */
	public void setSex(String value)
	 {
		this.sex = value;
	}
	
	/**
	 * 职业,详见字典项说明（参考字典：职业）
	 */
	public String getWorkcode() {
		return this.workcode;
	}
	
	/**
	 * 职业,详见字典项说明（参考字典：职业）
	 */
	public void setWorkcode(String value)
	 {
		this.workcode = value;
	}
	
	/**
	 * 邮政编码,
	 */
	public String getZipcode() {
		return this.zipcode;
	}
	
	/**
	 * 邮政编码,
	 */
	public void setZipcode(String value)
	 {
		this.zipcode = value;
	}
	
	/**
	 * 年收入,详见字典项说明（参考字典：年收入）
	 */
	public String getAnnualsalary() {
		return this.annualsalary;
	}
	
	/**
	 * 年收入,详见字典项说明（参考字典：年收入）
	 */
	public void setAnnualsalary(String value)
	 {
		this.annualsalary = value;
	}
	
	/**
	 * 账户实际受益人,
	 */
	public String getBeneficiary() {
		return this.beneficiary;
	}
	
	/**
	 * 账户实际受益人,
	 */
	public void setBeneficiary(String value)
	 {
		this.beneficiary = value;
	}
	
	/**
	 * 学历,详见字典项说明（参考字典：学历）
	 */
	public String getEducational() {
		return this.educational;
	}
	
	/**
	 * 学历,详见字典项说明（参考字典：学历）
	 */
	public void setEducational(String value)
	 {
		this.educational = value;
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
	 * 是否有投资经历,1;有;空:没有;
	 */
	public String getInvestexp() {
		return this.investexp;
	}
	
	/**
	 * 是否有投资经历,1;有;空:没有;
	 */
	public void setInvestexp(String value)
	 {
		this.investexp = value;
	}
	
	/**
	 * 婚姻,详见字典项说明（参考字典：婚姻）
	 */
	public String getMarriage() {
		return this.marriage;
	}
	
	/**
	 * 婚姻,详见字典项说明（参考字典：婚姻）
	 */
	public void setMarriage(String value)
	 {
		this.marriage = value;
	}
	
	/**
	 * 推荐人,
	 */
	public String getRecommender() {
		return this.recommender;
	}
	
	/**
	 * 推荐人,
	 */
	public void setRecommender(String value)
	 {
		this.recommender = value;
	}
	
	/**
	 * 预留信息,
	 */
	public String getReservwords() {
		return this.reservwords;
	}
	
	/**
	 * 预留信息,
	 */
	public void setReservwords(String value)
	 {
		this.reservwords = value;
	}
	
	/**
	 * 特殊代码,
	 */
	public String getSpecialcode() {
		return this.specialcode;
	}
	
	/**
	 * 特殊代码,
	 */
	public void setSpecialcode(String value)
	 {
		this.specialcode = value;
	}
	
	/**
	 * 电话号码,
	 */
	public String getTelephone() {
		return this.telephone;
	}
	
	/**
	 * 电话号码,
	 */
	public void setTelephone(String value)
	 {
		this.telephone = value;
	}
	
	/**
	 * 账户状态,
	 */
	public String getAccoStatus() {
		return this.accoStatus;
	}
	
	/**
	 * 账户状态,
	 */
	public void setAccoStatus(String value)
	 {
		this.accoStatus = value;
	}
	
	/**
	 * 所属机构,
	 */
	public String getBelongorgan() {
		return this.belongorgan;
	}
	
	/**
	 * 所属机构,
	 */
	public void setBelongorgan(String value)
	 {
		this.belongorgan = value;
	}
	
	/**
	 * 客户分类,
	 */
	public String getCustkind() {
		return this.custkind;
	}
	
	/**
	 * 客户分类,
	 */
	public void setCustkind(String value)
	 {
		this.custkind = value;
	}
	
	/**
	 * 客户简称,
	 */
	public String getCustomershortname() {
		return this.customershortname;
	}
	
	/**
	 * 客户简称,
	 */
	public void setCustomershortname(String value)
	 {
		this.customershortname = value;
	}
	
	/**
	 * 客户类型,个人：1,机构：0
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,个人：1,机构：0
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 数据中心客户编号,
	 */
	public String getEqcustno() {
		return this.eqcustno;
	}
	
	/**
	 * 数据中心客户编号,
	 */
	public void setEqcustno(String value)
	 {
		this.eqcustno = value;
	}
	
	/**
	 * 备注,
	 */
	public String getExplain() {
		return this.explain;
	}
	
	/**
	 * 备注,
	 */
	public void setExplain(String value)
	 {
		this.explain = value;
	}
	
	/**
	 * 传真委托状态,1:开通;0:未开通
	 */
	public String getFaxconsign() {
		return this.faxconsign;
	}
	
	/**
	 * 传真委托状态,1:开通;0:未开通
	 */
	public void setFaxconsign(String value)
	 {
		this.faxconsign = value;
	}
	
	/**
	 * 风险问卷辅助代码,
	 */
	public String getFixBusinFlag() {
		return this.fixBusinFlag;
	}
	
	/**
	 * 风险问卷辅助代码,
	 */
	public void setFixBusinFlag(String value)
	 {
		this.fixBusinFlag = value;
	}
	
	/**
	 * 基金账号,多个基金账号,号分隔
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,多个基金账号,号分隔
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 是否公募,
	 */
	public String getIsnormal() {
		return this.isnormal;
	}
	
	/**
	 * 是否公募,
	 */
	public void setIsnormal(String value)
	 {
		this.isnormal = value;
	}
	
	/**
	 * 是否专户,
	 */
	public String getIsspecialaccount() {
		return this.isspecialaccount;
	}
	
	/**
	 * 是否专户,
	 */
	public void setIsspecialaccount(String value)
	 {
		this.isspecialaccount = value;
	}
	
	/**
	 * 手机委托状态,1:开通;0:未开通
	 */
	public String getMobiletrust() {
		return this.mobiletrust;
	}
	
	/**
	 * 手机委托状态,1:开通;0:未开通
	 */
	public void setMobiletrust(String value)
	 {
		this.mobiletrust = value;
	}
	
	/**
	 * 网上委托状态,1:开通;0:未开通
	 */
	public String getNetconsign() {
		return this.netconsign;
	}
	
	/**
	 * 网上委托状态,1:开通;0:未开通
	 */
	public void setNetconsign(String value)
	 {
		this.netconsign = value;
	}
	
	/**
	 * 用户风险等级,（参考字典：投资人风险承受能力）
	 */
	public String getRiskability() {
		return this.riskability;
	}
	
	/**
	 * 用户风险等级,（参考字典：投资人风险承受能力）
	 */
	public void setRiskability(String value)
	 {
		this.riskability = value;
	}
	
	/**
	 * 问卷是否过期,true：已过期，false:未过期
	 */
	public Boolean getRiskexpired() {
		return this.riskexpired;
	}
	
	/**
	 * 问卷是否过期,true：已过期，false:未过期
	 */
	public void setRiskexpired(Boolean value)
	 {
		this.riskexpired = value;
	}
	
	/**
	 * 风险标识,
	 */
	public Boolean getRiskFlag() {
		return this.riskFlag;
	}
	
	/**
	 * 风险标识,
	 */
	public void setRiskFlag(Boolean value)
	 {
		this.riskFlag = value;
	}
	
	/**
	 * 风险问卷更新日期,
	 */
	public String getRiskUpdateTime() {
		return this.riskUpdateTime;
	}
	
	/**
	 * 风险问卷更新日期,
	 */
	public void setRiskUpdateTime(String value)
	 {
		this.riskUpdateTime = value;
	}
	
	/**
	 * 电话委托状态,1:开通;0:未开通
	 */
	public String getTelephoneconsign() {
		return this.telephoneconsign;
	}
	
	/**
	 * 电话委托状态,1:开通;0:未开通
	 */
	public void setTelephoneconsign(String value)
	 {
		this.telephoneconsign = value;
	}
	
	/**
	 * 是否支持现金宝,0：不支持，1：支持
	 */
	public String getEmoneyfundflag() {
		return this.emoneyfundflag;
	}
	
	/**
	 * 是否支持现金宝,0：不支持，1：支持
	 */
	public void setEmoneyfundflag(String value)
	 {
		this.emoneyfundflag = value;
	}
	
	/**
	 * 外部集团编号,
	 */
	public String getExtcompany() {
		return this.extcompany;
	}
	
	/**
	 * 外部集团编号,
	 */
	public void setExtcompany(String value)
	 {
		this.extcompany = value;
	}
	
	/**
	 * 外部客户编号,
	 */
	public String getExtcustno() {
		return this.extcustno;
	}
	
	/**
	 * 外部客户编号,
	 */
	public void setExtcustno(String value)
	 {
		this.extcustno = value;
	}
	
	/**
	 * 理财师工号,
	 */
	public String getFundmanagerid() {
		return this.fundmanagerid;
	}
	
	/**
	 * 理财师工号,
	 */
	public void setFundmanagerid(String value)
	 {
		this.fundmanagerid = value;
	}
	
	/**
	 * 理财师姓名,
	 */
	public String getFundmanagername() {
		return this.fundmanagername;
	}
	
	/**
	 * 理财师姓名,
	 */
	public void setFundmanagername(String value)
	 {
		this.fundmanagername = value;
	}
	
	/**
	 * 长账单寄送地址,8位字符串，第1位：邮寄，第2位：传真，第3位：E-mail，第4位：短消息。每位字符取1表示采用此种手段，取0表示不使用。第5~8位：全部传0
	 */
	public String getLongbillway() {
		return this.longbillway;
	}
	
	/**
	 * 长账单寄送地址,8位字符串，第1位：邮寄，第2位：传真，第3位：E-mail，第4位：短消息。每位字符取1表示采用此种手段，取0表示不使用。第5~8位：全部传0
	 */
	public void setLongbillway(String value)
	 {
		this.longbillway = value;
	}
	
	/**
	 * 资金来源,
	 */
	public String getMoneysource() {
		return this.moneysource;
	}
	
	/**
	 * 资金来源,
	 */
	public void setMoneysource(String value)
	 {
		this.moneysource = value;
	}
	
	/**
	 * 管理员证件号码,机构客户有效，个人客户无此返回值
	 */
	public String getAdminidno() {
		return this.adminidno;
	}
	
	/**
	 * 管理员证件号码,机构客户有效，个人客户无此返回值
	 */
	public void setAdminidno(String value)
	 {
		this.adminidno = value;
	}
	
	/**
	 * 管理员证件类型,机构客户有效，个人客户无此返回值
	 */
	public String getAdminidtype() {
		return this.adminidtype;
	}
	
	/**
	 * 管理员证件类型,机构客户有效，个人客户无此返回值
	 */
	public void setAdminidtype(String value)
	 {
		this.adminidtype = value;
	}
	
	/**
	 * 管理员证件有效期,机构客户有效，个人客户无此返回值
	 */
	public String getAdmininvalidate() {
		return this.admininvalidate;
	}
	
	/**
	 * 管理员证件有效期,机构客户有效，个人客户无此返回值
	 */
	public void setAdmininvalidate(String value)
	 {
		this.admininvalidate = value;
	}
	
	/**
	 * 管理员手机号,机构客户有效，个人客户无此返回值
	 */
	public String getAdminmobile() {
		return this.adminmobile;
	}
	
	/**
	 * 管理员手机号,机构客户有效，个人客户无此返回值
	 */
	public void setAdminmobile(String value)
	 {
		this.adminmobile = value;
	}
	
	/**
	 * 管理员姓名,机构客户有效，个人客户无此返回值
	 */
	public String getAdminname() {
		return this.adminname;
	}
	
	/**
	 * 管理员姓名,机构客户有效，个人客户无此返回值
	 */
	public void setAdminname(String value)
	 {
		this.adminname = value;
	}
	
	/**
	 * 组织机构代码,机构客户有效，个人客户无此返回值
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 组织机构代码,机构客户有效，个人客户无此返回值
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 企业名称,机构客户有效，个人客户无此返回值
	 */
	public String getCompanyname() {
		return this.companyname;
	}
	
	/**
	 * 企业名称,机构客户有效，个人客户无此返回值
	 */
	public void setCompanyname(String value)
	 {
		this.companyname = value;
	}
	
	/**
	 * 注册地址,机构客户有效，个人客户无此返回值
	 */
	public String getRegistaddr() {
		return this.registaddr;
	}
	
	/**
	 * 注册地址,机构客户有效，个人客户无此返回值
	 */
	public void setRegistaddr(String value)
	 {
		this.registaddr = value;
	}
	
	/**
	 * 税务登记证号码,机构客户有效，个人客户无此返回值
	 */
	public String getTaxregno() {
		return this.taxregno;
	}
	
	/**
	 * 税务登记证号码,机构客户有效，个人客户无此返回值
	 */
	public void setTaxregno(String value)
	 {
		this.taxregno = value;
	}
	
	/**
	 * 法人姓名,机构客户有效，个人客户无此返回值
	 */
	public String getArtificialname() {
		return this.artificialname;
	}
	
	/**
	 * 法人姓名,机构客户有效，个人客户无此返回值
	 */
	public void setArtificialname(String value)
	 {
		this.artificialname = value;
	}
	
	/**
	 * 法人证件号码,机构客户有效，个人客户无此返回值
	 */
	public String getArtificialnumber() {
		return this.artificialnumber;
	}
	
	/**
	 * 法人证件号码,机构客户有效，个人客户无此返回值
	 */
	public void setArtificialnumber(String value)
	 {
		this.artificialnumber = value;
	}
	
	/**
	 * 法人证件类型,机构客户有效，个人客户无此返回值
	 */
	public String getArtificialtype() {
		return this.artificialtype;
	}
	
	/**
	 * 法人证件类型,机构客户有效，个人客户无此返回值
	 */
	public void setArtificialtype(String value)
	 {
		this.artificialtype = value;
	}
	
	/**
	 * 法人证件有效期,机构客户有效，个人客户无此返回值
	 */
	public String getInstreprrvalidate() {
		return this.instreprrvalidate;
	}
	
	/**
	 * 法人证件有效期,机构客户有效，个人客户无此返回值
	 */
	public void setInstreprrvalidate(String value)
	 {
		this.instreprrvalidate = value;
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
	 * 经办人手机号码,
	 */
	public String getContmobileno() {
		return this.contmobileno;
	}
	
	/**
	 * 经办人手机号码,
	 */
	public void setContmobileno(String value)
	 {
		this.contmobileno = value;
	}
	
	/**
	 * 经办人证件有效期,
	 */
	public String getContvalidate() {
		return this.contvalidate;
	}
	
	/**
	 * 经办人证件有效期,
	 */
	public void setContvalidate(String value)
	 {
		this.contvalidate = value;
	}
	
	/**
	 * 风险问卷分值,
	 */
	public String getRiskscore() {
		return this.riskscore;
	}
	
	/**
	 * 风险问卷分值,
	 */
	public void setRiskscore(String value)
	 {
		this.riskscore = value;
	}
	
	/**
	 * 经办人证件号码,
	 */
	public String getTransactorcertinumber() {
		return this.transactorcertinumber;
	}
	
	/**
	 * 经办人证件号码,
	 */
	public void setTransactorcertinumber(String value)
	 {
		this.transactorcertinumber = value;
	}
	
	/**
	 * 经办人证件类型,
	 */
	public String getTransactorcertitype() {
		return this.transactorcertitype;
	}
	
	/**
	 * 经办人证件类型,
	 */
	public void setTransactorcertitype(String value)
	 {
		this.transactorcertitype = value;
	}
	
	/**
	 * 经办人电子信箱,
	 */
	public String getTransactoremail() {
		return this.transactoremail;
	}
	
	/**
	 * 经办人电子信箱,
	 */
	public void setTransactoremail(String value)
	 {
		this.transactoremail = value;
	}
	
	/**
	 * 经办人姓名,
	 */
	public String getTransactorname() {
		return this.transactorname;
	}
	
	/**
	 * 经办人姓名,
	 */
	public void setTransactorname(String value)
	 {
		this.transactorname = value;
	}
	
	/**
	 * 经办人联系电话,
	 */
	public String getTransactortelephone() {
		return this.transactortelephone;
	}
	
	/**
	 * 经办人联系电话,
	 */
	public void setTransactortelephone(String value)
	 {
		this.transactortelephone = value;
	}
	
	/**
	 * 是否允许信息共享,
	 */
	public String getMsgsendtype() {
		return this.msgsendtype;
	}
	
	/**
	 * 是否允许信息共享,
	 */
	public void setMsgsendtype(String value)
	 {
		this.msgsendtype = value;
	}
	
	/**
	 * 基金账号状态,
	 */
	public String getFundaccostate() {
		return this.fundaccostate;
	}
	
	/**
	 * 基金账号状态,
	 */
	public void setFundaccostate(String value)
	 {
		this.fundaccostate = value;
	}
	
	/**
	 * 基金账号TA代码,
	 */
	public String getFundaccotacode() {
		return this.fundaccotacode;
	}
	
	/**
	 * 基金账号TA代码,
	 */
	public void setFundaccotacode(String value)
	 {
		this.fundaccotacode = value;
	}
	
	/**
	 * 开户日期,
	 */
	public String getOpendate() {
		return this.opendate;
	}
	
	/**
	 * 开户日期,
	 */
	public void setOpendate(String value)
	 {
		this.opendate = value;
	}
	
	/**
	 * 客户网点信息,
	 */
	public String getAcconetno() {
		return this.acconetno;
	}
	
	/**
	 * 客户网点信息,
	 */
	public void setAcconetno(String value)
	 {
		this.acconetno = value;
	}
	
	/**
	 * 合格投资人生效日期,
	 */
	public Double getEffectdate() {
		return this.effectdate;
	}
	
	/**
	 * 合格投资人生效日期,
	 */
	public void setEffectdate(Double value)
	 {
		this.effectdate = value;
	}
	
	/**
	 * 合格投资人截止日期,
	 */
	public Double getEffectenddate() {
		return this.effectenddate;
	}
	
	/**
	 * 合格投资人截止日期,
	 */
	public void setEffectenddate(Double value)
	 {
		this.effectenddate = value;
	}
	
	/**
	 * IC姓名,
	 */
	public String getIcname() {
		return this.icname;
	}
	
	/**
	 * IC姓名,
	 */
	public void setIcname(String value)
	 {
		this.icname = value;
	}
	
	/**
	 * IC工号,
	 */
	public Double getIcno() {
		return this.icno;
	}
	
	/**
	 * IC工号,
	 */
	public void setIcno(Double value)
	 {
		this.icno = value;
	}
	
	/**
	 * 合格投资人标识,
	 */
	public String getQualifiedflag() {
		return this.qualifiedflag;
	}
	
	/**
	 * 合格投资人标识,
	 */
	public void setQualifiedflag(String value)
	 {
		this.qualifiedflag = value;
	}
	
	/**
	 * 经办人与申请人关系,
	 */
	public String getTransactorcontrelation() {
		return this.transactorcontrelation;
	}
	
	/**
	 * 经办人与申请人关系,
	 */
	public void setTransactorcontrelation(String value)
	 {
		this.transactorcontrelation = value;
	}
}
