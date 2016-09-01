package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 增开交易账号(后台模式)(C036)
 */
public class C036Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,无密码登录的情况下必传
	 */
	private String identityNo = "";
	
	/**
	 * 证件类型,无密码登录的情况下必传
	 */
	private String identityType = "";
	
	/**
	 * 银行帐号,当请求序列号为空时必传
	 */
	private String bankacco = "";
	
	/**
	 * 银行账户名称,当请求序列号为空时必传
	 */
	private String bankacconame = "";
	
	/**
	 * 银行名称,当请求序列号为空时必传
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,当请求序列号为空时必传
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,当请求序列号为空时必传
	 */
	private String capitalmode = "";
	
	/**
	 * 客户姓名,当请求序列号为空时必传
	 */
	private String customerappellation = "";
	
	/**
	 * 明细资金方式,当请求序列号为空时必传
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 银行分行支行名称,
	 */
	private String branchbankname = "";
	
	/**
	 * 联行号,
	 */
	private String brachbank = "";
	
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
	 * 代扣接口类型,当interfacetype为1时，判断是否有支持工行快捷支付，如不支持，返回错误
	 */
	private String interfacetype = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 请求序列号,请求序列号字段为C002接口中返回的请求序列号商户以后台方式增开交易账号，可不对要增开的银行进行银行身份验证(已废弃，此字段计划在下版本取消)
	 */
	private String accoreqserial = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 开户银行城市代码,
	 */
	private String cityno = "";
	
	/**
	 * 开户银行省份代码,
	 */
	private String provincecode = "";
	
	/**
	 * 汇款协议号,默认开户支持传01（诺亚）
	 */
	private String remitno = "";
	
	/**
	 * 初始化参数
	 */
	public C036Input() {
		this.setFunction("C036");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 证件号码,无密码登录的情况下必传
	 */
	public String getIdentityNo() {
		return this.identityNo;
	}
	
	/**
	 * 证件号码,无密码登录的情况下必传
	 */
	public void setIdentityNo(String value)
	 {
		this.identityNo = value;
	}
	
	/**
	 * 证件类型,无密码登录的情况下必传
	 */
	public String getIdentityType() {
		return this.identityType;
	}
	
	/**
	 * 证件类型,无密码登录的情况下必传
	 */
	public void setIdentityType(String value)
	 {
		this.identityType = value;
	}
	
	/**
	 * 银行帐号,当请求序列号为空时必传
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行帐号,当请求序列号为空时必传
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行账户名称,当请求序列号为空时必传
	 */
	public String getBankacconame() {
		return this.bankacconame;
	}
	
	/**
	 * 银行账户名称,当请求序列号为空时必传
	 */
	public void setBankacconame(String value)
	 {
		this.bankacconame = value;
	}
	
	/**
	 * 银行名称,当请求序列号为空时必传
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,当请求序列号为空时必传
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 银行编号,当请求序列号为空时必传
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,当请求序列号为空时必传
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 资金方式,当请求序列号为空时必传
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,当请求序列号为空时必传
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 客户姓名,当请求序列号为空时必传
	 */
	public String getCustomerappellation() {
		return this.customerappellation;
	}
	
	/**
	 * 客户姓名,当请求序列号为空时必传
	 */
	public void setCustomerappellation(String value)
	 {
		this.customerappellation = value;
	}
	
	/**
	 * 明细资金方式,当请求序列号为空时必传
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,当请求序列号为空时必传
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 银行分行支行名称,
	 */
	public String getBranchbankname() {
		return this.branchbankname;
	}
	
	/**
	 * 银行分行支行名称,
	 */
	public void setBranchbankname(String value)
	 {
		this.branchbankname = value;
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
	 * 请求序列号,请求序列号字段为C002接口中返回的请求序列号商户以后台方式增开交易账号，可不对要增开的银行进行银行身份验证(已废弃，此字段计划在下版本取消)
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,请求序列号字段为C002接口中返回的请求序列号商户以后台方式增开交易账号，可不对要增开的银行进行银行身份验证(已废弃，此字段计划在下版本取消)
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
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
	 * 开户银行城市代码,
	 */
	public String getCityno() {
		return this.cityno;
	}
	
	/**
	 * 开户银行城市代码,
	 */
	public void setCityno(String value)
	 {
		this.cityno = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identityNo", this.identityNo);
		inputMap.put("identityType", this.identityType);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankacconame", this.bankacconame);
		inputMap.put("bankname", this.bankname);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("branchbankname", this.branchbankname);
		inputMap.put("brachbank", this.brachbank);
		inputMap.put("cpflag", this.cpflag);
		inputMap.put("custcardstat", this.custcardstat);
		inputMap.put("custstat", this.custstat);
		inputMap.put("usrtype", this.usrtype);
		inputMap.put("yinliancdcard", this.yinliancdcard);
		inputMap.put("interfacetype", this.interfacetype);
		inputMap.put("tradecontact", this.tradecontact);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("broker", this.broker);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("mobile", this.mobile);
		inputMap.put("cityno", this.cityno);
		inputMap.put("provincecode", this.provincecode);
		inputMap.put("remitno", this.remitno);
	}
}
