package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 重置交易密码(C029)
 */
public class C029Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户名称,
	 */
	private String custname = "";
	
	/**
	 * 证件号码,
	 */
	private String idno = "";
	
	/**
	 * 证件类型,
	 */
	private String idtype = "";
	
	/**
	 * 新密码,
	 */
	private String newpwd = "";
	
	/**
	 * 重置方式,1、银行身份认证,2:手机或者邮箱验证,3:内部直接重置,4:手机发送随机密码,5:邮箱发送随机密码
	 */
	private String way = "";
	
	/**
	 * 申请编号,认证方式1必填(并且系统参数SESSION_SAVE_IN_DB的值设置为“1”)
	 */
	private String accoreqserial = "";
	
	/**
	 * 邮箱地址,认证方式2邮箱地址或者手机号选填
	 */
	private String email = "";
	
	/**
	 * 账号号码,logtype为0时：交易账号；logtype为1：基金账号
	 */
	private String lognumber = "";
	
	/**
	 * 账号类型,0、交易账号，1、基金账号
	 */
	private String logtype = "";
	
	/**
	 * 手机号码,认证方式2邮箱地址或者手机号选填
	 */
	private String mobile = "";
	
	/**
	 * 银行账号,way=4或5时，且系统参数ETS_RESETPW_CHECKBANKACCO为1或者为空时必传
	 */
	private String bankacco = "";
	
	/**
	 * 初始化参数
	 */
	public C029Input() {
		this.setFunction("C029");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
	 * 证件类型,
	 */
	public String getIdtype() {
		return this.idtype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdtype(String value)
	 {
		this.idtype = value;
	}
	
	/**
	 * 新密码,
	 */
	public String getNewpwd() {
		return this.newpwd;
	}
	
	/**
	 * 新密码,
	 */
	public void setNewpwd(String value)
	 {
		this.newpwd = value;
	}
	
	/**
	 * 重置方式,1、银行身份认证,2:手机或者邮箱验证,3:内部直接重置,4:手机发送随机密码,5:邮箱发送随机密码
	 */
	public String getWay() {
		return this.way;
	}
	
	/**
	 * 重置方式,1、银行身份认证,2:手机或者邮箱验证,3:内部直接重置,4:手机发送随机密码,5:邮箱发送随机密码
	 */
	public void setWay(String value)
	 {
		this.way = value;
	}
	
	/**
	 * 申请编号,认证方式1必填(并且系统参数SESSION_SAVE_IN_DB的值设置为“1”)
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 申请编号,认证方式1必填(并且系统参数SESSION_SAVE_IN_DB的值设置为“1”)
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 邮箱地址,认证方式2邮箱地址或者手机号选填
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱地址,认证方式2邮箱地址或者手机号选填
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 账号号码,logtype为0时：交易账号；logtype为1：基金账号
	 */
	public String getLognumber() {
		return this.lognumber;
	}
	
	/**
	 * 账号号码,logtype为0时：交易账号；logtype为1：基金账号
	 */
	public void setLognumber(String value)
	 {
		this.lognumber = value;
	}
	
	/**
	 * 账号类型,0、交易账号，1、基金账号
	 */
	public String getLogtype() {
		return this.logtype;
	}
	
	/**
	 * 账号类型,0、交易账号，1、基金账号
	 */
	public void setLogtype(String value)
	 {
		this.logtype = value;
	}
	
	/**
	 * 手机号码,认证方式2邮箱地址或者手机号选填
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机号码,认证方式2邮箱地址或者手机号选填
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	/**
	 * 银行账号,way=4或5时，且系统参数ETS_RESETPW_CHECKBANKACCO为1或者为空时必传
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,way=4或5时，且系统参数ETS_RESETPW_CHECKBANKACCO为1或者为空时必传
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custname", this.custname);
		inputMap.put("idno", this.idno);
		inputMap.put("idtype", this.idtype);
		inputMap.put("newpwd", this.newpwd);
		inputMap.put("way", this.way);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("email", this.email);
		inputMap.put("lognumber", this.lognumber);
		inputMap.put("logtype", this.logtype);
		inputMap.put("mobile", this.mobile);
		inputMap.put("bankacco", this.bankacco);
	}
}
