package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 积分兑换列表(V033)
 */
public class V033Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 记录数,
	 */
	private String returncount = "";
	
	private List<V033OutputDetail> detail = new ArrayList<V033OutputDetail>();
	
	/**
	 * 记录数,
	 */
	public String getReturncount() {
		return this.returncount;
	}
	
	/**
	 * 记录数,
	 */
	public void setReturncount(String value)
	 {
		this.returncount = value;
	}
	
	public List<V033OutputDetail> getDetail() {
		return this.detail;
	}
	
}
