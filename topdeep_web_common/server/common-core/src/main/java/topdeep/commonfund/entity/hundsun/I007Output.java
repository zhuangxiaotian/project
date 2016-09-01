package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投申购协议变更(I007)
 */
public class I007Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 交易申请时间,
	 */
	private String tradedate = "";
	
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
	 * 交易申请时间,
	 */
	public String getTradedate() {
		return this.tradedate;
	}
	
	/**
	 * 交易申请时间,
	 */
	public void setTradedate(String value)
	 {
		this.tradedate = value;
	}
}
