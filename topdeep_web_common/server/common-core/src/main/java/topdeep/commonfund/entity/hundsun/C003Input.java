package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 验证银行开户签名数据(C003)
 */
public class C003Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,调用C001返回的capitalmode
	 */
	private String capitalmode = "";
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串,Base64编码该字段值后返回网上交易
	 */
	private String reqparams = "";
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	private String capitalmode_prefix = "空";
	
	/**
	 * 初始化参数
	 */
	public C003Input() {
		this.setFunction("C003");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 资金方式,调用C001返回的capitalmode
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,调用C001返回的capitalmode
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串,Base64编码该字段值后返回网上交易
	 */
	public String getReqparams() {
		return this.reqparams;
	}
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串,Base64编码该字段值后返回网上交易
	 */
	public void setReqparams(String value)
	 {
		this.reqparams = value;
	}
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	public String getCapitalmode_prefix() {
		return this.capitalmode_prefix;
	}
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	public void setCapitalmode_prefix(String value)
	 {
		this.capitalmode_prefix = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("reqparams", this.reqparams);
		inputMap.put("capitalmode_prefix", this.capitalmode_prefix);
	}
}
