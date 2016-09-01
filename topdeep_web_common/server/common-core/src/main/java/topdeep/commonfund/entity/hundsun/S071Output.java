package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝交易信息查询(数据中心版)(S071)
 */
public class S071Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 记录数,
	 */
	private String totalrecords = "";
	
	private List<S071OutputDetail> detail = new ArrayList<S071OutputDetail>();
	
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
	
	public List<S071OutputDetail> getDetail() {
		return this.detail;
	}
	
}
