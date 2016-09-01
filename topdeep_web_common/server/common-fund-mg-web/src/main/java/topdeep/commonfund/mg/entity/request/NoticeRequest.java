package topdeep.commonfund.mg.entity.request;

import java.util.Date;

import topdeep.common.mg.entity.request.PageRequest;
import topdeep.commonfund.mg.entity.EnumType;
import topdeep.commonfund.mg.entity.response.NoticeResponse;

public class NoticeRequest extends PageRequest {

	private String id;
	
	private String title;
	
	private String content;
	
	private String type;
	
	private Date date;
	
	private String channel;

	private String auditState;

	private String idList;

	public void checkInput(NoticeResponse res, NoticeRequest req) {
		if (req.getTitle() == null || req.getTitle().trim().equals("")) {
			res.setResult(false, "标题不能为空");
		} else if (req.getContent() == null || req.getContent().trim().equals("")) {
			res.setResult(false, "内容不能为空");
		} else if (req.getChannel() == null || req.getChannel().trim().equals("")) {
			res.setResult(false, "请选择渠道");
		} else if (req.getTitle().length() > 100) {
			res.setResult(false, "标题长度不能超过100");
		} else if (req.getContent().length() > 1000) {
			res.setResult(false, "标题长度不能超过1000");
		}
		if (req.getType() == null || req.getType().trim().equals("")) {
			req.setType(EnumType.FundCustMessageType.TransactionMessage.getValue());
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getAuditState() {
		return auditState;
	}

	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}

	public String getIdList() {
		return idList;
	}

	public void setIdList(String idList) {
		this.idList = idList;
	}

}
