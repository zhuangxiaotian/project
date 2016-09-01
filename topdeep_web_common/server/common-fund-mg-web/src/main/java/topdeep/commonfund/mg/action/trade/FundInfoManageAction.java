package topdeep.commonfund.mg.action.trade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.commonfund.entity.db.FundFundCatagoryFundRelaExample;
import topdeep.commonfund.entity.db.FundFundInfo;
import topdeep.commonfund.entity.db.FundFundInfoExample;
import topdeep.commonfund.entity.db.FundFundPropertyExample;
import topdeep.commonfund.entity.view.FundFundProperty;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.EnumType;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.request.FundInfoManageRequest;
import topdeep.commonfund.mg.entity.response.FundInfoManageResponse;
import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = {
	"/trade"
})
public class FundInfoManageAction extends BaseAction {

	/*
	 * 基金信息跳转页面
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundInfoManage")
	public String execute(FundInfoManageRequest req, Model model) {
		FundInfoManageResponse res = new FundInfoManageResponse();
		super.execute(req, res);
		checkPrivilege(res, FundPrivilegeConfig.FUNC_INFO_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		List<FundFundProperty> fundPropertyList = new ArrayList<FundFundProperty>();
		for (EnumType.FundFundProperty i : EnumType.FundFundProperty.values()) {
			FundFundProperty fundProperty = new FundFundProperty();
			fundProperty.setPropertyName(i.getName());
			fundProperty.setPropertyType(i.getValue());
			fundPropertyList.add(fundProperty);
		}
		res.setFundPropertyList(fundPropertyList);
		model.addAttribute("res", res);
		return res.getTarget("/trade/fund-info-success");
	}

	/*
	 * ajax基金信息查询
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundInfoManage!ajaxQuery")
	@ResponseBody
	public FundInfoManageResponse ajaxQuery(FundInfoManageRequest req) {
		FundInfoManageResponse res = new FundInfoManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_INFO_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			FundFundInfoExample example = new FundFundInfoExample();
			boolean isEmpty = StringUtils.isNullOrEmpty(req.getSearchKeyword());
			if (!isEmpty) {
				example.or().andFundCodeLike("%" + req.getSearchKeyword() + "%");
				example.or().andFundFullNameLike("%" + req.getSearchKeyword() + "%");
				example.or().andFundNameLike("%" + req.getSearchKeyword() + "%");
			}
			List<FundFundInfo> fundInfoList = null;
			example.setOrderByClause("CREATE_TIME desc");
			example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
			try {
				fundInfoList = fundSystemBiz.fundFundInfoSelectObjects(example);
				int count = fundSystemBiz.fundFundInfoQuerySelectObjectsCount(example);
				if (!fundInfoList.isEmpty()) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setFundInfoList(fundInfoList);
				res.setSuccess(true);
				res.setTitle("基金信息查询");
			} catch (CacheException e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "基金信息查询失败");
			}
		}
		return res;
	}

	/*
	 * ajax基金信息修改
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundInfoManage!ajaxSave")
	@ResponseBody
	public FundInfoManageResponse ajaxSave(FundInfoManageRequest req) {
		FundInfoManageResponse res = new FundInfoManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_INFO_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		boolean isEmpty = false;
		if (res.isSuccess()) {
			try {
				FundFundInfo fundInfo = fundSystemBiz.fundFundInfoSelectByPrimaryKey(req.getFundInfo().getFundCode());
				if (fundInfo == null) {
					isEmpty = true;
				}
				if (fundInfo == null) {
					fundInfo = new FundFundInfo();
					fundInfo.setRowVersion(0);
					fundInfo.setAuditState("0");
					fundInfo.setFundCode(req.getFundInfo().getFundCode());
					fundInfo.setCreateTime(new Date());
					fundInfo.setCreateId(webUserRuntimeBiz.getLoginUserId());
				} else {
					fundInfo.setRowVersion(req.getFundInfo().getRowVersion());
				}
				fundInfo.setModifyTime(new Date());
				fundInfo.setFundFullName(req.getFundInfo().getFundFullName());
				fundInfo.setFundName(req.getFundInfo().getFundName());
				if (isEmpty) {
					fundSystemBiz.fundFundInfoInsert(fundInfo);
					for (FundFundProperty item : req.getFundPropertyList()) {
						if (item.getPropertyValue() != null && item.getPropertyValue().trim() != "") {
							topdeep.commonfund.entity.db.FundFundProperty fp = new topdeep.commonfund.entity.db.FundFundProperty();
							fp.setFundCode(req.getFundInfo().getFundCode());
							fp.setPropertyType(item.getPropertyType());
							fp.setPropertyValue(item.getPropertyValue());
							fp.setRowVersion(0);
							fp.setCreateId(webUserRuntimeBiz.getLoginUserId());
							fp.setCreateTime(new Date());
							fp.setModifyTime(new Date());
							fundSystemBiz.fundFundPropertyInsert(fp);
						}
					}
				} else {
					if (req.getFundInfo().getRowVersion() != null) {
						fundSystemBiz.fundFundInfoUpdate(fundInfo);
						if (req.getFundPropertyList() != null && req.getFundPropertyList().size() > 0) {
							FundFundPropertyExample ex = new FundFundPropertyExample();
							ex.or().andFundCodeEqualTo(req.getFundInfo().getFundCode());
							fundSystemBiz.fundFundPropertyDeleteByCondition(ex);
							for (FundFundProperty item : req.getFundPropertyList()) {
								if (item.getPropertyValue() != null && item.getPropertyValue().trim() != "") {
									topdeep.commonfund.entity.db.FundFundProperty fp = new topdeep.commonfund.entity.db.FundFundProperty();
									fp.setFundCode(req.getFundInfo().getFundCode());
									fp.setPropertyType(item.getPropertyType());
									fp.setPropertyValue(item.getPropertyValue());
									fp.setRowVersion(0);
									fp.setCreateId(webUserRuntimeBiz.getLoginUserId());
									fp.setCreateTime(new Date());
									fp.setModifyTime(new Date());
									fundSystemBiz.fundFundPropertyInsert(fp);
								}
							}
						}
						res.setSuccess(true);
						res.setTitle("基金信息管理");
					} else {
						res.setResult(false, "基金代码重复");
					}
				}
			} catch (CacheException e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "基金信息修改失败");
			}
		}
		return res;
	}

	/*
	 * ajax基金信息删除
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundInfoManage!ajaxDelete")
	@ResponseBody
	public FundInfoManageResponse ajaxDelete(FundInfoManageRequest req) {
		FundInfoManageResponse res = new FundInfoManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_INFO_MANAGE, PrivilegeOperate.Delete);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkInput(res);
		}
		if (res.isSuccess()) {
			try {
				FundFundCatagoryFundRelaExample fundCatagoryFundRelaExample = new FundFundCatagoryFundRelaExample();
				fundCatagoryFundRelaExample.or().andCategoryIdEqualTo(req.getFundInfo().getFundCode());
				fundSystemBiz.fundFundCatagoryFundRelaDeleteByCondition(fundCatagoryFundRelaExample);

				FundFundPropertyExample ex = new FundFundPropertyExample();
				ex.or().andFundCodeEqualTo(req.getFundInfo().getFundCode());
				fundSystemBiz.fundFundPropertyDeleteByCondition(ex);

				fundSystemBiz.fundFundInfoDeleteByPrimaryKey(req.getFundInfo().getFundCode());
				res.setSuccess(true);
				res.setTitle("基金信息删除");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "基金信息删除失败");
			}
		}
		return res;
	}

	/**
	 * 审核
	 * 
	 * @param req
	 * @return
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundInfoManage!ajaxSetAuditState")
	@ResponseBody
	public FundInfoManageResponse ajaxSetAuditState(FundInfoManageRequest req) {
		FundInfoManageResponse res = new FundInfoManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_INFO_MANAGE, PrivilegeOperate.Audit);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkSetAuditStateInput(res);
		}
		if (res.isSuccess()) {
			try {
				// fundInfoBiz.setFundAduditState(req.getIds(), req.getAuditState());
				String[] fundCodes = req.getIds().split(",");
				FundFundInfoExample example = new FundFundInfoExample();
				List<String> list = Arrays.asList(fundCodes);
				example.or().andFundCodeIn(list);
				FundFundInfo fundInfo = new FundFundInfo();
				fundInfo.setAuditState(req.getAuditState());
				fundSystemBiz.fundFundInfoUpdateSelectiveByCondition(fundInfo, example);
				res.setSuccess(true);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "审核状态修改失败");
			}
		}
		return res;
	}

	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundInfoManage!ajaxQueryFundProperty")
	@ResponseBody
	public FundInfoManageResponse ajaxQueryFundProperty(FundInfoManageRequest req) {
		FundInfoManageResponse res = new FundInfoManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_INFO_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			FundFundPropertyExample example = new FundFundPropertyExample();
			boolean isEmpty = StringUtils.isNullOrEmpty(req.getFundInfo().getFundCode());
			List<FundFundProperty> fundPropertyList = new ArrayList<FundFundProperty>();

			if (!isEmpty) {
				for (EnumType.FundFundProperty i : EnumType.FundFundProperty.values()) {
					FundFundProperty fundProperty = new FundFundProperty();
					fundProperty.setPropertyName(i.getName());
					fundProperty.setPropertyType(i.getValue());
					fundProperty.setFundCode(req.getFundInfo().getFundCode());
					fundPropertyList.add(fundProperty);
				}
				example.or().andFundCodeEqualTo(req.getFundInfo().getFundCode());
				List<topdeep.commonfund.entity.db.FundFundProperty> fundPropertyListDB = null;
				try {
					fundPropertyListDB = fundSystemBiz.fundFundPropertySelectObjects(example);
					if (fundPropertyListDB != null && fundPropertyListDB.size() > 0) {
						for (topdeep.commonfund.entity.db.FundFundProperty item : fundPropertyListDB) {
							for (FundFundProperty detail : fundPropertyList) {
								if (item.getPropertyType().equals(detail.getPropertyType())) {
									detail.setPropertyValue(item.getPropertyValue());
								}
							}
						}
					}
					res.setSuccess(true);
				} catch (CacheException e) {
					logger.error(e.getMessage(), e);
					res.setResult(false, "基金信息查询失败");
				}
			}
			res.setFundPropertyList(fundPropertyList);
		}
		return res;
	}
}
