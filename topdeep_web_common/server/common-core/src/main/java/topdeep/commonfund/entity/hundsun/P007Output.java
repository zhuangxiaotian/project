package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易登录(P007)
 */
public class P007Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * sessionkey，成功时返回,
	 */
	private String sessionkey = "";
	
	/**
	 * sessionkey，成功时返回,
	 */
	public String getSessionkey() {
		return this.sessionkey;
	}
	
	/**
	 * sessionkey，成功时返回,
	 */
	public void setSessionkey(String value)
	 {
		this.sessionkey = value;
	}
}
