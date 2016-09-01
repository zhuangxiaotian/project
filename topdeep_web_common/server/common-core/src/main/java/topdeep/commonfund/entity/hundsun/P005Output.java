package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 取会话标示(P005)
 */
public class P005Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 会话标示,
	 */
	private String sessionkey = "";
	
	/**
	 * 会话标示,
	 */
	public String getSessionkey() {
		return this.sessionkey;
	}
	
	/**
	 * 会话标示,
	 */
	public void setSessionkey(String value)
	 {
		this.sessionkey = value;
	}
}
