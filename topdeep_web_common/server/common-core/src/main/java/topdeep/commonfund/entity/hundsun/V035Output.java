package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询客户的积分变换情况(V035)
 */
public class V035Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回总记录数,
	 */
	private String returncount = "";
	
	private List<V035OutputDetail> detail = new ArrayList<V035OutputDetail>();
	
	/**
	 * 返回总记录数,
	 */
	public String getReturncount() {
		return this.returncount;
	}
	
	/**
	 * 返回总记录数,
	 */
	public void setReturncount(String value)
	 {
		this.returncount = value;
	}
	
	public List<V035OutputDetail> getDetail() {
		return this.detail;
	}
	
}
