package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易申请查询(S003)
 */
public class S003Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	private List<S003OutputDetail> detail = new ArrayList<S003OutputDetail>();
	
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
	
	public List<S003OutputDetail> getDetail() {
		return this.detail;
	}
	
}
