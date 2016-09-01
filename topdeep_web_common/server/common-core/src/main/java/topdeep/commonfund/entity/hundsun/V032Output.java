package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户积分查询(V032)
 */
public class V032Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总可用积分,
	 */
	private String totaluseablepoint = "";
	
	private List<V032OutputDetail> detail = new ArrayList<V032OutputDetail>();
	
	/**
	 * 总可用积分,
	 */
	public String getTotaluseablepoint() {
		return this.totaluseablepoint;
	}
	
	/**
	 * 总可用积分,
	 */
	public void setTotaluseablepoint(String value)
	 {
		this.totaluseablepoint = value;
	}
	
	public List<V032OutputDetail> getDetail() {
		return this.detail;
	}
	
}
