package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 证件号码修改(B002)
 */
public class B002Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 修改后的证件号码,
	 */
	private String identityno = "";
	
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
	public B002Input() {
		this.setFunction("B002");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 修改后的证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 修改后的证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
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
		inputMap.put("identityno", this.identityno);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
