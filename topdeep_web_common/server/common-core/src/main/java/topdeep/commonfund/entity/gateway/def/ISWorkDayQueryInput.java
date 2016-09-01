package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 相关工作日查询功能输入参数
 */
public class ISWorkDayQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 参考工作日,
	 */
	private java.util.Date queryWorkDay;
	
	/**
	 * 间隔天数T+N,
	 */
	private Integer intervalDays;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 交易账号,
	 */
	private String tradeAcc;
	
	/**
	 * 业务代码,
	 */
	private String callingCode;
	
	public ISWorkDayQueryInput() {
		this.setZ_funcCode("n0p");
	}
	
	/**
	 * 参考工作日,
	 */
	public java.util.Date getQueryWorkDay() {
		return this.queryWorkDay;
	}
	
	/**
	 * 参考工作日,
	 */
	public void setQueryWorkDay(java.util.Date value)
	 {
		this.queryWorkDay = value;
	}
	
	/**
	 * 间隔天数T+N,
	 */
	public Integer getIntervalDays() {
		return this.intervalDays;
	}
	
	/**
	 * 间隔天数T+N,
	 */
	public void setIntervalDays(Integer value)
	 {
		this.intervalDays = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeAcc() {
		return this.tradeAcc;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeAcc(String value)
	 {
		this.tradeAcc = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getCallingCode() {
		return this.callingCode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setCallingCode(String value)
	 {
		this.callingCode = value;
	}
}
