package topdeep.common.entity.db;

import topdeep.common.entity.base.BaseEntity;

public class SystemAdminRoles extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_roles.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_roles.ADMIN_ID
     *
     * @mbggenerated
     */
    private String adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_roles.ROLES_ID
     *
     * @mbggenerated
     */
    private String rolesId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_admin_roles.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_admin_roles
     *
     * @mbggenerated
     */
    public SystemAdminRoles(String id, String adminId, String rolesId, Integer rowVersion) {
        this.id = id;
        this.adminId = adminId;
        this.rolesId = rolesId;
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_admin_roles
     *
     * @mbggenerated
     */
    public SystemAdminRoles() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_roles.ID
     *
     * @return the value of t_system_admin_roles.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_roles.ID
     *
     * @param id the value for t_system_admin_roles.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_roles.ADMIN_ID
     *
     * @return the value of t_system_admin_roles.ADMIN_ID
     *
     * @mbggenerated
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_roles.ADMIN_ID
     *
     * @param adminId the value for t_system_admin_roles.ADMIN_ID
     *
     * @mbggenerated
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_roles.ROLES_ID
     *
     * @return the value of t_system_admin_roles.ROLES_ID
     *
     * @mbggenerated
     */
    public String getRolesId() {
        return rolesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_roles.ROLES_ID
     *
     * @param rolesId the value for t_system_admin_roles.ROLES_ID
     *
     * @mbggenerated
     */
    public void setRolesId(String rolesId) {
        this.rolesId = rolesId == null ? null : rolesId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_admin_roles.ROW_VERSION
     *
     * @return the value of t_system_admin_roles.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_admin_roles.ROW_VERSION
     *
     * @param rowVersion the value for t_system_admin_roles.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }
}