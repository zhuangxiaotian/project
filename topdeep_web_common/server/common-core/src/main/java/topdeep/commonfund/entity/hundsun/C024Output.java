package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询风险匹配基金(C024)
 */
public class C024Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录数,
	 */
	private Integer totalrecords;
	
	private List<C024OutputDetail> detail = new ArrayList<C024OutputDetail>();
	
	/**
	 * 总记录数,
	 */
	public Integer getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录数,
	 */
	public void setTotalrecords(Integer value)
	 {
		this.totalrecords = value;
	}
	
	public List<C024OutputDetail> getDetail() {
		return this.detail;
	}
	
}
