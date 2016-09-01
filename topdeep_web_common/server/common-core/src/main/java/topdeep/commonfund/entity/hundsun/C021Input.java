package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 增开交易账号(C021)
 */
public class C021Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 请求序列号,增开交易账号前，必须对要增开的银行 进行银行身份验证,此处请求序列号字段 使用C002接口中返回的请求序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 银行分行支行名称,
	 */
	private String branchbankname = "";
	
	/**
	 * 交易密码,如果为空则自动取登录密码（无密码登录必填）
	 */
	private String tradepassword = "";
	
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
	 * 明细资金方式,01:托收
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 开户银行城市代码,
	 */
	private String cityno = "";
	
	/**
	 * 开户银行省份代码,
	 */
	private String provincecode = "";
	
	/**
	 * 初始化参数
	 */
	public C021Input() {
		this.setFunction("C021");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 请求序列号,增开交易账号前，必须对要增开的银行 进行银行身份验证,此处请求序列号字段 使用C002接口中返回的请求序列号
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,增开交易账号前，必须对要增开的银行 进行银行身份验证,此处请求序列号字段 使用C002接口中返回的请求序列号
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
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
	 * 交易密码,如果为空则自动取登录密码（无密码登录必填）
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,如果为空则自动取登录密码（无密码登录必填）
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
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
	 * 明细资金方式,01:托收
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,01:托收
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("branchbankname", this.branchbankname);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("brachbank", this.brachbank);
		inputMap.put("cpflag", this.cpflag);
		inputMap.put("custcardstat", this.custcardstat);
		inputMap.put("custstat", this.custstat);
		inputMap.put("usrtype", this.usrtype);
		inputMap.put("yinliancdcard", this.yinliancdcard);
		inputMap.put("interfacetype", this.interfacetype);
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("tradecontact", this.tradecontact);
		inputMap.put("cityno", this.cityno);
		inputMap.put("provincecode", this.provincecode);
	}
}
