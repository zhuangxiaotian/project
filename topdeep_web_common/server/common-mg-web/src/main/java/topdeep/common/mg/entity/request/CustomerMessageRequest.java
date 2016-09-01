package topdeep.common.mg.entity.request;

import topdeep.common.entity.db.SystemVisitMessage;
import topdeep.common.mg.entity.response.CustomerMessageResponse;


public class CustomerMessageRequest extends PageRequest{

	private SystemVisitMessage systemVisitMessage;

	public SystemVisitMessage getSystemVisitMessage() {
		return systemVisitMessage;
	}

	public void setSystemVisitMessage(SystemVisitMessage systemVisitMessage) {
		this.systemVisitMessage = systemVisitMessage;
	}
	
	public void checkId(CustomerMessageResponse res){
		res.checkStringEmpty("systemVisitMessage.id", "客户留言Id不能为空");
	}
}
