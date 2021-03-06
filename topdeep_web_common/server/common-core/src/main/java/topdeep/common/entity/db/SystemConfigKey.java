package topdeep.common.entity.db;

import topdeep.common.entity.base.BaseEntity;

public class SystemConfigKey extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_config.SYSTEM_PARAM_CATEGORY
     *
     * @mbggenerated
     */
    private String systemParamCategory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_config.SYSTEM_PARAM_CODE
     *
     * @mbggenerated
     */
    private String systemParamCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_config
     *
     * @mbggenerated
     */
    public SystemConfigKey(String systemParamCategory, String systemParamCode) {
        this.systemParamCategory = systemParamCategory;
        this.systemParamCode = systemParamCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_config
     *
     * @mbggenerated
     */
    public SystemConfigKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_config.SYSTEM_PARAM_CATEGORY
     *
     * @return the value of t_system_config.SYSTEM_PARAM_CATEGORY
     *
     * @mbggenerated
     */
    public String getSystemParamCategory() {
        return systemParamCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_config.SYSTEM_PARAM_CATEGORY
     *
     * @param systemParamCategory the value for t_system_config.SYSTEM_PARAM_CATEGORY
     *
     * @mbggenerated
     */
    public void setSystemParamCategory(String systemParamCategory) {
        this.systemParamCategory = systemParamCategory == null ? null : systemParamCategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_config.SYSTEM_PARAM_CODE
     *
     * @return the value of t_system_config.SYSTEM_PARAM_CODE
     *
     * @mbggenerated
     */
    public String getSystemParamCode() {
        return systemParamCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_config.SYSTEM_PARAM_CODE
     *
     * @param systemParamCode the value for t_system_config.SYSTEM_PARAM_CODE
     *
     * @mbggenerated
     */
    public void setSystemParamCode(String systemParamCode) {
        this.systemParamCode = systemParamCode == null ? null : systemParamCode.trim();
    }
}