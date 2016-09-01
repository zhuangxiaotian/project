package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金信息查询(S010)
 */
public class S010Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 记录总条数,
	 */
	private Integer totalrecords;
	
	private List<S010OutputReturnlist> returnlist = new ArrayList<S010OutputReturnlist>();
	
	/**
	 * 记录总条数,
	 */
	public Integer getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 记录总条数,
	 */
	public void setTotalrecords(Integer value)
	 {
		this.totalrecords = value;
	}
	
	public List<S010OutputReturnlist> getReturnlist() {
		return this.returnlist;
	}
	
}
