package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户银行卡信息查询(C062)
 */
public class C062Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行户名,
	 */
	private String bankacconame = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	private String capitalmode = "";
	
	/**
	 * 开户城市,
	 */
	private String cityno = "";
	
	/**
	 * 银行开户证件号,
	 */
	private String identityno = "";
	
	/**
	 * 开户省份,
	 */
	private String provincecode = "";
	
	/**
	 * 汇款协议号,
	 */
	private String remitno = "";
	
	/**
	 * CD卡号,
	 */
	private String yinliancdcard = "";
	
	/**
	 * 默认账户,
	 */
	private String backflag = "";
	
	/**
	 * 银行编码,
	 */
	private String bankserial = "";
	
	/**
	 * 联行号,
	 */
	private String branchbank = "";
	
	/**
	 * 来款账户,
	 */
	private String comeflag = "";
	
	/**
	 * 明细资金方式,取字典“明细资金方式”
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 汇兑标识,
	 */
	private String exchangemark = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 银行开户证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 网上开户是否可以修改银行卡,
	 */
	private String netmodifybankacco = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银行账号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行户名,
	 */
	public String getBankacconame() {
		return this.bankacconame;
	}
	
	/**
	 * 银行户名,
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
	 * 开户城市,
	 */
	public String getCityno() {
		return this.cityno;
	}
	
	/**
	 * 开户城市,
	 */
	public void setCityno(String value)
	 {
		this.cityno = value;
	}
	
	/**
	 * 银行开户证件号,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 银行开户证件号,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 开户省份,
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 开户省份,
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
	}
	
	/**
	 * 汇款协议号,
	 */
	public String getRemitno() {
		return this.remitno;
	}
	
	/**
	 * 汇款协议号,
	 */
	public void setRemitno(String value)
	 {
		this.remitno = value;
	}
	
	/**
	 * CD卡号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * CD卡号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
	
	/**
	 * 默认账户,
	 */
	public String getBackflag() {
		return this.backflag;
	}
	
	/**
	 * 默认账户,
	 */
	public void setBackflag(String value)
	 {
		this.backflag = value;
	}
	
	/**
	 * 银行编码,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编码,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 联行号,
	 */
	public String getBranchbank() {
		return this.branchbank;
	}
	
	/**
	 * 联行号,
	 */
	public void setBranchbank(String value)
	 {
		this.branchbank = value;
	}
	
	/**
	 * 来款账户,
	 */
	public String getComeflag() {
		return this.comeflag;
	}
	
	/**
	 * 来款账户,
	 */
	public void setComeflag(String value)
	 {
		this.comeflag = value;
	}
	
	/**
	 * 明细资金方式,取字典“明细资金方式”
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,取字典“明细资金方式”
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 汇兑标识,
	 */
	public String getExchangemark() {
		return this.exchangemark;
	}
	
	/**
	 * 汇兑标识,
	 */
	public void setExchangemark(String value)
	 {
		this.exchangemark = value;
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
	 * 银行开户证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 银行开户证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 网上开户是否可以修改银行卡,
	 */
	public String getNetmodifybankacco() {
		return this.netmodifybankacco;
	}
	
	/**
	 * 网上开户是否可以修改银行卡,
	 */
	public void setNetmodifybankacco(String value)
	 {
		this.netmodifybankacco = value;
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
}
