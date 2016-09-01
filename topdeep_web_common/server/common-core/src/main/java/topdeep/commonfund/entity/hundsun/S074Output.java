package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 被推荐人明细查询接口(S074)
 */
public class S074Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回记录数,
	 */
	private String returnrecords = "";
	
	private List<S074OutputDetail> detail = new ArrayList<S074OutputDetail>();
	
	private List<S074OutputReturnlistDetail> returnlistDetail = new ArrayList<S074OutputReturnlistDetail>();
	
	/**
	 * 返回记录数,
	 */
	public String getReturnrecords() {
		return this.returnrecords;
	}
	
	/**
	 * 返回记录数,
	 */
	public void setReturnrecords(String value)
	 {
		this.returnrecords = value;
	}
	
	public List<S074OutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public List<S074OutputReturnlistDetail> getReturnlistDetail() {
		return this.returnlistDetail;
	}
	
}
