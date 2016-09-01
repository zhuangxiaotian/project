package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝交易信息查询(数据中心版)(S071)功能输出明细参数
 */
public class S071OutputDetail extends Object implements Serializable {
	
	/**
	 * 销售商代码,
	 */
	private String agencyno = "";
	
	/**
	 * 本次操作后资产余额,
	 */
	private String asset = "";
	
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
	 * 万分收益,
	 */
	private String incomeunit = "";
	
	/**
	 * 网点代码,
	 */
	private String netno = "";
	
	/**
	 * 发生金额,
	 */
	private String occurbalance = "";
	
	/**
	 * 订单日期时间,
	 */
	private String orderdatetime = "";
	
	/**
	 * 赎回标志,
	 */
	private String redeemflag;
	
	/**
	 * 申请日期,xxxx-xx-xx
	 */
	private java.util.Date requestdate;
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 校验标志,
	 */
	private String state;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 存入取现标志,
	 */
	private String tradeflag;
	
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
	 * 万分收益,
	 */
	public String getIncomeunit() {
		return this.incomeunit;
	}
	
	/**
	 * 万分收益,
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
	 * 发生金额,
	 */
	public String getOccurbalance() {
		return this.occurbalance;
	}
	
	/**
	 * 发生金额,
	 */
	public void setOccurbalance(String value)
	 {
		this.occurbalance = value;
	}
	
	/**
	 * 订单日期时间,
	 */
	public String getOrderdatetime() {
		return this.orderdatetime;
	}
	
	/**
	 * 订单日期时间,
	 */
	public void setOrderdatetime(String value)
	 {
		this.orderdatetime = value;
	}
	
	/**
	 * 赎回标志,
	 */
	public String getRedeemflag() {
		return this.redeemflag;
	}
	
	/**
	 * 赎回标志,
	 */
	public void setRedeemflag(String value)
	 {
		this.redeemflag = value;
	}
	
	/**
	 * 申请日期,xxxx-xx-xx
	 */
	public java.util.Date getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,xxxx-xx-xx
	 */
	public void setRequestdate(java.util.Date value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	/**
	 * 校验标志,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 校验标志,
	 */
	public void setState(String value)
	 {
		this.state = value;
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
	
	/**
	 * 存入取现标志,
	 */
	public String getTradeflag() {
		return this.tradeflag;
	}
	
	/**
	 * 存入取现标志,
	 */
	public void setTradeflag(String value)
	 {
		this.tradeflag = value;
	}
}
