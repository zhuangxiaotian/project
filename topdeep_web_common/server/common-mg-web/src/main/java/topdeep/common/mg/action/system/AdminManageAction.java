package topdeep.common.mg.action.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.entity.db.SystemAdminExample;
import topdeep.common.entity.db.SystemAdminRoles;
import topdeep.common.entity.db.SystemAdminRolesExample;
import topdeep.common.entity.db.SystemRoles;
import topdeep.common.entity.db.SystemRolesExample;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.AdminManageRequest;
import topdeep.common.mg.entity.response.AdminManageResponse;
import topdeep.common.util.UUIDGenerator;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

/**
 * 
 * @author shidewen
 * 
 */
@Controller
@RequestMapping(value = {
	"/system"
})
public class AdminManageAction extends BaseAction {
	
	
	@TopdeepMethodAttribute
	@RequestMapping(value = "/adminManage", method = {
		RequestMethod.GET
	})
	public String execute(AdminManageRequest req, Model model) {
		AdminManageResponse res = new AdminManageResponse();
		super.execute(req, res);
		model.addAttribute("res", res);
		checkPrivilege(res, PrivilegeConfig.FUNC_OPERATOR_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		res.setTitle("管理员管理");
		return res.getTarget("/system/admin-manage-success");
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/adminManage!ajaxDelete")
	@ResponseBody
	public AdminManageResponse ajaxDelete(AdminManageRequest req) {
		AdminManageResponse res = new AdminManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_OPERATOR_MANAGE, PrivilegeOperate.Delete);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkDeleteInput(res);
		}
		if (res.isSuccess()) {
			try {
				SystemAdmin operator = commonMgSystemBiz.systemAdminSelectByPrimaryKey(req.getAdmin().getId());
				if (operator != null) {
					operator.setState("2");
					commonMgSystemBiz.systemAdminUpdate(operator);
				}
			} catch (CacheException e) {
				logger.error(e.getStackTrace());
				res.setResult(false, "删除成功");
			}
		}
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/adminManage!ajaxQuery")
	@ResponseBody
	public AdminManageResponse ajaxQuery(AdminManageRequest req) {
		AdminManageResponse res = new AdminManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_OPERATOR_MANAGE, PrivilegeOperate.Read);

		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			SystemAdminExample condition = new SystemAdminExample();
			if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
				condition.or().andNameLike("%" + req.getSearchKeyword() + "%").andParentAdminIdEqualTo(webUserRuntimeBiz.getLoginSuperUserId());
				condition.or().andLoginNameLike("%" + req.getSearchKeyword() + "%").andParentAdminIdEqualTo(webUserRuntimeBiz.getLoginSuperUserId());
				condition.or().andLoginEmailLike("%" + req.getSearchKeyword() + "%").andParentAdminIdEqualTo(webUserRuntimeBiz.getLoginSuperUserId());
				condition.or().andMobileTelephoneLike("%" + req.getSearchKeyword() + "%").andParentAdminIdEqualTo(webUserRuntimeBiz.getLoginSuperUserId());
			} else {
				condition.or().andParentAdminIdEqualTo(webUserRuntimeBiz.getLoginSuperUserId());
			}
			List<SystemAdmin> operatorsList = new ArrayList<SystemAdmin>();
			try {
				condition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				operatorsList = commonMgSystemBiz.systemAdminSelectObjects(condition);
				int count = commonMgSystemBiz.systemAdminQuerySelectObjectsCount(condition);
				if (operatorsList.size() > 0) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setResult(true, "");
				if (null != operatorsList && 0 != operatorsList.size()) {
					for (SystemAdmin item : operatorsList) {
						item.setLoginPass("");
					}
				}
				res.setAdminList(operatorsList);
			} catch (Exception e) {
				logger.error(e.getStackTrace());
				res.setResult(false, "查询操作失败: " + e.getMessage());
			}
		}
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/adminManage!ajaxSave")
	@ResponseBody
	public AdminManageResponse ajaxSave(@RequestBody AdminManageRequest req) {
		AdminManageResponse res = new AdminManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_OPERATOR_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkSaveInput(res);
		}
		if (res.isSuccess()) {
			SystemAdminExample condition = new SystemAdminExample();
			List<SystemAdmin> list = null;
			SystemAdmin operator;
			try {
				boolean newOperator = StringUtils.isNullOrEmpty(req.getAdmin().getId());
				String loginPassSalt = UUIDGenerator.getUUID24();
				if (newOperator) {
					operator = new SystemAdmin();
					condition.or().andLoginNameEqualTo(req.getAdmin().getLoginName());
					list = commonMgSystemBiz.systemAdminSelectObjects(condition);
					if (list.size() != 0) {
						res.setResult(false, "已有重复操作员");
					} else {
						operator.setId(UUIDGenerator.getUUID24());
						operator.setRowVersion(0);
						if(req.getAdmin().getLoginPass()==null){
							res.setResult(false, "密码不能为空");
							return res;
						}
						operator.setLoginPass(commonMgSystemBiz.buildLoginPassword(req.getAdmin().getLoginPass(), loginPassSalt));
						operator.setLoginPassSalt(loginPassSalt);
						operator.setMobileTelephone(req.getAdmin().getMobileTelephone());
						operator.setLoginEmail(req.getAdmin().getLoginEmail());
						operator.setMemo(req.getAdmin().getMemo());
						operator.setName(req.getAdmin().getName());
						operator.setParentAdminId(this.webUserRuntimeBiz.getLoginSuperUserId());
						operator.setState(req.getAdmin().getState());
						operator.setOtherTelephone(req.getAdmin().getOtherTelephone());
						operator.setLoginName(req.getAdmin().getLoginName());
						operator.setCreateTime(new Date());
						operator.setModifyTime(new Date());
						commonMgSystemBiz.systemAdminInsert(operator);
					}
				} else {
					operator = commonMgSystemBiz.systemAdminSelectByPrimaryKey(req.getAdmin().getId());
					if(operator!=null){
						if (!StringUtils.isNullOrEmpty(operator.getLoginPassSalt())) {
							loginPassSalt = operator.getLoginPassSalt();
						}
						if(!operator.getLoginName().equals(req.getAdmin().getLoginName())){
							SystemAdminExample example = new SystemAdminExample();
							example.or().andLoginNameEqualTo(req.getAdmin().getLoginName());
							if (commonMgSystemBiz.systemAdminQuerySelectObjectsCount(example) > 0) {
								res.setResult(false, "已有重复操作员");
								return res;
							};
						}
					}
					operator.setRowVersion(req.getAdmin().getRowVersion());
					operator.setMobileTelephone(req.getAdmin().getMobileTelephone());
					operator.setLoginEmail(req.getAdmin().getLoginEmail());
					operator.setMemo(req.getAdmin().getMemo());
					operator.setName(req.getAdmin().getName());
					operator.setParentAdminId(this.webUserRuntimeBiz.getLoginSuperUserId());
					operator.setState(req.getAdmin().getState());
					operator.setOtherTelephone(req.getAdmin().getOtherTelephone());
					operator.setLoginName(req.getAdmin().getLoginName());
					if(!req.getAdmin().getLoginPass().equals("")){
						operator.setLoginPass(commonMgSystemBiz.buildLoginPassword(req.getAdmin().getLoginPass(), loginPassSalt));
					}
					operator.setLoginPassSalt(loginPassSalt);
					commonMgSystemBiz.systemAdminUpdate(operator);
				}
			} catch (Exception e) {
				res.setResult(false, "保存失败: " + e.getMessage());
				logger.error(e.getStackTrace());
			}
		}

		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/adminManage!ajaxQueryAdminRoles")
	@ResponseBody
	public AdminManageResponse ajaxQueryAdminRoles(AdminManageRequest req) {
		AdminManageResponse res = new AdminManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_OPERATOR_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				String adminId = req.getAdmin().getId();
				List<SystemRoles> rolesList = new ArrayList<SystemRoles>();
				List<SystemAdminRoles> systemAdminRolesList = new ArrayList<SystemAdminRoles>();

				SystemRolesExample systemRolesQueryCondition = new SystemRolesExample();
				systemRolesQueryCondition.or().andSuperAdminIdEqualTo(webUserRuntimeBiz.getLoginSuperUserId()).andStateEqualTo("1");
				rolesList = commonMgSystemBiz.systemRolesSelectObjects(systemRolesQueryCondition);

				if (!rolesList.isEmpty()) {
					SystemAdminRolesExample systemAdminRolesExample = new SystemAdminRolesExample();
					systemAdminRolesExample.or().andAdminIdEqualTo(adminId);
					systemAdminRolesList = commonMgSystemBiz.systemAdminRolesSelectObjects(systemAdminRolesExample);
					if (!systemAdminRolesList.isEmpty()) {
						res.setAdminRoles(systemAdminRolesList);
					}
					res.setRolesList(rolesList);
				}
				res.setResult(true, "查询成功");
			} catch (Exception e) {
				res.setResult(false, "查询角色失败: " + e.getMessage());
				logger.error(e.getStackTrace());
			}
		}
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/adminManage!ajaxAdminRolesSave")
	@ResponseBody
	public AdminManageResponse ajaxAdminRolesSave(AdminManageRequest req) {
		AdminManageResponse res = new AdminManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_OPERATOR_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true, true);
		}
		if (res.isSuccess()) {
			try {
				String roleIds = req.getRoleIds();
				String currentAdminId = req.getAdmin().getId();
				commonMgSystemBiz.saveAdminRoles(currentAdminId, roleIds, webUserRuntimeBiz.getLoginSuperUserId());
				res.setResult(true, "设置角色成功");
			} catch (Exception e) {
				res.setResult(false, "设置角色失败: " + e.getMessage());
				logger.error(e.getStackTrace());
			}
		}
		return res;

	}
}