package topdeep.common.mg.action.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.db.SystemPrivilege;
import topdeep.common.entity.db.SystemPrivilegeExample;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.BaseRequest;
import topdeep.common.mg.entity.request.PrivilegeRequest;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.response.PrivilegeResponse;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

/**
 * 
 * @author shidewen
 * 
 */
@Controller
@RequestMapping(value = "/system")
public class PrivilegeManageAction extends BaseAction {

	@TopdeepMethodAttribute
	@RequestMapping("/privilegeManage")
	public String execute(BaseRequest req, Model model) {
		BaseResponse res = new BaseResponse();
		model.addAttribute("res", res);
		super.execute(req, res);
		checkPrivilege(res, PrivilegeConfig.FUNC_PRIVILEGE_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		res.setTitle("权限");
		return res.getTarget("/system/privilege-success");
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/privilegeManage!ajaxQuery", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public PrivilegeResponse ajaxQuery(PrivilegeRequest request) {
		PrivilegeResponse res = new PrivilegeResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_PRIVILEGE_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(request, res);
		}
		if (res.isSuccess()) {
			try {
				SystemPrivilegeExample example = new SystemPrivilegeExample();
				example.setOrderByClause("FUNC_PARENT asc, FUNC_ORDER asc");
				List<SystemPrivilege> privilegeList = commonMgSystemBiz.systemPrivilegeSelectObjects(example);
				List<SystemPrivilege> resultList = new ArrayList<SystemPrivilege>();
				for (SystemPrivilege item : privilegeList) {
					if (item.getFuncParent() == 0) {
						resultList.add(item);
						for (SystemPrivilege item1 : privilegeList) {
							if ((int) item1.getFuncParent() == (int) item.getFuncPrivilege()) {
								resultList.add(item1);
							}
						}
					}
				}
				res.setPrivilege(resultList);
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("privilegeManage!ajaxQuery error: " + e.getMessage() + e);
			}
		}
		res.setTitle("权限");
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/privilegeManage!ajaxSave", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public PrivilegeResponse ajaxSave(@RequestBody PrivilegeRequest req) {
		PrivilegeResponse res = new PrivilegeResponse();
		if (res.isSuccess()) {
			super.checkPrivilege(res, PrivilegeConfig.FUNC_PRIVILEGE_MANAGE, PrivilegeOperate.Write);
		}
		if (res.isSuccess()) {
			try {
				boolean newObj = false;
				SystemPrivilege newItem = null;
				if (res.isSuccess()) {
					if (req.getInput().getFuncPrivilege() > 0 && req.getInput().getFuncPrivilege() < 100000000) {
						newItem = commonMgSystemBiz.systemPrivilegeSelectByPrimaryKey(req.getInput().getFuncPrivilege());
						if (newItem == null) {
							res.setResult(false, "无效的权限值");
						}
					} else {
						newObj = true;
					}
				}
				if (res.isSuccess()) {
					if (newObj) {
						newItem = new SystemPrivilege();
						if (req.getInput().getFuncParent() == 0) {
							newItem.setFuncPrivilege(commonMgSystemBiz.nextCustomPrivilegeValue(true));
						} else {
							newItem.setFuncPrivilege(commonMgSystemBiz.nextCustomPrivilegeValue(false));
						}

						newItem.setFuncOrder(commonMgSystemBiz.nextPrivilegeOrder(req.getInput().getFuncParent()));
					}
					newItem.setFuncName(req.getInput().getFuncName());
					newItem.setFuncOperate(req.getInput().getFuncOperate());
					newItem.setFuncParent(req.getInput().getFuncParent());
					newItem.setRowVersion(0);
					if (newObj) {
						commonMgSystemBiz.systemPrivilegeInsert(newItem);
					} else {
						commonMgSystemBiz.systemPrivilegeUpdate(newItem);
					}
					res.setOutput(newItem);
				}
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("privilegeManage!ajaxQuery error: " + e.getMessage() + e);
			}
		}
		res.setTitle("权限");
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/privilegeManage!ajaxDelete")
	@ResponseBody
	public PrivilegeResponse ajaxDelete(PrivilegeRequest req) {
		PrivilegeResponse res = new PrivilegeResponse();
		super.execute(req, res);
		if (res.isSuccess()) {
			super.checkPrivilege(res, PrivilegeConfig.FUNC_PRIVILEGE_MANAGE, PrivilegeOperate.Delete);
		}
		if (res.isSuccess()) {
			try {
				SystemPrivilegeExample example = new SystemPrivilegeExample();
				if (null != req.getInput().getFuncPrivilege()) {
					example.or().andFuncParentEqualTo(req.getInput().getFuncPrivilege());
					List<SystemPrivilege> list = commonMgSystemBiz.systemPrivilegeSelectObjects(example);
					if (list.isEmpty()) {
						commonMgSystemBiz.systemPrivilegeDeleteByPrimaryKey(req.getInput().getFuncPrivilege());
					} else {
						res.setResult(false, "请先删除子项");
					}

				}
			} catch (Exception e) {
				res.setResult(false, "操作失败");
				logger.error("execute privilegeManage!ajaxDelete :" + e.getMessage(), e);
			}
		}
		res.setTitle("权限");
		return res;
	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/privilegeManage!ajaxMove")
	@ResponseBody
	public PrivilegeResponse ajaxMove(PrivilegeRequest req) {
		PrivilegeResponse res = new PrivilegeResponse();
		super.execute(req, res);
		if (res.isSuccess()) {
			super.checkPrivilege(res, PrivilegeConfig.FUNC_PRIVILEGE_MANAGE, PrivilegeOperate.Write);
		}
		if (res.isSuccess()) {
			try {
				boolean ret = commonMgSystemBiz.privilegeMove((int) req.getInput().getFuncPrivilege(), req.isMoveUp());
				res.setResult(ret, "");
			} catch (Exception e) {
				res.setResult(false, "操作失败");
				logger.error("execute privilegeManage!ajaxDelete :" + e.getMessage(), e);
			}
		}
		res.setTitle("权限");
		return res;
	}

	/**
	 * 此操作将删除所有的权限组定义，恢复系统默认的权限组定义，所有的自定义权限将被归类到同一个自定义组中
	 * 
	 * @param req
	 * @return
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/privilegeManage!ajaxInitGroup")
	@ResponseBody
	public PrivilegeResponse ajaxInitGroup(PrivilegeRequest req) {
		PrivilegeResponse res = new PrivilegeResponse();
		super.execute(req, res);
		if (res.isSuccess()) {
			super.checkPrivilege(res, PrivilegeConfig.FUNC_PRIVILEGE_MANAGE, PrivilegeOperate.Write);
		}
		if (res.isSuccess()) {
			try {
				commonMgSystemBiz.initPrivilegeGroup();
			} catch (Exception e) {
				res.setResult(false, "操作失败");
				logger.error("execute privilegeManage!ajaxDelete :" + e.getMessage(), e);
			}
		}
		res.setTitle("权限");
		return res;
	}

}
