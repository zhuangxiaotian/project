package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 待审核交易查询(S083)功能输出明细参数
 */
public class S083OutputDetail extends Object implements Serializable {
	
	/**
	 * 下单时间,
	 */
	private String accepttime = "";
	
	/**
	 * 来源交易账号,
	 */
	private String accousage = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请份数,
	 */
	private Double applyshare;
	
	/**
	 * 申请金额,
	 */
	private Double applysum;
	
	/**
	 * 申请时间,
	 */
	private String applytime = "";
	
	/**
	 * 均线类型,
	 */
	private String avgexponenttype = "";
	
	/**
	 * 银行编号,
	 */
	private String backbankno = "";
	
	/**
	 * 银联平台系统时间,
	 */
	private String banknetdate = "";
	
	/**
	 * 批次号,
	 */
	private String batchno = "";
	
	/**
	 * 首次交易日期,
	 */
	private String begindate = "";
	
	/**
	 * 交易网点代码,
	 */
	private String branchno = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 业务代码,
	 */
	private String callingcode = "";
	
	/**
	 * 资金模式,
	 */
	private String capitalmode;
	
	/**
	 * 组合编号,
	 */
	private String combcode = "";
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 佣金折扣率,
	 */
	private Double commisiondiscount;
	
	/**
	 * 确认标志,
	 */
	private String confirmflag;
	
	/**
	 * 银行返回错误码,
	 */
	private String cperrorcode = "";
	
	/**
	 * 网银错误码,
	 */
	private String cperrorcode2 = "";
	
	/**
	 * 审核标志,
	 */
	private String custconfirm;
	
	/**
	 * 客户类别,
	 */
	private String custtype;
	
	/**
	 * 交易周期,
	 */
	private String cycle = "";
	
	/**
	 * 协议周期单位,
	 */
	private String cycleunit;
	
	/**
	 * 顺延天数,
	 */
	private String delayday = "";
	
	/**
	 * 明细资金方式称,
	 */
	private String detailcapitalmode;
	
	/**
	 * 级差,
	 */
	private Double diffscale;
	
	/**
	 * 终止日期,
	 */
	private String enddate = "";
	
	/**
	 * 后收费折扣率,
	 */
	private Double enddiscount;
	
	/**
	 * 备注,
	 */
	private String explain = "";
	
	/**
	 * 指数代码,
	 */
	private String exponentcode = "";
	
	/**
	 * 预约条件,
	 */
	private String exponentflag;
	
	/**
	 * 预约点位,
	 */
	private String exponentvalue = "";
	
	/**
	 * 指数类型,
	 */
	private String exptype = "";
	
	/**
	 * 外部组合编号,
	 */
	private String extcombcode = "";
	
	/**
	 * 到账金额,
	 */
	private Double factbala;
	
	/**
	 * 目标基金类型,
	 */
	private String fargetfundtype;
	
	/**
	 * 交易日期,
	 */
	private String fixday = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 冻结方式,
	 */
	private String freezemethod;
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金子类型,
	 */
	private String fundsubtype;
	
	/**
	 * 基金类型,
	 */
	private String fundtype;
	
	/**
	 * 避险基金代码,
	 */
	private String hedgefundcode = "";
	
	/**
	 * 避险基金份额类别,
	 */
	private String hedgesharetype;
	
	/**
	 * 预约日期,
	 */
	private String hopedate = "";
	
	/**
	 * 投资浮动比例,
	 */
	private Double invenstrate;
	
	/**
	 * 系统识别码,
	 */
	private String investorsystemid = "";
	
	/**
	 * 扣款状态,
	 */
	private String kkstat;
	
	/**
	 * 最后更新日期,
	 */
	private String lastmodifydate = "";
	
	/**
	 * 长期均线类型,
	 */
	private String longavgexponenttype = "";
	
	/**
	 * 比例区间1上限,
	 */
	private Double maxscale1;
	
	/**
	 * 比例区间2上限,
	 */
	private Double maxscale2;
	
	/**
	 * 比例区间3上限,
	 */
	private String maxscale3 = "";
	
	/**
	 * 最大成功次数,
	 */
	private Integer maxsuccessnum;
	
