package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 登录功能输出参数
 */
public class ISLoginOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 登录方式,如果客户端采用了自动判断，则如果登录成功，返回成功的登录方式
	 */
	private String loginType;
	
	/**
	 * 允许交易,0 不允许交易 1允许交易
	 */
	private String allowTransactions;
	
	/**
	 * 客户名称,
	 */
	private String customerName;
	
	/**
	 * 风险等级,客户的风险级别，如果返回为空，提示用户去网上交易进行风险测试 1保守型 2 稳建型 3积极配置型 4 进取型 其它未知
	 */
	private String riskLevel;
	
	/**
	 * 风险等级描述,
	 */
	private String riskLevelDesc;
	
	/**
	 * 风险对应的推荐配置,
	 */
	private String riskLevelFundConfig;
	
	/**
	 * 登录完成后标志,0或空正常 1 需要立即修改证件有效期 用常量
	 */
	private String loginFinishFlag;
	
	private List<ISLoginOutputDetail> detail = new ArrayList<ISLoginOutputDetail>();
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 客户类型,
	 */
	private String customerType;
	
	public ISLoginOutput() {
		this.setZ_funcCode("b04");
	}
	
	/**
	 * 登录方式,如果客户端采用了自动判断，则如果登录成功，返回成功的登录方式
	 */
	public String getLoginType() {
		return this.loginType;
	}
	
	/**
	 * 登录方式,如果客户端采用了自动判断，则如果登录成功，返回成功的登录方式
	 */
	public void setLoginType(String value)
	 {
		this.loginType = value;
	}
	
	/**
	 * 允许交易,0 不允许交易 1允许交易
	 */
	public String getAllowTransactions() {
		return this.allowTransactions;
	}
	
	/**
	 * 允许交易,0 不允许交易 1允许交易
	 */
	public void setAllowTransactions(String value)
	 {
		this.allowTransactions = value;
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustomerName() {
		return this.customerName;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustomerName(String value)
	 {
		this.customerName = value;
	}
	
	/**
	 * 风险等级,客户的风险级别，如果返回为空，提示用户去网上交易进行风险测试 1保守型 2 稳建型 3积极配置型 4 进取型 其它未知
	 */
	public String getRiskLevel() {
		return this.riskLevel;
	}
	
	/**
	 * 风险等级,客户的风险级别，如果返回为空，提示用户去网上交易进行风险测试 1保守型 2 稳建型 3积极配置型 4 进取型 其它未知
	 */
	public void setRiskLevel(String value)
	 {
		this.riskLevel = value;
	}
	
	/**
	 * 风险等级描述,
	 */
	public String getRiskLevelDesc() {
		return this.riskLevelDesc;
	}
	
	/**
	 * 风险等级描述,
	 */
	public void setRiskLevelDesc(String value)
	 {
		this.riskLevelDesc = value;
	}
	
	/**
	 * 风险对应的推荐配置,
	 */
	public String getRiskLevelFundConfig() {
		return this.riskLevelFundConfig;
	}
	
	/**
	 * 风险对应的推荐配置,
	 */
	public void setRiskLevelFundConfig(String value)
	 {
		this.riskLevelFundConfig = value;
	}
	
	/**
	 * 登录完成后标志,0或空正常 1 需要立即修改证件有效期 用常量
	 */
	public String getLoginFinishFlag() {
		return this.loginFinishFlag;
	}
	
	/**
	 * 登录完成后标志,0或空正常 1 需要立即修改证件有效期 用常量
	 */
	public void setLoginFinishFlag(String value)
	 {
		this.loginFinishFlag = value;
	}
	
	public List<ISLoginOutputDetail> getDetail() {
		return this.detail;
	}
	
	
	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
	
	/**
	 * 客户类型,
	 */
	public String getCustomerType() {
		return this.customerType;
	}
	
	/**
	 * 客户类型,
	 */
	public void setCustomerType(String value)
	 {
		this.customerType = value;
	}
}
