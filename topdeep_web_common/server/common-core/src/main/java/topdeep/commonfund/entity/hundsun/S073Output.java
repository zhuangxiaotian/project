package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 投资收益明细查询接口(S073)
 */
public class S073Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回记录数,
	 */
	private String returnrecords = "";
	
	private List<S073OutputDetail> detail = new ArrayList<S073OutputDetail>();
	
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
	
	public List<S073OutputDetail> getDetail() {
		return this.detail;
	}
	
}
