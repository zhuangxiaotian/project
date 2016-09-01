package topdeep.common.mg.entity.response;

import java.util.List;

import topdeep.common.entity.db.SystemConfig;

public class SystemConfigResponse extends PageResponse{
	
	private List<SystemConfig> systemConfigList;

	public List<SystemConfig> getSystemConfigList() {
		return systemConfigList;
	}

	public void setSystemConfigList(List<SystemConfig> systemConfigList) {
		this.systemConfigList = systemConfigList;
	}

}
