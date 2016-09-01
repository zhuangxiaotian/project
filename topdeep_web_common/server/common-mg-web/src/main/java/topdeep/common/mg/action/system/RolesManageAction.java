package topdeep.common.mg.action.system;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemAdminRoles;
import topdeep.common.entity.db.SystemAdminRolesExample;
import topdeep.common.entity.db.SystemRoles;
import topdeep.common.entity.db.SystemRolesExample;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.AdminRolesManageRequest;
import topdeep.common.mg.entity.request.BaseExternalRequest;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.response.RolesManageResponse;
import topdeep.common.util.UUIDGenerator;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;


@Controller
@RequestMapping(value = "/system")
public class RolesManageAction extends BaseAction {

	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping("/rolesManage")
	public String execute(BaseExternalRequest req, Model model) {
		BaseResponse res = new BaseResponse();
		super.execute(req, res);
		model.addAttribute("res", res);
		checkPrivilege(res, PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		res.setTitle("角色");
		return res.getTarget("/system/roles-manage-success");
	}

	@TopdeepMethodAttribute(loginRequired = true, isAjaxMethod = true)
	@RequestMapping(value = "/rolesManage!ajaxQuery")
	@ResponseBody
	public RolesManageResponse ajaxQuery(AdminRolesManageRequest req) {
		RolesManageResponse res = new RolesManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			List<SystemRoles> roles = null;
			int count = 0;
			try {
				SystemRolesExample systemRolesQueryCondition = new SystemRolesExample();
				systemRolesQueryCondition.or().andSuperAdminIdEqualTo(webUserRuntimeBiz.getLoginSuperUserId());
				systemRolesQueryCondition.setOrderByClause("CREATE_TIME desc");
				systemRolesQueryCondition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));

				roles = commonMgSystemBiz.systemRolesSelectObjects(systemRolesQueryCondition);
				count = commonMgSystemBiz.systemRolesQuerySelectObjectsCount(systemRolesQueryCondition);
			} catch (Exception e) {
				res.setResult(false, "操作失败");
				logger.error("execute ajaxQuery :" + e);
			}

			if (!roles.isEmpty()) {
				res.setRoles(roles);
				res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
			} else {
				res.getPageData().setPageInfo(0, 0, 0);
			}
			res.setTitle("角色");
		}
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/rolesManage!ajaxCreate")
	@ResponseBody
	public RolesManageResponse ajaxCreate(AdminRolesManageRequest req) {
		RolesManageResponse res = new RolesManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			SystemRoles item = new SystemRoles();
			try {
				item.setId(UUIDGenerator.getUUID24());
				item.setMemo(req.getRole().getMemo());
				item.setName(req.getRole().getName());
				item.setRolePrivileges(commonMgSystemBiz.dealUploadPrivileges(req.getOperateSelectValue()));
				item.setState("1");
				item.setSuperAdminId(webUserRuntimeBiz.getLoginSuperUserId());
				item.setCreateTime(new Date());
				item.setModifyTime(new Date());
				item.setRowVersion(0);

				commonMgSystemBiz.systemRolesInsert(item);
			} catch (Exception e) {
				res.setResult(false, "角色创建失败: " + e.getMessage());
				logger.error("execute ajaxRolesCreate :" + e);
			}
		}
		res.setTitle("角色新建");
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/rolesManage!ajaxUpdate")
	@ResponseBody
	public RolesManageResponse ajaxUpdate(AdminRolesManageRequest req) {
		RolesManageResponse res = new RolesManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		boolean isNUll = StringUtils.isNullOrEmpty(req.getRole().getId());
		if (res.isSuccess()) {
			try {
				if (!isNUll) {
					SystemRoles item = commonMgSystemBiz.systemRolesSelectByPrimaryKey(req.getRole().getId());
					if (item != null) {
						item.setMemo(req.getRole().getMemo());
						item.setName(req.getRole().getName());
						item.setRolePrivileges(commonMgSystemBiz.dealUploadPrivileges(req.getOperateSelectValue()));
						item.setState(req.getRole().getState());
						item.setSuperAdminId(webUserRuntimeBiz.getLoginSuperUserId());
						item.setRowVersion(req.getRole().getRowVersion());
						item.setCreateTime(new Date());
						item.setModifyTime(new Date());
						commonMgSystemBiz.systemRolesUpdate(item);
					}
				}
			} catch (Exception e) {
				res.setResult(false, "角色更新失败: " + e.getMessage());
				logger.error("execute ajaxRolesUpdate :" + e);
			}
		}
		res.setTitle("角色");
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/rolesManage!ajaxUpdateState")
	@ResponseBody
	public RolesManageResponse ajaxUpdateState(AdminRolesManageRequest req, String ids, String newState) {
		RolesManageResponse res = new RolesManageResponse();

		checkPrivilege(res, PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			String news = "0";
			if ("1".equals(newState)) {
				news = "1";
			}

			String[] idAry = ids.split(",");
			try {
				for (int i = 0; i < idAry.length; i++) {
					if (StringUtils.isNullOrEmpty(idAry[i])) {
						continue;
					}
					SystemRoles role = commonMgSystemBiz.systemRolesSelectByPrimaryKey(idAry[i]);
					if (role != null) {
						role.setState(news);
						commonMgSystemBiz.systemRolesUpdate(role);
					}
				}
			} catch (Exception e) {
				res.setResult(false, "操作失败: " + e.getMessage());
				logger.error("execute ajaxUpdateState:" + e);
			}
		}
		res.setTitle("角色");
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/rolesManage!ajaxsDelete")
	@ResponseBody
	public RolesManageResponse ajaxDelete(AdminRolesManageRequest req, String id) {
		RolesManageResponse res = new RolesManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Delete);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			String[] roleId = id.split(" ");

			try {
				for (int i = 0; i < roleId.length; i++) {
					commonMgSystemBiz.systemRolesDeleteByPrimaryKey(roleId[i]);
				}
			} catch (Exception e) {
				res.setResult(false, "操作失败");
				logger.error("execute ajaxRolesDelete:" + e);
			}
		}
		res.setTitle("角色");
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/rolesManage!ajaxOperatorsQuery")
	@ResponseBody
	public RolesManageResponse ajaxOperatorsQuery(AdminRolesManageRequest req) {
		RolesManageResponse res = new RolesManageResponse();
		SystemAdminRolesExample condition = new SystemAdminRolesExample();
		condition.or().andRolesIdIn(Arrays.asList(req.getRoleId().split(",")));
		List<SystemAdminRoles> adminRoles = null;
		res.setCouldBeDeleted(true);
		try {
			adminRoles = commonMgSystemBiz.systemAdminRolesSelectObjects(condition);
			if (!adminRoles.isEmpty()) {
				res.setRoleId(adminRoles.get(0).getRolesId());
				res.setCouldBeDeleted(false);
			}
		} catch (Exception e) {
			res.setResult(false, "操作失败");
			logger.error("execute ajaxOperatorsQuery :" + e);
		}

		res.setTitle("用户");
		return res;
	}
}
