package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 还款流水查询(S044)功能输出明细参数
 */
public class S044OutputDetail extends Object implements Serializable {
	
	/**
	 * 下单日期时间,
	 */
	private String acceptdate = "";
	
	/**
	 * 还款金额,
	 */
	private String balance = "";
	
	/**
	 * 还款银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 还款银行卡全称,
	 */
	private String bankfullname = "";
	
	/**
	 * 还款银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 网银错误信息,
	 */
	private String errormsg = "";
	
	/**
	 * 网银错误码,
	 */
	private String errorno = "";
	
	/**
	 * 还款银行卡户名,
	 */
	private String nameinbank = "";
	
	/**
	 * 对方流水号,
	 */
	private String otherserialno = "";
	
	/**
	 * 待还款银行卡编号,
	 */
	private String paymentaccono = "";
	
	/**
	 * 待还款银行卡号,
	 */
	private String paymentbankacco = "";
	
	/**
	 * 待还款银行卡全称,
	 */
	private String paymentbankfullname = "";
	
	/**
	 * 待还款银行编号,
	 */
	private String paymentbankserial = "";
	
	/**
	 * 待还款银行卡类型,1-借记卡 2-信用卡
	 */
	private String paymentcardtype = "";
	
	/**
	 * 待还款日期,
	 */
	private String paymentdate = "";
	
	/**
	 * 待还款银行卡证件号码,
	 */
	private String paymentidentityno = "";
	
	/**
	 * 待还款银行卡证件类型,
	 */
	private String paymentidentitytype = "";
	
	/**
	 * 待还款银行卡户名,
	 */
	private String paymentnameinbank = "";
	
	/**
	 * 还款状态,
	 */
	private String paymentstate = "";
	
	/**
	 * 还款方式,
	 */
	private String paymenttype = "";
	
	/**
	 * 申请日期,
	 */
	private String requestdate = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 发送日期,
	 */
	private String senddate = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 还款用途,
	 */
	private String useflag = "";
	
	/**
	 * 来源银行卡号,只有使用2W号查询时该字段才有值
	 */
	private String cbankacco = "";
	
	/**
	 * 来源银行名称,只有使用2W号查询时该字段才有值
	 */
	private String cbankname = "";
	
	/**
	 * 来源银行编号,只有使用2W号查询时该字段才有值
	 */
	private String cbankno = "";
	
	/**
	 * 来源银行证件号码,只有使用2W号查询时该字段才有值
	 */
	private String cidentitynoinbank = "";
	
	/**
	 * 来源银行证件类型,只有使用2W号查询时该字段才有值
	 */
	private String cidentitytypeinbank = "";
	
	/**
	 * 来源银行户名,只有使用2W号查询时该字段才有值
	 */
	private String cnameinbank = "";
	
	/**
	 * 下单日期时间,
	 */
	public String getAcceptdate() {
		return this.acceptdate;
	}
	
	/**
	 * 下单日期时间,
	 */
	public void setAcceptdate(String value)
	 {
		this.acceptdate = value;
	}
	
	/**
	 * 还款金额,
	 */
	public String getBalance() {
		return this.balance;
	}
	
	/**
	 * 还款金额,
	 */
	public void setBalance(String value)
	 {
		this.balance = value;
	}
	
	/**
	 * 还款银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 还款银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 还款银行卡全称,
	 */
	public String getBankfullname() {
		return this.bankfullname;
	}
	
	/**
	 * 还款银行卡全称,
	 */
	public void setBankfullname(String value)
	 {
		this.bankfullname = value;
	}
	
	/**
	 * 还款银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 还款银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
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
	 * 网银错误信息,
	 */
	public String getErrormsg() {
		return this.errormsg;
	}
	
	/**
	 * 网银错误信息,
	 */
	public void setErrormsg(String value)
	 {
		this.errormsg = value;
	}
	
	/**
	 * 网银错误码,
	 */
	public String getErrorno() {
		return this.errorno;
	}
	
	/**
	 * 网银错误码,
	 */
	public void setErrorno(String value)
	 {
		this.errorno = value;
	}
	
	/**
	 * 还款银行卡户名,
	 */
	public String getNameinbank() {
		return this.nameinbank;
	}
	
	/**
	 * 还款银行卡户名,
	 */
	public void setNameinbank(String value)
	 {
		this.nameinbank = value;
	}
	
	/**
	 * 对方流水号,
	 */
	public String getOtherserialno() {
		return this.otherserialno;
	}
	
	/**
	 * 对方流水号,
	 */
	public void setOtherserialno(String value)
	 {
		this.otherserialno = value;
	}
	
	/**
	 * 待还款银行卡编号,
	 */
	public String getPaymentaccono() {
		return this.paymentaccono;
	}
	
	/**
	 * 待还款银行卡编号,
	 */
	public void setPaymentaccono(String value)
	 {
		this.paymentaccono = value;
	}
	
	/**
	 * 待还款银行卡号,
	 */
	public String getPaymentbankacco() {
		return this.paymentbankacco;
	}
	
	/**
	 * 待还款银行卡号,
	 */
	public void setPaymentbankacco(String value)
	 {
		this.paymentbankacco = value;
	}
	
