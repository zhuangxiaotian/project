package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可还款银行信息查询(B042)
 */
public class B042Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 还款卡类型,
	 */
	private String paymentcardtype = "";
	
	/**
	 * 初始化参数
	 */
	public B042Input() {
		this.setFunction("B042");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 还款卡类型,
	 */
	public String getPaymentcardtype() {
		return this.paymentcardtype;
	}
	
	/**
	 * 还款卡类型,
	 */
	public void setPaymentcardtype(String value)
	 {
		this.paymentcardtype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("paymentcardtype", this.paymentcardtype);
	}
}
