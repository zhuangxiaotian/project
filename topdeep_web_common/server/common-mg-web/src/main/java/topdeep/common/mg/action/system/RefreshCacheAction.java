package topdeep.common.mg.action.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.dao.manage.client.impl.ManageClientDao;
import topdeep.common.entity.constant.BaseInfoType;
import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.entity.db.SystemBaseInfoExample;
import topdeep.common.entity.db.SystemBaseInfoKey;
import topdeep.common.entity.manage.def.MSBaseOutput;
import topdeep.common.entity.manage.def.MSReloadAllInput;
import topdeep.common.entity.manage.def.MSReloadCacheInput;
import topdeep.common.entity.manage.def.MSReloadDictInput;
import topdeep.common.entity.manage.def.MSReloadSystemParamsInput;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.BaseRequest;
import topdeep.common.mg.entity.request.RefreshCacheRequest;
import topdeep.common.mg.entity.response.RefreshCacheResponse;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

/**
 * 
 * @ClassName: RefreshCacheAction
 * @Description: 刷新缓存
 * @author: jun.qin
 * @date: 2015年12月7日 下午4:56:55
 *
 */
@Controller
@RequestMapping("/system")
public class RefreshCacheAction extends BaseAction {

	@Autowired
	@Qualifier("manageClientDao")
	private ManageClientDao manageClientDao;

