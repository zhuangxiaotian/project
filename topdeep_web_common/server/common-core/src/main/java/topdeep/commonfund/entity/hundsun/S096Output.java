package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 业绩报酬查询接口(S096)
 */
public class S096Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回记录数,
	 */
	private String totalrecords = "";
	
	private List<S096OutputDetail> detail = new ArrayList<S096OutputDetail>();
	
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
	
	public List<S096OutputDetail> getDetail() {
		return this.detail;
	}
	
}
