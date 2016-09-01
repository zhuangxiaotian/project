package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 邮箱绑定状态查询(V020)
 */
public class V020Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 邮箱地址,
	 */
	private String email = "";
	
	/**
	 * 绑定状态,0：未绑定；1：已绑定
	 */
	private String emailbind = "";
	
	/**
	 * 邮箱地址,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱地址,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 绑定状态,0：未绑定；1：已绑定
	 */
	public String getEmailbind() {
		return this.emailbind;
	}
	
	/**
	 * 绑定状态,0：未绑定；1：已绑定
	 */
	public void setEmailbind(String value)
	 {
		this.emailbind = value;
	}
}
