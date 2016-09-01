package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可签解约银行卡列表(I001)
 */
public class I001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 签约列表类型,1：可签约列表；2：可解约列表；3可签约列表+可解约列表
	 */
	private String signtype = "";
	
	/**
	 * 初始化参数
	 */
	public I001Input() {
		this.setFunction("I001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 签约列表类型,1：可签约列表；2：可解约列表；3可签约列表+可解约列表
	 */
	public String getSigntype() {
		return this.signtype;
	}
	
	/**
	 * 签约列表类型,1：可签约列表；2：可解约列表；3可签约列表+可解约列表
	 */
	public void setSigntype(String value)
	 {
		this.signtype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("signtype", this.signtype);
	}
}
