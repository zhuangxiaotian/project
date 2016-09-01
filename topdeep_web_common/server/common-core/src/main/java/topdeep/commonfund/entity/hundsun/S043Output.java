package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预计还款日期查询(S043)
 */
public class S043Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 还款到账日,
	 */
	private String redeiptdate = "";
	
	/**
	 * 申请日期,预约还款返回
	 */
	private String requestdate = "";
	
	/**
	 * 还款到账日,
	 */
	public String getRedeiptdate() {
		return this.redeiptdate;
	}
	
	/**
	 * 还款到账日,
	 */
	public void setRedeiptdate(String value)
	 {
		this.redeiptdate = value;
	}
	
	/**
	 * 申请日期,预约还款返回
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,预约还款返回
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
}
