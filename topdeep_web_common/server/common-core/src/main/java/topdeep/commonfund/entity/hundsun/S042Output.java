package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * CMS内容查询(S042)
 */
public class S042Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录数,格式：yyyymmdd
	 */
	private String totalrecords = "";
	
	private List<S042OutputDetail> detail = new ArrayList<S042OutputDetail>();
	
	/**
	 * 总记录数,格式：yyyymmdd
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录数,格式：yyyymmdd
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S042OutputDetail> getDetail() {
		return this.detail;
	}
	
}
