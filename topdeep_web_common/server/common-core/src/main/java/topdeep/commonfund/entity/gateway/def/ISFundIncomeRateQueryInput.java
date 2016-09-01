package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金收益率查询功能输入参数
 */
public class ISFundIncomeRateQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 开始日期,
	 */
	private String startdate;
	
	/**
	 * 结束日期,
	 */
	private String enddate;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	public ISFundIncomeRateQueryInput() {
		this.setZ_funcCode("n1a");
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
}
