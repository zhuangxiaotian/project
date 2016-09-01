package topdeep.common.mg.entity.request;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemRoles;


public class AdminRolesManageRequest extends PageRequest {
	
	private String searchKeyword;
	
	private SystemRoles role;
	
	/**
	 * 选中的权限值
	 */
	private String operateSelectValue;
	
	/** 分页对象 **/
	private PageImpl page;

	private String roleId;

	public PageImpl getPage() {
		return page;
	}

	public void setPage(PageImpl page) {
		this.page = page;
	}

	public String getSearchKeyword() {
		return "%"+searchKeyword+"%";
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}


	public String getOperateSelectValue() {
		return operateSelectValue;
	}

	public void setOperateSelectValue(String operateSelectValue) {
		this.operateSelectValue = operateSelectValue;
	}

	public SystemRoles getRole() {
		return role;
	}

	public void setRole(SystemRoles role) {
		this.role = role;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	
}