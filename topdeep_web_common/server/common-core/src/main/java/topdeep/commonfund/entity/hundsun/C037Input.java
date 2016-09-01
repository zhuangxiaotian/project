package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开户(后台模式)(C037)
 */
public class C037Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,需要包含分行和支行-由用户输入
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,（参考字典：资金方式）
	 */
	private String capitalmode = "";
	
	/**
	 * 客户姓名,
	 */
	private String customerappellation = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String identitytype = "";
	
	/**
	 * 交易密码,输入后需要进行弱密码校验
	 */
	private String tradepassword = "";
	
	/**
	 * 理财师工号,
	 */
	private String fundmanagerid = "";
	
	/**
	 * 理财师姓名,
	 */
	private String fundmanagername = "";
	
	/**
	 * 多选账单寄送方式,8位字符串，第1位：邮寄，第2位：传真，第3位：E-mail，第4位：短消息。每位字符取1表示采用此种手段，取0表示不使用。第5~8位：全部传0
	 */
	private String longbillway = "";
	
	/**
	 * 经办人证件号码,机构必填，个人可不填（当证件类型为无时也可不填）
	 */
	private String transactorcertinumber = "";
	
	/**
	 * 经办人证件类型,机构必填，个人可不填 （0-身份证，1-护照2-军官证，3-士兵证4-回乡证，5-户口本6-外国护照，7-其它8-无）
	 */
	private String transactorcertitype = "";
	
	/**
	 * 经办人姓名,机构必填，个人可不填
	 */
	private String transactorname = "";
	
	/**
	 * 年收入,详见字典项说明（参考字典：年收入）
	 */
	private String annualsalary = "";
	
	/**
	 * 账户实际受益人,
	 */
	private String beneficiary = "";
	
	/**
	 * 联行号,
	 */
	private String brachbank = "";
	
	/**
	 * 学历,详见字典项说明（参考字典：学历）
	 */
	private String educational = "";
	
	/**
	 * 传真号码,
	 */
	private String fax = "";
	
	/**
	 * 基金账号,如果输入基金账号做账户登记处理
	 */
	private String fundacco = "";
	
	/**
	 * 分红方式,详见字典项说明（参考字典：分红方式）
	 */
	private String melonmethod = "";
	
	/**
	 * 预用户标识,1：预用户；其他非预用户
	 */
	private String preuserflag = "";
	
	/**
	 * 活动代码,
	 */
	private String promotion = "";
	
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
	 * TA代码,（参考字典：TA代码）
	 */
	private String tacode = "";
	
	/**
	 * 电话号码,
	 */
	private String telephone = "";
	
	/**
	 * 出生日期,改为非必须
	 */
	private String birthday = "";
	
	/**
	 * 投资人风险承受能力,参考字典《投资人风险承受能力》
	 */
	private String riskability = "";
	
	/**
	 * 明细资金方式,01-表示托收(好易联托收、农行托收、建行BTOB 诺亚平移项目)
	 */
	private String detailcapitalmode;
	
	/**
	 * 法人代表姓名,
	 */
	private String artificialname = "";
	
	/**
	 * 法人证件号码,
	 */
	private String artificialnumber = "";
	
	/**
	 * 法人证件类型,
	 */
	private String artificialtype;
	
	/**
	 * 外部客户编号,
	 */
	private String extcompany = "";
	
	/**
	 * 外部集团编号,
	 */
	private String extcustno = "";
	
	/**
	 * 法人证件有效期,
	 */
	private String instreprrvalidate = "";
	
	/**
	 * 外部URL,一号通开户有用，审批时会过到此URL去查看用户信息
	 */
	private String exturl = "";
	
	/**
	 * 汇款协议号,默认开户支持传01（诺亚）
	 */
	private String remitno = "";
	
	/**
	 * 委托方式,单个或逗号分隔的多个1位数字。取值字典见1013号。注意，字典中取值0、7、8三项暂不支持
	 */
	private String trust = "";
	
	/**
	 * 通讯地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * E-MAIL地址,
	 */
	private String email = "";
	
	/**
	 * 手机,
	 */
	private String handset = "";
	
	/**
	 * 证件有效期,格式为YYYYMMDD
	 */
	private String invalidate = "";
	
	/**
	 * 是否有投资经历,1;有;空:没有;
	 */
	private String investlive = "";
	
	/**
	 * 婚姻,详见字典项说明（参考字典：婚姻）
	 */
	private String marriage = "";
	
	/**
	 * 国籍,详见字典项说明（参考字典：国籍代码）
	 */
	private String nationality2 = "";
	
	/**
	 * 对账单寄送途径,可以选择纸质、电子(E_mail) 详见字典项说明（参考字典：对账单寄送途径）
	 */
	private String reckoningmailtype = "";
	
	/**
	 * 对账单寄送方式,可以选择不寄送、按季 、一年、 详见字典项说明（参考字典：对账单寄送方式）
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
	 * 请求序列号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 微信uid,
	 */
	private String wechatuid = "";
	
	/**
	 * 银行卡实名状态,
	 */
	private String custcardstat = "";
	
	/**
	 * 客户分类,A：灵活型 B：绝对收益型 C：平横型
	 */
	private String customerkind = "";
	
	/**
	 * 客户简称,
	 */
	private String customershortname = "";
	
	/**
	 * 客户实名状态,
	 */
	private String custstat = "";
	
	/**
	 * 说明信息,
	 */
	private String explain = "";
	
	/**
	 * 代扣接口类型,1：支持快捷支付，空：不支持快捷支付
	 */
	private String interfacetype = "";
	
	/**
	 * 所属机构,
	 */
	private String organizationbelongto = "";
	
	/**
	 * 推荐人电话,
	 */
	private String recommenderphone = "";
	
	/**
	 * 银联CD卡号,银行返回的签约协议号(B009返回的签约协议号)。以银行页面返回为准，如果不存在则取此字段
	 */
	private String yinliancdcard = "";
	
	/**
	 * 银行户名,
	 */
	private String bankacconame = "";
	
	/**
	 * 管理员证件号码,机构客户需开管理员子账户时填写
	 */
	private String adminidno = "";
	
	/**
	 * 管理员证件类型,机构客户需开管理员子账户时填写
	 */
	private String adminidtype = "";
	
	/**
	 * 管理员证件有效期,机构客户需开管理员子账户时填写
	 */
	private String admininvalidate = "";
	
	/**
	 * 管理员手机号,机构客户需开管理员子账户时填写
	 */
	private String adminmobile = "";
	
	/**
	 * 管理员姓名,机构客户需开管理员子账户时填写
	 */
	private String adminname = "";
	
	/**
	 * 组织机构代码,机构开户时填写
	 */
	private String agencyno = "";
	
	/**
	 * 企业名称,机构开户时填写
	 */
	private String companyname = "";
	
	/**
	 * 银联标志,银联确认标志，超级现金宝开户时需要传
	 */
	private String cpflag = "";
	
	/**
	 * 注册地址,机构开户时填写
	 */
	private String registaddr = "";
	
	/**
	 * 税务登记证号,机构开户时填写
	 */
	private String taxregno = "";
	
	/**
	 * 交易来源,代销T+0、超级现金宝、直销无密开户必传
	 */
	private String comefrom = "";
	
	/**
	 * 用户类型,超级现金宝要传4
	 */
	private String usrtype = "";
	
	/**
	 * 城市代码,城市代码
	 */
	private String cityno = "";
	
	/**
	 * 开通e通宝标志,1-同时开通e通宝，其他-不同时开通
	 */
	private String emoneyfundflag = "";
	
	/**
	 * 省份代码,省份代码2
	 */
	private String provincecode2 = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 经营范围,
	 */
	private String businessrange = "";
	
	/**
	 * 证件年检有效期,
	 */
	private String checkidvalidate = "";
	
	/**
	 * 经办人证件有效期,机构必填，个人可不填
	 */
	private String contvalidate = "";
	
	/**
	 * 授权书有效期,
	 */
	private String contwarrantvalidate = "";
	
	/**
	 * 企业性质,
	 */
	private String corpropertiy = "";
	
	/**
	 * 县区代码,
	 */
	private String countyno = "";
	
	/**
	 * 注册资本(可编辑),
	 */
	private Double editregistcapital;
	
	/**
	 * 控股股东证件号码,
	 */
	private String holdingidno = "";
	
	/**
	 * 控股股东证件类型,
	 */
	private String holdingidtype;
	
	/**
	 * 控股股东证件有效期,
	 */
	private String holdingidvalidate = "";
	
	/**
	 * 控股股东组织代码证号码,
	 */
	private String holdingorno = "";
	
	/**
	 * 控股股东税务登记证号码,
	 */
	private String holdingtaxno = "";
	
	/**
	 * 控股股东类别,
	 */
	private String holdingtype = "";
	
	/**
	 * 控股股东名称,
	 */
	private String orgholdingname = "";
	
	/**
	 * 银商(行)流水号,
	 */
	private String originapplyserial = "";
	
	/**
	 * 组织代码证有效期,
	 */
	private String ornovalidate = "";
	
	/**
	 * 负责人姓名,
	 */
	private String principalname = "";
	
	/**
	 * 负责人证件号码,
	 */
	private String principalno = "";
	
	/**
	 * 负责人电话,
	 */
	private String principaltelno = "";
	
	/**
	 * 负责人证件类型,
	 */
	private String principaltype;
	
	/**
	 * 负责人证件有效期,
	 */
	private String principalvalidate = "";
	
	/**
	 * 资格证书号码,
	 */
	private String qualificationno = "";
	
	/**
	 * 资格证书类型,
	 */
	private String qualificationtype;
	
	/**
	 * 资格证书有效期,
	 */
	private String qualificationvalidate = "";
	
	/**
	 * 账单收件人姓名,
	 */
	private String recipientsname = "";
	
	/**
	 * 账单收件人证件号码,
	 */
	private String recipientsno = "";
	
	/**
	 * 账单收件人证件类型,
	 */
	private String recipientstype;
	
	/**
	 * 账单收件人证件有效期,
	 */
	private String recipientsvalidate = "";
	
	/**
	 * 税务登记证发证机构,
	 */
	private String taxbodies = "";
	
	/**
	 * 行业,
	 */
	private String tradekind = "";
	
	/**
	 * 经办人证件有效期,机构必填，个人可不填
	 */
	private String transactorcertivalidity = "";
	
	/**
	 * 经办人联系电话,
	 */
	private String transactortelephone = "";
	
	/**
	 * 委托人名称,
	 */
	private String trustclient = "";
	
	/**
	 * 委托人证件号码,
	 */
	private String trustno = "";
	
	/**
	 * 委托人联系电话,
	 */
	private String trustphone = "";
	
	/**
	 * 委托人证件类型,
	 */
	private String trusttype;
	
	/**
	 * 授权委托书有效期,
	 */
	private String warrantyvalidate = "";
	
	/**
	 * 原交易帐号,当直销老用户开超级现金宝交易帐号时需要传入原来的交易账号
	 */
	private String originaltradeacco = "";
	
	/**
	 * 管理员子账户是否能审核,0-无权限，1-有权限
	 */
	private String subcheck = "";
	
	/**
	 * 管理员子账户是否能查询,0-无权限，1-有权限
	 */
	private String subquery = "";
	
	/**
	 * 管理员子账户是否能交易,0-无权限，1-有权限
	 */
	private String subtrade = "";
	
	/**
	 * 开户银行城市代码,
	 */
	private String cityno1 = "";
	
	/**
	 * 开户银行省份代码,
	 */
	private String provincecode = "";
	
	/**
	 * 经办人与申请人关系,
	 */
	private String transactorcontrelation = "";
	
	/**
	 * 初始化参数
	 */
	public C037Input() {
		this.setFunction("C037");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行账号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行名称,需要包含分行和支行-由用户输入
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,需要包含分行和支行-由用户输入
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 资金方式,（参考字典：资金方式）
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,（参考字典：资金方式）
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 客户姓名,
	 */
	public String getCustomerappellation() {
		return this.customerappellation;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustomerappellation(String value)
	 {
		this.customerappellation = value;
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
	
	/**
	 * 交易密码,输入后需要进行弱密码校验
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,输入后需要进行弱密码校验
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
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
	 * 多选账单寄送方式,8位字符串，第1位：邮寄，第2位：传真，第3位：E-mail，第4位：短消息。每位字符取1表示采用此种手段，取0表示不使用。第5~8位：全部传0
	 */
	public String getLongbillway() {
		return this.longbillway;
	}
	
	/**
	 * 多选账单寄送方式,8位字符串，第1位：邮寄，第2位：传真，第3位：E-mail，第4位：短消息。每位字符取1表示采用此种手段，取0表示不使用。第5~8位：全部传0
	 */
	public void setLongbillway(String value)
	 {
		this.longbillway = value;
	}
	
	/**
	 * 经办人证件号码,机构必填，个人可不填（当证件类型为无时也可不填）
	 */
	public String getTransactorcertinumber() {
		return this.transactorcertinumber;
	}
	
	/**
	 * 经办人证件号码,机构必填，个人可不填（当证件类型为无时也可不填）
	 */
	public void setTransactorcertinumber(String value)
	 {
		this.transactorcertinumber = value;
	}
	
	/**
	 * 经办人证件类型,机构必填，个人可不填 （0-身份证，1-护照2-军官证，3-士兵证4-回乡证，5-户口本6-外国护照，7-其它8-无）
	 */
	public String getTransactorcertitype() {
		return this.transactorcertitype;
	}
	
	/**
	 * 经办人证件类型,机构必填，个人可不填 （0-身份证，1-护照2-军官证，3-士兵证4-回乡证，5-户口本6-外国护照，7-其它8-无）
	 */
	public void setTransactorcertitype(String value)
	 {
		this.transactorcertitype = value;
	}
	
	/**
	 * 经办人姓名,机构必填，个人可不填
	 */
	public String getTransactorname() {
		return this.transactorname;
	}
	
	/**
	 * 经办人姓名,机构必填，个人可不填
	 */
	public void setTransactorname(String value)
	 {
		this.transactorname = value;
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
	 * 联行号,
	 */
	public String getBrachbank() {
		return this.brachbank;
	}
	
	/**
	 * 联行号,
	 */
	public void setBrachbank(String value)
	 {
		this.brachbank = value;
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
	 * 基金账号,如果输入基金账号做账户登记处理
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,如果输入基金账号做账户登记处理
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 分红方式,详见字典项说明（参考字典：分红方式）
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,详见字典项说明（参考字典：分红方式）
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 预用户标识,1：预用户；其他非预用户
	 */
	public String getPreuserflag() {
		return this.preuserflag;
	}
	
	/**
	 * 预用户标识,1：预用户；其他非预用户
	 */
	public void setPreuserflag(String value)
	 {
		this.preuserflag = value;
	}
	
	/**
	 * 活动代码,
	 */
	public String getPromotion() {
		return this.promotion;
	}
	
	/**
	 * 活动代码,
	 */
	public void setPromotion(String value)
	 {
		this.promotion = value;
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
	 * TA代码,（参考字典：TA代码）
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,（参考字典：TA代码）
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
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
	 * 出生日期,改为非必须
	 */
	public String getBirthday() {
		return this.birthday;
	}
	
	/**
	 * 出生日期,改为非必须
	 */
	public void setBirthday(String value)
	 {
		this.birthday = value;
	}
	
	/**
	 * 投资人风险承受能力,参考字典《投资人风险承受能力》
	 */
	public String getRiskability() {
		return this.riskability;
	}
	
	/**
	 * 投资人风险承受能力,参考字典《投资人风险承受能力》
	 */
	public void setRiskability(String value)
	 {
		this.riskability = value;
	}
	
	/**
	 * 明细资金方式,01-表示托收(好易联托收、农行托收、建行BTOB 诺亚平移项目)
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,01-表示托收(好易联托收、农行托收、建行BTOB 诺亚平移项目)
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
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
	 * 法人证件号码,
	 */
	public String getArtificialnumber() {
		return this.artificialnumber;
	}
	
	/**
	 * 法人证件号码,
	 */
	public void setArtificialnumber(String value)
	 {
		this.artificialnumber = value;
	}
	
	/**
	 * 法人证件类型,
	 */
	public String getArtificialtype() {
		return this.artificialtype;
	}
	
	/**
	 * 法人证件类型,
	 */
	public void setArtificialtype(String value)
	 {
		this.artificialtype = value;
	}
	
	/**
	 * 外部客户编号,
	 */
	public String getExtcompany() {
		return this.extcompany;
	}
	
	/**
	 * 外部客户编号,
	 */
	public void setExtcompany(String value)
	 {
		this.extcompany = value;
	}
	
	/**
	 * 外部集团编号,
	 */
	public String getExtcustno() {
		return this.extcustno;
	}
	
	/**
	 * 外部集团编号,
	 */
	public void setExtcustno(String value)
	 {
		this.extcustno = value;
	}
	
	/**
	 * 法人证件有效期,
	 */
	public String getInstreprrvalidate() {
		return this.instreprrvalidate;
	}
	
	/**
	 * 法人证件有效期,
	 */
	public void setInstreprrvalidate(String value)
	 {
		this.instreprrvalidate = value;
	}
	
	/**
	 * 外部URL,一号通开户有用，审批时会过到此URL去查看用户信息
	 */
	public String getExturl() {
		return this.exturl;
	}
	
	/**
	 * 外部URL,一号通开户有用，审批时会过到此URL去查看用户信息
	 */
	public void setExturl(String value)
	 {
		this.exturl = value;
	}
	
	/**
	 * 汇款协议号,默认开户支持传01（诺亚）
	 */
	public String getRemitno() {
		return this.remitno;
	}
	
	/**
	 * 汇款协议号,默认开户支持传01（诺亚）
	 */
	public void setRemitno(String value)
	 {
		this.remitno = value;
	}
	
	/**
	 * 委托方式,单个或逗号分隔的多个1位数字。取值字典见1013号。注意，字典中取值0、7、8三项暂不支持
	 */
	public String getTrust() {
		return this.trust;
	}
	
	/**
	 * 委托方式,单个或逗号分隔的多个1位数字。取值字典见1013号。注意，字典中取值0、7、8三项暂不支持
	 */
	public void setTrust(String value)
	 {
		this.trust = value;
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
	 * 证件有效期,格式为YYYYMMDD
	 */
	public String getInvalidate() {
		return this.invalidate;
	}
	
	/**
	 * 证件有效期,格式为YYYYMMDD
	 */
	public void setInvalidate(String value)
	 {
		this.invalidate = value;
	}
	
	/**
	 * 是否有投资经历,1;有;空:没有;
	 */
	public String getInvestlive() {
		return this.investlive;
	}
	
	/**
	 * 是否有投资经历,1;有;空:没有;
	 */
	public void setInvestlive(String value)
	 {
		this.investlive = value;
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
	 * 对账单寄送途径,可以选择纸质、电子(E_mail) 详见字典项说明（参考字典：对账单寄送途径）
	 */
	public String getReckoningmailtype() {
		return this.reckoningmailtype;
	}
	
	/**
	 * 对账单寄送途径,可以选择纸质、电子(E_mail) 详见字典项说明（参考字典：对账单寄送途径）
	 */
	public void setReckoningmailtype(String value)
	 {
		this.reckoningmailtype = value;
	}
	
	/**
	 * 对账单寄送方式,可以选择不寄送、按季 、一年、 详见字典项说明（参考字典：对账单寄送方式）
	 */
	public String getReckoningsendtype() {
		return this.reckoningsendtype;
	}
	
	/**
	 * 对账单寄送方式,可以选择不寄送、按季 、一年、 详见字典项说明（参考字典：对账单寄送方式）
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
	 * 请求序列号,
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 微信uid,
	 */
	public String getWechatuid() {
		return this.wechatuid;
	}
	
	/**
	 * 微信uid,
	 */
	public void setWechatuid(String value)
	 {
		this.wechatuid = value;
	}
	
	/**
	 * 银行卡实名状态,
	 */
	public String getCustcardstat() {
		return this.custcardstat;
	}
	
	/**
	 * 银行卡实名状态,
	 */
	public void setCustcardstat(String value)
	 {
		this.custcardstat = value;
	}
	
	/**
	 * 客户分类,A：灵活型 B：绝对收益型 C：平横型
	 */
	public String getCustomerkind() {
		return this.customerkind;
	}
	
	/**
	 * 客户分类,A：灵活型 B：绝对收益型 C：平横型
	 */
	public void setCustomerkind(String value)
	 {
		this.customerkind = value;
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
	 * 客户实名状态,
	 */
	public String getCuststat() {
		return this.custstat;
	}
	
	/**
	 * 客户实名状态,
	 */
	public void setCuststat(String value)
	 {
		this.custstat = value;
	}
	
	/**
	 * 说明信息,
	 */
	public String getExplain() {
		return this.explain;
	}
	
	/**
	 * 说明信息,
	 */
	public void setExplain(String value)
	 {
		this.explain = value;
	}
	
	/**
	 * 代扣接口类型,1：支持快捷支付，空：不支持快捷支付
	 */
	public String getInterfacetype() {
		return this.interfacetype;
	}
	
	/**
	 * 代扣接口类型,1：支持快捷支付，空：不支持快捷支付
	 */
	public void setInterfacetype(String value)
	 {
		this.interfacetype = value;
	}
	
	/**
	 * 所属机构,
	 */
	public String getOrganizationbelongto() {
		return this.organizationbelongto;
	}
	
	/**
	 * 所属机构,
	 */
	public void setOrganizationbelongto(String value)
	 {
		this.organizationbelongto = value;
	}
	
	/**
	 * 推荐人电话,
	 */
	public String getRecommenderphone() {
		return this.recommenderphone;
	}
	
	/**
	 * 推荐人电话,
	 */
	public void setRecommenderphone(String value)
	 {
		this.recommenderphone = value;
	}
	
	/**
	 * 银联CD卡号,银行返回的签约协议号(B009返回的签约协议号)。以银行页面返回为准，如果不存在则取此字段
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联CD卡号,银行返回的签约协议号(B009返回的签约协议号)。以银行页面返回为准，如果不存在则取此字段
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
	
	/**
	 * 银行户名,
	 */
	public String getBankacconame() {
		return this.bankacconame;
	}
	
	/**
	 * 银行户名,
	 */
	public void setBankacconame(String value)
	 {
		this.bankacconame = value;
	}
	
	/**
	 * 管理员证件号码,机构客户需开管理员子账户时填写
	 */
	public String getAdminidno() {
		return this.adminidno;
	}
	
	/**
	 * 管理员证件号码,机构客户需开管理员子账户时填写
	 */
	public void setAdminidno(String value)
	 {
		this.adminidno = value;
	}
	
	/**
	 * 管理员证件类型,机构客户需开管理员子账户时填写
	 */
	public String getAdminidtype() {
		return this.adminidtype;
	}
	
	/**
	 * 管理员证件类型,机构客户需开管理员子账户时填写
	 */
	public void setAdminidtype(String value)
	 {
		this.adminidtype = value;
	}
	
	/**
	 * 管理员证件有效期,机构客户需开管理员子账户时填写
	 */
	public String getAdmininvalidate() {
		return this.admininvalidate;
	}
	
	/**
	 * 管理员证件有效期,机构客户需开管理员子账户时填写
	 */
	public void setAdmininvalidate(String value)
	 {
		this.admininvalidate = value;
	}
	
	/**
	 * 管理员手机号,机构客户需开管理员子账户时填写
	 */
	public String getAdminmobile() {
		return this.adminmobile;
	}
	
	/**
	 * 管理员手机号,机构客户需开管理员子账户时填写
	 */
	public void setAdminmobile(String value)
	 {
		this.adminmobile = value;
	}
	
	/**
	 * 管理员姓名,机构客户需开管理员子账户时填写
	 */
	public String getAdminname() {
		return this.adminname;
	}
	
	/**
	 * 管理员姓名,机构客户需开管理员子账户时填写
	 */
	public void setAdminname(String value)
	 {
		this.adminname = value;
	}
	
	/**
	 * 组织机构代码,机构开户时填写
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 组织机构代码,机构开户时填写
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 企业名称,机构开户时填写
	 */
	public String getCompanyname() {
		return this.companyname;
	}
	
	/**
	 * 企业名称,机构开户时填写
	 */
	public void setCompanyname(String value)
	 {
		this.companyname = value;
	}
	
	/**
	 * 银联标志,银联确认标志，超级现金宝开户时需要传
	 */
	public String getCpflag() {
		return this.cpflag;
	}
	
	/**
	 * 银联标志,银联确认标志，超级现金宝开户时需要传
	 */
	public void setCpflag(String value)
	 {
		this.cpflag = value;
	}
	
	/**
	 * 注册地址,机构开户时填写
	 */
	public String getRegistaddr() {
		return this.registaddr;
	}
	
	/**
	 * 注册地址,机构开户时填写
	 */
	public void setRegistaddr(String value)
	 {
		this.registaddr = value;
	}
	
	/**
	 * 税务登记证号,机构开户时填写
	 */
	public String getTaxregno() {
		return this.taxregno;
	}
	
	/**
	 * 税务登记证号,机构开户时填写
	 */
	public void setTaxregno(String value)
	 {
		this.taxregno = value;
	}
	
	/**
	 * 交易来源,代销T+0、超级现金宝、直销无密开户必传
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,代销T+0、超级现金宝、直销无密开户必传
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 用户类型,超级现金宝要传4
	 */
	public String getUsrtype() {
		return this.usrtype;
	}
	
	/**
	 * 用户类型,超级现金宝要传4
	 */
	public void setUsrtype(String value)
	 {
		this.usrtype = value;
	}
	
	/**
	 * 城市代码,城市代码
	 */
	public String getCityno() {
		return this.cityno;
	}
	
	/**
	 * 城市代码,城市代码
	 */
	public void setCityno(String value)
	 {
		this.cityno = value;
	}
	
	/**
	 * 开通e通宝标志,1-同时开通e通宝，其他-不同时开通
	 */
	public String getEmoneyfundflag() {
		return this.emoneyfundflag;
	}
	
	/**
	 * 开通e通宝标志,1-同时开通e通宝，其他-不同时开通
	 */
	public void setEmoneyfundflag(String value)
	 {
		this.emoneyfundflag = value;
	}
	
	/**
	 * 省份代码,省份代码2
	 */
	public String getProvincecode2() {
		return this.provincecode2;
	}
	
	/**
	 * 省份代码,省份代码2
	 */
	public void setProvincecode2(String value)
	 {
		this.provincecode2 = value;
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
	 * 经营范围,
	 */
	public String getBusinessrange() {
		return this.businessrange;
	}
	
	/**
	 * 经营范围,
	 */
	public void setBusinessrange(String value)
	 {
		this.businessrange = value;
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
	 * 经办人证件有效期,机构必填，个人可不填
	 */
	public String getContvalidate() {
		return this.contvalidate;
	}
	
	/**
	 * 经办人证件有效期,机构必填，个人可不填
	 */
	public void setContvalidate(String value)
	 {
		this.contvalidate = value;
	}
	
	/**
	 * 授权书有效期,
	 */
	public String getContwarrantvalidate() {
		return this.contwarrantvalidate;
	}
	
	/**
	 * 授权书有效期,
	 */
	public void setContwarrantvalidate(String value)
	 {
		this.contwarrantvalidate = value;
	}
	
	/**
	 * 企业性质,
	 */
	public String getCorpropertiy() {
		return this.corpropertiy;
	}
	
	/**
	 * 企业性质,
	 */
	public void setCorpropertiy(String value)
	 {
		this.corpropertiy = value;
	}
	
	/**
	 * 县区代码,
	 */
	public String getCountyno() {
		return this.countyno;
	}
	
	/**
	 * 县区代码,
	 */
	public void setCountyno(String value)
	 {
		this.countyno = value;
	}
	
	/**
	 * 注册资本(可编辑),
	 */
	public Double getEditregistcapital() {
		return this.editregistcapital;
	}
	
	/**
	 * 注册资本(可编辑),
	 */
	public void setEditregistcapital(Double value)
	 {
		this.editregistcapital = value;
	}
	
	/**
	 * 控股股东证件号码,
	 */
	public String getHoldingidno() {
		return this.holdingidno;
	}
	
	/**
	 * 控股股东证件号码,
	 */
	public void setHoldingidno(String value)
	 {
		this.holdingidno = value;
	}
	
	/**
	 * 控股股东证件类型,
	 */
	public String getHoldingidtype() {
		return this.holdingidtype;
	}
	
	/**
	 * 控股股东证件类型,
	 */
	public void setHoldingidtype(String value)
	 {
		this.holdingidtype = value;
	}
	
	/**
	 * 控股股东证件有效期,
	 */
	public String getHoldingidvalidate() {
		return this.holdingidvalidate;
	}
	
	/**
	 * 控股股东证件有效期,
	 */
	public void setHoldingidvalidate(String value)
	 {
		this.holdingidvalidate = value;
	}
	
	/**
	 * 控股股东组织代码证号码,
	 */
	public String getHoldingorno() {
		return this.holdingorno;
	}
	
	/**
	 * 控股股东组织代码证号码,
	 */
	public void setHoldingorno(String value)
	 {
		this.holdingorno = value;
	}
	
	/**
	 * 控股股东税务登记证号码,
	 */
	public String getHoldingtaxno() {
		return this.holdingtaxno;
	}
	
	/**
	 * 控股股东税务登记证号码,
	 */
	public void setHoldingtaxno(String value)
	 {
		this.holdingtaxno = value;
	}
	
	/**
	 * 控股股东类别,
	 */
	public String getHoldingtype() {
		return this.holdingtype;
	}
	
	/**
	 * 控股股东类别,
	 */
	public void setHoldingtype(String value)
	 {
		this.holdingtype = value;
	}
	
	/**
	 * 控股股东名称,
	 */
	public String getOrgholdingname() {
		return this.orgholdingname;
	}
	
	/**
	 * 控股股东名称,
	 */
	public void setOrgholdingname(String value)
	 {
		this.orgholdingname = value;
	}
	
	/**
	 * 银商(行)流水号,
	 */
	public String getOriginapplyserial() {
		return this.originapplyserial;
	}
	
	/**
	 * 银商(行)流水号,
	 */
	public void setOriginapplyserial(String value)
	 {
		this.originapplyserial = value;
	}
	
	/**
	 * 组织代码证有效期,
	 */
	public String getOrnovalidate() {
		return this.ornovalidate;
	}
	
	/**
	 * 组织代码证有效期,
	 */
	public void setOrnovalidate(String value)
	 {
		this.ornovalidate = value;
	}
	
	/**
	 * 负责人姓名,
	 */
	public String getPrincipalname() {
		return this.principalname;
	}
	
	/**
	 * 负责人姓名,
	 */
	public void setPrincipalname(String value)
	 {
		this.principalname = value;
	}
	
	/**
	 * 负责人证件号码,
	 */
	public String getPrincipalno() {
		return this.principalno;
	}
	
	/**
	 * 负责人证件号码,
	 */
	public void setPrincipalno(String value)
	 {
		this.principalno = value;
	}
	
	/**
	 * 负责人电话,
	 */
	public String getPrincipaltelno() {
		return this.principaltelno;
	}
	
	/**
	 * 负责人电话,
	 */
	public void setPrincipaltelno(String value)
	 {
		this.principaltelno = value;
	}
	
	/**
	 * 负责人证件类型,
	 */
	public String getPrincipaltype() {
		return this.principaltype;
	}
	
	/**
	 * 负责人证件类型,
	 */
	public void setPrincipaltype(String value)
	 {
		this.principaltype = value;
	}
	
	/**
	 * 负责人证件有效期,
	 */
	public String getPrincipalvalidate() {
		return this.principalvalidate;
	}
	
	/**
	 * 负责人证件有效期,
	 */
	public void setPrincipalvalidate(String value)
	 {
		this.principalvalidate = value;
	}
	
	/**
	 * 资格证书号码,
	 */
	public String getQualificationno() {
		return this.qualificationno;
	}
	
	/**
	 * 资格证书号码,
	 */
	public void setQualificationno(String value)
	 {
		this.qualificationno = value;
	}
	
	/**
	 * 资格证书类型,
	 */
	public String getQualificationtype() {
		return this.qualificationtype;
	}
	
	/**
	 * 资格证书类型,
	 */
	public void setQualificationtype(String value)
	 {
		this.qualificationtype = value;
	}
	
	/**
	 * 资格证书有效期,
	 */
	public String getQualificationvalidate() {
		return this.qualificationvalidate;
	}
	
	/**
	 * 资格证书有效期,
	 */
	public void setQualificationvalidate(String value)
	 {
		this.qualificationvalidate = value;
	}
	
	/**
	 * 账单收件人姓名,
	 */
	public String getRecipientsname() {
		return this.recipientsname;
	}
	
	/**
	 * 账单收件人姓名,
	 */
	public void setRecipientsname(String value)
	 {
		this.recipientsname = value;
	}
	
	/**
	 * 账单收件人证件号码,
	 */
	public String getRecipientsno() {
		return this.recipientsno;
	}
	
	/**
	 * 账单收件人证件号码,
	 */
	public void setRecipientsno(String value)
	 {
		this.recipientsno = value;
	}
	
	/**
	 * 账单收件人证件类型,
	 */
	public String getRecipientstype() {
		return this.recipientstype;
	}
	
	/**
	 * 账单收件人证件类型,
	 */
	public void setRecipientstype(String value)
	 {
		this.recipientstype = value;
	}
	
	/**
	 * 账单收件人证件有效期,
	 */
	public String getRecipientsvalidate() {
		return this.recipientsvalidate;
	}
	
	/**
	 * 账单收件人证件有效期,
	 */
	public void setRecipientsvalidate(String value)
	 {
		this.recipientsvalidate = value;
	}
	
	/**
	 * 税务登记证发证机构,
	 */
	public String getTaxbodies() {
		return this.taxbodies;
	}
	
	/**
	 * 税务登记证发证机构,
	 */
	public void setTaxbodies(String value)
	 {
		this.taxbodies = value;
	}
	
	/**
	 * 行业,
	 */
	public String getTradekind() {
		return this.tradekind;
	}
	
	/**
	 * 行业,
	 */
	public void setTradekind(String value)
	 {
		this.tradekind = value;
	}
	
	/**
	 * 经办人证件有效期,机构必填，个人可不填
	 */
	public String getTransactorcertivalidity() {
		return this.transactorcertivalidity;
	}
	
	/**
	 * 经办人证件有效期,机构必填，个人可不填
	 */
	public void setTransactorcertivalidity(String value)
	 {
		this.transactorcertivalidity = value;
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
	 * 委托人名称,
	 */
	public String getTrustclient() {
		return this.trustclient;
	}
	
	/**
	 * 委托人名称,
	 */
	public void setTrustclient(String value)
	 {
		this.trustclient = value;
	}
	
	/**
	 * 委托人证件号码,
	 */
	public String getTrustno() {
		return this.trustno;
	}
	
	/**
	 * 委托人证件号码,
	 */
	public void setTrustno(String value)
	 {
		this.trustno = value;
	}
	
	/**
	 * 委托人联系电话,
	 */
	public String getTrustphone() {
		return this.trustphone;
	}
	
	/**
	 * 委托人联系电话,
	 */
	public void setTrustphone(String value)
	 {
		this.trustphone = value;
	}
	
	/**
	 * 委托人证件类型,
	 */
	public String getTrusttype() {
		return this.trusttype;
	}
	
	/**
	 * 委托人证件类型,
	 */
	public void setTrusttype(String value)
	 {
		this.trusttype = value;
	}
	
	/**
	 * 授权委托书有效期,
	 */
	public String getWarrantyvalidate() {
		return this.warrantyvalidate;
	}
	
	/**
	 * 授权委托书有效期,
	 */
	public void setWarrantyvalidate(String value)
	 {
		this.warrantyvalidate = value;
	}
	
	/**
	 * 原交易帐号,当直销老用户开超级现金宝交易帐号时需要传入原来的交易账号
	 */
	public String getOriginaltradeacco() {
		return this.originaltradeacco;
	}
	
	/**
	 * 原交易帐号,当直销老用户开超级现金宝交易帐号时需要传入原来的交易账号
	 */
	public void setOriginaltradeacco(String value)
	 {
		this.originaltradeacco = value;
	}
	
	/**
	 * 管理员子账户是否能审核,0-无权限，1-有权限
	 */
	public String getSubcheck() {
		return this.subcheck;
	}
	
	/**
	 * 管理员子账户是否能审核,0-无权限，1-有权限
	 */
	public void setSubcheck(String value)
	 {
		this.subcheck = value;
	}
	
	/**
	 * 管理员子账户是否能查询,0-无权限，1-有权限
	 */
	public String getSubquery() {
		return this.subquery;
	}
	
	/**
	 * 管理员子账户是否能查询,0-无权限，1-有权限
	 */
	public void setSubquery(String value)
	 {
		this.subquery = value;
	}
	
	/**
	 * 管理员子账户是否能交易,0-无权限，1-有权限
	 */
	public String getSubtrade() {
		return this.subtrade;
	}
	
	/**
	 * 管理员子账户是否能交易,0-无权限，1-有权限
	 */
	public void setSubtrade(String value)
	 {
		this.subtrade = value;
	}
	
	/**
	 * 开户银行城市代码,
	 */
	public String getCityno1() {
		return this.cityno1;
	}
	
	/**
	 * 开户银行城市代码,
	 */
	public void setCityno1(String value)
	 {
		this.cityno1 = value;
	}
	
	/**
	 * 开户银行省份代码,
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 开户银行省份代码,
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankname", this.bankname);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("fundmanagerid", this.fundmanagerid);
		inputMap.put("fundmanagername", this.fundmanagername);
		inputMap.put("longbillway", this.longbillway);
		inputMap.put("transactorcertinumber", this.transactorcertinumber);
		inputMap.put("transactorcertitype", this.transactorcertitype);
		inputMap.put("transactorname", this.transactorname);
		inputMap.put("annualsalary", this.annualsalary);
		inputMap.put("beneficiary", this.beneficiary);
		inputMap.put("brachbank", this.brachbank);
		inputMap.put("educational", this.educational);
		inputMap.put("fax", this.fax);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("melonmethod", this.melonmethod);
		inputMap.put("preuserflag", this.preuserflag);
		inputMap.put("promotion", this.promotion);
		inputMap.put("recommender", this.recommender);
		inputMap.put("reservwords", this.reservwords);
		inputMap.put("specialcode", this.specialcode);
		inputMap.put("tacode", this.tacode);
		inputMap.put("telephone", this.telephone);
		inputMap.put("birthday", this.birthday);
		inputMap.put("riskability", this.riskability);
		inputMap.put("detailcapitalmode", this.detailcapitalmode.toString());
		inputMap.put("artificialname", this.artificialname);
		inputMap.put("artificialnumber", this.artificialnumber);
		inputMap.put("artificialtype", this.artificialtype.toString());
		inputMap.put("extcompany", this.extcompany);
		inputMap.put("extcustno", this.extcustno);
		inputMap.put("instreprrvalidate", this.instreprrvalidate);
		inputMap.put("exturl", this.exturl);
		inputMap.put("remitno", this.remitno);
		inputMap.put("trust", this.trust);
		inputMap.put("communicationaddr", this.communicationaddr);
		inputMap.put("email", this.email);
		inputMap.put("handset", this.handset);
		inputMap.put("invalidate", this.invalidate);
		inputMap.put("investlive", this.investlive);
		inputMap.put("marriage", this.marriage);
		inputMap.put("nationality2", this.nationality2);
		inputMap.put("reckoningmailtype", this.reckoningmailtype);
		inputMap.put("reckoningsendtype", this.reckoningsendtype);
		inputMap.put("sex", this.sex);
		inputMap.put("workcode", this.workcode);
		inputMap.put("zipcode", this.zipcode);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("wechatuid", this.wechatuid);
		inputMap.put("custcardstat", this.custcardstat);
		inputMap.put("customerkind", this.customerkind);
		inputMap.put("customershortname", this.customershortname);
		inputMap.put("custstat", this.custstat);
		inputMap.put("explain", this.explain);
		inputMap.put("interfacetype", this.interfacetype);
		inputMap.put("organizationbelongto", this.organizationbelongto);
		inputMap.put("recommenderphone", this.recommenderphone);
		inputMap.put("yinliancdcard", this.yinliancdcard);
		inputMap.put("bankacconame", this.bankacconame);
		inputMap.put("adminidno", this.adminidno);
		inputMap.put("adminidtype", this.adminidtype);
		inputMap.put("admininvalidate", this.admininvalidate);
		inputMap.put("adminmobile", this.adminmobile);
		inputMap.put("adminname", this.adminname);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("companyname", this.companyname);
		inputMap.put("cpflag", this.cpflag);
		inputMap.put("registaddr", this.registaddr);
		inputMap.put("taxregno", this.taxregno);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("usrtype", this.usrtype);
		inputMap.put("cityno", this.cityno);
		inputMap.put("emoneyfundflag", this.emoneyfundflag);
		inputMap.put("provincecode2", this.provincecode2);
		inputMap.put("broker", this.broker);
		inputMap.put("businessrange", this.businessrange);
		inputMap.put("checkidvalidate", this.checkidvalidate);
		inputMap.put("contvalidate", this.contvalidate);
		inputMap.put("contwarrantvalidate", this.contwarrantvalidate);
		inputMap.put("corpropertiy", this.corpropertiy);
		inputMap.put("countyno", this.countyno);
		inputMap.put("editregistcapital", this.formatDecimal(this.editregistcapital));
		inputMap.put("holdingidno", this.holdingidno);
		inputMap.put("holdingidtype", this.holdingidtype.toString());
		inputMap.put("holdingidvalidate", this.holdingidvalidate);
		inputMap.put("holdingorno", this.holdingorno);
		inputMap.put("holdingtaxno", this.holdingtaxno);
		inputMap.put("holdingtype", this.holdingtype);
		inputMap.put("orgholdingname", this.orgholdingname);
		inputMap.put("originapplyserial", this.originapplyserial);
		inputMap.put("ornovalidate", this.ornovalidate);
		inputMap.put("principalname", this.principalname);
		inputMap.put("principalno", this.principalno);
		inputMap.put("principaltelno", this.principaltelno);
		inputMap.put("principaltype", this.principaltype.toString());
		inputMap.put("principalvalidate", this.principalvalidate);
		inputMap.put("qualificationno", this.qualificationno);
		inputMap.put("qualificationtype", this.qualificationtype.toString());
		inputMap.put("qualificationvalidate", this.qualificationvalidate);
		inputMap.put("recipientsname", this.recipientsname);
		inputMap.put("recipientsno", this.recipientsno);
		inputMap.put("recipientstype", this.recipientstype.toString());
		inputMap.put("recipientsvalidate", this.recipientsvalidate);
		inputMap.put("taxbodies", this.taxbodies);
		inputMap.put("tradekind", this.tradekind);
		inputMap.put("transactorcertivalidity", this.transactorcertivalidity);
		inputMap.put("transactortelephone", this.transactortelephone);
		inputMap.put("trustclient", this.trustclient);
		inputMap.put("trustno", this.trustno);
		inputMap.put("trustphone", this.trustphone);
		inputMap.put("trusttype", this.trusttype.toString());
		inputMap.put("warrantyvalidate", this.warrantyvalidate);
		inputMap.put("originaltradeacco", this.originaltradeacco);
		inputMap.put("subcheck", this.subcheck);
		inputMap.put("subquery", this.subquery);
		inputMap.put("subtrade", this.subtrade);
		inputMap.put("cityno1", this.cityno1);
		inputMap.put("provincecode", this.provincecode);
		inputMap.put("transactorcontrelation", this.transactorcontrelation);
	}
}
