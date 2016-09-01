package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史收益模拟计算(I018)
 */
public class I018Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 开始日期,
	 */
	private String begindate = "";
	
	/**
	 * 截止日期,
	 */
	private String enddate = "";
	
	/**
	 * 标的指数,取字典"智能定投指数代码"
	 */
	private String exponentcode = "";
	
	/**
	 * 投资方式,"0":每期投入1000元;"1":一次投入10万
	 */
	private String investmenttype = "";
	
	/**
	 * 长期指数,取字典"趋势定投长期均线"
	 */
	private String longavgexponenttype = "";
	
	/**
	 * 中期指数,取字典"趋势定投中期均线"
	 */
	private String mediumavgexponenttype = "";
	
	/**
	 * 周期选择,W:按周;M:按月
	 */
	private String period = "";
	
	/**
	 * 短期指数,取字典"趋势定投短期均线"
	 */
	private String shortavgexponenttype = "";
	
	/**
	 * 申请条数,默认单笔查询最大值,即参数SYS_MAXCOUNT
	 */
	private Integer applyrecordno;
	
	/**
	 * 判断规则,默认:时点指标法
	 */
	private String caltype = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 初始化参数
	 */
	public I018Input() {
		this.setFunction("I018");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 开始日期,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 开始日期,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 截止日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 截止日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 标的指数,取字典"智能定投指数代码"
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 标的指数,取字典"智能定投指数代码"
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 投资方式,"0":每期投入1000元;"1":一次投入10万
	 */
	public String getInvestmenttype() {
		return this.investmenttype;
	}
	
	/**
	 * 投资方式,"0":每期投入1000元;"1":一次投入10万
	 */
	public void setInvestmenttype(String value)
	 {
		this.investmenttype = value;
	}
	
	/**
	 * 长期指数,取字典"趋势定投长期均线"
	 */
	public String getLongavgexponenttype() {
		return this.longavgexponenttype;
	}
	
	/**
	 * 长期指数,取字典"趋势定投长期均线"
	 */
	public void setLongavgexponenttype(String value)
	 {
		this.longavgexponenttype = value;
	}
	
	/**
	 * 中期指数,取字典"趋势定投中期均线"
	 */
	public String getMediumavgexponenttype() {
		return this.mediumavgexponenttype;
	}
	
	/**
	 * 中期指数,取字典"趋势定投中期均线"
	 */
	public void setMediumavgexponenttype(String value)
	 {
		this.mediumavgexponenttype = value;
	}
	
	/**
	 * 周期选择,W:按周;M:按月
	 */
	public String getPeriod() {
		return this.period;
	}
	
	/**
	 * 周期选择,W:按周;M:按月
	 */
	public void setPeriod(String value)
	 {
		this.period = value;
	}
	
	/**
	 * 短期指数,取字典"趋势定投短期均线"
	 */
	public String getShortavgexponenttype() {
		return this.shortavgexponenttype;
	}
	
	/**
	 * 短期指数,取字典"趋势定投短期均线"
	 */
	public void setShortavgexponenttype(String value)
	 {
		this.shortavgexponenttype = value;
	}
	
	/**
	 * 申请条数,默认单笔查询最大值,即参数SYS_MAXCOUNT
	 */
	public Integer getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,默认单笔查询最大值,即参数SYS_MAXCOUNT
	 */
	public void setApplyrecordno(Integer value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 判断规则,默认:时点指标法
	 */
	public String getCaltype() {
		return this.caltype;
	}
	
	/**
	 * 判断规则,默认:时点指标法
	 */
	public void setCaltype(String value)
	 {
		this.caltype = value;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public Integer getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public void setPageno(Integer value)
	 {
		this.pageno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("begindate", this.begindate);
		inputMap.put("enddate", this.enddate);
		inputMap.put("exponentcode", this.exponentcode);
		inputMap.put("investmenttype", this.investmenttype);
		inputMap.put("longavgexponenttype", this.longavgexponenttype);
		inputMap.put("mediumavgexponenttype", this.mediumavgexponenttype);
		inputMap.put("period", this.period);
		inputMap.put("shortavgexponenttype", this.shortavgexponenttype);
		inputMap.put("applyrecordno", this.formatInteger(this.applyrecordno));
		inputMap.put("caltype", this.caltype);
		inputMap.put("pageno", this.formatInteger(this.pageno));
	}
}
