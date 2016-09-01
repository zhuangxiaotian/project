package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 指数均线查询(S094)
 */
public class S094Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 均线类型,
	 */
	private String avgexponenttype = "";
	
	/**
	 * 指数代码,
	 */
	private String exponentcode = "";
	
	/**
	 * 初始化参数
	 */
	public S094Input() {
		this.setFunction("S094");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 均线类型,
	 */
	public String getAvgexponenttype() {
		return this.avgexponenttype;
	}
	
	/**
	 * 均线类型,
	 */
	public void setAvgexponenttype(String value)
	 {
		this.avgexponenttype = value;
	}
	
	/**
	 * 指数代码,
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 指数代码,
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("avgexponenttype", this.avgexponenttype);
		inputMap.put("exponentcode", this.exponentcode);
	}
}
