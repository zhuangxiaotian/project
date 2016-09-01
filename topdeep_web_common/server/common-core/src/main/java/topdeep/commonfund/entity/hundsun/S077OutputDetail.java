package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 时间段内每天的收益(S077)功能输出明细参数
 */
public class S077OutputDetail extends Object implements Serializable {
	
	/**
	 * 成本1,申购赎回成本
	 */
	private String cost_1 = "";
	
	/**
	 * 成本2,转入转出成本
	 */
	private String cost_2 = "";
	
	/**
	 * cost_x,其他成本
	 */
	private String cost_x = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 当天收益,
	 */
	private String day_income = "";
	
	/**
	 * 当天收益率,
	 */
	private String day_income_rate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 所得1,申购赎回所得
	 */
	private String got_1 = "";
	
	/**
	 * 所得2,转入转出所得
	 */
	private String got_2 = "";
	
	/**
	 * 其他所得,其他所得
	 */
	private String got_x = "";
	
	/**
	 * 截止当天全程收益,
	 */
	private String income = "";
	
	/**
	 * 截止当天全程收益率,
	 */
	private String income_rate = "";
	
	/**
	 * 份额,
	 */
	private String lastshares = "";
	
	/**
	 * 市值,
	 */
	private String marketvalue = "";
	
	/**
	 * 份额日期,
	 */
	private String share_date = "";
	
	/**
	 * 总成本,
	 */
	private String totalcost = "";
	
	/**
	 * 总所得,
	 */
	private String totalgot = "";
	
	/**
	 * 成本1,申购赎回成本
	 */
	public String getCost_1() {
		return this.cost_1;
	}
	
	/**
	 * 成本1,申购赎回成本
	 */
	public void setCost_1(String value)
	 {
		this.cost_1 = value;
	}
	
	/**
	 * 成本2,转入转出成本
	 */
	public String getCost_2() {
		return this.cost_2;
	}
	
	/**
	 * 成本2,转入转出成本
	 */
	public void setCost_2(String value)
	 {
		this.cost_2 = value;
	}
	
	/**
	 * cost_x,其他成本
	 */
	public String getCost_x() {
		return this.cost_x;
	}
	
	/**
	 * cost_x,其他成本
	 */
	public void setCost_x(String value)
	 {
		this.cost_x = value;
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
	 * 当天收益,
	 */
	public String getDay_income() {
		return this.day_income;
	}
	
	/**
	 * 当天收益,
	 */
	public void setDay_income(String value)
	 {
		this.day_income = value;
	}
	
	/**
	 * 当天收益率,
	 */
	public String getDay_income_rate() {
		return this.day_income_rate;
	}
	
	/**
	 * 当天收益率,
	 */
	public void setDay_income_rate(String value)
	 {
		this.day_income_rate = value;
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
	 * 所得1,申购赎回所得
	 */
	public String getGot_1() {
		return this.got_1;
	}
	
	/**
	 * 所得1,申购赎回所得
	 */
	public void setGot_1(String value)
	 {
		this.got_1 = value;
	}
	
	/**
	 * 所得2,转入转出所得
	 */
	public String getGot_2() {
		return this.got_2;
	}
	
	/**
	 * 所得2,转入转出所得
	 */
	public void setGot_2(String value)
	 {
		this.got_2 = value;
	}
	
	/**
	 * 其他所得,其他所得
	 */
	public String getGot_x() {
		return this.got_x;
	}
	
	/**
	 * 其他所得,其他所得
	 */
	public void setGot_x(String value)
	 {
		this.got_x = value;
	}
	
	/**
	 * 截止当天全程收益,
	 */
	public String getIncome() {
		return this.income;
	}
	
	/**
	 * 截止当天全程收益,
	 */
	public void setIncome(String value)
	 {
		this.income = value;
	}
	
	/**
	 * 截止当天全程收益率,
	 */
	public String getIncome_rate() {
		return this.income_rate;
	}
	
	/**
	 * 截止当天全程收益率,
	 */
	public void setIncome_rate(String value)
	 {
		this.income_rate = value;
	}
	
	/**
	 * 份额,
	 */
	public String getLastshares() {
		return this.lastshares;
	}
	
	/**
	 * 份额,
	 */
	public void setLastshares(String value)
	 {
		this.lastshares = value;
	}
	
	/**
	 * 市值,
	 */
	public String getMarketvalue() {
		return this.marketvalue;
	}
	
	/**
	 * 市值,
	 */
	public void setMarketvalue(String value)
	 {
		this.marketvalue = value;
	}
	
	/**
	 * 份额日期,
	 */
	public String getShare_date() {
		return this.share_date;
	}
	
	/**
	 * 份额日期,
	 */
	public void setShare_date(String value)
	 {
		this.share_date = value;
	}
	
	/**
	 * 总成本,
	 */
	public String getTotalcost() {
		return this.totalcost;
	}
	
	/**
	 * 总成本,
	 */
	public void setTotalcost(String value)
	 {
		this.totalcost = value;
	}
	
	/**
	 * 总所得,
	 */
	public String getTotalgot() {
		return this.totalgot;
	}
	
	/**
	 * 总所得,
	 */
	public void setTotalgot(String value)
	 {
		this.totalgot = value;
	}
}
