package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 充值码兑换记录查询(V023)
 */
public class V023Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 充值码,
	 */
	private String chargecode = "";
	
	/**
	 * 客户编号,1-正常，0-失效，空-不限制
	 */
	private String custno = "";
	
	/**
	 * 充值序列号,
	 */
	private String requestno = "";
	
	/**
	 * 初始化参数
	 */
	public V023Input() {
		this.setFunction("V023");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 充值码,
	 */
	public String getChargecode() {
		return this.chargecode;
	}
	
	/**
	 * 充值码,
	 */
	public void setChargecode(String value)
	 {
		this.chargecode = value;
	}
	
	/**
	 * 客户编号,1-正常，0-失效，空-不限制
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,1-正常，0-失效，空-不限制
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 充值序列号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 充值序列号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("chargecode", this.chargecode);
		inputMap.put("custno", this.custno);
		inputMap.put("requestno", this.requestno);
	}
}
