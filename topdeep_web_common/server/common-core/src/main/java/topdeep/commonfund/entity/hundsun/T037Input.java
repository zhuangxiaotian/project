package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 快速赎回资金解冻(T037)
 */
public class T037Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请金额,解冻时申请金额必须和冻结时相同
	 */
	private String applysum = "";
	
	/**
	 * 银商流水号,解冻时流水号必须和冻结时相同
	 */
	private String chinapayserialno = "";
	
	/**
	 * 交易密码,若无交易来源，则交易密码必填
	 */
	private String tradepassword = "";
	
	/**
	 * 下单日期,
	 */
	private String applydate = "";
	
	/**
	 * 申请时间,若下单日期时间为空，则默认当前日期时间
	 */
	private String applytime = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 初始化参数
	 */
	public T037Input() {
		this.setFunction("T037");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请金额,解冻时申请金额必须和冻结时相同
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,解冻时申请金额必须和冻结时相同
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 银商流水号,解冻时流水号必须和冻结时相同
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 银商流水号,解冻时流水号必须和冻结时相同
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
	}
	
	/**
	 * 交易密码,若无交易来源，则交易密码必填
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,若无交易来源，则交易密码必填
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 下单日期,
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 下单日期,
	 */
	public void setApplydate(String value)
	 {
		this.applydate = value;
	}
	
	/**
	 * 申请时间,若下单日期时间为空，则默认当前日期时间
	 */
	public String getApplytime() {
		return this.applytime;
	}
	
	/**
	 * 申请时间,若下单日期时间为空，则默认当前日期时间
	 */
	public void setApplytime(String value)
	 {
		this.applytime = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applysum", this.applysum);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("applydate", this.applydate);
		inputMap.put("applytime", this.applytime);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradesource", this.tradesource);
	}
}
