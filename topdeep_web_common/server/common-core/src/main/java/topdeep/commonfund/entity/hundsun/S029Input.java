package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易时间限制查询(S029)
 */
public class S029Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,（参考字典：业务名称）
	 */
	private String businflag = "取直销机器时间";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public S029Input() {
		this.setFunction("S029");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,（参考字典：业务名称）
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,（参考字典：业务名称）
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
	}
}
