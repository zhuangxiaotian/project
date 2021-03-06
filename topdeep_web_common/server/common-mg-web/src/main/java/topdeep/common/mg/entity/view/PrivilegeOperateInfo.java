package topdeep.common.mg.entity.view;


public class PrivilegeOperateInfo {
	private int operateValue;
	private boolean operateEnabled;
	private String operateName;
	
	private boolean hasPrivilege;
	
	public PrivilegeOperateInfo(){
		
	}
	
	public PrivilegeOperateInfo(int operateValue, String operateName, boolean operateEnabled, boolean hasPrivilege){
		this.operateValue = operateValue;
		this.operateName = operateName;
		this.operateEnabled = operateEnabled;
		this.hasPrivilege = hasPrivilege;
	}
	
	/**
	 * @return the hasPrivilege
	 */
	public boolean getHasPrivilege() {
		return hasPrivilege;
	}
	/**
	 * @param hasPrivilege the hasPrivilege to set
	 */
	public void setHasPrivilege(boolean hasPrivilege) {
		this.hasPrivilege = hasPrivilege;
	}
	public int getOperateValue() {
		return operateValue;
	}
	public void setOperateValue(int operateValue) {
		this.operateValue = operateValue;
	}
	public boolean isOperateEnabled() {
		return operateEnabled;
	}
	public void setOperateEnabled(boolean operateEnabled) {
		this.operateEnabled = operateEnabled;
	}
	public String getOperateName() {
		return operateName;
	}
	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}
}
