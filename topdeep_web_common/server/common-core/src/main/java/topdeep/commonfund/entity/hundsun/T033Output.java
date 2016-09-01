package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 免sessionkey基金买入(T033)
 */
public class T033Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
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
