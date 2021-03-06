package topdeep.common.entity.db;

import java.util.Date;
import topdeep.common.entity.base.BaseEntity;

public class SystemExtUserRelation extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.ADMIN_ID
     *
     * @mbggenerated
     */
    private String adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.VISIT_TOKEN
     *
     * @mbggenerated
     */
    private String visitToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.REALTION_TYPE
     *
     * @mbggenerated
     */
    private String realtionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.EXTERNAL_SYSTEM_TYPE
     *
     * @mbggenerated
     */
    private String externalSystemType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.CREATE_ID
     *
     * @mbggenerated
     */
    private String createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.CREATE_NAME
     *
     * @mbggenerated
     */
    private String createName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.MODIFY_TIME
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.MODIFY_ID
     *
     * @mbggenerated
     */
    private String modifyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.MODIFY_NAME
     *
     * @mbggenerated
     */
    private String modifyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.AUDIT_TIME
     *
     * @mbggenerated
     */
    private Date auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.AUDIT_ID
     *
     * @mbggenerated
     */
    private String auditId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.AUDIT_NAME
     *
     * @mbggenerated
     */
    private String auditName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_ext_user_relation.AUDIT_STATE
     *
     * @mbggenerated
     */
    private String auditState;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    public SystemExtUserRelation(String id, String adminId, String visitToken, String realtionType, String externalSystemType, Integer rowVersion, Date createTime, String createId, String createName, Date modifyTime, String modifyId, String modifyName, Date auditTime, String auditId, String auditName, String auditState) {
        this.id = id;
        this.adminId = adminId;
        this.visitToken = visitToken;
        this.realtionType = realtionType;
        this.externalSystemType = externalSystemType;
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
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    public SystemExtUserRelation() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.ID
     *
     * @return the value of t_system_ext_user_relation.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.ID
     *
     * @param id the value for t_system_ext_user_relation.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.ADMIN_ID
     *
     * @return the value of t_system_ext_user_relation.ADMIN_ID
     *
     * @mbggenerated
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.ADMIN_ID
     *
     * @param adminId the value for t_system_ext_user_relation.ADMIN_ID
     *
     * @mbggenerated
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.VISIT_TOKEN
     *
     * @return the value of t_system_ext_user_relation.VISIT_TOKEN
     *
     * @mbggenerated
     */
    public String getVisitToken() {
        return visitToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.VISIT_TOKEN
     *
     * @param visitToken the value for t_system_ext_user_relation.VISIT_TOKEN
     *
     * @mbggenerated
     */
    public void setVisitToken(String visitToken) {
        this.visitToken = visitToken == null ? null : visitToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.REALTION_TYPE
     *
     * @return the value of t_system_ext_user_relation.REALTION_TYPE
     *
     * @mbggenerated
     */
    public String getRealtionType() {
        return realtionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.REALTION_TYPE
     *
     * @param realtionType the value for t_system_ext_user_relation.REALTION_TYPE
     *
     * @mbggenerated
     */
    public void setRealtionType(String realtionType) {
        this.realtionType = realtionType == null ? null : realtionType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.EXTERNAL_SYSTEM_TYPE
     *
     * @return the value of t_system_ext_user_relation.EXTERNAL_SYSTEM_TYPE
     *
     * @mbggenerated
     */
    public String getExternalSystemType() {
        return externalSystemType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.EXTERNAL_SYSTEM_TYPE
     *
     * @param externalSystemType the value for t_system_ext_user_relation.EXTERNAL_SYSTEM_TYPE
     *
     * @mbggenerated
     */
    public void setExternalSystemType(String externalSystemType) {
        this.externalSystemType = externalSystemType == null ? null : externalSystemType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.ROW_VERSION
     *
     * @return the value of t_system_ext_user_relation.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.ROW_VERSION
     *
     * @param rowVersion the value for t_system_ext_user_relation.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.CREATE_TIME
     *
     * @return the value of t_system_ext_user_relation.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.CREATE_TIME
     *
     * @param createTime the value for t_system_ext_user_relation.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.CREATE_ID
     *
     * @return the value of t_system_ext_user_relation.CREATE_ID
     *
     * @mbggenerated
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.CREATE_ID
     *
     * @param createId the value for t_system_ext_user_relation.CREATE_ID
     *
     * @mbggenerated
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.CREATE_NAME
     *
     * @return the value of t_system_ext_user_relation.CREATE_NAME
     *
     * @mbggenerated
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.CREATE_NAME
     *
     * @param createName the value for t_system_ext_user_relation.CREATE_NAME
     *
     * @mbggenerated
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.MODIFY_TIME
     *
     * @return the value of t_system_ext_user_relation.MODIFY_TIME
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.MODIFY_TIME
     *
     * @param modifyTime the value for t_system_ext_user_relation.MODIFY_TIME
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.MODIFY_ID
     *
     * @return the value of t_system_ext_user_relation.MODIFY_ID
     *
     * @mbggenerated
     */
    public String getModifyId() {
        return modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.MODIFY_ID
     *
     * @param modifyId the value for t_system_ext_user_relation.MODIFY_ID
     *
     * @mbggenerated
     */
    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.MODIFY_NAME
     *
     * @return the value of t_system_ext_user_relation.MODIFY_NAME
     *
     * @mbggenerated
     */
    public String getModifyName() {
        return modifyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.MODIFY_NAME
     *
     * @param modifyName the value for t_system_ext_user_relation.MODIFY_NAME
     *
     * @mbggenerated
     */
    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.AUDIT_TIME
     *
     * @return the value of t_system_ext_user_relation.AUDIT_TIME
     *
     * @mbggenerated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.AUDIT_TIME
     *
     * @param auditTime the value for t_system_ext_user_relation.AUDIT_TIME
     *
     * @mbggenerated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.AUDIT_ID
     *
     * @return the value of t_system_ext_user_relation.AUDIT_ID
     *
     * @mbggenerated
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.AUDIT_ID
     *
     * @param auditId the value for t_system_ext_user_relation.AUDIT_ID
     *
     * @mbggenerated
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.AUDIT_NAME
     *
     * @return the value of t_system_ext_user_relation.AUDIT_NAME
     *
     * @mbggenerated
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.AUDIT_NAME
     *
     * @param auditName the value for t_system_ext_user_relation.AUDIT_NAME
     *
     * @mbggenerated
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_ext_user_relation.AUDIT_STATE
     *
     * @return the value of t_system_ext_user_relation.AUDIT_STATE
     *
     * @mbggenerated
     */
    public String getAuditState() {
        return auditState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_ext_user_relation.AUDIT_STATE
     *
     * @param auditState the value for t_system_ext_user_relation.AUDIT_STATE
     *
     * @mbggenerated
     */
    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }
}