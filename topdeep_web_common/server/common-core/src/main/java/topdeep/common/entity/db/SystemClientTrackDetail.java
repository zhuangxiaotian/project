package topdeep.common.entity.db;

import topdeep.common.entity.base.BaseEntity;

public class SystemClientTrackDetail extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_client_track_detail.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_client_track_detail.TRACK_ID
     *
     * @mbggenerated
     */
    private String trackId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_client_track_detail.DETAIL_KEY
     *
     * @mbggenerated
     */
    private String detailKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_client_track_detail.DETAIL_VALUE
     *
     * @mbggenerated
     */
    private String detailValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_client_track_detail.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_client_track_detail
     *
     * @mbggenerated
     */
    public SystemClientTrackDetail(String id, String trackId, String detailKey, String detailValue, Integer rowVersion) {
        this.id = id;
        this.trackId = trackId;
        this.detailKey = detailKey;
        this.detailValue = detailValue;
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_client_track_detail
     *
     * @mbggenerated
     */
    public SystemClientTrackDetail() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_client_track_detail.ID
     *
     * @return the value of t_system_client_track_detail.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_client_track_detail.ID
     *
     * @param id the value for t_system_client_track_detail.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_client_track_detail.TRACK_ID
     *
     * @return the value of t_system_client_track_detail.TRACK_ID
     *
     * @mbggenerated
     */
    public String getTrackId() {
        return trackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_client_track_detail.TRACK_ID
     *
     * @param trackId the value for t_system_client_track_detail.TRACK_ID
     *
     * @mbggenerated
     */
    public void setTrackId(String trackId) {
        this.trackId = trackId == null ? null : trackId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_client_track_detail.DETAIL_KEY
     *
     * @return the value of t_system_client_track_detail.DETAIL_KEY
     *
     * @mbggenerated
     */
    public String getDetailKey() {
        return detailKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_client_track_detail.DETAIL_KEY
     *
     * @param detailKey the value for t_system_client_track_detail.DETAIL_KEY
     *
     * @mbggenerated
     */
    public void setDetailKey(String detailKey) {
        this.detailKey = detailKey == null ? null : detailKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_client_track_detail.DETAIL_VALUE
     *
     * @return the value of t_system_client_track_detail.DETAIL_VALUE
     *
     * @mbggenerated
     */
    public String getDetailValue() {
        return detailValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_client_track_detail.DETAIL_VALUE
     *
     * @param detailValue the value for t_system_client_track_detail.DETAIL_VALUE
     *
     * @mbggenerated
     */
    public void setDetailValue(String detailValue) {
        this.detailValue = detailValue == null ? null : detailValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_client_track_detail.ROW_VERSION
     *
     * @return the value of t_system_client_track_detail.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_client_track_detail.ROW_VERSION
     *
     * @param rowVersion the value for t_system_client_track_detail.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }
}