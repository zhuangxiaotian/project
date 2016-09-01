package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询基金状态预设置(S091)
 */
public class S091Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 起始时间到截止时间查询到的总记录数量,
	 */
	private String totalrecords = "";
	
	private List<S091OutputDetail> detail = new ArrayList<S091OutputDetail>();
	
	/**
	 * 起始时间到截止时间查询到的总记录数量,
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 起始时间到截止时间查询到的总记录数量,
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S091OutputDetail> getDetail() {
		return this.detail;
	}
	
}
