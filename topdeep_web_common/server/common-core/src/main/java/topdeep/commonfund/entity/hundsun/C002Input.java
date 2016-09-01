package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 生成银行开户签名数据(C002)
 */
public class C002Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,调用C001返回的capitalmode
	 */
	private String capitalmode = "";
	
	/**
	 * 姓名,
	 */
	private String customerappellation = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String identitytype = "";
	
	/**
	 * 是否检查已开户,
	 */
	private String isvalidopenacco = "";
	
	/**
	 * 银行账号,银行卡号，如果为空则不填
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,调用C001返回的bankserial
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	private String capitalmode_prefix = "空";
	
	/**
	 * 城市代码,取字典“XX城市”xx为省份代码
	 */
	private String citycode = "空";
	
	/**
	 * 邮箱,
	 */
	private String email = "空";
	
	/**
	 * 联系电话,
	 */
	private String handset = "空";
	
	/**
	 * 省份代码,取字典“省份”
	 */
	private String provincecode = "空";
	
	/**
	 * 交易账号,当换卡业务时，必须传交易帐号
	 */
	private String tradeacco = "空";
	
	/**
	 * 业务类型,不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	private String busitype = "空";
	
	/**
	 * 预校验标识,需要进行预校验
	 */
	private String precheckflag = "空";
	
	/**
	 * 交易密码,预校验为1时必须传入
	 */
	private String tradepassword = "空";
	
	/**
	 * 可控的返回url,
	 */
	private String controllablebackurl = "";
	
	/**
	 * 开户走签约返回地址,
	 */
	private String signbackurl = "";
	
	/**
	 * 微信UID,
	 */
	private String weixinUID = "";
	
	/**
	 * 快捷标识,1为走快捷模式
	 */
	private String interfacetype = "";
	
	/**
	 * 开户渠道,1：来自手机版的开户，0或空：普通网页开户
	 */
	private String openaccochannel = "";
	
	/**
	 * 客户类别,0
	 */
	private String custtype = "";
	
	/**
	 * 性别,1男，0女
	 */
	private String sex = "";
	
	/**
	 * 操作终端,可取：WEB;ANDROID;IOS;HTML5
	 */
	private String terminal = "";
	
	/**
	 * 初始化参数
	 */
	public C002Input() {
		this.setFunction("C002");
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
	 * 姓名,
	 */
	public String getCustomerappellation() {
		return this.customerappellation;
	}
	
	/**
	 * 姓名,
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
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 是否检查已开户,
	 */
	public String getIsvalidopenacco() {
		return this.isvalidopenacco;
	}
	
	/**
	 * 是否检查已开户,
	 */
	public void setIsvalidopenacco(String value)
	 {
		this.isvalidopenacco = value;
	}
	
	/**
	 * 银行账号,银行卡号，如果为空则不填
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,银行卡号，如果为空则不填
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行编号,调用C001返回的bankserial
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,调用C001返回的bankserial
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	public String getCapitalmode_prefix() {
		return this.capitalmode_prefix;
	}
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	public void setCapitalmode_prefix(String value)
	 {
		this.capitalmode_prefix = value;
	}
	
	/**
	 * 城市代码,取字典“XX城市”xx为省份代码
	 */
	public String getCitycode() {
		return this.citycode;
	}
	
	/**
	 * 城市代码,取字典“XX城市”xx为省份代码
	 */
	public void setCitycode(String value)
	 {
		this.citycode = value;
	}
	
	/**
	 * 邮箱,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 联系电话,
	 */
	public String getHandset() {
		return this.handset;
	}
	
	/**
	 * 联系电话,
	 */
	public void setHandset(String value)
	 {
		this.handset = value;
	}
	
	/**
	 * 省份代码,取字典“省份”
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 省份代码,取字典“省份”
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
	}
	
	/**
	 * 交易账号,当换卡业务时，必须传交易帐号
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,当换卡业务时，必须传交易帐号
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 业务类型,不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,不传按开户处理;增开OPENTRADEACCO;绑定银行卡BINDBANKCARD;变更银行卡CHANGEBANKCARD;重置交易密码RESETPASSWORD;预用户开户BUSITYPE_OPENACCORESET;预用户重置密码RESETPASSWORDPREUSER;重置电话交易密码RESETTELPASSWORD;证件号码转换BUSITYPE_CHANGEIDCARD;修改银行全称BUSITYPE_CHANGEBANKNAME;修改银行户名CHANGEBANKACCONAME;好易联老卡换新卡BUSITYPE_CHANGEOLDBANKCARD;仅验证身份ONLYVERIFY
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 预校验标识,需要进行预校验
	 */
	public String getPrecheckflag() {
		return this.precheckflag;
	}
	
	/**
	 * 预校验标识,需要进行预校验
	 */
	public void setPrecheckflag(String value)
	 {
		this.precheckflag = value;
	}
	
	/**
	 * 交易密码,预校验为1时必须传入
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,预校验为1时必须传入
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 可控的返回url,
	 */
	public String getControllablebackurl() {
		return this.controllablebackurl;
	}
	
	/**
	 * 可控的返回url,
	 */
	public void setControllablebackurl(String value)
	 {
		this.controllablebackurl = value;
	}
	
	/**
	 * 开户走签约返回地址,
	 */
	public String getSignbackurl() {
		return this.signbackurl;
	}
	
	/**
	 * 开户走签约返回地址,
	 */
	public void setSignbackurl(String value)
	 {
		this.signbackurl = value;
	}
	
	/**
	 * 微信UID,
	 */
	public String getWeixinUID() {
		return this.weixinUID;
	}
	
	/**
	 * 微信UID,
	 */
	public void setWeixinUID(String value)
	 {
		this.weixinUID = value;
	}
	
	/**
	 * 快捷标识,1为走快捷模式
	 */
	public String getInterfacetype() {
		return this.interfacetype;
	}
	
	/**
	 * 快捷标识,1为走快捷模式
	 */
	public void setInterfacetype(String value)
	 {
		this.interfacetype = value;
	}
	
	/**
	 * 开户渠道,1：来自手机版的开户，0或空：普通网页开户
	 */
	public String getOpenaccochannel() {
		return this.openaccochannel;
	}
	
	/**
	 * 开户渠道,1：来自手机版的开户，0或空：普通网页开户
	 */
	public void setOpenaccochannel(String value)
	 {
		this.openaccochannel = value;
	}
	
	/**
	 * 客户类别,0
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类别,0
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 性别,1男，0女
	 */
	public String getSex() {
		return this.sex;
	}
	
	/**
	 * 性别,1男，0女
	 */
	public void setSex(String value)
	 {
		this.sex = value;
	}
	
	/**
	 * 操作终端,可取：WEB;ANDROID;IOS;HTML5
	 */
	public String getTerminal() {
		return this.terminal;
	}
	
	/**
	 * 操作终端,可取：WEB;ANDROID;IOS;HTML5
	 */
	public void setTerminal(String value)
	 {
		this.terminal = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("customerappellation", this.customerappellation);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("isvalidopenacco", this.isvalidopenacco);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("capitalmode_prefix", this.capitalmode_prefix);
		inputMap.put("citycode", this.citycode);
		inputMap.put("email", this.email);
		inputMap.put("handset", this.handset);
		inputMap.put("provincecode", this.provincecode);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("busitype", this.busitype);
		inputMap.put("precheckflag", this.precheckflag);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("controllablebackurl", this.controllablebackurl);
		inputMap.put("signbackurl", this.signbackurl);
		inputMap.put("weixinUID", this.weixinUID);
		inputMap.put("interfacetype", this.interfacetype);
		inputMap.put("openaccochannel", this.openaccochannel);
		inputMap.put("custtype", this.custtype);
		inputMap.put("sex", this.sex);
		inputMap.put("terminal", this.terminal);
	}
}
