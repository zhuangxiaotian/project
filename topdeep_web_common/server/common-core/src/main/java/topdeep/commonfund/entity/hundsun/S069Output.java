package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝份额查询(数据中心版)(S069)
 */
public class S069Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 记录数,
	 */
	private String totalrecords = "";
	
	private List<S069OutputDetail> detail = new ArrayList<S069OutputDetail>();
	
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
	
	public List<S069OutputDetail> getDetail() {
		return this.detail;
	}
	
}
