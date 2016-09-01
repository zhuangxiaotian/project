package topdeep.common.mg.action.home;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.entity.db.SystemAdminRoles;
import topdeep.common.entity.db.SystemAdminRolesExample;
import topdeep.common.entity.db.SystemPrivilege;
import topdeep.common.entity.db.SystemPrivilegeExample;
import topdeep.common.entity.db.SystemRoles;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.request.BaseExternalRequest;
import topdeep.common.mg.entity.request.LoginRequest;
import topdeep.common.mg.entity.response.LoginResponse;
import topdeep.common.util.UUIDGenerator;

import common.cache2.CacheException;
import common.web.annotation.TopdeepMethodAttribute;

/**
 * 处理用户登录/登出
 * 
 * @author develop
 *
 */
@Controller
@RequestMapping(value = {
		"/h", "/home"
})
public class LoginAction extends BaseAction {

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "/login", method = {
		RequestMethod.GET
	})
	public String execute(BaseExternalRequest req, Model model) {
		LoginResponse res = new LoginResponse();
		webUserRuntimeBiz.logout();
		super.execute(req, res, false, false);
		res.setTitle("系统登录");
		res.setTipMessage("");
		res.setNeedNav(false);
		model.addAttribute("res", res);
		try {
			if (res.isSuccess()) {
				boolean existsAdmin = commonMgSystemBiz.existsSystemAdmin();
				if (existsAdmin) {
					res.setRegisterOpen(commonMgSystemParamBiz.getCommonMgApplicationParam().isRegisterSuperAdmin());
				} else {
					res.setRegisterOpen(true);
				}
			}
		} catch (Exception e) {
			logger.error("login error: " + e.getMessage(), e);
			res.setResult(false, e.getMessage());
		}
		if (res.isSuccess()) {
			return res.getTarget("/home/login-input");
		} else {
			return res.getTarget("/common/tip");
		}
	}

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "/logout", method = {
		RequestMethod.GET
	})
	public String executeout(BaseExternalRequest req, Model model) throws Exception {
		LoginResponse res = new LoginResponse();
		res.setTipMessage("");
		res.setNeedNav(false);
		model.addAttribute("res", res);
		super.execute(req, res, false, false);
		super.execute(req, res, false, false);
		webUserRuntimeBiz.logout();
		if (res.isSuccess()) {
			boolean existsAdmin = commonMgSystemBiz.existsSystemAdmin();
			if (existsAdmin) {
				res.setRegisterOpen(commonMgSystemParamBiz.getCommonMgApplicationParam().isRegisterSuperAdmin());
			} else {
				res.setRegisterOpen(true);
			}
		}
		if (res.isSuccess()) {
			return res.getTarget("/home/login-input");
		} else {
			return res.getTarget("/common/tip");
		}
	}

	@TopdeepMethodAttribute(loginRequired = false, isAjaxMethod = true)
	@RequestMapping(value = "/login!ajaxLogin", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public LoginResponse ajaxLogin(LoginRequest req, Model model, HttpServletRequest request) {
		LoginResponse res = new LoginResponse();
		super.execute(req, res, false, false);
		if (res.isSuccess()) {
			req.checkAjaxLoginInput(res);
		}
		SystemAdmin operator = null;
		if (res.isSuccess()) {
			try {
				operator = commonMgSystemBiz.loginCheck(req.getUsername());
				// String userPass = commonMgSystemBiz.buildLoginPassword(req.getPassword(), commonMgSystemParamBiz.getMgApplicationParam().getLoginPassSalt());
				if (operator == null) {
					res.setResult(false, "用户名或密码不正确，请重新输入！");
				} else {
					String userPass = commonMgSystemBiz.buildLoginPassword(req.getPassword(), operator.getLoginPassSalt());
					if (!operator.getLoginPass().equals(userPass)) {
						res.setResult(false, "用户名或密码不正确，请重新输入！");
					} else {
						if (operator.getState().equals("0")) {
							res.setResult(false, "请验证邮箱或与超级管理员联系认证登录");
						}
					}
				}
			} catch (CacheException e) {
				logger.error(e.getStackTrace());
				res.setResult(false, "用户名或密码不正确，请重新输入！");
			} catch (UnsupportedEncodingException e) {
				logger.error("QrcodeManageBiz.digest() exception: " + e.getStackTrace());
				e.printStackTrace();
			}
		}

		if (res.isSuccess()) {
			try {

				operator.setLastLogintime(new Date());
				operator.setLastLoginaddress(request.getRemoteAddr());
				commonMgSystemBiz.systemAdminUpdate(operator); // 更新用户登录信息
				if (UUIDGenerator.PARENT_ID.equals(operator.getParentAdminId())) {
					webUserRuntimeBiz.setLoginSuperUserId(operator.getId());
				} else {
					webUserRuntimeBiz.setLoginSuperUserId(operator.getParentAdminId());
				}
				webUserRuntimeBiz.setLoginUserName(operator.getName());
				webUserRuntimeBiz.setLoginUserId(operator.getId());
				webUserRuntimeBiz.setLogin(true);
				webUserRuntimeBiz.set("operator", operator);

				List<SystemPrivilege> privilegeList = commonMgSystemBiz.systemPrivilegeSelectObjects(new SystemPrivilegeExample());
				Map<Integer, SystemPrivilege> privilegeMap = new HashMap<Integer, SystemPrivilege>();
				for (SystemPrivilege item : privilegeList) {
					if (!privilegeMap.containsKey(item.getFuncPrivilege())) {
						privilegeMap.put(item.getFuncPrivilege(), item);
					}
				}
				// this.getSession().setPrivilegeMap(privilegeMap);

				SystemAdminRolesExample example = new SystemAdminRolesExample();
				example.or().andAdminIdEqualTo(operator.getId());
				List<SystemAdminRoles> adminRoleslist = commonMgSystemBiz.systemAdminRolesSelectObjects(example);
				if (adminRoleslist != null && adminRoleslist.size() > 0) { // 用户权限
					for (SystemAdminRoles systemAdminRoles : adminRoleslist) {
						SystemRoles role = commonMgSystemBiz.systemRolesSelectByPrimaryKey(systemAdminRoles.getRolesId());
						if (null != role && role.getState().equals("1")) {
							webUserRuntimeBiz.addPrivilege(role.getRolePrivileges());
						}
					}
				}
			} catch (Exception e) {
				res.setResult(false, "用户名或密码不正确，请重新输入！: " + e.getMessage());
			}
		}
		return res;
	}

}
