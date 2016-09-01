package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息查询(S103)
 */
public class S103Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录数,
	 */
	private String totalrecords = "";
	
	private List<S103OutputDetail> detail = new ArrayList<S103OutputDetail>();
	
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
	
	public List<S103OutputDetail> getDetail() {
		return this.detail;
	}
	
}
