/**
 * 
 */
package topdeep.commonfund.entity.gateway.util;

import flexjson.transformer.AbstractTransformer;

/**
 * @author niexin
 * 
 */
public class ExcludeTransformer extends AbstractTransformer {

	public Boolean isInline() {
		return true;
	}

	public void transform(Object object) {
		return;
	}
}
