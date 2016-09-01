package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预约买入支付方式列表(Y002)
 */
public class Y002Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * ,023:预约申购
	 */
	private String businflag = "";
	
	/**
	 * 初始化参数
	 */
	public Y002Input() {
		this.setFunction("Y002");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * ,023:预约申购
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * ,023:预约申购
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
	}
}
