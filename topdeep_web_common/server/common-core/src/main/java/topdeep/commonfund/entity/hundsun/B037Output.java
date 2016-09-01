package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 还款(缴费)账户信息验证(富友渠道)(B037)
 */
public class B037Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 机构日期,
	 */
	private String accoreqdate = "";
	
	/**
	 * 机构流水号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 富友日期,
	 */
	private String banknetdate = "";
	
	/**
	 * 富友流水号,
	 */
	private String otherserial = "";
	
	/**
	 * 机构日期,
	 */
	public String getAccoreqdate() {
		return this.accoreqdate;
	}
	
	/**
	 * 机构日期,
	 */
	public void setAccoreqdate(String value)
	 {
		this.accoreqdate = value;
	}
	
	/**
	 * 机构流水号,
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 机构流水号,
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 富友日期,
	 */
	public String getBanknetdate() {
		return this.banknetdate;
	}
	
	/**
	 * 富友日期,
	 */
	public void setBanknetdate(String value)
	 {
		this.banknetdate = value;
	}
	
	/**
	 * 富友流水号,
	 */
	public String getOtherserial() {
		return this.otherserial;
	}
	
	/**
	 * 富友流水号,
	 */
	public void setOtherserial(String value)
	 {
		this.otherserial = value;
	}
}
