package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 支付结果通知(T004)
 */
public class T004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 银行返回数据,
	 */
	private String reqparams;
	
	/**
	 * 资金方式后缀,
	 */
	private String capitalmodeprefix;
	
	/**
	 * 初始化参数
	 */
	public T004Input() {
		this.setFunction("T004");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 银行返回数据,
	 */
	public String getReqparams() {
		return this.reqparams;
	}
	
	/**
	 * 银行返回数据,
	 */
	public void setReqparams(String value)
	 {
		this.reqparams = value;
	}
	
	/**
	 * 资金方式后缀,
	 */
	public String getCapitalmodeprefix() {
		return this.capitalmodeprefix;
	}
	
	/**
	 * 资金方式后缀,
	 */
	public void setCapitalmodeprefix(String value)
	 {
		this.capitalmodeprefix = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode.toString());
		inputMap.put("reqparams", this.reqparams.toString());
		inputMap.put("capitalmodeprefix", this.capitalmodeprefix.toString());
	}
}
