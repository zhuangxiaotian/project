package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡快捷鉴权(B022)
 */
public class B022Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 姓名,
	 */
	private String custname = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 手机号码,
	 */
	private String mobile = "";
	
	/**
	 * 业务类别,不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	private String busintype = "";
	
	/**
	 * 是否是需要开户校验,0或者空不需要，1--需要
	 */
	private String prevalidflag = "";
	
	/**
	 * 微信UID,
	 */
	private String wechatuid = "";
	
	/**
	 * 交易账号,换卡时必填
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public B022Input() {
		this.setFunction("B022");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,
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
	 * 姓名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 姓名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
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
	 * 业务类别,不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务类别,不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 是否是需要开户校验,0或者空不需要，1--需要
	 */
	public String getPrevalidflag() {
		return this.prevalidflag;
	}
	
	/**
	 * 是否是需要开户校验,0或者空不需要，1--需要
	 */
	public void setPrevalidflag(String value)
	 {
		this.prevalidflag = value;
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
	 * 交易账号,换卡时必填
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,换卡时必填
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("custname", this.custname);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("mobile", this.mobile);
		inputMap.put("busintype", this.busintype);
		inputMap.put("prevalidflag", this.prevalidflag);
		inputMap.put("wechatuid", this.wechatuid);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
