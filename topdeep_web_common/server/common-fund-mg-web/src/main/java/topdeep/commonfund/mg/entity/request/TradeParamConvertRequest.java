package topdeep.commonfund.mg.entity.request;

import topdeep.common.mg.entity.request.PageRequest;
import topdeep.commonfund.entity.db.FundTradeParamConvert;
import topdeep.commonfund.mg.entity.response.TradeParamConvertResponse;

public class TradeParamConvertRequest extends PageRequest {

	private FundTradeParamConvert tradeParamConvert;

	private String searchKeyword;

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public FundTradeParamConvert getTradeParamConvert() {
		return tradeParamConvert;
	}

	public void setTradeParamConvert(FundTradeParamConvert tradeParamConvert) {
		this.tradeParamConvert = tradeParamConvert;
	}

	public void checkInputId(TradeParamConvertResponse res) {
		res.checkStringEmpty(tradeParamConvert.getId(), "交易参数Id不能为空");
	}

	public void checkInputEdit(TradeParamConvertResponse res) {
		res.checkStringEmpty(tradeParamConvert.getBankNo(), "银行代码不能为空");
		res.checkStringEmpty(tradeParamConvert.getBankValue(), "银行值不能为空");
		res.checkStringEmpty(tradeParamConvert.getLocalValue(), "本地值不能为空");
		res.checkStringEmpty(tradeParamConvert.getPaySeatNo(), "支付渠道代码不能为空");
		res.checkStringEmpty(tradeParamConvert.getSeatNo(), "席位号不能为空");
		res.checkStringEmpty(tradeParamConvert.getParamType(), "参数类型没有选择");
	}
}
