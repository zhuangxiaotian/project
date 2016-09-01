package topdeep.common.mg.action.home;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.constant.BaseInfoType;
import topdeep.common.entity.constant.EnumType.SystemType;
import topdeep.common.entity.constant.NameValue;
import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.entity.db.SystemBaseInfoExample;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.BaseRequest;
import topdeep.common.mg.entity.request.NavRequest;
import topdeep.common.mg.entity.response.NavResponse;
import topdeep.common.mg.entity.system.SystemMenu;

import com.mysql.jdbc.StringUtils;
import common.privilege.PrivilegeOperate;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = {
		"/h", "/home"
})
public class NavAction extends BaseAction {

	private static final List<SystemMenu> MENU_LIST = new ArrayList<SystemMenu>();

	static {
		SystemMenu parentMenu;
		SystemMenu menu;
		int parentMenuIdSn = 1000;
		int maxChildCount = 100;
		int k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "/home/index.action", "主页", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-cog fa-fw");
		MENU_LIST.add(parentMenu);

		k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "web控件", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-file-text-o");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/ui/sample.action?type=icons", "icons", 1,
				PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/ui/sample.action?type=forms", "forms", 1,
				PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/ui/sample.action?type=buttons", "buttons", 1,
				PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/ui/sample.action?type=tabs", "tabs", 1,
				PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/ui/sample.action?type=confirms", "confirms", 1,
				PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "系统管理", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/system/adminManage.action", "用户管理", 1,
				PrivilegeConfig.FUNC_OPERATOR_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/system/rolesManage.action", "角色管理", 1,
				PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/system/privilegeManage.action", "权限管理", 1,
				PrivilegeConfig.FUNC_PRIVILEGE_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "管理工具", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/whiteListsManage.action?type=1", "个人白名单管理", 1,
				PrivilegeConfig.FUNC_WHITELISTS_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/whiteListsManage.action?type=0", "机构白名单管理", 1,
				PrivilegeConfig.FUNC_ENTERPRISE_WHITELISTS_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);


		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "系统参数", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/systemConfigManage.action", "参数设置", 1,
				PrivilegeConfig.FUNC_ENTERPRISE_WHITELISTS_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "系统工具", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/system/refreshCacheManage.action", "刷新缓存", 1,
				PrivilegeConfig.FUNC_REFRESH_CACHE_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/paramManage.action", "系统参数管理", 1,
				PrivilegeConfig.FUNC_SYSTEM_PARAM_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		
		k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "客户端管理", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/client/clientVersionManage.action", "客户端版本管理", 1,
				PrivilegeConfig.FUNC_CLIENT_VERSION_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/client/clientActivationManage.action", "客户端激活量数据分析", 1,
				PrivilegeConfig.FUNC_CLIENT_ACTIVATION_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "客户服务", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * maxChildCount + k++, parentMenu.getId(), "/system/customerMessageManage.action", "客户留言", 1,
				PrivilegeConfig.FUNC_CUSTOMER_MESSAGE_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		
		k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "数据字典", 0, PrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa  fa-book");
		MENU_LIST.add(parentMenu);
		// 数据字典项下的内容是动态的

	}

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "/nav!ajaxQueryMenus", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	@ResponseBody
	public NavResponse ajaxQueryMenus(BaseRequest req) {
		NavResponse res = new NavResponse();
		super.execute(req, res, true, true);
		if (res.isSuccess() && webUserRuntimeBiz.isLogin()) {
			res.setMenuList(getLoginUserMenus());
			res.setRightMenuList(getRightMenus());
			res.setSwitchMenuList(getSwitchMenus());
		}
		return res;
	}

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "/nav!ajaxSwitchMenu", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	@ResponseBody
	public NavResponse ajaxSwitchMenu(NavRequest req) {
		NavResponse res = new NavResponse();
		super.execute(req, res, true, true);
		logger.debug("ajaxSwitchMenu");
		return res;
	}

	public List<SystemMenu> getLoginUserMenus() {
		List<SystemMenu> menus = new ArrayList<SystemMenu>();
		try {
			for (SystemMenu item : MENU_LIST) {
				SystemMenu newItem = new SystemMenu(item.getId(), item.getParentId(), item.getUrl(), item.getName(), item.getLevel(), item.getIconClass());
				menus.add(newItem);
				for (SystemMenu item1 : item.getChildList()) {
					newItem.getChildList().add(item1);
				}
				if (newItem.getName().equals("数据字典")) {
					SystemBaseInfoExample condition = new SystemBaseInfoExample();
					condition.or().andSystemTypeEqualTo(SystemType.Common.getValue()).andCodeTypeEqualTo(BaseInfoType.USER_BASE_INFO_TYPE_LIST);
					condition.setOrderByClause("ORDER_FIELD asc");
					List<SystemBaseInfo> baseInfoList = commonMgSystemBiz.systemBaseInfoSelectObjects(condition);
					int k = 1;
					for (int i = 0; i < baseInfoList.size(); i++) {
						SystemBaseInfo baseInfo = baseInfoList.get(i);
						boolean hasPrivilege = false;
						if (!StringUtils.isNullOrEmpty(baseInfo.getCodeDesc())) {
							int priValue = Integer.parseInt(baseInfo.getCodeDesc());
							if (webUserRuntimeBiz.hasPrivilege(priValue, PrivilegeOperate.Execute)) {
								hasPrivilege = true;
							}
						} else {
							hasPrivilege = true;
						}
						if (hasPrivilege) {
							SystemMenu menu = new SystemMenu(newItem.getId() * 100 + k, newItem.getId(), "/system/baseInfoManage.action?codeType="
									+ baseInfo.getCodeId(), baseInfo.getCodeName(), 1, PrivilegeConfig.FUNC_BASE_INFO_MANGE, PrivilegeOperate.Read, "");
							newItem.getChildList().add(menu);
							k++;
						}
					}

				}

			}
			for (int i = menus.size() - 1; i >= 0; i--) {
				SystemMenu parentMenu = menus.get(i);
				if (parentMenu.getChildList().size() > 0) {
					for (int j = parentMenu.getChildList().size() - 1; j >= 0; j--) {
						SystemMenu childMenu = parentMenu.getChildList().get(j);
						if (!webUserRuntimeBiz.hasPrivilege(childMenu.getPrivilegeFunc(), childMenu.getPrivilegeOperate())) {
							parentMenu.getChildList().remove(j);
						}
					}
					if (parentMenu.getChildList().size() == 0) {
						menus.remove(i);
					}
				} else {
					if (!webUserRuntimeBiz.hasPrivilege(parentMenu.getPrivilegeFunc(), parentMenu.getPrivilegeOperate())) {
						menus.remove(i);
					}
				}
			}
		} catch (Exception e) {
			logger.error("getLoginUserMenus error: " + e.getMessage(), e);
		}
		return menus;
	}

	public List<NameValue> getRightMenus() {
		List<NameValue> list = new ArrayList<NameValue>();
		NameValue nv = null;
		nv = new NameValue("修改密码", "/h/changePwd.action");
		list.add(nv);
		nv = new NameValue("退出", "/h/logout.action");
		list.add(nv);
		return list;
	}

	public List<NameValue> getSwitchMenus() {
		List<NameValue> list = new ArrayList<NameValue>();
		NameValue nv = null;
		nv = new NameValue("测试一", "/h/nav!ajaxSwitchMenu.action?target=1");
		list.add(nv);
		nv = new NameValue("测试二", "/h/nav!ajaxSwitchMenu.action?target=2");
		list.add(nv);
		return list;
	}
}
