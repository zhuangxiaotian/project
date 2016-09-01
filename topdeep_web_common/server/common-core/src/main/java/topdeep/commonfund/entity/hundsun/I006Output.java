package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投申购协议新增(I006)
 */
public class I006Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 协议号,
	 */
	private String xyh = "";
	
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
	 * 协议号,
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 协议号,
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
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
