package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 充值码兑换记录查询(V023)功能输出明细参数
 */
public class V023OutputDetail extends Object implements Serializable {
	
	/**
	 * 兑换面值,
	 */
	private Double amount;
	
	/**
	 * 充值码,
	 */
	private String chargecode = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 兑换日期,
	 */
	private String requestdate = "";
	
	/**
	 * 充值序列号,
	 */
	private String requestno = "";
	
	/**
	 * 兑换时间,
	 */
	private String requesttime = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 兑换面值,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 兑换面值,
	 */
	public void setAmount(Double value)
	 {
		this.amount = value;
	}
	
	/**
	 * 充值码,
	 */
	public String getChargecode() {
		return this.chargecode;
	}
	
	/**
	 * 充值码,
	 */
	public void setChargecode(String value)
	 {
		this.chargecode = value;
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
	 * 兑换日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 兑换日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 充值序列号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 充值序列号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	/**
	 * 兑换时间,
	 */
	public String getRequesttime() {
		return this.requesttime;
	}
	
	/**
	 * 兑换时间,
	 */
	public void setRequesttime(String value)
	 {
		this.requesttime = value;
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
