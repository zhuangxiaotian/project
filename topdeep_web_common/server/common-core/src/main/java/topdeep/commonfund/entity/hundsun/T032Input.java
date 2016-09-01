package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可撤单列表接口(T032)
 */
public class T032Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请记录数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 自动发起标志(=),
	 */
	private String autorequest;
	
	/**
	 * 首次交易日期,
	 */
	private String begindate = "";
	
	/**
	 * 批次号,
	 */
	private String branchno = "";
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 业务代码,
	 */
	private String callingcode = "";
	
	/**
	 * 业务代码(<>),
	 */
	private String callingcodenoteq = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 资金方式(<>),
	 */
	private String capitalmode2;
	
	/**
	 * 非撤单和确认失败,
	 */
	private String chedan_confirmflag;
	
	/**
	 * 理财平台流水号(=),
	 */
	private String chinapayserialno = "";
	
	/**
	 * 组合投资标志,
	 */
	private String combinvestflag;
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 通信发送状态,
	 */
	private String commerrorno;
	
	/**
	 * 确认标志,
	 */
	private String confirmflag;
	
	/**
	 * 确认标志(=),
	 */
	private String confirmflagnoteq;
	
	/**
	 * 审核标志,
	 */
	private String custconfirm;
	
	/**
	 * 客户类别,
	 */
	private String custtype;
	
	/**
	 * 终止日期,
	 */
	private String enddate = "";
	
	/**
	 * E通宝基金申请,
	 */
	private String etbjjsq;
	
	/**
	 * E通宝申请,
	 */
	private String etbsq;
	
	/**
	 * 定期不定额标志,
	 */
	private String exptype;
	
	/**
	 * 未扣款成功的余额理财申请(1),
	 */
	private String financingstate;
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金类型,
	 */
	private String fundsubtype;
	
	/**
	 * 基金类型(<>),
	 */
	private String fundsubtypeneq;
	
	/**
	 * 基金类型,
	 */
	private String fundtype;
	
	/**
	 * 基金类型(<>),
	 */
	private String fundtypenoteq;
	
	/**
	 * 系统识别码,
	 */
	private String investorsystemid = "";
	
	/**
	 * 扣款状态,
	 */
	private String kkstat;
	
	/**
	 * 行号,
	 */
	private String linenumber = "";
	
	/**
	 * 基金管理人代码(=),
	 */
	private String managercode = "";
	
	/**
	 * 在途标志(=),
	 */
	private String onlineflag;
	
	/**
	 * 操作员代码,
	 */
	private String operatorno = "";
	
	/**
	 * 原申请单编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 是否申购定投申请,
	 */
	private String querydeclarevaluavgr;
	
	/**
	 * 是否赎回转换申请,
	 */
	private String queryredeemtranflag;
	
	/**
	 * TA发送标志(=),
	 */
	private String sendstate;
	
	/**
	 * 起始日期,
	 */
	private String startdate = "";
	
	/**
	 * 审核员编号,
	 */
	private String subaccoauditno = "";
	
	/**
	 * 子账户编号=,
	 */
	private String subacconoeq = "";
	
	/**
	 * 子账户编号<>,
	 */
	private String subaccononeq = "";
	
	/**
	 * 目标基金代码,
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标基金子类型(=),
	 */
	private String targetfundsubtype;
	
	/**
	 * 目标基金子类型(<>),
	 */
	private String targetfundsubtypeneq;
	
	/**
	 * 目标基金子类型,
	 */
	private String targetfundtype;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易方式,
	 */
	private String trademethod;
	
	/**
	 * 预约交易是否生效,
	 */
	private String tradestate;
	
	/**
	 * 定期定额协议业务标志,
	 */
	private String valufixflag;
	
	/**
	 * 凭证编号,
	 */
	private String voucherno = "";
	
	/**
	 * 协议号,
	 */
	private String xyh = "";
	
	/**
	 * 预约日期(<),
	 */
	private String yuyuedate = "";
	
	/**
	 * 预约日期(>),
	 */
	private String yuyuedatebig = "";
	
	/**
	 * 初始化参数
	 */
	public T032Input() {
		this.setFunction("T032");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请记录数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请记录数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
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
	 * 自动发起标志(=),
	 */
	public String getAutorequest() {
		return this.autorequest;
	}
	
	/**
	 * 自动发起标志(=),
	 */
	public void setAutorequest(String value)
	 {
		this.autorequest = value;
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
	 * 批次号,
	 */
	public String getBranchno() {
		return this.branchno;
	}
	
	/**
	 * 批次号,
	 */
	public void setBranchno(String value)
	 {
		this.branchno = value;
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
	 * 业务代码(<>),
	 */
	public String getCallingcodenoteq() {
		return this.callingcodenoteq;
	}
	
	/**
	 * 业务代码(<>),
	 */
	public void setCallingcodenoteq(String value)
	 {
		this.callingcodenoteq = value;
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
	 * 资金方式(<>),
	 */
	public String getCapitalmode2() {
		return this.capitalmode2;
	}
	
	/**
	 * 资金方式(<>),
	 */
	public void setCapitalmode2(String value)
	 {
		this.capitalmode2 = value;
	}
	
	/**
	 * 非撤单和确认失败,
	 */
	public String getChedan_confirmflag() {
		return this.chedan_confirmflag;
	}
	
	/**
	 * 非撤单和确认失败,
	 */
	public void setChedan_confirmflag(String value)
	 {
		this.chedan_confirmflag = value;
	}
	
	/**
	 * 理财平台流水号(=),
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 理财平台流水号(=),
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
	}
	
	/**
	 * 组合投资标志,
	 */
	public String getCombinvestflag() {
		return this.combinvestflag;
	}
	
	/**
	 * 组合投资标志,
	 */
	public void setCombinvestflag(String value)
	 {
		this.combinvestflag = value;
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
	 * 通信发送状态,
	 */
	public String getCommerrorno() {
		return this.commerrorno;
	}
	
	/**
	 * 通信发送状态,
	 */
	public void setCommerrorno(String value)
	 {
		this.commerrorno = value;
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
	 * 确认标志(=),
	 */
	public String getConfirmflagnoteq() {
		return this.confirmflagnoteq;
	}
	
	/**
	 * 确认标志(=),
	 */
	public void setConfirmflagnoteq(String value)
	 {
		this.confirmflagnoteq = value;
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
	 * E通宝基金申请,
	 */
	public String getEtbjjsq() {
		return this.etbjjsq;
	}
	
	/**
	 * E通宝基金申请,
	 */
	public void setEtbjjsq(String value)
	 {
		this.etbjjsq = value;
	}
	
	/**
	 * E通宝申请,
	 */
	public String getEtbsq() {
		return this.etbsq;
	}
	
	/**
	 * E通宝申请,
	 */
	public void setEtbsq(String value)
	 {
		this.etbsq = value;
	}
	
	/**
	 * 定期不定额标志,
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 定期不定额标志,
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 未扣款成功的余额理财申请(1),
	 */
	public String getFinancingstate() {
		return this.financingstate;
	}
	
	/**
	 * 未扣款成功的余额理财申请(1),
	 */
	public void setFinancingstate(String value)
	 {
		this.financingstate = value;
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
	 * 基金类型,
	 */
	public String getFundsubtype() {
		return this.fundsubtype;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundsubtype(String value)
	 {
		this.fundsubtype = value;
	}
	
	/**
	 * 基金类型(<>),
	 */
	public String getFundsubtypeneq() {
		return this.fundsubtypeneq;
	}
	
	/**
	 * 基金类型(<>),
	 */
	public void setFundsubtypeneq(String value)
	 {
		this.fundsubtypeneq = value;
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
	 * 基金类型(<>),
	 */
	public String getFundtypenoteq() {
		return this.fundtypenoteq;
	}
	
	/**
	 * 基金类型(<>),
	 */
	public void setFundtypenoteq(String value)
	 {
		this.fundtypenoteq = value;
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
	 * 行号,
	 */
	public String getLinenumber() {
		return this.linenumber;
	}
	
	/**
	 * 行号,
	 */
	public void setLinenumber(String value)
	 {
		this.linenumber = value;
	}
	
	/**
	 * 基金管理人代码(=),
	 */
	public String getManagercode() {
		return this.managercode;
	}
	
	/**
	 * 基金管理人代码(=),
	 */
	public void setManagercode(String value)
	 {
		this.managercode = value;
	}
	
	/**
	 * 在途标志(=),
	 */
	public String getOnlineflag() {
		return this.onlineflag;
	}
	
	/**
	 * 在途标志(=),
	 */
	public void setOnlineflag(String value)
	 {
		this.onlineflag = value;
	}
	
	/**
	 * 操作员代码,
	 */
	public String getOperatorno() {
		return this.operatorno;
	}
	
	/**
	 * 操作员代码,
	 */
	public void setOperatorno(String value)
	 {
		this.operatorno = value;
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
	 * 是否申购定投申请,
	 */
	public String getQuerydeclarevaluavgr() {
		return this.querydeclarevaluavgr;
	}
	
	/**
	 * 是否申购定投申请,
	 */
	public void setQuerydeclarevaluavgr(String value)
	 {
		this.querydeclarevaluavgr = value;
	}
	
	/**
	 * 是否赎回转换申请,
	 */
	public String getQueryredeemtranflag() {
		return this.queryredeemtranflag;
	}
	
	/**
	 * 是否赎回转换申请,
	 */
	public void setQueryredeemtranflag(String value)
	 {
		this.queryredeemtranflag = value;
	}
	
	/**
	 * TA发送标志(=),
	 */
	public String getSendstate() {
		return this.sendstate;
	}
	
	/**
	 * TA发送标志(=),
	 */
	public void setSendstate(String value)
	 {
		this.sendstate = value;
	}
	
	/**
	 * 起始日期,
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
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
	 * 子账户编号=,
	 */
	public String getSubacconoeq() {
		return this.subacconoeq;
	}
	
	/**
	 * 子账户编号=,
	 */
	public void setSubacconoeq(String value)
	 {
		this.subacconoeq = value;
	}
	
	/**
	 * 子账户编号<>,
	 */
	public String getSubaccononeq() {
		return this.subaccononeq;
	}
	
	/**
	 * 子账户编号<>,
	 */
	public void setSubaccononeq(String value)
	 {
		this.subaccononeq = value;
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
	 * 目标基金子类型(=),
	 */
	public String getTargetfundsubtype() {
		return this.targetfundsubtype;
	}
	
	/**
	 * 目标基金子类型(=),
	 */
	public void setTargetfundsubtype(String value)
	 {
		this.targetfundsubtype = value;
	}
	
	/**
	 * 目标基金子类型(<>),
	 */
	public String getTargetfundsubtypeneq() {
		return this.targetfundsubtypeneq;
	}
	
	/**
	 * 目标基金子类型(<>),
	 */
	public void setTargetfundsubtypeneq(String value)
	 {
		this.targetfundsubtypeneq = value;
	}
	
	/**
	 * 目标基金子类型,
	 */
	public String getTargetfundtype() {
		return this.targetfundtype;
	}
	
	/**
	 * 目标基金子类型,
	 */
	public void setTargetfundtype(String value)
	 {
		this.targetfundtype = value;
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
	 * 交易方式,
	 */
	public String getTrademethod() {
		return this.trademethod;
	}
	
	/**
	 * 交易方式,
	 */
	public void setTrademethod(String value)
	 {
		this.trademethod = value;
	}
	
	/**
	 * 预约交易是否生效,
	 */
	public String getTradestate() {
		return this.tradestate;
	}
	
	/**
	 * 预约交易是否生效,
	 */
	public void setTradestate(String value)
	 {
		this.tradestate = value;
	}
	
	/**
	 * 定期定额协议业务标志,
	 */
	public String getValufixflag() {
		return this.valufixflag;
	}
	
	/**
	 * 定期定额协议业务标志,
	 */
	public void setValufixflag(String value)
	 {
		this.valufixflag = value;
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
	 * 预约日期(<),
	 */
	public String getYuyuedate() {
		return this.yuyuedate;
	}
	
	/**
	 * 预约日期(<),
	 */
	public void setYuyuedate(String value)
	 {
		this.yuyuedate = value;
	}
	
	/**
	 * 预约日期(>),
	 */
	public String getYuyuedatebig() {
		return this.yuyuedatebig;
	}
	
	/**
	 * 预约日期(>),
	 */
	public void setYuyuedatebig(String value)
	 {
		this.yuyuedatebig = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("autorequest", this.autorequest.toString());
		inputMap.put("begindate", this.begindate);
		inputMap.put("branchno", this.branchno);
		inputMap.put("busintype", this.busintype);
		inputMap.put("callingcode", this.callingcode);
		inputMap.put("callingcodenoteq", this.callingcodenoteq);
		inputMap.put("capitalmode", this.capitalmode.toString());
		inputMap.put("capitalmode2", this.capitalmode2.toString());
		inputMap.put("chedan_confirmflag", this.chedan_confirmflag.toString());
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("combinvestflag", this.combinvestflag.toString());
		inputMap.put("combrequestno", this.combrequestno);
		inputMap.put("commerrorno", this.commerrorno.toString());
		inputMap.put("confirmflag", this.confirmflag.toString());
		inputMap.put("confirmflagnoteq", this.confirmflagnoteq.toString());
		inputMap.put("custconfirm", this.custconfirm.toString());
		inputMap.put("custtype", this.custtype.toString());
		inputMap.put("enddate", this.enddate);
		inputMap.put("etbjjsq", this.etbjjsq.toString());
		inputMap.put("etbsq", this.etbsq.toString());
		inputMap.put("exptype", this.exptype.toString());
		inputMap.put("financingstate", this.financingstate.toString());
		inputMap.put("fixflag", this.fixflag);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("fundsubtype", this.fundsubtype.toString());
		inputMap.put("fundsubtypeneq", this.fundsubtypeneq.toString());
		inputMap.put("fundtype", this.fundtype.toString());
		inputMap.put("fundtypenoteq", this.fundtypenoteq.toString());
		inputMap.put("investorsystemid", this.investorsystemid);
		inputMap.put("kkstat", this.kkstat.toString());
		inputMap.put("linenumber", this.linenumber);
		inputMap.put("managercode", this.managercode);
		inputMap.put("onlineflag", this.onlineflag.toString());
		inputMap.put("operatorno", this.operatorno);
		inputMap.put("originalapplyserial", this.originalapplyserial);
		inputMap.put("querydeclarevaluavgr", this.querydeclarevaluavgr.toString());
		inputMap.put("queryredeemtranflag", this.queryredeemtranflag.toString());
		inputMap.put("sendstate", this.sendstate.toString());
		inputMap.put("startdate", this.startdate);
		inputMap.put("subaccoauditno", this.subaccoauditno);
		inputMap.put("subacconoeq", this.subacconoeq);
		inputMap.put("subaccononeq", this.subaccononeq);
		inputMap.put("targetfundcode", this.targetfundcode);
		inputMap.put("targetfundsubtype", this.targetfundsubtype.toString());
		inputMap.put("targetfundsubtypeneq", this.targetfundsubtypeneq.toString());
		inputMap.put("targetfundtype", this.targetfundtype.toString());
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("trademethod", this.trademethod.toString());
		inputMap.put("tradestate", this.tradestate.toString());
		inputMap.put("valufixflag", this.valufixflag.toString());
		inputMap.put("voucherno", this.voucherno);
		inputMap.put("xyh", this.xyh);
		inputMap.put("yuyuedate", this.yuyuedate);
		inputMap.put("yuyuedatebig", this.yuyuedatebig);
	}
}
