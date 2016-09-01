package topdeep.common.mg.action.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.db.SystemRoles;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.request.PrivilegeRequest;
import topdeep.common.mg.entity.response.PrivilegeViewResponse;

import common.web.annotation.TopdeepMethodAttribute;


@Controller
@RequestMapping(value = "/system")
public class PrivilegeAction extends BaseAction {

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/ajaxQueryPrivilegeList")
	@ResponseBody
	public PrivilegeViewResponse ajaxQueryPrivilegeList(PrivilegeRequest req){
		PrivilegeViewResponse res = new PrivilegeViewResponse();
		super.execute(req, res);
		if(res.isSuccess()){
			String currentPrivileges = "";
			try {
				if (!req.getRoleId().equals("")) {
					SystemRoles roles = commonMgSystemBiz.systemRolesSelectByPrimaryKey(String.valueOf(req.getRoleId()));
					if (roles != null) {
						currentPrivileges = roles.getRolePrivileges();
					}
				}
				res.setPrivilegeGroupList(commonMgSystemBiz.queryPrivilegeGroupList(currentPrivileges));
			} catch (Exception e) {
				logger.error("ajaxQueryPrivilegeList error: ", e);
			}
			
		}
		return res;
	}

}
