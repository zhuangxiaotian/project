package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 内部转托管(T022)
 */
public class T022Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 转入交易账号,
	 */
	private String opptradeacco = "";
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	private String sharetype = "";
	
	/**
	 * 转出交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 转托管份额,
	 */
	private String trusteetoshare = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 初始化参数
	 */
	public T022Input() {
		this.setFunction("T022");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 转入交易账号,
	 */
	public String getOpptradeacco() {
		return this.opptradeacco;
	}
	
	/**
	 * 转入交易账号,
	 */
	public void setOpptradeacco(String value)
	 {
		this.opptradeacco = value;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 转出交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 转出交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 转托管份额,
	 */
	public String getTrusteetoshare() {
		return this.trusteetoshare;
	}
	
	/**
	 * 转托管份额,
	 */
	public void setTrusteetoshare(String value)
	 {
		this.trusteetoshare = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("opptradeacco", this.opptradeacco);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("trusteetoshare", this.trusteetoshare);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("tradesource", this.tradesource);
	}
}
