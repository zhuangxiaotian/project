package topdeep.commonfund.entity.db;

import java.util.Date;

public class FundFundCatagoryFundRela extends FundFundCatagoryFundRelaKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.ORDER_FIELD
     *
     * @mbggenerated
     */
    private Date orderField;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.CREATE_ID
     *
     * @mbggenerated
     */
    private String createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.CREATE_NAME
     *
     * @mbggenerated
     */
    private String createName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.MODIFY_TIME
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.MODIFY_ID
     *
     * @mbggenerated
     */
    private String modifyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.MODIFY_NAME
     *
     * @mbggenerated
     */
    private String modifyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.AUDIT_TIME
     *
     * @mbggenerated
     */
    private Date auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.AUDIT_ID
     *
     * @mbggenerated
     */
    private String auditId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.AUDIT_NAME
     *
     * @mbggenerated
     */
    private String auditName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_fund_catagory_fund_rela.AUDIT_STATE
     *
     * @mbggenerated
     */
    private String auditState;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_fund_catagory_fund_rela
     *
     * @mbggenerated
     */
    public FundFundCatagoryFundRela(String categoryId, String fundCode, Date orderField, Integer rowVersion, Date createTime, String createId, String createName, Date modifyTime, String modifyId, String modifyName, Date auditTime, String auditId, String auditName, String auditState) {
        super(categoryId, fundCode);
        this.orderField = orderField;
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
     * This method corresponds to the database table t_fund_fund_catagory_fund_rela
     *
     * @mbggenerated
     */
    public FundFundCatagoryFundRela() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.ORDER_FIELD
     *
     * @return the value of t_fund_fund_catagory_fund_rela.ORDER_FIELD
     *
     * @mbggenerated
     */
    public Date getOrderField() {
        return orderField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.ORDER_FIELD
     *
     * @param orderField the value for t_fund_fund_catagory_fund_rela.ORDER_FIELD
     *
     * @mbggenerated
     */
    public void setOrderField(Date orderField) {
        this.orderField = orderField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.ROW_VERSION
     *
     * @return the value of t_fund_fund_catagory_fund_rela.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.ROW_VERSION
     *
     * @param rowVersion the value for t_fund_fund_catagory_fund_rela.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.CREATE_TIME
     *
     * @return the value of t_fund_fund_catagory_fund_rela.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.CREATE_TIME
     *
     * @param createTime the value for t_fund_fund_catagory_fund_rela.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.CREATE_ID
     *
     * @return the value of t_fund_fund_catagory_fund_rela.CREATE_ID
     *
     * @mbggenerated
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.CREATE_ID
     *
     * @param createId the value for t_fund_fund_catagory_fund_rela.CREATE_ID
     *
     * @mbggenerated
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.CREATE_NAME
     *
     * @return the value of t_fund_fund_catagory_fund_rela.CREATE_NAME
     *
     * @mbggenerated
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.CREATE_NAME
     *
     * @param createName the value for t_fund_fund_catagory_fund_rela.CREATE_NAME
     *
     * @mbggenerated
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.MODIFY_TIME
     *
     * @return the value of t_fund_fund_catagory_fund_rela.MODIFY_TIME
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.MODIFY_TIME
     *
     * @param modifyTime the value for t_fund_fund_catagory_fund_rela.MODIFY_TIME
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.MODIFY_ID
     *
     * @return the value of t_fund_fund_catagory_fund_rela.MODIFY_ID
     *
     * @mbggenerated
     */
    public String getModifyId() {
        return modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.MODIFY_ID
     *
     * @param modifyId the value for t_fund_fund_catagory_fund_rela.MODIFY_ID
     *
     * @mbggenerated
     */
    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.MODIFY_NAME
     *
     * @return the value of t_fund_fund_catagory_fund_rela.MODIFY_NAME
     *
     * @mbggenerated
     */
    public String getModifyName() {
        return modifyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.MODIFY_NAME
     *
     * @param modifyName the value for t_fund_fund_catagory_fund_rela.MODIFY_NAME
     *
     * @mbggenerated
     */
    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.AUDIT_TIME
     *
     * @return the value of t_fund_fund_catagory_fund_rela.AUDIT_TIME
     *
     * @mbggenerated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.AUDIT_TIME
     *
     * @param auditTime the value for t_fund_fund_catagory_fund_rela.AUDIT_TIME
     *
     * @mbggenerated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.AUDIT_ID
     *
     * @return the value of t_fund_fund_catagory_fund_rela.AUDIT_ID
     *
     * @mbggenerated
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.AUDIT_ID
     *
     * @param auditId the value for t_fund_fund_catagory_fund_rela.AUDIT_ID
     *
     * @mbggenerated
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.AUDIT_NAME
     *
     * @return the value of t_fund_fund_catagory_fund_rela.AUDIT_NAME
     *
     * @mbggenerated
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.AUDIT_NAME
     *
     * @param auditName the value for t_fund_fund_catagory_fund_rela.AUDIT_NAME
     *
     * @mbggenerated
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_fund_catagory_fund_rela.AUDIT_STATE
     *
     * @return the value of t_fund_fund_catagory_fund_rela.AUDIT_STATE
     *
     * @mbggenerated
     */
    public String getAuditState() {
        return auditState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_fund_catagory_fund_rela.AUDIT_STATE
     *
     * @param auditState the value for t_fund_fund_catagory_fund_rela.AUDIT_STATE
     *
     * @mbggenerated
     */
    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }
}