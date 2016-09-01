package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金份额查询功能输出明细参数
 */
public class ISFundShareListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 交易账号,
	 */
	private String transactionAccount;
	
	/**
	 * 交易账号名称,
	 */
	private String transactionsName;
	
	/**
	 * 基金账号,
	 */
	private String fundAccount;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 基金名称,
	 */
	private String fundName;
	
	/**
	 * 份额类别,
	 */
	private String shareType;
	
	/**
	 * 当前份额余额,
	 */
	private Double currentShareBalance;
	
	/**
	 * 可用份额余额,
	 */
	private Double availableShareBalance;
	
	/**
	 * 冻结份额余额,
	 */
	private Double frozenShareBalance;
	
	/**
	 * 基金净值/万份收益,
	 */
	private Double netValue;
	
	/**
	 * 累计净值/年化收益,
	 */
	private Double totalNetValue;
	
	/**
	 * 净值日期,yyyyMMdd
	 */
	private String priceDate;
	
	/**
	 * 红利收益,
	 */
	private Double bonusIncome;
	
	/**
	 * 红股收益,
	 */
	private Double stockBonusIncome;
	
	/**
	 * 未分配收益,
	 */
	private Double unPayIncome;
	
	/**
	 * 未分配收益日期,
	 */
	private java.util.Date unPayIncomeDate;
	
	/**
	 * 分红方式,
	 */
	private String bonusType;
	
	/**
	 * 支持申购,
	 */
	private String supportPurchase;
	
	/**
	 * 支持赎回,
	 */
	private String supportRedeem;
	
	/**
	 * 支持转换,
	 */
	private String supportTransfer;
	
	/**
	 * 到期可用余额,
	 */
	private Double finalShareBalance;
	
	/**
	 * 快赎可用份额,
	 */
	private Double fastRedeemAvailableShare;
	
	/**
	 * 当日收益,
	 */
	private Double todayIncome;
	
	/**
	 * 累计收益,
	 */
	private Double totalIncome;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
	/**
	 * 基金市值,
	 */
	private Double marketvalue;
	
	/**
	 * 基金类别,
	 */
	private String fundType;
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 销售商编号,
	 */
	private String agencyno;
	
	/**
	 * 交易账号,
	 */
	public String getTransactionAccount() {
		return this.transactionAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTransactionAccount(String value)
	 {
		this.transactionAccount = value;
	}
	
	/**
	 * 交易账号名称,
	 */
	public String getTransactionsName() {
		return this.transactionsName;
	}
	
	/**
	 * 交易账号名称,
	 */
	public void setTransactionsName(String value)
	 {
		this.transactionsName = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
	
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
	 * 基金名称,
	 */
	public String getFundName() {
		return this.fundName;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundName(String value)
	 {
		this.fundName = value;
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
	 * 当前份额余额,
	 */
	public Double getCurrentShareBalance() {
		return this.currentShareBalance;
	}
	
	/**
	 * 当前份额余额,
	 */
	public void setCurrentShareBalance(Double value)
	 {
		this.currentShareBalance = value;
	}
	
	/**
	 * 可用份额余额,
	 */
	public Double getAvailableShareBalance() {
		return this.availableShareBalance;
	}
	
	/**
	 * 可用份额余额,
	 */
	public void setAvailableShareBalance(Double value)
	 {
		this.availableShareBalance = value;
	}
	
	/**
	 * 冻结份额余额,
	 */
	public Double getFrozenShareBalance() {
		return this.frozenShareBalance;
	}
	
	/**
	 * 冻结份额余额,
	 */
	public void setFrozenShareBalance(Double value)
	 {
		this.frozenShareBalance = value;
	}
	
	/**
	 * 基金净值/万份收益,
	 */
	public Double getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 基金净值/万份收益,
	 */
	public void setNetValue(Double value)
	 {
		this.netValue = value;
	}
	
	/**
	 * 累计净值/年化收益,
	 */
	public Double getTotalNetValue() {
		return this.totalNetValue;
	}
	
	/**
	 * 累计净值/年化收益,
	 */
	public void setTotalNetValue(Double value)
	 {
		this.totalNetValue = value;
	}
	
	/**
	 * 净值日期,yyyyMMdd
	 */
	public String getPriceDate() {
		return this.priceDate;
	}
	
	/**
	 * 净值日期,yyyyMMdd
	 */
	public void setPriceDate(String value)
	 {
		this.priceDate = value;
	}
	
	/**
	 * 红利收益,
	 */
	public Double getBonusIncome() {
		return this.bonusIncome;
	}
	
	/**
	 * 红利收益,
	 */
	public void setBonusIncome(Double value)
	 {
		this.bonusIncome = value;
	}
	
	/**
	 * 红股收益,
	 */
	public Double getStockBonusIncome() {
		return this.stockBonusIncome;
	}
	
	/**
	 * 红股收益,
	 */
	public void setStockBonusIncome(Double value)
	 {
		this.stockBonusIncome = value;
	}
	
	/**
	 * 未分配收益,
	 */
	public Double getUnPayIncome() {
		return this.unPayIncome;
	}
	
	/**
	 * 未分配收益,
	 */
	public void setUnPayIncome(Double value)
	 {
		this.unPayIncome = value;
	}
	
	/**
	 * 未分配收益日期,
	 */
	public java.util.Date getUnPayIncomeDate() {
		return this.unPayIncomeDate;
	}
	
	/**
	 * 未分配收益日期,
	 */
	public void setUnPayIncomeDate(java.util.Date value)
	 {
		this.unPayIncomeDate = value;
	}
	
	/**
	 * 分红方式,
	 */
	public String getBonusType() {
		return this.bonusType;
	}
	
	/**
	 * 分红方式,
	 */
	public void setBonusType(String value)
	 {
		this.bonusType = value;
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
	 * 支持转换,
	 */
	public String getSupportTransfer() {
		return this.supportTransfer;
	}
	
	/**
	 * 支持转换,
	 */
	public void setSupportTransfer(String value)
	 {
		this.supportTransfer = value;
	}
	
	/**
	 * 到期可用余额,
	 */
	public Double getFinalShareBalance() {
		return this.finalShareBalance;
	}
	
	/**
	 * 到期可用余额,
	 */
	public void setFinalShareBalance(Double value)
	 {
		this.finalShareBalance = value;
	}
	
	/**
	 * 快赎可用份额,
	 */
	public Double getFastRedeemAvailableShare() {
		return this.fastRedeemAvailableShare;
	}
	
	/**
	 * 快赎可用份额,
	 */
	public void setFastRedeemAvailableShare(Double value)
	 {
		this.fastRedeemAvailableShare = value;
	}
	
	/**
	 * 当日收益,
	 */
	public Double getTodayIncome() {
		return this.todayIncome;
	}
	
	/**
	 * 当日收益,
	 */
	public void setTodayIncome(Double value)
	 {
		this.todayIncome = value;
	}
	
	/**
	 * 累计收益,
	 */
	public Double getTotalIncome() {
		return this.totalIncome;
	}
	
	/**
	 * 累计收益,
	 */
	public void setTotalIncome(Double value)
	 {
		this.totalIncome = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankName() {
		return this.bankName;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankName(String value)
	 {
		this.bankName = value;
	}
	
	/**
	 * 基金市值,
	 */
	public Double getMarketvalue() {
		return this.marketvalue;
	}
	
	/**
	 * 基金市值,
	 */
	public void setMarketvalue(Double value)
	 {
		this.marketvalue = value;
	}
	
	/**
	 * 基金类别,
	 */
	public String getFundType() {
		return this.fundType;
	}
	
	/**
	 * 基金类别,
	 */
	public void setFundType(String value)
	 {
		this.fundType = value;
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
	 * 销售商编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
}
