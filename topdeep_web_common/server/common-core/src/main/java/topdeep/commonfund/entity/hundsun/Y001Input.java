package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 未处理预约申请列表(Y001)
 */
public class Y001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,023:预约申购;025:预约赎回;986:预约转换；对于支持现金宝情况，返回列表中含业务大类为现金宝的对应申请
	 */
	private String businflag = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 业务大类,01:现金宝
	 */
	private String busintype = "";
	
	/**
	 * 初始化参数
	 */
	public Y001Input() {
		this.setFunction("Y001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,023:预约申购;025:预约赎回;986:预约转换；对于支持现金宝情况，返回列表中含业务大类为现金宝的对应申请
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,023:预约申购;025:预约赎回;986:预约转换；对于支持现金宝情况，返回列表中含业务大类为现金宝的对应申请
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 业务大类,01:现金宝
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,01:现金宝
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("busintype", this.busintype);
	}
}
