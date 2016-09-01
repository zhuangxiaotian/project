/**
 * 
 */
package topdeep.commonfund.entity.gateway;

/**
 * @author niexin
 *
 */
public class GatewayServiceException extends Exception {

	private String errorCode;
	
	public GatewayServiceException(String errorCode, String msg){
		super(msg);
		this.errorCode = errorCode;
	}
	
	/**
	 * 
	 */
	public GatewayServiceException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public GatewayServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public GatewayServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public GatewayServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
