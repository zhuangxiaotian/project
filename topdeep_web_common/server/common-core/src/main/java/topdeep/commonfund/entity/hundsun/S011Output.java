package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 帐户资料修改查询(S011)
 */
public class S011Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	private List<S011OutputDetail> detail = new ArrayList<S011OutputDetail>();
	
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
	
	public List<S011OutputDetail> getDetail() {
		return this.detail;
	}
	
}
