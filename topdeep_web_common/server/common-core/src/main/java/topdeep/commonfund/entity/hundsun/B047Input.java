package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * Chinapay手机支付下单(B046)
 */
public class B047Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 参数所有字段信息,参数所有字段信息
	 */
	private String reqparams = "";
	
	/**
	 * 初始化参数
	 */
	public B047Input() {
		this.setFunction("B047");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 参数所有字段信息,参数所有字段信息
	 */
	public String getReqparams() {
		return this.reqparams;
	}
	
	/**
	 * 参数所有字段信息,参数所有字段信息
	 */
	public void setReqparams(String value)
	 {
		this.reqparams = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("reqparams", this.reqparams);
	}
}
