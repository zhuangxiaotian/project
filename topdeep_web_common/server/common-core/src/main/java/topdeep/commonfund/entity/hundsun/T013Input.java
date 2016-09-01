package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合投资基金列表(T013)
 */
public class T013Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 组合编号,不传则返回全部
	 */
	private String combcode = "";
	
	/**
	 * 初始化参数
	 */
	public T013Input() {
		this.setFunction("T013");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 组合编号,不传则返回全部
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,不传则返回全部
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
