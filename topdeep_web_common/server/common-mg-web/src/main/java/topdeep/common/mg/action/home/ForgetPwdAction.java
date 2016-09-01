package topdeep.common.mg.action.home;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.constant.EnumType.TargetSystemType;
import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.entity.db.SystemAdminExample;
import topdeep.common.entity.db.SystemValidInfo;
import topdeep.common.entity.db.SystemValidInfoExample;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.VisitException;
import topdeep.common.mg.entity.request.BaseExternalRequest;
import topdeep.common.mg.entity.request.ForgetPwdRequest;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.response.ForgetPwdResponse;

import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = {
		"/h", "/home"
})
public class ForgetPwdAction extends BaseAction {

	/**
	 * 填写登录名邮箱页面
	 * 
	 * @param req
	 * @param model
	 * @return
	 * @throws VisitException
	 */
	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "/forgetPwd")
	public String execute(BaseExternalRequest req, Model model) throws VisitException {
		BaseResponse res = new BaseResponse();
		webUserRuntimeBiz.logout();
		super.execute(req, res, false, false);
		if (!res.isSuccess()) {
			throw new VisitException(res.getTipMessage());
		}
		res.setTitle("忘记密码页");
		res.setTipMessage("");
		model.addAttribute("res", res);
		return getSkin() + "/home/forget-pwd-input";
	}

	/**
	 * 确认用户
	 *
	 * @param req
	 * @param model
	 * @return
	 */
	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping("/forgetPwd!ajaxUserConfirm")
	@ResponseBody
	public BaseResponse ajaxUserConfirm(ForgetPwdRequest req, Model model) {
		BaseResponse res = new BaseResponse();
		super.execute(req, res, false, true);
		if (res.isSuccess()) {
			req.checkUserConfirmInput(res);
		}
		if (res.isSuccess()) {
			try {
				SystemAdminExample example = new SystemAdminExample();
				example.createCriteria().andLoginNameEqualTo(req.getLoginName()).andLoginEmailEqualTo(req.getOperatorEmail());
				SystemAdmin operator = commonMgSystemBiz.selectSingleObject(commonMgSystemBiz.systemAdminSelectObjects(example));
				if (operator != null) {
					commonMgSystemBiz.sendForgetPasswordValidInfo(operator.getId(), operator.getLoginEmail(), TargetSystemType.Default.getValue());
					res.setResult(true, "请前往邮箱确认");
				} else {
					res.setResult(false, "找不到该邮箱用户");
				}
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("forgetPwd!ajaxUserConfirm error!", e);
			}
		}
		res.setTitle("用户验证");
		return res;
	}

	/**
	 * 重置密码页面
	 *
	 * @param req
	 * @param model
	 * @return
	 * @throws VisitException
	 */
	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping("/forgetPwd!resetPwd")
	public String resetPwd(ForgetPwdRequest req, Model model) throws VisitException {
		ForgetPwdResponse res = new ForgetPwdResponse();
		super.execute(req, res, false, false);
		if (!res.isSuccess()) {
			throw new VisitException(res.getTipMessage());
		}
		if (res.isSuccess()) {
			req.checkResetPwdInput(res);
		}
		if (res.isSuccess()) {
			try {
				String flag = req.getFlag();
				SystemValidInfoExample infoExample = new SystemValidInfoExample();
				infoExample.or().andRandomValueEqualTo(flag).andValidStateEqualTo("0").andValidTimeGreaterThan(new Date());
				SystemValidInfo info = commonMgSystemBiz.selectSingleObject(commonMgSystemBiz.systemValidInfoSelectObjects(infoExample));
				if (info != null) {
					res.setResult(true, "验证成功");
					res.setFlag(flag);
					model.addAttribute("res", res);
				} else {
					res.setResult(false, "验证信息无效或已过期");
				}
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("forgetPwd!resetPwd error!", e);
			}
		}
		res.setTitle("重置密码");
		model.addAttribute("res", res);
		return getSkin() + "/home/reset-pwd-input";
	}

	/**
	 * 重置密码
	 *
	 * @param req
	 * @param model
	 * @return
	 */
	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping("/forgetPwd!ajaxResetPwd")
	@ResponseBody
	public BaseResponse ajaxResetPwd(ForgetPwdRequest req, Model model) {
		BaseResponse res = new BaseResponse();
		super.execute(req, res, false, true);
		if (res.isSuccess()) {
			req.checkAjaxResetPwdInput(res);
		}
		if (res.isSuccess()) {
			try {
				commonMgSystemBiz.systemAdminPasswordReset(req.getFlag(), req.getLoginPass());
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("forgetPwd!ajaxResetPwd error! ", e);
			}
		}
		res.setTitle("重置密码");
		return res;
	}
}
