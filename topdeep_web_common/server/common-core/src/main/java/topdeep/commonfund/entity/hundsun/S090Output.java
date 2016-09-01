package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 华宝查询投资者累计收益(S090)
 */
public class S090Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 累计收益,
	 */
	private String newincome = "";
	
	/**
	 * 累计收益,
	 */
	public String getNewincome() {
		return this.newincome;
	}
	
	/**
	 * 累计收益,
	 */
	public void setNewincome(String value)
	 {
		this.newincome = value;
	}
}
