package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 份额流水查询功能输入参数
 */
public class ISShareWaterQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 开始日期,
	 */
	private String startdate;
	
	/**
	 * 结束日期,
	 */
	private String enddate;
	
	/**
	 * 基金帐号,
	 */
	private String fundacco;
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco;
	
	public ISShareWaterQueryInput() {
		this.setZ_funcCode("u1j");
	}
	
	/**
	 * 开始日期,
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 开始日期,
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 结束日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 基金帐号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 交易帐号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
}
