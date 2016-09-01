package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 登出系统(P004)
 */
public class P004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public P004Input() {
		this.setFunction("P004");
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
