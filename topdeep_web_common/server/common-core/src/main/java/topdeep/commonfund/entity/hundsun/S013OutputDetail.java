package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 浮动盈亏查询(S013)功能输出明细参数
 */
public class S013OutputDetail extends Object implements Serializable {
	
	/**
	 * 期初市值,
	 */
	private Double beginMarketValue;
	
	/**
	 * 期间内现金分红,
	 */
	private Double cashDividend;
	
	/**
	 * 期末市值,
	 */
	private Double endMarketValue;
	
	/**
	 * 强减份额,
	 */
	private Double forceDecreaseShare;
	
	/**
	 * 强增份额,
	 */
	private Double forceIncreaseShare;
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 手续费,
	 */
	private Double handlingCharges;
	
	/**
	 * 本期收益,
	 */
	private Double income;
	
	/**
	 * 本期收益率,
	 */
	private Double incomeRate;
	
	/**
	 * 非交易过户转入确认金额,
	 */
	private Double nonTransferInBalance;
	
	/**
	 * 非交易过户转出确认金额,
	 */
	private Double nonTransferOutBalance;
	
	/**
	 * 赎回确认金额,
	 */
	private Double redeemBalance;
	
	/**
	 * 投资所得,赎回、基金转换出,
	 */
	private Double redemptionOrTransferOut;
	
	/**
	 * 认购、申购、定期定额申购,
	 */
	private Double subscriptionOrPurchase;
	
	/**
	 * 期间内基金转换入确认金额,
	 */
	private Double transferIn;
	
	/**
	 * 基金转出确认金额,
	 */
	private Double transferOutBalance;
	
	/**
	 * 总成本,
	 */
	private String totalCost = "";
	
	/**
	 * 总收益,
	 */
	private String totalIncome = "";
	
	/**
	 * 销售商代码,
	 */
	private String agencyno = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 期初市值,
	 */
	public Double getBeginMarketValue() {
		return this.beginMarketValue;
	}
	
	/**
	 * 期初市值,
	 */
	public void setBeginMarketValue(Double value)
	 {
		this.beginMarketValue = value;
	}
	
	/**
	 * 期间内现金分红,
	 */
	public Double getCashDividend() {
		return this.cashDividend;
	}
	
	/**
	 * 期间内现金分红,
	 */
	public void setCashDividend(Double value)
	 {
		this.cashDividend = value;
	}
	
	/**
	 * 期末市值,
	 */
	public Double getEndMarketValue() {
		return this.endMarketValue;
	}
	
	/**
	 * 期末市值,
	 */
	public void setEndMarketValue(Double value)
	 {
		this.endMarketValue = value;
	}
	
	/**
	 * 强减份额,
	 */
	public Double getForceDecreaseShare() {
		return this.forceDecreaseShare;
	}
	
	/**
	 * 强减份额,
	 */
	public void setForceDecreaseShare(Double value)
	 {
		this.forceDecreaseShare = value;
	}
	
	/**
	 * 强增份额,
	 */
	public Double getForceIncreaseShare() {
		return this.forceIncreaseShare;
	}
	
	/**
	 * 强增份额,
	 */
	public void setForceIncreaseShare(Double value)
	 {
		this.forceIncreaseShare = value;
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
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 手续费,
	 */
	public Double getHandlingCharges() {
		return this.handlingCharges;
	}
	
	/**
	 * 手续费,
	 */
	public void setHandlingCharges(Double value)
	 {
		this.handlingCharges = value;
	}
	
	/**
	 * 本期收益,
	 */
	public Double getIncome() {
		return this.income;
	}
	
	/**
	 * 本期收益,
	 */
	public void setIncome(Double value)
	 {
		this.income = value;
	}
	
	/**
	 * 本期收益率,
	 */
	public Double getIncomeRate() {
		return this.incomeRate;
	}
	
	/**
	 * 本期收益率,
	 */
	public void setIncomeRate(Double value)
	 {
		this.incomeRate = value;
	}
	
	/**
	 * 非交易过户转入确认金额,
	 */
	public Double getNonTransferInBalance() {
		return this.nonTransferInBalance;
	}
	
	/**
	 * 非交易过户转入确认金额,
	 */
	public void setNonTransferInBalance(Double value)
	 {
		this.nonTransferInBalance = value;
	}
	
	/**
	 * 非交易过户转出确认金额,
	 */
	public Double getNonTransferOutBalance() {
		return this.nonTransferOutBalance;
	}
	
	/**
	 * 非交易过户转出确认金额,
	 */
	public void setNonTransferOutBalance(Double value)
	 {
		this.nonTransferOutBalance = value;
	}
	
	/**
	 * 赎回确认金额,
	 */
	public Double getRedeemBalance() {
		return this.redeemBalance;
	}
	
	/**
	 * 赎回确认金额,
	 */
	public void setRedeemBalance(Double value)
	 {
		this.redeemBalance = value;
	}
	
	/**
	 * 投资所得,赎回、基金转换出,
	 */
	public Double getRedemptionOrTransferOut() {
		return this.redemptionOrTransferOut;
	}
	
	/**
	 * 投资所得,赎回、基金转换出,
	 */
	public void setRedemptionOrTransferOut(Double value)
	 {
		this.redemptionOrTransferOut = value;
	}
	
	/**
	 * 认购、申购、定期定额申购,
	 */
	public Double getSubscriptionOrPurchase() {
		return this.subscriptionOrPurchase;
	}
	
	/**
	 * 认购、申购、定期定额申购,
	 */
	public void setSubscriptionOrPurchase(Double value)
	 {
		this.subscriptionOrPurchase = value;
	}
	
	/**
	 * 期间内基金转换入确认金额,
	 */
	public Double getTransferIn() {
		return this.transferIn;
	}
	
	/**
	 * 期间内基金转换入确认金额,
	 */
	public void setTransferIn(Double value)
	 {
		this.transferIn = value;
	}
	
	/**
	 * 基金转出确认金额,
	 */
	public Double getTransferOutBalance() {
		return this.transferOutBalance;
	}
	
	/**
	 * 基金转出确认金额,
	 */
	public void setTransferOutBalance(Double value)
	 {
		this.transferOutBalance = value;
	}
	
	/**
	 * 总成本,
	 */
	public String getTotalCost() {
		return this.totalCost;
	}
	
	/**
	 * 总成本,
	 */
	public void setTotalCost(String value)
	 {
		this.totalCost = value;
	}
	
	/**
	 * 总收益,
	 */
	public String getTotalIncome() {
		return this.totalIncome;
	}
	
	/**
	 * 总收益,
	 */
	public void setTotalIncome(String value)
	 {
		this.totalIncome = value;
	}
	
	/**
	 * 销售商代码,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
}
