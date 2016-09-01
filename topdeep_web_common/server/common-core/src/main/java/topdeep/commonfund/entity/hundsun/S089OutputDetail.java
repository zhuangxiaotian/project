package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 华宝查询未付收益变化流水明细(S089)功能输出明细参数
 */
public class S089OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 收益日期,
	 */
	private String incomedate = "";
	
	/**
	 * 当日收益,
	 */
	private String newincome = "";
	
	/**
	 * 当日份额,
	 */
	private String realshares = "";
	
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
	 * 收益日期,
	 */
	public String getIncomedate() {
		return this.incomedate;
	}
	
	/**
	 * 收益日期,
	 */
	public void setIncomedate(String value)
	 {
		this.incomedate = value;
	}
	
	/**
	 * 当日收益,
	 */
	public String getNewincome() {
		return this.newincome;
	}
	
	/**
	 * 当日收益,
	 */
	public void setNewincome(String value)
	 {
		this.newincome = value;
	}
	
	/**
	 * 当日份额,
	 */
	public String getRealshares() {
		return this.realshares;
	}
	
	/**
	 * 当日份额,
	 */
	public void setRealshares(String value)
	 {
		this.realshares = value;
	}
}
