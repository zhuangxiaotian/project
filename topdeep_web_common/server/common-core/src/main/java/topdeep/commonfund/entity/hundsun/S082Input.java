package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 子账户查询(S082)
 */
public class S082Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 高华机构子账户id,高华机构调用接口时传
	 */
	private String subaccoid = "";
	
	/**
	 * 初始化参数
	 */
	public S082Input() {
		this.setFunction("S082");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 高华机构子账户id,高华机构调用接口时传
	 */
	public String getSubaccoid() {
		return this.subaccoid;
	}
	
	/**
	 * 高华机构子账户id,高华机构调用接口时传
	 */
	public void setSubaccoid(String value)
	 {
		this.subaccoid = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("subaccoid", this.subaccoid);
	}
}
