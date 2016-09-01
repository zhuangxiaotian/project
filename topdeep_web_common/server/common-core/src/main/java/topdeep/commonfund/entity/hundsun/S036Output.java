package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 错误日志事件查询(S036)
 */
public class S036Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录数,
	 */
	private String totalNum = "";
	
	private List<S036OutputDetail> detail = new ArrayList<S036OutputDetail>();
	
	/**
	 * 总记录数,
	 */
	public String getTotalNum() {
		return this.totalNum;
	}
	
	/**
	 * 总记录数,
	 */
	public void setTotalNum(String value)
	 {
		this.totalNum = value;
	}
	
	public List<S036OutputDetail> getDetail() {
		return this.detail;
	}
	
}
