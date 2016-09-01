package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 快速开户功能功能输入参数
 */
public class ISFastOpenAccountInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 支付渠道代码,
	 */
	private String paySeatNo;
	
	/**
	 * 银行代码,
	 */
	private String bankNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 投资人名称,
	 */
	private String customerName;
	
	/**
	 * 银行卡号码,
	 */
	private String bankAccount;
	
	/**
	 * 手机号码,
	 */
	private String mobilePhone;
	
	/**
	 * 证件有效期,99991231为长期有效，非华安交易用户要传，华安交易用户传空字符串表示不修改
	 */
	private String idValidateDate;
	
	/**
	 * 职业代码,
	 */
	private String vocationcode;
	
	/**
	 * 交易密码,
	 */
	private String password;
	
	/**
	 * 用户输入的验证码,当需要进行手机验证时，而又没有传验证码，则会验证码下发操作
	 */
	private String validCode;
	
	/**
	 * url编码需要用的字符集,提交到银行的数据如果需要编码，则使用传入的字符集，如果不传，使用默认值gb2312
	 */
	private String urlEncodeCharset;
	
	/**
	 * 开户来源渠道,如果是通过推广渠道过来的用户
	 */
	private String channel;
	
	/**
	 * 开户推荐码,
	 */
	private String referralCode;
	
	/**
	 * 活动标志,活动标志，可以不传，世联活动新客户标志为1，老客户标志为2
	 */
	private String promotionFlag;
	
	/**
	 * 邮箱,
	 */
	private String email;
	
	/**
	 * 经纪人,
	 */
	private String borker;
	
	public ISFastOpenAccountInput() {
		this.setZ_funcCode("n0q");
	}
	
	/**
	 * 支付渠道代码,
	 */
	public String getPaySeatNo() {
		return this.paySeatNo;
	}
	
	/**
	 * 支付渠道代码,
	 */
	public void setPaySeatNo(String value)
	 {
		this.paySeatNo = value;
	}
	
	/**
	 * 银行代码,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行代码,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
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
	 * 投资人名称,
	 */
	public String getCustomerName() {
		return this.customerName;
	}
	
	/**
	 * 投资人名称,
	 */
	public void setCustomerName(String value)
	 {
		this.customerName = value;
	}
	
	/**
	 * 银行卡号码,
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}
	
	/**
	 * 银行卡号码,
	 */
	public void setBankAccount(String value)
	 {
		this.bankAccount = value;
	}
	
	/**
	 * 手机号码,
	 */
	public String getMobilePhone() {
		return this.mobilePhone;
	}
	
	/**
	 * 手机号码,
	 */
	public void setMobilePhone(String value)
	 {
		this.mobilePhone = value;
	}
	
	/**
	 * 证件有效期,99991231为长期有效，非华安交易用户要传，华安交易用户传空字符串表示不修改
	 */
	public String getIdValidateDate() {
		return this.idValidateDate;
	}
	
	/**
	 * 证件有效期,99991231为长期有效，非华安交易用户要传，华安交易用户传空字符串表示不修改
	 */
	public void setIdValidateDate(String value)
	 {
		this.idValidateDate = value;
	}
	
	/**
	 * 职业代码,
	 */
	public String getVocationcode() {
		return this.vocationcode;
	}
	
	/**
	 * 职业代码,
	 */
	public void setVocationcode(String value)
	 {
		this.vocationcode = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 交易密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 用户输入的验证码,当需要进行手机验证时，而又没有传验证码，则会验证码下发操作
	 */
	public String getValidCode() {
		return this.validCode;
	}
	
	/**
	 * 用户输入的验证码,当需要进行手机验证时，而又没有传验证码，则会验证码下发操作
	 */
	public void setValidCode(String value)
	 {
		this.validCode = value;
	}
	
	/**
	 * url编码需要用的字符集,提交到银行的数据如果需要编码，则使用传入的字符集，如果不传，使用默认值gb2312
	 */
	public String getUrlEncodeCharset() {
		return this.urlEncodeCharset;
	}
	
	/**
	 * url编码需要用的字符集,提交到银行的数据如果需要编码，则使用传入的字符集，如果不传，使用默认值gb2312
	 */
	public void setUrlEncodeCharset(String value)
	 {
		this.urlEncodeCharset = value;
	}
	
	/**
	 * 开户来源渠道,如果是通过推广渠道过来的用户
	 */
	public String getChannel() {
		return this.channel;
	}
	
	/**
	 * 开户来源渠道,如果是通过推广渠道过来的用户
	 */
	public void setChannel(String value)
	 {
		this.channel = value;
	}
	
	/**
	 * 开户推荐码,
	 */
	public String getReferralCode() {
		return this.referralCode;
	}
	
	/**
	 * 开户推荐码,
	 */
	public void setReferralCode(String value)
	 {
		this.referralCode = value;
	}
	
	/**
	 * 活动标志,活动标志，可以不传，世联活动新客户标志为1，老客户标志为2
	 */
	public String getPromotionFlag() {
		return this.promotionFlag;
	}
	
	/**
	 * 活动标志,活动标志，可以不传，世联活动新客户标志为1，老客户标志为2
	 */
	public void setPromotionFlag(String value)
	 {
		this.promotionFlag = value;
	}
	
	/**
	 * 邮箱,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 经纪人,
	 */
	public String getBorker() {
		return this.borker;
	}
	
	/**
	 * 经纪人,
	 */
	public void setBorker(String value)
	 {
		this.borker = value;
	}
}
