package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 登录功能输入参数
 */
public class ISLoginInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 登录方式,0 自动判断 1 交易登录 2 查询登录 3 交易登录（手势密码）
	 */
	private String loginType;
	
	/**
	 * 登录账号类型,登录账号类型，由服务器返回的字典
	 */
	private String loginAccountType;
	
	/**
	 * 登录账号,对应登录类型的登录账号
	 */
	private String loginAccount;
	
	/**
	 * 登录密码,
	 */
	private String password;
	
	public ISLoginInput() {
		this.setZ_funcCode("b04");
	}
	
	/**
	 * 登录方式,0 自动判断 1 交易登录 2 查询登录 3 交易登录（手势密码）
	 */
	public String getLoginType() {
		return this.loginType;
	}
	
	/**
	 * 登录方式,0 自动判断 1 交易登录 2 查询登录 3 交易登录（手势密码）
	 */
	public void setLoginType(String value)
	 {
		this.loginType = value;
	}
	
	/**
	 * 登录账号类型,登录账号类型，由服务器返回的字典
	 */
	public String getLoginAccountType() {
		return this.loginAccountType;
	}
	
	/**
	 * 登录账号类型,登录账号类型，由服务器返回的字典
	 */
	public void setLoginAccountType(String value)
	 {
		this.loginAccountType = value;
	}
	
	/**
	 * 登录账号,对应登录类型的登录账号
	 */
	public String getLoginAccount() {
		return this.loginAccount;
	}
	
	/**
	 * 登录账号,对应登录类型的登录账号
	 */
	public void setLoginAccount(String value)
	 {
		this.loginAccount = value;
	}
	
	/**
	 * 登录密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 登录密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
}
