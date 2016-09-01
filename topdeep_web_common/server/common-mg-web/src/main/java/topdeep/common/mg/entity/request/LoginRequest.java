package topdeep.common.mg.entity.request;

import topdeep.common.mg.entity.response.BaseResponse;

/**
 * 
 * @author shidewen
 * 
 */
public class LoginRequest extends BaseRequest {
	private String username;
	private String password;
	/**
	 * 登录后返回的地址
	 */
	private String returnUrl;

	public boolean checkAjaxLoginInput(BaseResponse res) {
		super.checkInput(res);
		res.checkStringEmpty(username, "请输入用户名");
		res.checkStringEmpty(password, "请输入密码");
		return res.isSuccess();
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the returnUrl
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * @param returnUrl the returnUrl to set
	 */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
}
