package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 短期理财到期日查询(S035)
 */
public class S035Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 最近赎回日期,
	 */
	private String nextredeemdate = "";
	
	/**
	 * 最近赎回日期,
	 */
	public String getNextredeemdate() {
		return this.nextredeemdate;
	}
	
	/**
	 * 最近赎回日期,
	 */
	public void setNextredeemdate(String value)
	 {
		this.nextredeemdate = value;
	}
}
