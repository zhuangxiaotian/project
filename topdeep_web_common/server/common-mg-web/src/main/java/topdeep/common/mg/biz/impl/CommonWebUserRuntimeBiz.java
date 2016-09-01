package topdeep.common.mg.biz.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import topdeep.common.biz.common.TopdeepConfigManage;
import topdeep.common.mg.biz.CommonWebRuntime;
import topdeep.common.mg.entity.CommonSession;

/**
 * 
 * @author shidewen
 * 
 */
public class CommonWebUserRuntimeBiz implements CommonWebRuntime {

	public static final String CURRENT_VISIT_URL_KEY = "topdeep.common.mg.biz.CommonWebUserRuntimeBiz.currentVisitUrl";

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("commonSession")
	protected CommonSession commonSession;

	@Autowired
	protected TopdeepConfigManage topdeepConfigManage;

	public String getLoginSuperUserId() {
		return commonSession.getLoginSuperUserId();
	}

	public String getLoginUserId() {
		return commonSession.getLoginUserId();
	}

	public boolean hasPrivilege(int func, int operate) {
		if (!topdeepConfigManage.hasPrivilege(func)) {
			return false;
		}
		String loginUserId = getLoginUserId();
		String superUserId = getLoginSuperUserId();
		if (loginUserId != null && loginUserId.equals(superUserId)) {
			// 超级管理员默认拥有所有权限，不需要额外授权
			return true;
		}
		return commonSession.hasPrivilege(func, operate);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#getLoginUserName()
	 */
	public String getLoginUserName() {
		return commonSession.getLoginUserName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#addPrivilege(java.lang.String)
	 */
	public void addPrivilege(String privilegeValue) {
		commonSession.addPrivilege(privilegeValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#get(java.lang.String)
	 */
	public Object get(String key) {
		return commonSession.get(key);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#isLogin()
	 */
	public boolean isLogin() {
		return commonSession.isLogin();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#set(java.lang.String, java.lang.Object)
	 */
	public void set(String key, Object value) {
		commonSession.set(key, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#setLogin(boolean)
	 */
	public void setLogin(boolean login) {
		commonSession.setLogin(login);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#setLoginSuperUserId(java.lang.String)
	 */
	public void setLoginSuperUserId(String loginSuperUserId) {
		commonSession.setLoginSuperUserId(loginSuperUserId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#setLoginUserId(java.lang.String)
	 */
	public void setLoginUserId(String loginUserId) {
		commonSession.setLoginUserId(loginUserId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#setLoginUserName(java.lang.String)
	 */
	public void setLoginUserName(String loginUserName) {
		commonSession.setLoginUserName(loginUserName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.web.WebRuntime#logout()
	 */
	public void logout() {
		commonSession.logout();
	}

	public String getCurrentVisitUrl() {
		return (String) get(CURRENT_VISIT_URL_KEY);
	}

	public void setCurrentVisitUrl(String value) {
		set(CURRENT_VISIT_URL_KEY, value);
	}

}