	/**
	 * 最大交易成功额度,
	 */
	private Double maxvalue;
	
	/**
	 * 分红方式,
	 */
	private String melonmethod;
	
	/**
	 * 比例区间1下限,
	 */
	private Double minscale1;
	
	/**
	 * 比例区间2下限,
	 */
	private Double minscale2;
	
	/**
	 * 比例区间3下限,
	 */
	private String minscale3 = "";
	
	/**
	 * 巨额赎回处理,
	 */
	private String mintredeem;
	
	/**
	 * 对方基金账号,
	 */
	private String oppfundcode = "";
	
	/**
	 * 对方销售人,
	 */
	private String oppsaler = "";
	
	/**
	 * 对方托管网点,
	 */
	private String opptrusteebranch = "";
	
	/**
	 * 原申请日期,
	 */
	private String oriapplydate = "";
	
	/**
	 * 原申请单编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 原业务代码,
	 */
	private String originflag = "";
	
	/**
	 * 补差费折扣率,
	 */
	private Double otherdiscount;
	
	/**
	 * 目标份额类型,
	 */
	private String othersharetype;
	
	/**
	 * 对方交易账号,
	 */
	private String othertradeacco = "";
	
	/**
	 * 扣款部分成功选择,
	 */
	private String partflag;
	
	/**
	 * 协议号,
	 */
	private String protocol = "";
	
	/**
	 * 申请日期,
	 */
	private String protocolname = "";
	
	/**
	 * 风险标志,
	 */
	private String riskmatch;
	
	/**
	 * 投资金额1,
	 */
	private Double scalbalance1;
	
	/**
	 * 投资金额2,
	 */
	private Double scalbalance2;
	
	/**
	 * 投资金额3,
	 */
	private Double scalbalance3;
	
	/**
	 * 投资区间方案编号,
	 */
	private Integer sectionschemano;
	
	/**
	 * 自定义组合编号,
	 */
	private String selfcombcode = "";
	
	/**
	 * TA发送标志,
	 */
	private String sendflag;
	
	/**
	 * 份额类别,
	 */
	private String sharetype;
	
	/**
	 * 短期均线类型,
	 */
	private String shortavgexponenttype = "";
	
	/**
	 * 审核员名称,
	 */
	private String subaccoauditname = "";
	
	/**
	 * 审核员编号,
	 */
	private String subaccoauditno = "";
	
	/**
	 * 子账户名称,
	 */
	private String subacconame = "";
	
	/**
	 * 子账户编号,
	 */
	private String subaccono = "";
	
	/**
	 * 交易权限,
	 */
	private String subtrade = "";
	
	/**
	 * 目标基金代码,
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标基金子类型,
	 */
	private String targetfundsubtype;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 委托方式,
	 */
	private String trademethod;
	
	/**
	 * 凭证编号,
	 */
	private String voucherno = "";
	
	/**
	 * 下单时间,
	 */
	public String getAccepttime() {
		return this.accepttime;
	}
	
	/**
	 * 下单时间,
	 */
	public void setAccepttime(String value)
	 {
		this.accepttime = value;
	}
	
	/**
	 * 来源交易账号,
	 */
	public String getAccousage() {
		return this.accousage;
	}
	
