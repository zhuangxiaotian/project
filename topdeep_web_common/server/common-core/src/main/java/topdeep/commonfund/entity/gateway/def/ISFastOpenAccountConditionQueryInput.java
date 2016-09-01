package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 快速开户功能判断查询功能输入参数
 */
public class ISFastOpenAccountConditionQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 查询类型,0 查询是否要进行手机验证 1 关健信息查询（返回字符串第0位表示是否需要设置密码，第1位表示是否需要设置证件有效期，第2位表示是否需要设置职业代码） 2 是否需要打开银行验证页面(非快捷开户)
	 */
	private String queryType;
	
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
	 * 活动标志,默认为空，可以不传，传1表示世联开户活动
	 */
	private String promotionFlag;
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 手机号码,
	 */
	private String mobile;
	
	public ISFastOpenAccountConditionQueryInput() {
		this.setZ_funcCode("n0r");
	}
	
	/**
	 * 查询类型,0 查询是否要进行手机验证 1 关健信息查询（返回字符串第0位表示是否需要设置密码，第1位表示是否需要设置证件有效期，第2位表示是否需要设置职业代码） 2 是否需要打开银行验证页面(非快捷开户)
	 */
	public String getQueryType() {
		return this.queryType;
	}
	
	/**
	 * 查询类型,0 查询是否要进行手机验证 1 关健信息查询（返回字符串第0位表示是否需要设置密码，第1位表示是否需要设置证件有效期，第2位表示是否需要设置职业代码） 2 是否需要打开银行验证页面(非快捷开户)
	 */
	public void setQueryType(String value)
	 {
		this.queryType = value;
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
	 * 活动标志,默认为空，可以不传，传1表示世联开户活动
	 */
	public String getPromotionFlag() {
		return this.promotionFlag;
	}
	
	/**
	 * 活动标志,默认为空，可以不传，传1表示世联开户活动
	 */
	public void setPromotionFlag(String value)
	 {
		this.promotionFlag = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankAccount(String value)
	 {
		this.bankAccount = value;
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
}
