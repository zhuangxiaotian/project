package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易查询(S068)功能输出明细参数
 */
public class S068OutputDetail extends Object implements Serializable {
	
	/**
	 * 销售商编号,
	 */
	private String agencyno = "";
	
	/**
	 * 申请日期,
	 */
	private String applydate = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 业务代码,
	 */
	private String callingcode = "";
	
	/**
	 * 确认日期,
	 */
	private String confirmdate = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
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
	 * 净值,
	 */
	private String netvalue = "";
	
	/**
	 * 申请金额,
	 */
	private String requestbalance = "";
	
	/**
	 * 申请份额,
	 */
	private String requestshares = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易确认份额,
	 */
	private String tradeconfirmshare = "";
	
	/**
	 * 交易确认金额,
	 */
	private String tradeconfirmsum = "";
	
	/**
	 * 交易状态,
	 */
	private String tradestatus = "";
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
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
	 * 申请日期,
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setApplydate(String value)
	 {
		this.applydate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
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
	 * 申请金额,
	 */
	public String getRequestbalance() {
		return this.requestbalance;
	}
	
	/**
	 * 申请金额,
	 */
	public void setRequestbalance(String value)
	 {
		this.requestbalance = value;
	}
	
	/**
	 * 申请份额,
	 */
	public String getRequestshares() {
		return this.requestshares;
	}
	
	/**
	 * 申请份额,
	 */
	public void setRequestshares(String value)
	 {
		this.requestshares = value;
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
	 * 交易确认份额,
	 */
	public String getTradeconfirmshare() {
		return this.tradeconfirmshare;
	}
	
	/**
	 * 交易确认份额,
	 */
	public void setTradeconfirmshare(String value)
	 {
		this.tradeconfirmshare = value;
	}
	
	/**
	 * 交易确认金额,
	 */
	public String getTradeconfirmsum() {
		return this.tradeconfirmsum;
	}
	
	/**
	 * 交易确认金额,
	 */
	public void setTradeconfirmsum(String value)
	 {
		this.tradeconfirmsum = value;
	}
	
	/**
	 * 交易状态,
	 */
	public String getTradestatus() {
		return this.tradestatus;
	}
	
	/**
	 * 交易状态,
	 */
	public void setTradestatus(String value)
	 {
		this.tradestatus = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
}
