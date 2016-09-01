package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 建行快捷付签约验证(B043)
 */
public class B043Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 包含银行返回的所有字段信息的JSON格式字符串,Base64编码该字段值后返回网上交易
	 */
	private String reqParam = "";
	
	/**
	 * 是否鉴权完成后直接开户,
	 */
	private String openaccount = "";
	
	/**
	 * 初始化参数
	 */
	public B043Input() {
		this.setFunction("B043");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 包含银行返回的所有字段信息的JSON格式字符串,Base64编码该字段值后返回网上交易
	 */
	public String getReqParam() {
		return this.reqParam;
	}
	
	/**
	 * 包含银行返回的所有字段信息的JSON格式字符串,Base64编码该字段值后返回网上交易
	 */
	public void setReqParam(String value)
	 {
		this.reqParam = value;
	}
	
	/**
	 * 是否鉴权完成后直接开户,
	 */
	public String getOpenaccount() {
		return this.openaccount;
	}
	
	/**
	 * 是否鉴权完成后直接开户,
	 */
	public void setOpenaccount(String value)
	 {
		this.openaccount = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("reqParam", this.reqParam);
		inputMap.put("openaccount", this.openaccount);
	}
}
