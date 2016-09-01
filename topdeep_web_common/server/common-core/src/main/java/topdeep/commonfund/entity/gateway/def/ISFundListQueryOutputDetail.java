package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金列表功能输出明细参数
 */
public class ISFundListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 基金简称,
	 */
	private String fundName;
	
	/**
	 * 所属TA代码,
	 */
	private String tacode;
	
	/**
	 * 份额类别,
	 */
	private String shareType;
	
	/**
	 * 基金风险级别,
	 */
	private String riskLevel;
	
	/**
	 * 基金类型,
	 */
	private String fundType;
	
	/**
	 * 基金分组,
	 */
	private String fundGroup;
	
	/**
	 * 基金分组名称,
	 */
	private String fundGroupName;
	
	/**
	 * 小数位置,
	 */
	private Integer decimalLength;
	
	/**
	 * 是否货币基金,
	 */
	private String isMoneyFund;
	
	/**
	 * 币种,
	 */
	private String currency;
	
	/**
	 * 支持申购,
	 */
	private String supportPurchase;
	
	/**
	 * 支持赎回,
	 */
	private String supportRedeem;
	
	/**
	 * 支持定投,
	 */
	private String supportFixed;
	
	/**
	 * 单位净值/万份收益,
	 */
	private String netValue;
	
	/**
	 * 累计净值/七日年化,
	 */
	private String totalNetValue;
	
	/**
	 * 万份基金单位收益,
	 */
	private Double hf_incomeratio;
	
	/**
	 * 净值日期,
	 */
	private java.util.Date priceDate;
	
	/**
	 * 涨跌幅,
	 */
	private Double changeRate;
	
	/**
	 * 基金收益率,
	 */
	private Double incomeratio;
	
	/**
	 * 基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 基金简称,
	 */
	public String getFundName() {
		return this.fundName;
	}
	
	/**
	 * 基金简称,
	 */
	public void setFundName(String value)
	 {
		this.fundName = value;
	}
	
	/**
	 * 所属TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * 所属TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 份额类别,
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 基金风险级别,
	 */
	public String getRiskLevel() {
		return this.riskLevel;
	}
	
	/**
	 * 基金风险级别,
	 */
	public void setRiskLevel(String value)
	 {
		this.riskLevel = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getFundType() {
		return this.fundType;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundType(String value)
	 {
		this.fundType = value;
	}
	
	/**
	 * 基金分组,
	 */
	public String getFundGroup() {
		return this.fundGroup;
	}
	
	/**
	 * 基金分组,
	 */
	public void setFundGroup(String value)
	 {
		this.fundGroup = value;
	}
	
	/**
	 * 基金分组名称,
	 */
	public String getFundGroupName() {
		return this.fundGroupName;
	}
	
	/**
	 * 基金分组名称,
	 */
	public void setFundGroupName(String value)
	 {
		this.fundGroupName = value;
	}
	
	/**
	 * 小数位置,
	 */
	public Integer getDecimalLength() {
		return this.decimalLength;
	}
	
	/**
	 * 小数位置,
	 */
	public void setDecimalLength(Integer value)
	 {
		this.decimalLength = value;
	}
	
	/**
	 * 是否货币基金,
	 */
	public String getIsMoneyFund() {
		return this.isMoneyFund;
	}
	
	/**
	 * 是否货币基金,
	 */
	public void setIsMoneyFund(String value)
	 {
		this.isMoneyFund = value;
	}
	
	/**
	 * 币种,
	 */
	public String getCurrency() {
		return this.currency;
	}
	
	/**
	 * 币种,
	 */
	public void setCurrency(String value)
	 {
		this.currency = value;
	}
	
	/**
	 * 支持申购,
	 */
	public String getSupportPurchase() {
		return this.supportPurchase;
	}
	
	/**
	 * 支持申购,
	 */
	public void setSupportPurchase(String value)
	 {
		this.supportPurchase = value;
	}
	
	/**
	 * 支持赎回,
	 */
	public String getSupportRedeem() {
		return this.supportRedeem;
	}
	
	/**
	 * 支持赎回,
	 */
	public void setSupportRedeem(String value)
	 {
		this.supportRedeem = value;
	}
	
	/**
	 * 支持定投,
	 */
	public String getSupportFixed() {
		return this.supportFixed;
	}
	
	/**
	 * 支持定投,
	 */
	public void setSupportFixed(String value)
	 {
		this.supportFixed = value;
	}
	
	/**
	 * 单位净值/万份收益,
	 */
	public String getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 单位净值/万份收益,
	 */
	public void setNetValue(String value)
	 {
		this.netValue = value;
	}
	
	/**
	 * 累计净值/七日年化,
	 */
	public String getTotalNetValue() {
		return this.totalNetValue;
	}
	
	/**
	 * 累计净值/七日年化,
	 */
	public void setTotalNetValue(String value)
	 {
		this.totalNetValue = value;
	}
	
	/**
	 * 万份基金单位收益,
	 */
	public Double getHf_incomeratio() {
		return this.hf_incomeratio;
	}
	
	/**
	 * 万份基金单位收益,
	 */
	public void setHf_incomeratio(Double value)
	 {
		this.hf_incomeratio = value;
	}
	
	/**
	 * 净值日期,
	 */
	public java.util.Date getPriceDate() {
		return this.priceDate;
	}
	
	/**
	 * 净值日期,
	 */
	public void setPriceDate(java.util.Date value)
	 {
		this.priceDate = value;
	}
	
	/**
	 * 涨跌幅,
	 */
	public Double getChangeRate() {
		return this.changeRate;
	}
	
	/**
	 * 涨跌幅,
	 */
	public void setChangeRate(Double value)
	 {
		this.changeRate = value;
	}
	
	/**
	 * 基金收益率,
	 */
	public Double getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 基金收益率,
	 */
	public void setIncomeratio(Double value)
	 {
		this.incomeratio = value;
	}
}
