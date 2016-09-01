package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝份额查询(数据中心版)(S069)功能输出明细参数
 */
public class S069OutputDetail extends Object implements Serializable {
	
	/**
	 * 历史累计收益,
	 */
	private Double accumincome;
	
	/**
	 * 销售商代码,
	 */
	private String agencyno = "";
	
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
	 * 最近产生收益发生日期,xxxx-xx-xx
	 */
	private java.util.Date incomedate;
	
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
	 * 最近产生收益,
	 */
	private String newincome = "";
	
	/**
	 * 账户实时资产余额,
	 */
	private Double realasset;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银行信息,SYS_EQS_CONNECTDS需打开
	 */
	private String bankinfo = "";
	
	/**
	 * 历史累计收益,
	 */
	public Double getAccumincome() {
		return this.accumincome;
	}
	
	/**
	 * 历史累计收益,
	 */
	public void setAccumincome(Double value)
	 {
		this.accumincome = value;
	}
	
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
	 * 最近产生收益发生日期,xxxx-xx-xx
	 */
	public java.util.Date getIncomedate() {
		return this.incomedate;
	}
	
	/**
	 * 最近产生收益发生日期,xxxx-xx-xx
	 */
	public void setIncomedate(java.util.Date value)
	 {
		this.incomedate = value;
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
	 * 最近产生收益,
	 */
	public String getNewincome() {
		return this.newincome;
	}
	
	/**
	 * 最近产生收益,
	 */
	public void setNewincome(String value)
	 {
		this.newincome = value;
	}
	
	/**
	 * 账户实时资产余额,
	 */
	public Double getRealasset() {
		return this.realasset;
	}
	
	/**
	 * 账户实时资产余额,
	 */
	public void setRealasset(Double value)
	 {
		this.realasset = value;
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
	 * 银行信息,SYS_EQS_CONNECTDS需打开
	 */
	public String getBankinfo() {
		return this.bankinfo;
	}
	
	/**
	 * 银行信息,SYS_EQS_CONNECTDS需打开
	 */
	public void setBankinfo(String value)
	 {
		this.bankinfo = value;
	}
}
