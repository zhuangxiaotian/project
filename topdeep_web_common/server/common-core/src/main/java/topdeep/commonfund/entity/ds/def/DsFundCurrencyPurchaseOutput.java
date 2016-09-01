package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金购买(现金宝)功能输出参数
 */
public class DsFundCurrencyPurchaseOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applicationNo;
	
	/**
	 * 申请日期,
	 */
	private String applicationDate;
	
	public DsFundCurrencyPurchaseOutput() {
		this.setZ_funcCode("u09");
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplicationNo(String value)
	 {
		this.applicationNo = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getApplicationDate() {
		return this.applicationDate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setApplicationDate(String value)
	 {
		this.applicationDate = value;
	}
}
