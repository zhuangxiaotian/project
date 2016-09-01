package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 验证令牌(P012)
 */
public class P0012Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 令牌,
	 */
	private String token = "";
	
	/**
	 * session关键字,
	 */
	private String sessionkey = "";
	
	/**
	 * 返回用户角色值,
	 */
	private String roleValue = "";
	
	/**
	 * 令牌,
	 */
	public String getToken() {
		return this.token;
	}
	
	/**
	 * 令牌,
	 */
	public void setToken(String value)
	 {
		this.token = value;
	}
	
	/**
	 * session关键字,
	 */
	public String getSessionkey() {
		return this.sessionkey;
	}
	
	/**
	 * session关键字,
	 */
	public void setSessionkey(String value)
	 {
		this.sessionkey = value;
	}
	
	/**
	 * 返回用户角色值,
	 */
	public String getRoleValue() {
		return this.roleValue;
	}
	
	/**
	 * 返回用户角色值,
	 */
	public void setRoleValue(String value)
	 {
		this.roleValue = value;
	}
}
