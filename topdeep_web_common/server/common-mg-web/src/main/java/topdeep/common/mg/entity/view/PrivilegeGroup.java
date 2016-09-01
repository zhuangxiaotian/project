/**
 * 
 */
package topdeep.common.mg.entity.view;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niexin
 *
 */
public class PrivilegeGroup {
	private String groupName;

	private List<PrivilegeInfo> privilegeList = new ArrayList<PrivilegeInfo>();
	
	/**
	 * @return the privilegeList
	 */
	public List<PrivilegeInfo> getPrivilegeList() {
		return privilegeList;
	}

	
	public void setPrivilegeList(List<PrivilegeInfo> privilegeList) {
		this.privilegeList = privilegeList;
	}


	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
