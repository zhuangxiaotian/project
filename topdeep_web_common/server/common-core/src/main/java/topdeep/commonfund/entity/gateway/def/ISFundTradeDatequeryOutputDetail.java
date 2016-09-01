package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 交易日期查询功能输出明细参数
 */
public class ISFundTradeDatequeryOutputDetail extends Object implements Serializable {
	
	/**
	 * 上次交易日期,
	 */
	private String lastBusiDate;
	
	/**
	 * 当前交易日期,
	 */
	private String busiDate;
	
	/**
	 * 下一交易日期,
	 */
	private String nextBusiDate;
	
	/**
	 * 上报日期,
	 */
	private String reportDate;
	
	/**
	 * 确认日期,
	 */
	private String confirmedDate;
	
	/**
	 * 收益日期,
	 */
	private String incomeDate;
	
	/**
	 * 赎回到账日期,
	 */
	private String redeemDate;
	
	/**
	 * 上次交易日期,
	 */
	public String getLastBusiDate() {
		return this.lastBusiDate;
	}
	
	/**
	 * 上次交易日期,
	 */
	public void setLastBusiDate(String value)
	 {
		this.lastBusiDate = value;
	}
	
	/**
	 * 当前交易日期,
	 */
	public String getBusiDate() {
		return this.busiDate;
	}
	
	/**
	 * 当前交易日期,
	 */
	public void setBusiDate(String value)
	 {
		this.busiDate = value;
	}
	
	/**
	 * 下一交易日期,
	 */
	public String getNextBusiDate() {
		return this.nextBusiDate;
	}
	
	/**
	 * 下一交易日期,
	 */
	public void setNextBusiDate(String value)
	 {
		this.nextBusiDate = value;
	}
	
	/**
	 * 上报日期,
	 */
	public String getReportDate() {
		return this.reportDate;
	}
	
	/**
	 * 上报日期,
	 */
	public void setReportDate(String value)
	 {
		this.reportDate = value;
	}
	
	/**
	 * 确认日期,
	 */
	public String getConfirmedDate() {
		return this.confirmedDate;
	}
	
	/**
	 * 确认日期,
	 */
	public void setConfirmedDate(String value)
	 {
		this.confirmedDate = value;
	}
	
	/**
	 * 收益日期,
	 */
	public String getIncomeDate() {
		return this.incomeDate;
	}
	
	/**
	 * 收益日期,
	 */
	public void setIncomeDate(String value)
	 {
		this.incomeDate = value;
	}
	
	/**
	 * 赎回到账日期,
	 */
	public String getRedeemDate() {
		return this.redeemDate;
	}
	
	/**
	 * 赎回到账日期,
	 */
	public void setRedeemDate(String value)
	 {
		this.redeemDate = value;
	}
}
