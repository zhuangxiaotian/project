package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 份额流水查询(S058)
 */
public class S058Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	private List<S058OutputDetail> detail = new ArrayList<S058OutputDetail>();
	
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
	
	public List<S058OutputDetail> getDetail() {
		return this.detail;
	}
	
}
