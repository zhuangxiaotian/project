package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金收益率查询功能输出明细参数
 */
public class ISFundIncomeRateQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 基金名称,
	 */
	private String fundname;
	
	/**
	 * 日增长率,
	 */
	private String dayinc;
	
	/**
	 * 年增长率,
	 */
	private String yearinc;
	
	/**
	 * 周增长率年化,
	 */
	private String weekincyear;
	
	/**
	 * 净值增长率年化,
	 */
	private String incyear;
	
	/**
	 * 季增长率年化,
	 */
	private String seasonhinc;
	
	/**
	 * 周增长率,
	 */
	private String weekinc;
	
	/**
	 * 净值,
	 */
	private String netvalue;
	
	/**
	 * 季增长率年化,
	 */
	private String seasonhincyear;
	
	/**
	 * 净值增长率,
	 */
	private String inc;
	
	/**
	 * 月增长率年华,
	 */
	private String monthincyear;
	
	/**
	 * 月增长率,
	 */
	private String monthinc;
	
	/**
	 * 日增长率年化,
	 */
	private String dayincyear;
	
	/**
	 * 年增长率,
	 */
	private String yearincyear;
	
	/**
	 * 日期类型,
	 */
	private String date;
	
	/**
	 * 截至日期,
	 */
	private String enddate;
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 日增长率,
	 */
	public String getDayinc() {
		return this.dayinc;
	}
	
	/**
	 * 日增长率,
	 */
	public void setDayinc(String value)
	 {
		this.dayinc = value;
	}
	
	/**
	 * 年增长率,
	 */
	public String getYearinc() {
		return this.yearinc;
	}
	
	/**
	 * 年增长率,
	 */
	public void setYearinc(String value)
	 {
		this.yearinc = value;
	}
	
	/**
	 * 周增长率年化,
	 */
	public String getWeekincyear() {
		return this.weekincyear;
	}
	
	/**
	 * 周增长率年化,
	 */
	public void setWeekincyear(String value)
	 {
		this.weekincyear = value;
	}
	
	/**
	 * 净值增长率年化,
	 */
	public String getIncyear() {
		return this.incyear;
	}
	
	/**
	 * 净值增长率年化,
	 */
	public void setIncyear(String value)
	 {
		this.incyear = value;
	}
	
	/**
	 * 季增长率年化,
	 */
	public String getSeasonhinc() {
		return this.seasonhinc;
	}
	
	/**
	 * 季增长率年化,
	 */
	public void setSeasonhinc(String value)
	 {
		this.seasonhinc = value;
	}
	
	/**
	 * 周增长率,
	 */
	public String getWeekinc() {
		return this.weekinc;
	}
	
	/**
	 * 周增长率,
	 */
	public void setWeekinc(String value)
	 {
		this.weekinc = value;
	}
	
	/**
	 * 净值,
	 */
	public String getNetvalue() {
		return this.netvalue;
	}
	
	/**
	 * 净值,
	 */
	public void setNetvalue(String value)
	 {
		this.netvalue = value;
	}
	
	/**
	 * 季增长率年化,
	 */
	public String getSeasonhincyear() {
		return this.seasonhincyear;
	}
	
	/**
	 * 季增长率年化,
	 */
	public void setSeasonhincyear(String value)
	 {
		this.seasonhincyear = value;
	}
	
	/**
	 * 净值增长率,
	 */
	public String getInc() {
		return this.inc;
	}
	
	/**
	 * 净值增长率,
	 */
	public void setInc(String value)
	 {
		this.inc = value;
	}
	
	/**
	 * 月增长率年华,
	 */
	public String getMonthincyear() {
		return this.monthincyear;
	}
	
	/**
	 * 月增长率年华,
	 */
	public void setMonthincyear(String value)
	 {
		this.monthincyear = value;
	}
	
	/**
	 * 月增长率,
	 */
	public String getMonthinc() {
		return this.monthinc;
	}
	
	/**
	 * 月增长率,
	 */
	public void setMonthinc(String value)
	 {
		this.monthinc = value;
	}
	
	/**
	 * 日增长率年化,
	 */
	public String getDayincyear() {
		return this.dayincyear;
	}
	
	/**
	 * 日增长率年化,
	 */
	public void setDayincyear(String value)
	 {
		this.dayincyear = value;
	}
	
	/**
	 * 年增长率,
	 */
	public String getYearincyear() {
		return this.yearincyear;
	}
	
	/**
	 * 年增长率,
	 */
	public void setYearincyear(String value)
	 {
		this.yearincyear = value;
	}
	
	/**
	 * 日期类型,
	 */
	public String getDate() {
		return this.date;
	}
	
	/**
	 * 日期类型,
	 */
	public void setDate(String value)
	 {
		this.date = value;
	}
	
	/**
	 * 截至日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 截至日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
}
