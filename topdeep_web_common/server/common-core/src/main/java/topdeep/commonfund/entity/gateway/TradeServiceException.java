/**
 * 
 */
package topdeep.commonfund.entity.gateway;

/**
 * @author niexin
 *
 */
@SuppressWarnings("serial")
public class TradeServiceException extends Exception {
	private String orgErrorCode;

	public TradeServiceException(String orgErrorCode, String msg){
		super(msg);
		this.orgErrorCode = orgErrorCode;
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
}
