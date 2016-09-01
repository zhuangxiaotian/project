package topdeep.common.entity.db;

import java.util.Date;
import topdeep.common.entity.base.BaseEntity;

public class SystemVisitLog extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.VISIT_SRC
     *
     * @mbggenerated
     */
    private String visitSrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.OPENID
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.CHANNEL
     *
     * @mbggenerated
     */
    private String channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.SRC_VERSION
     *
     * @mbggenerated
     */
    private String srcVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.CLIENT_TYPE
     *
     * @mbggenerated
     */
    private String clientType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.OS
     *
     * @mbggenerated
     */
    private String os;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.OS_VERSION
     *
     * @mbggenerated
     */
    private String osVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.NETWORK
     *
     * @mbggenerated
     */
    private String network;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.SERVICE
     *
     * @mbggenerated
     */
    private String service;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.MOBILE_PHONE
     *
     * @mbggenerated
     */
    private String mobilePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.SCREEN
     *
     * @mbggenerated
     */
    private String screen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.OTHER
     *
     * @mbggenerated
     */
    private String other;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.LOG_SESSION_ID
     *
     * @mbggenerated
     */
    private String logSessionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.LOG_IP
     *
     * @mbggenerated
     */
    private String logIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.LOG_UA
     *
     * @mbggenerated
     */
    private String logUa;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.LOG_REFER_URL
     *
     * @mbggenerated
     */
    private String logReferUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.LOG_URL
     *
     * @mbggenerated
     */
    private String logUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.LOG_PARAM
     *
     * @mbggenerated
     */
    private String logParam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.LOG_TIME
     *
     * @mbggenerated
     */
    private Date logTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.VISIT_RESULT
     *
     * @mbggenerated
     */
    private String visitResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.VISIT_FAIL_REASON
     *
     * @mbggenerated
     */
    private String visitFailReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.VISIT_RESULT_VIEW
     *
     * @mbggenerated
     */
    private String visitResultView;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_visit_log.PROCESS_TIME
     *
     * @mbggenerated
     */
    private Integer processTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_visit_log
     *
     * @mbggenerated
     */
    public SystemVisitLog(String id, String visitSrc, String openid, String channel, String srcVersion, String clientType, String os, String osVersion, String network, String service, String mobilePhone, String screen, String other, String logSessionId, String logIp, String logUa, String logReferUrl, String logUrl, String logParam, Date logTime, String visitResult, String visitFailReason, String visitResultView, Integer processTime) {
        this.id = id;
        this.visitSrc = visitSrc;
        this.openid = openid;
        this.channel = channel;
        this.srcVersion = srcVersion;
        this.clientType = clientType;
        this.os = os;
        this.osVersion = osVersion;
        this.network = network;
        this.service = service;
        this.mobilePhone = mobilePhone;
        this.screen = screen;
        this.other = other;
        this.logSessionId = logSessionId;
        this.logIp = logIp;
        this.logUa = logUa;
        this.logReferUrl = logReferUrl;
        this.logUrl = logUrl;
        this.logParam = logParam;
        this.logTime = logTime;
        this.visitResult = visitResult;
        this.visitFailReason = visitFailReason;
        this.visitResultView = visitResultView;
        this.processTime = processTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_visit_log
     *
     * @mbggenerated
     */
    public SystemVisitLog() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.ID
     *
     * @return the value of t_system_visit_log.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.ID
     *
     * @param id the value for t_system_visit_log.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.VISIT_SRC
     *
     * @return the value of t_system_visit_log.VISIT_SRC
     *
     * @mbggenerated
     */
    public String getVisitSrc() {
        return visitSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.VISIT_SRC
     *
     * @param visitSrc the value for t_system_visit_log.VISIT_SRC
     *
     * @mbggenerated
     */
    public void setVisitSrc(String visitSrc) {
        this.visitSrc = visitSrc == null ? null : visitSrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.OPENID
     *
     * @return the value of t_system_visit_log.OPENID
     *
     * @mbggenerated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.OPENID
     *
     * @param openid the value for t_system_visit_log.OPENID
     *
     * @mbggenerated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.CHANNEL
     *
     * @return the value of t_system_visit_log.CHANNEL
     *
     * @mbggenerated
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.CHANNEL
     *
     * @param channel the value for t_system_visit_log.CHANNEL
     *
     * @mbggenerated
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.SRC_VERSION
     *
     * @return the value of t_system_visit_log.SRC_VERSION
     *
     * @mbggenerated
     */
    public String getSrcVersion() {
        return srcVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.SRC_VERSION
     *
     * @param srcVersion the value for t_system_visit_log.SRC_VERSION
     *
     * @mbggenerated
     */
    public void setSrcVersion(String srcVersion) {
        this.srcVersion = srcVersion == null ? null : srcVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.CLIENT_TYPE
     *
     * @return the value of t_system_visit_log.CLIENT_TYPE
     *
     * @mbggenerated
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.CLIENT_TYPE
     *
     * @param clientType the value for t_system_visit_log.CLIENT_TYPE
     *
     * @mbggenerated
     */
    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.OS
     *
     * @return the value of t_system_visit_log.OS
     *
     * @mbggenerated
     */
    public String getOs() {
        return os;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.OS
     *
     * @param os the value for t_system_visit_log.OS
     *
     * @mbggenerated
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.OS_VERSION
     *
     * @return the value of t_system_visit_log.OS_VERSION
     *
     * @mbggenerated
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.OS_VERSION
     *
     * @param osVersion the value for t_system_visit_log.OS_VERSION
     *
     * @mbggenerated
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.NETWORK
     *
     * @return the value of t_system_visit_log.NETWORK
     *
     * @mbggenerated
     */
    public String getNetwork() {
        return network;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.NETWORK
     *
     * @param network the value for t_system_visit_log.NETWORK
     *
     * @mbggenerated
     */
    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.SERVICE
     *
     * @return the value of t_system_visit_log.SERVICE
     *
     * @mbggenerated
     */
    public String getService() {
        return service;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.SERVICE
     *
     * @param service the value for t_system_visit_log.SERVICE
     *
     * @mbggenerated
     */
    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.MOBILE_PHONE
     *
     * @return the value of t_system_visit_log.MOBILE_PHONE
     *
     * @mbggenerated
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.MOBILE_PHONE
     *
     * @param mobilePhone the value for t_system_visit_log.MOBILE_PHONE
     *
     * @mbggenerated
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.SCREEN
     *
     * @return the value of t_system_visit_log.SCREEN
     *
     * @mbggenerated
     */
    public String getScreen() {
        return screen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.SCREEN
     *
     * @param screen the value for t_system_visit_log.SCREEN
     *
     * @mbggenerated
     */
    public void setScreen(String screen) {
        this.screen = screen == null ? null : screen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.OTHER
     *
     * @return the value of t_system_visit_log.OTHER
     *
     * @mbggenerated
     */
    public String getOther() {
        return other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.OTHER
     *
     * @param other the value for t_system_visit_log.OTHER
     *
     * @mbggenerated
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.LOG_SESSION_ID
     *
     * @return the value of t_system_visit_log.LOG_SESSION_ID
     *
     * @mbggenerated
     */
    public String getLogSessionId() {
        return logSessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.LOG_SESSION_ID
     *
     * @param logSessionId the value for t_system_visit_log.LOG_SESSION_ID
     *
     * @mbggenerated
     */
    public void setLogSessionId(String logSessionId) {
        this.logSessionId = logSessionId == null ? null : logSessionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.LOG_IP
     *
     * @return the value of t_system_visit_log.LOG_IP
     *
     * @mbggenerated
     */
    public String getLogIp() {
        return logIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.LOG_IP
     *
     * @param logIp the value for t_system_visit_log.LOG_IP
     *
     * @mbggenerated
     */
    public void setLogIp(String logIp) {
        this.logIp = logIp == null ? null : logIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.LOG_UA
     *
     * @return the value of t_system_visit_log.LOG_UA
     *
     * @mbggenerated
     */
    public String getLogUa() {
        return logUa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.LOG_UA
     *
     * @param logUa the value for t_system_visit_log.LOG_UA
     *
     * @mbggenerated
     */
    public void setLogUa(String logUa) {
        this.logUa = logUa == null ? null : logUa.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.LOG_REFER_URL
     *
     * @return the value of t_system_visit_log.LOG_REFER_URL
     *
     * @mbggenerated
     */
    public String getLogReferUrl() {
        return logReferUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.LOG_REFER_URL
     *
     * @param logReferUrl the value for t_system_visit_log.LOG_REFER_URL
     *
     * @mbggenerated
     */
    public void setLogReferUrl(String logReferUrl) {
        this.logReferUrl = logReferUrl == null ? null : logReferUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.LOG_URL
     *
     * @return the value of t_system_visit_log.LOG_URL
     *
     * @mbggenerated
     */
    public String getLogUrl() {
        return logUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.LOG_URL
     *
     * @param logUrl the value for t_system_visit_log.LOG_URL
     *
     * @mbggenerated
     */
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl == null ? null : logUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.LOG_PARAM
     *
     * @return the value of t_system_visit_log.LOG_PARAM
     *
     * @mbggenerated
     */
    public String getLogParam() {
        return logParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.LOG_PARAM
     *
     * @param logParam the value for t_system_visit_log.LOG_PARAM
     *
     * @mbggenerated
     */
    public void setLogParam(String logParam) {
        this.logParam = logParam == null ? null : logParam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.LOG_TIME
     *
     * @return the value of t_system_visit_log.LOG_TIME
     *
     * @mbggenerated
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.LOG_TIME
     *
     * @param logTime the value for t_system_visit_log.LOG_TIME
     *
     * @mbggenerated
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.VISIT_RESULT
     *
     * @return the value of t_system_visit_log.VISIT_RESULT
     *
     * @mbggenerated
     */
    public String getVisitResult() {
        return visitResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.VISIT_RESULT
     *
     * @param visitResult the value for t_system_visit_log.VISIT_RESULT
     *
     * @mbggenerated
     */
    public void setVisitResult(String visitResult) {
        this.visitResult = visitResult == null ? null : visitResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.VISIT_FAIL_REASON
     *
     * @return the value of t_system_visit_log.VISIT_FAIL_REASON
     *
     * @mbggenerated
     */
    public String getVisitFailReason() {
        return visitFailReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.VISIT_FAIL_REASON
     *
     * @param visitFailReason the value for t_system_visit_log.VISIT_FAIL_REASON
     *
     * @mbggenerated
     */
    public void setVisitFailReason(String visitFailReason) {
        this.visitFailReason = visitFailReason == null ? null : visitFailReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.VISIT_RESULT_VIEW
     *
     * @return the value of t_system_visit_log.VISIT_RESULT_VIEW
     *
     * @mbggenerated
     */
    public String getVisitResultView() {
        return visitResultView;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.VISIT_RESULT_VIEW
     *
     * @param visitResultView the value for t_system_visit_log.VISIT_RESULT_VIEW
     *
     * @mbggenerated
     */
    public void setVisitResultView(String visitResultView) {
        this.visitResultView = visitResultView == null ? null : visitResultView.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_visit_log.PROCESS_TIME
     *
     * @return the value of t_system_visit_log.PROCESS_TIME
     *
     * @mbggenerated
     */
    public Integer getProcessTime() {
        return processTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_visit_log.PROCESS_TIME
     *
     * @param processTime the value for t_system_visit_log.PROCESS_TIME
     *
     * @mbggenerated
     */
    public void setProcessTime(Integer processTime) {
        this.processTime = processTime;
    }
}