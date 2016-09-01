package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 用户资产查询(S097)功能输出明细参数
 */
public class S097OutputDetail extends Object implements Serializable {
	
	/**
	 * 销售类型,
	 */
	private String agenctype = "";
	
	/**
	 * 销售商编号,
	 */
	private String agencyno = "";
	
	/**
	 * 银行帐号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 当前份额,
	 */
	private String currentremainshare = "";
	
	/**
	 * 当日收益,
	 */
	private String dayincome = "";
	
	/**
	 * 日收益率,
	 */
	private String dayincomeratio = "";
	
	/**
	 * 冻结份额,
	 */
	private String freezeremainshare = "";
	
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
	 * 基金状态,
	 */
	private String fundstate = "";
	
	/**
	 * 基金类别,
	 */
	private String fundtype = "";
	
	/**
	 * 万份收益,
	 */
	private String hfincomeratio = "";
	
	/**
	 * 持仓收益,
	 */
	private String holdingshareincome = "";
	
	/**
	 * 七日年化收益,
	 */
	private String incomeratio = "";
	
	/**
	 * 基金市值,
	 */
	private String marketvalue = "";
	
	/**
	 * 分红方式,
	 */
	private String melonmethod = "";
	
	/**
	 * 净值日期,
	 */
	private String navdate = "";
	
	/**
	 * 单位净值,
	 */
	private String pernetvalue = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 交易冻结份额,
	 */
	private String tfreezeremainshare = "";
	
	/**
	 * 累计收益,
	 */
	private String totalincome = "";
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco = "";
	
	/**
	 * 未付收益,
	 */
	private String unpaidinome = "";
	
	/**
	 * 可用份额,
	 */
	private String usableremainshare = "";
	
	/**
	 * 销售类型,
	 */
	public String getAgenctype() {
		return this.agenctype;
	}
	
	/**
	 * 销售类型,
	 */
	public void setAgenctype(String value)
	 {
		this.agenctype = value;
	}
	
	/**
	 * 销售商编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
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
	 * 当前份额,
	 */
	public String getCurrentremainshare() {
		return this.currentremainshare;
	}
	
	/**
	 * 当前份额,
	 */
	public void setCurrentremainshare(String value)
	 {
		this.currentremainshare = value;
	}
	
	/**
	 * 当日收益,
	 */
	public String getDayincome() {
		return this.dayincome;
	}
	
	/**
	 * 当日收益,
	 */
	public void setDayincome(String value)
	 {
		this.dayincome = value;
	}
	
	/**
	 * 日收益率,
	 */
	public String getDayincomeratio() {
		return this.dayincomeratio;
	}
	
	/**
	 * 日收益率,
	 */
	public void setDayincomeratio(String value)
	 {
		this.dayincomeratio = value;
	}
	
	/**
	 * 冻结份额,
	 */
	public String getFreezeremainshare() {
		return this.freezeremainshare;
	}
	
	/**
	 * 冻结份额,
	 */
	public void setFreezeremainshare(String value)
	 {
		this.freezeremainshare = value;
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
	 * 基金状态,
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 基金类别,
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类别,
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 万份收益,
	 */
	public String getHfincomeratio() {
		return this.hfincomeratio;
	}
	
	/**
	 * 万份收益,
	 */
	public void setHfincomeratio(String value)
	 {
		this.hfincomeratio = value;
	}
	
	/**
	 * 持仓收益,
	 */
	public String getHoldingshareincome() {
		return this.holdingshareincome;
	}
	
	/**
	 * 持仓收益,
	 */
	public void setHoldingshareincome(String value)
	 {
		this.holdingshareincome = value;
	}
	
	/**
	 * 七日年化收益,
	 */
	public String getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 七日年化收益,
	 */
	public void setIncomeratio(String value)
	 {
		this.incomeratio = value;
	}
	
	/**
	 * 基金市值,
	 */
	public String getMarketvalue() {
		return this.marketvalue;
	}
	
	/**
	 * 基金市值,
	 */
	public void setMarketvalue(String value)
	 {
		this.marketvalue = value;
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
	 * 净值日期,
	 */
	public String getNavdate() {
		return this.navdate;
	}
	
	/**
	 * 净值日期,
	 */
	public void setNavdate(String value)
	 {
		this.navdate = value;
	}
	
	/**
	 * 单位净值,
	 */
	public String getPernetvalue() {
		return this.pernetvalue;
	}
	
	/**
	 * 单位净值,
	 */
	public void setPernetvalue(String value)
	 {
		this.pernetvalue = value;
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
	 * 交易冻结份额,
	 */
	public String getTfreezeremainshare() {
		return this.tfreezeremainshare;
	}
	
	/**
	 * 交易冻结份额,
	 */
	public void setTfreezeremainshare(String value)
	 {
		this.tfreezeremainshare = value;
	}
	
	/**
	 * 累计收益,
	 */
	public String getTotalincome() {
		return this.totalincome;
	}
	
	/**
	 * 累计收益,
	 */
	public void setTotalincome(String value)
	 {
		this.totalincome = value;
	}
	
	/**
	 * 交易帐号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 未付收益,
	 */
	public String getUnpaidinome() {
		return this.unpaidinome;
	}
	
	/**
	 * 未付收益,
	 */
	public void setUnpaidinome(String value)
	 {
		this.unpaidinome = value;
	}
	
	/**
	 * 可用份额,
	 */
	public String getUsableremainshare() {
		return this.usableremainshare;
	}
	
	/**
	 * 可用份额,
	 */
	public void setUsableremainshare(String value)
	 {
		this.usableremainshare = value;
	}
}
