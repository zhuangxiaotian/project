/**
 * 
 */
package topdeep.common.mg.entity.view;

/**
 * @author niexin
 *
 */
public class BaseInfoTypeEditInfo {
	/**
	 * 字典类型ID
	 */
	private String codeTypeId;
	/**
	 * 字典类型名称
	 */
	private String codeTypeName;
	/**
	 * 描述字段的名称
	 */
	private String codeTypeDescName;
	/**
	 * CodeId编辑时的参数类型
	 */
	private String codeIdParamType;
	/**
	 * CodeName编辑时的参数类型
	 */
	private String codeNameParamType;
	/**
	 * CodeDesc编辑时的参数类型
	 */
	private String codeDescParamType;

	/**
	 * 0 允许正常编辑 1允许修改，但不允许添加 2 只能查看
	 */
	private String editType;

	/**
	 * @return the codeTypeId
	 */
	public String getCodeTypeId() {
		return codeTypeId;
	}

	/**
	 * @param codeTypeId the codeTypeId to set
	 */
	public void setCodeTypeId(String codeTypeId) {
		this.codeTypeId = codeTypeId;
	}

	/**
	 * @return the codeTypeName
	 */
	public String getCodeTypeName() {
		return codeTypeName;
	}

	/**
	 * @param codeTypeName the codeTypeName to set
	 */
	public void setCodeTypeName(String codeTypeName) {
		this.codeTypeName = codeTypeName;
	}

	/**
	 * @return the codeIdParamType
	 */
	public String getCodeIdParamType() {
		return codeIdParamType;
	}

	/**
	 * @param codeIdParamType the codeIdParamType to set
	 */
	public void setCodeIdParamType(String codeIdParamType) {
		this.codeIdParamType = codeIdParamType;
	}

	/**
	 * @return the codeNameParamType
	 */
	public String getCodeNameParamType() {
		return codeNameParamType;
	}

	/**
	 * @param codeNameParamType the codeNameParamType to set
	 */
	public void setCodeNameParamType(String codeNameParamType) {
		this.codeNameParamType = codeNameParamType;
	}

	/**
	 * @return the codeDescParamType
	 */
	public String getCodeDescParamType() {
		return codeDescParamType;
	}

	/**
	 * @param codeDescParamType the codeDescParamType to set
	 */
	public void setCodeDescParamType(String codeDescParamType) {
		this.codeDescParamType = codeDescParamType;
	}

	/**
	 * @return the editType
	 */
	public String getEditType() {
		return editType;
	}

	/**
	 * @param editType the editType to set
	 */
	public void setEditType(String editType) {
		this.editType = editType;
	}

	/**
	 * @return the codeTypeDescName
	 */
	public String getCodeTypeDescName() {
		return codeTypeDescName;
	}

	/**
	 * @param codeTypeDescName the codeTypeDescName to set
	 */
	public void setCodeTypeDescName(String codeTypeDescName) {
		this.codeTypeDescName = codeTypeDescName;
	}
}
