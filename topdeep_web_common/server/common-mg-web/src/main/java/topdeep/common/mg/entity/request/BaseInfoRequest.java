package topdeep.common.mg.entity.request;

import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.mg.entity.response.BaseResponse;

public class BaseInfoRequest extends PageRequest {

	private SystemBaseInfo baseInfo;

	private String searchKeyword;

	private String codeType;

	public void checkExecuteInput(BaseResponse res) {
		res.checkStringEmpty(codeType, "缺少字典类型");
	}

	public void checkQueryInput(BaseResponse res) {
		res.checkStringEmpty(codeType, "缺少字典类型");
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public SystemBaseInfo getBaseInfo() {
		return baseInfo;
	}

	public void setBaseInfo(SystemBaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public void checkEditInput(BaseResponse res) {
		res.checkNull(baseInfo, "缺少数据字典对象");
		if (res.isSuccess()) {
			res.checkStringEmpty(baseInfo.getCodeId(), "数据字典编号不能为空");
			res.checkStringEmpty(baseInfo.getCodeType(), "数据字典类型不能为空");
			res.checkStringEmpty(baseInfo.getCodeName(), "数据字典名称不能为空");
			res.checkNull(baseInfo.getOrderField(), "缺少顺序值");
		}
	}

	public void checkDeleteInput(BaseResponse res) {
		res.checkNull(baseInfo, "缺少数据字典对象");
		if (res.isSuccess()) {
			res.checkStringEmpty(baseInfo.getCodeId(), "数据字典编号不能为空");
			res.checkStringEmpty(baseInfo.getCodeType(), "数据字典类型不能为空");
		}
	}
}
