package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改用户信息(C011)
 */
public class C011Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 审批单号,
	 */
	private String approvalno = "";
	
	/**
	 * 外部URl,
	 */
	private String exturl = "";
	
	/**
	 * 推荐人电话,
	 */
	private String recommendphone = "";
	
	/**
	 * 数据源,DS:直销;DC:数据中心
	 */
	private String datasource = "";
	
	/**
	 * 是否有投资经历,1;有;0:没有;不传:不修改
	 */
	private String investexp = "";
	
	/**
	 * 交易密码,不登陆时必填，但交易来源为直销允许无密码的特殊交易来源时，可以不传
	 */
	private String tradepassword = "";
	
	/**
	 * 性别,
	 */
	private String sex = "";
	
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
	 * 升级后的身份证号,
	 */
	private String newidcard = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
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
	 * 年收入,详见字典项说明（参考字典：年收入）
	 */
	private String annualsalary = "";
	
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
	private String birthday = "";
	
	/**
	 * 经办人代码,
	 */
	private String broker = "";
	
	/**
	 * 通讯地址,
	 */
	private String communicationaddr = "";
	
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
	 * 备注,
	 */
	private String explain = "";
	
	/**
	 * 传真号码,
	 */
	private String fax = "";
	
	/**
	 * 手机,
	 */
	private String handset = "";
	
	/**
	 * 证件有效期,
	 */
	private String invalidate = "";
	
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
	 * 职业,详见字典项说明（参考字典：职业）
	 */
	private String workcode = "";
	
	/**
	 * 邮政编码,
	 */
	private String zipcode = "";
	
	/**
	 * 委托方式,
	 */
	private String trust = "";
	
	/**
	 * 城市代码,
	 */
	private String cityno = "";
	
	/**
	 * 区县代码,
	 */
	private String countyno = "";
	
	/**
	 * 省份代码,
	 */
	private String provincecode = "";
	
	/**
	 * 是否允许信息共享,
	 */
	private String msgsendtype = "";
	
	/**
	 * 超级现金宝交易账号,
	 */
	private String supermoneyfundtradeacco = "";
	
	/**
	 * 客户网点号,
	 */
	private String acconetno = "";
	
	/**
	 * 初始化参数
	 */
	public C011Input() {
		this.setFunction("C011");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 审批单号,
	 */
	public String getApprovalno() {
		return this.approvalno;
	}
	
	/**
	 * 审批单号,
	 */
	public void setApprovalno(String value)
	 {
		this.approvalno = value;
	}
	
	/**
	 * 外部URl,
	 */
	public String getExturl() {
		return this.exturl;
	}
	
	/**
	 * 外部URl,
	 */
	public void setExturl(String value)
	 {
		this.exturl = value;
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
	 * 交易密码,不登陆时必填，但交易来源为直销允许无密码的特殊交易来源时，可以不传
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,不登陆时必填，但交易来源为直销允许无密码的特殊交易来源时，可以不传
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
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
	 * 经办人代码,
	 */
	public String getBroker() {
		return this.broker;
	}
	
	/**
	 * 经办人代码,
	 */
	public void setBroker(String value)
	 {
		this.broker = value;
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
	 * 城市代码,
	 */
	public String getCityno() {
		return this.cityno;
	}
	
	/**
	 * 城市代码,
	 */
	public void setCityno(String value)
	 {
		this.cityno = value;
	}
	
	/**
	 * 区县代码,
	 */
	public String getCountyno() {
		return this.countyno;
	}
	
	/**
	 * 区县代码,
	 */
	public void setCountyno(String value)
	 {
		this.countyno = value;
	}
	
	/**
	 * 省份代码,
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 省份代码,
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
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
	 * 超级现金宝交易账号,
	 */
	public String getSupermoneyfundtradeacco() {
		return this.supermoneyfundtradeacco;
	}
	
	/**
	 * 超级现金宝交易账号,
	 */
	public void setSupermoneyfundtradeacco(String value)
	 {
		this.supermoneyfundtradeacco = value;
	}
	
	/**
	 * 客户网点号,
	 */
	public String getAcconetno() {
		return this.acconetno;
	}
	
	/**
	 * 客户网点号,
	 */
	public void setAcconetno(String value)
	 {
		this.acconetno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("approvalno", this.approvalno);
		inputMap.put("exturl", this.exturl);
		inputMap.put("recommendphone", this.recommendphone);
		inputMap.put("datasource", this.datasource);
		inputMap.put("investexp", this.investexp);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("sex", this.sex);
		inputMap.put("emoneyfundflag", this.emoneyfundflag.toString());
		inputMap.put("extcompany", this.extcompany);
		inputMap.put("extcustno", this.extcustno);
		inputMap.put("newidcard", this.newidcard);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("fundmanagerid", this.fundmanagerid);
		inputMap.put("fundmanagername", this.fundmanagername);
		inputMap.put("longbillway", this.longbillway);
		inputMap.put("moneysource", this.moneysource.toString());
		inputMap.put("annualsalary", this.annualsalary);
		inputMap.put("belongorgan", this.belongorgan);
		inputMap.put("beneficiary", this.beneficiary);
		inputMap.put("birthday", this.birthday);
		inputMap.put("broker", this.broker);
		inputMap.put("communicationaddr", this.communicationaddr);
		inputMap.put("custkind", this.custkind);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("customershortname", this.customershortname);
		inputMap.put("educational", this.educational);
		inputMap.put("email", this.email);
		inputMap.put("explain", this.explain);
		inputMap.put("fax", this.fax);
		inputMap.put("handset", this.handset);
		inputMap.put("invalidate", this.invalidate);
		inputMap.put("marriage", this.marriage);
		inputMap.put("nationality2", this.nationality2);
		inputMap.put("reckoningmailtype", this.reckoningmailtype);
		inputMap.put("reckoningsendtype", this.reckoningsendtype);
		inputMap.put("recommender", this.recommender);
		inputMap.put("reservwords", this.reservwords);
		inputMap.put("specialcode", this.specialcode);
		inputMap.put("telephone", this.telephone);
		inputMap.put("workcode", this.workcode);
		inputMap.put("zipcode", this.zipcode);
		inputMap.put("trust", this.trust);
		inputMap.put("cityno", this.cityno);
		inputMap.put("countyno", this.countyno);
		inputMap.put("provincecode", this.provincecode);
		inputMap.put("msgsendtype", this.msgsendtype);
		inputMap.put("supermoneyfundtradeacco", this.supermoneyfundtradeacco);
		inputMap.put("acconetno", this.acconetno);
	}
}
