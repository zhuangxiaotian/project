package topdeep.common.mg.entity.request;

import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.response.ForgetPwdResponse;

public class ForgetPwdRequest extends BaseRequest{
	private String loginName;
	
	private String loginPass;
	
	private String operatorEmail;

	private String flag;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getOperatorEmail() {
		return operatorEmail;
	}

	public void setOperatorEmail(String operatorEmail) {
		this.operatorEmail = operatorEmail;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public void checkUserConfirmInput(BaseResponse res) {
		res.checkStringEmpty(loginName, "用户名为空");
		res.checkStringEmpty(operatorEmail, "邮箱为空");
		
	}

	public void checkResetPwdInput(ForgetPwdResponse res) {
		res.checkStringEmpty(flag, "验证信息为空");
		
	}

	public void checkAjaxResetPwdInput(BaseResponse res) {
		res.checkStringEmpty(flag, "验证信息为空");
		res.checkStringEmpty(loginPass, "登陆密码为空");
		
	}
	
	

}
