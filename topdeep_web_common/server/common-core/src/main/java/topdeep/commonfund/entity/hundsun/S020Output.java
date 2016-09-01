package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 短期理财明细查询(S020)
 */
public class S020Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,仅当数据来源传DS时有效
	 */
	private String totalrecords = "";
	
	private List<S020OutputDetail> detail = new ArrayList<S020OutputDetail>();
	
	/**
	 * 总记录条数,仅当数据来源传DS时有效
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,仅当数据来源传DS时有效
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S020OutputDetail> getDetail() {
		return this.detail;
	}
	
}
