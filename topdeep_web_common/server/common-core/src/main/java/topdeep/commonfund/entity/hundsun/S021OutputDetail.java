package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易费率查询(S021)功能输出明细参数
 */
public class S021OutputDetail extends Object implements Serializable {
	
	/**
	 * 折扣,
	 */
	private String discountrate = "";
	
	/**
	 * 费用,
	 */
	private String fare = "";
	
	/**
	 * 费率,
	 */
	private String feerate = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 支付卡,
	 */
	private String payacco = "";
	
	/**
	 * 支付银行名称,
	 */
	private String payname = "";
	
	/**
	 * 支付方式,
	 */
	private String payway = "";
	
	/**
	 * 折扣,
	 */
	public String getDiscountrate() {
		return this.discountrate;
	}
	
	/**
	 * 折扣,
	 */
	public void setDiscountrate(String value)
	 {
		this.discountrate = value;
	}
	
	/**
	 * 费用,
	 */
	public String getFare() {
		return this.fare;
	}
	
	/**
	 * 费用,
	 */
	public void setFare(String value)
	 {
		this.fare = value;
	}
	
	/**
	 * 费率,
	 */
	public String getFeerate() {
		return this.feerate;
	}
	
	/**
	 * 费率,
	 */
	public void setFeerate(String value)
	 {
		this.feerate = value;
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
	 * 支付卡,
	 */
	public String getPayacco() {
		return this.payacco;
	}
	
	/**
	 * 支付卡,
	 */
	public void setPayacco(String value)
	 {
		this.payacco = value;
	}
	
	/**
	 * 支付银行名称,
	 */
	public String getPayname() {
		return this.payname;
	}
	
	/**
	 * 支付银行名称,
	 */
	public void setPayname(String value)
	 {
		this.payname = value;
	}
	
	/**
	 * 支付方式,
	 */
	public String getPayway() {
		return this.payway;
	}
	
	/**
	 * 支付方式,
	 */
	public void setPayway(String value)
	 {
		this.payway = value;
	}
}
