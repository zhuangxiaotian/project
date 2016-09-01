/**
 * 
 */
package topdeep.common.mg.entity.request;

import org.codehaus.jackson.annotate.JsonAnySetter;

import topdeep.common.mg.entity.response.BaseResponse;

public class BaseRequest {
	/** 功能 **/
	private int func;
	/** 操作 **/
	private int operate;

	private int privilegeFunc;
	private int privilegeOperate;

	private boolean ajaxRequest = false;

	private String searchKeyword;

	public int getPrivilegeFunc() {
		return privilegeFunc;
	}

	public void setPrivilegeFunc(int privilegeFunc) {
		this.privilegeFunc = privilegeFunc;
	}

	public int getPrivilegeOperate() {
		return privilegeOperate;
	}

	public void setPrivilegeOperate(int privilegeOperate) {
		this.privilegeOperate = privilegeOperate;
	}

	public boolean checkInput(BaseResponse res) {
		res.setResult(true, "");
		return res.isSuccess();
	}

	public int getFunc() {
		return func;
	}

	public void setFunc(int func) {
		this.func = func;
	}

	public int getOperate() {
		return operate;
	}

	public void setOperate(int operate) {
		this.operate = operate;
	}

	/**
	 * @return the isAjaxRequest
	 */
	public boolean isAjaxRequest() {
		return ajaxRequest;
	}

	/**
	 * @param ajaxRequest the ajaxRequest to set
	 */
	public void setAjaxRequest(boolean ajaxRequest) {
		this.ajaxRequest = ajaxRequest;
	}

	@JsonAnySetter
	public void handleUnknown(String key, Object value) {
		// do something: put to a Map; logger a warning, whatever
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
}
