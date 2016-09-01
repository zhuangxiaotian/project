package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡签解约(后台模式)(I024)
 */
public class I024Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 签约标志,
	 */
	private String operator = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 银联CD卡号,
	 */
	private String yinliancdcard = "";
	
	/**
	 * 预校验标志,
	 */
	private String precheckflag = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 是否支付或划款,
	 */
	private String transfermoney = "";
	
	/**
	 * 初始化参数
	 */
	public I024Input() {
		this.setFunction("I024");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
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
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 签约标志,
	 */
	public String getOperator() {
		return this.operator;
	}
	
	/**
	 * 签约标志,
	 */
	public void setOperator(String value)
	 {
		this.operator = value;
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
	 * 交易来源,
	 */
	public String getTradesource() {
		return this.tradesource;
	}
	
	/**
	 * 交易来源,
	 */
	public void setTradesource(String value)
	 {
		this.tradesource = value;
	}
	
	/**
	 * 银联CD卡号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联CD卡号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
	
	/**
	 * 预校验标志,
	 */
	public String getPrecheckflag() {
		return this.precheckflag;
	}
	
	/**
	 * 预校验标志,
	 */
	public void setPrecheckflag(String value)
	 {
		this.precheckflag = value;
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
	
	/**
	 * 是否支付或划款,
	 */
	public String getTransfermoney() {
		return this.transfermoney;
	}
	
	/**
	 * 是否支付或划款,
	 */
	public void setTransfermoney(String value)
	 {
		this.transfermoney = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("operator", this.operator);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("yinliancdcard", this.yinliancdcard);
		inputMap.put("precheckflag", this.precheckflag);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("transfermoney", this.transfermoney);
	}
}