	/**
	 * 
	 * @Title: execute
	 * @Description: 跳转到刷新缓存页面
	 * @param: @param req
	 * @param: @param model
	 * @param: @return
	 * @return: String
	 * @throws
	 */
	@TopdeepMethodAttribute
	@RequestMapping("/refreshCacheManage")
	public String execute(BaseRequest req, Model model) {
		RefreshCacheResponse res = new RefreshCacheResponse();
		res.setTitle("刷新缓存");
		model.addAttribute("res", res);
		checkPrivilege(res, PrivilegeConfig.FUNC_REFRESH_CACHE_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		super.execute(req, res, false);
		if (res.isSuccess()) {
			return res.getTarget("/system/cache-refresh-success");
		}
		return res.getTarget("/common/tip");
	}

	/**
	 * 
	 * @Title: ajaxRefreshList
	 * @Description: 查询服务器列表
	 * @param: @param req
	 * @param: @return
	 * @return: RefreshCacheResponse
	 * @throws
	 */
	@TopdeepMethodAttribute
	@RequestMapping("/RefreshCacheManage!ajaxRefreshList")
	@ResponseBody
	public RefreshCacheResponse ajaxRefreshList(RefreshCacheRequest req) {
		RefreshCacheResponse res = new RefreshCacheResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_REFRESH_CACHE_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				SystemBaseInfoExample condition = new SystemBaseInfoExample();
				condition.or().andCodeTypeEqualTo(BaseInfoType.MOBILE_MANAGE_ADDRESS);
				condition.setOrderByClause("CODE_ID asc");
				List<SystemBaseInfo> list = commonMgSystemBiz.systemBaseInfoSelectObjects(condition);
				List<String> refreshCacheList = res.getRefreshCacheList();

				for (SystemBaseInfo systemBaseInfo : list) {
					refreshCacheList.add(systemBaseInfo.getCodeId());
				}
				res.setBaseInfoList(list);
			} catch (Exception e) {
				logger.error("查询失败" + e.getMessage(), e);
				res.setResult(false, e.getMessage());
			}
		}
		res.setTitle("刷新缓存");
		return res;
	}

	/**
	 * 
	 * @Title: ajaxRefresh
	 * @Description: 刷新缓存
	 * @param: @param req
	 * @param: @param model
	 * @param: @return
	 * @return: RefreshCacheResponse
	 * @throws
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/RefreshCacheManage!ajaxRefresh")
	@ResponseBody
	public RefreshCacheResponse ajaxRefresh(RefreshCacheRequest req, Model model) {
		RefreshCacheResponse res = new RefreshCacheResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_REFRESH_CACHE_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		try {
			if (res.isSuccess()) {
				logger.debug("=======ajaxRefresh.Target=" + req.getTarget());
				if (!StringUtils.isNullOrEmpty(req.getTarget())) {
					SystemBaseInfo baseInfo = commonMgSystemBiz.systemBaseInfoSelectByPrimaryKey(new SystemBaseInfoKey(req.getTarget(),
							BaseInfoType.MOBILE_MANAGE_ADDRESS, req.getSystemType()));
					if (baseInfo != null) {
						MSBaseOutput outputParam = null;
						if("c01".equals(req.getType())) {
							MSReloadSystemParamsInput inputParam = new MSReloadSystemParamsInput();
							inputParam.setServerUrl(baseInfo.getCodeName());
							outputParam = manageClientDao.reloadSystemParams(inputParam);
						} else if("c02".equals(req.getType())) {
							MSReloadCacheInput inputParam = new MSReloadCacheInput();
							inputParam.setServerUrl(baseInfo.getCodeName());
							outputParam = manageClientDao.reloadCache(inputParam);
//						} else if("c03".equals(req.getType())) {
//							MSUnbindCustomerInput inputParam = new MSUnbindCustomerInput();
//							inputParam.setServerUrl(baseInfo.getCodeName());
//							outputParam = manageClientDao.unbindCustomer(inputParam);
						} else if("c04".equals(req.getType())) {
							MSReloadDictInput inputParam = new MSReloadDictInput();
							inputParam.setServerUrl(baseInfo.getCodeName());
							outputParam = manageClientDao.reloadDict(inputParam);
						} else if("c05".equals(req.getType())) {
							MSReloadAllInput inputParam = new MSReloadAllInput();
							inputParam.setServerUrl(baseInfo.getCodeName());
							outputParam = manageClientDao.reloadAll(inputParam);
						}
						if (!"0000".equals(outputParam.getCode())) {
							res.setResult(false, baseInfo.getCodeId() + ":" + outputParam.getMsg());
						}
					}
				} else {
					SystemBaseInfoExample condition = new SystemBaseInfoExample();
					condition.or().andCodeTypeEqualTo(BaseInfoType.MOBILE_MANAGE_ADDRESS);
					condition.setOrderByClause("CODE_ID asc");
					List<SystemBaseInfo> list = commonMgSystemBiz.systemBaseInfoSelectObjects(condition);
					for (SystemBaseInfo item : list) {
						MSBaseOutput outputParam = null;
						if("c01".equals(req.getType())) {
							MSReloadSystemParamsInput inputParam = new MSReloadSystemParamsInput();
							inputParam.setServerUrl(item.getCodeName());
							outputParam = manageClientDao.reloadSystemParams(inputParam);
						} else if("c02".equals(req.getType())) {
							MSReloadCacheInput inputParam = new MSReloadCacheInput();
							inputParam.setServerUrl(item.getCodeName());
							outputParam = manageClientDao.reloadCache(inputParam);
//						} else if("c03".equals(req.getType())) {
//							MSUnbindCustomerInput inputParam = new MSUnbindCustomerInput();
//							inputParam.setServerUrl(item.getCodeName());
//							outputParam = manageClientDao.unbindCustomer(inputParam);
						} else if("c04".equals(req.getType())) {
							MSReloadDictInput inputParam = new MSReloadDictInput();
							inputParam.setServerUrl(item.getCodeName());
							outputParam = manageClientDao.reloadDict(inputParam);
						} else if("c05".equals(req.getType())) {
							MSReloadAllInput inputParam = new MSReloadAllInput();
							inputParam.setServerUrl(item.getCodeName());
							outputParam = manageClientDao.reloadAll(inputParam);
						}
						if (!"0000".equals(outputParam.getCode())) {
							res.setResult(false, item.getCodeId() + ":" + outputParam.getMsg());
							break;
						}
					}
				}
			}
		} catch (Exception ex) {
			res.setResult(false, ex.getMessage());
		}

		return res;
	}

}
