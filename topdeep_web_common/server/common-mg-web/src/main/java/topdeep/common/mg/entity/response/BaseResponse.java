package topdeep.common.mg.entity.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import common.util.StringUtils;

public class BaseResponse implements Serializable {

	/**
	 * 执行结果是否成功
	 */
	private boolean success = true;

	/**
	 * 执行结果提示信息
	 */
	private String tipMessage = "";
	/**
	 * 需要跳转的地址
	 */
	private String redirectUrl = "";
	/**
	 * 主页面模板的Skin
	 */
	private String mainSkin = "";
	/**
	 * 普通页面的模板
	 */
	private String skin = "";
	/**
	 * 页面样式
	 */
	private String theme = "";
	/**
	 * 页面引用文件版本
	 */
	private String version = "";
	/**
	 * 页面标题
	 */
	private String title = "";
	/**
	 * 页面模板定义
	 */
	private ViewTemplate template = new ViewTemplate();
	/**
	 * 菜单查询Url
	 */
	private String navQueryUrl;

	/**
	 * 是否需要菜单
	 */
	private boolean needNav = true;

	/**
	 * 当前登录名称
	 */
	private String loginName = "";

	/**
	 * 当前应用名称
	 */
	private String appName = "";

	public String getTarget(String viewName) {
		if (needRedirect()) {
			return "redirect:" + getRedirectUrl();
		} else {
			return "/" + skin + viewName;
		}
	}

	/**
	 * 执行结果其它自定义数据
	 */
	private Map<String, Object> data = new HashMap<String, Object>();

	public boolean needRedirect() {
		return !StringUtils.isNullOrEmpty(redirectUrl);
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setResult(boolean isSuccess, String tipMsg) {
		success = isSuccess;
		tipMessage += tipMsg;
	}

	public void checkStringValue(String value, String tipMsg) {
		if (StringUtils.isNullOrEmpty(value)) {
			setResult(false, tipMsg);
		}
	}

	public void checkStringEqual(String value1, String value2, String tipMsg) {
		if (StringUtils.isNullOrEmpty(value1) || StringUtils.isNullOrEmpty(value2) || !value1.equals(value2)) {
			setResult(false, tipMsg);
		}
	}

	public void checkStringNotEqual(String value1, String value2, String tipMsg) {
		if (StringUtils.isNullOrEmpty(value1) || StringUtils.isNullOrEmpty(value2) || value1.equals(value2)) {
			setResult(false, tipMsg);
		}
	}

	public void checkNull(Object value, String tipMsg) {
		if (value == null) {
			setResult(false, tipMsg);
		}
	}

	public void checkStringEmpty(String value, String tipMsg) {
		if (value != null) {
			value = value.trim();
		}
		if (StringUtils.isNullOrEmpty(value)) {
			setResult(false, tipMsg);
		}
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the tipMessage
	 */
	public String getTipMessage() {
		return tipMessage;
	}

	/**
	 * @param tipMessage the tipMessage to set
	 */
	public void setTipMessage(String tipMessage) {
		this.tipMessage = tipMessage;
	}

	/**
	 * @return the skin
	 */
	public String getSkin() {
		return skin;
	}

	/**
	 * @param skin the skin to set
	 */
	public void setSkin(String skin) {
		this.skin = skin;
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * @return the redirectUrl
	 */
	public String getRedirectUrl() {
		return redirectUrl;
	}

	/**
	 * @param redirectUrl the redirectUrl to set
	 */
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the template
	 */
	public ViewTemplate getTemplate() {
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(ViewTemplate template) {
		this.template = template;
	}

	/**
	 * @return the mainSkin
	 */
	public String getMainSkin() {
		return mainSkin;
	}

	/**
	 * @param mainSkin the mainSkin to set
	 */
	public void setMainSkin(String mainSkin) {
		this.mainSkin = mainSkin;
	}

	/**
	 * @return the navQueryUrl
	 */
	public String getNavQueryUrl() {
		return navQueryUrl;
	}

	/**
	 * @param navQueryUrl the navQueryUrl to set
	 */
	public void setNavQueryUrl(String navQueryUrl) {
		this.navQueryUrl = navQueryUrl;
	}

	public boolean isNeedNav() {
		return needNav;
	}

	public void setNeedNav(boolean needNav) {
		this.needNav = needNav;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

}
