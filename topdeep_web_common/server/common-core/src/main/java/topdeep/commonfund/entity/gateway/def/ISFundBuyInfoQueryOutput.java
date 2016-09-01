package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金购买信息功能输出参数
 */
public class ISFundBuyInfoQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 首次申购下限,
	 */
	private Double firstMinAmount;
	
	/**
	 * 追加申购下限或者赎回下限,
	 */
	private Double appendMinAmount;
	
	/**
	 * 净值日期,
	 */
	private java.util.Date priceDate;
	
	/**
	 * 基金净值,
	 */
	private String netValue;
	
	/**
	 * 累计净值,
	 */
	private String totalNetValue;
	
	private List<ISFundTransactionsAccountDetail> detail = new ArrayList<ISFundTransactionsAccountDetail>();
	
	/**
	 * 开放交易日开始,
	 */
	private java.util.Date openTradeBegin;
	
	/**
	 * 开放交易日结束,
	 */
	private java.util.Date openTradeEnd;
	
	/**
	 * 风险等级是否匹配1匹配2不匹配0没有做过风险等级,
	 */
	private String riskLevelMatch;
	
	/**
	 * 风险登记不匹配的描述信息,
	 */
	private String riskDesc;
	
	public ISFundBuyInfoQueryOutput() {
		this.setZ_funcCode("u06");
	}
	
	/**
	 * 首次申购下限,
	 */
	public Double getFirstMinAmount() {
		return this.firstMinAmount;
	}
	
	/**
	 * 首次申购下限,
	 */
	public void setFirstMinAmount(Double value)
	 {
		this.firstMinAmount = value;
	}
	
	/**
	 * 追加申购下限或者赎回下限,
	 */
	public Double getAppendMinAmount() {
		return this.appendMinAmount;
	}
	
	/**
	 * 追加申购下限或者赎回下限,
	 */
	public void setAppendMinAmount(Double value)
	 {
		this.appendMinAmount = value;
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
	 * 基金净值,
	 */
	public String getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 基金净值,
	 */
	public void setNetValue(String value)
	 {
		this.netValue = value;
	}
	
	/**
	 * 累计净值,
	 */
	public String getTotalNetValue() {
		return this.totalNetValue;
	}
	
	/**
	 * 累计净值,
	 */
	public void setTotalNetValue(String value)
	 {
		this.totalNetValue = value;
	}
	
	public List<ISFundTransactionsAccountDetail> getDetail() {
		return this.detail;
	}
	
	
	/**
	 * 开放交易日开始,
	 */
	public java.util.Date getOpenTradeBegin() {
		return this.openTradeBegin;
	}
	
	/**
	 * 开放交易日开始,
	 */
	public void setOpenTradeBegin(java.util.Date value)
	 {
		this.openTradeBegin = value;
	}
	
	/**
	 * 开放交易日结束,
	 */
	public java.util.Date getOpenTradeEnd() {
		return this.openTradeEnd;
	}
	
	/**
	 * 开放交易日结束,
	 */
	public void setOpenTradeEnd(java.util.Date value)
	 {
		this.openTradeEnd = value;
	}
	
	/**
	 * 风险等级是否匹配1匹配2不匹配0没有做过风险等级,
	 */
	public String getRiskLevelMatch() {
		return this.riskLevelMatch;
	}
	
	/**
	 * 风险等级是否匹配1匹配2不匹配0没有做过风险等级,
	 */
	public void setRiskLevelMatch(String value)
	 {
		this.riskLevelMatch = value;
	}
	
	/**
	 * 风险登记不匹配的描述信息,
	 */
	public String getRiskDesc() {
		return this.riskDesc;
	}
	
	/**
	 * 风险登记不匹配的描述信息,
	 */
	public void setRiskDesc(String value)
	 {
		this.riskDesc = value;
	}
}
