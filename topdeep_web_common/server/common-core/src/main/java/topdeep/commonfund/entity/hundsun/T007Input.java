package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 分红方式修改(T007)
 */
public class T007Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,调用T010返回的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 目标收费方式,（参考字典：分红方式）
	 */
	private String melonmethod = "";
	
	/**
	 * 收费方式,调用T010返回的sharetype
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,调用T010返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 基金账号,调用T010返回的fundacco
	 */
	private String fundacco = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	private String precheckflag = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 初始化参数
	 */
	public T007Input() {
		this.setFunction("T007");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金代码,调用T010返回的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,调用T010返回的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 目标收费方式,（参考字典：分红方式）
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 目标收费方式,（参考字典：分红方式）
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 收费方式,调用T010返回的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,调用T010返回的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,调用T010返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用T010返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 基金账号,调用T010返回的fundacco
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,调用T010返回的fundacco
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public String getPrecheckflag() {
		return this.precheckflag;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public void setPrecheckflag(String value)
	 {
		this.precheckflag = value;
	}
	
	/**
	 * 交易经办人,
	 */
	public String getTradecontact() {
		return this.tradecontact;
	}
	
	/**
	 * 交易经办人,
	 */
	public void setTradecontact(String value)
	 {
		this.tradecontact = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("melonmethod", this.melonmethod);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("precheckflag", this.precheckflag);
		inputMap.put("tradecontact", this.tradecontact);
	}
}
