package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 费率折扣查询(S034)
 */
public class S034Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 目标基金,
	 */
	private String otherfundcode = "";
	
	/**
	 * 费率折扣率,
	 */
	private String discount = "";
	
	/**
	 * 初始化参数
	 */
	public S034Input() {
		this.setFunction("S034");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
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
	
	/**
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 目标基金,
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 目标基金,
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
	}
	
	/**
	 * 费率折扣率,
	 */
	public String getDiscount() {
		return this.discount;
	}
	
	/**
	 * 费率折扣率,
	 */
	public void setDiscount(String value)
	 {
		this.discount = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("otherfundcode", this.otherfundcode);
		inputMap.put("discount", this.discount);
	}
}
