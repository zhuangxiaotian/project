package topdeep.common.mg.entity.response;

import java.util.List;

import topdeep.common.entity.db.SystemVisitMessage;

public class CustomerMessageResponse extends PageResponse{

	private List<SystemVisitMessage> systemVisitMessageList;

	public List<SystemVisitMessage> getSystemVisitMessageList() {
		return systemVisitMessageList;
	}

	public void setSystemVisitMessageList(List<SystemVisitMessage> systemVisitMessageList) {
		this.systemVisitMessageList = systemVisitMessageList;
	}
}
