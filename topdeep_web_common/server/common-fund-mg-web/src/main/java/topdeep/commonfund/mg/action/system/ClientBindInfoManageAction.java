package topdeep.commonfund.mg.action.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.constant.NameValue;
import topdeep.commonfund.entity.db.FundBindInfo;
import topdeep.commonfund.entity.db.FundBindInfoExample;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.EnumType.SiteType;
import topdeep.commonfund.mg.entity.request.BindInfoRequest;
import topdeep.commonfund.mg.entity.response.BindInfoResponse;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = "/system")
public class ClientBindInfoManageAction extends BaseAction {

	@TopdeepMethodAttribute
	@RequestMapping("/clientBindInfoManage")
	public String execute(BindInfoRequest req, Model model) {
		BindInfoResponse res = new BindInfoResponse();
		model.addAttribute("res", res);
		res.setTitle("绑定查询");
		super.execute(req, res, false);
		if (res.isSuccess()) {
			return res.getTarget("/systemParam/client-bind-info-success");
		}
		return res.getTarget("/common/tip");
	}

	@TopdeepMethodAttribute
	@RequestMapping("/clientBindInfoManage!ajaxQuery")
	@ResponseBody
	public BindInfoResponse ajaxQuery(BindInfoRequest req) {
		BindInfoResponse res = new BindInfoResponse();
		res.setTitle("绑定信息查询");
		res.checkNull(req.getBindInfo(), "参数错误");
		super.execute(req, res, true);
		if (res.isSuccess()) {
			try {
				FundBindInfoExample condition = new FundBindInfoExample();
				String value = SiteType.App.getValue();
				if (StringUtils.isNullOrEmpty(req.getBindInfo().getBindFlag())) {
					if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
						condition.or().andCustNameLike("%" + req.getSearchKeyword() + "%").andBindSrcEqualTo(value);
						condition.or().andIdNoLike("%" + req.getSearchKeyword() + "%").andBindSrcEqualTo(value);
						condition.or().andMobilePhoneLike("%" + req.getSearchKeyword() + "%").andBindSrcEqualTo(value);
						condition.or().andOpenidLike("%" + req.getSearchKeyword() + "%").andBindSrcEqualTo(value);
					} else {
						condition.or().andBindSrcEqualTo(value);
					}
				} else {
					condition.or().andBindFlagEqualTo(req.getBindInfo().getBindFlag()).andBindSrcEqualTo(value);
				}
				condition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				List<FundBindInfo> bindInfos = fundSystemBiz.fundBindInfoSelectObjects(condition);
				int count = fundSystemBiz.fundBindInfoQuerySelectObjectsCount(condition);
				if (count > 0) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				List<NameValue> bindSrc = new ArrayList<NameValue>();
				SiteType[] bindArr = SiteType.values();
				for (SiteType siteType : bindArr) {
					bindSrc.add(new NameValue(siteType.getName(), siteType.getValue()));
				}
				res.setBindSrc(bindSrc);
				res.setBindInfos(bindInfos);
				res.setResult(true, "查询成功");
			} catch (Exception e) {
				logger.error("ajaxQuery!error", e);
				res.setResult(false, "查询绑定信息失败" + e.getMessage());
			}
		}

		return res;
	}

}
