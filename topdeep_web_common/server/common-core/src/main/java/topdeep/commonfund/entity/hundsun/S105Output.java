package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 过户入申请查询(S105)
 */
public class S105Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回记录数,
	 */
	private String totalrecords = "";
	
	private List<S105OutputDetail> detail = new ArrayList<S105OutputDetail>();
	
	/**
	 * 返回记录数,
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 返回记录数,
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S105OutputDetail> getDetail() {
		return this.detail;
	}
	
}
