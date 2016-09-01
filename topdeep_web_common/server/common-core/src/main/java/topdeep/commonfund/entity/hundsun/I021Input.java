package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投基金列表(I021)
 */
public class I021Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 组合编号,
	 */
	private String combcode = "";
	
	/**
	 * 初始化参数
	 */
	public I021Input() {
		this.setFunction("I021");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 组合编号,
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("combcode", this.combcode);
	}
}
