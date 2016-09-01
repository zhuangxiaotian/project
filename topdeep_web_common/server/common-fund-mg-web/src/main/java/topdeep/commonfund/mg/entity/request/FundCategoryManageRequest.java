package topdeep.commonfund.mg.entity.request;

import topdeep.common.mg.entity.request.PageRequest;
import topdeep.commonfund.entity.db.FundFundCatagoryFundRela;
import topdeep.commonfund.entity.db.FundFundCategory;
import topdeep.commonfund.mg.entity.response.FundCategoryManageResponse;

public class FundCategoryManageRequest extends PageRequest {

	private FundFundCategory fundCategory;

	private FundFundCatagoryFundRela fundCatagoryFundRela;

	private String searchKeyword;

	private String ids;

	private String auditState;

	private String moveOprate;

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public FundFundCategory getFundCategory() {
		return fundCategory;
	}

	public void setFundCategory(FundFundCategory fundCategory) {
		this.fundCategory = fundCategory;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public String getAuditState() {
		return auditState;
	}

	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}

	public void checkSetAuditStateInput(FundCategoryManageResponse res) {
		res.checkStringEmpty(ids, "未选择项");
		res.checkStringEmpty(auditState, "审核状态为空");
	}

	public FundFundCatagoryFundRela getFundCatagoryFundRela() {
		return fundCatagoryFundRela;
	}

	public void setFundCatagoryFundRela(FundFundCatagoryFundRela fundCatagoryFundRela) {
		this.fundCatagoryFundRela = fundCatagoryFundRela;
	}

	public String getMoveOprate() {
		return moveOprate;
	}

	public void setMoveOprate(String moveOprate) {
		this.moveOprate = moveOprate;
	}

}
