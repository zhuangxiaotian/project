package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史收益查询(S049)功能输出明细参数
 */
public class S049OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 收益,当查询单位为日时，返回当日收益，当月时，返回当月累计收益
	 */
	private String income = "";
	
	/**
	 * 收益时间,
	 */
	private String profitdate = "";
	
	/**
	 * 份额类型,
	 */
	private String sharetype = "";
	
	/**
	 * 万份年化收益率,（数据来源为DS）
	 */
	private String incomeratio = "";
	
	/**
	 * 收益产生日期,数据来源为DS时有效
	 */
	private String incomedate = "";
	
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
	 * 收益,当查询单位为日时，返回当日收益，当月时，返回当月累计收益
	 */
	public String getIncome() {
		return this.income;
	}
	
	/**
	 * 收益,当查询单位为日时，返回当日收益，当月时，返回当月累计收益
	 */
	public void setIncome(String value)
	 {
		this.income = value;
	}
	
	/**
	 * 收益时间,
	 */
	public String getProfitdate() {
		return this.profitdate;
	}
	
	/**
	 * 收益时间,
	 */
	public void setProfitdate(String value)
	 {
		this.profitdate = value;
	}
	
	/**
	 * 份额类型,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类型,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 万份年化收益率,（数据来源为DS）
	 */
	public String getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 万份年化收益率,（数据来源为DS）
	 */
	public void setIncomeratio(String value)
	 {
		this.incomeratio = value;
	}
	
	/**
	 * 收益产生日期,数据来源为DS时有效
	 */
	public String getIncomedate() {
		return this.incomedate;
	}
	
	/**
	 * 收益产生日期,数据来源为DS时有效
	 */
	public void setIncomedate(String value)
	 {
		this.incomedate = value;
	}
}
