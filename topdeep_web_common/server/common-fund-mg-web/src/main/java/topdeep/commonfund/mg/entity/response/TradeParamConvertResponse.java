package topdeep.commonfund.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.entity.constant.NameValue;
import topdeep.common.mg.entity.response.PageResponse;
import topdeep.commonfund.entity.db.FundTradeParamConvert;
import topdeep.commonfund.mg.entity.TradeParamType;

public class TradeParamConvertResponse extends PageResponse {

	private List<FundTradeParamConvert> tradeParamConvertList = new ArrayList<FundTradeParamConvert>();

	private List<NameValue> typeList = new ArrayList<NameValue>();

	private List<TradeParamType> paramTypeList = new ArrayList<TradeParamType>();

	private String id;

	private Integer rowVersion;

	public Integer getRowVersion() {
		return rowVersion;
	}

	public void setRowVersion(Integer rowVersion) {
		this.rowVersion = rowVersion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<NameValue> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<NameValue> typeList) {
		this.typeList = typeList;
	}

	public List<TradeParamType> getParamTypeList() {
		return paramTypeList;
	}

	public void setParamTypeList(List<TradeParamType> paramTypeList) {
		this.paramTypeList = paramTypeList;
	}

	public List<FundTradeParamConvert> getTradeParamConvertList() {
		return tradeParamConvertList;
	}

	public void setTradeParamConvertList(List<FundTradeParamConvert> tradeParamConvertList) {
		this.tradeParamConvertList = tradeParamConvertList;
	}

}
