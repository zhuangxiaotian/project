package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 子账户交易审核(C059)
 */
public class C059Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 凭证编号,
	 */
	private String serial = "";
	
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
	 * 凭证编号,
	 */
	public String getSerial() {
		return this.serial;
	}
	
	/**
	 * 凭证编号,
	 */
	public void setSerial(String value)
	 {
		this.serial = value;
	}
}
