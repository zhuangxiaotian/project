package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 过户入确认查询(S106)
 */
public class S106Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回总记录数,
	 */
	private String totalrecords = "";
	
	private List<S106OutputDetail> detail = new ArrayList<S106OutputDetail>();
	
	/**
	 * 返回总记录数,
	 */
	public String getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 返回总记录数,
	 */
	public void setTotalrecords(String value)
	 {
		this.totalrecords = value;
	}
	
	public List<S106OutputDetail> getDetail() {
		return this.detail;
	}
	
}
