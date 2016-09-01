package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投策略查询(I026)
 */
public class I026Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 指数类型,详见字典项”指数类型“
	 */
	private String exptype = "";
	
	/**
	 * 启用标志,(0:未启用; 1:启用; 2:停用)
	 */
	private String state = "";
	
	/**
	 * 初始化参数
	 */
	public I026Input() {
		this.setFunction("I026");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 指数类型,详见字典项”指数类型“
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,详见字典项”指数类型“
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 启用标志,(0:未启用; 1:启用; 2:停用)
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 启用标志,(0:未启用; 1:启用; 2:停用)
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("exptype", this.exptype);
		inputMap.put("state", this.state);
	}
}
