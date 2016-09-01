package topdeep.commonfund.mg.entity.request;

import topdeep.common.mg.entity.request.PageRequest;
import topdeep.commonfund.entity.db.FundCustomerLog;


public class CustomerLogRequest extends PageRequest {
	private FundCustomerLog customerLog;
	
	private String startDate;

	private String endDate;

	/**
	 * 推荐人
	 */
	private String refereeName;
	/**
	 * 客户类型
	 */
	private String customerType;
	/**
	 * 推荐交易
	 */
	private String refereeTrade;
	/**
	 * 交易日期
	 */
	private String tradeDate;
	/**
	 * 交易证件类型
	 */
	private String idType;
	/**
	 * 交易证件号码
	 */
	private String idNo;
	/**
	 * 交易来源
	 */
	private String tradeSource;

	public FundCustomerLog getCustomerLog() {
		return customerLog;
	}

	public void setCustomerLog(FundCustomerLog customerLog) {
		this.customerLog = customerLog;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getRefereeTrade() {
		return refereeTrade;
	}

	public void setRefereeTrade(String refereeTrade) {
		this.refereeTrade = refereeTrade;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getRefereeName() {
		return refereeName;
	}

	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getTradeSource() {
		return tradeSource;
	}

	public void setTradeSource(String tradeSource) {
		this.tradeSource = tradeSource;
	}
	
}
