package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行签约返回数据验证(I015)
 */
public class I015Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	private String capitalmode = "";
	
	/**
	 * 银行返回数据,json格式base64编码
	 */
	private String reqparams = "";
	
	/**
	 * 初始化参数
	 */
	public I015Input() {
		this.setFunction("I015");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 银行返回数据,json格式base64编码
	 */
	public String getReqparams() {
		return this.reqparams;
	}
	
	/**
	 * 银行返回数据,json格式base64编码
	 */
	public void setReqparams(String value)
	 {
		this.reqparams = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("reqparams", this.reqparams);
	}
}
