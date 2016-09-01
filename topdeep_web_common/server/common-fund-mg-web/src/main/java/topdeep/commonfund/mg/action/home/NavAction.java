package topdeep.commonfund.mg.action.home;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.constant.NameValue;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.request.BaseRequest;
import topdeep.common.mg.entity.response.NavResponse;
import topdeep.common.mg.entity.system.SystemMenu;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
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
		int k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "/home/index.action", "主页", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-cog fa-fw");
		MENU_LIST.add(parentMenu);

		k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "web控件", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-file-text-o");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/ui/sample.action?type=icons", "icons", 1, FundPrivilegeConfig.FUNC_NOT_NEED,
				PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/ui/sample.action?type=forms", "forms", 1, FundPrivilegeConfig.FUNC_NOT_NEED,
				PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/ui/sample.action?type=buttons", "buttons", 1, FundPrivilegeConfig.FUNC_NOT_NEED,
				PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/ui/sample.action?type=tabs", "tabs", 1, FundPrivilegeConfig.FUNC_NOT_NEED,
				PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/ui/sample.action?type=confirms", "confirms", 1,
				FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "系统管理", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/adminManage.action", "用户管理", 1, FundPrivilegeConfig.FUNC_OPERATOR_MANAGE,
				PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/rolesManage.action", "角色管理", 1, FundPrivilegeConfig.FUNC_ROLE_MANAGE,
				PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/privilegeManage.action", "权限管理", 1,
				FundPrivilegeConfig.FUNC_PRIVILEGE_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "管理工具", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/whiteListsManage.action", "白名单管理", 1,
				FundPrivilegeConfig.FUNC_WHITELISTS_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/bankCardBinManage.action", "银行卡Bin管理", 1,
				FundPrivilegeConfig.FUNC_BANK_CARD_BIN_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "系统参数", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/systemParam/ecTradeSeatManage.action", "交易渠道管理", 1,
				FundPrivilegeConfig.FUNC_CHANNEL_MANAGE, PrivilegeOperate.Read, "");

		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/systemParam/tradeParamConvertManage.action", "交易参数转换", 1,
				FundPrivilegeConfig.FUNC_TRADE_PARAM_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "业务统计分析", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/customerLogManage.action", "业务日志", 1,
				FundPrivilegeConfig.FUNC_CUSTOMER_LOG_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/customerLogStatistics.action", "业务量统计", 1,
				FundPrivilegeConfig.FUNC_CUSTOMER_LOG_STATISTICS_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "公告通知", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/fund_notice/noticeManage.action", "公告通知", 1,
				FundPrivilegeConfig.FUNC_NOTICE_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "客户端管理", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/clientVersionManage.action", "版本管理", 1,
				FundPrivilegeConfig.FUNC_CLIENT_VERSION_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/fund/clientActivationManage.action", "激活分析", 1,
				FundPrivilegeConfig.FUNC_CLIENT_ACTIVATION_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/clientBindInfoManage.action", "绑定查询", 1,
				FundPrivilegeConfig.FUNC_BIND_INFO_QUERY, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		k = 1;
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "系统工具", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-dashboard fa-fw");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/refreshCacheManage.action", "刷新缓存", 1,
				FundPrivilegeConfig.FUNC_REFRESH_CACHE_MANAGE, PrivilegeOperate.Read, "");
		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "基金管理", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "fa fa-file-text-o");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/trade/fundCategoryManage.action", "基金分类", 1,
				FundPrivilegeConfig.FUNC_CATEGORY_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/trade/fundInfoManage.action", "基金信息", 1, FundPrivilegeConfig.FUNC_INFO_MANAGE,
				PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

		parentMenu = new SystemMenu(parentMenuIdSn++, 0, "", "微信管理", 0, FundPrivilegeConfig.FUNC_NOT_NEED, PrivilegeOperate.Read, "");
		MENU_LIST.add(parentMenu);
		menu = new SystemMenu(parentMenu.getId() * 10 + k++, parentMenu.getId(), "/system/bindInfoManage.action", "绑定用户", 1,
				FundPrivilegeConfig.FUNC_BIND_INFO_MANAGE, PrivilegeOperate.Read, "");
		parentMenu.addChildMenu(menu);

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

	public List<SystemMenu> getLoginUserMenus() {
		List<SystemMenu> menus = new ArrayList<SystemMenu>();
		try {
			for (SystemMenu item : MENU_LIST) {
				SystemMenu newItem = new SystemMenu(item.getId(), item.getParentId(), item.getUrl(), item.getName(), item.getLevel(), item.getIconClass());
				menus.add(newItem);
				for (SystemMenu item1 : item.getChildList()) {
					newItem.getChildList().add(item1);
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
		nv = new NameValue("测试一", "#");
		list.add(nv);
		nv = new NameValue("测试二", "#");
		list.add(nv);
		return list;
	}
}
