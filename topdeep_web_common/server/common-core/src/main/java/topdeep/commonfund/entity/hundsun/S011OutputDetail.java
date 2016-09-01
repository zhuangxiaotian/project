package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 帐户资料修改查询(S011)功能输出明细参数
 */
public class S011OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请日期,yyyymmdd
	 */
	private String applydate = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请时间,hh24MMss
	 */
	private String applytime = "";
	
	/**
	 * 法人代表姓名,
	 */
	private String artificialname = "";
	
	/**
	 * 法人证件号码,
	 */
	private String artificialnumber = "";
	
	/**
	 * 法人证件类型,参考字典：网上交易个人证件类型
	 */
	private String artificialtype = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行户名,
	 */
	private String bankacconame = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 银行代码,
	 */
	private String bankserial = "";
	
	/**
	 * 交易网点代码,
	 */
	private String branchno = "";
	
	/**
	 * 业务代码,参考字典：业务名称
	 */
	private String callingcode = "";
	
	/**
	 * 资金方式,参考字典：资金方式
	 */
	private String capitalmode = "";
	
	/**
	 * 证件类型,参考字典：网上交易个人证件类型
	 */
	private String certificatetype = "";
	
	/**
	 * 通讯地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * 确认标志,参考字典：交易确认标志
	 */
	private String confirmflag = "";
	
	/**
	 * 客户名称,
	 */
	private String customerappellation = "";
	
	/**
	 * 客户类别,0：机构，1：个人
	 */
	private String customertype = "";
	
	/**
	 * E-MAIL地址,
	 */
	private String email = "";
	
	/**
	 * 传真号码,
	 */
	private String fax = "";
	
	/**
	 * 传真委托,1：开通，0：未开通
	 */
	private String faxconsign = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixbusinflag = "";
	
	/**
	 * 冻结方式,
	 */
	private String freezemethod = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 手机号码,
	 */
	private String handset = "";
	
	/**
	 * 证件号码,
	 */
	private String idcard = "";
	
	/**
	 * 分红方式,参考字典：分红方式
	 */
	private String melonmethod = "";
	
	/**
	 * 网上委托,1：开通，0：未开通
	 */
	private String netconsign = "";
	
	/**
	 * 原申请单编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 活动代码,
	 */
	private String promotion = "";
	
	/**
	 * 对帐单寄送方式,参考字典：对账单寄送方式
	 */
	private String reckoningsendtype = "";
	
	/**
	 * 性别,
	 */
	private String sex = "";
	
	/**
	 * 联系电话,
	 */
	private String telephone = "";
	
	/**
	 * 电话委托,1：开通，0：未开通
	 */
	private String telephoneconsign = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易账号名称,
	 */
	private String tradeacconame = "";
	
	/**
	 * 经办人证件号码,
	 */
	private String transactorcertinumber = "";
	
	/**
	 * 经办人证件类型,参考字典：网上交易个人证件类型
	 */
	private String transactorcertitype = "";
	
	/**
	 * 经办人姓名,
	 */
	private String transactorname = "";
	
	/**
	 * 经办人联系电话,
	 */
	private String transactortelephone = "";
	
	/**
	 * 委托方式,
	 */
	private String trust = "";
	
	/**
	 * 佣金折扣率,
	 */
	private Double yjratio;
	
	/**
	 * 邮政编码,
	 */
	private String zipcode = "";
	
	/**
	 * 申请日期,yyyymmdd
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,yyyymmdd
	 */
	public void setApplydate(String value)
	 {
		this.applydate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 申请时间,hh24MMss
	 */
	public String getApplytime() {
		return this.applytime;
	}
	
	/**
	 * 申请时间,hh24MMss
	 */
	public void setApplytime(String value)
	 {
		this.applytime = value;
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
	 * 法人证件类型,参考字典：网上交易个人证件类型
	 */
	public String getArtificialtype() {
		return this.artificialtype;
	}
	
	/**
	 * 法人证件类型,参考字典：网上交易个人证件类型
	 */
	public void setArtificialtype(String value)
	 {
		this.artificialtype = value;
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
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 银行代码,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行代码,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 交易网点代码,
	 */
	public String getBranchno() {
		return this.branchno;
	}
	
	/**
	 * 交易网点代码,
	 */
	public void setBranchno(String value)
	 {
		this.branchno = value;
	}
	
	/**
	 * 业务代码,参考字典：业务名称
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,参考字典：业务名称
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 资金方式,参考字典：资金方式
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,参考字典：资金方式
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 证件类型,参考字典：网上交易个人证件类型
	 */
	public String getCertificatetype() {
		return this.certificatetype;
	}
	
	/**
	 * 证件类型,参考字典：网上交易个人证件类型
	 */
	public void setCertificatetype(String value)
	 {
		this.certificatetype = value;
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
	 * 确认标志,参考字典：交易确认标志
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,参考字典：交易确认标志
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustomerappellation() {
		return this.customerappellation;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustomerappellation(String value)
	 {
		this.customerappellation = value;
	}
	
	/**
	 * 客户类别,0：机构，1：个人
	 */
	public String getCustomertype() {
		return this.customertype;
	}
	
	/**
	 * 客户类别,0：机构，1：个人
	 */
	public void setCustomertype(String value)
	 {
		this.customertype = value;
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
	 * 传真委托,1：开通，0：未开通
	 */
	public String getFaxconsign() {
		return this.faxconsign;
	}
	
	/**
	 * 传真委托,1：开通，0：未开通
	 */
	public void setFaxconsign(String value)
	 {
		this.faxconsign = value;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
	}
	
	/**
	 * 冻结方式,
	 */
	public String getFreezemethod() {
		return this.freezemethod;
	}
	
	/**
	 * 冻结方式,
	 */
	public void setFreezemethod(String value)
	 {
		this.freezemethod = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 手机号码,
	 */
	public String getHandset() {
		return this.handset;
	}
	
	/**
	 * 手机号码,
	 */
	public void setHandset(String value)
	 {
		this.handset = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdcard() {
		return this.idcard;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdcard(String value)
	 {
		this.idcard = value;
	}
	
	/**
	 * 分红方式,参考字典：分红方式
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,参考字典：分红方式
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 网上委托,1：开通，0：未开通
	 */
	public String getNetconsign() {
		return this.netconsign;
	}
	
	/**
	 * 网上委托,1：开通，0：未开通
	 */
	public void setNetconsign(String value)
	 {
		this.netconsign = value;
	}
	
	/**
	 * 原申请单编号,
	 */
	public String getOriginalapplyserial() {
		return this.originalapplyserial;
	}
	
	/**
	 * 原申请单编号,
	 */
	public void setOriginalapplyserial(String value)
	 {
		this.originalapplyserial = value;
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
	 * 对帐单寄送方式,参考字典：对账单寄送方式
	 */
	public String getReckoningsendtype() {
		return this.reckoningsendtype;
	}
	
	/**
	 * 对帐单寄送方式,参考字典：对账单寄送方式
	 */
	public void setReckoningsendtype(String value)
	 {
		this.reckoningsendtype = value;
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
	 * 联系电话,
	 */
	public String getTelephone() {
		return this.telephone;
	}
	
	/**
	 * 联系电话,
	 */
	public void setTelephone(String value)
	 {
		this.telephone = value;
	}
	
	/**
	 * 电话委托,1：开通，0：未开通
	 */
	public String getTelephoneconsign() {
		return this.telephoneconsign;
	}
	
	/**
	 * 电话委托,1：开通，0：未开通
	 */
	public void setTelephoneconsign(String value)
	 {
		this.telephoneconsign = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 交易账号名称,
	 */
	public String getTradeacconame() {
		return this.tradeacconame;
	}
	
	/**
	 * 交易账号名称,
	 */
	public void setTradeacconame(String value)
	 {
		this.tradeacconame = value;
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
	 * 经办人证件类型,参考字典：网上交易个人证件类型
	 */
	public String getTransactorcertitype() {
		return this.transactorcertitype;
	}
	
	/**
	 * 经办人证件类型,参考字典：网上交易个人证件类型
	 */
	public void setTransactorcertitype(String value)
	 {
		this.transactorcertitype = value;
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
	 * 佣金折扣率,
	 */
	public Double getYjratio() {
		return this.yjratio;
	}
	
	/**
	 * 佣金折扣率,
	 */
	public void setYjratio(Double value)
	 {
		this.yjratio = value;
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
}
