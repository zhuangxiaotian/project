package topdeep.common.entity.db;

import java.util.Date;
import topdeep.common.entity.base.BaseEntity;

public class SystemAdminLog extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_log.ADMIN_LOG_ID
     *
     * @mbggenerated
     */
    private String adminLogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_log.ADMIN_ID
     *
     * @mbggenerated
     */
    private String adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_log.ADMIN_NAME
     *
     * @mbggenerated
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_log.OPERATE_TIME
     *
     * @mbggenerated
     */
    private Date operateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_log.OPERATE_TYPE
     *
     * @mbggenerated
     */
    private String operateType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_log.OPERATE_CONTENT
     *
     * @mbggenerated
     */
    private String operateContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_log.UPDATE_COUNT
     *
     * @mbggenerated
     */
    private Integer updateCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_log.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_admin_log
     *
     * @mbggenerated
     */
    public SystemAdminLog(String adminLogId, String adminId, String adminName, Date operateTime, String operateType, String operateContent, Integer updateCount, Integer rowVersion) {
        this.adminLogId = adminLogId;
        this.adminId = adminId;
        this.adminName = adminName;
        this.operateTime = operateTime;
        this.operateType = operateType;
        this.operateContent = operateContent;
        this.updateCount = updateCount;
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_admin_log
     *
     * @mbggenerated
     */
    public SystemAdminLog() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_log.ADMIN_LOG_ID
     *
     * @return the value of t_system_admin_log.ADMIN_LOG_ID
     *
     * @mbggenerated
     */
    public String getAdminLogId() {
        return adminLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_log.ADMIN_LOG_ID
     *
     * @param adminLogId the value for t_system_admin_log.ADMIN_LOG_ID
     *
     * @mbggenerated
     */
    public void setAdminLogId(String adminLogId) {
        this.adminLogId = adminLogId == null ? null : adminLogId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_log.ADMIN_ID
     *
     * @return the value of t_system_admin_log.ADMIN_ID
     *
     * @mbggenerated
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_log.ADMIN_ID
     *
     * @param adminId the value for t_system_admin_log.ADMIN_ID
     *
     * @mbggenerated
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_log.ADMIN_NAME
     *
     * @return the value of t_system_admin_log.ADMIN_NAME
     *
     * @mbggenerated
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_log.ADMIN_NAME
     *
     * @param adminName the value for t_system_admin_log.ADMIN_NAME
     *
     * @mbggenerated
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_log.OPERATE_TIME
     *
     * @return the value of t_system_admin_log.OPERATE_TIME
     *
     * @mbggenerated
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_log.OPERATE_TIME
     *
     * @param operateTime the value for t_system_admin_log.OPERATE_TIME
     *
     * @mbggenerated
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_log.OPERATE_TYPE
     *
     * @return the value of t_system_admin_log.OPERATE_TYPE
     *
     * @mbggenerated
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_log.OPERATE_TYPE
     *
     * @param operateType the value for t_system_admin_log.OPERATE_TYPE
     *
     * @mbggenerated
     */
    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_log.OPERATE_CONTENT
     *
     * @return the value of t_system_admin_log.OPERATE_CONTENT
     *
     * @mbggenerated
     */
    public String getOperateContent() {
        return operateContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_log.OPERATE_CONTENT
     *
     * @param operateContent the value for t_system_admin_log.OPERATE_CONTENT
     *
     * @mbggenerated
     */
    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent == null ? null : operateContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_log.UPDATE_COUNT
     *
     * @return the value of t_system_admin_log.UPDATE_COUNT
     *
     * @mbggenerated
     */
    public Integer getUpdateCount() {
        return updateCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_log.UPDATE_COUNT
     *
     * @param updateCount the value for t_system_admin_log.UPDATE_COUNT
     *
     * @mbggenerated
     */
    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_log.ROW_VERSION
     *
     * @return the value of t_system_admin_log.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_log.ROW_VERSION
     *
     * @param rowVersion the value for t_system_admin_log.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }
}