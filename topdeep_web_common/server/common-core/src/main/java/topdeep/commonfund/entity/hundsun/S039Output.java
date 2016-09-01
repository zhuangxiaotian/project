package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * T+0业务状态查询(S039)
 */
public class S039Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 系统状态,
	 */
	private String allowflag = "";
	
	/**
	 * 系统状态,
	 */
	public String getAllowflag() {
		return this.allowflag;
	}
	
	/**
	 * 系统状态,
	 */
	public void setAllowflag(String value)
	 {
		this.allowflag = value;
	}
}
