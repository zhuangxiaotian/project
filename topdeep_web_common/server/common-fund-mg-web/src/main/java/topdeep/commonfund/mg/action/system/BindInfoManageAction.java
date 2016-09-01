package topdeep.commonfund.mg.action.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.dao.manage.client.impl.ManageClientDao;
import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.constant.BaseInfoType;
import topdeep.common.entity.constant.NameValue;
import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.entity.db.SystemBaseInfoExample;
import topdeep.common.entity.manage.def.MSUnbindCustomerInput;
import topdeep.common.entity.manage.def.MSUnbindCustomerOutput;
import topdeep.commonfund.entity.db.FundBindInfo;
import topdeep.commonfund.entity.db.FundBindInfoExample;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.EnumType.SiteType;
import topdeep.commonfund.mg.entity.request.BindInfoRequest;
import topdeep.commonfund.mg.entity.response.BindInfoResponse;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = "/system")
public class BindInfoManageAction extends BaseAction {

	@Autowired
	@Qualifier("manageClientDao")
	private ManageClientDao manageClientDao;

	@TopdeepMethodAttribute
	@RequestMapping("/bindInfoManage")
	public String execute(BindInfoRequest req, Model model) {
		BindInfoResponse res = new BindInfoResponse();
		model.addAttribute("res", res);
		checkPrivilege(res, FundPrivilegeConfig.FUNC_BIND_INFO_MANAGE, PrivilegeOperate.Read);
		res.setTitle("绑定信息管理");
		super.execute(req, res, false);
		if (res.isSuccess()) {
			return res.getTarget("/systemParam/bind-info-success");
		}
		return res.getTarget("/common/tip");
	}

	@TopdeepMethodAttribute
	@RequestMapping("/bindInfoManage!ajaxQuery")
	@ResponseBody
	public BindInfoResponse ajaxQuery(BindInfoRequest req) {
		BindInfoResponse res = new BindInfoResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_BIND_INFO_MANAGE, PrivilegeOperate.Read);
		res.setTitle("绑定信息查询");
		res.checkNull(req.getBindInfo(), "参数错误");
		super.execute(req, res, true);
		if (res.isSuccess()) {
			try {
				FundBindInfoExample condition = new FundBindInfoExample();
				String value = SiteType.WX.getValue();
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

	@TopdeepMethodAttribute
	@RequestMapping("/bindInfoManage!ajaxRemoveBind")
	@ResponseBody
	public BindInfoResponse ajaxRemoveBind(BindInfoRequest req) {
		BindInfoResponse res = new BindInfoResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_BIND_INFO_MANAGE, PrivilegeOperate.Audit);
		res.setTitle("解除绑定");
		res.checkNull(req.getBindInfo(), "参数错误");
		if (res.isSuccess()) {
			res.checkStringEmpty(req.getBindInfo().getBindSrc(), "来源参数为空");
			res.checkStringEmpty(req.getBindInfo().getOpenid(), "openid参数为空");
		}
		if (res.isSuccess()) {
			try {
				SystemBaseInfoExample baseInfoCondition = new SystemBaseInfoExample();
				baseInfoCondition.or().andCodeTypeEqualTo(BaseInfoType.MOBILE_MANAGE_ADDRESS);
				baseInfoCondition.setOrderByClause("CODE_ID asc");
				List<SystemBaseInfo> list = commonMgSystemBiz.systemBaseInfoSelectObjects(baseInfoCondition);
				for (SystemBaseInfo item : list) {
					FundBindInfoExample condition = new FundBindInfoExample();
					condition.or().andBindSrcEqualTo(req.getBindInfo().getBindSrc()).andOpenidEqualTo(req.getBindInfo().getOpenid());
					FundBindInfo bindInfo = commonMgSystemBiz.selectSingleObject(fundSystemBiz.fundBindInfoSelectObjects(condition));
					if (bindInfo != null) {
						logger.debug("=======ajaxUnbindCustomer.Target=" + bindInfo.getOpenid());
						MSUnbindCustomerInput inputParam = new MSUnbindCustomerInput();
						inputParam.setServerUrl(item.getCodeName());
						inputParam.setIdType(bindInfo.getIdType());
						inputParam.setIdNo(bindInfo.getIdNo());
						inputParam.setBindSrc(bindInfo.getBindSrc());
						MSUnbindCustomerOutput outputParam = manageClientDao.unbindCustomer(inputParam);
						if ("0000".equals(outputParam.getCode())) {
							bindInfo.setBindFlag("0");
							fundSystemBiz.fundBindInfoUpdate(bindInfo);
							res.setResult(true, "解除绑定成功");
							// 解绑成功后 发送微信模板消息
							break;
						} else {
							res.setResult(false, bindInfo.getOpenid() + ":" + outputParam.getMsg());
						}
					}
				}

			} catch (Exception e) {
				logger.error("ajaxUnbindCustomer!error", e);
				res.setResult(false, "解绑失败");
			}
		}
		return res;
	}

}
