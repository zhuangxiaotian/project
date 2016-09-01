package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金开放日期查询(S085)
 */
public class S085Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金号码,1，基金号码为空，查询出所有基金的开放日期2，基金号码不为空，查询出指定基金的基金开放日期
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public S085Input() {
		this.setFunction("S085");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金号码,1，基金号码为空，查询出所有基金的开放日期2，基金号码不为空，查询出指定基金的基金开放日期
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金号码,1，基金号码为空，查询出所有基金的开放日期2，基金号码不为空，查询出指定基金的基金开放日期
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
