package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投申购的基金列表(I012)
 */
public class I012Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 是否允许未签约做交易,0：不允许（默认），1：允许
	 */
	private String unsigned;
	
	/**
	 * 初始化参数
	 */
	public I012Input() {
		this.setFunction("I012");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 是否允许未签约做交易,0：不允许（默认），1：允许
	 */
	public String getUnsigned() {
		return this.unsigned;
	}
	
	/**
	 * 是否允许未签约做交易,0：不允许（默认），1：允许
	 */
	public void setUnsigned(String value)
	 {
		this.unsigned = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("unsigned", this.unsigned.toString());
	}
}
