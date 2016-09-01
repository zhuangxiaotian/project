package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 经纪人佣金信息查询(S027)
 */
public class S027Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private String totalrecords = "";
	
	private List<S027OutputDetail> detail = new ArrayList<S027OutputDetail>();
	
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
	
	public List<S027OutputDetail> getDetail() {
		return this.detail;
	}
	
}
