package topdeep.common.mg.entity.response;

import java.util.List;

import topdeep.common.entity.db.SystemPrivilege;

public class PrivilegeResponse extends BaseResponse {

	public SystemPrivilege output;

	public List<SystemPrivilege> privilege;

	public List<SystemPrivilege> getPrivilege() {
		return privilege;
	}

	public void setPrivilege(List<SystemPrivilege> privilege) {
		this.privilege = privilege;
	}

	/**
	 * @return the output
	 */
	public SystemPrivilege getOutput() {
		return output;
	}

	/**
	 * @param output the output to set
	 */
	public void setOutput(SystemPrivilege output) {
		this.output = output;
	}

}
