package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝收益查询(数据中心版)(S072)
 */
public class S072Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 记录数,
	 */
	private String totalrecords = "";
	
	private List<S072OutputDetail> detail = new ArrayList<S072OutputDetail>();
	
	/**
	 * 记录数,
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 记录数,
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S072OutputDetail> getDetail() {
		return this.detail;
	}
	
}
