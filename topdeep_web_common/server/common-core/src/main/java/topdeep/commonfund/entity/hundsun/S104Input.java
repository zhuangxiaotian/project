package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金风险等级查询(S104)
 */
public class S104Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public S104Input() {
		this.setFunction("S104");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
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
