package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预约买入基金下单(Y003)
 */
public class Y003Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请额度,
	 */
	private Double applysum;
	
	/**
	 * 业务代码,023:预约申购
	 */
	private String businflag = "";
	
	/**
	 * 资金来源,0:银行卡;1:现金宝
	 */
	private String capsource = "";
	
	/**
	 * 基金代码,调用Y002返回的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 收费方式,调用Y002返回的sharetype
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,调用Y002返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,用des进行加密传输，暂时传[ISNULL]
	 */
	private String tradepassword = "";
	
	/**
	 * 业务大类,现金宝预约充值时，必须传01，对应的fundcode和sharetype必须是现金宝对应的基金代码和收费方式
	 */
	private String busintype = "";
	
	/**
	 * 目标现金宝基金代码,当资金来源为现金宝时，该字段为指定的现金宝基金代码
	 */
	private String buyMoneyFundcode = "";
	
	/**
	 * 目标现金宝基金收费方式,当资金来源为现金宝时，该字段为指定的现金宝基金收费方式
	 */
	private String buyMoneySharetype = "";
	
	/**
	 * 预约指数代码,
	 */
	private String exponentcode = "";
	
	/**
	 * 预约比较条件,
	 */
	private String exponentflag = "";
	
	/**
	 * 预约点位,
	 */
	private Double exponentvalue;
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	private String exptype = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 预约日期,
	 */
	private String hopedate = "";
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	private String mintredeem = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 活动代码,
	 */
	private String promotion = "";
	
	/**
	 * 初始化参数
	 */
	public Y003Input() {
		this.setFunction("Y003");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请额度,
	 */
	public Double getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请额度,
	 */
	public void setApplysum(Double value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 业务代码,023:预约申购
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,023:预约申购
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 资金来源,0:银行卡;1:现金宝
	 */
	public String getCapsource() {
		return this.capsource;
	}
	
	/**
	 * 资金来源,0:银行卡;1:现金宝
	 */
	public void setCapsource(String value)
	 {
		this.capsource = value;
	}
	
	/**
	 * 基金代码,调用Y002返回的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,调用Y002返回的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 收费方式,调用Y002返回的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,调用Y002返回的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,调用Y002返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用Y002返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 交易密码,用des进行加密传输，暂时传[ISNULL]
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,用des进行加密传输，暂时传[ISNULL]
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 业务大类,现金宝预约充值时，必须传01，对应的fundcode和sharetype必须是现金宝对应的基金代码和收费方式
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝预约充值时，必须传01，对应的fundcode和sharetype必须是现金宝对应的基金代码和收费方式
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 目标现金宝基金代码,当资金来源为现金宝时，该字段为指定的现金宝基金代码
	 */
	public String getBuyMoneyFundcode() {
		return this.buyMoneyFundcode;
	}
	
	/**
	 * 目标现金宝基金代码,当资金来源为现金宝时，该字段为指定的现金宝基金代码
	 */
	public void setBuyMoneyFundcode(String value)
	 {
		this.buyMoneyFundcode = value;
	}
	
	/**
	 * 目标现金宝基金收费方式,当资金来源为现金宝时，该字段为指定的现金宝基金收费方式
	 */
	public String getBuyMoneySharetype() {
		return this.buyMoneySharetype;
	}
	
	/**
	 * 目标现金宝基金收费方式,当资金来源为现金宝时，该字段为指定的现金宝基金收费方式
	 */
	public void setBuyMoneySharetype(String value)
	 {
		this.buyMoneySharetype = value;
	}
	
	/**
	 * 预约指数代码,
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 预约指数代码,
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 预约比较条件,
	 */
	public String getExponentflag() {
		return this.exponentflag;
	}
	
	/**
	 * 预约比较条件,
	 */
	public void setExponentflag(String value)
	 {
		this.exponentflag = value;
	}
	
	/**
	 * 预约点位,
	 */
	public Double getExponentvalue() {
		return this.exponentvalue;
	}
	
	/**
	 * 预约点位,
	 */
	public void setExponentvalue(Double value)
	 {
		this.exponentvalue = value;
	}
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 预约日期,
	 */
	public String getHopedate() {
		return this.hopedate;
	}
	
	/**
	 * 预约日期,
	 */
	public void setHopedate(String value)
	 {
		this.hopedate = value;
	}
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	public String getMintredeem() {
		return this.mintredeem;
	}
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	public void setMintredeem(String value)
	 {
		this.mintredeem = value;
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
	 * 活动代码,
	 */
	public String getPromotion() {
		return this.promotion;
	}
	
	/**
	 * 活动代码,
	 */
	public void setPromotion(String value)
	 {
		this.promotion = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applysum", this.formatDecimal(this.applysum));
		inputMap.put("businflag", this.businflag);
		inputMap.put("capsource", this.capsource);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("busintype", this.busintype);
		inputMap.put("buyMoneyFundcode", this.buyMoneyFundcode);
		inputMap.put("buyMoneySharetype", this.buyMoneySharetype);
		inputMap.put("exponentcode", this.exponentcode);
		inputMap.put("exponentflag", this.exponentflag);
		inputMap.put("exponentvalue", this.formatDecimal(this.exponentvalue));
		inputMap.put("exptype", this.exptype);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("hopedate", this.hopedate);
		inputMap.put("mintredeem", this.mintredeem);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("promotion", this.promotion);
	}
}
