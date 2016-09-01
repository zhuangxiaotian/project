package topdeep.common.mg.entity.request;

import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.mg.entity.response.BaseResponse;

public class AdminManageRequest extends PageRequest {
	
	private String searchKeyword;
	
	private SystemAdmin admin = new SystemAdmin();
	
	private String roleIds;

	public boolean checkSaveInput(BaseResponse res) {
		if(res.isSuccess()){
			res.checkStringValue(admin.getName(), "请输入姓名");
			res.checkStringValue(admin.getState(), "请设置状态");
			res.checkStringValue(admin.getLoginName(), "请输入登录名称");
//			if(StringUtils.isNullOrEmpty(operatorId)){
//				res.checkStringValue(loginPass, "请输入密码");
//			}
			res.checkStringValue(admin.getMobileTelephone(), "请输入手机号码");
			res.checkStringValue(admin.getLoginEmail(), "请输入邮箱");
		}
		return res.isSuccess();
	}
	
	public boolean checkDeleteInput(BaseResponse res){
		res.checkStringValue(admin.getId(), "请输入管理员标识进行删除操作");
		return res.isSuccess();
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public SystemAdmin getAdmin() {
		return admin;
	}

	public void setAdmin(SystemAdmin admin) {
		this.admin = admin;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

}