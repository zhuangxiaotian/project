package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可还款信用卡查询(B023)
 */
public class B023Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 默认标志,
	 */
	private String defaultflag = "1是，0否";
	
	/**
	 * 银行帐号,
	 */
	private String paymentbankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String paymentbankname = "";
	
	/**
	 * 银行卡类型,
	 */
	private String paymentcardtype = "1-借记卡 2-信用卡";
	
	/**
	 * 银行帐号名,
	 */
	private String paymentnameinbank = "";
	
	/**
	 * 银行卡状态,
	 */
	private String state = "H:历史、A:正常";
	
	/**
	 * 备注信息,
	 */
	private String explain = "";
	
	/**
	 * 手机号码,
	 */
	private String handset = "";
	
	/**
	 * 还款卡编号,
	 */
	private String paymentaccono = "";
	
	/**
	 * 交易账号绑定银行账号,
	 */
	private String orignalbankacco = "";
	
	/**
	 * 交易账号绑定银行名称,
	 */
	private String orignalbankname = "";
	
	/**
	 * 交易账号绑定银行编号,
	 */
	private String orignalbankserial = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
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
	 * 默认标志,
	 */
	public String getDefaultflag() {
		return this.defaultflag;
	}
	
	/**
	 * 默认标志,
	 */
	public void setDefaultflag(String value)
	 {
		this.defaultflag = value;
	}
	
	/**
	 * 银行帐号,
	 */
	public String getPaymentbankacco() {
		return this.paymentbankacco;
	}
	
	/**
	 * 银行帐号,
	 */
	public void setPaymentbankacco(String value)
	 {
		this.paymentbankacco = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getPaymentbankname() {
		return this.paymentbankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setPaymentbankname(String value)
	 {
		this.paymentbankname = value;
	}
	
	/**
	 * 银行卡类型,
	 */
	public String getPaymentcardtype() {
		return this.paymentcardtype;
	}
	
	/**
	 * 银行卡类型,
	 */
	public void setPaymentcardtype(String value)
	 {
		this.paymentcardtype = value;
	}
	
	/**
	 * 银行帐号名,
	 */
	public String getPaymentnameinbank() {
		return this.paymentnameinbank;
	}
	
	/**
	 * 银行帐号名,
	 */
	public void setPaymentnameinbank(String value)
	 {
		this.paymentnameinbank = value;
	}
	
	/**
	 * 银行卡状态,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 银行卡状态,
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 备注信息,
	 */
	public String getExplain() {
		return this.explain;
	}
	
	/**
	 * 备注信息,
	 */
	public void setExplain(String value)
	 {
		this.explain = value;
	}
	
	/**
	 * 手机号码,
	 */
	public String getHandset() {
		return this.handset;
	}
	
	/**
	 * 手机号码,
	 */
	public void setHandset(String value)
	 {
		this.handset = value;
	}
	
	/**
	 * 还款卡编号,
	 */
	public String getPaymentaccono() {
		return this.paymentaccono;
	}
	
	/**
	 * 还款卡编号,
	 */
	public void setPaymentaccono(String value)
	 {
		this.paymentaccono = value;
	}
	
	/**
	 * 交易账号绑定银行账号,
	 */
	public String getOrignalbankacco() {
		return this.orignalbankacco;
	}
	
	/**
	 * 交易账号绑定银行账号,
	 */
	public void setOrignalbankacco(String value)
	 {
		this.orignalbankacco = value;
	}
	
	/**
	 * 交易账号绑定银行名称,
	 */
	public String getOrignalbankname() {
		return this.orignalbankname;
	}
	
	/**
	 * 交易账号绑定银行名称,
	 */
	public void setOrignalbankname(String value)
	 {
		this.orignalbankname = value;
	}
	
	/**
	 * 交易账号绑定银行编号,
	 */
	public String getOrignalbankserial() {
		return this.orignalbankserial;
	}
	
	/**
	 * 交易账号绑定银行编号,
	 */
	public void setOrignalbankserial(String value)
	 {
		this.orignalbankserial = value;
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
}
