package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 验证令牌(K002)
 */
public class K002Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 用户信息,
	 */
	private String userid;
	
	/**
	 * 用户信息,
	 */
	public String getUserid() {
		return this.userid;
	}
	
	/**
	 * 用户信息,
	 */
	public void setUserid(String value)
	 {
		this.userid = value;
	}
}
