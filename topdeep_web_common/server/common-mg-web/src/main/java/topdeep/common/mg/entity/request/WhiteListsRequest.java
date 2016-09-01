package topdeep.common.mg.entity.request;


public class WhiteListsRequest extends PageRequest {
	
	public String listNo;
	
	public String url;
	
	public String listType;
	
	public String status;
	
	

	public String listNoUpdate;
	
	public String urlUpdate;
	
	public String listTypeUpdate;
	
	public String statusUpdate;
	
	// 类型 0，机构 1个人
	public String type;
	
	public String id;
	
	


	public String getListNoUpdate() {
		return listNoUpdate;
	}
	public void setListNoUpdate(String listNoUpdate) {
		this.listNoUpdate = listNoUpdate;
	}
	public String getUrlUpdate() {
		return urlUpdate;
	}
	public void setUrlUpdate(String urlUpdate) {
		this.urlUpdate = urlUpdate;
	}
	public String getListTypeUpdate() {
		return listTypeUpdate;
	}
	public void setListTypeUpdate(String listTypeUpdate) {
		this.listTypeUpdate = listTypeUpdate;
	}
	public String getStatusUpdate() {
		return statusUpdate;
	}
	public void setStatusUpdate(String statusUpdate) {
		this.statusUpdate = statusUpdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getListNo() {
		return listNo;
	}
	public void setListNo(String listNo) {
		this.listNo = listNo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getListType() {
		return listType;
	}
	public void setListType(String listType) {
		this.listType = listType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
