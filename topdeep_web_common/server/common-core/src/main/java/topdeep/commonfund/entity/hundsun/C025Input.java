package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 数据中心客户信息查询(C025)
 */
public class C025Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public C025Input() {
		this.setFunction("C025");
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
