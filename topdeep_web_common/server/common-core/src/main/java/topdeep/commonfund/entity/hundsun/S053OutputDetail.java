package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易信息查询(S053)功能输出明细参数
 */
public class S053OutputDetail extends Object implements Serializable {
	
	/**
	 * 下单日期时间,
	 */
	private String acceptdatetime = "";
	
	/**
	 * 申请日期,
	 */
	private String applydate = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请时间,
	 */
	private String applytime = "";
	
	/**
	 * 业务代码,
	 */
	private String callingcode = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 确认标志,
	 */
	private String confirmflag = "";
	
	/**
	 * 申请校验状态,
	 */
	private String confirmstat = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 申请份额,
	 */
	private Double applyshare;
	
	/**
	 * 申请金额,
	 */
	private Double applysum;
	
	/**
	 * 回款帐号,
	 */
	private String backbankacco = "";
	
	/**
	 * 回款银行编号,
	 */
	private String backbankserial = "";
	
	/**
	 * 银行帐号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 业务名称,
	 */
	private String businflagStr = "";
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 确认日期,
	 */
	private String confirmdate = "";
	
	/**
	 * 确认份额,
	 */
	private Double confirmshare;
	
	/**
	 * 确认金额,
	 */
	private Double confirmsum;
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 分红方式,
	 */
	private String dividendmethod = "";
	
	/**
	 * 费用,
	 */
	private String fare = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 对方交易帐号,
	 */
	private String othertradeacco = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype;
	
	/**
	 * TA代码,
	 */
	private String tacode = "";
	
	/**
	 * 目标基金代码,
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标基金名称,
	 */
	private String targetfundname = "";
	
	/**
	 * 目标份额类型,
	 */
	private String targetsharetype;
	
	/**
	 * 下单日期时间,
	 */
	public String getAcceptdatetime() {
		return this.acceptdatetime;
	}
	
	/**
	 * 下单日期时间,
	 */
	public void setAcceptdatetime(String value)
	 {
		this.acceptdatetime = value;
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
	 * 申请时间,
	 */
	public String getApplytime() {
		return this.applytime;
	}
	
	/**
	 * 申请时间,
	 */
	public void setApplytime(String value)
	 {
		this.applytime = value;
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
	
	/**
	 * 确认标志,
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 申请校验状态,
	 */
	public String getConfirmstat() {
		return this.confirmstat;
	}
	
	/**
	 * 申请校验状态,
	 */
	public void setConfirmstat(String value)
	 {
		this.confirmstat = value;
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
	 * 申请份额,
	 */
	public Double getApplyshare() {
		return this.applyshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setApplyshare(Double value)
	 {
		this.applyshare = value;
	}
	
	/**
	 * 申请金额,
	 */
	public Double getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplysum(Double value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 回款帐号,
	 */
	public String getBackbankacco() {
		return this.backbankacco;
	}
	
	/**
	 * 回款帐号,
	 */
	public void setBackbankacco(String value)
	 {
		this.backbankacco = value;
	}
	
	/**
	 * 回款银行编号,
	 */
	public String getBackbankserial() {
		return this.backbankserial;
	}
	
	/**
	 * 回款银行编号,
	 */
	public void setBackbankserial(String value)
	 {
		this.backbankserial = value;
	}
	
	/**
	 * 银行帐号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行帐号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 业务名称,
	 */
	public String getBusinflagStr() {
		return this.businflagStr;
	}
	
	/**
	 * 业务名称,
	 */
	public void setBusinflagStr(String value)
	 {
		this.businflagStr = value;
	}
	
	/**
	 * 业务大类,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
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
	 * 确认份额,
	 */
	public Double getConfirmshare() {
		return this.confirmshare;
	}
	
	/**
	 * 确认份额,
	 */
	public void setConfirmshare(Double value)
	 {
		this.confirmshare = value;
	}
	
	/**
	 * 确认金额,
	 */
	public Double getConfirmsum() {
		return this.confirmsum;
	}
	
	/**
	 * 确认金额,
	 */
	public void setConfirmsum(Double value)
	 {
		this.confirmsum = value;
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
	 * 分红方式,
	 */
	public String getDividendmethod() {
		return this.dividendmethod;
	}
	
	/**
	 * 分红方式,
	 */
	public void setDividendmethod(String value)
	 {
		this.dividendmethod = value;
	}
	
	/**
	 * 费用,
	 */
	public String getFare() {
		return this.fare;
	}
	
	/**
	 * 费用,
	 */
	public void setFare(String value)
	 {
		this.fare = value;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public String getFixflag() {
		return this.fixflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixflag(String value)
	 {
		this.fixflag = value;
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
	 * 对方交易帐号,
	 */
	public String getOthertradeacco() {
		return this.othertradeacco;
	}
	
	/**
	 * 对方交易帐号,
	 */
	public void setOthertradeacco(String value)
	 {
		this.othertradeacco = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
	
	/**
	 * 目标基金代码,
	 */
	public String getTargetfundcode() {
		return this.targetfundcode;
	}
	
	/**
	 * 目标基金代码,
	 */
	public void setTargetfundcode(String value)
	 {
		this.targetfundcode = value;
	}
	
	/**
	 * 目标基金名称,
	 */
	public String getTargetfundname() {
		return this.targetfundname;
	}
	
	/**
	 * 目标基金名称,
	 */
	public void setTargetfundname(String value)
	 {
		this.targetfundname = value;
	}
	
	/**
	 * 目标份额类型,
	 */
	public String getTargetsharetype() {
		return this.targetsharetype;
	}
	
	/**
	 * 目标份额类型,
	 */
	public void setTargetsharetype(String value)
	 {
		this.targetsharetype = value;
	}
}
