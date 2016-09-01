package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 支付结果通知(T004)
 */
public class T004Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial;
	
	/**
	 * 申请金额,
	 */
	private String amount;
	
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
	
	/**
	 * 申请金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 申请金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
}
