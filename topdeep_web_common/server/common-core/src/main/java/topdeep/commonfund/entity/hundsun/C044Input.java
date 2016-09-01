package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开户(银商模式)(C044)
 */
public class C044Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,需要包含分行和支行-由用户输入
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,固定值：AAE
	 */
	private String bankserial = "";
	
	/**
	 * 客户姓名,
	 */
	private String customerappellation = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型） （当usertype=o（机构）时，参考字典“机构证件类型”）
	 */
	private String identitytype = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 出生日期,
	 */
	private String birthday = "";
	
	/**
	 * 通讯地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * E-MAIL地址,
	 */
	private String email = "";
	
	/**
	 * 传真号码,
	 */
	private String fax = "";
	
	/**
	 * 手机,
	 */
	private String handset = "";
	
	/**
	 * 性别,参考字典：性别
	 */
	private String sex = "";
	
	/**
	 * 电话号码,
	 */
	private String telephone = "";
	
	/**
	 * 职业,参考字典：职业
	 */
	private String workcode = "";
	
	/**
	 * 邮政编码,
	 */
	private String zipcode = "";
	
	/**
	 * 银行流水号,
	 */
	private String originapplyserial = "";
	
	/**
	 * 推荐人电话,
	 */
	private String recommenderphone = "";
	
	/**
	 * 初始化参数
	 */
	public C044Input() {
		this.setFunction("C044");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
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
	 * 银行编号,固定值：AAE
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,固定值：AAE
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
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
	 * 证件类型,（参考字典：网上交易个人证件类型） （当usertype=o（机构）时，参考字典“机构证件类型”）
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型） （当usertype=o（机构）时，参考字典“机构证件类型”）
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
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
	 * 性别,参考字典：性别
	 */
	public String getSex() {
		return this.sex;
	}
	
	/**
	 * 性别,参考字典：性别
	 */
	public void setSex(String value)
	 {
		this.sex = value;
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
	 * 职业,参考字典：职业
	 */
	public String getWorkcode() {
		return this.workcode;
	}
	
	/**
	 * 职业,参考字典：职业
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
	 * 银行流水号,
	 */
	public String getOriginapplyserial() {
		return this.originapplyserial;
	}
	
	/**
	 * 银行流水号,
	 */
	public void setOriginapplyserial(String value)
	 {
		this.originapplyserial = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankname", this.bankname);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("broker", this.broker);
		inputMap.put("birthday", this.birthday);
		inputMap.put("communicationaddr", this.communicationaddr);
		inputMap.put("email", this.email);
		inputMap.put("fax", this.fax);
		inputMap.put("handset", this.handset);
		inputMap.put("sex", this.sex);
		inputMap.put("telephone", this.telephone);
		inputMap.put("workcode", this.workcode);
		inputMap.put("zipcode", this.zipcode);
		inputMap.put("originapplyserial", this.originapplyserial);
		inputMap.put("recommenderphone", this.recommenderphone);
	}
}
