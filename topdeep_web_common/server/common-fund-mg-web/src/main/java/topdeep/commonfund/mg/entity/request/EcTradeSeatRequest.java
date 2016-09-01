package topdeep.commonfund.mg.entity.request;

import java.text.ParseException;
import java.util.Date;

import topdeep.common.mg.entity.request.PageRequest;
import topdeep.commonfund.entity.db.FundEcTradeSeat;
import topdeep.commonfund.mg.entity.response.EcTradeSeatResponse;
import common.util.StringUtils;

public class EcTradeSeatRequest extends PageRequest {

	private FundEcTradeSeat ecTradeSeat;

	private String searchKeyword;

	private String orderField;

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public FundEcTradeSeat getEcTradeSeat() {
		return ecTradeSeat;
	}

	public void setEcTradeSeat(FundEcTradeSeat ecTradeSeat) {
		this.ecTradeSeat = ecTradeSeat;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public void checkInputId(EcTradeSeatResponse res) {
		res.checkStringEmpty(ecTradeSeat.getId(), "直销交易渠道管理Id不能为空");
	}

	public void checkInputEdit(EcTradeSeatResponse res) {
		res.checkStringEmpty(ecTradeSeat.getPaySeatNo(), "支付渠道代码不能为空");
		res.checkStringEmpty(ecTradeSeat.getPaySeatName(), "支付渠道名称不能为空");
		res.checkStringEmpty(ecTradeSeat.getBankNo(), "银行代码不能为空");
		res.checkStringEmpty(ecTradeSeat.getBankName(), "银行名称不能为空");
		res.checkStringEmpty(ecTradeSeat.getSeatNo(), "渠道代码不能为空");
		res.checkStringEmpty(ecTradeSeat.getSeatName(), "渠道名称不能为空");
		res.checkStringEmpty(ecTradeSeat.getSeatState(), "渠道状态不能为空");
		res.checkStringEmpty(ecTradeSeat.getFinatype(), "资金方式不能为空");
		if (StringUtils.isNullOrEmpty(orderField)) {
			ecTradeSeat.setOrderField(new Date());
		} else {
			try {
				ecTradeSeat.setOrderField(StringUtils.stringToDate(orderField, "yyyy-MM-dd HH:mm:ss"));
			} catch (ParseException e) {
				ecTradeSeat.setOrderField(new Date());
			}
		}

	}
}
