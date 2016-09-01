package topdeep.common.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.entity.db.SystemAdminRoles;
import topdeep.common.entity.db.SystemRoles;

public class AdminManageResponse extends PageResponse {
	
	private static final long serialVersionUID = 1L;
	
	private List<SystemAdmin> adminList = new ArrayList<SystemAdmin>();
	
	private List<SystemRoles> rolesList = new ArrayList<SystemRoles>();

	private List<SystemAdminRoles> adminRoles = new ArrayList<SystemAdminRoles>();
	
	private SystemAdmin operators = new SystemAdmin();
	
	public List<SystemAdmin> getAdminList() {
		return adminList;
	}

	public void setAdminList(List<SystemAdmin> adminList) {
		this.adminList = adminList;
	}

	public List<SystemAdminRoles> getAdminRoles() {
		return adminRoles;
	}

	public void setAdminRoles(List<SystemAdminRoles> adminRoles) {
		this.adminRoles = adminRoles;
	}

	public SystemAdmin getOperators() {
		return operators;
	}

	public void setOperators(SystemAdmin operators) {
		this.operators = operators;
	}

	public List<SystemRoles> getRolesList() {
		return rolesList;
	}

	public void setRolesList(List<SystemRoles> rolesList) {
		this.rolesList = rolesList;
	}

}
