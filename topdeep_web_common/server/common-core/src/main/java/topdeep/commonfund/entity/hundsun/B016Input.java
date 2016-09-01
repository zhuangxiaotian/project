package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡变更(后台模式)(B016)
 */
public class B016Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务类型,绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;
	 */
	private String busitype = "";
	
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
	 * 用户类型,（参考字典：网上交易个人证件类型）（当usertype=o（机构）时，参考字典“机构证件类型”）
	 */
	private String usrtype = "";
	
	/**
	 * 银联CD卡号,请求序列号为空是时必传
	 */
	private String yinliancdcard = "";
	
	/**
	 * 请求序列号,各银行鉴权接口都会返回的请求序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 分行名称,
	 */
	private String branchbankname = "";
	
	/**
	 * 修改后的银行卡号,当请求序列号为空时必传
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
	 * 联行号,当请求序列号为空时必传
	 */
	private String brachbank = "";
	
	/**
	 * 资金方式,当请求序列号为空时必传
	 */
	private String capitalmode = "";
	
	/**
	 * 明细资金方式,01：支持商户代扣，[ISNULL]：设置为空
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 证件号码,当请求序列号为空时必传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,当请求序列号为空时必传
	 */
	private String identitytype = "";
	
	/**
	 * 交易账号,当请求序列号为空时必传
	 */
	private String tradeacco = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 重新加载客户信息,变更银行卡账号之后是否重新加载客户信息(Y/N),仅用于无请求序列号的情况
	 */
	private String reloadcustinfo = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 城市代码,
	 */
	private String cityno = "";
	
	/**
	 * 业务辅助码,如需更新证件号码（15位升18位），需传AF
	 */
	private String fixbusinflag = "";
	
	/**
	 * 省份代码,
	 */
	private String provincecode = "";
	
	/**
	 * 是否支持快捷方式,1：支持快捷支付 ，空：不支持快捷支付
	 */
	private String interfacetype = "";
	
	/**
	 * 初始化参数
	 */
	public B016Input() {
		this.setFunction("B016");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务类型,绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
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
	 * 用户类型,（参考字典：网上交易个人证件类型）（当usertype=o（机构）时，参考字典“机构证件类型”）
	 */
	public String getUsrtype() {
		return this.usrtype;
	}
	
	/**
	 * 用户类型,（参考字典：网上交易个人证件类型）（当usertype=o（机构）时，参考字典“机构证件类型”）
	 */
	public void setUsrtype(String value)
	 {
		this.usrtype = value;
	}
	
	/**
	 * 银联CD卡号,请求序列号为空是时必传
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联CD卡号,请求序列号为空是时必传
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
	
	/**
	 * 请求序列号,各银行鉴权接口都会返回的请求序列号
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,各银行鉴权接口都会返回的请求序列号
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 分行名称,
	 */
	public String getBranchbankname() {
		return this.branchbankname;
	}
	
	/**
	 * 分行名称,
	 */
	public void setBranchbankname(String value)
	 {
		this.branchbankname = value;
	}
	
	/**
	 * 修改后的银行卡号,当请求序列号为空时必传
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 修改后的银行卡号,当请求序列号为空时必传
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
	 * 联行号,当请求序列号为空时必传
	 */
	public String getBrachbank() {
		return this.brachbank;
	}
	
	/**
	 * 联行号,当请求序列号为空时必传
	 */
	public void setBrachbank(String value)
	 {
		this.brachbank = value;
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
	 * 明细资金方式,01：支持商户代扣，[ISNULL]：设置为空
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,01：支持商户代扣，[ISNULL]：设置为空
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 证件号码,当请求序列号为空时必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,当请求序列号为空时必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,当请求序列号为空时必传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,当请求序列号为空时必传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 交易账号,当请求序列号为空时必传
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,当请求序列号为空时必传
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
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
	 * 重新加载客户信息,变更银行卡账号之后是否重新加载客户信息(Y/N),仅用于无请求序列号的情况
	 */
	public String getReloadcustinfo() {
		return this.reloadcustinfo;
	}
	
	/**
	 * 重新加载客户信息,变更银行卡账号之后是否重新加载客户信息(Y/N),仅用于无请求序列号的情况
	 */
	public void setReloadcustinfo(String value)
	 {
		this.reloadcustinfo = value;
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
	 * 业务辅助码,如需更新证件号码（15位升18位），需传AF
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助码,如需更新证件号码（15位升18位），需传AF
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
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
	 * 是否支持快捷方式,1：支持快捷支付 ，空：不支持快捷支付
	 */
	public String getInterfacetype() {
		return this.interfacetype;
	}
	
	/**
	 * 是否支持快捷方式,1：支持快捷支付 ，空：不支持快捷支付
	 */
	public void setInterfacetype(String value)
	 {
		this.interfacetype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("busitype", this.busitype);
		inputMap.put("cpflag", this.cpflag);
		inputMap.put("custcardstat", this.custcardstat);
		inputMap.put("custstat", this.custstat);
		inputMap.put("usrtype", this.usrtype);
		inputMap.put("yinliancdcard", this.yinliancdcard);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("branchbankname", this.branchbankname);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankacconame", this.bankacconame);
		inputMap.put("bankname", this.bankname);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("brachbank", this.brachbank);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradecontact", this.tradecontact);
		inputMap.put("reloadcustinfo", this.reloadcustinfo);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("cityno", this.cityno);
		inputMap.put("fixbusinflag", this.fixbusinflag);
		inputMap.put("provincecode", this.provincecode);
		inputMap.put("interfacetype", this.interfacetype);
	}
}
