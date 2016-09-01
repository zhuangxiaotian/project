package topdeep.common.mg.entity.request;


public class SignInRequest extends BaseRequest{
	private String operatorName;
	private String loginName;
	private String loginPass;
	private String mobileTelephone;
	private String otherTelephone;
	private String operatorEmail;
	private String flag;
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPass() {
		return loginPass;
	}
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	public String getMobileTelephone() {
		return mobileTelephone;
	}
	public void setMobileTelephone(String mobileTelephone) {
		this.mobileTelephone = mobileTelephone;
	}
	public String getOtherTelephone() {
		return otherTelephone;
	}
	public void setOtherTelephone(String otherTelephone) {
		this.otherTelephone = otherTelephone;
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
	
	
}
