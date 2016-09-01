package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 手机绑定信息查询(V011)
 */
public class V011Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 绑定手机,
	 */
	private String mobile = "";
	
	/**
	 * 手机绑定状态,
	 */
	private String mobilebind = "";
	
	/**
	 * 手机登陆绑定状态,
	 */
	private String mobileloginbind = "";
	
	/**
	 * 绑定手机,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 绑定手机,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	/**
	 * 手机绑定状态,
	 */
	public String getMobilebind() {
		return this.mobilebind;
	}
	
	/**
	 * 手机绑定状态,
	 */
	public void setMobilebind(String value)
	 {
		this.mobilebind = value;
	}
	
	/**
	 * 手机登陆绑定状态,
	 */
	public String getMobileloginbind() {
		return this.mobileloginbind;
	}
	
	/**
	 * 手机登陆绑定状态,
	 */
	public void setMobileloginbind(String value)
	 {
		this.mobileloginbind = value;
	}
}
