package topdeep.common.entity.db;

import java.util.Date;

public class SystemParam extends SystemParamKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.SUPER_ADMIN_ID
     *
     * @mbggenerated
     */
    private String superAdminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.OBJ_TYPE
     *
     * @mbggenerated
     */
    private String objType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.PARAM_TYPE
     *
     * @mbggenerated
     */
    private String paramType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.PARAM_TYPE_DATA
     *
     * @mbggenerated
     */
    private String paramTypeData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.PARAM_NAME
     *
     * @mbggenerated
     */
    private String paramName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.PARAM_DESC
     *
     * @mbggenerated
     */
    private String paramDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.USER_MODIFY
     *
     * @mbggenerated
     */
    private String userModify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.PARAM_VALUE
     *
     * @mbggenerated
     */
    private String paramValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.PARAM_VALUE_DESC
     *
     * @mbggenerated
     */
    private String paramValueDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.PARAM_REQUIRED
     *
     * @mbggenerated
     */
    private String paramRequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.CREATE_ID
     *
     * @mbggenerated
     */
    private String createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.CREATE_NAME
     *
     * @mbggenerated
     */
    private String createName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.MODIFY_TIME
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.MODIFY_ID
     *
     * @mbggenerated
     */
    private String modifyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.MODIFY_NAME
     *
     * @mbggenerated
     */
    private String modifyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.AUDIT_TIME
     *
     * @mbggenerated
     */
    private Date auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.AUDIT_ID
     *
     * @mbggenerated
     */
    private String auditId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.AUDIT_NAME
     *
     * @mbggenerated
     */
    private String auditName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_param.AUDIT_STATE
     *
     * @mbggenerated
     */
    private String auditState;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_param
     *
     * @mbggenerated
     */
    public SystemParam(String id, String paramCode, String superAdminId, String objType, String paramType, String paramTypeData, String paramName, String paramDesc, String userModify, String paramValue, String paramValueDesc, String paramRequired, Integer rowVersion, Date createTime, String createId, String createName, Date modifyTime, String modifyId, String modifyName, Date auditTime, String auditId, String auditName, String auditState) {
        super(id, paramCode);
        this.superAdminId = superAdminId;
        this.objType = objType;
        this.paramType = paramType;
        this.paramTypeData = paramTypeData;
        this.paramName = paramName;
        this.paramDesc = paramDesc;
        this.userModify = userModify;
        this.paramValue = paramValue;
        this.paramValueDesc = paramValueDesc;
        this.paramRequired = paramRequired;
        this.rowVersion = rowVersion;
        this.createTime = createTime;
        this.createId = createId;
        this.createName = createName;
        this.modifyTime = modifyTime;
        this.modifyId = modifyId;
        this.modifyName = modifyName;
        this.auditTime = auditTime;
        this.auditId = auditId;
        this.auditName = auditName;
        this.auditState = auditState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_param
     *
     * @mbggenerated
     */
    public SystemParam() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.SUPER_ADMIN_ID
     *
     * @return the value of t_system_param.SUPER_ADMIN_ID
     *
     * @mbggenerated
     */
    public String getSuperAdminId() {
        return superAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.SUPER_ADMIN_ID
     *
     * @param superAdminId the value for t_system_param.SUPER_ADMIN_ID
     *
     * @mbggenerated
     */
    public void setSuperAdminId(String superAdminId) {
        this.superAdminId = superAdminId == null ? null : superAdminId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.OBJ_TYPE
     *
     * @return the value of t_system_param.OBJ_TYPE
     *
     * @mbggenerated
     */
    public String getObjType() {
        return objType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.OBJ_TYPE
     *
     * @param objType the value for t_system_param.OBJ_TYPE
     *
     * @mbggenerated
     */
    public void setObjType(String objType) {
        this.objType = objType == null ? null : objType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.PARAM_TYPE
     *
     * @return the value of t_system_param.PARAM_TYPE
     *
     * @mbggenerated
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.PARAM_TYPE
     *
     * @param paramType the value for t_system_param.PARAM_TYPE
     *
     * @mbggenerated
     */
    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.PARAM_TYPE_DATA
     *
     * @return the value of t_system_param.PARAM_TYPE_DATA
     *
     * @mbggenerated
     */
    public String getParamTypeData() {
        return paramTypeData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.PARAM_TYPE_DATA
     *
     * @param paramTypeData the value for t_system_param.PARAM_TYPE_DATA
     *
     * @mbggenerated
     */
    public void setParamTypeData(String paramTypeData) {
        this.paramTypeData = paramTypeData == null ? null : paramTypeData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.PARAM_NAME
     *
     * @return the value of t_system_param.PARAM_NAME
     *
     * @mbggenerated
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.PARAM_NAME
     *
     * @param paramName the value for t_system_param.PARAM_NAME
     *
     * @mbggenerated
     */
    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.PARAM_DESC
     *
     * @return the value of t_system_param.PARAM_DESC
     *
     * @mbggenerated
     */
    public String getParamDesc() {
        return paramDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.PARAM_DESC
     *
     * @param paramDesc the value for t_system_param.PARAM_DESC
     *
     * @mbggenerated
     */
    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.USER_MODIFY
     *
     * @return the value of t_system_param.USER_MODIFY
     *
     * @mbggenerated
     */
    public String getUserModify() {
        return userModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.USER_MODIFY
     *
     * @param userModify the value for t_system_param.USER_MODIFY
     *
     * @mbggenerated
     */
    public void setUserModify(String userModify) {
        this.userModify = userModify == null ? null : userModify.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.PARAM_VALUE
     *
     * @return the value of t_system_param.PARAM_VALUE
     *
     * @mbggenerated
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.PARAM_VALUE
     *
     * @param paramValue the value for t_system_param.PARAM_VALUE
     *
     * @mbggenerated
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.PARAM_VALUE_DESC
     *
     * @return the value of t_system_param.PARAM_VALUE_DESC
     *
     * @mbggenerated
     */
    public String getParamValueDesc() {
        return paramValueDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.PARAM_VALUE_DESC
     *
     * @param paramValueDesc the value for t_system_param.PARAM_VALUE_DESC
     *
     * @mbggenerated
     */
    public void setParamValueDesc(String paramValueDesc) {
        this.paramValueDesc = paramValueDesc == null ? null : paramValueDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.PARAM_REQUIRED
     *
     * @return the value of t_system_param.PARAM_REQUIRED
     *
     * @mbggenerated
     */
    public String getParamRequired() {
        return paramRequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.PARAM_REQUIRED
     *
     * @param paramRequired the value for t_system_param.PARAM_REQUIRED
     *
     * @mbggenerated
     */
    public void setParamRequired(String paramRequired) {
        this.paramRequired = paramRequired == null ? null : paramRequired.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.ROW_VERSION
     *
     * @return the value of t_system_param.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.ROW_VERSION
     *
     * @param rowVersion the value for t_system_param.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.CREATE_TIME
     *
     * @return the value of t_system_param.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.CREATE_TIME
     *
     * @param createTime the value for t_system_param.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.CREATE_ID
     *
     * @return the value of t_system_param.CREATE_ID
     *
     * @mbggenerated
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.CREATE_ID
     *
     * @param createId the value for t_system_param.CREATE_ID
     *
     * @mbggenerated
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.CREATE_NAME
     *
     * @return the value of t_system_param.CREATE_NAME
     *
     * @mbggenerated
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.CREATE_NAME
     *
     * @param createName the value for t_system_param.CREATE_NAME
     *
     * @mbggenerated
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.MODIFY_TIME
     *
     * @return the value of t_system_param.MODIFY_TIME
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.MODIFY_TIME
     *
     * @param modifyTime the value for t_system_param.MODIFY_TIME
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.MODIFY_ID
     *
     * @return the value of t_system_param.MODIFY_ID
     *
     * @mbggenerated
     */
    public String getModifyId() {
        return modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.MODIFY_ID
     *
     * @param modifyId the value for t_system_param.MODIFY_ID
     *
     * @mbggenerated
     */
    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.MODIFY_NAME
     *
     * @return the value of t_system_param.MODIFY_NAME
     *
     * @mbggenerated
     */
    public String getModifyName() {
        return modifyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.MODIFY_NAME
     *
     * @param modifyName the value for t_system_param.MODIFY_NAME
     *
     * @mbggenerated
     */
    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.AUDIT_TIME
     *
     * @return the value of t_system_param.AUDIT_TIME
     *
     * @mbggenerated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.AUDIT_TIME
     *
     * @param auditTime the value for t_system_param.AUDIT_TIME
     *
     * @mbggenerated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.AUDIT_ID
     *
     * @return the value of t_system_param.AUDIT_ID
     *
     * @mbggenerated
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.AUDIT_ID
     *
     * @param auditId the value for t_system_param.AUDIT_ID
     *
     * @mbggenerated
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.AUDIT_NAME
     *
     * @return the value of t_system_param.AUDIT_NAME
     *
     * @mbggenerated
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.AUDIT_NAME
     *
     * @param auditName the value for t_system_param.AUDIT_NAME
     *
     * @mbggenerated
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_param.AUDIT_STATE
     *
     * @return the value of t_system_param.AUDIT_STATE
     *
     * @mbggenerated
     */
    public String getAuditState() {
        return auditState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_param.AUDIT_STATE
     *
     * @param auditState the value for t_system_param.AUDIT_STATE
     *
     * @mbggenerated
     */
    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }
}