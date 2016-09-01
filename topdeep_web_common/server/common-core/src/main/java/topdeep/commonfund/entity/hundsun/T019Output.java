package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇款交易退款(T019)
 */
public class T019Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 退款流水号,
	 */
	private String applyserial = "";
	
	/**
	 * 退款流水号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 退款流水号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
}
