/**
 * 
 */
package topdeep.commonfund.entity.base;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAnySetter;

/**
 * @author niexin
 *
 */
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2763436364292618569L;

	@JsonAnySetter
	public void handleUnknown(String key, Object value) {
		// do something: put to a Map; log a warning, whatever
	}

}
