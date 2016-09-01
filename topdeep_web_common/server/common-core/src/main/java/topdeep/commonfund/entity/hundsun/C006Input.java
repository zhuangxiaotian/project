package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 校验弱密码(C006)
 */
public class C006Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,
	 */
	private String idno = "";
	
	/**
	 * 证件类型,
	 */
	private String idtype = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public C006Input() {
		this.setFunction("C006");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdno() {
		return this.idno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdno(String value)
	 {
		this.idno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdtype() {
		return this.idtype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdtype(String value)
	 {
		this.idtype = value;
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
		inputMap.put("idno", this.idno);
		inputMap.put("idtype", this.idtype);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
