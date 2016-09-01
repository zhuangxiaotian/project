package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 待审核交易查询(S083)
 */
public class S083Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public S083Input() {
		this.setFunction("S083");
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
