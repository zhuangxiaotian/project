package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 登陆功能输出参数
 */
public class DsLoginOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 客户编号或者sessionKey,
	 */
	private String customerId;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 客户名称,
	 */
	private String custName;
	
	private List<DsLoginOutputFundAccount> fundAccount = new ArrayList<DsLoginOutputFundAccount>();
	
	/**
	 * 风险等级,
	 */
	private String riskLevel;
	
	/**
	 * 风险等级描述,
	 */
	private String riskLevelDesc;
	
	/**
	 * 手机号,
	 */
	private String mobile;
	
	public DsLoginOutput() {
		this.setZ_funcCode("u00");
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public String getCustomerId() {
		return this.customerId;
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public void setCustomerId(String value)
	 {
		this.customerId = value;
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
	 * 客户名称,
	 */
	public String getCustName() {
		return this.custName;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustName(String value)
	 {
		this.custName = value;
	}
	
	public List<DsLoginOutputFundAccount> getFundAccount() {
		return this.fundAccount;
	}
	
	
	/**
	 * 风险等级,
	 */
	public String getRiskLevel() {
		return this.riskLevel;
	}
	
	/**
	 * 风险等级,
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
	 * 手机号,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机号,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
}
