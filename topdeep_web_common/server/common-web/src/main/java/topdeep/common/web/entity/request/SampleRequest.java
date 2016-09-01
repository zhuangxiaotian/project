/**
 * 
 */
package topdeep.common.web.entity.request;

/**
 * @author niexin
 *
 */
public class SampleRequest extends BaseExternalRequest {
	private String type = "forms";

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
