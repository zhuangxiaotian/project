package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金卖出或转换(T006)
 */
public class T006Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请额度,组合理财一键赎回可不传
	 */
	private String applysum = "";
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 取现用途,取现用途 1.取现 3.信用卡还款 a.申购保险 A.还贷款
	 */
	private String redeemuseflag = "";
	
	/**
	 * 卖出方式,0:赎回到银行卡;1:转到现金宝;2:转到其他基金;3:T+0赎回;4:超级现金宝赎回;5:赎回到超级现金宝;6:自定义赎回
	 */
	private String saleway = "";
	
	/**
	 * 顺延标志,如果改值传1，基金交易日期延至T+1
	 */
	private String customdelayflag = "";
	
	/**
	 * 汇付资金到账方式,2--赎回到汇付的专属账户，其他--赎回到银行卡,只有资金方式是6的时候才需要对该字段做区分
	 */
	private String autocash = "";
	
	/**
	 * 组合编号,组合理财一键赎回必传
	 */
	private String combcode = "";
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,调用S001查询到的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	private String mintredeem = "";
	
	/**
	 * 是否是货币基金赎回转购标识,1--货币基金赎回转购 主要用于数米跨TA转换使用
	 */
	private String redeemtodeclareflag = "";
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	private String sharetype = "";
	
	/**
	 * 目标基金代码,调用T005返回的fundcode
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标收费方式,调用T005查询到的sharetype
	 */
	private String targetsharetype = "";
	
	/**
	 * 回款交易账号,saleway=0或3时，必传。该字段主要用于T+0赎回到用户指定的已绑定银行卡
	 */
	private String targettradeacco = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	private String precheckflag = "";
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	private String transfermoney = "";
	
	/**
	 * 理财平台流水号,
	 */
	private String chinapayserialno = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 业务大类,现金宝取现：01；超级现金宝取现：02
	 */
	private String busintype = "";
	
	/**
	 * 资金方式,只有当saleway=4（超级现金宝）的时候才有效
	 */
	private String capitalmode = "";
	
	/**
	 * 外部订单号,第三方平台预约交易时传
	 */
	private String outsideorderno = "";
	
	/**
	 * 是否快速赎回,当超级现金宝赎回时必传，0：普通赎回；1快速赎回
	 */
	private String realtimeflag = "";
	
	/**
	 * 超级现金宝交易账号,如果是超级现金宝赎回，则必须传
	 */
	private String supermoneytradeacco = "";
	
	/**
	 * 申请日期,可指定申请下单的实际日期
	 */
	private String acceptdate = "";
	
	/**
	 * 申请时间,可指定申请下单的实际时间
	 */
	private String requesttime = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 业务代码,saleway=6时必填
	 */
	private String businflag = "";
	
	/**
	 * 业务辅助代码,转换转购等业务有默认的业务辅助码，但当传入业务辅助码时，以传入的为准。要置空请传[ISNULL]，(saleway=6时必填)
	 */
	private String fixbusinflag = "";
	
	/**
	 * 专户预约码,货币基金实时赎回转申购、货币基金实时转认购
	 */
	private String preordercode = "";
	
	/**
	 * 目标银行卡号,当做普通赎回或T+0赎回的时候传入的目标银行编号和目标银行卡号
	 */
	private String targetbankacco = "";
	
	/**
	 * 目标银行编号,当做普通赎回或T+0赎回的时候传入的目标银行编号和目标银行卡号
	 */
	private String targetbankserial = "";
	
	/**
	 * 初始化参数
	 */
	public T006Input() {
		this.setFunction("T006");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请额度,组合理财一键赎回可不传
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请额度,组合理财一键赎回可不传
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 取现用途,取现用途 1.取现 3.信用卡还款 a.申购保险 A.还贷款
	 */
	public String getRedeemuseflag() {
		return this.redeemuseflag;
	}
	
	/**
	 * 取现用途,取现用途 1.取现 3.信用卡还款 a.申购保险 A.还贷款
	 */
	public void setRedeemuseflag(String value)
	 {
		this.redeemuseflag = value;
	}
	
	/**
	 * 卖出方式,0:赎回到银行卡;1:转到现金宝;2:转到其他基金;3:T+0赎回;4:超级现金宝赎回;5:赎回到超级现金宝;6:自定义赎回
	 */
	public String getSaleway() {
		return this.saleway;
	}
	
	/**
	 * 卖出方式,0:赎回到银行卡;1:转到现金宝;2:转到其他基金;3:T+0赎回;4:超级现金宝赎回;5:赎回到超级现金宝;6:自定义赎回
	 */
	public void setSaleway(String value)
	 {
		this.saleway = value;
	}
	
	/**
	 * 顺延标志,如果改值传1，基金交易日期延至T+1
	 */
	public String getCustomdelayflag() {
		return this.customdelayflag;
	}
	
	/**
	 * 顺延标志,如果改值传1，基金交易日期延至T+1
	 */
	public void setCustomdelayflag(String value)
	 {
		this.customdelayflag = value;
	}
	
	/**
	 * 汇付资金到账方式,2--赎回到汇付的专属账户，其他--赎回到银行卡,只有资金方式是6的时候才需要对该字段做区分
	 */
	public String getAutocash() {
		return this.autocash;
	}
	
	/**
	 * 汇付资金到账方式,2--赎回到汇付的专属账户，其他--赎回到银行卡,只有资金方式是6的时候才需要对该字段做区分
	 */
	public void setAutocash(String value)
	 {
		this.autocash = value;
	}
	
	/**
	 * 组合编号,组合理财一键赎回必传
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,组合理财一键赎回必传
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 基金代码,调用S001查询到的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,调用S001查询到的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	public String getMintredeem() {
		return this.mintredeem;
	}
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	public void setMintredeem(String value)
	 {
		this.mintredeem = value;
	}
	
	/**
	 * 是否是货币基金赎回转购标识,1--货币基金赎回转购 主要用于数米跨TA转换使用
	 */
	public String getRedeemtodeclareflag() {
		return this.redeemtodeclareflag;
	}
	
	/**
	 * 是否是货币基金赎回转购标识,1--货币基金赎回转购 主要用于数米跨TA转换使用
	 */
	public void setRedeemtodeclareflag(String value)
	 {
		this.redeemtodeclareflag = value;
	}
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 目标基金代码,调用T005返回的fundcode
	 */
	public String getTargetfundcode() {
		return this.targetfundcode;
	}
	
	/**
	 * 目标基金代码,调用T005返回的fundcode
	 */
	public void setTargetfundcode(String value)
	 {
		this.targetfundcode = value;
	}
	
	/**
	 * 目标收费方式,调用T005查询到的sharetype
	 */
	public String getTargetsharetype() {
		return this.targetsharetype;
	}
	
	/**
	 * 目标收费方式,调用T005查询到的sharetype
	 */
	public void setTargetsharetype(String value)
	 {
		this.targetsharetype = value;
	}
	
	/**
	 * 回款交易账号,saleway=0或3时，必传。该字段主要用于T+0赎回到用户指定的已绑定银行卡
	 */
	public String getTargettradeacco() {
		return this.targettradeacco;
	}
	
	/**
	 * 回款交易账号,saleway=0或3时，必传。该字段主要用于T+0赎回到用户指定的已绑定银行卡
	 */
	public void setTargettradeacco(String value)
	 {
		this.targettradeacco = value;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getTradesource() {
		return this.tradesource;
	}
	
	/**
	 * 交易来源,
	 */
	public void setTradesource(String value)
	 {
		this.tradesource = value;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public String getPrecheckflag() {
		return this.precheckflag;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public void setPrecheckflag(String value)
	 {
		this.precheckflag = value;
	}
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	public String getTransfermoney() {
		return this.transfermoney;
	}
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	public void setTransfermoney(String value)
	 {
		this.transfermoney = value;
	}
	
	/**
	 * 理财平台流水号,
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 理财平台流水号,
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
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
	 * 业务大类,现金宝取现：01；超级现金宝取现：02
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝取现：01；超级现金宝取现：02
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 资金方式,只有当saleway=4（超级现金宝）的时候才有效
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,只有当saleway=4（超级现金宝）的时候才有效
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 外部订单号,第三方平台预约交易时传
	 */
	public String getOutsideorderno() {
		return this.outsideorderno;
	}
	
	/**
	 * 外部订单号,第三方平台预约交易时传
	 */
	public void setOutsideorderno(String value)
	 {
		this.outsideorderno = value;
	}
	
	/**
	 * 是否快速赎回,当超级现金宝赎回时必传，0：普通赎回；1快速赎回
	 */
	public String getRealtimeflag() {
		return this.realtimeflag;
	}
	
	/**
	 * 是否快速赎回,当超级现金宝赎回时必传，0：普通赎回；1快速赎回
	 */
	public void setRealtimeflag(String value)
	 {
		this.realtimeflag = value;
	}
	
	/**
	 * 超级现金宝交易账号,如果是超级现金宝赎回，则必须传
	 */
	public String getSupermoneytradeacco() {
		return this.supermoneytradeacco;
	}
	
	/**
	 * 超级现金宝交易账号,如果是超级现金宝赎回，则必须传
	 */
	public void setSupermoneytradeacco(String value)
	 {
		this.supermoneytradeacco = value;
	}
	
	/**
	 * 申请日期,可指定申请下单的实际日期
	 */
	public String getAcceptdate() {
		return this.acceptdate;
	}
	
	/**
	 * 申请日期,可指定申请下单的实际日期
	 */
	public void setAcceptdate(String value)
	 {
		this.acceptdate = value;
	}
	
	/**
	 * 申请时间,可指定申请下单的实际时间
	 */
	public String getRequesttime() {
		return this.requesttime;
	}
	
	/**
	 * 申请时间,可指定申请下单的实际时间
	 */
	public void setRequesttime(String value)
	 {
		this.requesttime = value;
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
	 * 业务代码,saleway=6时必填
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,saleway=6时必填
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 业务辅助代码,转换转购等业务有默认的业务辅助码，但当传入业务辅助码时，以传入的为准。要置空请传[ISNULL]，(saleway=6时必填)
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,转换转购等业务有默认的业务辅助码，但当传入业务辅助码时，以传入的为准。要置空请传[ISNULL]，(saleway=6时必填)
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
	}
	
	/**
	 * 专户预约码,货币基金实时赎回转申购、货币基金实时转认购
	 */
	public String getPreordercode() {
		return this.preordercode;
	}
	
	/**
	 * 专户预约码,货币基金实时赎回转申购、货币基金实时转认购
	 */
	public void setPreordercode(String value)
	 {
		this.preordercode = value;
	}
	
	/**
	 * 目标银行卡号,当做普通赎回或T+0赎回的时候传入的目标银行编号和目标银行卡号
	 */
	public String getTargetbankacco() {
		return this.targetbankacco;
	}
	
	/**
	 * 目标银行卡号,当做普通赎回或T+0赎回的时候传入的目标银行编号和目标银行卡号
	 */
	public void setTargetbankacco(String value)
	 {
		this.targetbankacco = value;
	}
	
	/**
	 * 目标银行编号,当做普通赎回或T+0赎回的时候传入的目标银行编号和目标银行卡号
	 */
	public String getTargetbankserial() {
		return this.targetbankserial;
	}
	
	/**
	 * 目标银行编号,当做普通赎回或T+0赎回的时候传入的目标银行编号和目标银行卡号
	 */
	public void setTargetbankserial(String value)
	 {
		this.targetbankserial = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applysum", this.applysum);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("redeemuseflag", this.redeemuseflag);
		inputMap.put("saleway", this.saleway);
		inputMap.put("customdelayflag", this.customdelayflag);
		inputMap.put("autocash", this.autocash);
		inputMap.put("combcode", this.combcode);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("mintredeem", this.mintredeem);
		inputMap.put("redeemtodeclareflag", this.redeemtodeclareflag);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("targetfundcode", this.targetfundcode);
		inputMap.put("targetsharetype", this.targetsharetype);
		inputMap.put("targettradeacco", this.targettradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("precheckflag", this.precheckflag);
		inputMap.put("transfermoney", this.transfermoney);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("tradecontact", this.tradecontact);
		inputMap.put("busintype", this.busintype);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("outsideorderno", this.outsideorderno);
		inputMap.put("realtimeflag", this.realtimeflag);
		inputMap.put("supermoneytradeacco", this.supermoneytradeacco);
		inputMap.put("acceptdate", this.acceptdate);
		inputMap.put("requesttime", this.requesttime);
		inputMap.put("broker", this.broker);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fixbusinflag", this.fixbusinflag);
		inputMap.put("preordercode", this.preordercode);
		inputMap.put("targetbankacco", this.targetbankacco);
		inputMap.put("targetbankserial", this.targetbankserial);
	}
}
