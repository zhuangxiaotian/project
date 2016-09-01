package topdeep.common.mg.entity.response;

import java.util.List;

import topdeep.common.entity.db.SystemRoles;

public class RolesManageResponse extends PageResponse {
	private boolean couldBeDeleted;

	private String roleId;

	private List<SystemRoles> roles;

	public List<SystemRoles> getRoles() {
		return roles;
	}

	public void setRoles(List<SystemRoles> roles) {
		this.roles = roles;
	}

	public boolean isCouldBeDeleted() {
		return couldBeDeleted;
	}

	public void setCouldBeDeleted(boolean couldBeDeleted) {
		this.couldBeDeleted = couldBeDeleted;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
  
}
