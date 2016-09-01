package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * TA信息查询(S023)
 */
public class S023Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public S023Input() {
		this.setFunction("S023");
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
