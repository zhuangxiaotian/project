package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 被推荐人明细查询接口(S074)功能输出明细参数
 */
public class S074OutputReturnlistDetail extends Object implements Serializable {
	
	/**
	 * 业务类型,
	 */
	private String businflag = "";
	
	/**
	 * 被推荐人名称,
	 */
	private String custname = "";
	
	/**
	 * 推荐日期,
	 */
	private String requestdate = "";
	
	/**
	 * 推荐时间,
	 */
	private String requesttime = "";
	
	/**
	 * 业务类型,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 被推荐人名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 被推荐人名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 推荐日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 推荐日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 推荐时间,
	 */
	public String getRequesttime() {
		return this.requesttime;
	}
	
	/**
	 * 推荐时间,
	 */
	public void setRequesttime(String value)
	 {
		this.requesttime = value;
	}
}
