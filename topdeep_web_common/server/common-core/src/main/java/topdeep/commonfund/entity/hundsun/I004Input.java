package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡签解约(I004)
 */
public class I004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行编号,调用I001返回的bankserial
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,调用I001返回的capitalmode
	 */
	private String capitalmode = "";
	
	/**
	 * 签解约类型,0:签约,1:解约
	 */
	private String operator = "";
	
	/**
	 * 交易账号,调用I001返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 银联CD卡号,调用I001返回的yinliancdcard
	 */
	private String yinliancdcard = "";
	
	/**
	 * 初始化参数
	 */
	public I004Input() {
		this.setFunction("I004");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行编号,调用I001返回的bankserial
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,调用I001返回的bankserial
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 资金方式,调用I001返回的capitalmode
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,调用I001返回的capitalmode
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 签解约类型,0:签约,1:解约
	 */
	public String getOperator() {
		return this.operator;
	}
	
	/**
	 * 签解约类型,0:签约,1:解约
	 */
	public void setOperator(String value)
	 {
		this.operator = value;
	}
	
	/**
	 * 交易账号,调用I001返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用I001返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 银联CD卡号,调用I001返回的yinliancdcard
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联CD卡号,调用I001返回的yinliancdcard
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("operator", this.operator);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("yinliancdcard", this.yinliancdcard);
	}
}
