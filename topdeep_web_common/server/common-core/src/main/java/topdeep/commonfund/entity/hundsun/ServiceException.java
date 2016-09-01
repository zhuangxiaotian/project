/**
 * 
 */
package topdeep.commonfund.entity.hundsun;

/**
 * @author niexin
 *
 */
public class ServiceException extends Exception {

	private String orgErrorCode;
	
	/**
	 * 
	 */
	public ServiceException() {
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, String orgErrorCode){
		super(message);
		this.orgErrorCode = orgErrorCode;
	}
	
	/**
	 * @param arg0
	 */
	public ServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public ServiceException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ServiceException(String message, Throwable arg1) {
		super(message, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the orgErrorCode
	 */
	public String getOrgErrorCode() {
		return orgErrorCode;
	}

	/**
	 * @param orgErrorCode the orgErrorCode to set
	 */
	public void setOrgErrorCode(String orgErrorCode) {
		this.orgErrorCode = orgErrorCode;
	}
//	private static String getErrorCodeMessage(String errorCode) {
//		if (errorCode.equals("1226")) {
//			return "当日最高累计取现金额为50万元";
//		}
//		
//		if (errorCode.equals("ETS-9B119")) {
//			return "您已输入5次错误密码，您的帐户将被锁定2小时";
//		}
//		return "系统维护";
//	}
}
