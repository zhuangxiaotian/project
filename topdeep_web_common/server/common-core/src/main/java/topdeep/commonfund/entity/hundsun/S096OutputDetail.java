package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 业绩报酬查询接口(S096)功能输出明细参数
 */
public class S096OutputDetail extends Object implements Serializable {
	
	/**
	 * 期初日期,
	 */
	private String begindate = "";
	
	/**
	 * 期初净值 四位小数,
	 */
	private Double beginnetvalue;
	
	/**
	 * 期初累计净值 四位小数,
	 */
	private Double begintotalnetvalue;
	
	/**
	 * 分红总金额,
	 */
	private Double bonusbalance;
	
	/**
	 * 业务标识,赎回03 分红74 统一58,
	 */
	private String businflag = "";
	
	/**
	 * 确认日期,
	 */
	private String confirmdate = "";
	
	/**
	 * TA确认号,
	 */
	private String confirmserialno = "";
	
	/**
	 * 确认份额 两位小数,
	 */
	private Double confirmshare;
	
	/**
	 * 当前收益率 八位小数,
	 */
	private Double currentratio;
	
	/**
	 * 客户名称,
	 */
	private String custname = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 实际提成金额 两位小数,
	 */
	private Double deductbalance;
	
	/**
	 * 累计业绩报酬总金额 两位小数,
	 */
	private Double deductedbalance;
	
	/**
	 * 实际提成份额 两位小数,
	 */
	private Double factdeductshares;
	
	/**
	 * 业绩报酬计算公式,
	 */
	private String formula = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 产品名称,
	 */
	private String fundname = "";
	
	/**
	 * 持有天数,
	 */
	private String holdday = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	/**
	 * 单位净值 四位小数,
	 */
	private Double netvalue;
	
	/**
	 * 份额注册日期,
	 */
	private String registdate = "";
	
	/**
	 * 申请日期,
	 */
	private String requestdate = "";
	
	/**
	 * 累计净值 四位小数,
	 */
	private Double totalnetvalue;
	
	/**
	 * 交易费用 两位小数,
	 */
	private Double tradefare;
	
	/**
	 * 年天数,
	 */
	private String yeardays = "";
	
	/**
	 * 年化收益率 八位小数,
	 */
	private Double yearratio;
	
	/**
	 * 期初日期,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 期初日期,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 期初净值 四位小数,
	 */
	public Double getBeginnetvalue() {
		return this.beginnetvalue;
	}
	
	/**
	 * 期初净值 四位小数,
	 */
	public void setBeginnetvalue(Double value)
	 {
		this.beginnetvalue = value;
	}
	
	/**
	 * 期初累计净值 四位小数,
	 */
	public Double getBegintotalnetvalue() {
		return this.begintotalnetvalue;
	}
	
	/**
	 * 期初累计净值 四位小数,
	 */
	public void setBegintotalnetvalue(Double value)
	 {
		this.begintotalnetvalue = value;
	}
	
	/**
	 * 分红总金额,
	 */
	public Double getBonusbalance() {
		return this.bonusbalance;
	}
	
	/**
	 * 分红总金额,
	 */
	public void setBonusbalance(Double value)
	 {
		this.bonusbalance = value;
	}
	
	/**
	 * 业务标识,赎回03 分红74 统一58,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务标识,赎回03 分红74 统一58,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 确认日期,
	 */
	public String getConfirmdate() {
		return this.confirmdate;
	}
	
	/**
	 * 确认日期,
	 */
	public void setConfirmdate(String value)
	 {
		this.confirmdate = value;
	}
	
	/**
	 * TA确认号,
	 */
	public String getConfirmserialno() {
		return this.confirmserialno;
	}
	
	/**
	 * TA确认号,
	 */
	public void setConfirmserialno(String value)
	 {
		this.confirmserialno = value;
	}
	
	/**
	 * 确认份额 两位小数,
	 */
	public Double getConfirmshare() {
		return this.confirmshare;
	}
	
	/**
	 * 确认份额 两位小数,
	 */
	public void setConfirmshare(Double value)
	 {
		this.confirmshare = value;
	}
	
	/**
	 * 当前收益率 八位小数,
	 */
	public Double getCurrentratio() {
		return this.currentratio;
	}
	
	/**
	 * 当前收益率 八位小数,
	 */
	public void setCurrentratio(Double value)
	 {
		this.currentratio = value;
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 实际提成金额 两位小数,
	 */
	public Double getDeductbalance() {
		return this.deductbalance;
	}
	
	/**
	 * 实际提成金额 两位小数,
	 */
	public void setDeductbalance(Double value)
	 {
		this.deductbalance = value;
	}
	
	/**
	 * 累计业绩报酬总金额 两位小数,
	 */
	public Double getDeductedbalance() {
		return this.deductedbalance;
	}
	
	/**
	 * 累计业绩报酬总金额 两位小数,
	 */
	public void setDeductedbalance(Double value)
	 {
		this.deductedbalance = value;
	}
	
	/**
	 * 实际提成份额 两位小数,
	 */
	public Double getFactdeductshares() {
		return this.factdeductshares;
	}
	
	/**
	 * 实际提成份额 两位小数,
	 */
	public void setFactdeductshares(Double value)
	 {
		this.factdeductshares = value;
	}
	
	/**
	 * 业绩报酬计算公式,
	 */
	public String getFormula() {
		return this.formula;
	}
	
	/**
	 * 业绩报酬计算公式,
	 */
	public void setFormula(String value)
	 {
		this.formula = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 产品名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 产品名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 持有天数,
	 */
	public String getHoldday() {
		return this.holdday;
	}
	
	/**
	 * 持有天数,
	 */
	public void setHoldday(String value)
	 {
		this.holdday = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 单位净值 四位小数,
	 */
	public Double getNetvalue() {
		return this.netvalue;
	}
	
	/**
	 * 单位净值 四位小数,
	 */
	public void setNetvalue(Double value)
	 {
		this.netvalue = value;
	}
	
	/**
	 * 份额注册日期,
	 */
	public String getRegistdate() {
		return this.registdate;
	}
	
	/**
	 * 份额注册日期,
	 */
	public void setRegistdate(String value)
	 {
		this.registdate = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 累计净值 四位小数,
	 */
	public Double getTotalnetvalue() {
		return this.totalnetvalue;
	}
	
	/**
	 * 累计净值 四位小数,
	 */
	public void setTotalnetvalue(Double value)
	 {
		this.totalnetvalue = value;
	}
	
	/**
	 * 交易费用 两位小数,
	 */
	public Double getTradefare() {
		return this.tradefare;
	}
	
	/**
	 * 交易费用 两位小数,
	 */
	public void setTradefare(Double value)
	 {
		this.tradefare = value;
	}
	
	/**
	 * 年天数,
	 */
	public String getYeardays() {
		return this.yeardays;
	}
	
	/**
	 * 年天数,
	 */
	public void setYeardays(String value)
	 {
		this.yeardays = value;
	}
	
	/**
	 * 年化收益率 八位小数,
	 */
	public Double getYearratio() {
		return this.yearratio;
	}
	
	/**
	 * 年化收益率 八位小数,
	 */
	public void setYearratio(Double value)
	 {
		this.yearratio = value;
	}
}
