package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易确认查询(S004)功能输出明细参数
 */
public class S004OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请日期,yyyyMMdd格式字符串
	 */
	private String applydate = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 结算币种,"156":人民币,"840":美元
	 */
	private String balancecoin = "";
	
	/**
	 * 业务代码,（参考字典：业务名称）
	 */
	private String callingcode = "";
	
	/**
	 * 确认日期,yyyyMMdd格式字符串
	 */
	private String confirmdate = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * TA确认编号,
	 */
	private String taconfirmserial = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	private String bankacco = "";
	
	/**
	 * 交易网点代码,
	 */
	private String branchno = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	private String capitalmode;
	
	/**
	 * 出错详细信息,
	 */
	private String errorparticular = "";
	
	/**
	 * 冻结方式,
	 */
	private String freezemethod;
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 分红方式,取字典“分红方式”
	 */
	private String melonmethod;
	
	/**
	 * 净值,
	 */
	private Double netvalue;
	
	/**
	 * 对方托管网点,
	 */
	private String opptrusteebranch = "";
	
	/**
	 * 原申请单编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 交易处理返回码,
	 */
	private String returncode = "";
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	private String sharetype;
	
	/**
	 * 交易确认份额,
	 */
	private Double tradeconfirmshare;
	
	/**
	 * 交易确认金额,
	 */
	private Double tradeconfirmsum;
	
	/**
	 * 交易经办人,
	 */
	private String tradecontacct = "";
	
	/**
	 * 销售机构名称,销售机构名称
	 */
	private String agencyname = "";
	
	/**
	 * 销售商编号,销售商名称取字典“EQAgencyName”
	 */
	private String agencyno = "";
	
	/**
	 * 业务名称,业务名称
	 */
	private String businflagStr = "";
	
	/**
	 * 交易申请金额,
	 */
	private Double requestbalance;
	
	/**
	 * 交易申请份额,
	 */
	private Double requestshares;
	
	/**
	 * 份额类别名称,份额类别名称
	 */
	private String sharetypeStr = "";
	
	/**
	 * 交易确认标识,取字典“交易确认标志”
	 */
	private String confirmflag = "";
	
	/**
	 * 交易确认状态名,取数据中心时，增加该字段（使用数据中心字典EQTA1017）
	 */
	private String confirmflagStr = "";
	
	/**
	 * 指数类型,"02":指定金额不定额,"03":指数均线不定额,"12":趋势定投(时点指标法)
	 */
	private String exptype = "";
	
	/**
	 * 发生时银行卡号,
	 */
	private String occurbankacco = "";
	
	/**
	 * 发生时银行编号,
	 */
	private String occurbankno = "";
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 利息,利息
	 */
	private String interest = "";
	
	/**
	 * 审核标志,审核标志
	 */
	private String custconfirm = "";
	
	/**
	 * 子账户审核员,子账户审核员
	 */
	private String subaccoauditname = "";
	
	/**
	 * 审核员编号,审核员编号
	 */
	private String subaccoauditno = "";
	
	/**
	 * 子账户审核状态,子账户审核状态
	 */
	private String subaccoauditstate = "";
	
	/**
	 * 子账户名称,子账户名称
	 */
	private String subacconame = "";
	
	/**
	 * 子账户编号,子账户编号
	 */
	private String subaccono = "";
	
	/**
	 * 业务结束标志,针对数据源DS或D
	 */
	private String finishflag = "";
	
	/**
	 * 手续费,数据源为直销才有返回
	 */
	private String poundage = "";
	
	/**
	 * 外部订单号,数据源为DS(直销)，才有返回值
	 */
	private String otherserial = "";
	
	/**
	 * 申请日期,yyyyMMdd格式字符串
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,yyyyMMdd格式字符串
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
	 * 结算币种,"156":人民币,"840":美元
	 */
	public String getBalancecoin() {
		return this.balancecoin;
	}
	
	/**
	 * 结算币种,"156":人民币,"840":美元
	 */
	public void setBalancecoin(String value)
	 {
		this.balancecoin = value;
	}
	
	/**
	 * 业务代码,（参考字典：业务名称）
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,（参考字典：业务名称）
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 确认日期,yyyyMMdd格式字符串
	 */
	public String getConfirmdate() {
		return this.confirmdate;
	}
	
	/**
	 * 确认日期,yyyyMMdd格式字符串
	 */
	public void setConfirmdate(String value)
	 {
		this.confirmdate = value;
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
	 * TA确认编号,
	 */
	public String getTaconfirmserial() {
		return this.taconfirmserial;
	}
	
	/**
	 * TA确认编号,
	 */
	public void setTaconfirmserial(String value)
	 {
		this.taconfirmserial = value;
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
	 * 银行卡号,屏蔽四位
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 交易网点代码,
	 */
	public String getBranchno() {
		return this.branchno;
	}
	
	/**
	 * 交易网点代码,
	 */
	public void setBranchno(String value)
	 {
		this.branchno = value;
	}
	
	/**
	 * 经纪人,
	 */
	public String getBroker() {
		return this.broker;
	}
	
	/**
	 * 经纪人,
	 */
	public void setBroker(String value)
	 {
		this.broker = value;
	}
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 出错详细信息,
	 */
	public String getErrorparticular() {
		return this.errorparticular;
	}
	
	/**
	 * 出错详细信息,
	 */
	public void setErrorparticular(String value)
	 {
		this.errorparticular = value;
	}
	
	/**
	 * 冻结方式,
	 */
	public String getFreezemethod() {
		return this.freezemethod;
	}
	
	/**
	 * 冻结方式,
	 */
	public void setFreezemethod(String value)
	 {
		this.freezemethod = value;
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
	 * 分红方式,取字典“分红方式”
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,取字典“分红方式”
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 净值,
	 */
	public Double getNetvalue() {
		return this.netvalue;
	}
	
	/**
	 * 净值,
	 */
	public void setNetvalue(Double value)
	 {
		this.netvalue = value;
	}
	
	/**
	 * 对方托管网点,
	 */
	public String getOpptrusteebranch() {
		return this.opptrusteebranch;
	}
	
	/**
	 * 对方托管网点,
	 */
	public void setOpptrusteebranch(String value)
	 {
		this.opptrusteebranch = value;
	}
	
	/**
	 * 原申请单编号,
	 */
	public String getOriginalapplyserial() {
		return this.originalapplyserial;
	}
	
	/**
	 * 原申请单编号,
	 */
	public void setOriginalapplyserial(String value)
	 {
		this.originalapplyserial = value;
	}
	
	/**
	 * 交易处理返回码,
	 */
	public String getReturncode() {
		return this.returncode;
	}
	
	/**
	 * 交易处理返回码,
	 */
	public void setReturncode(String value)
	 {
		this.returncode = value;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易确认份额,
	 */
	public Double getTradeconfirmshare() {
		return this.tradeconfirmshare;
	}
	
	/**
	 * 交易确认份额,
	 */
	public void setTradeconfirmshare(Double value)
	 {
		this.tradeconfirmshare = value;
	}
	
	/**
	 * 交易确认金额,
	 */
	public Double getTradeconfirmsum() {
		return this.tradeconfirmsum;
	}
	
	/**
	 * 交易确认金额,
	 */
	public void setTradeconfirmsum(Double value)
	 {
		this.tradeconfirmsum = value;
	}
	
	/**
	 * 交易经办人,
	 */
	public String getTradecontacct() {
		return this.tradecontacct;
	}
	
	/**
	 * 交易经办人,
	 */
	public void setTradecontacct(String value)
	 {
		this.tradecontacct = value;
	}
	
	/**
	 * 销售机构名称,销售机构名称
	 */
	public String getAgencyname() {
		return this.agencyname;
	}
	
	/**
	 * 销售机构名称,销售机构名称
	 */
	public void setAgencyname(String value)
	 {
		this.agencyname = value;
	}
	
	/**
	 * 销售商编号,销售商名称取字典“EQAgencyName”
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商编号,销售商名称取字典“EQAgencyName”
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 业务名称,业务名称
	 */
	public String getBusinflagStr() {
		return this.businflagStr;
	}
	
	/**
	 * 业务名称,业务名称
	 */
	public void setBusinflagStr(String value)
	 {
		this.businflagStr = value;
	}
	
	/**
	 * 交易申请金额,
	 */
	public Double getRequestbalance() {
		return this.requestbalance;
	}
	
	/**
	 * 交易申请金额,
	 */
	public void setRequestbalance(Double value)
	 {
		this.requestbalance = value;
	}
	
	/**
	 * 交易申请份额,
	 */
	public Double getRequestshares() {
		return this.requestshares;
	}
	
	/**
	 * 交易申请份额,
	 */
	public void setRequestshares(Double value)
	 {
		this.requestshares = value;
	}
	
	/**
	 * 份额类别名称,份额类别名称
	 */
	public String getSharetypeStr() {
		return this.sharetypeStr;
	}
	
	/**
	 * 份额类别名称,份额类别名称
	 */
	public void setSharetypeStr(String value)
	 {
		this.sharetypeStr = value;
	}
	
	/**
	 * 交易确认标识,取字典“交易确认标志”
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 交易确认标识,取字典“交易确认标志”
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 交易确认状态名,取数据中心时，增加该字段（使用数据中心字典EQTA1017）
	 */
	public String getConfirmflagStr() {
		return this.confirmflagStr;
	}
	
	/**
	 * 交易确认状态名,取数据中心时，增加该字段（使用数据中心字典EQTA1017）
	 */
	public void setConfirmflagStr(String value)
	 {
		this.confirmflagStr = value;
	}
	
	/**
	 * 指数类型,"02":指定金额不定额,"03":指数均线不定额,"12":趋势定投(时点指标法)
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,"02":指定金额不定额,"03":指数均线不定额,"12":趋势定投(时点指标法)
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 发生时银行卡号,
	 */
	public String getOccurbankacco() {
		return this.occurbankacco;
	}
	
	/**
	 * 发生时银行卡号,
	 */
	public void setOccurbankacco(String value)
	 {
		this.occurbankacco = value;
	}
	
	/**
	 * 发生时银行编号,
	 */
	public String getOccurbankno() {
		return this.occurbankno;
	}
	
	/**
	 * 发生时银行编号,
	 */
	public void setOccurbankno(String value)
	 {
		this.occurbankno = value;
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
	 * 利息,利息
	 */
	public String getInterest() {
		return this.interest;
	}
	
	/**
	 * 利息,利息
	 */
	public void setInterest(String value)
	 {
		this.interest = value;
	}
	
	/**
	 * 审核标志,审核标志
	 */
	public String getCustconfirm() {
		return this.custconfirm;
	}
	
	/**
	 * 审核标志,审核标志
	 */
	public void setCustconfirm(String value)
	 {
		this.custconfirm = value;
	}
	
	/**
	 * 子账户审核员,子账户审核员
	 */
	public String getSubaccoauditname() {
		return this.subaccoauditname;
	}
	
	/**
	 * 子账户审核员,子账户审核员
	 */
	public void setSubaccoauditname(String value)
	 {
		this.subaccoauditname = value;
	}
	
	/**
	 * 审核员编号,审核员编号
	 */
	public String getSubaccoauditno() {
		return this.subaccoauditno;
	}
	
	/**
	 * 审核员编号,审核员编号
	 */
	public void setSubaccoauditno(String value)
	 {
		this.subaccoauditno = value;
	}
	
	/**
	 * 子账户审核状态,子账户审核状态
	 */
	public String getSubaccoauditstate() {
		return this.subaccoauditstate;
	}
	
	/**
	 * 子账户审核状态,子账户审核状态
	 */
	public void setSubaccoauditstate(String value)
	 {
		this.subaccoauditstate = value;
	}
	
	/**
	 * 子账户名称,子账户名称
	 */
	public String getSubacconame() {
		return this.subacconame;
	}
	
	/**
	 * 子账户名称,子账户名称
	 */
	public void setSubacconame(String value)
	 {
		this.subacconame = value;
	}
	
	/**
	 * 子账户编号,子账户编号
	 */
	public String getSubaccono() {
		return this.subaccono;
	}
	
	/**
	 * 子账户编号,子账户编号
	 */
	public void setSubaccono(String value)
	 {
		this.subaccono = value;
	}
	
	/**
	 * 业务结束标志,针对数据源DS或D
	 */
	public String getFinishflag() {
		return this.finishflag;
	}
	
	/**
	 * 业务结束标志,针对数据源DS或D
	 */
	public void setFinishflag(String value)
	 {
		this.finishflag = value;
	}
	
	/**
	 * 手续费,数据源为直销才有返回
	 */
	public String getPoundage() {
		return this.poundage;
	}
	
	/**
	 * 手续费,数据源为直销才有返回
	 */
	public void setPoundage(String value)
	 {
		this.poundage = value;
	}
	
	/**
	 * 外部订单号,数据源为DS(直销)，才有返回值
	 */
	public String getOtherserial() {
		return this.otherserial;
	}
	
	/**
	 * 外部订单号,数据源为DS(直销)，才有返回值
	 */
	public void setOtherserial(String value)
	 {
		this.otherserial = value;
	}
}
