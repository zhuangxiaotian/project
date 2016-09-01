package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 公共事业缴费(T024)
 */
public class T024Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 还款金额,
	 */
	private String amount = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 查询流水号,
	 */
	private String paymentapplyno = "";
	
	/**
	 * 缴费单位编号,
	 */
	private String paymentunit = "";
	
	/**
	 * 赎回份额,固定传0
	 */
	private String redeemsum = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,取字典“份额类别”
	 */
	private String tradeacco = "";
	
	/**
	 * 还款方式,0：T+0 ， 1：T+1
	 */
	private String paycreditcardtype = "";
	
	/**
	 * 待还款卡唯一标识,
	 */
	private String paymentaccono = "";
	
	/**
	 * 缴费账号,
	 */
	private String paymentorderno = "";
	
	/**
	 * 手机号码,
	 */
	private String paymentphone = "";
	
	/**
	 * 支付方式,
	 */
	private String paymentunittype = "";
	
	/**
	 * 还款标识,5：缴水费；6：缴电费；7：缴煤气费；8：手机充值
	 */
	private String redeemuseflag = "";
	
	/**
	 * 还款业务代码,取字典“份额类别”
	 */
	private String repaybusinflag = "";
	
	/**
	 * 初始化参数
	 */
	public T024Input() {
		this.setFunction("T024");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 查询流水号,
	 */
	public String getPaymentapplyno() {
		return this.paymentapplyno;
	}
	
	/**
	 * 查询流水号,
	 */
	public void setPaymentapplyno(String value)
	 {
		this.paymentapplyno = value;
	}
	
	/**
	 * 缴费单位编号,
	 */
	public String getPaymentunit() {
		return this.paymentunit;
	}
	
	/**
	 * 缴费单位编号,
	 */
	public void setPaymentunit(String value)
	 {
		this.paymentunit = value;
	}
	
	/**
	 * 赎回份额,固定传0
	 */
	public String getRedeemsum() {
		return this.redeemsum;
	}
	
	/**
	 * 赎回份额,固定传0
	 */
	public void setRedeemsum(String value)
	 {
		this.redeemsum = value;
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
	 * 还款方式,0：T+0 ， 1：T+1
	 */
	public String getPaycreditcardtype() {
		return this.paycreditcardtype;
	}
	
	/**
	 * 还款方式,0：T+0 ， 1：T+1
	 */
	public void setPaycreditcardtype(String value)
	 {
		this.paycreditcardtype = value;
	}
	
	/**
	 * 待还款卡唯一标识,
	 */
	public String getPaymentaccono() {
		return this.paymentaccono;
	}
	
	/**
	 * 待还款卡唯一标识,
	 */
	public void setPaymentaccono(String value)
	 {
		this.paymentaccono = value;
	}
	
	/**
	 * 缴费账号,
	 */
	public String getPaymentorderno() {
		return this.paymentorderno;
	}
	
	/**
	 * 缴费账号,
	 */
	public void setPaymentorderno(String value)
	 {
		this.paymentorderno = value;
	}
	
	/**
	 * 手机号码,
	 */
	public String getPaymentphone() {
		return this.paymentphone;
	}
	
	/**
	 * 手机号码,
	 */
	public void setPaymentphone(String value)
	 {
		this.paymentphone = value;
	}
	
	/**
	 * 支付方式,
	 */
	public String getPaymentunittype() {
		return this.paymentunittype;
	}
	
	/**
	 * 支付方式,
	 */
	public void setPaymentunittype(String value)
	 {
		this.paymentunittype = value;
	}
	
	/**
	 * 还款标识,5：缴水费；6：缴电费；7：缴煤气费；8：手机充值
	 */
	public String getRedeemuseflag() {
		return this.redeemuseflag;
	}
	
	/**
	 * 还款标识,5：缴水费；6：缴电费；7：缴煤气费；8：手机充值
	 */
	public void setRedeemuseflag(String value)
	 {
		this.redeemuseflag = value;
	}
	
	/**
	 * 还款业务代码,取字典“份额类别”
	 */
	public String getRepaybusinflag() {
		return this.repaybusinflag;
	}
	
	/**
	 * 还款业务代码,取字典“份额类别”
	 */
	public void setRepaybusinflag(String value)
	 {
		this.repaybusinflag = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("amount", this.amount);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("paymentapplyno", this.paymentapplyno);
		inputMap.put("paymentunit", this.paymentunit);
		inputMap.put("redeemsum", this.redeemsum);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("paycreditcardtype", this.paycreditcardtype);
		inputMap.put("paymentaccono", this.paymentaccono);
		inputMap.put("paymentorderno", this.paymentorderno);
		inputMap.put("paymentphone", this.paymentphone);
		inputMap.put("paymentunittype", this.paymentunittype);
		inputMap.put("redeemuseflag", this.redeemuseflag);
		inputMap.put("repaybusinflag", this.repaybusinflag);
	}
}
