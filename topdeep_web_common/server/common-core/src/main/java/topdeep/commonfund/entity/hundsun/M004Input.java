package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 现金宝基金列表(M004)
 */
public class M004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public M004Input() {
		this.setFunction("M004");
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
