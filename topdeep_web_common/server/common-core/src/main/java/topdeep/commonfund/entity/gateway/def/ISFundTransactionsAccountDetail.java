package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询交易账号列表功能输出明细参数
 */
public class ISFundTransactionsAccountDetail extends Object implements Serializable {
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 交易账号名称,
	 */
	private String transactionsName;
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
	/**
	 * 资金方式,
	 */
	private String capitalMode;
	
	/**
	 * 代扣接口类型,
	 */
	private String withholdType;
	
	/**
	 * 标志,0普通账号 1 主交易账号
	 */
	private String accountFlag;
	
	/**
	 * 客户编号,
	 */
	private String custno;
	
	/**
	 * 客户类型,0：机构；1：个人
	 */
	private String custtype;
	
	/**
	 * 客户姓名,
	 */
	private String customname;
	
	/**
	 * 主交易账号标识,1：主交易账号；0：非主交易账号
	 */
	private String mainflag;
	
	/**
	 * 开通网上交易标识,1：开通网上交易；0：未开通网上交易
	 */
	private String internet;
	
	/**
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	private String detailcapitalmode;
	
	/**
	 * 交易账号状态,
	 */
	private String state;
	
	/**
	 * 日限额余额,
	 */
	private String dailyremain;
	
	/**
	 * 月限额余额,
	 */
	private String monthlyremain;
	
	/**
	 * 汇款编号,
	 */
	private String remittanceno;
	
	/**
	 * 是否开通收付款1已开通0未开通,
	 */
	private String isOpenPay;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 交易账号,
	 */
	public String getTransactionsAccount() {
		return this.transactionsAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTransactionsAccount(String value)
	 {
		this.transactionsAccount = value;
	}
	
	/**
	 * 交易账号名称,
	 */
	public String getTransactionsName() {
		return this.transactionsName;
	}
	
	/**
	 * 交易账号名称,
	 */
	public void setTransactionsName(String value)
	 {
		this.transactionsName = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankAccount(String value)
	 {
		this.bankAccount = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankName() {
		return this.bankName;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankName(String value)
	 {
		this.bankName = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalMode() {
		return this.capitalMode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalMode(String value)
	 {
		this.capitalMode = value;
	}
	
	/**
	 * 代扣接口类型,
	 */
	public String getWithholdType() {
		return this.withholdType;
	}
	
	/**
	 * 代扣接口类型,
	 */
	public void setWithholdType(String value)
	 {
		this.withholdType = value;
	}
	
	/**
	 * 标志,0普通账号 1 主交易账号
	 */
	public String getAccountFlag() {
		return this.accountFlag;
	}
	
	/**
	 * 标志,0普通账号 1 主交易账号
	 */
	public void setAccountFlag(String value)
	 {
		this.accountFlag = value;
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
	 * 交易账号状态,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 交易账号状态,
	 */
	public void setState(String value)
	 {
		this.state = value;
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
	 * 是否开通收付款1已开通0未开通,
	 */
	public String getIsOpenPay() {
		return this.isOpenPay;
	}
	
	/**
	 * 是否开通收付款1已开通0未开通,
	 */
	public void setIsOpenPay(String value)
	 {
		this.isOpenPay = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
	}
}
