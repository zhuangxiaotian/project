package topdeep.common.mg.entity.response;

import java.util.List;

import topdeep.common.entity.db.SystemClientVersion;
import topdeep.common.mg.entity.response.PageResponse;

public class ClientVersionResponse extends PageResponse {

	private List<SystemClientVersion> clientVersions;

	public List<SystemClientVersion> getClientVersions() {
		return clientVersions;
	}

	public void setClientVersions(List<SystemClientVersion> clientVersions) {
		this.clientVersions = clientVersions;
	}

}
