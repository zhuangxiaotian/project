/**
 * 
 */
package topdeep.common.mg.entity.params;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import topdeep.common.entity.params.BaseSystemParam;

/**
 * @author niexin
 *
 */
@Component
public class CommonMgApplicationParam extends BaseSystemParam {

	public static String DEFAULT_ADMIN_ID = "u1OWLBWToae5UawK2YQAQ..X";

	/**
	 * 后台应用名称
	 */
	@Value("#{application['common.appName']?:'玄谷通用后台'}")
	private String appName;

	/**
	 * 主模板的Skin
	 */
	@Value("#{application['common.mainSkin']?:'default'}")
	private String mainSkin;

	/**
	 * 普通页面的Skin
	 */
	@Value("#{application['common.skin']?:'default'}")
	private String skin;

	/**
	 * 页面Theme
	 */
	@Value("#{application['common.theme']?:''}")
	private String theme;

	/**
	 * 发布文件版本
	 */
	@Value("#{application['common.version']?:''}")
	private String version;

	/**
	 * 菜单查询Url
	 */
	@Value("#{application['common.navQueryUrl']?:'/home/nav!ajaxQueryMenus.action'}")
	private String navQueryUrl;

	/**
	 * 主模板文件
	 */
	@Value("#{application['common.template.main']?:'../common/main.ftl'}")
	private String mainTemplate;

	/**
	 * 菜单模板文件
	 */
	@Value("#{application['common.template.nav']?:'../common/nav.ftl'}")
	private String navTemplate;

	/**
	 * 头部模板文件
	 */
	@Value("#{application['common.template.head']?:'../common/head.ftl'}")
	private String headTemplate;

	/**
	 * 分页模板文件
	 */
	@Value("#{application['common.template.page']?:'../common/page.ftl'}")
	private String pageTemplate;

	/**
	 * 无权限模板文件
	 */
	@Value("#{application['common.template.noPrivilege']?:'/default/system/privileges-check-fail'}")
	private String noPrivilegeTemplate;

	/**
	 * 用户激活的Url
	 */
	@Value("#{application['common.userActivityUrl']?:'http://localhost:8089/common-mg-web/h/userActivity.action?flag='}")
	private String userActivityUrl;

	/**
	 * 忘记密码Url
	 */
	@Value("#{application['common.forgetPwdUrl']?:'http://localhost:8089/common-mg-web/h/forgetPwd!resetPwd.action?flag='}")
	private String forgetPwdUrl;

	/**
	 * smtpAccount
	 */
	@Value("#{application['common.emailAddress']?:'lei.yuan@topdeep.com'}")
	private String smtpAccount;

	/**
	 * smtpPassword
	 */
	@Value("#{application['common.emailPwd']?:'yuanlei01'}")
	private String smtpPassword;

	/**
	 * 邮件模板路径
	 */
	@Value("#{application['common.emailTemplatePath']?:'/template/default/system/email.ftl'}")
	private String emailTemplatePath;

	/**
	 * smtpHost
	 */
	@Value("#{application['common.mailSmtpHost']?:'smtp.exmail.qq.com'}")
	private String smtpHost;

	/**
	 * smtpPort
	 */
	@Value("#{application['common.mailSmtpPort']?:'25'}")
	private String smtpPort;

	/**
	 * smtpAuth
	 */
	@Value("#{application['common.mailSmtpAuth']?:'true'}")
	private String smtpAuth;

	/**
	 * 是否开放注册超级管理员
	 */
	@Value("#{application['common.registerSuperAdmin']?:'false'}")
	private boolean registerSuperAdmin;

	/**
	 * 权限类列表
	 */
	@Value("#{application['common.privilegeConfigList']?:'topdeep.common.mg.entity.PrivilegeConfig'}")
	private String privilegeConfigList;

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
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
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
	 * @return the mainTemplate
	 */
	public String getMainTemplate() {
		return mainTemplate;
	}

	/**
	 * @return the navTemplate
	 */
	public String getNavTemplate() {
		return navTemplate;
	}

	/**
	 * @return the pageTemplate
	 */
	public String getPageTemplate() {
		return pageTemplate;
	}

	/**
	 * @return the headTemplate
	 */
	public String getHeadTemplate() {
		return headTemplate;
	}

	public String getNoPrivilegeTemplate() {
		return noPrivilegeTemplate;
	}

	/**
	 * @return the mainSkin
	 */
	public String getMainSkin() {
		return mainSkin;
	}

	/**
	 * @return the navQueryUrl
	 */
	public String getNavQueryUrl() {
		return navQueryUrl;
	}

	public String getUserActivityUrl() {
		return userActivityUrl;
	}

	public String getForgetPwdUrl() {
		return forgetPwdUrl;
	}

	public String getEmailTemplatePath() {
		return emailTemplatePath;
	}

	/**
	 * @return the registerSuperAdmin
	 */
	public boolean isRegisterSuperAdmin() {
		return registerSuperAdmin;
	}

	/**
	 * @return the privilegeConfigList
	 */
	public String getPrivilegeConfigList() {
		return privilegeConfigList;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @return the smtpAccount
	 */
	public String getSmtpAccount() {
		return smtpAccount;
	}

	/**
	 * @return the smtpPassword
	 */
	public String getSmtpPassword() {
		return smtpPassword;
	}

	/**
	 * @return the smtpHost
	 */
	public String getSmtpHost() {
		return smtpHost;
	}

	/**
	 * @return the smtpPort
	 */
	public String getSmtpPort() {
		return smtpPort;
	}

	/**
	 * @return the smtpAuth
	 */
	public String getSmtpAuth() {
		return smtpAuth;
	}

}
