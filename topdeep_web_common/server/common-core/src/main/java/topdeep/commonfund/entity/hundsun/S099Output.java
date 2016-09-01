package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史测评查询(S099)
 */
public class S099Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录数,
	 */
	private String totalrecords = "";
	
	private List<S099OutputDetail> detail = new ArrayList<S099OutputDetail>();
	
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
	
	public List<S099OutputDetail> getDetail() {
		return this.detail;
	}
	
}
