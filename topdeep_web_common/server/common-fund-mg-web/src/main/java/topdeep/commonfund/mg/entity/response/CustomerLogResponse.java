package topdeep.commonfund.mg.entity.response;

import java.util.List;

import topdeep.common.mg.entity.response.PageResponse;
import topdeep.commonfund.entity.db.FundCustomerLog;

public class CustomerLogResponse extends PageResponse {

	/**
	 * 一个月前
	 */
	private String onTime;
	/**
	 * 当前时间
	 */
	private String nowTime;

	private String refereeNum;

	private String refereeAmount;

	private List<FundCustomerLog> customerLogs;

	private List<String> sList;

	public List<FundCustomerLog> getCustomerLogs() {
		return customerLogs;
	}

	public void setCustomerLogs(List<FundCustomerLog> customerLogs) {
		this.customerLogs = customerLogs;
	}

	public String getOnTime() {
		return onTime;
	}

	public void setOnTime(String onTime) {
		this.onTime = onTime;
	}

	public String getNowTime() {
		return nowTime;
	}

	public void setNowTime(String nowTime) {
		this.nowTime = nowTime;
	}

	public List<String> getsList() {
		return sList;
	}

	public void setsList(List<String> sList) {
		this.sList = sList;
	}

	public String getRefereeNum() {
		return refereeNum;
	}

	public void setRefereeNum(String refereeNum) {
		this.refereeNum = refereeNum;
	}

	public String getRefereeAmount() {
		return refereeAmount;
	}

	public void setRefereeAmount(String refereeAmount) {
		this.refereeAmount = refereeAmount;
	}
	
}
