package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡还款(T023)
 */
public class T023Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 还款卡编号,
	 */
	private String paymentaccono = "";
	
	/**
	 * 还款用途,1：取现；2：还房贷；3：还信用卡
	 */
	private String redeemuseflag = "";
	
	/**
	 * 还款业务代码,快速还款为098，普通还款024
	 */
	private String repaybusinflag = "";
	
	/**
	 * 交易账号,取字典“份额类别”
	 */
	private String tradeacco = "";
	
	/**
	 * 还款金额,
	 */
	private String amount = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 待还款日期,
	 */
	private String paycreditcarddate = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public T023Input() {
		this.setFunction("T023");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 还款用途,1：取现；2：还房贷；3：还信用卡
	 */
	public String getRedeemuseflag() {
		return this.redeemuseflag;
	}
	
	/**
	 * 还款用途,1：取现；2：还房贷；3：还信用卡
	 */
	public void setRedeemuseflag(String value)
	 {
		this.redeemuseflag = value;
	}
	
	/**
	 * 还款业务代码,快速还款为098，普通还款024
	 */
	public String getRepaybusinflag() {
		return this.repaybusinflag;
	}
	
	/**
	 * 还款业务代码,快速还款为098，普通还款024
	 */
	public void setRepaybusinflag(String value)
	 {
		this.repaybusinflag = value;
	}
	
	/**
	 * 交易账号,取字典“份额类别”
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,取字典“份额类别”
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 还款金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 还款金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
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
	 * 待还款日期,
	 */
	public String getPaycreditcarddate() {
		return this.paycreditcarddate;
	}
	
	/**
	 * 待还款日期,
	 */
	public void setPaycreditcarddate(String value)
	 {
		this.paycreditcarddate = value;
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
	 * 交易密码,
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("paymentaccono", this.paymentaccono);
		inputMap.put("redeemuseflag", this.redeemuseflag);
		inputMap.put("repaybusinflag", this.repaybusinflag);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("amount", this.amount);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("paycreditcarddate", this.paycreditcarddate);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("fundcode", this.fundcode);
	}
}
