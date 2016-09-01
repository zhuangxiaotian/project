package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 分行支行名称修改(B004)
 */
public class B004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 分行支行名称,如“杭州分行滨江支行”
	 */
	private String branchname = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public B004Input() {
		this.setFunction("B004");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 分行支行名称,如“杭州分行滨江支行”
	 */
	public String getBranchname() {
		return this.branchname;
	}
	
	/**
	 * 分行支行名称,如“杭州分行滨江支行”
	 */
	public void setBranchname(String value)
	 {
		this.branchname = value;
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
	 * 交易密码,
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("branchname", this.branchname);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
