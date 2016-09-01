package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝收益查询(S054)
 */
public class S054Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	private List<S054OutputDetail> detail = new ArrayList<S054OutputDetail>();
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public Double getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public void setTotalrecords(Double value)
	 {
		this.totalrecords = value;
	}
	
	public List<S054OutputDetail> getDetail() {
		return this.detail;
	}
	
}
