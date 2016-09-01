package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 趋势定投避险基金列表(I019)
 */
public class I019Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,不传返回所有基金
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public I019Input() {
		this.setFunction("I019");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金代码,不传返回所有基金
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,不传返回所有基金
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
	}
}
