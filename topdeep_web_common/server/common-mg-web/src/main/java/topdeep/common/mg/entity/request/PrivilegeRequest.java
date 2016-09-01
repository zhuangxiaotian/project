package topdeep.common.mg.entity.request;

import topdeep.common.entity.db.SystemPrivilege;

public class PrivilegeRequest extends BaseExternalRequest {

	private SystemPrivilege input;

	private String operatorId;

	private String roleId;

	private boolean moveUp;

	/**
	 * @return the operatorId
	 */
	public String getOperatorId() {
		return operatorId;
	}

	/**
	 * @param operatorId the operatorId to set
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the input
	 */
	public SystemPrivilege getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(SystemPrivilege input) {
		this.input = input;
	}

	/**
	 * @return the moveUp
	 */
	public boolean isMoveUp() {
		return moveUp;
	}

	/**
	 * @param moveUp the moveUp to set
	 */
	public void setMoveUp(boolean moveUp) {
		this.moveUp = moveUp;
	}

}
