package topdeep.common.mg.action.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.constant.BaseInfoType;
import topdeep.common.entity.constant.EnumType.SystemType;
import topdeep.common.entity.constant.NameValue;
import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.entity.db.SystemBaseInfoExample;
import topdeep.common.entity.db.SystemBaseInfoKey;
import topdeep.common.entity.db.SystemPrivilege;
import topdeep.common.entity.db.SystemPrivilegeExample;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.BaseInfoRequest;
import topdeep.common.mg.entity.response.BaseInfoResponse;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.view.BaseInfoTypeEditInfo;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

/**
 * 数据字典
 */
@Controller
@RequestMapping(value = {
	"/system"
})
public class BaseInfoManageAction extends BaseAction {

	/*
	 * 数据字典管理跳转页面
	 */
	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/baseInfoManage")
	public String execute(BaseInfoRequest req, Model model) {
		BaseInfoResponse res = new BaseInfoResponse();
		model.addAttribute("res", res);
		super.execute(req, res, false);
		checkPrivilege(res, PrivilegeConfig.FUNC_BASE_INFO_MANGE, PrivilegeOperate.Read);
		try {
			if (res.isSuccess()) {
				req.checkExecuteInput(res);
			}
			if (res.isSuccess()) {
				checkBaseInfoTypePrivilege(res, req.getCodeType());
			}
			if (res.isSuccess()) {
				List<SystemBaseInfo> baseInfoTypeList = getBaseInfoTypeList(req);
				res.setBaseInfoTypeList(baseInfoTypeList);
			}
			if (res.isSuccess()) {
				BaseInfoTypeEditInfo editInfo = new BaseInfoTypeEditInfo();
				editInfo.setCodeTypeId(req.getCodeType());
				if (res.isSuccess()) {
					SystemBaseInfo info = commonMgSystemBiz.systemBaseInfoSelectByPrimaryKey(new SystemBaseInfoKey(req.getCodeType(),
							BaseInfoType.USER_BASE_INFO_TYPE_LIST, SystemType.Common.getValue()));
					if (info != null) {
						editInfo.setCodeTypeId(req.getCodeType());
						editInfo.setCodeTypeName(info.getCodeName());
					} else {
						res.setResult(false, "无效的编辑信息");
					}
				}
				if (res.isSuccess()) {
					editInfo.setEditType(getBaseInfoCodeName(req.getCodeType(), BaseInfoType.USER_BASE_INFO_OPERATE_LIST, "0"));
					editInfo.setCodeTypeDescName(getBaseInfoCodeName(req.getCodeType(), BaseInfoType.USER_BASE_INFO_DESC_NAME_LIST, "描述"));
					editInfo.setCodeIdParamType(getBaseInfoCodeName(req.getCodeType(), BaseInfoType.USER_BASE_INFO_ID_PARAM_TYPE_LIST, "String"));
					editInfo.setCodeNameParamType(getBaseInfoCodeName(req.getCodeType(), BaseInfoType.USER_BASE_INFO_NAME_PARAM_TYPE_LIST, "String"));
					editInfo.setCodeDescParamType(getBaseInfoCodeName(req.getCodeType(), BaseInfoType.USER_BASE_INFO_DESC_PARAM_TYPE_LIST, "String"));
				}
				res.setEditInfo(editInfo);

				SystemPrivilegeExample condition = new SystemPrivilegeExample();
				condition.setOrderByClause("FUNC_ORDER asc");
				condition.or().andFuncPrivilegeGreaterThanOrEqualTo(PrivilegeConfig.CUSTOM_PRIVILEGE_BEGIN_VALUE)
						.andFuncPrivilegeLessThan(PrivilegeConfig.PRIVILEGE_GROUP_BEGIN_VALUE);
				condition.setOrderByClause("FUNC_ORDER asc");
				List<SystemPrivilege> customList = commonMgSystemBiz.systemPrivilegeSelectObjects(condition);
				List<NameValue> customPrivilegeList = new ArrayList<NameValue>();
				for (SystemPrivilege item : customList) {
					customPrivilegeList.add(new NameValue(item.getFuncName(), "" + item.getFuncPrivilege()));
				}
				res.setCustomPrivilegeList(customPrivilegeList);
			}
		} catch (Exception ex) {
			logger.error("baseInfoManage error: " + ex.getMessage(), ex);
			res.setResult(false, ex.getMessage());
		}
		if (res.isSuccess()) {
			return res.getTarget("/system/base-info-success");
		} else {
			return res.getTarget("/common/tip");
		}
	}

