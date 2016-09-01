package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝收益查询(数据中心版)(S072)功能输出明细参数
 */
public class S072OutputDetail extends Object implements Serializable {
	
	/**
	 * 销售商代码,
	 */
	private String agencyno = "";
	
	/**
	 * 本次操作后资产余额,
	 */
	private String asset = "";
	
	/**
	 * 收益归属日期,
	 */
	private java.util.Date belongdate;
	
	/**
	 * 净值日期,xxxx-xx-xx
	 */
	private java.util.Date date;
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 七日年化收益率,
	 */
	private String incomeratio = "";
	
	/**
	 * 万份收益,
	 */
	private String incomeunit = "";
	
	/**
	 * 网点代码,
	 */
	private String netno = "";
	
	/**
	 * 收益产生日期,xxxx-xx-xx
	 */
	private java.util.Date occurdate;
	
	/**
	 * 产生收益,
	 */
	private String occurincome = "";
	
	/**
	 * 收益产生时间,
	 */
	private String occurtime = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 销售商代码,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 本次操作后资产余额,
	 */
	public String getAsset() {
		return this.asset;
	}
	
	/**
	 * 本次操作后资产余额,
	 */
	public void setAsset(String value)
	 {
		this.asset = value;
	}
	
	/**
	 * 收益归属日期,
	 */
	public java.util.Date getBelongdate() {
		return this.belongdate;
	}
	
	/**
	 * 收益归属日期,
	 */
	public void setBelongdate(java.util.Date value)
	 {
		this.belongdate = value;
	}
	
	/**
	 * 净值日期,xxxx-xx-xx
	 */
	public java.util.Date getDate() {
		return this.date;
	}
	
	/**
	 * 净值日期,xxxx-xx-xx
	 */
	public void setDate(java.util.Date value)
	 {
		this.date = value;
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
	 * 七日年化收益率,
	 */
	public String getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 七日年化收益率,
	 */
	public void setIncomeratio(String value)
	 {
		this.incomeratio = value;
	}
	
	/**
	 * 万份收益,
	 */
	public String getIncomeunit() {
		return this.incomeunit;
	}
	
	/**
	 * 万份收益,
	 */
	public void setIncomeunit(String value)
	 {
		this.incomeunit = value;
	}
	
	/**
	 * 网点代码,
	 */
	public String getNetno() {
		return this.netno;
	}
	
	/**
	 * 网点代码,
	 */
	public void setNetno(String value)
	 {
		this.netno = value;
	}
	
	/**
	 * 收益产生日期,xxxx-xx-xx
	 */
	public java.util.Date getOccurdate() {
		return this.occurdate;
	}
	
	/**
	 * 收益产生日期,xxxx-xx-xx
	 */
	public void setOccurdate(java.util.Date value)
	 {
		this.occurdate = value;
	}
	
	/**
	 * 产生收益,
	 */
	public String getOccurincome() {
		return this.occurincome;
	}
	
	/**
	 * 产生收益,
	 */
	public void setOccurincome(String value)
	 {
		this.occurincome = value;
	}
	
	/**
	 * 收益产生时间,
	 */
	public String getOccurtime() {
		return this.occurtime;
	}
	
	/**
	 * 收益产生时间,
	 */
	public void setOccurtime(String value)
	 {
		this.occurtime = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
}
