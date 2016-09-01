/**
 * 
 */
package topdeep.commonfund.entity.gateway.def;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niexin
 *
 */
public class ISMultiOutput extends ISBaseOutput {
	private List<ISBaseOutput> outputList = new ArrayList<ISBaseOutput>();

	/**
	 * @return the outputList
	 */
	public List<ISBaseOutput> getOutputList() {
		return outputList;
	}
}
