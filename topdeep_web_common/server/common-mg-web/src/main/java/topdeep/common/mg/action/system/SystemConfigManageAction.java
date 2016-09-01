package topdeep.common.mg.action.system;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;
import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemConfig;
import topdeep.common.entity.db.SystemConfigExample;
import topdeep.common.entity.db.SystemConfigKey;
import topdeep.common.entity.db.SystemParam;
import topdeep.common.entity.db.SystemParamExample;
import topdeep.common.entity.db.SystemParamKey;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.ParamRequest;
import topdeep.common.mg.entity.request.SystemConfigRequest;
import topdeep.common.mg.entity.response.ParamResponse;
import topdeep.common.mg.entity.response.SystemConfigResponse;

@Controller
@RequestMapping(value = "/system")
public class SystemConfigManageAction extends BaseAction{

	@TopdeepMethodAttribute
	@RequestMapping(value = "systemConfigManage", method = {
		RequestMethod.GET
	})
	public String execute(SystemConfigRequest req, Model model) throws Exception {
		SystemConfigResponse res = new SystemConfigResponse();
		super.execute(req, res);
		model.addAttribute("res", res);
		checkPrivilege(res, PrivilegeConfig.FUNC_SYSTEM_CONFIG_MANAGE, PrivilegeOperate.Read);
		res.setTitle("参数设置");
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		return res.getTarget("/system/system-config-manage-success");
	}
	
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/systemConfigManage!ajaxQuery")
	@ResponseBody
	public SystemConfigResponse ajaxQuery(SystemConfigRequest req) {
		SystemConfigResponse res = new SystemConfigResponse();
		SystemConfigExample example = new SystemConfigExample();
		checkPrivilege(res, PrivilegeConfig.FUNC_SYSTEM_CONFIG_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
				example.or().andSystemParamDescLike("%" + req.getSearchKeyword() + "%");
				example.or().andSystemParamNameLike("%" + req.getSearchKeyword() + "%");
				example.or().andSystemParamValueLike("%" + req.getSearchKeyword() + "%");
			}
			List<SystemConfig> systemConfigList = null;
			try {
				example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				systemConfigList = commonMgSystemBiz.systemConfigSelectObjects(example);
				int count = commonMgSystemBiz.systemConfigQuerySelectObjectsCount(example);
				res.setSystemConfigList(systemConfigList);
				if (!systemConfigList.isEmpty()) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, 0, 0);
				}
			} catch (Exception e) {
				logger.error("systemConfigManage!ajaxQuery error: " + e.getMessage(), e);
				res.setResult(false, "参数查询失败");
			}
			res.setTitle("参数查询");
		}
		return res;
	}
	
	
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value="/systemConfigManage!ajaxSave")
	@ResponseBody
	public SystemConfigResponse ajaxSave(SystemConfigRequest req) {
		SystemConfigResponse res = new SystemConfigResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_SYSTEM_CONFIG_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if(res.isSuccess()){
			
		}
		if (res.isSuccess()) {
			SystemConfigKey key = new SystemConfigKey();
			key.setSystemParamCategory(req.getSystemParamCategory());
			key.setSystemParamCode(req.getSystemParamCode());
			try {
				SystemConfig config = commonMgSystemBiz.systemConfigSelectByPrimaryKey(key);
				if(config!= null ){
					config.setSystemParamValue(req.getSystemParamValue());
					config.setModifyTime(new Date());
					commonMgSystemBiz.systemConfigUpdate(config);
				}
			} catch (Exception e) {
				logger.error("systemConfigManage!ajaxSave error: " + e.getMessage(), e);
				res.setResult(false, "参数设置失败");
			}
			res.setTitle("参数设置");
		}
		return res;
	}
}
