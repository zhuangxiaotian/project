/**
 * 
 */
package topdeep.common.entity.params;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lei.yuan
 *
 */
@Component
public class CommonApplicationParam extends BaseSystemParam {

	/**
	 * 系统运行模式 0 正常模式，打开直销和客服 1 直销模式，只允许直销系统 2 客服模式，只允许客服系统运行
	 */
	@Value("#{application['systemRunMode']?:'0'}")
	private String systemRunMode = "0";

	@Value("#{application['mgServerAddress']?:'http://localhost:8090/cms-mg-web'}")
	private String mgServerAddress;

	@Value("#{application['gatewayControlIp']?:'127.0.0.1'}")
	private String gatewayControlIp;

	@Value("#{application['picContext']?:''}")
	private String picContext;

	@Value("#{application['validTime']?:12000000}")
	private long validTime;

	@Value("#{application['host.default']?:'m.sinvofund.com'}")
	private String defaultSite;

	@Value("#{application['cms.tano']?:'4K'}")
	private String tano;

	@Value("#{application['cms.enterpriseCode']?:'470'}")
	private String enterpriseCode;

	@Value("#{application['adminControlIp']}")
	private String adminControlIp;

	/**
	 * 是否进行卡bin校验
	 */
	@Value("#{application['isAllowedBankCardValid']?:1}")
	private String isAllowedBankCardValid;

	/**
	 * 是否去取客服custno 0不取，１取
	 */
	@Value("#{application['cms.isGetccCustNo']?:'0'}")
	private String isGetccCustNo;

	/**
	 * 短信验证吗失效时间600秒
	 */
	@Value("#{application['validCodeTimeOut']?:600}")
	private int validCodeTimeOut = 600;

	@Value("#{application['smsEnabled']?:true}")
	private boolean smsEnabled = true;

	@Autowired
	@Value("#{application['redirectSchema']?:'https'}")
	protected String redirectSchema;

	@Autowired
	@Value("#{application['cms.tempFilePath']?:'/home/develop/'}")
	protected String tempFilePath;

	@Autowired
	@Value("#{application['cms.isValidate']?:'0'}")
	protected String isValidate;

	@Value("#{application['cms.busendtime']?:'170000'}")
	protected String busendtime;

	@Value("#{application['serverRegister.validEmail']?:false}")
	private boolean registerValidEmail;

	/**
	 * xmlConfigEncryptKey
	 */
	@Value("#{application['common.topdeepConfigEncryptKey']?:'xKI/BbVfi6fhLyejJcTIGA=='}")
	private String topdeepConfigEncryptKey;

	/**
	 * xmlConfigPubKeyPath
	 */
	@Value("#{application['common.topdeepConfigPubKeyPath']?:''}")
	private String topdeepConfigPubKeyPath;

	/**
	 * xmlConfigPath
	 */
	@Value("#{application['common.topdeepConfigPath']?:''}")
	private String topdeepConfigPath;

	/**
	 * 计划任务注册需要扫描的包名，用逗号分隔
	 */
	@Value("#{application['common.cronjob.scanPackage']?:''}")
	private String cronjobScanPackage = "";

	@Value("#{application['common.currentServerName']?:'DefaultServer'}")
	private String serverName = "";

	public int getValidCodeTimeOut() {
		return validCodeTimeOut;
	}

	public void setValidCodeTimeOut(int validCodeTimeOut) {
		this.validCodeTimeOut = validCodeTimeOut;
	}

	public boolean isSupportQuery() {
		return "0".equals(systemRunMode) || "2".equals(systemRunMode);
	}

	public boolean isSupportTrade() {
		return "0".equals(systemRunMode) || "1".equals(systemRunMode);
	}

	/**
	 * @return the mgServerAddress
	 */
	public String getMgServerAddress() {
		return mgServerAddress;
	}

	/**
	 * @param mgServerAddress the mgServerAddress to set
	 */
	public void setMgServerAddress(String mgServerAddress) {
		this.mgServerAddress = mgServerAddress;
	}

	/**
	 * @return the gatewayControlIp
	 */
	public String getGatewayControlIp() {
		return gatewayControlIp;
	}

	/**
	 * @param gatewayControlIp the gatewayControlIp to set
	 */
	public void setGatewayControlIp(String gatewayControlIp) {
		this.gatewayControlIp = gatewayControlIp;
	}

	/**
	 * @return the picContext
	 */
	public String getPicContext() {
		return picContext;
	}

	/**
	 * @param picContext the picContext to set
	 */
	public void setPicContext(String picContext) {
		this.picContext = picContext;
	}

	public long getValidTime() {
		return validTime;
	}

	public void setValidTime(long validTime) {
		this.validTime = validTime;
	}

	/**
	 * @return the systemRunMode
	 */
	public String getSystemRunMode() {
		return systemRunMode;
	}

	public String getIsAllowedBankCardValid() {
		return isAllowedBankCardValid;
	}

	/**
	 * @return the defaultSite
	 */
	public String getDefaultSite() {
		return defaultSite;
	}

	public String getTano() {
		return tano;
	}

	/**
	 * @return the redirectSchema
	 */
	public String getRedirectSchema() {
		return redirectSchema;
	}

	/**
	 * @return the smsEnabled
	 */
	public boolean isSmsEnabled() {
		return smsEnabled;
	}

	public String getIsGetccCustNo() {
		return isGetccCustNo;
	}

	public String getEnterpriseCode() {
		return enterpriseCode;
	}

	public String getAdminControlIp() {
		return adminControlIp;
	}

	public void setAdminControlIp(String adminControlIp) {
		this.adminControlIp = adminControlIp;
	}

	public String getTempFilePath() {
		return tempFilePath;
	}

	public String getIsValidate() {
		return isValidate;
	}

	public String getBusendtime() {
		return busendtime;
	}

	public boolean isRegisterValidEmail() {
		return registerValidEmail;
	}

	public void setRegisterValidEmail(boolean registerValidEmail) {
		this.registerValidEmail = registerValidEmail;
	}

	/**
	 * @return the topdeepConfigEncryptKey
	 */
	public String getTopdeepConfigEncryptKey() {
		return topdeepConfigEncryptKey;
	}

	/**
	 * @return the topdeepConfigPubKeyPath
	 */
	public String getTopdeepConfigPubKeyPath() {
		return topdeepConfigPubKeyPath;
	}

	/**
	 * @return the topdeepConfigPath
	 */
	public String getTopdeepConfigPath() {
		return topdeepConfigPath;
	}

	/**
	 * @return the cronjobScanPackage
	 */
	public String getCronjobScanPackage() {
		return cronjobScanPackage;
	}

	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}

}
