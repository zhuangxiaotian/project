package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝交易账号查询(数据中心版)(S070)
 */
public class S070Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录数,
	 */
	private String totalrecords = "";
	
	private List<S070OutputDetail> detail = new ArrayList<S070OutputDetail>();
	
	/**
	 * 总记录数,
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录数,
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S070OutputDetail> getDetail() {
		return this.detail;
	}
	
}
