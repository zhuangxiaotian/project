package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取登录信息(C039)
 */
public class C039Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	private String custNo = "";
	
	/**
	 * 初始化参数
	 */
	public C039Input() {
		this.setFunction("C039");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	public String getCustNo() {
		return this.custNo;
	}
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	public void setCustNo(String value)
	 {
		this.custNo = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custNo", this.custNo);
	}
}
