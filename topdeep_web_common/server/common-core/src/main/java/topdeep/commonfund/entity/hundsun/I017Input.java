package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投转换的转出基金列表(I017)
 */
public class I017Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public I017Input() {
		this.setFunction("I017");
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
