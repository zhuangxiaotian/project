package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户预留信息更新(C061)
 */
public class C061Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 预留信息,
	 */
	private String reservewords = "";
	
	/**
	 * 初始化参数
	 */
	public C061Input() {
		this.setFunction("C061");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 预留信息,
	 */
	public String getReservewords() {
		return this.reservewords;
	}
	
	/**
	 * 预留信息,
	 */
	public void setReservewords(String value)
	 {
		this.reservewords = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("reservewords", this.reservewords);
	}
}
