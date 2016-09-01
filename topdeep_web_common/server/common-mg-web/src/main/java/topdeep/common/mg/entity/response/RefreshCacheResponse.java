package topdeep.common.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.mg.entity.response.BaseResponse;

public class RefreshCacheResponse extends BaseResponse {
	
	public List<String> refreshCacheList = new ArrayList<String>();
	
	public List<String> bfCacheList = new ArrayList<String>();
	
	public List<SystemBaseInfo> baseInfoList = new ArrayList<SystemBaseInfo>();
	public List<String> getBfCacheList() {
		return bfCacheList;
	}

	public void setBfCacheList(List<String> bfCacheList) {
		this.bfCacheList = bfCacheList;
	}

	public List<String> getRefreshCacheList() {
		return refreshCacheList;
	}

	public void setRefreshCacheList(List<String> refreshCacheList) {
		this.refreshCacheList = refreshCacheList;
	}

	public String target;

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public List<SystemBaseInfo> getBaseInfoList() {
		return baseInfoList;
	}

	public void setBaseInfoList(List<SystemBaseInfo> baseInfoList) {
		this.baseInfoList = baseInfoList;
	}
	
}
