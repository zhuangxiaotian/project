package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户积分查询(V032)功能输出明细参数
 */
public class V032OutputDetail extends Object implements Serializable {
	
	/**
	 * 终止时间,
	 */
	private String enddate = "";
	
	/**
	 * 起始时间,
	 */
	private String startdate = "";
	
	/**
	 * 可用积分,
	 */
	private String useablepoint = "";
	
	/**
	 * 终止时间,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 终止时间,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 起始时间,
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始时间,
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 可用积分,
	 */
	public String getUseablepoint() {
		return this.useablepoint;
	}
	
	/**
	 * 可用积分,
	 */
	public void setUseablepoint(String value)
	 {
		this.useablepoint = value;
	}
}
