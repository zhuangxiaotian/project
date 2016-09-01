package topdeep.common.mg.entity.request;

import topdeep.common.mg.entity.response.BaseResponse;

public class ChangePwdRequest extends BaseRequest {

	private String loginPass;

	private String loginId;

	private String newLoginPass;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getNewLoginPass() {
		return newLoginPass;
	}

	public void setNewLoginPass(String newLoginPass) {
		this.newLoginPass = newLoginPass;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public void checkAjaxChangePwdInput(BaseResponse res) {
		res.checkStringEmpty(loginPass, "密码不能为空");
		res.checkStringEmpty(newLoginPass, "新密码不能为空");

	}

}
