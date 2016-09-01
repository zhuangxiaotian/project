package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 华宝查询未付收益变化流水明细(S089)
 */
public class S089Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 起始时间到截止时间查询到的总记录数量,
	 */
	private String totalrecords = "";
	
	private List<S089OutputDetail> detail = new ArrayList<S089OutputDetail>();
	
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
	
	public List<S089OutputDetail> getDetail() {
		return this.detail;
	}
	
}
