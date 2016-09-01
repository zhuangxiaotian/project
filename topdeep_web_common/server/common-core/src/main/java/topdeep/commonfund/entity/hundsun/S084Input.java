package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 待审核交易查询(S084)
 */
public class S084Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 子账户编号,
	 */
	private String subaccono = "";
	
	/**
	 * 交易密码,
	 */
	private String dealpwd = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 子账户交易密码,
	 */
	private String subdealpwd = "";
	
	/**
	 * 子账户查询密码,
	 */
	private String subquerypwd = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S084Input() {
		this.setFunction("S084");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 子账户编号,
	 */
	public String getSubaccono() {
		return this.subaccono;
	}
	
	/**
	 * 子账户编号,
	 */
	public void setSubaccono(String value)
	 {
		this.subaccono = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getDealpwd() {
		return this.dealpwd;
	}
	
	/**
	 * 交易密码,
	 */
	public void setDealpwd(String value)
	 {
		this.dealpwd = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 子账户交易密码,
	 */
	public String getSubdealpwd() {
		return this.subdealpwd;
	}
	
	/**
	 * 子账户交易密码,
	 */
	public void setSubdealpwd(String value)
	 {
		this.subdealpwd = value;
	}
	
	/**
	 * 子账户查询密码,
	 */
	public String getSubquerypwd() {
		return this.subquerypwd;
	}
	
	/**
	 * 子账户查询密码,
	 */
	public void setSubquerypwd(String value)
	 {
		this.subquerypwd = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("subaccono", this.subaccono);
		inputMap.put("dealpwd", this.dealpwd);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("subdealpwd", this.subdealpwd);
		inputMap.put("subquerypwd", this.subquerypwd);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
