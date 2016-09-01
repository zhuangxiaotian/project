package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可转托管入基金列表(T011)
 */
public class T011Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 是否过滤专户基金,1：过滤掉专户基金，其他不过滤
	 */
	private String isfilterspecialfund = "";
	
	/**
	 * 初始化参数
	 */
	public T011Input() {
		this.setFunction("T011");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 是否过滤专户基金,1：过滤掉专户基金，其他不过滤
	 */
	public String getIsfilterspecialfund() {
		return this.isfilterspecialfund;
	}
	
	/**
	 * 是否过滤专户基金,1：过滤掉专户基金，其他不过滤
	 */
	public void setIsfilterspecialfund(String value)
	 {
		this.isfilterspecialfund = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("isfilterspecialfund", this.isfilterspecialfund);
	}
}
