/**
 * 
 */
package topdeep.commonfund.entity;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author niexin
 *
 */
public class ClientSession implements Serializable {

	private static Log logger = LogFactory.getLog(ClientSession.class);

	/**
	 * 0未开户 1 个人直销 2个人代销 3个人直销代销客户 4注册客户 5专户直销客户
	 */
	private String customerType;

	/**
	 * 客户证件类型
	 */
	private String idType;
	/**
	 * 客户证件号码
	 */
	private String idNo;

	/**
	 * 登陆类型
	 */
	private String loginType;

	/**
	 * 登录用户的客户编号-直销客户编号
	 */
	private String customerNo;

	/**
	 * 客服登录的客户编号
	 */
	private String queryCustomerNo;

	private String taaccountid;

	/**
	 * 注册密码（密文）
	 */
	private String registerPassword;

	/**
	 * 客户姓名
	 */
	private String custName;

	/**
	 * 恒生sessionbKey
	 */
	private String hundsunSessionKey;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 客户在我们这边的客户编号
	 */
	private String custId;

	/**
	 * 昵称
	 */
	private String nickName;

	/**
	 * 当前登陆用户的appid
	 */
	private String appId;

	public ClientSession() {
		logger.debug("ClientSession Created!");
	}

	public void clear() {
		this.custName = "";
		this.customerNo = "";
		this.customerType = "0";
		this.queryCustomerNo = "";
		this.taaccountid = "";
		this.idNo = "";
		this.idType = "";
		this.loginType = "";
		this.taaccountid = "";
		this.registerPassword = "";
		this.custName = "";
		this.mobile = "";
		this.custId = "";
		this.nickName = "";
		this.appId = "";
	}

	/**
	 * @return the customerNo
	 */
	public String getCustomerNo() {
		return customerNo;
	}

	/**
	 * @param customerNo the customerNo to set
	 */
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
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

	/**
	 * @return the queryCustomerNo
	 */
	public String getQueryCustomerNo() {
		return queryCustomerNo;
	}

	/**
	 * @param queryCustomerNo the queryCustomerNo to set
	 */
	public void setQueryCustomerNo(String queryCustomerNo) {
		this.queryCustomerNo = queryCustomerNo;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	/**
	 * @return the idType
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * @param idType the idType to set
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}

	/**
	 * @return the idNo
	 */
	public String getIdNo() {
		return idNo;
	}

	/**
	 * @param idNo the idNo to set
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	/**
	 * @return the taaccountid
	 */
	public String getTaaccountid() {
		return taaccountid;
	}

	/**
	 * @param taaccountid the taaccountid to set
	 */
	public void setTaaccountid(String taaccountid) {
		this.taaccountid = taaccountid;
	}

	public String getRegisterPassword() {
		return registerPassword;
	}

	public void setRegisterPassword(String registerPassword) {
		this.registerPassword = registerPassword;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getHundsunSessionKey() {
		return hundsunSessionKey;
	}

	public void setHundsunSessionKey(String hundsunSessionKey) {
		this.hundsunSessionKey = hundsunSessionKey;
	}

	public String getMobile() {
		return mobile;
	}

	public String getCustId() {
		return custId;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

}
