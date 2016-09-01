package topdeep.commonfund.mg.entity.request;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.mg.entity.request.PageRequest;
import topdeep.commonfund.entity.db.FundFundInfo;
import topdeep.commonfund.entity.view.FundFundProperty;
import topdeep.commonfund.mg.entity.response.FundInfoManageResponse;

public class FundInfoManageRequest extends PageRequest {

	private FundFundInfo fundInfo;

	private String searchKeyword;

	private String ids;

	private String auditState;

	private List<FundFundProperty> fundPropertyList = new ArrayList<FundFundProperty>();

	public FundFundInfo getFundInfo() {
		return fundInfo;
	}

	public void setFundInfo(FundFundInfo fundInfo) {
		this.fundInfo = fundInfo;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public void checkInputId(FundInfoManageResponse res) {
		res.checkStringEmpty(fundInfo.getFundCode(), "基金代码不能为空");
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getAuditState() {
		return auditState;
	}

	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}

	public void checkSetAuditStateInput(FundInfoManageResponse res) {
		res.checkStringEmpty(ids, "未选择项");
		res.checkStringEmpty(auditState, "审核状态为空");

	}

	public List<FundFundProperty> getFundPropertyList() {
		return fundPropertyList;
	}

	public void setFundPropertyList(List<FundFundProperty> fundPropertyList) {
		this.fundPropertyList = fundPropertyList;
	}

}
