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
public class ISMultiInput extends ISBaseInput {

	private List<ISBaseInput> inputList = new ArrayList<ISBaseInput>();

	public ISMultiInput() {
		this.setZ_funcCode("000");
	}

	public String getHashKey() {
		StringBuffer key = new StringBuffer("multiInput");
		return key.toString();
	}

	/**
	 * @return the inputList
	 */
	public List<ISBaseInput> getInputList() {
		return inputList;
	}
}