	/*
	 * ajax数据字典查询
	 */
	@TopdeepMethodAttribute(loginRequired = true, isAjaxMethod = true)
	@RequestMapping(value = "/baseInfoManage!ajaxQuery")
	@ResponseBody
	public BaseInfoResponse ajaxQuery(BaseInfoRequest req) {
		BaseInfoResponse res = new BaseInfoResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_BASE_INFO_MANGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		try {
			if (res.isSuccess()) {
				req.checkQueryInput(res);
			}
			if (res.isSuccess()) {
				checkBaseInfoTypePrivilege(res, req.getCodeType());
			}
			if (res.isSuccess()) {
				SystemBaseInfoExample condition = new SystemBaseInfoExample();
				SystemBaseInfoExample.Criteria criteria = condition.or();
				criteria.andCodeTypeEqualTo(req.getCodeType()).andSystemTypeEqualTo(SystemType.Common.getValue());
				if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
					criteria.andCodeNameLike("%" + req.getSearchKeyword() + "%");
				}
				condition.setOrderByClause("ORDER_FIELD asc");
				condition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				List<SystemBaseInfo> baseInfoList = commonMgSystemBiz.systemBaseInfoSelectObjects(condition);
				int count = commonMgSystemBiz.systemBaseInfoQuerySelectObjectsCount(condition);
				if (!baseInfoList.isEmpty()) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setBaseInfoList(baseInfoList);
			}
		} catch (Exception ex) {
			logger.error("baseInfoManage!ajaxQuery error: " + ex.getMessage(), ex);
			res.setResult(false, ex.getMessage());
		}
		return res;
	}

	private String getBaseInfoCodeName(String codeId, String codeType, String defaultValue) throws Exception {
		SystemBaseInfo baseInfo = commonMgSystemBiz.systemBaseInfoSelectByPrimaryKey(new SystemBaseInfoKey(codeId, codeType, SystemType.Common.getValue()));
		if (baseInfo != null) {
			return baseInfo.getCodeName();
		}
		return defaultValue;
	}

	/*
	 * ajax数据字典修改
	 */
	@TopdeepMethodAttribute(loginRequired = true, isAjaxMethod = true)
	@RequestMapping(value = "/baseInfoManage!ajaxSave")
	@ResponseBody
	public BaseInfoResponse ajaxSave(BaseInfoRequest req) {
		BaseInfoResponse res = new BaseInfoResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_BASE_INFO_MANGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		try {
			if (res.isSuccess()) {
				req.checkEditInput(res);
			}
			if (res.isSuccess()) {
				checkBaseInfoTypePrivilege(res, req.getBaseInfo().getCodeType());
			}
			if (res.isSuccess()) {
				SystemBaseInfo baseInfo = commonMgSystemBiz.systemBaseInfoSelectByPrimaryKey(new SystemBaseInfoKey(req.getBaseInfo().getCodeId(), req
						.getBaseInfo().getCodeType(), SystemType.Common.getValue()));
				boolean isNew = baseInfo == null;
				if (!isNew) {
					if (req.getBaseInfo().getRowVersion() == null) {
						res.setResult(false, "字典重复");
					}
				}
				if (res.isSuccess()) {
					if (isNew) {
						baseInfo = new SystemBaseInfo();
						baseInfo.setRowVersion(0);
						baseInfo.setCodeId(req.getBaseInfo().getCodeId());
						baseInfo.setCreateTime(new Date());
						baseInfo.setCreateName(webUserRuntimeBiz.getLoginUserName());
						baseInfo.setCreateId(webUserRuntimeBiz.getLoginUserId());
						baseInfo.setCodeType(req.getBaseInfo().getCodeType());
						baseInfo.setSystemType(SystemType.Common.getValue());
					}
					baseInfo.setCodeName(req.getBaseInfo().getCodeName());
					baseInfo.setCodeDesc(req.getBaseInfo().getCodeDesc());
					baseInfo.setOrderField(req.getBaseInfo().getOrderField());
					baseInfo.setModifyTime(new Date());
					baseInfo.setModifyId(webUserRuntimeBiz.getLoginUserId());
					baseInfo.setModifyName(webUserRuntimeBiz.getLoginUserName());
					baseInfo.setAuditId(webUserRuntimeBiz.getLoginUserId());
					baseInfo.setAuditName(webUserRuntimeBiz.getLoginUserName());
					baseInfo.setAuditState("1");
					baseInfo.setAuditTime(new Date());
					if (isNew) {
						commonMgSystemBiz.systemBaseInfoInsert(baseInfo);
					} else {
						commonMgSystemBiz.systemBaseInfoUpdate(baseInfo);
					}
					res.setBaseInfo(baseInfo);
				}
			}

		} catch (Exception ex) {
			logger.error("baseInfoManage!ajaxSave error: " + ex.getMessage(), ex);
			res.setResult(false, ex.getMessage());
		}
		return res;
	}

	/*
	 * ajax数据字典删除
	 */
	@TopdeepMethodAttribute(loginRequired = true, isAjaxMethod = true)
	@RequestMapping(value = "/baseInfoManage!ajaxDelete")
	@ResponseBody
	public BaseInfoResponse ajaxDelete(BaseInfoRequest req) {
		BaseInfoResponse res = new BaseInfoResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_BASE_INFO_MANGE, PrivilegeOperate.Delete);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		try {
			if (res.isSuccess()) {
				req.checkDeleteInput(res);
			}
			if (res.isSuccess()) {
				checkBaseInfoTypePrivilege(res, req.getBaseInfo().getCodeType());
			}
			if (res.isSuccess()) {
				commonMgSystemBiz.systemBaseInfoDeleteByPrimaryKey(new SystemBaseInfoKey(req.getBaseInfo().getCodeId(), req.getBaseInfo().getCodeType(),
						SystemType.Common.getValue()));
			}
		} catch (Exception e) {
			logger.error(e.getStackTrace());
			res.setResult(false, "数据字典删除失败");
		}
		return res;
	}

	private List<SystemBaseInfo> getBaseInfoTypeList(BaseInfoRequest req) throws Exception {
		// 检查自定义权限是否存在
		SystemBaseInfoExample condition = new SystemBaseInfoExample();
		SystemBaseInfoExample.Criteria criteria = condition.or();
		criteria.andSystemTypeEqualTo(SystemType.Common.getValue()).andCodeTypeEqualTo(BaseInfoType.USER_BASE_INFO_TYPE_LIST);
		if (!StringUtils.isNullOrEmpty(req.getCodeType())) {
			criteria.andCodeIdEqualTo(req.getCodeType());
		}
		condition.setOrderByClause("ORDER_FIELD asc");
		List<SystemBaseInfo> baseInfoTypeList = commonMgSystemBiz.systemBaseInfoSelectObjects(condition);
		for (int i = baseInfoTypeList.size() - 1; i >= 0; i--) {
			SystemBaseInfo baseInfo = baseInfoTypeList.get(i);
			boolean hasPrivilege = false;
			if (!StringUtils.isNullOrEmpty(baseInfo.getCodeDesc())) {
				int priValue = Integer.parseInt(baseInfo.getCodeDesc());
				if (webUserRuntimeBiz.hasPrivilege(priValue, PrivilegeOperate.Execute)) {
					hasPrivilege = true;
				}
			} else {
				hasPrivilege = true;
			}
			if (!hasPrivilege) {
				baseInfoTypeList.remove(i);
			}
		}
		return baseInfoTypeList;
	}

	private void checkBaseInfoTypePrivilege(BaseResponse res, String baseInfoId) throws Exception {
		SystemBaseInfo baseInfo = commonMgSystemBiz.systemBaseInfoSelectByPrimaryKey(new SystemBaseInfoKey(baseInfoId, BaseInfoType.USER_BASE_INFO_TYPE_LIST,
				SystemType.Common.getValue()));
		boolean hasPrivilege = false;
		if (!StringUtils.isNullOrEmpty(baseInfo.getCodeDesc())) {
			int priValue = Integer.parseInt(baseInfo.getCodeDesc());
			if (webUserRuntimeBiz.hasPrivilege(priValue, PrivilegeOperate.Execute)) {
				hasPrivilege = true;
			}
		} else {
			hasPrivilege = true;
		}
		if (!hasPrivilege) {
			res.setResult(false, "没有权限");
			res.setRedirectUrl(commonMgSystemParamBiz.getCommonMgApplicationParam().getNoPrivilegeTemplate());
		}
	}
}
