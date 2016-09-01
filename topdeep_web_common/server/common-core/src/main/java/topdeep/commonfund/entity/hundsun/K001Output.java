package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 颁发令牌(K001)
 */
public class K001Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 令牌,
	 */
	private String token;
	
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
}
