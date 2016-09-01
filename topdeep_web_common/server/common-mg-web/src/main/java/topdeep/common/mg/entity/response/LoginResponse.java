package topdeep.common.mg.entity.response;

/**
 * 
 * @author shidewen
 * 
 */
public class LoginResponse extends BaseResponse {

	private static final long serialVersionUID = 7639032403398832630L;
	private boolean registerOpen;
	/**
	 * 登录成功后跳转的URL
	 */
	private String returnUrl = "";

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

	public boolean isRegisterOpen() {
		return registerOpen;
	}

	public void setRegisterOpen(boolean registerOpen) {
		this.registerOpen = registerOpen;
	}

}
