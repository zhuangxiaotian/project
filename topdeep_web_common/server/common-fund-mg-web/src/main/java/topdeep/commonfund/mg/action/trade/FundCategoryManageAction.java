package topdeep.commonfund.mg.action.trade;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.util.UUIDGenerator;
import topdeep.commonfund.entity.db.FundFundCatagoryFundRela;
import topdeep.commonfund.entity.db.FundFundCatagoryFundRelaExample;
import topdeep.commonfund.entity.db.FundFundCatagoryFundRelaKey;
import topdeep.commonfund.entity.db.FundFundCategory;
import topdeep.commonfund.entity.db.FundFundCategoryExample;
import topdeep.commonfund.entity.db.VFundFundCategoryFund;
import topdeep.commonfund.entity.db.VFundFundCategoryFundExample;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.request.FundCategoryManageRequest;
import topdeep.commonfund.mg.entity.response.FundCategoryManageResponse;
import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = {
	"/trade"
})
public class FundCategoryManageAction extends BaseAction {

	/*
	 * 基金分类跳转页面
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage")
	public String execute(FundCategoryManageRequest req, Model model) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		super.execute(req, res);

		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		model.addAttribute("res", res);
		if (res.isSuccess()) {
			return res.getTarget("/trade/fund-category-success");
		}
		return res.getTarget("/common/tip");
	}

	/*
	 * ajax基金分类查询
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage!ajaxQuery")
	@ResponseBody
	public FundCategoryManageResponse ajaxQuery(FundCategoryManageRequest req) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			FundFundCategoryExample example = new FundFundCategoryExample();
			boolean isEmpty = StringUtils.isNullOrEmpty(req.getSearchKeyword());
			if (!isEmpty) {
				example.or().andCategoryNameLike("%" + req.getSearchKeyword() + "%");
			}
			List<FundFundCategory> fundCategoryList = null;
			example.setOrderByClause("ORDER_FIELD desc");
			example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
			try {
				fundCategoryList = fundSystemBiz.fundFundCategorySelectObjects(example);
				int count = fundSystemBiz.fundFundCategoryQuerySelectObjectsCount(example);
				if (!fundCategoryList.isEmpty()) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setFundCategoryList(fundCategoryList);
				res.setResult(true, "");
			} catch (CacheException e) {
				logger.error("execute fundCategoryManage!ajaxQuery failed:" + e);
				res.setResult(false, "基金分类查询失败");
			}
		}
		return res;
	}

	/*
	 * ajax基金分类修改(新增)
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage!ajaxSave")
	@ResponseBody
	public FundCategoryManageResponse ajaxSave(FundCategoryManageRequest req) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				FundFundCategory fundCategory = null;
				if (!StringUtils.isNullOrEmpty(req.getFundCategory().getId())) {
					fundCategory = fundSystemBiz.fundFundCategorySelectByPrimaryKey(req.getFundCategory().getId());
				}
				FundFundCategoryExample ex = new FundFundCategoryExample();
				ex.or().andCategoryNameEqualTo(req.getFundCategory().getCategoryName());
				List<FundFundCategory> fundCategoryList = fundSystemBiz.fundFundCategorySelectObjects(ex);
				if (fundCategory == null) {
					if (!fundCategoryList.isEmpty()) {
						res.setResult(false, "基金分类重复");
					} else {
						fundCategory = new FundFundCategory();
						fundCategory.setId(UUIDGenerator.getUUID24());
						fundCategory.setParentId("************************");
						fundCategory.setRowVersion(0);
						fundCategory.setAuditState("0");
						fundCategory.setCategoryState("0");
						fundCategory.setCreateTime(new Date());
						fundCategory.setOrderField(new Date());
						fundCategory.setCreateId(webUserRuntimeBiz.getLoginUserId());
						fundCategory.setModifyTime(new Date());
						fundCategory.setCategoryName(req.getFundCategory().getCategoryName());
						fundSystemBiz.fundFundCategoryInsert(fundCategory);
					}
				} else {
					if (!fundCategoryList.isEmpty() && !req.getFundCategory().getCategoryName().equals(fundCategory.getCategoryName())) {
						res.setResult(false, "基金分类重复");
					} else {
						fundCategory.setModifyTime(new Date());
						fundCategory.setCategoryName(req.getFundCategory().getCategoryName());
						fundSystemBiz.fundFundCategoryUpdate(fundCategory);
					}
				}
			} catch (CacheException e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "基金分类保存失败");
			}
		}
		return res;
	}

	/*
	 * ajax基金分类删除
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage!ajaxDelete")
	@ResponseBody
	public FundCategoryManageResponse ajaxDelete(FundCategoryManageRequest req) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Delete);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkInput(res);
		}
		if (res.isSuccess()) {
			try {
				FundFundCatagoryFundRelaExample ex = new FundFundCatagoryFundRelaExample();
				ex.or().andCategoryIdEqualTo(req.getFundCategory().getId());
				fundSystemBiz.fundFundCatagoryFundRelaDeleteByCondition(ex);
				fundSystemBiz.fundFundCategoryDeleteByPrimaryKey(req.getFundCategory().getId());
				res.setResult(true, "");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "基金信息分类失败");
			}
		}
		return res;
	}

	/*
	 * ajax修改基金分类状态
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage!ajaxSetAuditState")
	@ResponseBody
	public FundCategoryManageResponse ajaxSetAuditState(FundCategoryManageRequest req) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Audit);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkSetAuditStateInput(res);
		}
		if (res.isSuccess()) {
			try {
				// mgLionfundBiz.setFundCategoryAduditState(req.getIds(), req.getAuditState());
				String[] arr = req.getIds().split(",");
				FundFundCategoryExample example = new FundFundCategoryExample();
				List<String> list = Arrays.asList(arr);
				example.or().andIdIn(list);
				FundFundCategory fundCategory = new FundFundCategory();
				fundCategory.setAuditState(req.getAuditState());
				fundSystemBiz.fundFundCategoryUpdateSelectiveByCondition(fundCategory, example);
				res.setSuccess(true);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "审核状态修改失败");
			}
		}
		return res;
	}

	/*
	 * ajax基金分类下基金查询
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage!ajaxQueryFundCategoryFund")
	@ResponseBody
	public FundCategoryManageResponse ajaxQueryFundCategoryFund(FundCategoryManageRequest req) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			VFundFundCategoryFundExample example = new VFundFundCategoryFundExample();
			List<VFundFundCategoryFund> fundCategoryFundList = null;
			example.or().andCategoryIdEqualTo(req.getFundCategory().getId());
			example.setOrderByClause("ORDER_FIELD desc");
			example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
			try {
				fundCategoryFundList = fundSystemBiz.vFundFundCategoryFundSelectObjects(example);
				int count = fundSystemBiz.vFundFundCategoryFundQuerySelectObjectsCount(example);
				if (!fundCategoryFundList.isEmpty()) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setFundCategoryFundList(fundCategoryFundList);
				res.setResult(true, "");
			} catch (CacheException e) {
				logger.error("execute fundCategoryManage!ajaxQueryFundCategoryFund failed:" + e);
				res.setResult(false, "基金分类下基金查询失败");
			}
		}
		return res;
	}

	/**
	 * 基金分类下添加基金
	 * 
	 * @param req
	 * @return
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage!ajaxAddFund")
	@ResponseBody
	public FundCategoryManageResponse ajaxAddFund(FundCategoryManageRequest req) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			res.checkStringEmpty(req.getIds(), "未选择项");
		}
		if (res.isSuccess()) {
			try {
				String[] fundCodeArr = req.getIds().split(",");
				if (fundCodeArr.length > 0) {
					FundFundCatagoryFundRela FundCatagoryFundRela = new FundFundCatagoryFundRela();
					FundCatagoryFundRela.setCategoryId(req.getFundCategory().getId());
					FundCatagoryFundRela.setCreateId(webUserRuntimeBiz.getLoginUserId());
					FundCatagoryFundRela.setCreateName(webUserRuntimeBiz.getLoginUserName());
					FundCatagoryFundRela.setRowVersion(0);
					for (int i = 0; i < fundCodeArr.length; i++) {
						FundCatagoryFundRela.setFundCode(fundCodeArr[i]);
						FundCatagoryFundRela.setCreateTime(new Date(new Date().getTime() + 1000 * i));
						FundCatagoryFundRela.setModifyTime(new Date());
						FundCatagoryFundRela.setOrderField(new Date(new Date().getTime() + 1000 * i));
						fundSystemBiz.fundFundCatagoryFundRelaInsert(FundCatagoryFundRela);
					}
					res.setResult(true, "");
					
				} else {
					res.setResult(false, "添加失败:未选择项");
				}

			} catch (Exception e) {
				logger.error("execute fundCategoryManage!ajaxAddFund failed:" + e);
				res.setResult(false, "添加失败");
			}
		}
		return res;
	}

	/**
	 * 基金分类下删除添加的基金
	 * 
	 * @param req
	 * @return
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage!ajaxDeleteFundCategoryFund")
	@ResponseBody
	public FundCategoryManageResponse ajaxDeleteFundCategoryFund(FundCategoryManageRequest req) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				FundFundCatagoryFundRela fundCatagoryFundRela = fundSystemBiz.fundFundCatagoryFundRelaSelectByPrimaryKey(new FundFundCatagoryFundRelaKey(req
						.getFundCatagoryFundRela().getCategoryId(), req.getFundCatagoryFundRela().getFundCode()));
				if (fundCatagoryFundRela != null) {
					fundSystemBiz.fundFundCatagoryFundRelaDeleteByPrimaryKey(new FundFundCatagoryFundRelaKey(req.getFundCatagoryFundRela().getCategoryId(), req
							.getFundCatagoryFundRela().getFundCode()));
				}
				res.setResult(true, "");
			} catch (Exception e) {
				logger.error("execute fundCategoryManage!ajaxDeleteFundCategoryFund failed:" + e);
				res.setResult(false, "删除失败");
			}
		}
		return res;
	}

	/**
	 * 上下移动
	 * 
	 * @param req
	 * @return
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/fundCategoryManage!ajaxMoveFundCategoryFund")
	@ResponseBody
	public FundCategoryManageResponse ajaxMoveFundCategoryFund(FundCategoryManageRequest req) {
		FundCategoryManageResponse res = new FundCategoryManageResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				FundFundCatagoryFundRela fundCatagoryFundRela = fundSystemBiz.fundFundCatagoryFundRelaSelectByPrimaryKey(new FundFundCatagoryFundRelaKey(req
						.getFundCatagoryFundRela().getCategoryId(), req.getFundCatagoryFundRela().getFundCode()));
				if (fundCatagoryFundRela != null) {
					FundFundCatagoryFundRelaExample example = new FundFundCatagoryFundRelaExample();
					List<FundFundCatagoryFundRela> list = null;
					if (req.getMoveOprate().equals("1")) {// moveUp
						example.or().andOrderFieldGreaterThan(fundCatagoryFundRela.getOrderField())
								.andCategoryIdEqualTo(req.getFundCatagoryFundRela().getCategoryId());
						example.setOrderByClause("ORDER_FIELD asc");
						list = fundSystemBiz.fundFundCatagoryFundRelaSelectObjects(example);
					} else if (req.getMoveOprate().equals("2")) {// moveDown
						example.or().andOrderFieldLessThan(fundCatagoryFundRela.getOrderField())
								.andCategoryIdEqualTo(req.getFundCatagoryFundRela().getCategoryId());
						example.setOrderByClause("ORDER_FIELD desc");
						list = fundSystemBiz.fundFundCatagoryFundRelaSelectObjects(example);
					} else if (req.getMoveOprate().equals("3")) {// moveToTop
						example.or().andCategoryIdEqualTo(req.getFundCatagoryFundRela().getCategoryId());
						example.setOrderByClause("ORDER_FIELD desc");
						list = fundSystemBiz.fundFundCatagoryFundRelaSelectObjects(example);
					}
					if (list == null || list.size() <= 0) {
						res.setResult(false, "不可移动");
					} else {
						FundFundCatagoryFundRela fundCatagoryFundRelaNew = list.get(0);
						Date date = fundCatagoryFundRelaNew.getOrderField();
						fundCatagoryFundRelaNew.setOrderField(fundCatagoryFundRela.getOrderField());
						fundCatagoryFundRela.setOrderField(date);
						fundSystemBiz.fundFundCatagoryFundRelaUpdate(fundCatagoryFundRelaNew);
						fundSystemBiz.fundFundCatagoryFundRelaUpdate(fundCatagoryFundRela);
						res.setResult(true, "");
					}

				} else {
					res.setResult(false, "移动失败");
				}

			} catch (Exception e) {
				logger.error("execute fundCategoryManage!ajaxMoveFundCategoryFund failed:" + e);
				res.setResult(false, "移动失败");
			}
		}
		return res;
	}

}
