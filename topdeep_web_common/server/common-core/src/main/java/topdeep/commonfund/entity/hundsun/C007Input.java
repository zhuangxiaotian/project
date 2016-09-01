package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开户(C007)
 */
public class C007Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 请求序列号,使用C002接口中返回的请求序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 银行名称,需要包含分行和支行-由用户输入
	 */
	private String bankname = "";
	
	/**
	 * 通讯地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * 客户姓名,
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
	 * 证件有效期,格式为YYYYMMDD
	 */
	private String invalidate = "";
	
	/**
	 * 是否有投资经历,1;有;空:没有;
	 */
	private String investlive = "";
	
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
	 * 交易密码,输入后需要进行弱密码校验
	 */
	private String tradepassword = "";
	
	/**
	 * 职业,详见字典项说明（参考字典：职业）
	 */
	private String workcode = "";
	
	/**
	 * 邮政编码,
	 */
	private String zipcode = "";
	
	/**
	 * 开通e通宝标志,1-同时开通e通宝，其他-不同时开通
	 */
	private String emoneyfundflag = "";
	
	/**
	 * 年收入,详见字典项说明（参考字典：年收入）
	 */
	private String annualsalary = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 账户实际受益人,
	 */
	private String beneficiary = "";
	
	/**
	 * 资金方式,（参考字典：资金方式）
	 */
	private String capitalmode = "";
	
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
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String identitytype = "";
	
	/**
	 * 婚姻,详见字典项说明（参考字典：婚姻）
	 */
	private String marriage = "";
	
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
	 * 联行号,
	 */
	private String brachbank = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 银联标志,
	 */
	private String cpflag = "";
	
	/**
	 * 银行卡实名状态,
	 */
	private String custcardstat = "";
	
	/**
	 * 客户实名状态,
	 */
	private String custstat = "";
	
	/**
	 * 用户类型,
	 */
	private String usrtype = "";
	
	/**
	 * 银联CD卡号,银行返回的签约协议号(B009返回的签约协议号)。以银行页面返回为准，如果不存在则取此字段
	 */
	private String yinliancdcard = "";
	
	/**
	 * 客户分类,A：灵活型 B：绝对收益型 C：平横型
	 */
	private String customerkind = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 代扣接口类型,当interfacetype为1时，判断是否有支持工行快捷支付，如不支持，返回错误
	 */
	private String interfacetype = "";
	
	/**
	 * 出生日期,改为非必须
	 */
	private String birthday = "";
	
	/**
	 * 推荐人电话,
	 */
	private String recommenderphone = "";
	
	/**
	 * 明细资金方式,
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 是否允许信息共享,
	 */
	private String msgsendtype = "";
	
	/**
	 * 经办人手机号码,
	 */
	private String contmobileno = "";
	
	/**
	 * 经办人证件有效期,
	 */
	private String contvalidate = "";
	
	/**
	 * 经办人证件号码,
	 */
	private String transactorcertinumber = "";
	
	/**
	 * 经办人证件类型,
	 */
	private String transactorcertitype = "";
	
	/**
	 * 经办人EMAIL,
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
	 * 经办人与申请人关系,
	 */
	private String transactorcontrelation = "";
	
	/**
	 * 初始化参数
	 */
	public C007Input() {
		this.setFunction("C007");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 请求序列号,使用C002接口中返回的请求序列号
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,使用C002接口中返回的请求序列号
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
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
	 * 银联标志,
	 */
	public String getCpflag() {
		return this.cpflag;
	}
	
	/**
	 * 银联标志,
	 */
	public void setCpflag(String value)
	 {
		this.cpflag = value;
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
	 * 用户类型,
	 */
	public String getUsrtype() {
		return this.usrtype;
	}
	
	/**
	 * 用户类型,
	 */
	public void setUsrtype(String value)
	 {
		this.usrtype = value;
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
	 * 交易经办人,
	 */
	public String getTradecontact() {
		return this.tradecontact;
	}
	
	/**
	 * 交易经办人,
	 */
	public void setTradecontact(String value)
	 {
		this.tradecontact = value;
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
	 * 代扣接口类型,当interfacetype为1时，判断是否有支持工行快捷支付，如不支持，返回错误
	 */
	public String getInterfacetype() {
		return this.interfacetype;
	}
	
	/**
	 * 代扣接口类型,当interfacetype为1时，判断是否有支持工行快捷支付，如不支持，返回错误
	 */
	public void setInterfacetype(String value)
	 {
		this.interfacetype = value;
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
	 * 明细资金方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
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
	 * 经办人EMAIL,
	 */
	public String getTransactoremail() {
		return this.transactoremail;
	}
	
	/**
	 * 经办人EMAIL,
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
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("bankname", this.bankname);
		inputMap.put("communicationaddr", this.communicationaddr);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("email", this.email);
		inputMap.put("handset", this.handset);
		inputMap.put("invalidate", this.invalidate);
		inputMap.put("investlive", this.investlive);
		inputMap.put("nationality2", this.nationality2);
		inputMap.put("reckoningmailtype", this.reckoningmailtype);
		inputMap.put("reckoningsendtype", this.reckoningsendtype);
		inputMap.put("sex", this.sex);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("workcode", this.workcode);
		inputMap.put("zipcode", this.zipcode);
		inputMap.put("emoneyfundflag", this.emoneyfundflag);
		inputMap.put("annualsalary", this.annualsalary);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("beneficiary", this.beneficiary);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("educational", this.educational);
		inputMap.put("fax", this.fax);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("marriage", this.marriage);
		inputMap.put("melonmethod", this.melonmethod);
		inputMap.put("preuserflag", this.preuserflag);
		inputMap.put("promotion", this.promotion);
		inputMap.put("recommender", this.recommender);
		inputMap.put("reservwords", this.reservwords);
		inputMap.put("specialcode", this.specialcode);
		inputMap.put("tacode", this.tacode);
		inputMap.put("telephone", this.telephone);
		inputMap.put("brachbank", this.brachbank);
		inputMap.put("broker", this.broker);
		inputMap.put("cpflag", this.cpflag);
		inputMap.put("custcardstat", this.custcardstat);
		inputMap.put("custstat", this.custstat);
		inputMap.put("usrtype", this.usrtype);
		inputMap.put("yinliancdcard", this.yinliancdcard);
		inputMap.put("customerkind", this.customerkind);
		inputMap.put("tradecontact", this.tradecontact);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("interfacetype", this.interfacetype);
		inputMap.put("birthday", this.birthday);
		inputMap.put("recommenderphone", this.recommenderphone);
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("msgsendtype", this.msgsendtype);
		inputMap.put("contmobileno", this.contmobileno);
		inputMap.put("contvalidate", this.contvalidate);
		inputMap.put("transactorcertinumber", this.transactorcertinumber);
		inputMap.put("transactorcertitype", this.transactorcertitype);
		inputMap.put("transactoremail", this.transactoremail);
		inputMap.put("transactorname", this.transactorname);
		inputMap.put("transactortelephone", this.transactortelephone);
		inputMap.put("transactorcontrelation", this.transactorcontrelation);
	}
}
