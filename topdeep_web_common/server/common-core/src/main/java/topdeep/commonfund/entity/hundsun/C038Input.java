package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改用户信息(后台模式)(C038)
 */
public class C038Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 数据源,DS:直销;DC:数据中心
	 */
	private String datasource = "";
	
	/**
	 * 审批单号,诺亚机构使用
	 */
	private String approvalno = "";
	
	/**
	 * 法人代表证件类型,
	 */
	private String artificialtype = "";
	
	/**
	 * 是否有投资经历,1;有;0:没有;不传:不修改
	 */
	private String investexp = "";
	
	/**
	 * 升级后的身份证号,
	 */
	private String newidcard = "";
	
	/**
	 * 年收入,详见字典项说明（参考字典：年收入）
	 */
	private String annualsalary = "";
	
	/**
	 * 法人代表证件有效日期截止日,
	 */
	private String artificialinvalidate = "";
	
	/**
	 * 法人代表姓名,
	 */
	private String artificialname = "";
	
	/**
	 * 法人代表证件号码,
	 */
	private String artificialnumber = "";
	
	/**
	 * 所属机构,
	 */
	private String belongorgan = "";
	
	/**
	 * 账户实际受益人,
	 */
	private String beneficiary = "";
	
	/**
	 * 出生日期,
	 */
	private String birthday = "YYYYMMDD";
	
	/**
	 * 证件年检有效期,
	 */
	private String checkidvalidate = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 通讯地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * 企业名称,诺亚机构使用
	 */
	private String companyname = "";
	
	/**
	 * 客户分类,
	 */
	private String custkind = "";
	
	/**
	 * 姓名 是否能修改根据系统参数决定,
	 */
	private String customerappellation = "";
	
	/**
	 * 客户简称,
	 */
	private String customershortname = "";
	
	/**
	 * 学历,详见字典项说明（参考字典：学历）
	 */
	private String educational = "";
	
	/**
	 * E-MAIL地址,
	 */
	private String email = "";
	
	/**
	 * 是否支持现金宝,
	 */
	private String emoneyfundflag = "";
	
	/**
	 * 备注,
	 */
	private String explain = "";
	
	/**
	 * 会员编号（外部客户编号）,诺亚机构使用
	 */
	private String extcompany = "";
	
	/**
	 * 外部URl,诺亚机构使用
	 */
	private String exturl = "";
	
	/**
	 * 传真号码,
	 */
	private String fax = "";
	
	/**
	 * 手机,
	 */
	private String handset = "";
	
	/**
	 * 证件号码,诺亚机构使用
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,诺亚机构使用
	 */
	private String identitytype = "";
	
	/**
	 * 证件有效期,
	 */
	private String invalidate = "";
	
	/**
	 * 多账单寄送途径,
	 */
	private String longbillway = "";
	
	/**
	 * 婚姻,详见字典项说明（参考字典：婚姻）
	 */
	private String marriage = "";
	
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
	 * 推荐人,
	 */
	private String recommender = "";
	
	/**
	 * 推荐人电话,
	 */
	private String recommendphone = "";
	
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
	 * 经办人证件号码,
	 */
	private String transactorcertinumber = "";
	
	/**
	 * 经办人证件类型,
	 */
	private String transactorcertitype = "";
	
	/**
	 * 经办人证件有效期,
	 */
	private String transactorinvalidate = "";
	
	/**
	 * 经办人姓名,
	 */
	private String transactorname = "";
	
	/**
	 * 委托方式,
	 */
	private String trust = "";
	
	/**
	 * 职业,详见字典项说明（参考字典：职业）
	 */
	private String workcode = "";
	
	/**
	 * 邮政编码,
	 */
	private String zipcode = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 客户网点号,修改投资人开户网点号时使用
	 */
	private Double acconetno;
	
	/**
	 * 合格投资人生效日期,
	 */
	private Double effectdate;
	
	/**
	 * 合格投资人截止日期,
	 */
	private Double effectenddate;
	
	/**
	 * 理财师工号,
	 */
	private Double fundmanagerid;
	
	/**
	 * 理财师姓名,
	 */
	private String fundmanagername = "";
	
	/**
	 * IC姓名,
	 */
	private String icname = "";
	
	/**
	 * IC工号,
	 */
	private Double icno;
	
	/**
	 * 合格投资人标识,0：无效，1：有效
	 */
	private String qualifiedflag;
	
	/**
	 * 初始化参数
	 */
	public C038Input() {
		this.setFunction("C038");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 数据源,DS:直销;DC:数据中心
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据源,DS:直销;DC:数据中心
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 审批单号,诺亚机构使用
	 */
	public String getApprovalno() {
		return this.approvalno;
	}
	
	/**
	 * 审批单号,诺亚机构使用
	 */
	public void setApprovalno(String value)
	 {
		this.approvalno = value;
	}
	
	/**
	 * 法人代表证件类型,
	 */
	public String getArtificialtype() {
		return this.artificialtype;
	}
	
	/**
	 * 法人代表证件类型,
	 */
	public void setArtificialtype(String value)
	 {
		this.artificialtype = value;
	}
	
	/**
	 * 是否有投资经历,1;有;0:没有;不传:不修改
	 */
	public String getInvestexp() {
		return this.investexp;
	}
	
	/**
	 * 是否有投资经历,1;有;0:没有;不传:不修改
	 */
	public void setInvestexp(String value)
	 {
		this.investexp = value;
	}
	
	/**
	 * 升级后的身份证号,
	 */
	public String getNewidcard() {
		return this.newidcard;
	}
	
	/**
	 * 升级后的身份证号,
	 */
	public void setNewidcard(String value)
	 {
		this.newidcard = value;
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
	 * 法人代表证件有效日期截止日,
	 */
	public String getArtificialinvalidate() {
		return this.artificialinvalidate;
	}
	
	/**
	 * 法人代表证件有效日期截止日,
	 */
	public void setArtificialinvalidate(String value)
	 {
		this.artificialinvalidate = value;
	}
	
	/**
	 * 法人代表姓名,
	 */
	public String getArtificialname() {
		return this.artificialname;
	}
	
	/**
	 * 法人代表姓名,
	 */
	public void setArtificialname(String value)
	 {
		this.artificialname = value;
	}
	
	/**
	 * 法人代表证件号码,
	 */
	public String getArtificialnumber() {
		return this.artificialnumber;
	}
	
	/**
	 * 法人代表证件号码,
	 */
	public void setArtificialnumber(String value)
	 {
		this.artificialnumber = value;
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
	 * 证件年检有效期,
	 */
	public String getCheckidvalidate() {
		return this.checkidvalidate;
	}
	
	/**
	 * 证件年检有效期,
	 */
	public void setCheckidvalidate(String value)
	 {
		this.checkidvalidate = value;
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
	 * 企业名称,诺亚机构使用
	 */
	public String getCompanyname() {
		return this.companyname;
	}
	
	/**
	 * 企业名称,诺亚机构使用
	 */
	public void setCompanyname(String value)
	 {
		this.companyname = value;
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
	 * 姓名 是否能修改根据系统参数决定,
	 */
	public String getCustomerappellation() {
		return this.customerappellation;
	}
	
	/**
	 * 姓名 是否能修改根据系统参数决定,
	 */
	public void setCustomerappellation(String value)
	 {
		this.customerappellation = value;
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
	 * 是否支持现金宝,
	 */
	public String getEmoneyfundflag() {
		return this.emoneyfundflag;
	}
	
	/**
	 * 是否支持现金宝,
	 */
	public void setEmoneyfundflag(String value)
	 {
		this.emoneyfundflag = value;
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
	 * 会员编号（外部客户编号）,诺亚机构使用
	 */
	public String getExtcompany() {
		return this.extcompany;
	}
	
	/**
	 * 会员编号（外部客户编号）,诺亚机构使用
	 */
	public void setExtcompany(String value)
	 {
		this.extcompany = value;
	}
	
	/**
	 * 外部URl,诺亚机构使用
	 */
	public String getExturl() {
		return this.exturl;
	}
	
	/**
	 * 外部URl,诺亚机构使用
	 */
	public void setExturl(String value)
	 {
		this.exturl = value;
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
	 * 证件号码,诺亚机构使用
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,诺亚机构使用
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,诺亚机构使用
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,诺亚机构使用
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 证件有效期,
	 */
	public String getInvalidate() {
		return this.invalidate;
	}
	
	/**
	 * 证件有效期,
	 */
	public void setInvalidate(String value)
	 {
		this.invalidate = value;
	}
	
	/**
	 * 多账单寄送途径,
	 */
	public String getLongbillway() {
		return this.longbillway;
	}
	
	/**
	 * 多账单寄送途径,
	 */
	public void setLongbillway(String value)
	 {
		this.longbillway = value;
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
	 * 推荐人电话,
	 */
	public String getRecommendphone() {
		return this.recommendphone;
	}
	
	/**
	 * 推荐人电话,
	 */
	public void setRecommendphone(String value)
	 {
		this.recommendphone = value;
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
	 * 经办人证件有效期,
	 */
	public String getTransactorinvalidate() {
		return this.transactorinvalidate;
	}
	
	/**
	 * 经办人证件有效期,
	 */
	public void setTransactorinvalidate(String value)
	 {
		this.transactorinvalidate = value;
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
	 * 委托方式,
	 */
	public String getTrust() {
		return this.trust;
	}
	
	/**
	 * 委托方式,
	 */
	public void setTrust(String value)
	 {
		this.trust = value;
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
	 * 客户网点号,修改投资人开户网点号时使用
	 */
	public Double getAcconetno() {
		return this.acconetno;
	}
	
	/**
	 * 客户网点号,修改投资人开户网点号时使用
	 */
	public void setAcconetno(Double value)
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
	 * 理财师工号,
	 */
	public Double getFundmanagerid() {
		return this.fundmanagerid;
	}
	
	/**
	 * 理财师工号,
	 */
	public void setFundmanagerid(Double value)
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
	 * 合格投资人标识,0：无效，1：有效
	 */
	public String getQualifiedflag() {
		return this.qualifiedflag;
	}
	
	/**
	 * 合格投资人标识,0：无效，1：有效
	 */
	public void setQualifiedflag(String value)
	 {
		this.qualifiedflag = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("datasource", this.datasource);
		inputMap.put("approvalno", this.approvalno);
		inputMap.put("artificialtype", this.artificialtype);
		inputMap.put("investexp", this.investexp);
		inputMap.put("newidcard", this.newidcard);
		inputMap.put("annualsalary", this.annualsalary);
		inputMap.put("artificialinvalidate", this.artificialinvalidate);
		inputMap.put("artificialname", this.artificialname);
		inputMap.put("artificialnumber", this.artificialnumber);
		inputMap.put("belongorgan", this.belongorgan);
		inputMap.put("beneficiary", this.beneficiary);
		inputMap.put("birthday", this.birthday);
		inputMap.put("checkidvalidate", this.checkidvalidate);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("communicationaddr", this.communicationaddr);
		inputMap.put("companyname", this.companyname);
		inputMap.put("custkind", this.custkind);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("customershortname", this.customershortname);
		inputMap.put("educational", this.educational);
		inputMap.put("email", this.email);
		inputMap.put("emoneyfundflag", this.emoneyfundflag);
		inputMap.put("explain", this.explain);
		inputMap.put("extcompany", this.extcompany);
		inputMap.put("exturl", this.exturl);
		inputMap.put("fax", this.fax);
		inputMap.put("handset", this.handset);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("invalidate", this.invalidate);
		inputMap.put("longbillway", this.longbillway);
		inputMap.put("marriage", this.marriage);
		inputMap.put("nationality2", this.nationality2);
		inputMap.put("reckoningmailtype", this.reckoningmailtype);
		inputMap.put("reckoningsendtype", this.reckoningsendtype);
		inputMap.put("recommender", this.recommender);
		inputMap.put("recommendphone", this.recommendphone);
		inputMap.put("reservwords", this.reservwords);
		inputMap.put("specialcode", this.specialcode);
		inputMap.put("telephone", this.telephone);
		inputMap.put("transactorcertinumber", this.transactorcertinumber);
		inputMap.put("transactorcertitype", this.transactorcertitype);
		inputMap.put("transactorinvalidate", this.transactorinvalidate);
		inputMap.put("transactorname", this.transactorname);
		inputMap.put("trust", this.trust);
		inputMap.put("workcode", this.workcode);
		inputMap.put("zipcode", this.zipcode);
		inputMap.put("broker", this.broker);
		inputMap.put("acconetno", this.acconetno.toString());
		inputMap.put("effectdate", this.effectdate.toString());
		inputMap.put("effectenddate", this.effectenddate.toString());
		inputMap.put("fundmanagerid", this.fundmanagerid.toString());
		inputMap.put("fundmanagername", this.fundmanagername);
		inputMap.put("icname", this.icname);
		inputMap.put("icno", this.icno.toString());
		inputMap.put("qualifiedflag", this.qualifiedflag.toString());
	}
}
