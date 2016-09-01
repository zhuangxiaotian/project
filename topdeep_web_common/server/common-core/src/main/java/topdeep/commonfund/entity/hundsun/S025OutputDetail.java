package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易申请查询(S025)功能输出明细参数
 */
public class S025OutputDetail extends Object implements Serializable {
	
	/**
	 * 下单时间,
	 */
	private String accepttime = "";
	
	/**
	 * 申请日期,yyyyMMdd格式字符串
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
	 * 业务代码,显示业务名称请获取businflagStr字段
	 */
	private String callingcode = "";
	
	/**
	 * 资金方式,A:农行 B:建行 G:招行 J:民生 C:交行 3:银联
	 */
	private String capitalmode = "";
	
	/**
	 * 确认标志,（参考字典：交易确认标志）显示请用确认状态字段
	 */
	private String confirmflag = "";
	
	/**
	 * 确认状态,
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
	 * 原申请日期,yyyyMMdd格式字符串
	 */
	private String oriapplydate = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 委托方式,
	 */
	private String trademethod = "";
	
	/**
	 * 销售商编号,销售商名称取字典“EQAgencyName”
	 */
	private String agencyno = "";
	
	/**
	 * 申请份数,
	 */
	private Double applyshare;
	
	/**
	 * 申请金额,
	 */
	private Double applysum;
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	private String bankacco = "";
	
	/**
	 * 银联平台系统时间,
	 */
	private String banknetdate = "";
	
	/**
	 * 批次号,
	 */
	private String batchno = "";
	
	/**
	 * 交易网点代码,
	 */
	private String branchno = "";
	
	/**
	 * 业务名称,业务名称
	 */
	private String businflagStr = "";
	
	/**
	 * 业务大类,"01":现金宝业务
	 */
	private String busintype = "";
	
	/**
	 * 组合编号,
	 */
	private String combcode = "";
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 明细资金方式,"01":托收
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 指数代码,取字典“指数代码”
	 */
	private String exponentcode = "";
	
	/**
	 * 预约条件,（参考字典：预约条件）
	 */
	private String exponentflag = "";
	
	/**
	 * 预约点位,
	 */
	private Double exponentvalue;
	
	/**
	 * 指数类型,"02":指定金额不定额,"03":指数均线不定额,"12":趋势定投(时点指标法)
	 */
	private String exptype = "";
	
	/**
	 * 到账金额,
	 */
	private Double factbala;
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 冻结方式,
	 */
	private String freezemethod;
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 预约日期,yyyyMMdd格式字符串
	 */
	private String hopedate = "";
	
	/**
	 * 扣款状态,取字典“申请校验”
	 */
	private String kkstat = "";
	
	/**
	 * 分红方式,取字典“分红方式”
	 */
	private String melonmethod;
	
	/**
	 * 巨额赎回处理,
	 */
	private String mintredeem = "";
	
	/**
	 * 发生时银行卡号,
	 */
	private String occurbankacco = "";
	
	/**
	 * 发生时银行编号,
	 */
	private String occurbankno = "";
	
	/**
	 * 对方销售人,
	 */
	private String oppsaler = "";
	
	/**
	 * 对方托管网点,
	 */
	private String opptrusteebranch = "";
	
	/**
	 * 原申请单编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 扣款部分成功选择,
	 */
	private String partflag = "";
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	private String sharetype;
	
	/**
	 * 目标基金代码,
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标基金名称,
	 */
	private String targetfundname = "";
	
	/**
	 * 目标份额类型,取字典“份额类别”
	 */
	private String targetsharetype;
	
	/**
	 * 协议号,
	 */
	private String xyh = "";
	
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
	 * 业务代码,显示业务名称请获取businflagStr字段
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,显示业务名称请获取businflagStr字段
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 资金方式,A:农行 B:建行 G:招行 J:民生 C:交行 3:银联
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,A:农行 B:建行 G:招行 J:民生 C:交行 3:银联
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 确认标志,（参考字典：交易确认标志）显示请用确认状态字段
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,（参考字典：交易确认标志）显示请用确认状态字段
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 确认状态,
	 */
	public String getConfirmstat() {
		return this.confirmstat;
	}
	
	/**
	 * 确认状态,
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
	 * 原申请日期,yyyyMMdd格式字符串
	 */
	public String getOriapplydate() {
		return this.oriapplydate;
	}
	
	/**
	 * 原申请日期,yyyyMMdd格式字符串
	 */
	public void setOriapplydate(String value)
	 {
		this.oriapplydate = value;
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
	 * 业务大类,"01":现金宝业务
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,"01":现金宝业务
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
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
	 * 明细资金方式,"01":托收
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,"01":托收
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 指数代码,取字典“指数代码”
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 指数代码,取字典“指数代码”
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 预约条件,（参考字典：预约条件）
	 */
	public String getExponentflag() {
		return this.exponentflag;
	}
	
	/**
	 * 预约条件,（参考字典：预约条件）
	 */
	public void setExponentflag(String value)
	 {
		this.exponentflag = value;
	}
	
	/**
	 * 预约点位,
	 */
	public Double getExponentvalue() {
		return this.exponentvalue;
	}
	
	/**
	 * 预约点位,
	 */
	public void setExponentvalue(Double value)
	 {
		this.exponentvalue = value;
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
	 * 预约日期,yyyyMMdd格式字符串
	 */
	public String getHopedate() {
		return this.hopedate;
	}
	
	/**
	 * 预约日期,yyyyMMdd格式字符串
	 */
	public void setHopedate(String value)
	 {
		this.hopedate = value;
	}
	
	/**
	 * 扣款状态,取字典“申请校验”
	 */
	public String getKkstat() {
		return this.kkstat;
	}
	
	/**
	 * 扣款状态,取字典“申请校验”
	 */
	public void setKkstat(String value)
	 {
		this.kkstat = value;
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
	 * 目标份额类型,取字典“份额类别”
	 */
	public String getTargetsharetype() {
		return this.targetsharetype;
	}
	
	/**
	 * 目标份额类型,取字典“份额类别”
	 */
	public void setTargetsharetype(String value)
	 {
		this.targetsharetype = value;
	}
	
	/**
	 * 协议号,
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 协议号,
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
	}
}
