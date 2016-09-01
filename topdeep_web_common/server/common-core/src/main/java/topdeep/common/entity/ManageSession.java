package topdeep.common.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author shidewen
 * 
 */
public class ManageSession implements Serializable {

	private static final long serialVersionUID = 260420461225723554L;

	private static Log log = LogFactory.getLog(ManageSession.class);

	protected String loginUserId;

	protected String loginSuperUserId;

	protected String loginUserName;

	protected Map<String, Object> data = new HashMap<String, Object>();

	public void manageSessionClear() {
		loginUserId = "";
		loginUserName = "";
		loginSuperUserId = "";
	}

	/**
	 * @return the loginUserId
	 */
	public String getLoginUserId() {
		return loginUserId;
	}

	/**
	 * @param loginUserId the loginUserId to set
	 */
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public void setLoginSuperUserId(String loginSuperUserId) {
		this.loginSuperUserId = loginSuperUserId;
		log.debug("setLoginSuperUserId to: " + this.loginSuperUserId);
	}

	/**
	 * @return the loginUserName
	 */
	public String getLoginUserName() {
		return loginUserName;
	}

	/**
	 * @param loginUserName the loginUserName to set
	 */
	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}

	/**
	 * 根据Key读取其它自定义对象
	 * 
	 * @param key
	 * @return
	 */
	public Object get(String key) {
		return data.get(key);
	}

	/**
	 * 设置自定义对象
	 * 
	 * @param key
	 * @param value
	 */
	public void set(String key, Object value) {
		data.put(key, value);
	}

	/**
	 * @return the loginSuperUserId
	 */
	public String getLoginSuperUserId() {
		return loginSuperUserId;
	}

}
