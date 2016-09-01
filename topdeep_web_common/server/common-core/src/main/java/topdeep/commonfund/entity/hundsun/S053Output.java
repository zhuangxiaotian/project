package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易信息查询(S053)
 */
public class S053Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,
	 */
	private Double totalrecords;
	
	private List<S053OutputDetail> detail = new ArrayList<S053OutputDetail>();
	
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
	
	public List<S053OutputDetail> getDetail() {
		return this.detail;
	}
	
}
