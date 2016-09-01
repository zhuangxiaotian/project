package topdeep.common.mg.entity.view;

import java.util.ArrayList;
import java.util.List;

public class PrivilegeInfo {
	private String privilegeName;
	
	private List<PrivilegeOperateInfo> operateList = new ArrayList<PrivilegeOperateInfo>();

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public List<PrivilegeOperateInfo> getOperateList() {
		return operateList;
	}

}
