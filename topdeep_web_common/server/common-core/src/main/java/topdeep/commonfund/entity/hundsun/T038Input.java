package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 申赎额度校验(T038)
 */
public class T038Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请份额,
	 */
	private Double requestshare;
	
	/**
	 * 份额类别,
	 */
	private String sharetype;
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public T038Input() {
		this.setFunction("T038");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请份额,
	 */
	public Double getRequestshare() {
		return this.requestshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setRequestshare(Double value)
	 {
		this.requestshare = value;
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
		inputMap.put("requestshare", this.formatDecimal(this.requestshare));
		inputMap.put("sharetype", this.sharetype.toString());
		inputMap.put("fundcode", this.fundcode);
	}
}
