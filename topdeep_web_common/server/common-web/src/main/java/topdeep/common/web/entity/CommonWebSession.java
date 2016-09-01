package topdeep.common.web.entity;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.DisposableBean;

import topdeep.common.util.ApplicationContextHelper;


/**
 * @author niexin
 *
 */
public class CommonWebSession implements Serializable, DisposableBean {

	private static Log log = LogFactory.getLog(CommonWebSession.class);

	/**
	 * 调用网关服务器必须的SessionKey
	 */

	private boolean login = false;

	private String sessionKey = "";

	private String sessionName = "";

	/**
	 * 客户端加密Key，在客户端验证时动态生成
	 */
	private byte[] clientEncryKey;

	/**
	 * 客户端签名Key
	 */
	private String clientSignKey;

	private int failTimes = 0;

	/**
	 * 客户类型 0 非用户 1 直销 2代销
	 */
	private String customerType = "0";

	/**
	 * 客户端来源1微信
	 */
	private String p1 = "";
	/**
	 * 用于标识来源的唯一性，可选字段，对于微信传openid
	 */
	private String p3 = "";
	/**
	 * 访问地址请求唯一标识
	 */
	private String p4 = "";

	/**
	 * 用户姓名
	 */
	private String custName = "";
	/**
	 * 用户性别
	 */
	private String custSex = "";

	/**
	 * 绑定成功后跳转的地址
	 */
	private String bindRetUrl = "";

	/**
	 * 风险测评成功后跳转的地址
	 */
	private String riskRetUrl = "";

	/**
	 * 当前访问的地址
	 */
	private String currUrl = "";

	/**
	 * 当前访问地址的参数
	 */
	private String queryUrlParam = "";
	/**
	 * 参数验证是否通过
	 */
	private boolean srcVerfiyPass;
	/**
	 * 图片验证码
	 */
	private String pictureValidatecode;

	/**
	 * 网页皮肤
	 */
	protected String skin;

	private String riskLevelDesc;
	/**
	 * 设备id
	 */
	private String clientDeviceID;
	/**
	 * android/iphone
	 */
	private String clientType;
	

	/**
	 * 是否机构用户 0 机构 1 个人
	 */
	private String isPersonal;

	/**
	 * 是否验证个人登录的验证码
	 */
	private boolean checkPValidateCode = false;

	/**
	 * 是否验证企业登录的验证码
	 */
	private boolean checkEValidateCode = false;

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}
	
	public String getIsPersonal() {
		return isPersonal;
	}
	
	public void setIsPersonal(String isPersonal) {
		this.isPersonal = isPersonal;
	}


	public CommonWebSession() {
		this.sessionName = "111";
		getSessionManage().sessionCreate(this);
	}

	private CommonWebSessionManage getSessionManage() {
		return (CommonWebSessionManage) ApplicationContextHelper.getBean("commonWebSessionManage");
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	/**
	 * @return the sessionName
	 */
	public String getSessionName() {
		return sessionName;
	}

	/**
	 * @param sessionName the sessionName to set
	 */
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public String getP4() {
		return p4;
	}

	public void setP4(String p4) {
		this.p4 = p4;
	}

	public boolean isSrcVerfiyPass() {
		return srcVerfiyPass;
	}

	public void setSrcVerfiyPass(boolean verfiyPass) {
		this.srcVerfiyPass = verfiyPass;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPictureValidatecode() {
		return pictureValidatecode;
	}

	public void setPictureValidatecode(String pictureValidatecode) {
		this.pictureValidatecode = pictureValidatecode;
	}

	public String getBindRetUrl() {
		return bindRetUrl;
	}

	public void setBindRetUrl(String bindRetUrl) {
		this.bindRetUrl = bindRetUrl;
	}

	public String getCustSex() {
		return custSex;
	}

	public void setCustSex(String custSex) {
		this.custSex = custSex;
	}


	public String getQueryUrlParam() {
		return queryUrlParam;
	}

	public void setQueryUrlParam(String queryUrlParam) {
		this.queryUrlParam = queryUrlParam;
	}

	public String getCurrUrl() {
		return currUrl;
	}

	public void setCurrUrl(String currUrl) {
		this.currUrl = currUrl;
	}

	public String getRiskRetUrl() {
		return riskRetUrl;
	}

	public void setRiskRetUrl(String riskRetUrl) {
		this.riskRetUrl = riskRetUrl;
	}

	/**
	 * @return the sessionKey
	 */
	public String getSessionKey() {
		return sessionKey;
	}

	/**
	 * @param sessionKey the sessionKey to set
	 */
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	public void destroy() throws Exception {
		getSessionManage().sessionDestory(this);
	}

	/**
	 * @return the clientEncryKey
	 */
	public byte[] getClientEncryKey() {
		return clientEncryKey;
	}

	/**
	 * @param clientEncryKey the clientEncryKey to set
	 */
	public void setClientEncryKey(byte[] clientEncryKey) {
		this.clientEncryKey = clientEncryKey;
	}

	/**
	 * @return the clientSignKey
	 */
	public String getClientSignKey() {
		return clientSignKey;
	}

	/**
	 * @param clientSignKey the clientSignKey to set
	 */
	public void setClientSignKey(String clientSignKey) {
		this.clientSignKey = clientSignKey;
	}


	public int getFailTimes() {
		return failTimes;
	}

	public void setFailTimes(int failTimes) {
		this.failTimes = failTimes;
	}

	public String getRiskLevelDesc() {
		return riskLevelDesc;
	}

	public void setRiskLevelDesc(String riskLevelDesc) {
		this.riskLevelDesc = riskLevelDesc;
	}

	public String getClientDeviceID() {
		return clientDeviceID;
	}

	public void setClientDeviceID(String clientDeviceID) {
		this.clientDeviceID = clientDeviceID;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public boolean isCheckPValidateCode() {
		return checkPValidateCode;
	}

	public void setCheckPValidateCode(boolean checkPValidateCode) {
		this.checkPValidateCode = checkPValidateCode;
	}

	public boolean isCheckEValidateCode() {
		return checkEValidateCode;
	}

	public void setCheckEValidateCode(boolean checkEValidateCode) {
		this.checkEValidateCode = checkEValidateCode;
	}

}
