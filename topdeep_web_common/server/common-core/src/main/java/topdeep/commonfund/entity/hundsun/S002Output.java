package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 当日交易申请查询(S002)
 */
public class S002Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Integer totalrecords;
	
	private List<S002OutputReturnlist> returnlist = new ArrayList<S002OutputReturnlist>();
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public Integer getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public void setTotalrecords(Integer value)
	 {
		this.totalrecords = value;
	}
	
	public List<S002OutputReturnlist> getReturnlist() {
		return this.returnlist;
	}
	
}
