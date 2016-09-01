package topdeep.commonfund.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.mg.entity.response.PageResponse;
import topdeep.commonfund.entity.db.FundCustMessage;

public class NoticeResponse extends PageResponse {

	List<FundCustMessage> fundCustMessageList = new ArrayList<FundCustMessage>();

	public List<FundCustMessage> getFundCustMessageList() {
		return fundCustMessageList;
	}

	public void setFundCustMessageList(List<FundCustMessage> fundCustMessageList) {
		this.fundCustMessageList = fundCustMessageList;
	}

}
