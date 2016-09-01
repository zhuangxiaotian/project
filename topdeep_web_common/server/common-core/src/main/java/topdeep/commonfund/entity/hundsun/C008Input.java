package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开通网上交易(C008)
 */
public class C008Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,调用C001返回的capitalmode
	 */
	private String capitalmode = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepwd = "";
	
	/**
	 * 请求序列号,使用C002接口中返回的请求序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	private String capitalmode_prefix = "";
	
	/**
	 * 基金账号 与交易账号中必填一个,
	 */
	private String fundacco = "";
	
	/**
	 * 证件号码,
	 */
	private String idno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String idtype = "";
	
	/**
	 * 基金账号 与交易账号中必填一个,
	 */
	private String tradeacco = "";
	
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
	 * 明细资金方式,
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 代扣接口类型,当interfacetype为1时，判断是否有支持工行快捷支付，如不支持，返回错误
	 */
	private String interfacetype = "";
	
	/**
	 * 初始化参数
	 */
	public C008Input() {
		this.setFunction("C008");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 资金方式,调用C001返回的capitalmode
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,调用C001返回的capitalmode
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getTradepwd() {
		return this.tradepwd;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradepwd(String value)
	 {
		this.tradepwd = value;
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
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	public String getCapitalmode_prefix() {
		return this.capitalmode_prefix;
	}
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	public void setCapitalmode_prefix(String value)
	 {
		this.capitalmode_prefix = value;
	}
	
	/**
	 * 基金账号 与交易账号中必填一个,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号 与交易账号中必填一个,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 基金账号 与交易账号中必填一个,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 基金账号 与交易账号中必填一个,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("tradepwd", this.tradepwd);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("capitalmode_prefix", this.capitalmode_prefix);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("idno", this.idno);
		inputMap.put("idtype", this.idtype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("brachbank", this.brachbank);
		inputMap.put("cpflag", this.cpflag);
		inputMap.put("custcardstat", this.custcardstat);
		inputMap.put("custstat", this.custstat);
		inputMap.put("usrtype", this.usrtype);
		inputMap.put("yinliancdcard", this.yinliancdcard);
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("interfacetype", this.interfacetype);
	}
}
