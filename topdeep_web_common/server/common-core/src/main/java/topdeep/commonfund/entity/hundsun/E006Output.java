package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询专户剩余额度(E006)
 */
public class E006Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,
	 */
	private Double totalrecords;
	
	private List<E006OutputDetail> detail = new ArrayList<E006OutputDetail>();
	
	/**
	 * 总记录条数,
	 */
	public Double getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,
	 */
	public void setTotalrecords(Double value)
	 {
		this.totalrecords = value;
	}
	
	public List<E006OutputDetail> getDetail() {
		return this.detail;
	}
	
}
