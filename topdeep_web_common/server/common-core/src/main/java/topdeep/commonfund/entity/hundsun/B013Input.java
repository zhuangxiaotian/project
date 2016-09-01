package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 小额打款查询(B013)
 */
public class B013Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 订单号,易宝比传
	 */
	private String orderno = "";
	
	/**
	 * 打款金额,格式:x.xx，单位元，精确到分3:银联时比传
	 */
	private String amount = "";
	
	/**
	 * 银行卡号,3:银联时比传
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,3:银联时比传
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,3:银联，为空则默认为易宝
	 */
	private String capitalmode = "";
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	private String capitalmode_prefix = "";
	
	/**
	 * 初始化参数
	 */
	public B013Input() {
		this.setFunction("B013");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 订单号,易宝比传
	 */
	public String getOrderno() {
		return this.orderno;
	}
	
	/**
	 * 订单号,易宝比传
	 */
	public void setOrderno(String value)
	 {
		this.orderno = value;
	}
	
	/**
	 * 打款金额,格式:x.xx，单位元，精确到分3:银联时比传
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 打款金额,格式:x.xx，单位元，精确到分3:银联时比传
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 银行卡号,3:银联时比传
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,3:银联时比传
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行编号,3:银联时比传
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,3:银联时比传
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 资金方式,3:银联，为空则默认为易宝
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,3:银联，为空则默认为易宝
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
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
		inputMap.put("orderno", this.orderno);
		inputMap.put("amount", this.amount);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("capitalmode_prefix", this.capitalmode_prefix);
	}
}
