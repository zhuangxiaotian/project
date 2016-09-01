package topdeep.common.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.entity.constant.NameValue;
import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.mg.entity.view.BaseInfoTypeEditInfo;

public class BaseInfoResponse extends PageResponse {

	private List<SystemBaseInfo> baseInfoList = new ArrayList<SystemBaseInfo>();

	private BaseInfoTypeEditInfo editInfo;

	private SystemBaseInfo baseInfoTypeInfo;

	private SystemBaseInfo baseInfo;

	private List<SystemBaseInfo> baseInfoTypeList;

	private List<NameValue> customPrivilegeList;

	public List<SystemBaseInfo> getBaseInfoList() {
		return baseInfoList;
	}

	public void setBaseInfoList(List<SystemBaseInfo> baseInfoList) {
		this.baseInfoList = baseInfoList;
	}

	/**
	 * @return the baseInfoTypeList
	 */
	public List<SystemBaseInfo> getBaseInfoTypeList() {
		return baseInfoTypeList;
	}

	/**
	 * @param baseInfoTypeList the baseInfoTypeList to set
	 */
	public void setBaseInfoTypeList(List<SystemBaseInfo> baseInfoTypeList) {
		this.baseInfoTypeList = baseInfoTypeList;
	}

	/**
	 * @return the baseInfoTypeInfo
	 */
	public SystemBaseInfo getBaseInfoTypeInfo() {
		return baseInfoTypeInfo;
	}

	/**
	 * @param baseInfoTypeInfo the baseInfoTypeInfo to set
	 */
	public void setBaseInfoTypeInfo(SystemBaseInfo baseInfoTypeInfo) {
		this.baseInfoTypeInfo = baseInfoTypeInfo;
	}

	/**
	 * @return the baseInfo
	 */
	public SystemBaseInfo getBaseInfo() {
		return baseInfo;
	}

	/**
	 * @param baseInfo the baseInfo to set
	 */
	public void setBaseInfo(SystemBaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	/**
	 * @return the editInfo
	 */
	public BaseInfoTypeEditInfo getEditInfo() {
		return editInfo;
	}

	/**
	 * @param editInfo the editInfo to set
	 */
	public void setEditInfo(BaseInfoTypeEditInfo editInfo) {
		this.editInfo = editInfo;
	}

	/**
	 * @return the customPrivilegeList
	 */
	public List<NameValue> getCustomPrivilegeList() {
		return customPrivilegeList;
	}

	/**
	 * @param customPrivilegeList the customPrivilegeList to set
	 */
	public void setCustomPrivilegeList(List<NameValue> customPrivilegeList) {
		this.customPrivilegeList = customPrivilegeList;
	}

}
