package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 发送手机解绑验证码(C032)
 */
public class C032Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public C032Input() {
		this.setFunction("C032");
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
