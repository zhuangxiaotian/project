package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询交易帐号(后台模式)(C034)功能输出明细参数
 */
public class C034OutputTradeaccolist extends Object implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,参考数据字典（资金方式）
	 */
	private String capitalmode = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 客户姓名,
	 */
	private String customname = "";
	
	/**
	 * 客户类型,0：机构；1：个人
	 */
	private String custtype = "";
	
	/**
	 * 开通网上交易标识,1：开通网上交易；0：未开通网上交易
	 */
	private String internet = "";
	
	/**
	 * 主交易账号标识,1：主交易账号；0：非主交易账号
	 */
	private String mainflag = "";
	
	/**
	 * 银行卡户名,
	 */
	private String nameinbank = "";
	
	/**
	 * 未绑定银行卡标识,1：未绑定银行卡；0：已绑定
	 */
	private String needbindcard = "";
	
	/**
	 * 汇款编号,
	 */
	private String remittanceno = "";
	
	/**
	 * 交易账号状态,参考数据字典（交易账号状态）
	 */
	private String state = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银联CD卡号,
	 */
	private String yinliancdcard = "";
	
	/**
	 * 个性化银行名称,取字典“FUNDAPI银行名称”
	 */
	private String bankcustomname = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 证件号码,账户资料对应证件号码
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,账户资料对应证件类型
	 */
	private String identitytype = "";
	
	/**
	 * 日限额余额,
	 */
	private String dailyremain = "";
	
	/**
	 * 月限额余额,
	 */
	private String monthlyremain = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金账号状态,
	 */
	private String fundaccostate = "";
	
	/**
	 * 网上是否可以修改银行资料,
	 */
	private String netmodifybankacco = "";
	
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
	 * 资金方式,参考数据字典（资金方式）
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,参考数据字典（资金方式）
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 客户姓名,
	 */
	public String getCustomname() {
		return this.customname;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustomname(String value)
	 {
		this.customname = value;
	}
	
	/**
	 * 客户类型,0：机构；1：个人
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,0：机构；1：个人
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 开通网上交易标识,1：开通网上交易；0：未开通网上交易
	 */
	public String getInternet() {
		return this.internet;
	}
	
	/**
	 * 开通网上交易标识,1：开通网上交易；0：未开通网上交易
	 */
	public void setInternet(String value)
	 {
		this.internet = value;
	}
	
	/**
	 * 主交易账号标识,1：主交易账号；0：非主交易账号
	 */
	public String getMainflag() {
		return this.mainflag;
	}
	
	/**
	 * 主交易账号标识,1：主交易账号；0：非主交易账号
	 */
	public void setMainflag(String value)
	 {
		this.mainflag = value;
	}
	
	/**
	 * 银行卡户名,
	 */
	public String getNameinbank() {
		return this.nameinbank;
	}
	
	/**
	 * 银行卡户名,
	 */
	public void setNameinbank(String value)
	 {
		this.nameinbank = value;
	}
	
	/**
	 * 未绑定银行卡标识,1：未绑定银行卡；0：已绑定
	 */
	public String getNeedbindcard() {
		return this.needbindcard;
	}
	
	/**
	 * 未绑定银行卡标识,1：未绑定银行卡；0：已绑定
	 */
	public void setNeedbindcard(String value)
	 {
		this.needbindcard = value;
	}
	
	/**
	 * 汇款编号,
	 */
	public String getRemittanceno() {
		return this.remittanceno;
	}
	
	/**
	 * 汇款编号,
	 */
	public void setRemittanceno(String value)
	 {
		this.remittanceno = value;
	}
	
	/**
	 * 交易账号状态,参考数据字典（交易账号状态）
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 交易账号状态,参考数据字典（交易账号状态）
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
	 * 银联CD卡号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联CD卡号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
	
	/**
	 * 个性化银行名称,取字典“FUNDAPI银行名称”
	 */
	public String getBankcustomname() {
		return this.bankcustomname;
	}
	
	/**
	 * 个性化银行名称,取字典“FUNDAPI银行名称”
	 */
	public void setBankcustomname(String value)
	 {
		this.bankcustomname = value;
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
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 证件号码,账户资料对应证件号码
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,账户资料对应证件号码
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,账户资料对应证件类型
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,账户资料对应证件类型
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 日限额余额,
	 */
	public String getDailyremain() {
		return this.dailyremain;
	}
	
	/**
	 * 日限额余额,
	 */
	public void setDailyremain(String value)
	 {
		this.dailyremain = value;
	}
	
	/**
	 * 月限额余额,
	 */
	public String getMonthlyremain() {
		return this.monthlyremain;
	}
	
	/**
	 * 月限额余额,
	 */
	public void setMonthlyremain(String value)
	 {
		this.monthlyremain = value;
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
	 * 基金账号状态,
	 */
	public String getFundaccostate() {
		return this.fundaccostate;
	}
	
	/**
	 * 基金账号状态,
	 */
	public void setFundaccostate(String value)
	 {
		this.fundaccostate = value;
	}
	
	/**
	 * 网上是否可以修改银行资料,
	 */
	public String getNetmodifybankacco() {
		return this.netmodifybankacco;
	}
	
	/**
	 * 网上是否可以修改银行资料,
	 */
	public void setNetmodifybankacco(String value)
	 {
		this.netmodifybankacco = value;
	}
}
