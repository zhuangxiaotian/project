package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡快捷鉴权验证码验证(B041)
 */
public class B041Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 验证码,
	 */
	private String mobileauthcode = "";
	
	/**
	 * 银行户名,与B040银行户名需一致
	 */
	private String customername = "";
	
	/**
	 * 请求序列号,农行资金方式传B040返回的请求序列号，通联资金方式随便传一个随机数或者时间戳+随机位数.快钱资金方式该请求序列号要求与B040请求序列号保持一致.
	 */
	private String accoreqserial = "";
	
	/**
	 * 短信密码,农行资金方式支付必传
	 */
	private String smspassword = "";
	
	/**
	 * 订单金额,交行交易验证时必传。和B040提交的订单金额需一致
	 */
	private String amount = "";
	
	/**
	 * 银行卡号,与B040银行卡号需一致
	 */
	private String bankacco = "";
	
	/**
	 * 银行短信识别码,交行资金方式支付必传。B040返回的短信验证码
	 */
	private String banksessionid = "";
	
	/**
	 * 订单号,交银资金方式交易时必传。与B040订单号需一致
	 */
	private String orderNo = "";
	
	/**
	 * 短信用途,交银资金方式交易时必传0：签约，2：交易。B040短信用途需一致
	 */
	private String userFlag = "";
	
	/**
	 * 微信UID,
	 */
	private String wechatuid = "";
	
	/**
	 * 银行编号,通联资金方式必传
	 */
	private String bankserial = "";
	
	/**
	 * 业务类型,
	 */
	private String busintype = "";
	
	/**
	 * 证件号码,通联资金方式必传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,通联资金方式必传
	 */
	private String identitytype = "";
	
	/**
	 * 原申请编号,通联资金方式必传（B040返回的请求序列号）
	 */
	private String originalorderid = "";
	
	/**
	 * 对方流水号,对应B040返回的流水号
	 */
	private String otherserial = "";
	
	/**
	 * 是否预校验,是否进行网银前预校验 0--不进行 1--进行
	 */
	private String prevalidflag = "";
	
	/**
	 * 初始化参数
	 */
	public B041Input() {
		this.setFunction("B041");
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
	 * 验证码,
	 */
	public String getMobileauthcode() {
		return this.mobileauthcode;
	}
	
	/**
	 * 验证码,
	 */
	public void setMobileauthcode(String value)
	 {
		this.mobileauthcode = value;
	}
	
	/**
	 * 银行户名,与B040银行户名需一致
	 */
	public String getCustomername() {
		return this.customername;
	}
	
	/**
	 * 银行户名,与B040银行户名需一致
	 */
	public void setCustomername(String value)
	 {
		this.customername = value;
	}
	
	/**
	 * 请求序列号,农行资金方式传B040返回的请求序列号，通联资金方式随便传一个随机数或者时间戳+随机位数.快钱资金方式该请求序列号要求与B040请求序列号保持一致.
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,农行资金方式传B040返回的请求序列号，通联资金方式随便传一个随机数或者时间戳+随机位数.快钱资金方式该请求序列号要求与B040请求序列号保持一致.
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 短信密码,农行资金方式支付必传
	 */
	public String getSmspassword() {
		return this.smspassword;
	}
	
	/**
	 * 短信密码,农行资金方式支付必传
	 */
	public void setSmspassword(String value)
	 {
		this.smspassword = value;
	}
	
	/**
	 * 订单金额,交行交易验证时必传。和B040提交的订单金额需一致
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 订单金额,交行交易验证时必传。和B040提交的订单金额需一致
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 银行卡号,与B040银行卡号需一致
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,与B040银行卡号需一致
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行短信识别码,交行资金方式支付必传。B040返回的短信验证码
	 */
	public String getBanksessionid() {
		return this.banksessionid;
	}
	
	/**
	 * 银行短信识别码,交行资金方式支付必传。B040返回的短信验证码
	 */
	public void setBanksessionid(String value)
	 {
		this.banksessionid = value;
	}
	
	/**
	 * 订单号,交银资金方式交易时必传。与B040订单号需一致
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	
	/**
	 * 订单号,交银资金方式交易时必传。与B040订单号需一致
	 */
	public void setOrderNo(String value)
	 {
		this.orderNo = value;
	}
	
	/**
	 * 短信用途,交银资金方式交易时必传0：签约，2：交易。B040短信用途需一致
	 */
	public String getUserFlag() {
		return this.userFlag;
	}
	
	/**
	 * 短信用途,交银资金方式交易时必传0：签约，2：交易。B040短信用途需一致
	 */
	public void setUserFlag(String value)
	 {
		this.userFlag = value;
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
	 * 银行编号,通联资金方式必传
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,通联资金方式必传
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 业务类型,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 证件号码,通联资金方式必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,通联资金方式必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,通联资金方式必传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,通联资金方式必传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 原申请编号,通联资金方式必传（B040返回的请求序列号）
	 */
	public String getOriginalorderid() {
		return this.originalorderid;
	}
	
	/**
	 * 原申请编号,通联资金方式必传（B040返回的请求序列号）
	 */
	public void setOriginalorderid(String value)
	 {
		this.originalorderid = value;
	}
	
	/**
	 * 对方流水号,对应B040返回的流水号
	 */
	public String getOtherserial() {
		return this.otherserial;
	}
	
	/**
	 * 对方流水号,对应B040返回的流水号
	 */
	public void setOtherserial(String value)
	 {
		this.otherserial = value;
	}
	
	/**
	 * 是否预校验,是否进行网银前预校验 0--不进行 1--进行
	 */
	public String getPrevalidflag() {
		return this.prevalidflag;
	}
	
	/**
	 * 是否预校验,是否进行网银前预校验 0--不进行 1--进行
	 */
	public void setPrevalidflag(String value)
	 {
		this.prevalidflag = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("mobile", this.mobile);
		inputMap.put("mobileauthcode", this.mobileauthcode);
		inputMap.put("customername", this.customername);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("smspassword", this.smspassword);
		inputMap.put("amount", this.amount);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("banksessionid", this.banksessionid);
		inputMap.put("orderNo", this.orderNo);
		inputMap.put("userFlag", this.userFlag);
		inputMap.put("wechatuid", this.wechatuid);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("busintype", this.busintype);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("originalorderid", this.originalorderid);
		inputMap.put("otherserial", this.otherserial);
		inputMap.put("prevalidflag", this.prevalidflag);
	}
}
