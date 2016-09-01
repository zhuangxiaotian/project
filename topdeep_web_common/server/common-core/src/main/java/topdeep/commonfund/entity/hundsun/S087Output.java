package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 经纪人信息查询(S087)
 */
public class S087Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回记录数,
	 */
	private String returnrecord = "";
	
	/**
	 * 总记录数,
	 */
	private String totalrecord = "";
	
	private List<S087OutputDetail> detail = new ArrayList<S087OutputDetail>();
	
	/**
	 * 返回记录数,
	 */
	public String getReturnrecord() {
		return this.returnrecord;
	}
	
	/**
	 * 返回记录数,
	 */
	public void setReturnrecord(String value)
	 {
		this.returnrecord = value;
	}
	
	/**
	 * 总记录数,
	 */
	public String getTotalrecord() {
		return this.totalrecord;
	}
	
	/**
	 * 总记录数,
	 */
	public void setTotalrecord(String value)
	 {
		this.totalrecord = value;
	}
	
	public List<S087OutputDetail> getDetail() {
		return this.detail;
	}
	
}
