package topdeep.commonfund.mg.biz.common.impl;

import org.springframework.stereotype.Service;

@Service("commonFundMgSystemBiz")
public class CommonFundMgSystemBiz extends topdeep.commonfund.mg.biz.common.CommonFundMgSystemBiz {

	private String uploadType;

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}
}