	/**
	 * 待还款银行卡全称,
	 */
	public String getPaymentbankfullname() {
		return this.paymentbankfullname;
	}
	
	/**
	 * 待还款银行卡全称,
	 */
	public void setPaymentbankfullname(String value)
	 {
		this.paymentbankfullname = value;
	}
	
	/**
	 * 待还款银行编号,
	 */
	public String getPaymentbankserial() {
		return this.paymentbankserial;
	}
	
	/**
	 * 待还款银行编号,
	 */
	public void setPaymentbankserial(String value)
	 {
		this.paymentbankserial = value;
	}
	
	/**
	 * 待还款银行卡类型,1-借记卡 2-信用卡
	 */
	public String getPaymentcardtype() {
		return this.paymentcardtype;
	}
	
	/**
	 * 待还款银行卡类型,1-借记卡 2-信用卡
	 */
	public void setPaymentcardtype(String value)
	 {
		this.paymentcardtype = value;
	}
	
	/**
	 * 待还款日期,
	 */
	public String getPaymentdate() {
		return this.paymentdate;
	}
	
	/**
	 * 待还款日期,
	 */
	public void setPaymentdate(String value)
	 {
		this.paymentdate = value;
	}
	
	/**
	 * 待还款银行卡证件号码,
	 */
	public String getPaymentidentityno() {
		return this.paymentidentityno;
	}
	
	/**
	 * 待还款银行卡证件号码,
	 */
	public void setPaymentidentityno(String value)
	 {
		this.paymentidentityno = value;
	}
	
	/**
	 * 待还款银行卡证件类型,
	 */
	public String getPaymentidentitytype() {
		return this.paymentidentitytype;
	}
	
	/**
	 * 待还款银行卡证件类型,
	 */
	public void setPaymentidentitytype(String value)
	 {
		this.paymentidentitytype = value;
	}
	
	/**
	 * 待还款银行卡户名,
	 */
	public String getPaymentnameinbank() {
		return this.paymentnameinbank;
	}
	
	/**
	 * 待还款银行卡户名,
	 */
	public void setPaymentnameinbank(String value)
	 {
		this.paymentnameinbank = value;
	}
	
	/**
	 * 还款状态,
	 */
	public String getPaymentstate() {
		return this.paymentstate;
	}
	
	/**
	 * 还款状态,
	 */
	public void setPaymentstate(String value)
	 {
		this.paymentstate = value;
	}
	
	/**
	 * 还款方式,
	 */
	public String getPaymenttype() {
		return this.paymenttype;
	}
	
	/**
	 * 还款方式,
	 */
	public void setPaymenttype(String value)
	 {
		this.paymenttype = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	/**
	 * 发送日期,
	 */
	public String getSenddate() {
		return this.senddate;
	}
	
	/**
	 * 发送日期,
	 */
	public void setSenddate(String value)
	 {
		this.senddate = value;
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
	 * 还款用途,
	 */
	public String getUseflag() {
		return this.useflag;
	}
	
	/**
	 * 还款用途,
	 */
	public void setUseflag(String value)
	 {
		this.useflag = value;
	}
	
	/**
	 * 来源银行卡号,只有使用2W号查询时该字段才有值
	 */
	public String getCbankacco() {
		return this.cbankacco;
	}
	
	/**
	 * 来源银行卡号,只有使用2W号查询时该字段才有值
	 */
	public void setCbankacco(String value)
	 {
		this.cbankacco = value;
	}
	
	/**
	 * 来源银行名称,只有使用2W号查询时该字段才有值
	 */
	public String getCbankname() {
		return this.cbankname;
	}
	
	/**
	 * 来源银行名称,只有使用2W号查询时该字段才有值
	 */
	public void setCbankname(String value)
	 {
		this.cbankname = value;
	}
	
	/**
	 * 来源银行编号,只有使用2W号查询时该字段才有值
	 */
	public String getCbankno() {
		return this.cbankno;
	}
	
	/**
	 * 来源银行编号,只有使用2W号查询时该字段才有值
	 */
	public void setCbankno(String value)
	 {
		this.cbankno = value;
	}
	
	/**
	 * 来源银行证件号码,只有使用2W号查询时该字段才有值
	 */
	public String getCidentitynoinbank() {
		return this.cidentitynoinbank;
	}
	
	/**
	 * 来源银行证件号码,只有使用2W号查询时该字段才有值
	 */
	public void setCidentitynoinbank(String value)
	 {
		this.cidentitynoinbank = value;
	}
	
	/**
	 * 来源银行证件类型,只有使用2W号查询时该字段才有值
	 */
	public String getCidentitytypeinbank() {
		return this.cidentitytypeinbank;
	}
	
	/**
	 * 来源银行证件类型,只有使用2W号查询时该字段才有值
	 */
	public void setCidentitytypeinbank(String value)
	 {
		this.cidentitytypeinbank = value;
	}
	
	/**
	 * 来源银行户名,只有使用2W号查询时该字段才有值
	 */
	public String getCnameinbank() {
		return this.cnameinbank;
	}
	
	/**
	 * 来源银行户名,只有使用2W号查询时该字段才有值
	 */
	public void setCnameinbank(String value)
	 {
		this.cnameinbank = value;
	}
}
