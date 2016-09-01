package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 直销系统时间查询(S075)
 */
public class S075Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public S075Input() {
		this.setFunction("S075");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
	}
}
