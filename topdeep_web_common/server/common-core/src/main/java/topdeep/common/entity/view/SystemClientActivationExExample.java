/**
 * 
 */
package topdeep.common.entity.view;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.entity.db.SystemClientActivationExample;

/**
 * @author develop
 *
 */
public class SystemClientActivationExExample extends SystemClientActivationExample {
	private List<String> groups = new ArrayList<String>();

	public List<String> getGroups() {
		return groups;
	}

	public void setGroups(List<String> groups) {
		this.groups = groups;
	}
}
