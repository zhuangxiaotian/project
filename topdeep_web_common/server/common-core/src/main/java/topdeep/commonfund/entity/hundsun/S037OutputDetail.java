package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金收益率查询(S037)功能输出明细参数
 */
public class S037OutputDetail extends Object implements Serializable {
	
	/**
	 * 日期类型,
	 */
	private String date = "";
	
	/**
	 * 截至日期,
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 净值,
	 */
	private String netvalue = "";
	
	/**
	 * 日增长率，4位小数,
	 */
	private String dayinc = "";
	
	/**
	 * 日增长率年化，4位小数,
	 */
	private String dayincyear = "";
	
	/**
	 * 净值增长率，4位小数,
	 */
	private String inc = "";
	
	/**
	 * 净值增长率年化，4位小数,
	 */
	private String incyear = "";
	
	/**
	 * 月增长率，4位小数,
	 */
	private String monthinc = "";
	
	/**
	 * 月增长率年华，4位小数,
	 */
	private String monthincyear = "";
	
	/**
	 * 季增长率年化，4位小数,
	 */
	private String seasonhinc = "";
	
	/**
	 * 季增长率年化，4位小数,
	 */
	private String seasonhincyear = "";
	
	/**
	 * 周增长率，4位小数,
	 */
	private String weekinc = "";
	
	/**
	 * 周增长率年化，4位小数,
	 */
	private String weekincyear = "";
	
	/**
	 * 年增长率，4位小数,
	 */
	private String yearinc = "";
	
	/**
	 * 年增长率，4位小数,
	 */
	private String yearincyear = "";
	
	/**
	 * 半年增长率,4位小数,
	 */
	private String halfinc = "";
	
	/**
	 * 半年增长率年化,4位小数,
	 */
	private String halfincyear = "";
	
	/**
	 * 3年增长率，4位小数,
	 */
	private String threeyearinc = "";
	
	/**
	 * 3年增长率年化，4位小数,
	 */
	private String threeyearincyear = "";
	
	/**
	 * 2年增长率，4位小数,
	 */
	private String twoyearinc = "";
	
	/**
	 * 2年增长率年化，4位小数,
	 */
	private String twoyearincyear = "";
	
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
	 * 日增长率，4位小数,
	 */
	public String getDayinc() {
		return this.dayinc;
	}
	
	/**
	 * 日增长率，4位小数,
	 */
	public void setDayinc(String value)
	 {
		this.dayinc = value;
	}
	
	/**
	 * 日增长率年化，4位小数,
	 */
	public String getDayincyear() {
		return this.dayincyear;
	}
	
	/**
	 * 日增长率年化，4位小数,
	 */
	public void setDayincyear(String value)
	 {
		this.dayincyear = value;
	}
	
	/**
	 * 净值增长率，4位小数,
	 */
	public String getInc() {
		return this.inc;
	}
	
	/**
	 * 净值增长率，4位小数,
	 */
	public void setInc(String value)
	 {
		this.inc = value;
	}
	
	/**
	 * 净值增长率年化，4位小数,
	 */
	public String getIncyear() {
		return this.incyear;
	}
	
	/**
	 * 净值增长率年化，4位小数,
	 */
	public void setIncyear(String value)
	 {
		this.incyear = value;
	}
	
	/**
	 * 月增长率，4位小数,
	 */
	public String getMonthinc() {
		return this.monthinc;
	}
	
	/**
	 * 月增长率，4位小数,
	 */
	public void setMonthinc(String value)
	 {
		this.monthinc = value;
	}
	
	/**
	 * 月增长率年华，4位小数,
	 */
	public String getMonthincyear() {
		return this.monthincyear;
	}
	
	/**
	 * 月增长率年华，4位小数,
	 */
	public void setMonthincyear(String value)
	 {
		this.monthincyear = value;
	}
	
	/**
	 * 季增长率年化，4位小数,
	 */
	public String getSeasonhinc() {
		return this.seasonhinc;
	}
	
	/**
	 * 季增长率年化，4位小数,
	 */
	public void setSeasonhinc(String value)
	 {
		this.seasonhinc = value;
	}
	
	/**
	 * 季增长率年化，4位小数,
	 */
	public String getSeasonhincyear() {
		return this.seasonhincyear;
	}
	
	/**
	 * 季增长率年化，4位小数,
	 */
	public void setSeasonhincyear(String value)
	 {
		this.seasonhincyear = value;
	}
	
	/**
	 * 周增长率，4位小数,
	 */
	public String getWeekinc() {
		return this.weekinc;
	}
	
	/**
	 * 周增长率，4位小数,
	 */
	public void setWeekinc(String value)
	 {
		this.weekinc = value;
	}
	
	/**
	 * 周增长率年化，4位小数,
	 */
	public String getWeekincyear() {
		return this.weekincyear;
	}
	
	/**
	 * 周增长率年化，4位小数,
	 */
	public void setWeekincyear(String value)
	 {
		this.weekincyear = value;
	}
	
	/**
	 * 年增长率，4位小数,
	 */
	public String getYearinc() {
		return this.yearinc;
	}
	
	/**
	 * 年增长率，4位小数,
	 */
	public void setYearinc(String value)
	 {
		this.yearinc = value;
	}
	
	/**
	 * 年增长率，4位小数,
	 */
	public String getYearincyear() {
		return this.yearincyear;
	}
	
	/**
	 * 年增长率，4位小数,
	 */
	public void setYearincyear(String value)
	 {
		this.yearincyear = value;
	}
	
	/**
	 * 半年增长率,4位小数,
	 */
	public String getHalfinc() {
		return this.halfinc;
	}
	
	/**
	 * 半年增长率,4位小数,
	 */
	public void setHalfinc(String value)
	 {
		this.halfinc = value;
	}
	
	/**
	 * 半年增长率年化,4位小数,
	 */
	public String getHalfincyear() {
		return this.halfincyear;
	}
	
	/**
	 * 半年增长率年化,4位小数,
	 */
	public void setHalfincyear(String value)
	 {
		this.halfincyear = value;
	}
	
	/**
	 * 3年增长率，4位小数,
	 */
	public String getThreeyearinc() {
		return this.threeyearinc;
	}
	
	/**
	 * 3年增长率，4位小数,
	 */
	public void setThreeyearinc(String value)
	 {
		this.threeyearinc = value;
	}
	
	/**
	 * 3年增长率年化，4位小数,
	 */
	public String getThreeyearincyear() {
		return this.threeyearincyear;
	}
	
	/**
	 * 3年增长率年化，4位小数,
	 */
	public void setThreeyearincyear(String value)
	 {
		this.threeyearincyear = value;
	}
	
	/**
	 * 2年增长率，4位小数,
	 */
	public String getTwoyearinc() {
		return this.twoyearinc;
	}
	
	/**
	 * 2年增长率，4位小数,
	 */
	public void setTwoyearinc(String value)
	 {
		this.twoyearinc = value;
	}
	
	/**
	 * 2年增长率年化，4位小数,
	 */
	public String getTwoyearincyear() {
		return this.twoyearincyear;
	}
	
	/**
	 * 2年增长率年化，4位小数,
	 */
	public void setTwoyearincyear(String value)
	 {
		this.twoyearincyear = value;
	}
}
