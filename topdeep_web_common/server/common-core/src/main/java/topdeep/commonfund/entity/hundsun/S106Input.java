package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 过户入确认查询(S106)
 */
public class S106Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 对方交易账号,
	 */
	private String othertradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S106Input() {
		this.setFunction("S106");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 对方交易账号,
	 */
	public String getOthertradeacco() {
		return this.othertradeacco;
	}
	
	/**
	 * 对方交易账号,
	 */
	public void setOthertradeacco(String value)
	 {
		this.othertradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("othertradeacco", this.othertradeacco);
	}
}
