package topdeep.common.mg.entity.request;

import topdeep.common.entity.db.SystemClientVersion;
import topdeep.common.mg.entity.request.PageRequest;
import topdeep.common.mg.entity.response.BaseResponse;

public class ClientVersionRequest extends PageRequest {

	private String searchKeyword;

	private SystemClientVersion clientVersion;

	private String ids;

	public void checkEditInput(BaseResponse res) {
		res.checkNull(getClientVersion(), "参数为空");
		res.checkStringEmpty(getClientVersion().getClientType(), "客户端类型不能为空");
		res.checkStringEmpty(getClientVersion().getClientVersion(), "客户端版本不能为空");
		res.checkStringEmpty(getClientVersion().getClientState(), "客户端状态不能为空");
		res.checkNull(getClientVersion().getReleaseTime(), "发布时间不能为空");
		res.checkStringEmpty(getClientVersion().getClientEncryptKey(), "客户端加密KEY不能为空");
		res.checkStringEmpty(getClientVersion().getClientSignKey(), "客户端签名KEY不能为空");
	}

	public void checkDeleteInput(BaseResponse res) {
		res.checkStringEmpty(getClientVersion().getClientType(), "客户端类型不能为空");
		res.checkStringEmpty(getClientVersion().getClientVersion(), "客户端版本不能为空");
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public SystemClientVersion getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(SystemClientVersion clientVersion) {
		this.clientVersion = clientVersion;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

}
