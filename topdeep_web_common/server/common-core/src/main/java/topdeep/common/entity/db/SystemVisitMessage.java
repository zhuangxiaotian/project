package topdeep.common.entity.db;

import java.util.Date;
import topdeep.common.entity.base.BaseEntity;

public class SystemVisitMessage extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.TITLE
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.PARENT_ID
     *
     * @mbggenerated
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.CUSTOMER_NO
     *
     * @mbggenerated
     */
    private String customerNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.NICKNAME
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.MESSAGE_MEMO
     *
     * @mbggenerated
     */
    private String messageMemo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.READ_COUNT
     *
     * @mbggenerated
     */
    private Integer readCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.MESSAGE
     *
     * @mbggenerated
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.REPLY_CONTENT
     *
     * @mbggenerated
     */
    private String replyContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.REPLYER
     *
     * @mbggenerated
     */
    private String replyer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.EMAIL
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.TELEPHONE
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.ADDRESS
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.VISIT_TIME
     *
     * @mbggenerated
     */
    private Date visitTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.REPLY_TIME
     *
     * @mbggenerated
     */
    private Date replyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.MESSAGE_TYPE
     *
     * @mbggenerated
     */
    private String messageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.REPLY_STATUS
     *
     * @mbggenerated
     */
    private String replyStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.REALTION_FUND_MANAGER
     *
     * @mbggenerated
     */
    private String realtionFundManager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.RELATION_FUND
     *
     * @mbggenerated
     */
    private String relationFund;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.CREATE_ID
     *
     * @mbggenerated
     */
    private String createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.CREATE_NAME
     *
     * @mbggenerated
     */
    private String createName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.MODIFY_TIME
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.MODIFY_ID
     *
     * @mbggenerated
     */
    private String modifyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.MODIFY_NAME
     *
     * @mbggenerated
     */
    private String modifyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.AUDIT_ID
     *
     * @mbggenerated
     */
    private String auditId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.AUDIT_TIME
     *
     * @mbggenerated
     */
    private Date auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.AUDIT_NAME
     *
     * @mbggenerated
     */
    private String auditName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.AUDIT_STATE
     *
     * @mbggenerated
     */
    private String auditState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_message.DELETED
     *
     * @mbggenerated
     */
    private String deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_visit_message
     *
     * @mbggenerated
     */
    public SystemVisitMessage(String id, String title, String parentId, String customerNo, String nickname, String messageMemo, Integer readCount, String message, String replyContent, String replyer, String email, String telephone, String address, Date visitTime, Date replyTime, String messageType, String replyStatus, String realtionFundManager, String relationFund, Integer rowVersion, Date createTime, String createId, String createName, Date modifyTime, String modifyId, String modifyName, String auditId, Date auditTime, String auditName, String auditState, String deleted) {
        this.id = id;
        this.title = title;
        this.parentId = parentId;
        this.customerNo = customerNo;
        this.nickname = nickname;
        this.messageMemo = messageMemo;
        this.readCount = readCount;
        this.message = message;
        this.replyContent = replyContent;
        this.replyer = replyer;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.visitTime = visitTime;
        this.replyTime = replyTime;
        this.messageType = messageType;
        this.replyStatus = replyStatus;
        this.realtionFundManager = realtionFundManager;
        this.relationFund = relationFund;
        this.rowVersion = rowVersion;
        this.createTime = createTime;
        this.createId = createId;
        this.createName = createName;
        this.modifyTime = modifyTime;
        this.modifyId = modifyId;
        this.modifyName = modifyName;
        this.auditId = auditId;
        this.auditTime = auditTime;
        this.auditName = auditName;
        this.auditState = auditState;
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_visit_message
     *
     * @mbggenerated
     */
    public SystemVisitMessage() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.ID
     *
     * @return the value of t_system_visit_message.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.ID
     *
     * @param id the value for t_system_visit_message.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.TITLE
     *
     * @return the value of t_system_visit_message.TITLE
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.TITLE
     *
     * @param title the value for t_system_visit_message.TITLE
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.PARENT_ID
     *
     * @return the value of t_system_visit_message.PARENT_ID
     *
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.PARENT_ID
     *
     * @param parentId the value for t_system_visit_message.PARENT_ID
     *
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.CUSTOMER_NO
     *
     * @return the value of t_system_visit_message.CUSTOMER_NO
     *
     * @mbggenerated
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.CUSTOMER_NO
     *
     * @param customerNo the value for t_system_visit_message.CUSTOMER_NO
     *
     * @mbggenerated
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.NICKNAME
     *
     * @return the value of t_system_visit_message.NICKNAME
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.NICKNAME
     *
     * @param nickname the value for t_system_visit_message.NICKNAME
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.MESSAGE_MEMO
     *
     * @return the value of t_system_visit_message.MESSAGE_MEMO
     *
     * @mbggenerated
     */
    public String getMessageMemo() {
        return messageMemo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.MESSAGE_MEMO
     *
     * @param messageMemo the value for t_system_visit_message.MESSAGE_MEMO
     *
     * @mbggenerated
     */
    public void setMessageMemo(String messageMemo) {
        this.messageMemo = messageMemo == null ? null : messageMemo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.READ_COUNT
     *
     * @return the value of t_system_visit_message.READ_COUNT
     *
     * @mbggenerated
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.READ_COUNT
     *
     * @param readCount the value for t_system_visit_message.READ_COUNT
     *
     * @mbggenerated
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.MESSAGE
     *
     * @return the value of t_system_visit_message.MESSAGE
     *
     * @mbggenerated
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.MESSAGE
     *
     * @param message the value for t_system_visit_message.MESSAGE
     *
     * @mbggenerated
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.REPLY_CONTENT
     *
     * @return the value of t_system_visit_message.REPLY_CONTENT
     *
     * @mbggenerated
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.REPLY_CONTENT
     *
     * @param replyContent the value for t_system_visit_message.REPLY_CONTENT
     *
     * @mbggenerated
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.REPLYER
     *
     * @return the value of t_system_visit_message.REPLYER
     *
     * @mbggenerated
     */
    public String getReplyer() {
        return replyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.REPLYER
     *
     * @param replyer the value for t_system_visit_message.REPLYER
     *
     * @mbggenerated
     */
    public void setReplyer(String replyer) {
        this.replyer = replyer == null ? null : replyer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.EMAIL
     *
     * @return the value of t_system_visit_message.EMAIL
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.EMAIL
     *
     * @param email the value for t_system_visit_message.EMAIL
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.TELEPHONE
     *
     * @return the value of t_system_visit_message.TELEPHONE
     *
     * @mbggenerated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.TELEPHONE
     *
     * @param telephone the value for t_system_visit_message.TELEPHONE
     *
     * @mbggenerated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.ADDRESS
     *
     * @return the value of t_system_visit_message.ADDRESS
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.ADDRESS
     *
     * @param address the value for t_system_visit_message.ADDRESS
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.VISIT_TIME
     *
     * @return the value of t_system_visit_message.VISIT_TIME
     *
     * @mbggenerated
     */
    public Date getVisitTime() {
        return visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.VISIT_TIME
     *
     * @param visitTime the value for t_system_visit_message.VISIT_TIME
     *
     * @mbggenerated
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.REPLY_TIME
     *
     * @return the value of t_system_visit_message.REPLY_TIME
     *
     * @mbggenerated
     */
    public Date getReplyTime() {
        return replyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.REPLY_TIME
     *
     * @param replyTime the value for t_system_visit_message.REPLY_TIME
     *
     * @mbggenerated
     */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.MESSAGE_TYPE
     *
     * @return the value of t_system_visit_message.MESSAGE_TYPE
     *
     * @mbggenerated
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.MESSAGE_TYPE
     *
     * @param messageType the value for t_system_visit_message.MESSAGE_TYPE
     *
     * @mbggenerated
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType == null ? null : messageType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.REPLY_STATUS
     *
     * @return the value of t_system_visit_message.REPLY_STATUS
     *
     * @mbggenerated
     */
    public String getReplyStatus() {
        return replyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.REPLY_STATUS
     *
     * @param replyStatus the value for t_system_visit_message.REPLY_STATUS
     *
     * @mbggenerated
     */
    public void setReplyStatus(String replyStatus) {
        this.replyStatus = replyStatus == null ? null : replyStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.REALTION_FUND_MANAGER
     *
     * @return the value of t_system_visit_message.REALTION_FUND_MANAGER
     *
     * @mbggenerated
     */
    public String getRealtionFundManager() {
        return realtionFundManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.REALTION_FUND_MANAGER
     *
     * @param realtionFundManager the value for t_system_visit_message.REALTION_FUND_MANAGER
     *
     * @mbggenerated
     */
    public void setRealtionFundManager(String realtionFundManager) {
        this.realtionFundManager = realtionFundManager == null ? null : realtionFundManager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.RELATION_FUND
     *
     * @return the value of t_system_visit_message.RELATION_FUND
     *
     * @mbggenerated
     */
    public String getRelationFund() {
        return relationFund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.RELATION_FUND
     *
     * @param relationFund the value for t_system_visit_message.RELATION_FUND
     *
     * @mbggenerated
     */
    public void setRelationFund(String relationFund) {
        this.relationFund = relationFund == null ? null : relationFund.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.ROW_VERSION
     *
     * @return the value of t_system_visit_message.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.ROW_VERSION
     *
     * @param rowVersion the value for t_system_visit_message.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.CREATE_TIME
     *
     * @return the value of t_system_visit_message.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.CREATE_TIME
     *
     * @param createTime the value for t_system_visit_message.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.CREATE_ID
     *
     * @return the value of t_system_visit_message.CREATE_ID
     *
     * @mbggenerated
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.CREATE_ID
     *
     * @param createId the value for t_system_visit_message.CREATE_ID
     *
     * @mbggenerated
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.CREATE_NAME
     *
     * @return the value of t_system_visit_message.CREATE_NAME
     *
     * @mbggenerated
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.CREATE_NAME
     *
     * @param createName the value for t_system_visit_message.CREATE_NAME
     *
     * @mbggenerated
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.MODIFY_TIME
     *
     * @return the value of t_system_visit_message.MODIFY_TIME
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.MODIFY_TIME
     *
     * @param modifyTime the value for t_system_visit_message.MODIFY_TIME
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.MODIFY_ID
     *
     * @return the value of t_system_visit_message.MODIFY_ID
     *
     * @mbggenerated
     */
    public String getModifyId() {
        return modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.MODIFY_ID
     *
     * @param modifyId the value for t_system_visit_message.MODIFY_ID
     *
     * @mbggenerated
     */
    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.MODIFY_NAME
     *
     * @return the value of t_system_visit_message.MODIFY_NAME
     *
     * @mbggenerated
     */
    public String getModifyName() {
        return modifyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.MODIFY_NAME
     *
     * @param modifyName the value for t_system_visit_message.MODIFY_NAME
     *
     * @mbggenerated
     */
    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.AUDIT_ID
     *
     * @return the value of t_system_visit_message.AUDIT_ID
     *
     * @mbggenerated
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.AUDIT_ID
     *
     * @param auditId the value for t_system_visit_message.AUDIT_ID
     *
     * @mbggenerated
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.AUDIT_TIME
     *
     * @return the value of t_system_visit_message.AUDIT_TIME
     *
     * @mbggenerated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.AUDIT_TIME
     *
     * @param auditTime the value for t_system_visit_message.AUDIT_TIME
     *
     * @mbggenerated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.AUDIT_NAME
     *
     * @return the value of t_system_visit_message.AUDIT_NAME
     *
     * @mbggenerated
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.AUDIT_NAME
     *
     * @param auditName the value for t_system_visit_message.AUDIT_NAME
     *
     * @mbggenerated
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.AUDIT_STATE
     *
     * @return the value of t_system_visit_message.AUDIT_STATE
     *
     * @mbggenerated
     */
    public String getAuditState() {
        return auditState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.AUDIT_STATE
     *
     * @param auditState the value for t_system_visit_message.AUDIT_STATE
     *
     * @mbggenerated
     */
    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_message.DELETED
     *
     * @return the value of t_system_visit_message.DELETED
     *
     * @mbggenerated
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_message.DELETED
     *
     * @param deleted the value for t_system_visit_message.DELETED
     *
     * @mbggenerated
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }
}