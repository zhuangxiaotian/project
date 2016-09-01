package topdeep.common.mg.entity.response;

import java.util.List;
import java.util.Map;

import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.entity.db.SystemWhiteList;


public class WhiteListsResponse extends PageResponse{
	
	public List<SystemWhiteList> whiteLists;
	
	public List<SystemBaseInfo> whiteListsURL;
	
	public List<SystemBaseInfo>  idTypeList;
	
	public Map<String,String> idTypeMap;
	
	public String defaultWhiteListsURL;
	
	public String type;

    public Map<String, String> getIdTypeMap() {
		return idTypeMap;
	}

	public void setIdTypeMap(Map<String, String> idTypeMap) {
		this.idTypeMap = idTypeMap;
	}

	public List<SystemBaseInfo> getIdTypeList() {
		return idTypeList;
	}

	public void setIdTypeList(List<SystemBaseInfo> idTypeList) {
		this.idTypeList = idTypeList;
	}

	public List<SystemBaseInfo> getWhiteListsURL() {
		return whiteListsURL;
	}

	public void setWhiteListsURL(List<SystemBaseInfo> whiteListsURL) {
		this.whiteListsURL = whiteListsURL;
	}

	public List<SystemWhiteList> getWhiteLists() {
		return whiteLists;
	}

	public void setWhiteLists(List<SystemWhiteList> whiteLists) {
		this.whiteLists = whiteLists;
	}

	public String getDefaultWhiteListsURL() {
		return defaultWhiteListsURL;
	}

	public void setDefaultWhiteListsURL(String defaultWhiteListsURL) {
		this.defaultWhiteListsURL = defaultWhiteListsURL;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
