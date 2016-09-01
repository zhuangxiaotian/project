package topdeep.commonfund.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.mg.entity.response.PageResponse;
import topdeep.commonfund.entity.db.FundFundCategory;
import topdeep.commonfund.entity.db.VFundFundCategoryFund;


public class FundCategoryManageResponse extends PageResponse{

	private List<FundFundCategory> fundCategoryList = new ArrayList<FundFundCategory>();

	private List<VFundFundCategoryFund> fundCategoryFundList = new ArrayList<VFundFundCategoryFund>();

	public List<FundFundCategory> getFundCategoryList() {
		return fundCategoryList;
	}

	public void setFundCategoryList(List<FundFundCategory> fundCategoryList) {
		this.fundCategoryList = fundCategoryList;
	}

	public List<VFundFundCategoryFund> getFundCategoryFundList() {
		return fundCategoryFundList;
	}

	public void setFundCategoryFundList(List<VFundFundCategoryFund> fundCategoryFundList) {
		this.fundCategoryFundList = fundCategoryFundList;
	}
	
}
