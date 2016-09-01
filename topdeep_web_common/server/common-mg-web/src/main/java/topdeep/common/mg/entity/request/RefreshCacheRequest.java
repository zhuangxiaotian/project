package topdeep.common.mg.entity.request;

import topdeep.common.mg.entity.request.BaseExternalRequest;

public class RefreshCacheRequest extends BaseExternalRequest {
	
	public String type;
	
	public String target;

	public String systemType;

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	
}
