package topdeep.common.mg.entity.request;

import topdeep.common.mg.entity.response.BaseResponse;

public class SystemConfigRequest extends PageRequest{
	
	private String systemParamCategory;
	
	private String systemParamValue;
	
	private String systemParamCode;

	public String getSystemParamCategory() {
		return systemParamCategory;
	}

	public void setSystemParamCategory(String systemParamCategory) {
		this.systemParamCategory = systemParamCategory;
	}

	public String getSystemParamValue() {
		return systemParamValue;
	}

	public void setSystemParamValue(String systemParamValue) {
		this.systemParamValue = systemParamValue;
	}

	public String getSystemParamCode() {
		return systemParamCode;
	}

	public void setSystemParamCode(String systemParamCode) {
		this.systemParamCode = systemParamCode;
	}

	public void checkAjaxSave(BaseResponse res){
		res.checkStringEmpty(systemParamCode, "参数标识不能为空");
		if(res.isSuccess()){
			res.checkStringEmpty(systemParamCategory, "参数分类不能为空");
		}
		if(res.isSuccess()){
			res.checkStringEmpty(systemParamValue, "参数值不能为空");
		}
	}
	
}
