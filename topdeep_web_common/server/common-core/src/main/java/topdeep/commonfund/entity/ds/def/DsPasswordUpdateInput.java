package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 修改密码功能输入参数
 */
public class DsPasswordUpdateInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 旧密码,
	 */
	private String theOldPassword;
	
	/**
	 * 新密码,
	 */
	private String theNewPassword;
	
	/**
	 * 密码类型,t:交易密码;q:查询密码;r:注册密码
	 */
	private String passwordType;
	
	public DsPasswordUpdateInput() {
		this.setZ_funcCode("u03");
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
	
	/**
	 * 密码类型,t:交易密码;q:查询密码;r:注册密码
	 */
	public String getPasswordType() {
		return this.passwordType;
	}
	
	/**
	 * 密码类型,t:交易密码;q:查询密码;r:注册密码
	 */
	public void setPasswordType(String value)
	 {
		this.passwordType = value;
	}
}
