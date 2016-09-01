package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 联动优势单笔订单查询(B025)
 */
public class B025Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 订单日期,
	 */
	private String orderDate = "";
	
	/**
	 * 订单号码,
	 */
	private String orderId = "";
	
	/**
	 * 初始化参数
	 */
	public B025Input() {
		this.setFunction("B025");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 订单号码,
	 */
	public String getOrderId() {
		return this.orderId;
	}
	
	/**
	 * 订单号码,
	 */
	public void setOrderId(String value)
	 {
		this.orderId = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("orderDate", this.orderDate);
		inputMap.put("orderId", this.orderId);
	}
}
