package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询交易账号(C020)功能输出明细参数
 */
public class C020OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行户名,银行卡对应的账户姓名
	 */
	private String bankacconame = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,（参考字典：资金方式）
	 */
	private String capitalmode = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金账号状态,（参考字典：基金账号状态）
	 */
	private String fundaccostate = "";
	
	/**
	 * 证件号码,
	 */
	private String idno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String idtype = "";
	
	/**
	 * 是否主交易账号标识,true:主交易账号；false：非主交易账号
	 */
	private Boolean maintradeacco;
	
	/**
	 * 状态,（参考字典：交易账号状态）
	 */
	private String state = "";
	
	/**
	 * 基金账号TA代码,（参考字典：TA代码）
	 */
	private String tacode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易账号用途,仅独立核算交易账号值有
	 */
	private String accousage = "";
	
	/**
	 * 银行全称,
	 */
	private String bankfullname = "";
	
	/**
	 * 所属交易账号,仅独立核算交易账号值有
	 */
	private String sourcetradeacco = "";
	
	/**
	 * 用户类型,0表示组合理财交易账号
	 */
	private String usertype = "";
	
	/**
	 * 回款账户标志,
	 */
	private String backflag = "";
	
	/**
	 * 银行ID号,
	 */
	private String bankidno = "";
	
	/**
	 * 开户银行城市,
	 */
	private String cityno = "";
	
	/**
	 * 代扣接口类型,
	 */
	private String interfacetype = "";
	
	/**
	 * 否允许网上交易修改银行账户,
	 */
	private String netmodifybankacco = "";
	
	/**
	 * 开户日期,
	 */
	private String opendate = "";
	
	/**
	 * 预用户标识,
	 */
	private String preuserflag = "";
	
	/**
	 * 开户银行省份,
	 */
	private String provincecode = "";
	
	/**
	 * 汇款标识位,
	 */
	private String remitno = "";
	
	/**
	 * 交易来源,需要升级HS_QUERY_0E到HS_QUERY_0U
	 */
	private String comefrom = "";
	
	/**
	 * 明细资金方式,01表示已签约 03：快捷支付
	 */
	private String subcapitalmode = "";
	
	/**
	 * 协议号,
	 */
	private String yinliancdcard = "";
	
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
	 * 银行户名,银行卡对应的账户姓名
	 */
	public String getBankacconame() {
		return this.bankacconame;
	}
	
	/**
	 * 银行户名,银行卡对应的账户姓名
	 */
	public void setBankacconame(String value)
	 {
		this.bankacconame = value;
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
	 * 基金账号状态,（参考字典：基金账号状态）
	 */
	public String getFundaccostate() {
		return this.fundaccostate;
	}
	
	/**
	 * 基金账号状态,（参考字典：基金账号状态）
	 */
	public void setFundaccostate(String value)
	 {
		this.fundaccostate = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdno() {
		return this.idno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdno(String value)
	 {
		this.idno = value;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public String getIdtype() {
		return this.idtype;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public void setIdtype(String value)
	 {
		this.idtype = value;
	}
	
	/**
	 * 是否主交易账号标识,true:主交易账号；false：非主交易账号
	 */
	public Boolean getMaintradeacco() {
		return this.maintradeacco;
	}
	
	/**
	 * 是否主交易账号标识,true:主交易账号；false：非主交易账号
	 */
	public void setMaintradeacco(Boolean value)
	 {
		this.maintradeacco = value;
	}
	
	/**
	 * 状态,（参考字典：交易账号状态）
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 状态,（参考字典：交易账号状态）
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 基金账号TA代码,（参考字典：TA代码）
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * 基金账号TA代码,（参考字典：TA代码）
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
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
	 * 交易账号用途,仅独立核算交易账号值有
	 */
	public String getAccousage() {
		return this.accousage;
	}
	
	/**
	 * 交易账号用途,仅独立核算交易账号值有
	 */
	public void setAccousage(String value)
	 {
		this.accousage = value;
	}
	
	/**
	 * 银行全称,
	 */
	public String getBankfullname() {
		return this.bankfullname;
	}
	
	/**
	 * 银行全称,
	 */
	public void setBankfullname(String value)
	 {
		this.bankfullname = value;
	}
	
	/**
	 * 所属交易账号,仅独立核算交易账号值有
	 */
	public String getSourcetradeacco() {
		return this.sourcetradeacco;
	}
	
	/**
	 * 所属交易账号,仅独立核算交易账号值有
	 */
	public void setSourcetradeacco(String value)
	 {
		this.sourcetradeacco = value;
	}
	
	/**
	 * 用户类型,0表示组合理财交易账号
	 */
	public String getUsertype() {
		return this.usertype;
	}
	
	/**
	 * 用户类型,0表示组合理财交易账号
	 */
	public void setUsertype(String value)
	 {
		this.usertype = value;
	}
	
	/**
	 * 回款账户标志,
	 */
	public String getBackflag() {
		return this.backflag;
	}
	
	/**
	 * 回款账户标志,
	 */
	public void setBackflag(String value)
	 {
		this.backflag = value;
	}
	
	/**
	 * 银行ID号,
	 */
	public String getBankidno() {
		return this.bankidno;
	}
	
	/**
	 * 银行ID号,
	 */
	public void setBankidno(String value)
	 {
		this.bankidno = value;
	}
	
	/**
	 * 开户银行城市,
	 */
	public String getCityno() {
		return this.cityno;
	}
	
	/**
	 * 开户银行城市,
	 */
	public void setCityno(String value)
	 {
		this.cityno = value;
	}
	
	/**
	 * 代扣接口类型,
	 */
	public String getInterfacetype() {
		return this.interfacetype;
	}
	
	/**
	 * 代扣接口类型,
	 */
	public void setInterfacetype(String value)
	 {
		this.interfacetype = value;
	}
	
	/**
	 * 否允许网上交易修改银行账户,
	 */
	public String getNetmodifybankacco() {
		return this.netmodifybankacco;
	}
	
	/**
	 * 否允许网上交易修改银行账户,
	 */
	public void setNetmodifybankacco(String value)
	 {
		this.netmodifybankacco = value;
	}
	
	/**
	 * 开户日期,
	 */
	public String getOpendate() {
		return this.opendate;
	}
	
	/**
	 * 开户日期,
	 */
	public void setOpendate(String value)
	 {
		this.opendate = value;
	}
	
	/**
	 * 预用户标识,
	 */
	public String getPreuserflag() {
		return this.preuserflag;
	}
	
	/**
	 * 预用户标识,
	 */
	public void setPreuserflag(String value)
	 {
		this.preuserflag = value;
	}
	
	/**
	 * 开户银行省份,
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 开户银行省份,
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
	}
	
	/**
	 * 汇款标识位,
	 */
	public String getRemitno() {
		return this.remitno;
	}
	
	/**
	 * 汇款标识位,
	 */
	public void setRemitno(String value)
	 {
		this.remitno = value;
	}
	
	/**
	 * 交易来源,需要升级HS_QUERY_0E到HS_QUERY_0U
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,需要升级HS_QUERY_0E到HS_QUERY_0U
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 明细资金方式,01表示已签约 03：快捷支付
	 */
	public String getSubcapitalmode() {
		return this.subcapitalmode;
	}
	
	/**
	 * 明细资金方式,01表示已签约 03：快捷支付
	 */
	public void setSubcapitalmode(String value)
	 {
		this.subcapitalmode = value;
	}
	
	/**
	 * 协议号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 协议号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
}
