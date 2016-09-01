package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询专户人数限制(E007)
 */
public class E007Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * ,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 申请金额,
	 */
	private Double requestbala;
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * ,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public E007Input() {
		this.setFunction("E007");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * ,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * ,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 申请金额,
	 */
	public Double getRequestbala() {
		return this.requestbala;
	}
	
	/**
	 * 申请金额,
	 */
	public void setRequestbala(Double value)
	 {
		this.requestbala = value;
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
	 * ,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * ,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("requestbala", this.formatDecimal(this.requestbala));
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
