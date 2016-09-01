package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝基金行情查询(S059)
 */
public class S059Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private String totalrecords = "";
	
	private List<S059OutputDetail> detail = new ArrayList<S059OutputDetail>();
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S059OutputDetail> getDetail() {
		return this.detail;
	}
	
}
