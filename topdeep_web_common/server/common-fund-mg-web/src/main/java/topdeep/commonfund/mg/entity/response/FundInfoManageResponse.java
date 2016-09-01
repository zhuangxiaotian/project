package topdeep.commonfund.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.mg.entity.response.PageResponse;
import topdeep.commonfund.entity.db.FundFundInfo;
import topdeep.commonfund.entity.view.FundFundProperty;

public class FundInfoManageResponse extends PageResponse{

	private List<FundFundInfo> fundInfoList = new ArrayList<FundFundInfo>();

	private List<FundFundProperty> fundPropertyList = new ArrayList<FundFundProperty>();

	public List<FundFundInfo> getFundInfoList() {
		return fundInfoList;
	}

	public void setFundInfoList(List<FundFundInfo> fundInfoList) {
		this.fundInfoList = fundInfoList;
	}

	public List<FundFundProperty> getFundPropertyList() {
		return fundPropertyList;
	}

	public void setFundPropertyList(List<FundFundProperty> fundPropertyList) {
		this.fundPropertyList = fundPropertyList;
	}
	
}
