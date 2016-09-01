package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡快捷鉴权验证码发送(B040)
 */
public class B040Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 客户姓名,
	 */
	private String customername = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 业务类型,换卡或其他业务的时候需要传，不传默认开户。不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	private String busintype = "";
	
	/**
	 * 交易帐号,换卡业务的时候需要传
	 */
	private String tradeacco = "";
	
	/**
	 * 订单金额,交行交易时必传
	 */
	private String amount = "";
	
	/**
	 * 订单号,交行交易时必传
	 */
	private String orderNo = "";
	
	/**
	 * 短信密码,交行交易时必传，随机6位数字
	 */
	private String textCode = "";
	
	/**
	 * 银行编号,快钱资金方式必传,通联资金方式必传
	 */
	private String bankserial = "";
	
	/**
	 * 请求序列号,农行资金方式，重新发送短信时需要传
	 */
	private String accoreqserial = "";
	
	/**
	 * 证件号码,农行资金方式必传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,农行资金方式必传（字典：网上交易个人证件类型）
	 */
	private String identitytype = "";
	
	/**
	 * 特殊标志,农行资金方式时，传1表示重新发送
	 */
	private String specialflag = "";
	
	/**
	 * 短信用途,0：签约；2：交易，交行资金方式必传
	 */
	private String useflag = "";
	
	/**
	 * 微信UID,
	 */
	private String wechatuid = "";
	
	/**
	 * 需要解约的银行卡号,
	 */
	private String oldbankacco = "";
	
	/**
	 * 初始化参数
	 */
	public B040Input() {
		this.setFunction("B040");
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
	 * 客户姓名,
	 */
	public String getCustomername() {
		return this.customername;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustomername(String value)
	 {
		this.customername = value;
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
	 * 业务类型,换卡或其他业务的时候需要传，不传默认开户。不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务类型,换卡或其他业务的时候需要传，不传默认开户。不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 交易帐号,换卡业务的时候需要传
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,换卡业务的时候需要传
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 订单金额,交行交易时必传
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 订单金额,交行交易时必传
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 订单号,交行交易时必传
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	
	/**
	 * 订单号,交行交易时必传
	 */
	public void setOrderNo(String value)
	 {
		this.orderNo = value;
	}
	
	/**
	 * 短信密码,交行交易时必传，随机6位数字
	 */
	public String getTextCode() {
		return this.textCode;
	}
	
	/**
	 * 短信密码,交行交易时必传，随机6位数字
	 */
	public void setTextCode(String value)
	 {
		this.textCode = value;
	}
	
	/**
	 * 银行编号,快钱资金方式必传,通联资金方式必传
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,快钱资金方式必传,通联资金方式必传
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 请求序列号,农行资金方式，重新发送短信时需要传
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,农行资金方式，重新发送短信时需要传
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 证件号码,农行资金方式必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,农行资金方式必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,农行资金方式必传（字典：网上交易个人证件类型）
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,农行资金方式必传（字典：网上交易个人证件类型）
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 特殊标志,农行资金方式时，传1表示重新发送
	 */
	public String getSpecialflag() {
		return this.specialflag;
	}
	
	/**
	 * 特殊标志,农行资金方式时，传1表示重新发送
	 */
	public void setSpecialflag(String value)
	 {
		this.specialflag = value;
	}
	
	/**
	 * 短信用途,0：签约；2：交易，交行资金方式必传
	 */
	public String getUseflag() {
		return this.useflag;
	}
	
	/**
	 * 短信用途,0：签约；2：交易，交行资金方式必传
	 */
	public void setUseflag(String value)
	 {
		this.useflag = value;
	}
	
	/**
	 * 微信UID,
	 */
	public String getWechatuid() {
		return this.wechatuid;
	}
	
	/**
	 * 微信UID,
	 */
	public void setWechatuid(String value)
	 {
		this.wechatuid = value;
	}
	
	/**
	 * 需要解约的银行卡号,
	 */
	public String getOldbankacco() {
		return this.oldbankacco;
	}
	
	/**
	 * 需要解约的银行卡号,
	 */
	public void setOldbankacco(String value)
	 {
		this.oldbankacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("customername", this.customername);
		inputMap.put("mobile", this.mobile);
		inputMap.put("busintype", this.busintype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("amount", this.amount);
		inputMap.put("orderNo", this.orderNo);
		inputMap.put("textCode", this.textCode);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("specialflag", this.specialflag);
		inputMap.put("useflag", this.useflag);
		inputMap.put("wechatuid", this.wechatuid);
		inputMap.put("oldbankacco", this.oldbankacco);
	}
}
