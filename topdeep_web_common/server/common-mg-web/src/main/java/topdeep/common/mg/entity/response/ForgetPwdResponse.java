package topdeep.common.mg.entity.response;

public class ForgetPwdResponse extends BaseResponse {
	private String loginName;

	
	private String flag;
	
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}



	
}
