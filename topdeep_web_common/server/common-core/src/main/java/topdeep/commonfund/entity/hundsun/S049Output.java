package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史收益查询(S049)
 */
public class S049Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录数,数据来源为DS时有效
	 */
	private String totalrecords = "";
	
	private List<S049OutputDetail> detail = new ArrayList<S049OutputDetail>();
	
	/**
	 * 总记录数,数据来源为DS时有效
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录数,数据来源为DS时有效
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S049OutputDetail> getDetail() {
		return this.detail;
	}
	
}
