package topdeep.common.mg.entity.response;

import java.util.List;

import topdeep.common.mg.entity.view.PrivilegeGroup;

public class PrivilegeViewResponse extends BaseResponse {
	private List<PrivilegeGroup> privilegeGroupList;

	/**
	 * @return the privilegeGroupList
	 */
	public List<PrivilegeGroup> getPrivilegeGroupList() {
		return privilegeGroupList;
	}

	/**
	 * @param privilegeGroupList the privilegeGroupList to set
	 */
	public void setPrivilegeGroupList(List<PrivilegeGroup> privilegeGroupList) {
		this.privilegeGroupList = privilegeGroupList;
	}
}
