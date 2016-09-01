package topdeep.common.mg.action.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.entity.db.SystemAdminExample;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.VisitException;
import topdeep.common.mg.entity.request.ChangePwdRequest;
import topdeep.common.mg.entity.response.ChangePwdResponse;

import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = {
		"/h", "/home"
})
public class ChangePwdAction extends BaseAction {

	@TopdeepMethodAttribute
	@RequestMapping(value = "/changePwd")
	public String execute(ChangePwdRequest req, Model model) throws VisitException {
		ChangePwdResponse res = new ChangePwdResponse();
		super.execute(req, res, false, false);
		if (res.isSuccess()) {
			res.setTitle("修改密码");
			res.setTipMessage("");
			res.setNeedNav(false);
			model.addAttribute("res", res);
		}
		return getSkin() + "/home/change-pwd-input";

	}

	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping("/changePwd!ajaxChangePwd")
	@ResponseBody
	public ChangePwdResponse ajaxChangePwd(ChangePwdRequest req) {
		ChangePwdResponse res = new ChangePwdResponse();
		super.execute(req, res, true, true);
		if (res.isSuccess()) {
			req.checkAjaxChangePwdInput(res);
		}
		if (res.isSuccess()) {
			try {
				Integer errorTimes = (Integer) webUserRuntimeBiz.get("changPwdErrorTimes");
				if (errorTimes == null) {
					errorTimes = 0;
				}
				if (errorTimes < 3) {
					String loginPass = req.getLoginPass();
					String newLoginPass = req.getNewLoginPass();

					SystemAdminExample example = new SystemAdminExample();
					example.or().andIdEqualTo(webUserRuntimeBiz.getLoginUserId());
					SystemAdmin operators = commonMgSystemBiz.selectSingleObject(commonMgSystemBiz.systemAdminSelectObjects(example));
					if (operators != null) {
						String MD5LoginPass = commonMgSystemBiz.buildLoginPassword(loginPass, operators.getLoginPassSalt());
						if (MD5LoginPass.equals(operators.getLoginPass())) {
							String MD5NewLoginPass = commonMgSystemBiz.buildLoginPassword(newLoginPass, operators.getLoginPassSalt());
							operators.setLoginPass(MD5NewLoginPass);
							commonMgSystemBiz.systemAdminUpdateSelective(operators);
							res.setResult(true, "修改成功");
						} else {
							webUserRuntimeBiz.set("changPwdErrorTimes", errorTimes + 1);
							res.setErrorTimes(errorTimes + 1);
							res.setResult(false, "您已验证失败" + errorTimes + "次，超过三次请重新登录后再修改");
						}
					} else {
						webUserRuntimeBiz.set("changPwdErrorTimes", errorTimes + 1);
						res.setErrorTimes(errorTimes + 1);
						res.setResult(false, "您已验证失败" + errorTimes + "次，超过三次请重新登录后再修改");
					}
				} else {
					res.setErrorTimes(errorTimes);
					res.setResult(false, "请重新登录");
				}
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("changePwd!ajaxChangePwd", e);
			}
		}
		return res;

	}

}
