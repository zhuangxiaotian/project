package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金开放日期查询(S085)
 */
public class S085Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录数,
	 */
	private String totalrecords = "";
	
	private List<S085OutputDetail> detail = new ArrayList<S085OutputDetail>();
	
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
	
	public List<S085OutputDetail> getDetail() {
		return this.detail;
	}
	
}
