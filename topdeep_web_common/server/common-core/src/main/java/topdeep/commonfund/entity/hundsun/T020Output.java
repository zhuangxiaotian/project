package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 快速过户(T020)
 */
public class T020Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,详见返回码说明
	 */
	private String applyserial = "";
	
	/**
	 * 申请日期,
	 */
	private String applydate = "";
	
	/**
	 * 手续费,
	 */
	private String charge = "";
	
	/**
	 * 申请编号,详见返回码说明
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,详见返回码说明
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setApplydate(String value)
	 {
		this.applydate = value;
	}
	
	/**
	 * 手续费,
	 */
	public String getCharge() {
		return this.charge;
	}
	
	/**
	 * 手续费,
	 */
	public void setCharge(String value)
	 {
		this.charge = value;
	}
}