	/**
	 * 来源交易账号,
	 */
	public void setAccousage(String value)
	 {
		this.accousage = value;
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
	 * 申请份数,
	 */
	public Double getApplyshare() {
		return this.applyshare;
	}
	
	/**
	 * 申请份数,
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
	 * 均线类型,
	 */
	public String getAvgexponenttype() {
		return this.avgexponenttype;
	}
	
	/**
	 * 均线类型,
	 */
	public void setAvgexponenttype(String value)
	 {
		this.avgexponenttype = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBackbankno() {
		return this.backbankno;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBackbankno(String value)
	 {
		this.backbankno = value;
	}
	
	/**
	 * 银联平台系统时间,
	 */
	public String getBanknetdate() {
		return this.banknetdate;
	}
	
	/**
	 * 银联平台系统时间,
	 */
	public void setBanknetdate(String value)
	 {
		this.banknetdate = value;
	}
	
	/**
	 * 批次号,
	 */
	public String getBatchno() {
		return this.batchno;
	}
	
	/**
	 * 批次号,
	 */
	public void setBatchno(String value)
	 {
		this.batchno = value;
	}
	
	/**
	 * 首次交易日期,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 首次交易日期,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
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
	 * 资金模式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金模式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 组合编号,
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	/**
	 * 组合申请编号,
	 */
	public String getCombrequestno() {
		return this.combrequestno;
	}
	
	/**
	 * 组合申请编号,
	 */
	public void setCombrequestno(String value)
	 {
		this.combrequestno = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 佣金折扣率,
	 */
	public Double getCommisiondiscount() {
		return this.commisiondiscount;
	}
	
	/**
	 * 佣金折扣率,
	 */
	public void setCommisiondiscount(Double value)
	 {
		this.commisiondiscount = value;
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
	 * 银行返回错误码,
	 */
	public String getCperrorcode() {
		return this.cperrorcode;
	}
	
	/**
	 * 银行返回错误码,
	 */
	public void setCperrorcode(String value)
	 {
		this.cperrorcode = value;
	}
	
	/**
	 * 网银错误码,
	 */
	public String getCperrorcode2() {
		return this.cperrorcode2;
	}
	
	/**
	 * 网银错误码,
	 */
	public void setCperrorcode2(String value)
	 {
		this.cperrorcode2 = value;
	}
	
	/**
	 * 审核标志,
	 */
	public String getCustconfirm() {
		return this.custconfirm;
	}
	
	/**
	 * 审核标志,
	 */
	public void setCustconfirm(String value)
	 {
		this.custconfirm = value;
	}
	
	/**
	 * 客户类别,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类别,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 交易周期,
	 */
	public String getCycle() {
		return this.cycle;
	}
	
	/**
	 * 交易周期,
	 */
	public void setCycle(String value)
	 {
		this.cycle = value;
	}
	
	/**
	 * 协议周期单位,
	 */
	public String getCycleunit() {
		return this.cycleunit;
	}
	
	/**
	 * 协议周期单位,
	 */
	public void setCycleunit(String value)
	 {
		this.cycleunit = value;
	}
	
	/**
	 * 顺延天数,
	 */
	public String getDelayday() {
		return this.delayday;
	}
	
	/**
	 * 顺延天数,
	 */
	public void setDelayday(String value)
	 {
		this.delayday = value;
	}
	
	/**
	 * 明细资金方式称,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式称,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 级差,
	 */
	public Double getDiffscale() {
		return this.diffscale;
	}
	
	/**
	 * 级差,
	 */
	public void setDiffscale(Double value)
	 {
		this.diffscale = value;
	}
	
	/**
	 * 终止日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 终止日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 后收费折扣率,
	 */
	public Double getEnddiscount() {
		return this.enddiscount;
	}
	
	/**
	 * 后收费折扣率,
	 */
	public void setEnddiscount(Double value)
	 {
		this.enddiscount = value;
	}
	
	/**
	 * 备注,
	 */
	public String getExplain() {
		return this.explain;
	}
	
	/**
	 * 备注,
	 */
	public void setExplain(String value)
	 {
		this.explain = value;
	}
	
	/**
	 * 指数代码,
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 指数代码,
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 预约条件,
	 */
	public String getExponentflag() {
		return this.exponentflag;
	}
	
	/**
	 * 预约条件,
	 */
	public void setExponentflag(String value)
	 {
		this.exponentflag = value;
	}
	
	/**
	 * 预约点位,
	 */
	public String getExponentvalue() {
		return this.exponentvalue;
	}
	
	/**
	 * 预约点位,
	 */
	public void setExponentvalue(String value)
	 {
		this.exponentvalue = value;
	}
	
	/**
	 * 指数类型,
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 外部组合编号,
	 */
	public String getExtcombcode() {
		return this.extcombcode;
	}
	
	/**
	 * 外部组合编号,
	 */
	public void setExtcombcode(String value)
	 {
		this.extcombcode = value;
	}
	
	/**
	 * 到账金额,
	 */
	public Double getFactbala() {
		return this.factbala;
	}
	
	/**
	 * 到账金额,
	 */
	public void setFactbala(Double value)
	 {
		this.factbala = value;
	}
	
	/**
	 * 目标基金类型,
	 */
	public String getFargetfundtype() {
		return this.fargetfundtype;
	}
	
	/**
	 * 目标基金类型,
	 */
	public void setFargetfundtype(String value)
	 {
		this.fargetfundtype = value;
	}
	
	/**
	 * 交易日期,
	 */
	public String getFixday() {
		return this.fixday;
	}
	
	/**
	 * 交易日期,
	 */
	public void setFixday(String value)
	 {
		this.fixday = value;
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
	 * 基金子类型,
	 */
	public String getFundsubtype() {
		return this.fundsubtype;
	}
	
	/**
	 * 基金子类型,
	 */
	public void setFundsubtype(String value)
	 {
		this.fundsubtype = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 避险基金代码,
	 */
	public String getHedgefundcode() {
		return this.hedgefundcode;
	}
	
	/**
	 * 避险基金代码,
	 */
	public void setHedgefundcode(String value)
	 {
		this.hedgefundcode = value;
	}
	
	/**
	 * 避险基金份额类别,
	 */
	public String getHedgesharetype() {
		return this.hedgesharetype;
	}
	
	/**
	 * 避险基金份额类别,
	 */
	public void setHedgesharetype(String value)
	 {
		this.hedgesharetype = value;
	}
	
	/**
	 * 预约日期,
	 */
	public String getHopedate() {
		return this.hopedate;
	}
	
	/**
	 * 预约日期,
	 */
	public void setHopedate(String value)
	 {
		this.hopedate = value;
	}
	
	/**
	 * 投资浮动比例,
	 */
	public Double getInvenstrate() {
		return this.invenstrate;
	}
	
	/**
	 * 投资浮动比例,
	 */
	public void setInvenstrate(Double value)
	 {
		this.invenstrate = value;
	}
	
	/**
	 * 系统识别码,
	 */
	public String getInvestorsystemid() {
		return this.investorsystemid;
	}
	
	/**
	 * 系统识别码,
	 */
	public void setInvestorsystemid(String value)
	 {
		this.investorsystemid = value;
	}
	
	/**
	 * 扣款状态,
	 */
	public String getKkstat() {
		return this.kkstat;
	}
	
	/**
	 * 扣款状态,
	 */
	public void setKkstat(String value)
	 {
		this.kkstat = value;
	}
	
	/**
	 * 最后更新日期,
	 */
	public String getLastmodifydate() {
		return this.lastmodifydate;
	}
	
	/**
	 * 最后更新日期,
	 */
	public void setLastmodifydate(String value)
	 {
		this.lastmodifydate = value;
	}
	
	/**
	 * 长期均线类型,
	 */
	public String getLongavgexponenttype() {
		return this.longavgexponenttype;
	}
	
	/**
	 * 长期均线类型,
	 */
	public void setLongavgexponenttype(String value)
	 {
		this.longavgexponenttype = value;
	}
	
	/**
	 * 比例区间1上限,
	 */
	public Double getMaxscale1() {
		return this.maxscale1;
	}
	
	/**
	 * 比例区间1上限,
	 */
	public void setMaxscale1(Double value)
	 {
		this.maxscale1 = value;
	}
	
	/**
	 * 比例区间2上限,
	 */
	public Double getMaxscale2() {
		return this.maxscale2;
	}
	
	/**
	 * 比例区间2上限,
	 */
	public void setMaxscale2(Double value)
	 {
		this.maxscale2 = value;
	}
	
	/**
	 * 比例区间3上限,
	 */
	public String getMaxscale3() {
		return this.maxscale3;
	}
	
	/**
	 * 比例区间3上限,
	 */
	public void setMaxscale3(String value)
	 {
		this.maxscale3 = value;
	}
	
	/**
	 * 最大成功次数,
	 */
	public Integer getMaxsuccessnum() {
		return this.maxsuccessnum;
	}
	
	/**
	 * 最大成功次数,
	 */
	public void setMaxsuccessnum(Integer value)
	 {
		this.maxsuccessnum = value;
	}
	
	/**
	 * 最大交易成功额度,
	 */
	public Double getMaxvalue() {
		return this.maxvalue;
	}
	
	/**
	 * 最大交易成功额度,
	 */
	public void setMaxvalue(Double value)
	 {
		this.maxvalue = value;
	}
	
	/**
	 * 分红方式,
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 比例区间1下限,
	 */
	public Double getMinscale1() {
		return this.minscale1;
	}
	
	/**
	 * 比例区间1下限,
	 */
	public void setMinscale1(Double value)
	 {
		this.minscale1 = value;
	}
	
	/**
	 * 比例区间2下限,
	 */
	public Double getMinscale2() {
		return this.minscale2;
	}
	
	/**
	 * 比例区间2下限,
	 */
	public void setMinscale2(Double value)
	 {
		this.minscale2 = value;
	}
	
	/**
	 * 比例区间3下限,
	 */
	public String getMinscale3() {
		return this.minscale3;
	}
	
	/**
	 * 比例区间3下限,
	 */
	public void setMinscale3(String value)
	 {
		this.minscale3 = value;
	}
	
	/**
	 * 巨额赎回处理,
	 */
	public String getMintredeem() {
		return this.mintredeem;
	}
	
	/**
	 * 巨额赎回处理,
	 */
	public void setMintredeem(String value)
	 {
		this.mintredeem = value;
	}
	
	/**
	 * 对方基金账号,
	 */
	public String getOppfundcode() {
		return this.oppfundcode;
	}
	
	/**
	 * 对方基金账号,
	 */
	public void setOppfundcode(String value)
	 {
		this.oppfundcode = value;
	}
	
	/**
	 * 对方销售人,
	 */
	public String getOppsaler() {
		return this.oppsaler;
	}
	
	/**
	 * 对方销售人,
	 */
	public void setOppsaler(String value)
	 {
		this.oppsaler = value;
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
	 * 原申请日期,
	 */
	public String getOriapplydate() {
		return this.oriapplydate;
	}
	
	/**
	 * 原申请日期,
	 */
	public void setOriapplydate(String value)
	 {
		this.oriapplydate = value;
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
	 * 原业务代码,
	 */
	public String getOriginflag() {
		return this.originflag;
	}
	
	/**
	 * 原业务代码,
	 */
	public void setOriginflag(String value)
	 {
		this.originflag = value;
	}
	
	/**
	 * 补差费折扣率,
	 */
	public Double getOtherdiscount() {
		return this.otherdiscount;
	}
	
	/**
	 * 补差费折扣率,
	 */
	public void setOtherdiscount(Double value)
	 {
		this.otherdiscount = value;
	}
	
	/**
	 * 目标份额类型,
	 */
	public String getOthersharetype() {
		return this.othersharetype;
	}
	
	/**
	 * 目标份额类型,
	 */
	public void setOthersharetype(String value)
	 {
		this.othersharetype = value;
	}
	
	/**
	 * 对方交易账号,
	 */
	public String getOthertradeacco() {
		return this.othertradeacco;
	}
	
	/**
	 * 对方交易账号,
	 */
	public void setOthertradeacco(String value)
	 {
		this.othertradeacco = value;
	}
	
	/**
	 * 扣款部分成功选择,
	 */
	public String getPartflag() {
		return this.partflag;
	}
	
	/**
	 * 扣款部分成功选择,
	 */
	public void setPartflag(String value)
	 {
		this.partflag = value;
	}
	
	/**
	 * 协议号,
	 */
	public String getProtocol() {
		return this.protocol;
	}
	
	/**
	 * 协议号,
	 */
	public void setProtocol(String value)
	 {
		this.protocol = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getProtocolname() {
		return this.protocolname;
	}
	
	/**
	 * 申请日期,
	 */
	public void setProtocolname(String value)
	 {
		this.protocolname = value;
	}
	
	/**
	 * 风险标志,
	 */
	public String getRiskmatch() {
		return this.riskmatch;
	}
	
	/**
	 * 风险标志,
	 */
	public void setRiskmatch(String value)
	 {
		this.riskmatch = value;
	}
	
	/**
	 * 投资金额1,
	 */
	public Double getScalbalance1() {
		return this.scalbalance1;
	}
	
	/**
	 * 投资金额1,
	 */
	public void setScalbalance1(Double value)
	 {
		this.scalbalance1 = value;
	}
	
	/**
	 * 投资金额2,
	 */
	public Double getScalbalance2() {
		return this.scalbalance2;
	}
	
	/**
	 * 投资金额2,
	 */
	public void setScalbalance2(Double value)
	 {
		this.scalbalance2 = value;
	}
	
	/**
	 * 投资金额3,
	 */
	public Double getScalbalance3() {
		return this.scalbalance3;
	}
	
	/**
	 * 投资金额3,
	 */
	public void setScalbalance3(Double value)
	 {
		this.scalbalance3 = value;
	}
	
	/**
	 * 投资区间方案编号,
	 */
	public Integer getSectionschemano() {
		return this.sectionschemano;
	}
	
	/**
	 * 投资区间方案编号,
	 */
	public void setSectionschemano(Integer value)
	 {
		this.sectionschemano = value;
	}
	
	/**
	 * 自定义组合编号,
	 */
	public String getSelfcombcode() {
		return this.selfcombcode;
	}
	
	/**
	 * 自定义组合编号,
	 */
	public void setSelfcombcode(String value)
	 {
		this.selfcombcode = value;
	}
	
	/**
	 * TA发送标志,
	 */
	public String getSendflag() {
		return this.sendflag;
	}
	
	/**
	 * TA发送标志,
	 */
	public void setSendflag(String value)
	 {
		this.sendflag = value;
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
	 * 短期均线类型,
	 */
	public String getShortavgexponenttype() {
		return this.shortavgexponenttype;
	}
	
	/**
	 * 短期均线类型,
	 */
	public void setShortavgexponenttype(String value)
	 {
		this.shortavgexponenttype = value;
	}
	
	/**
	 * 审核员名称,
	 */
	public String getSubaccoauditname() {
		return this.subaccoauditname;
	}
	
	/**
	 * 审核员名称,
	 */
	public void setSubaccoauditname(String value)
	 {
		this.subaccoauditname = value;
	}
	
	/**
	 * 审核员编号,
	 */
	public String getSubaccoauditno() {
		return this.subaccoauditno;
	}
	
	/**
	 * 审核员编号,
	 */
	public void setSubaccoauditno(String value)
	 {
		this.subaccoauditno = value;
	}
	
	/**
	 * 子账户名称,
	 */
	public String getSubacconame() {
		return this.subacconame;
	}
	
	/**
	 * 子账户名称,
	 */
	public void setSubacconame(String value)
	 {
		this.subacconame = value;
	}
	
	/**
	 * 子账户编号,
	 */
	public String getSubaccono() {
		return this.subaccono;
	}
	
	/**
	 * 子账户编号,
	 */
	public void setSubaccono(String value)
	 {
		this.subaccono = value;
	}
	
	/**
	 * 交易权限,
	 */
	public String getSubtrade() {
		return this.subtrade;
	}
	
	/**
	 * 交易权限,
	 */
	public void setSubtrade(String value)
	 {
		this.subtrade = value;
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
	 * 目标基金子类型,
	 */
	public String getTargetfundsubtype() {
		return this.targetfundsubtype;
	}
	
	/**
	 * 目标基金子类型,
	 */
	public void setTargetfundsubtype(String value)
	 {
		this.targetfundsubtype = value;
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
	 * 交易经办人,
	 */
	public String getTradecontact() {
		return this.tradecontact;
	}
	
	/**
	 * 交易经办人,
	 */
	public void setTradecontact(String value)
	 {
		this.tradecontact = value;
	}
	
	/**
	 * 委托方式,
	 */
	public String getTrademethod() {
		return this.trademethod;
	}
	
	/**
	 * 委托方式,
	 */
	public void setTrademethod(String value)
	 {
		this.trademethod = value;
	}
	
	/**
	 * 凭证编号,
	 */
	public String getVoucherno() {
		return this.voucherno;
	}
	
	/**
	 * 凭证编号,
	 */
	public void setVoucherno(String value)
	 {
		this.voucherno = value;
	}
}
