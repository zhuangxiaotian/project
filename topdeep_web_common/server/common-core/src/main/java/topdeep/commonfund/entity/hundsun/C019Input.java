package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开户身份证号码升位(C019)
 */
public class C019Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,字符串
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,字符
	 */
	private String identitytype;
	
	/**
	 * 证件有效期,字符串，例子2022-04-23
	 */
	private String invalidate = "";
	
	/**
	 * 交易密码,字符串
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public C019Input() {
		this.setFunction("C019");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 证件号码,字符串
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,字符串
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,字符
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,字符
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 证件有效期,字符串，例子2022-04-23
	 */
	public String getInvalidate() {
		return this.invalidate;
	}
	
	/**
	 * 证件有效期,字符串，例子2022-04-23
	 */
	public void setInvalidate(String value)
	 {
		this.invalidate = value;
	}
	
	/**
	 * 交易密码,字符串
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,字符串
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype.toString());
		inputMap.put("invalidate", this.invalidate);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
