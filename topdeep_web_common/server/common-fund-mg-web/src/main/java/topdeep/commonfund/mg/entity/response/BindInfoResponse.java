package topdeep.commonfund.mg.entity.response;

import java.util.List;

import topdeep.common.entity.constant.NameValue;
import topdeep.common.mg.entity.response.PageResponse;
import topdeep.commonfund.entity.db.FundBindInfo;

public class BindInfoResponse extends PageResponse {

	private List<FundBindInfo> bindInfos;

	private List<NameValue> bindSrc;

	public List<FundBindInfo> getBindInfos() {
		return bindInfos;
	}

	public void setBindInfos(List<FundBindInfo> bindInfos) {
		this.bindInfos = bindInfos;
	}

	public List<NameValue> getBindSrc() {
		return bindSrc;
	}

	public void setBindSrc(List<NameValue> bindSrc) {
		this.bindSrc = bindSrc;
	}

}
