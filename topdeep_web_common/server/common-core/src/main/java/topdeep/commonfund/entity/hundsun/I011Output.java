package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投赎回协议变更(I011)
 */
public class I011Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 下次交易日期,
	 */
	private String nextdate = "";
	
	/**
	 * 凭证编号,
	 */
	private String serial = "";
	
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
	 * 下次交易日期,
	 */
	public String getNextdate() {
		return this.nextdate;
	}
	
	/**
	 * 下次交易日期,
	 */
	public void setNextdate(String value)
	 {
		this.nextdate = value;
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
