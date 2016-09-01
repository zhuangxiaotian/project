package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 内部转托管(T022)
 */
public class T022Output extends HundsunBaseOutput implements Serializable {
	
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
