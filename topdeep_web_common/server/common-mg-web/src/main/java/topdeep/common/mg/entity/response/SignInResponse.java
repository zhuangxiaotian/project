package topdeep.common.mg.entity.response;

public class SignInResponse extends BaseResponse{

	/**
	 * 是否发送验证邮件
	 */
	private boolean sendEmail = false;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return the sendEmail
	 */
	public boolean isSendEmail() {
		return sendEmail;
	}

	/**
	 * @param sendEmail the sendEmail to set
	 */
	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

}
