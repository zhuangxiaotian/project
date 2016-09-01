package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 刷新查询接口(P014)
 */
public class P0014Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public P0014Input() {
		this.setFunction("P0014");
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
