package topdeep.commonfund.entity.db;

import topdeep.commonfund.entity.base.BaseEntity;

public class FundBindInfoKey extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_bind_info.BIND_SRC
     *
     * @mbggenerated
     */
    private String bindSrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_bind_info.OPENID
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_bind_info
     *
     * @mbggenerated
     */
    public FundBindInfoKey(String bindSrc, String openid) {
        this.bindSrc = bindSrc;
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_bind_info
     *
     * @mbggenerated
     */
    public FundBindInfoKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_bind_info.BIND_SRC
     *
     * @return the value of t_fund_bind_info.BIND_SRC
     *
     * @mbggenerated
     */
    public String getBindSrc() {
        return bindSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_bind_info.BIND_SRC
     *
     * @param bindSrc the value for t_fund_bind_info.BIND_SRC
     *
     * @mbggenerated
     */
    public void setBindSrc(String bindSrc) {
        this.bindSrc = bindSrc == null ? null : bindSrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_bind_info.OPENID
     *
     * @return the value of t_fund_bind_info.OPENID
     *
     * @mbggenerated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_bind_info.OPENID
     *
     * @param openid the value for t_fund_bind_info.OPENID
     *
     * @mbggenerated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
}