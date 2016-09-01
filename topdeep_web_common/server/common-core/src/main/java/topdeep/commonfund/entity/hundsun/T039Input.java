package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 支付渠道查询(T039)
 */
public class T039Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请金额,
	 */
	private String amount = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 初始化参数
	 */
	public T039Input() {
		this.setFunction("T039");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 申请金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("amount", this.amount);
		inputMap.put("bankserial", this.bankserial);
	}
}
