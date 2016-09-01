package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投赎回的基金列表(I014)
 */
public class I014Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 是否检查份额（是否有份额才能赎回）,1：是，其余为否（包括空）
	 */
	private String checkshare = "";
	
	/**
	 * 初始化参数
	 */
	public I014Input() {
		this.setFunction("I014");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 是否检查份额（是否有份额才能赎回）,1：是，其余为否（包括空）
	 */
	public String getCheckshare() {
		return this.checkshare;
	}
	
	/**
	 * 是否检查份额（是否有份额才能赎回）,1：是，其余为否（包括空）
	 */
	public void setCheckshare(String value)
	 {
		this.checkshare = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("checkshare", this.checkshare);
	}
}
