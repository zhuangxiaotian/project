package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 避险明细查询(S015)
 */
public class S015Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 初始化参数
	 */
	public S015Input() {
		this.setFunction("S015");
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
