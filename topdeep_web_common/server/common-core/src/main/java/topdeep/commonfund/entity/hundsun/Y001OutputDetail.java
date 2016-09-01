package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 未处理预约申请列表(Y001)功能输出明细参数
 */
public class Y001OutputDetail extends Object implements Serializable {
	
	/**
	 * 下单时间,
	 */
	private String accepttime = "";
	
	/**
	 * 申请日期,
	 */
	private String applydate = "";
	
	/**
	 * 申请时间,
	 */
	private String applytime = "";
	
	/**
	 * 申请编号,
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
	 * 业务代码,（参考字典：业务名称）
	 */
	private String businflag = "";
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 资金方式,（参考字典：资金方式）
	 */
	private String capitalmode = "";
	
	/**
	 * 组合代码,
	 */
	private String combcode = "";
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 确认标志,（参考字典：交易确认标志）
	 */
	private String confirmflag = "";
	
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
	 * 巨额赎回处理,
	 */
	private String mintredeem = "";
	
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
	 * 目标收费方式,（参考字典：份额类别）
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
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
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
	 * 业务代码,（参考字典：业务名称）
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,（参考字典：业务名称）
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
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
	 * 组合代码,
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合代码,
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
	 * 确认标志,（参考字典：交易确认标志）
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,（参考字典：交易确认标志）
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
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
	 * 目标收费方式,（参考字典：份额类别）
	 */
	public String getTargetsharetype() {
		return this.targetsharetype;
	}
	
	/**
	 * 目标收费方式,（参考字典：份额类别）
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
}
