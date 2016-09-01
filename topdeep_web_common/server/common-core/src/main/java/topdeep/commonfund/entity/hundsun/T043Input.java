package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息修改(T043)
 */
public class T043Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请金额,
	 */
	private String balance = "";
	
	/**
	 * 订单流水号,
	 */
	private String requestno = "";
	
	/**
	 * 初始化参数
	 */
	public T043Input() {
		this.setFunction("T043");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请金额,
	 */
	public String getBalance() {
		return this.balance;
	}
	
	/**
	 * 申请金额,
	 */
	public void setBalance(String value)
	 {
		this.balance = value;
	}
	
	/**
	 * 订单流水号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 订单流水号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("balance", this.balance);
		inputMap.put("requestno", this.requestno);
	}
}
