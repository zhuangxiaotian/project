package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 发送手机验证码(V012)
 */
public class V012Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 验证码,
	 */
	private String authcode = "";
	
	/**
	 * 验证码,
	 */
	public String getAuthcode() {
		return this.authcode;
	}
	
	/**
	 * 验证码,
	 */
	public void setAuthcode(String value)
	 {
		this.authcode = value;
	}
}
