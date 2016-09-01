package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 重置注册密码(C066)
 */
public class C066Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 密码,
	 */
	private String password = "";
	
	/**
	 * 密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
}
