package topdeep.commonfund.mg.entity.request;

import topdeep.common.mg.entity.request.PageRequest;
import topdeep.commonfund.entity.db.FundBindInfo;

public class BindInfoRequest extends PageRequest {

	
	private String searchKeyword;

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	private FundBindInfo bindInfo;

	public FundBindInfo getBindInfo() {
		return bindInfo;
	}

	public void setBindInfo(FundBindInfo bindInfo) {
		this.bindInfo = bindInfo;
	}
	
}
