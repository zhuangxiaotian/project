package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投协议列表查询(I005)功能输出明细参数
 */
public class I005OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	private String capitalmode;
	
	/**
	 * 协议周期单位,
	 */
	private String cycleunit;
	
	/**
	 * 允许顺延天数,
	 */
	private String delayday = "";
	
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
	 * 交易日期,
	 */
	private String jyrq = "";
	
	/**
	 * 交易周期,
	 */
	private String jyzq = "";
	
	/**
	 * 下次交易日期,
	 */
	private String nextdate = "";
	
	/**
	 * 首次交易月,
	 */
	private String scjyy = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype;
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	private String state;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 协议号,
	 */
	private String xyh = "";
	
	/**
	 * 业务代码,
	 */
	private String ywdm = "";
	
	/**
	 * 终止日期,
	 */
	private String zzrq = "";
	
	/**
	 * 业务名称,
	 */
	private String businname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 申请份额,
	 */
	private String applyshare = "";
	
	/**
	 * 申请金额,
	 */
	private String applysum = "";
	
	/**
	 * 均线类型,取字典“均线类型”
	 */
	private String avgexponenttype = "";
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	private String bankacco = "";
	
	/**
	 * 业务大类,"01":现金宝业务
	 */
	private String busintype = "";
	
	/**
	 * 币种,
	 */
	private String bz = "";
	
	/**
	 * 分中心,
	 */
	private String center = "";
	
	/**
	 * 组合协议申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 投资金额1,
	 */
	private Double declaresum1;
	
	/**
	 * 投资金额2,
	 */
	private Double declaresum2;
	
	/**
	 * 投资金额3,
	 */
	private Double declaresum3;
	
	/**
	 * 明细资金方式,
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 级差,取字典“定投级差”
	 */
	private String diffscale = "";
	
	/**
	 * 指数代码,取字典“指数代码”
	 */
	private String exponentcode = "";
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额, "03":指数均线不定额，"12":趋势定投(时点指标法),14:信用卡还款
	 */
	private String exptype = "";
	
	/**
	 * 巨额赎回标志,
	 */
	private String jeshbz = "";
	
	/**
	 * 经纪人,
	 */
	private String jjr = "";
	
	/**
	 * 交易标识,
	 */
	private String jybz = "";
	
	/**
	 * 最大交易成功次数,
	 */
	private String maxsuccessnum = "";
	
	/**
	 * 最大交易成功额度,
	 */
	private String maxvalue = "";
	
	/**
	 * 网点,
	 */
	private String net = "";
	
	/**
	 * 对方基金代码,
	 */
	private String otherfundcode = "";
	
	/**
	 * 对方基金名称,
	 */
	private String otherfundname = "";
	
	/**
	 * 对方份额类别,取字典“份额类别”
	 */
	private String othersharetype;
	
	/**
	 * 协议暂停标志,1:"自动暂停"
	 */
	private String pauseflag;
	
	/**
	 * 比例区间1下限,
	 */
	private Double proratelower1;
	
	/**
	 * 比例区间2下限,
	 */
	private Double proratelower2;
	
	/**
	 * 比例区间3下限,
	 */
	private Double proratelower3;
	
	/**
	 * 比例区间1上限,
	 */
	private Double prorateupper1;
	
	/**
	 * 比例区间2上限,
	 */
	private Double prorateupper2;
	
	/**
	 * 比例区间3上限,
	 */
	private Double prorateupper3;
	
	/**
	 * 预警标志,
	 */
	private String riskflag;
	
	/**
	 * 顺延原因,
	 */
	private String syyy = "";
	
	/**
	 * 顺延原因代码,
	 */
	private String syyydm = "";
	
	/**
	 * 累计确认金额,
	 */
	private Double totalcfmmoney;
	
	/**
	 * 累计确认份额,
	 */
	private Double totalcfmsum;
	
	/**
	 * 累计交易成功额度,
	 */
	private String totalsuccsum = "";
	
	/**
	 * 累计成功次数,
	 */
	private String totalsucctime = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 委托方式,
	 */
	private String trademethod;
	
	/**
	 * 协议名称,
	 */
	private String xybm = "";
	
	/**
	 * 协议终止类型,
	 */
	private String xyzztype;
	
	/**
	 * 允许失败次数,
	 */
	private String yxsbcs = "";
	
	/**
	 * 组合代码,
	 */
	private String zhdm = "";
	
	/**
	 * 折扣率,
	 */
	private String zkl = "";
	
	/**
	 * 避险基金代码,exptype为"12"时返回
	 */
	private String hedgefundcode = "";
	
	/**
	 * 避险基金名称,exptype为"12"时返回
	 */
	private String hedgefundname = "";
	
	/**
	 * 避险基金收费方式,exptype为"12"时返回
	 */
	private String hedgesharetype = "";
	
	/**
	 * 避险基金份额,exptype为"12"时返回
	 */
	private String hedgetotalshare = "";
	
	/**
	 * 长期均线,exptype为"12"时返回
	 */
	private String longavgexponenttype = "";
	
	/**
	 * 中期均线,exptype为"12"时返回
	 */
	private String mediumavgexponenttype = "";
	
	/**
	 * 短期均线,exptype为"12"时返回
	 */
	private String shortavgexponenttype = "";
	
	/**
	 * 资产余额,exptype为"12"时返回
	 */
	private String totalcapital = "";
	
	/**
	 * 最高扣款金额,exptype为"11"时返回
	 */
	private String maxcharge = "";
	
	/**
	 * 最低留存金额,exptype为"11"时返回
	 */
	private String minbalance = "";
	
	/**
	 * 最低扣款金额,exptype为"11"时返回
	 */
	private String mincharge = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 还款银行卡号,exptype为"14"时返回
	 */
	private String paymentaccono = "";
	
	/**
	 * 还款方式,1:最低还款;2:最优还款;3:全额还款 exptype为"14"时返回
	 */
	private String paymentbalatype = "";
	
	/**
	 * 对方交易账户,
	 */
	private String othertradeacco = "";
	
	/**
	 * 定投策略方案编号,
	 */
	private String sectionschemano = "";
	
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
	 * 允许顺延天数,
	 */
	public String getDelayday() {
		return this.delayday;
	}
	
	/**
	 * 允许顺延天数,
	 */
	public void setDelayday(String value)
	 {
		this.delayday = value;
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
	 * 交易日期,
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,
	 */
	public void setJyrq(String value)
	 {
		this.jyrq = value;
	}
	
	/**
	 * 交易周期,
	 */
	public String getJyzq() {
		return this.jyzq;
	}
	
	/**
	 * 交易周期,
	 */
	public void setJyzq(String value)
	 {
		this.jyzq = value;
	}
	
	/**
	 * 下次交易日期,
	 */
	public String getNextdate() {
		return this.nextdate;
	}
	
	/**
	 * 下次交易日期,
	 */
	public void setNextdate(String value)
	 {
		this.nextdate = value;
	}
	
	/**
	 * 首次交易月,
	 */
	public String getScjyy() {
		return this.scjyy;
	}
	
	/**
	 * 首次交易月,
	 */
	public void setScjyy(String value)
	 {
		this.scjyy = value;
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
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
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
	 * 业务代码,
	 */
	public String getYwdm() {
		return this.ywdm;
	}
	
	/**
	 * 业务代码,
	 */
	public void setYwdm(String value)
	 {
		this.ywdm = value;
	}
	
	/**
	 * 终止日期,
	 */
	public String getZzrq() {
		return this.zzrq;
	}
	
	/**
	 * 终止日期,
	 */
	public void setZzrq(String value)
	 {
		this.zzrq = value;
	}
	
	/**
	 * 业务名称,
	 */
	public String getBusinname() {
		return this.businname;
	}
	
	/**
	 * 业务名称,
	 */
	public void setBusinname(String value)
	 {
		this.businname = value;
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
	 * 申请份额,
	 */
	public String getApplyshare() {
		return this.applyshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setApplyshare(String value)
	 {
		this.applyshare = value;
	}
	
	/**
	 * 申请金额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 均线类型,取字典“均线类型”
	 */
	public String getAvgexponenttype() {
		return this.avgexponenttype;
	}
	
	/**
	 * 均线类型,取字典“均线类型”
	 */
	public void setAvgexponenttype(String value)
	 {
		this.avgexponenttype = value;
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
	 * 币种,
	 */
	public String getBz() {
		return this.bz;
	}
	
	/**
	 * 币种,
	 */
	public void setBz(String value)
	 {
		this.bz = value;
	}
	
	/**
	 * 分中心,
	 */
	public String getCenter() {
		return this.center;
	}
	
	/**
	 * 分中心,
	 */
	public void setCenter(String value)
	 {
		this.center = value;
	}
	
	/**
	 * 组合协议申请编号,
	 */
	public String getCombrequestno() {
		return this.combrequestno;
	}
	
	/**
	 * 组合协议申请编号,
	 */
	public void setCombrequestno(String value)
	 {
		this.combrequestno = value;
	}
	
	/**
	 * 投资金额1,
	 */
	public Double getDeclaresum1() {
		return this.declaresum1;
	}
	
	/**
	 * 投资金额1,
	 */
	public void setDeclaresum1(Double value)
	 {
		this.declaresum1 = value;
	}
	
	/**
	 * 投资金额2,
	 */
	public Double getDeclaresum2() {
		return this.declaresum2;
	}
	
	/**
	 * 投资金额2,
	 */
	public void setDeclaresum2(Double value)
	 {
		this.declaresum2 = value;
	}
	
	/**
	 * 投资金额3,
	 */
	public Double getDeclaresum3() {
		return this.declaresum3;
	}
	
	/**
	 * 投资金额3,
	 */
	public void setDeclaresum3(Double value)
	 {
		this.declaresum3 = value;
	}
	
	/**
	 * 明细资金方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 级差,取字典“定投级差”
	 */
	public String getDiffscale() {
		return this.diffscale;
	}
	
	/**
	 * 级差,取字典“定投级差”
	 */
	public void setDiffscale(String value)
	 {
		this.diffscale = value;
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
	 * 指数类型,默认：定期定额,"02":指定金额不定额, "03":指数均线不定额，"12":趋势定投(时点指标法),14:信用卡还款
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额, "03":指数均线不定额，"12":趋势定投(时点指标法),14:信用卡还款
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 巨额赎回标志,
	 */
	public String getJeshbz() {
		return this.jeshbz;
	}
	
	/**
	 * 巨额赎回标志,
	 */
	public void setJeshbz(String value)
	 {
		this.jeshbz = value;
	}
	
	/**
	 * 经纪人,
	 */
	public String getJjr() {
		return this.jjr;
	}
	
	/**
	 * 经纪人,
	 */
	public void setJjr(String value)
	 {
		this.jjr = value;
	}
	
	/**
	 * 交易标识,
	 */
	public String getJybz() {
		return this.jybz;
	}
	
	/**
	 * 交易标识,
	 */
	public void setJybz(String value)
	 {
		this.jybz = value;
	}
	
	/**
	 * 最大交易成功次数,
	 */
	public String getMaxsuccessnum() {
		return this.maxsuccessnum;
	}
	
	/**
	 * 最大交易成功次数,
	 */
	public void setMaxsuccessnum(String value)
	 {
		this.maxsuccessnum = value;
	}
	
	/**
	 * 最大交易成功额度,
	 */
	public String getMaxvalue() {
		return this.maxvalue;
	}
	
	/**
	 * 最大交易成功额度,
	 */
	public void setMaxvalue(String value)
	 {
		this.maxvalue = value;
	}
	
	/**
	 * 网点,
	 */
	public String getNet() {
		return this.net;
	}
	
	/**
	 * 网点,
	 */
	public void setNet(String value)
	 {
		this.net = value;
	}
	
	/**
	 * 对方基金代码,
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 对方基金代码,
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
	}
	
	/**
	 * 对方基金名称,
	 */
	public String getOtherfundname() {
		return this.otherfundname;
	}
	
	/**
	 * 对方基金名称,
	 */
	public void setOtherfundname(String value)
	 {
		this.otherfundname = value;
	}
	
	/**
	 * 对方份额类别,取字典“份额类别”
	 */
	public String getOthersharetype() {
		return this.othersharetype;
	}
	
	/**
	 * 对方份额类别,取字典“份额类别”
	 */
	public void setOthersharetype(String value)
	 {
		this.othersharetype = value;
	}
	
	/**
	 * 协议暂停标志,1:"自动暂停"
	 */
	public String getPauseflag() {
		return this.pauseflag;
	}
	
	/**
	 * 协议暂停标志,1:"自动暂停"
	 */
	public void setPauseflag(String value)
	 {
		this.pauseflag = value;
	}
	
	/**
	 * 比例区间1下限,
	 */
	public Double getProratelower1() {
		return this.proratelower1;
	}
	
	/**
	 * 比例区间1下限,
	 */
	public void setProratelower1(Double value)
	 {
		this.proratelower1 = value;
	}
	
	/**
	 * 比例区间2下限,
	 */
	public Double getProratelower2() {
		return this.proratelower2;
	}
	
	/**
	 * 比例区间2下限,
	 */
	public void setProratelower2(Double value)
	 {
		this.proratelower2 = value;
	}
	
	/**
	 * 比例区间3下限,
	 */
	public Double getProratelower3() {
		return this.proratelower3;
	}
	
	/**
	 * 比例区间3下限,
	 */
	public void setProratelower3(Double value)
	 {
		this.proratelower3 = value;
	}
	
	/**
	 * 比例区间1上限,
	 */
	public Double getProrateupper1() {
		return this.prorateupper1;
	}
	
	/**
	 * 比例区间1上限,
	 */
	public void setProrateupper1(Double value)
	 {
		this.prorateupper1 = value;
	}
	
	/**
	 * 比例区间2上限,
	 */
	public Double getProrateupper2() {
		return this.prorateupper2;
	}
	
	/**
	 * 比例区间2上限,
	 */
	public void setProrateupper2(Double value)
	 {
		this.prorateupper2 = value;
	}
	
	/**
	 * 比例区间3上限,
	 */
	public Double getProrateupper3() {
		return this.prorateupper3;
	}
	
	/**
	 * 比例区间3上限,
	 */
	public void setProrateupper3(Double value)
	 {
		this.prorateupper3 = value;
	}
	
	/**
	 * 预警标志,
	 */
	public String getRiskflag() {
		return this.riskflag;
	}
	
	/**
	 * 预警标志,
	 */
	public void setRiskflag(String value)
	 {
		this.riskflag = value;
	}
	
	/**
	 * 顺延原因,
	 */
	public String getSyyy() {
		return this.syyy;
	}
	
	/**
	 * 顺延原因,
	 */
	public void setSyyy(String value)
	 {
		this.syyy = value;
	}
	
	/**
	 * 顺延原因代码,
	 */
	public String getSyyydm() {
		return this.syyydm;
	}
	
	/**
	 * 顺延原因代码,
	 */
	public void setSyyydm(String value)
	 {
		this.syyydm = value;
	}
	
	/**
	 * 累计确认金额,
	 */
	public Double getTotalcfmmoney() {
		return this.totalcfmmoney;
	}
	
	/**
	 * 累计确认金额,
	 */
	public void setTotalcfmmoney(Double value)
	 {
		this.totalcfmmoney = value;
	}
	
	/**
	 * 累计确认份额,
	 */
	public Double getTotalcfmsum() {
		return this.totalcfmsum;
	}
	
	/**
	 * 累计确认份额,
	 */
	public void setTotalcfmsum(Double value)
	 {
		this.totalcfmsum = value;
	}
	
	/**
	 * 累计交易成功额度,
	 */
	public String getTotalsuccsum() {
		return this.totalsuccsum;
	}
	
	/**
	 * 累计交易成功额度,
	 */
	public void setTotalsuccsum(String value)
	 {
		this.totalsuccsum = value;
	}
	
	/**
	 * 累计成功次数,
	 */
	public String getTotalsucctime() {
		return this.totalsucctime;
	}
	
	/**
	 * 累计成功次数,
	 */
	public void setTotalsucctime(String value)
	 {
		this.totalsucctime = value;
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
	 * 协议名称,
	 */
	public String getXybm() {
		return this.xybm;
	}
	
	/**
	 * 协议名称,
	 */
	public void setXybm(String value)
	 {
		this.xybm = value;
	}
	
	/**
	 * 协议终止类型,
	 */
	public String getXyzztype() {
		return this.xyzztype;
	}
	
	/**
	 * 协议终止类型,
	 */
	public void setXyzztype(String value)
	 {
		this.xyzztype = value;
	}
	
	/**
	 * 允许失败次数,
	 */
	public String getYxsbcs() {
		return this.yxsbcs;
	}
	
	/**
	 * 允许失败次数,
	 */
	public void setYxsbcs(String value)
	 {
		this.yxsbcs = value;
	}
	
	/**
	 * 组合代码,
	 */
	public String getZhdm() {
		return this.zhdm;
	}
	
	/**
	 * 组合代码,
	 */
	public void setZhdm(String value)
	 {
		this.zhdm = value;
	}
	
	/**
	 * 折扣率,
	 */
	public String getZkl() {
		return this.zkl;
	}
	
	/**
	 * 折扣率,
	 */
	public void setZkl(String value)
	 {
		this.zkl = value;
	}
	
	/**
	 * 避险基金代码,exptype为"12"时返回
	 */
	public String getHedgefundcode() {
		return this.hedgefundcode;
	}
	
	/**
	 * 避险基金代码,exptype为"12"时返回
	 */
	public void setHedgefundcode(String value)
	 {
		this.hedgefundcode = value;
	}
	
	/**
	 * 避险基金名称,exptype为"12"时返回
	 */
	public String getHedgefundname() {
		return this.hedgefundname;
	}
	
	/**
	 * 避险基金名称,exptype为"12"时返回
	 */
	public void setHedgefundname(String value)
	 {
		this.hedgefundname = value;
	}
	
	/**
	 * 避险基金收费方式,exptype为"12"时返回
	 */
	public String getHedgesharetype() {
		return this.hedgesharetype;
	}
	
	/**
	 * 避险基金收费方式,exptype为"12"时返回
	 */
	public void setHedgesharetype(String value)
	 {
		this.hedgesharetype = value;
	}
	
	/**
	 * 避险基金份额,exptype为"12"时返回
	 */
	public String getHedgetotalshare() {
		return this.hedgetotalshare;
	}
	
	/**
	 * 避险基金份额,exptype为"12"时返回
	 */
	public void setHedgetotalshare(String value)
	 {
		this.hedgetotalshare = value;
	}
	
	/**
	 * 长期均线,exptype为"12"时返回
	 */
	public String getLongavgexponenttype() {
		return this.longavgexponenttype;
	}
	
	/**
	 * 长期均线,exptype为"12"时返回
	 */
	public void setLongavgexponenttype(String value)
	 {
		this.longavgexponenttype = value;
	}
	
	/**
	 * 中期均线,exptype为"12"时返回
	 */
	public String getMediumavgexponenttype() {
		return this.mediumavgexponenttype;
	}
	
	/**
	 * 中期均线,exptype为"12"时返回
	 */
	public void setMediumavgexponenttype(String value)
	 {
		this.mediumavgexponenttype = value;
	}
	
	/**
	 * 短期均线,exptype为"12"时返回
	 */
	public String getShortavgexponenttype() {
		return this.shortavgexponenttype;
	}
	
	/**
	 * 短期均线,exptype为"12"时返回
	 */
	public void setShortavgexponenttype(String value)
	 {
		this.shortavgexponenttype = value;
	}
	
	/**
	 * 资产余额,exptype为"12"时返回
	 */
	public String getTotalcapital() {
		return this.totalcapital;
	}
	
	/**
	 * 资产余额,exptype为"12"时返回
	 */
	public void setTotalcapital(String value)
	 {
		this.totalcapital = value;
	}
	
	/**
	 * 最高扣款金额,exptype为"11"时返回
	 */
	public String getMaxcharge() {
		return this.maxcharge;
	}
	
	/**
	 * 最高扣款金额,exptype为"11"时返回
	 */
	public void setMaxcharge(String value)
	 {
		this.maxcharge = value;
	}
	
	/**
	 * 最低留存金额,exptype为"11"时返回
	 */
	public String getMinbalance() {
		return this.minbalance;
	}
	
	/**
	 * 最低留存金额,exptype为"11"时返回
	 */
	public void setMinbalance(String value)
	 {
		this.minbalance = value;
	}
	
	/**
	 * 最低扣款金额,exptype为"11"时返回
	 */
	public String getMincharge() {
		return this.mincharge;
	}
	
	/**
	 * 最低扣款金额,exptype为"11"时返回
	 */
	public void setMincharge(String value)
	 {
		this.mincharge = value;
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
	 * 还款银行卡号,exptype为"14"时返回
	 */
	public String getPaymentaccono() {
		return this.paymentaccono;
	}
	
	/**
	 * 还款银行卡号,exptype为"14"时返回
	 */
	public void setPaymentaccono(String value)
	 {
		this.paymentaccono = value;
	}
	
	/**
	 * 还款方式,1:最低还款;2:最优还款;3:全额还款 exptype为"14"时返回
	 */
	public String getPaymentbalatype() {
		return this.paymentbalatype;
	}
	
	/**
	 * 还款方式,1:最低还款;2:最优还款;3:全额还款 exptype为"14"时返回
	 */
	public void setPaymentbalatype(String value)
	 {
		this.paymentbalatype = value;
	}
	
	/**
	 * 对方交易账户,
	 */
	public String getOthertradeacco() {
		return this.othertradeacco;
	}
	
	/**
	 * 对方交易账户,
	 */
	public void setOthertradeacco(String value)
	 {
		this.othertradeacco = value;
	}
	
	/**
	 * 定投策略方案编号,
	 */
	public String getSectionschemano() {
		return this.sectionschemano;
	}
	
	/**
	 * 定投策略方案编号,
	 */
	public void setSectionschemano(String value)
	 {
		this.sectionschemano = value;
	}
}
