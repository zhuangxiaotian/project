package topdeep.common.entity.db;

import topdeep.common.entity.base.BaseEntity;

public class SystemClientVersionKey extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_client_version.CLIENT_TYPE
     *
     * @mbggenerated
     */
    private String clientType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_client_version.CLIENT_VERSION
     *
     * @mbggenerated
     */
    private String clientVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_client_version
     *
     * @mbggenerated
     */
    public SystemClientVersionKey(String clientType, String clientVersion) {
        this.clientType = clientType;
        this.clientVersion = clientVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_client_version
     *
     * @mbggenerated
     */
    public SystemClientVersionKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_client_version.CLIENT_TYPE
     *
     * @return the value of t_system_client_version.CLIENT_TYPE
     *
     * @mbggenerated
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_client_version.CLIENT_TYPE
     *
     * @param clientType the value for t_system_client_version.CLIENT_TYPE
     *
     * @mbggenerated
     */
    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_client_version.CLIENT_VERSION
     *
     * @return the value of t_system_client_version.CLIENT_VERSION
     *
     * @mbggenerated
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_client_version.CLIENT_VERSION
     *
     * @param clientVersion the value for t_system_client_version.CLIENT_VERSION
     *
     * @mbggenerated
     */
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion == null ? null : clientVersion.trim();
    }
}