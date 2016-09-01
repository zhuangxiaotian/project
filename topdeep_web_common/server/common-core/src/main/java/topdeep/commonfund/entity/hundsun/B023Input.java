package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可还款信用卡查询(B023)
 */
public class B023Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行卡状态,
	 */
	private String paymentcardstate = "H:历史、A:正常";
	
	/**
	 * 银行卡类型,
	 */
	private String paymentcardtype = "";
	
	/**
	 * 初始化参数
	 */
	public B023Input() {
		this.setFunction("B023");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行卡状态,
	 */
	public String getPaymentcardstate() {
		return this.paymentcardstate;
	}
	
	/**
	 * 银行卡状态,
	 */
	public void setPaymentcardstate(String value)
	 {
		this.paymentcardstate = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("paymentcardstate", this.paymentcardstate);
		inputMap.put("paymentcardtype", this.paymentcardtype);
	}
}
