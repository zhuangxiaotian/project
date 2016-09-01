package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可还款银行卡管理(B028)
 */
public class B028Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 操作类型,
	 */
	private String paytoopratype = "0:新增/修改;1:删除";
	
	/**
	 * 默认还款卡标志,
	 */
	private String defaultflag = "0:否,1:是";
	
	/**
	 * 还款银行卡编号,
	 */
	private String paymentaccono = "唯一标识";
	
	/**
	 * 待还款银行账号,
	 */
	private String paymentbankacco = "";
	
	/**
	 * 待还款银行编号,
	 */
	private String paymentbankno = "";
	
	/**
	 * 还款银行卡类型,
	 */
	private String paymentcardtype = "1-借记卡 2-信用卡";
	
	/**
	 * 备注信息,
	 */
	private String explain = "";
	
	/**
	 * 待还款银行户名,
	 */
	private String paymentnameinbank = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public B028Input() {
		this.setFunction("B028");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 操作类型,
	 */
	public String getPaytoopratype() {
		return this.paytoopratype;
	}
	
	/**
	 * 操作类型,
	 */
	public void setPaytoopratype(String value)
	 {
		this.paytoopratype = value;
	}
	
	/**
	 * 默认还款卡标志,
	 */
	public String getDefaultflag() {
		return this.defaultflag;
	}
	
	/**
	 * 默认还款卡标志,
	 */
	public void setDefaultflag(String value)
	 {
		this.defaultflag = value;
	}
	
	/**
	 * 还款银行卡编号,
	 */
	public String getPaymentaccono() {
		return this.paymentaccono;
	}
	
	/**
	 * 还款银行卡编号,
	 */
	public void setPaymentaccono(String value)
	 {
		this.paymentaccono = value;
	}
	
	/**
	 * 待还款银行账号,
	 */
	public String getPaymentbankacco() {
		return this.paymentbankacco;
	}
	
	/**
	 * 待还款银行账号,
	 */
	public void setPaymentbankacco(String value)
	 {
		this.paymentbankacco = value;
	}
	
	/**
	 * 待还款银行编号,
	 */
	public String getPaymentbankno() {
		return this.paymentbankno;
	}
	
	/**
	 * 待还款银行编号,
	 */
	public void setPaymentbankno(String value)
	 {
		this.paymentbankno = value;
	}
	
	/**
	 * 还款银行卡类型,
	 */
	public String getPaymentcardtype() {
		return this.paymentcardtype;
	}
	
	/**
	 * 还款银行卡类型,
	 */
	public void setPaymentcardtype(String value)
	 {
		this.paymentcardtype = value;
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
	 * 待还款银行户名,
	 */
	public String getPaymentnameinbank() {
		return this.paymentnameinbank;
	}
	
	/**
	 * 待还款银行户名,
	 */
	public void setPaymentnameinbank(String value)
	 {
		this.paymentnameinbank = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("paytoopratype", this.paytoopratype);
		inputMap.put("defaultflag", this.defaultflag);
		inputMap.put("paymentaccono", this.paymentaccono);
		inputMap.put("paymentbankacco", this.paymentbankacco);
		inputMap.put("paymentbankno", this.paymentbankno);
		inputMap.put("paymentcardtype", this.paymentcardtype);
		inputMap.put("explain", this.explain);
		inputMap.put("paymentnameinbank", this.paymentnameinbank);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
