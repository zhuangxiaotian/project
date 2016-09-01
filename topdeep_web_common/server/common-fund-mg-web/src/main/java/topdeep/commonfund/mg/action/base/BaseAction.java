package topdeep.commonfund.mg.action.base;

import org.springframework.beans.factory.annotation.Autowired;

import topdeep.common.mg.entity.request.BaseRequest;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.commonfund.mg.biz.common.impl.CommonFundMgSystemBiz;

public class BaseAction extends topdeep.common.mg.action.base.BaseAction {

	@Autowired
	protected CommonFundMgSystemBiz fundSystemBiz;

	public boolean execute(BaseRequest req, BaseResponse res) {

		boolean b = execute(req, res, false);
		res.setVersion("" + new java.util.Date().getTime());
		return b;
	}

	protected String getSkin() {
		return commonMgSystemParamBiz.getCommonMgApplicationParam().getSkin();
	}

	public CommonFundMgSystemBiz getFundSystemBiz() {
		return fundSystemBiz;
	}

	public void setFundSystemBiz(CommonFundMgSystemBiz fundSystemBiz) {
		this.fundSystemBiz = fundSystemBiz;
	}

}
