package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 分红方式修改(T007)
 */
public class T007Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请日期,
	 */
	private String requestdate = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
}
