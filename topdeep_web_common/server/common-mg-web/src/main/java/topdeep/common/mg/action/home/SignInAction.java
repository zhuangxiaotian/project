package topdeep.common.mg.action.home;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.entity.db.SystemMsgSend;
import topdeep.common.entity.db.SystemMsgSendExample;
import topdeep.common.entity.db.SystemValidInfo;
import topdeep.common.entity.db.SystemValidInfoExample;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.request.BaseExternalRequest;
import topdeep.common.mg.entity.request.SignInRequest;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.response.SignInResponse;
import topdeep.common.util.UUIDGenerator;

import common.web.annotation.TopdeepMethodAttribute;

/**
 * 用户注册
 * 
 * @author develop
 * 
 */
@Controller
@RequestMapping(value = {
		"/h", "/home"
})
public class SignInAction extends BaseAction {

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "/signIn", method = {
		RequestMethod.GET
	})
	public String execute(BaseExternalRequest req, Model model) throws Exception {
		BaseResponse res = new BaseResponse();
		super.execute(req, res, false, false);
		res.setTitle("用户注册");
		res.setTipMessage("");
		res.setNeedNav(false);
		model.addAttribute("res", res);
		if (commonMgSystemBiz.existsSystemAdmin() && !commonMgSystemParamBiz.getCommonMgApplicationParam().isRegisterSuperAdmin()) {
			res.setResult(false, "用户注册功能已关闭");
		}
		if (res.isSuccess()) {
			webUserRuntimeBiz.logout();
			super.execute(req, res, false, false);
		}
		if (res.isSuccess()) {
			return res.getTarget("/home/signin-input");
		} else {
			return res.getTarget("/common/tip");
		}
	}

	@TopdeepMethodAttribute(loginRequired = false, isAjaxMethod = true)
	@RequestMapping(value = "/ajaxSignIn", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public SignInResponse ajaxSignIn(SignInRequest req) throws Exception {
		SignInResponse res = new SignInResponse();
		super.execute(req, res, false, true);
		webUserRuntimeBiz.logout();
		if (commonMgSystemBiz.existsSystemAdmin() && !commonMgSystemParamBiz.getCommonMgApplicationParam().isRegisterSuperAdmin()) {
			res.setResult(false, "用户注册功能已关闭");
		}
		if (res.isSuccess()) {
			try {
				SystemAdmin operator = null;
				operator = getNewAdmin(req);
				if (commonMgSystemParamBiz.getApplicationParam().isRegisterValidEmail()) {
					operator.setState("0");
				} else {
					operator.setState("1");
				}
				commonMgSystemBiz.userSignin(operator);
				if ("0".equals(operator.getState())) {
					res.setSendEmail(true);
					res.setResult(true, "注册成功，需要您前往邮箱认证。");
				} else {
					res.setResult(true, "注册成功，请前往登录页登录");
				}

			} catch (Exception e) {
				logger.error("注册失败: " + e);
				res.setResult(false, "注册失败: " + e.getMessage());
			}
		}
		return res;
	}

	@TopdeepMethodAttribute(loginRequired = false, isAjaxMethod = false)
	@RequestMapping(value = "/userActivity", method = {
		RequestMethod.GET
	})
	public String userActivity(SignInRequest req, Model model) {
		SignInResponse res = new SignInResponse();
		super.execute(req, res, false, false);
		String flag = req.getFlag();
		SystemMsgSendExample msCondition = new SystemMsgSendExample();
		msCondition.createCriteria().andContentEqualTo(flag);
		SystemValidInfoExample viCondition = new SystemValidInfoExample();
		viCondition.createCriteria().andRandomValueEqualTo(flag);
		try {
			List<SystemMsgSend> msList = commonMgSystemBiz.systemMsgSendSelectObjects(msCondition);
			List<SystemValidInfo> viList = commonMgSystemBiz.systemValidInfoSelectObjects(viCondition);
			if (msList.size() != 1 || viList.size() != 1) {
				res.setResult(false, "对不起，无效的链接。");
				res.setTitle("注册失败");
			} else {
				SystemMsgSend msg = msList.get(0);
				SystemValidInfo info = viList.get(0);
				SystemAdmin operator = commonMgSystemBiz.systemAdminSelectByPrimaryKey(info.getValidUserIdNo());
				if (new Date().getTime() > info.getValidTime().getTime()) {
					res.setResult(false, "对不起，此链接已失效。");
					res.setTitle("注册失败");
					if (operator.getState().equals("0")) {
						msg.setSendState("1");
						String newRandomStr = UUIDGenerator.getUUID24();
						msg.setContent(newRandomStr);
						info.setRandomValue(newRandomStr);
						info.setCreateTime(new Date());
						info.setValidTime(new Date(new Date().getTime() + commonMgSystemParamBiz.getApplicationParam().getValidTime()));
						commonMgSystemBiz.systemValidInfoUpdate(info);
						commonMgSystemBiz.systemMsgSendUpdate(msg);
						res.setTitle("注册失败");
						res.setResult(false, "验证已过期，系统已重新发送注册邮件到您的邮箱。");
					}
				} else {

					if (operator == null) {
						res.setResult(false, "非法操作，没有该用户");
						res.setTitle("注册失败");

					} else {
						if (operator.getState().equals("1")) {
							res.setTitle("注册失败");
							res.setResult(false, "您已经验证过了，请登录。");
						} else {
							operator.setState("1");
							info.setValidState("1");
							commonMgSystemBiz.systemAdminUpdate(operator);
							commonMgSystemBiz.systemValidInfoUpdate(info);
							res.setTitle("注册成功");
							res.setResult(true, "注册成功");
						}
					}
				}
			}

		} catch (Exception e) {

		}
		res.setNeedNav(false);
		model.addAttribute("res", res);
		return getSkin() + "/home/user-activity";
	}

	// 生成新注册用户
	private SystemAdmin getNewAdmin(SignInRequest req) {
		String operatorName = req.getOperatorName();
		String loginName = req.getLoginName();
		String loginPass = req.getLoginPass();
		String MD5LoginPass = "";
		String loginPassSalt = UUIDGenerator.getUUID24();
		try {
			// MD5LoginPass = commonMgSystemBiz.buildLoginPassword(loginPass, commonMgSystemParamBiz.getMgApplicationParam().getLoginPassSalt());
			MD5LoginPass = commonMgSystemBiz.buildLoginPassword(loginPass, loginPassSalt);
		} catch (UnsupportedEncodingException e) {
			logger.error("QrcodeManageBiz.digest() exception: " + e);
			throw new RuntimeException(e);
		}
		String mobileTelephone = req.getMobileTelephone();
		String otherTelephone = req.getOtherTelephone();
		String operatorEmail = req.getOperatorEmail();
		SystemAdmin operator = new SystemAdmin();
		operator.setId(UUIDGenerator.getUUID24());
		operator.setName(operatorName);
		operator.setState("0");
		operator.setLoginName(loginName);
		operator.setLoginPass(MD5LoginPass);
		operator.setLoginPassSalt(loginPassSalt);
		operator.setMobileTelephone(mobileTelephone);
		operator.setOtherTelephone(otherTelephone);
		operator.setLoginEmail(operatorEmail);
		operator.setLastLogintime(new Date());
		operator.setLastLoginaddress("");
		operator.setMemo("");
		operator.setParentAdminId(UUIDGenerator.PARENT_ID);
		operator.setCreateTime(new Date());
		operator.setModifyTime(new Date());
		operator.setRowVersion(0);
		operator.setCreateTime(new Date());
		operator.setModifyTime(new Date());
		return operator;
	}

}
