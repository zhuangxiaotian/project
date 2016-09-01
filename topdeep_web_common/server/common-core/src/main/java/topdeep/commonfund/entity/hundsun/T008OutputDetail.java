package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可撤单交易列表(T008)功能输出明细参数
 */
public class T008OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请日期,
	 */
	private String applydate = "";
	
	/**
	 * 申请时间,
	 */
	private String applytime = "";
	
	/**
	 * 原申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请额度,
	 */
	private Double applysum;
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 业务大类,01表示现金宝
	 */
	private String busintype = "";
	
	/**
	 * 资金方式,（参考字典：资金方式）
	 */
	private String capitalmode = "";
	
	/**
	 * 组合编号,
	 */
	private String combcode = "";
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 明细资金方式,01托收
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 预约指数代码,（参考字典：预约交易指数代码）
	 */
	private String exponentcode = "";
	
	/**
	 * 预约比较条件,（参考字典：预约条件）
	 */
	private String exponentflag = "";
	
	/**
	 * 预约点位,
	 */
	private Double exponentvalue;
	
	/**
	 * 指数类型,
	 */
	private String exptype = "";
	
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
	 * 预约日期,
	 */
	private String hopedate = "";
	
	/**
	 * 扣款状态,（参考字典：申请校验）
	 */
	private String kkstat = "";
	
	/**
	 * 风险匹配结果,
	 */
	private String riskmatch = "";
	
	/**
	 * 收费方式,（参考字典：份额类别）
	 */
	private String sharetype = "";
	
	/**
	 * 目标基金代码,
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标基金名称,
	 */
	private String targetfundname = "";
	
	/**
	 * 目标收费方式,
	 */
	private String targetsharetype = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 协议号,
	 */
	private String xyh = "";
	
	/**
	 * 下单时间,
	 */
	private String accepttime = "";
	
	/**
	 * 业务名称,
	 */
	private String businflagStr = "";
	
	/**
	 * 下单日期,
	 */
	private String oriapplydate = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 分红方式,
	 */
	private String melonmethod = "";
	
	/**
	 * 申请金额,
	 */
	private Double applyamount;
	
	/**
	 * 申请份额,
	 */
	private Double applyshare;
	
	/**
	 * 审核状态,
	 */
	private String custconfirm = "";
	
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
	 * 外部订单号,服务升级到交易申请查询9A时才有返回值
	 */
	private String otherserial = "";
	
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
	 * 原申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 原申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 申请额度,
	 */
	public Double getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请额度,
	 */
	public void setApplysum(Double value)
	 {
		this.applysum = value;
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
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 业务大类,01表示现金宝
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,01表示现金宝
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 资金方式,（参考字典：资金方式）
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,（参考字典：资金方式）
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
	 * 明细资金方式,01托收
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,01托收
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 预约指数代码,（参考字典：预约交易指数代码）
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 预约指数代码,（参考字典：预约交易指数代码）
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 预约比较条件,（参考字典：预约条件）
	 */
	public String getExponentflag() {
		return this.exponentflag;
	}
	
	/**
	 * 预约比较条件,（参考字典：预约条件）
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
	 * 扣款状态,（参考字典：申请校验）
	 */
	public String getKkstat() {
		return this.kkstat;
	}
	
	/**
	 * 扣款状态,（参考字典：申请校验）
	 */
	public void setKkstat(String value)
	 {
		this.kkstat = value;
	}
	
	/**
	 * 风险匹配结果,
	 */
	public String getRiskmatch() {
		return this.riskmatch;
	}
	
	/**
	 * 风险匹配结果,
	 */
	public void setRiskmatch(String value)
	 {
		this.riskmatch = value;
	}
	
	/**
	 * 收费方式,（参考字典：份额类别）
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,（参考字典：份额类别）
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
	 * 目标收费方式,
	 */
	public String getTargetsharetype() {
		return this.targetsharetype;
	}
	
	/**
	 * 目标收费方式,
	 */
	public void setTargetsharetype(String value)
	 {
		this.targetsharetype = value;
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
	 * 下单日期,
	 */
	public String getOriapplydate() {
		return this.oriapplydate;
	}
	
	/**
	 * 下单日期,
	 */
	public void setOriapplydate(String value)
	 {
		this.oriapplydate = value;
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
	 * 申请金额,
	 */
	public Double getApplyamount() {
		return this.applyamount;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplyamount(Double value)
	 {
		this.applyamount = value;
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
	 * 审核状态,
	 */
	public String getCustconfirm() {
		return this.custconfirm;
	}
	
	/**
	 * 审核状态,
	 */
	public void setCustconfirm(String value)
	 {
		this.custconfirm = value;
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
	 * 外部订单号,服务升级到交易申请查询9A时才有返回值
	 */
	public String getOtherserial() {
		return this.otherserial;
	}
	
	/**
	 * 外部订单号,服务升级到交易申请查询9A时才有返回值
	 */
	public void setOtherserial(String value)
	 {
		this.otherserial = value;
	}
}
