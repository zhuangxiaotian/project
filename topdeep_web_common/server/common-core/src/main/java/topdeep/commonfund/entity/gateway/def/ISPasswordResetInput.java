package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 重置交易密码功能输入参数
 */
public class ISPasswordResetInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 重置方式,1、银行身份认证,2:手机或者邮箱验证,3:内部直接重置,4:手机发送随机密码,5:邮箱发送随机密码
	 */
	private String way;
	
	/**
	 * 邮箱地址,认证方式2邮箱地址或者手机号选填
	 */
	private String email;
	
	/**
	 * 手机号码,认证方式2邮箱地址或者手机号选填
	 */
	private String mobile;
	
	/**
	 * 申请编号,认证方式1必填
	 */
	private String accoreqserial;
	
	/**
	 * 新密码,
	 */
	private String newpwd;
	
	/**
	 * 证件类型,
	 */
	private String idtype;
	
	/**
	 * 证件号码,
	 */
	private String idno;
	
	/**
	 * 客户名称,
	 */
	private String custname;
	
	/**
	 * 账号类型,0、交易账号，1、基金账号
	 */
	private String logtype;
	
	/**
	 * 账号号码,logtype为0时：交易账号；logtype为1：基金账号
	 */
	private String lognumber;
	
	/**
	 * 验证码,
	 */
	private String validCode;
	
	public ISPasswordResetInput() {
		this.setZ_funcCode("u1r");
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
	 * 申请编号,认证方式1必填
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 申请编号,认证方式1必填
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
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
	 * 验证码,
	 */
	public String getValidCode() {
		return this.validCode;
	}
	
	/**
	 * 验证码,
	 */
	public void setValidCode(String value)
	 {
		this.validCode = value;
	}
}
