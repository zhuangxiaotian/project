package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 当前工作日查询(S008)
 */
public class S008Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 是否取认购工作日,1-使用认购工作日计算，其他-使用申购工作日计算
	 */
	private String subworkdate = "";
	
	/**
	 * 初始化参数
	 */
	public S008Input() {
		this.setFunction("S008");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 是否取认购工作日,1-使用认购工作日计算，其他-使用申购工作日计算
	 */
	public String getSubworkdate() {
		return this.subworkdate;
	}
	
	/**
	 * 是否取认购工作日,1-使用认购工作日计算，其他-使用申购工作日计算
	 */
	public void setSubworkdate(String value)
	 {
		this.subworkdate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("subworkdate", this.subworkdate);
	}
}
