package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 手机绑定信息查询(V011)
 */
public class V011Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 初始化参数
	 */
	public V011Input() {
		this.setFunction("V011");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
	}
}
