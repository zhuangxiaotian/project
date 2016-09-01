package topdeep.commonfund.entity.db;

import java.util.Date;
import topdeep.commonfund.entity.base.BaseEntity;

public class FundCustMessage extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.ID_TYPE
     *
     * @mbggenerated
     */
    private String idType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.ID_NO
     *
     * @mbggenerated
     */
    private String idNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.PUBLISH_TIME
     *
     * @mbggenerated
     */
    private Date publishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.MESSAGE_TITLE
     *
     * @mbggenerated
     */
    private String messageTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.MESSAGE_CONTENT
     *
     * @mbggenerated
     */
    private String messageContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.MESSAGE_TYPE
     *
     * @mbggenerated
     */
    private String messageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.SHOW_CHANNEL
     *
     * @mbggenerated
     */
    private String showChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.AUDIT_STATE
     *
     * @mbggenerated
     */
    private String auditState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.AUDIT_NAME
     *
     * @mbggenerated
     */
    private String auditName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.AUDIT_ID
     *
     * @mbggenerated
     */
    private String auditId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.AUDIT_TIME
     *
     * @mbggenerated
     */
    private Date auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.MODIFY_NAME
     *
     * @mbggenerated
     */
    private String modifyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.MODIFY_ID
     *
     * @mbggenerated
     */
    private String modifyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.MODIFY_TIME
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.CREATE_NAME
     *
     * @mbggenerated
     */
    private String createName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.CREATE_ID
     *
     * @mbggenerated
     */
    private String createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_cust_message.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    public FundCustMessage(String id, String idType, String idNo, Date publishTime, String messageTitle, String messageContent, String messageType, String showChannel, String auditState, String auditName, String auditId, Date auditTime, String modifyName, String modifyId, Date modifyTime, String createName, String createId, Date createTime, Integer rowVersion) {
        this.id = id;
        this.idType = idType;
        this.idNo = idNo;
        this.publishTime = publishTime;
        this.messageTitle = messageTitle;
        this.messageContent = messageContent;
        this.messageType = messageType;
        this.showChannel = showChannel;
        this.auditState = auditState;
        this.auditName = auditName;
        this.auditId = auditId;
        this.auditTime = auditTime;
        this.modifyName = modifyName;
        this.modifyId = modifyId;
        this.modifyTime = modifyTime;
        this.createName = createName;
        this.createId = createId;
        this.createTime = createTime;
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    public FundCustMessage() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.ID
     *
     * @return the value of t_fund_cust_message.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.ID
     *
     * @param id the value for t_fund_cust_message.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.ID_TYPE
     *
     * @return the value of t_fund_cust_message.ID_TYPE
     *
     * @mbggenerated
     */
    public String getIdType() {
        return idType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.ID_TYPE
     *
     * @param idType the value for t_fund_cust_message.ID_TYPE
     *
     * @mbggenerated
     */
    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.ID_NO
     *
     * @return the value of t_fund_cust_message.ID_NO
     *
     * @mbggenerated
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.ID_NO
     *
     * @param idNo the value for t_fund_cust_message.ID_NO
     *
     * @mbggenerated
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.PUBLISH_TIME
     *
     * @return the value of t_fund_cust_message.PUBLISH_TIME
     *
     * @mbggenerated
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.PUBLISH_TIME
     *
     * @param publishTime the value for t_fund_cust_message.PUBLISH_TIME
     *
     * @mbggenerated
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.MESSAGE_TITLE
     *
     * @return the value of t_fund_cust_message.MESSAGE_TITLE
     *
     * @mbggenerated
     */
    public String getMessageTitle() {
        return messageTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.MESSAGE_TITLE
     *
     * @param messageTitle the value for t_fund_cust_message.MESSAGE_TITLE
     *
     * @mbggenerated
     */
    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.MESSAGE_CONTENT
     *
     * @return the value of t_fund_cust_message.MESSAGE_CONTENT
     *
     * @mbggenerated
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.MESSAGE_CONTENT
     *
     * @param messageContent the value for t_fund_cust_message.MESSAGE_CONTENT
     *
     * @mbggenerated
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.MESSAGE_TYPE
     *
     * @return the value of t_fund_cust_message.MESSAGE_TYPE
     *
     * @mbggenerated
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.MESSAGE_TYPE
     *
     * @param messageType the value for t_fund_cust_message.MESSAGE_TYPE
     *
     * @mbggenerated
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType == null ? null : messageType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.SHOW_CHANNEL
     *
     * @return the value of t_fund_cust_message.SHOW_CHANNEL
     *
     * @mbggenerated
     */
    public String getShowChannel() {
        return showChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.SHOW_CHANNEL
     *
     * @param showChannel the value for t_fund_cust_message.SHOW_CHANNEL
     *
     * @mbggenerated
     */
    public void setShowChannel(String showChannel) {
        this.showChannel = showChannel == null ? null : showChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.AUDIT_STATE
     *
     * @return the value of t_fund_cust_message.AUDIT_STATE
     *
     * @mbggenerated
     */
    public String getAuditState() {
        return auditState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.AUDIT_STATE
     *
     * @param auditState the value for t_fund_cust_message.AUDIT_STATE
     *
     * @mbggenerated
     */
    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.AUDIT_NAME
     *
     * @return the value of t_fund_cust_message.AUDIT_NAME
     *
     * @mbggenerated
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.AUDIT_NAME
     *
     * @param auditName the value for t_fund_cust_message.AUDIT_NAME
     *
     * @mbggenerated
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.AUDIT_ID
     *
     * @return the value of t_fund_cust_message.AUDIT_ID
     *
     * @mbggenerated
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.AUDIT_ID
     *
     * @param auditId the value for t_fund_cust_message.AUDIT_ID
     *
     * @mbggenerated
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.AUDIT_TIME
     *
     * @return the value of t_fund_cust_message.AUDIT_TIME
     *
     * @mbggenerated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.AUDIT_TIME
     *
     * @param auditTime the value for t_fund_cust_message.AUDIT_TIME
     *
     * @mbggenerated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.MODIFY_NAME
     *
     * @return the value of t_fund_cust_message.MODIFY_NAME
     *
     * @mbggenerated
     */
    public String getModifyName() {
        return modifyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.MODIFY_NAME
     *
     * @param modifyName the value for t_fund_cust_message.MODIFY_NAME
     *
     * @mbggenerated
     */
    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.MODIFY_ID
     *
     * @return the value of t_fund_cust_message.MODIFY_ID
     *
     * @mbggenerated
     */
    public String getModifyId() {
        return modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.MODIFY_ID
     *
     * @param modifyId the value for t_fund_cust_message.MODIFY_ID
     *
     * @mbggenerated
     */
    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.MODIFY_TIME
     *
     * @return the value of t_fund_cust_message.MODIFY_TIME
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.MODIFY_TIME
     *
     * @param modifyTime the value for t_fund_cust_message.MODIFY_TIME
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.CREATE_NAME
     *
     * @return the value of t_fund_cust_message.CREATE_NAME
     *
     * @mbggenerated
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.CREATE_NAME
     *
     * @param createName the value for t_fund_cust_message.CREATE_NAME
     *
     * @mbggenerated
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.CREATE_ID
     *
     * @return the value of t_fund_cust_message.CREATE_ID
     *
     * @mbggenerated
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.CREATE_ID
     *
     * @param createId the value for t_fund_cust_message.CREATE_ID
     *
     * @mbggenerated
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.CREATE_TIME
     *
     * @return the value of t_fund_cust_message.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.CREATE_TIME
     *
     * @param createTime the value for t_fund_cust_message.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_cust_message.ROW_VERSION
     *
     * @return the value of t_fund_cust_message.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_cust_message.ROW_VERSION
     *
     * @param rowVersion the value for t_fund_cust_message.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }
}