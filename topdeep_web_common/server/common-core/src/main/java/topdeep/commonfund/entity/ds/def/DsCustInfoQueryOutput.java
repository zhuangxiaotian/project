package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 客户信息查询功能输出参数
 */
public class DsCustInfoQueryOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 客户号,
	 */
	private String custNo;
	
	/**
	 * 客户姓名,
	 */
	private String custName;
	
	/**
	 * 年收入,
	 */
	private String annualIncome;
	
	/**
	 * 生日,yyyyMMdd
	 */
	private String birthday;
	
	/**
	 * 客户状态,
	 */
	private String customerState;
	
	/**
	 * 风险等级日期,
	 */
	private String custRiskDate;
	
	/**
	 * 风险等级是否有效,
	 */
	private String custRiskInvalid;
	
	/**
	 * 客户风险等级,
	 */
	private String custRiskLevel;
	
	/**
	 * 客户风险等级描述,
	 */
	private String custRiskTip;
	
	/**
	 * 学历编码,
	 */
	private String educationCode;
	
	/**
	 * email,
	 */
	private String email;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 手机号码,
	 */
	private String mobile;
	
	/**
	 * 开户日期,
	 */
	private String opendate;
	
	/**
	 * 性别,
	 */
	private String sex;
	
	private List<DsCustInfoQueryOutputFundAccountDetail> fundAccountDetail = new ArrayList<DsCustInfoQueryOutputFundAccountDetail>();
	
	public DsCustInfoQueryOutput() {
		this.setZ_funcCode("u01");
	}
	
	/**
	 * 客户号,
	 */
	public String getCustNo() {
		return this.custNo;
	}
	
	/**
	 * 客户号,
	 */
	public void setCustNo(String value)
	 {
		this.custNo = value;
	}
	
	/**
	 * 客户姓名,
	 */
	public String getCustName() {
		return this.custName;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustName(String value)
	 {
		this.custName = value;
	}
	
	/**
	 * 年收入,
	 */
	public String getAnnualIncome() {
		return this.annualIncome;
	}
	
	/**
	 * 年收入,
	 */
	public void setAnnualIncome(String value)
	 {
		this.annualIncome = value;
	}
	
	/**
	 * 生日,yyyyMMdd
	 */
	public String getBirthday() {
		return this.birthday;
	}
	
	/**
	 * 生日,yyyyMMdd
	 */
	public void setBirthday(String value)
	 {
		this.birthday = value;
	}
	
	/**
	 * 客户状态,
	 */
	public String getCustomerState() {
		return this.customerState;
	}
	
	/**
	 * 客户状态,
	 */
	public void setCustomerState(String value)
	 {
		this.customerState = value;
	}
	
	/**
	 * 风险等级日期,
	 */
	public String getCustRiskDate() {
		return this.custRiskDate;
	}
	
	/**
	 * 风险等级日期,
	 */
	public void setCustRiskDate(String value)
	 {
		this.custRiskDate = value;
	}
	
	/**
	 * 风险等级是否有效,
	 */
	public String getCustRiskInvalid() {
		return this.custRiskInvalid;
	}
	
	/**
	 * 风险等级是否有效,
	 */
	public void setCustRiskInvalid(String value)
	 {
		this.custRiskInvalid = value;
	}
	
	/**
	 * 客户风险等级,
	 */
	public String getCustRiskLevel() {
		return this.custRiskLevel;
	}
	
	/**
	 * 客户风险等级,
	 */
	public void setCustRiskLevel(String value)
	 {
		this.custRiskLevel = value;
	}
	
	/**
	 * 客户风险等级描述,
	 */
	public String getCustRiskTip() {
		return this.custRiskTip;
	}
	
	/**
	 * 客户风险等级描述,
	 */
	public void setCustRiskTip(String value)
	 {
		this.custRiskTip = value;
	}
	
	/**
	 * 学历编码,
	 */
	public String getEducationCode() {
		return this.educationCode;
	}
	
	/**
	 * 学历编码,
	 */
	public void setEducationCode(String value)
	 {
		this.educationCode = value;
	}
	
	/**
	 * email,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * email,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
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
	 * 手机号码,
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机号码,
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	/**
	 * 开户日期,
	 */
	public String getOpendate() {
		return this.opendate;
	}
	
	/**
	 * 开户日期,
	 */
	public void setOpendate(String value)
	 {
		this.opendate = value;
	}
	
	/**
	 * 性别,
	 */
	public String getSex() {
		return this.sex;
	}
	
	/**
	 * 性别,
	 */
	public void setSex(String value)
	 {
		this.sex = value;
	}
	
	public List<DsCustInfoQueryOutputFundAccountDetail> getFundAccountDetail() {
		return this.fundAccountDetail;
	}
	
}
