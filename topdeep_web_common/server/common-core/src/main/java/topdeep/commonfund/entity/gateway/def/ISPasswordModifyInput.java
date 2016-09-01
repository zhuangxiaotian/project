package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 密码修改功能输入参数
 */
public class ISPasswordModifyInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 密码类型1交易密码2查询密码,
	 */
	private String passwordType;
	
	/**
	 * 旧密码,
	 */
	private String theOldPassword;
	
	/**
	 * 新密码,
	 */
	private String theNewPassword;
	
	public ISPasswordModifyInput() {
		this.setZ_funcCode("u01");
	}
	
	/**
	 * 密码类型1交易密码2查询密码,
	 */
	public String getPasswordType() {
		return this.passwordType;
	}
	
	/**
	 * 密码类型1交易密码2查询密码,
	 */
	public void setPasswordType(String value)
	 {
		this.passwordType = value;
	}
	
	/**
	 * 旧密码,
	 */
	public String getTheOldPassword() {
		return this.theOldPassword;
	}
	
	/**
	 * 旧密码,
	 */
	public void setTheOldPassword(String value)
	 {
		this.theOldPassword = value;
	}
	
	/**
	 * 新密码,
	 */
	public String getTheNewPassword() {
		return this.theNewPassword;
	}
	
	/**
	 * 新密码,
	 */
	public void setTheNewPassword(String value)
	 {
		this.theNewPassword = value;
	}
}
