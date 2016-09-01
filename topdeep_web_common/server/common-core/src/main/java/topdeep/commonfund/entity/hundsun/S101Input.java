package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 现金宝过户查询(S101)
 */
public class S101Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 初始化参数
	 */
	public S101Input() {
		this.setFunction("S101");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
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
	 * 申请编号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("requestno", this.requestno);
	}
}
