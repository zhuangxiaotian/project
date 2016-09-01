package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 持仓收益查询(S081)功能输出明细参数
 */
public class S081OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金帐号,
	 */
	private String fundacco = "";
	
	/**
	 * 销售商编号,
	 */
	private String agencyno = "";
	
	/**
	 * 本金,
	 */
	private String cost = "";
	
	/**
	 * 当前持仓资产,
	 */
	private String currasset = "";
	
	/**
	 * 浮动盈亏,
	 */
	private String profit = "";
	
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
	 * 销售商编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 本金,
	 */
	public String getCost() {
		return this.cost;
	}
	
	/**
	 * 本金,
	 */
	public void setCost(String value)
	 {
		this.cost = value;
	}
	
	/**
	 * 当前持仓资产,
	 */
	public String getCurrasset() {
		return this.currasset;
	}
	
	/**
	 * 当前持仓资产,
	 */
	public void setCurrasset(String value)
	 {
		this.currasset = value;
	}
	
	/**
	 * 浮动盈亏,
	 */
	public String getProfit() {
		return this.profit;
	}
	
	/**
	 * 浮动盈亏,
	 */
	public void setProfit(String value)
	 {
		this.profit = value;
	}
}
