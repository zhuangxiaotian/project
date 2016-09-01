package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 修改交易密码功能输入参数
 */
public class ISPayPasswordUpdateInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 原密码,
	 */
	private String oldPassword;
	
	/**
	 * 新密码,
	 */
	private String newPassword;
	
	/**
	 * 确认密码,
	 */
	private String confirmPassword;
	
	public ISPayPasswordUpdateInput() {
		this.setZ_funcCode("u1K");
	}
	
	/**
	 * 原密码,
	 */
	public String getOldPassword() {
		return this.oldPassword;
	}
	
	/**
	 * 原密码,
	 */
	public void setOldPassword(String value)
	 {
		this.oldPassword = value;
	}
	
	/**
	 * 新密码,
	 */
	public String getNewPassword() {
		return this.newPassword;
	}
	
	/**
	 * 新密码,
	 */
	public void setNewPassword(String value)
	 {
		this.newPassword = value;
	}
	
	/**
	 * 确认密码,
	 */
	public String getConfirmPassword() {
		return this.confirmPassword;
	}
	
	/**
	 * 确认密码,
	 */
	public void setConfirmPassword(String value)
	 {
		this.confirmPassword = value;
	}
}
