package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金风险等级查询(S104)
 */
public class S104Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回总记录数,
	 */
	private Double totalrecords;
	
	private List<S104OutputDetail> detail = new ArrayList<S104OutputDetail>();
	
	/**
	 * 返回总记录数,
	 */
	public Double getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 返回总记录数,
	 */
	public void setTotalrecords(Double value)
	 {
		this.totalrecords = value;
	}
	
	public List<S104OutputDetail> getDetail() {
		return this.detail;
	}
	
}
