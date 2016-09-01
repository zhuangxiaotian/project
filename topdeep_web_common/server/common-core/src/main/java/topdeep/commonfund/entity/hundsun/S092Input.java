package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金费率查询(S092)
 */
public class S092Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 业务类型,
	 */
	private String businflag = "";
	
	/**
	 * 客户类别,
	 */
	private String custtype = "";
	
	/**
	 * 费用类别,
	 */
	private String faretype = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 初始化参数
	 */
	public S092Input() {
		this.setFunction("S092");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 业务类型,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 客户类别,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类别,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 费用类别,
	 */
	public String getFaretype() {
		return this.faretype;
	}
	
	/**
	 * 费用类别,
	 */
	public void setFaretype(String value)
	 {
		this.faretype = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("businflag", this.businflag);
		inputMap.put("custtype", this.custtype);
		inputMap.put("faretype", this.faretype);
		inputMap.put("sharetype", this.sharetype);
	}
}
