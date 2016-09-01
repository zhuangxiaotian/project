package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 联动优势单笔订单查询(B025)
 */
public class B025Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 订单金额,
	 */
	private String amount = "";
	
	/**
	 * 付款币种,
	 */
	private String amtType = "";
	
	/**
	 * 订单日期,
	 */
	private String orderDate = "";
	
	/**
	 * 订单编号,
	 */
	private String orderId = "";
	
	/**
	 * 订单状态,
	 */
	private String orderStatus = "";
	
	/**
	 * 支付日期,
	 */
	private String payDate = "";
	
	/**
	 * 支付方式,
	 */
	private String payType = "";
	
	/**
	 * 清算日期,
	 */
	private String settleDate = "";
	
	/**
	 * 订单金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 订单金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 付款币种,
	 */
	public String getAmtType() {
		return this.amtType;
	}
	
	/**
	 * 付款币种,
	 */
	public void setAmtType(String value)
	 {
		this.amtType = value;
	}
	
	/**
	 * 订单日期,
	 */
	public String getOrderDate() {
		return this.orderDate;
	}
	
	/**
	 * 订单日期,
	 */
	public void setOrderDate(String value)
	 {
		this.orderDate = value;
	}
	
	/**
	 * 订单编号,
	 */
	public String getOrderId() {
		return this.orderId;
	}
	
	/**
	 * 订单编号,
	 */
	public void setOrderId(String value)
	 {
		this.orderId = value;
	}
	
	/**
	 * 订单状态,
	 */
	public String getOrderStatus() {
		return this.orderStatus;
	}
	
	/**
	 * 订单状态,
	 */
	public void setOrderStatus(String value)
	 {
		this.orderStatus = value;
	}
	
	/**
	 * 支付日期,
	 */
	public String getPayDate() {
		return this.payDate;
	}
	
	/**
	 * 支付日期,
	 */
	public void setPayDate(String value)
	 {
		this.payDate = value;
	}
	
	/**
	 * 支付方式,
	 */
	public String getPayType() {
		return this.payType;
	}
	
	/**
	 * 支付方式,
	 */
	public void setPayType(String value)
	 {
		this.payType = value;
	}
	
	/**
	 * 清算日期,
	 */
	public String getSettleDate() {
		return this.settleDate;
	}
	
	/**
	 * 清算日期,
	 */
	public void setSettleDate(String value)
	 {
		this.settleDate = value;
	}
}
