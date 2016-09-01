package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 添加收款人或付款人信息入待支付表功能输入参数
 */
public class ISPayOrPayeeAddInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 收付款标示1收款，2付款,
	 */
	private String payType;
	
	/**
	 * 对方客户标示,
	 */
	private String targetCustNo;
	
	/**
	 * 交易账户,
	 */
	private String transactionAccount;
	
	/**
	 * 对方交易账户,
	 */
	private String targetCustTransactionAccount;
	
	/**
	 * 金额,
	 */
	private String amount;
	
	/**
	 * 密码如果是我要付款扫码需要传,
	 */
	private String password;
	
	/**
	 * 验证码,
	 */
	private String validCode;
	
	/**
	 * 备注,
	 */
	private String remark;
	
	/**
	 * 是否需要重发验证码０不需要１需要,
	 */
	private String resend;
	
	public ISPayOrPayeeAddInput() {
		this.setZ_funcCode("m0a");
	}
	
	/**
	 * 收付款标示1收款，2付款,
	 */
	public String getPayType() {
		return this.payType;
	}
	
	/**
	 * 收付款标示1收款，2付款,
	 */
	public void setPayType(String value)
	 {
		this.payType = value;
	}
	
	/**
	 * 对方客户标示,
	 */
	public String getTargetCustNo() {
		return this.targetCustNo;
	}
	
	/**
	 * 对方客户标示,
	 */
	public void setTargetCustNo(String value)
	 {
		this.targetCustNo = value;
	}
	
	/**
	 * 交易账户,
	 */
	public String getTransactionAccount() {
		return this.transactionAccount;
	}
	
	/**
	 * 交易账户,
	 */
	public void setTransactionAccount(String value)
	 {
		this.transactionAccount = value;
	}
	
	/**
	 * 对方交易账户,
	 */
	public String getTargetCustTransactionAccount() {
		return this.targetCustTransactionAccount;
	}
	
	/**
	 * 对方交易账户,
	 */
	public void setTargetCustTransactionAccount(String value)
	 {
		this.targetCustTransactionAccount = value;
	}
	
	/**
	 * 金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 密码如果是我要付款扫码需要传,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码如果是我要付款扫码需要传,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 验证码,
	 */
	public String getValidCode() {
		return this.validCode;
	}
	
	/**
	 * 验证码,
	 */
	public void setValidCode(String value)
	 {
		this.validCode = value;
	}
	
	/**
	 * 备注,
	 */
	public String getRemark() {
		return this.remark;
	}
	
	/**
	 * 备注,
	 */
	public void setRemark(String value)
	 {
		this.remark = value;
	}
	
	/**
	 * 是否需要重发验证码０不需要１需要,
	 */
	public String getResend() {
		return this.resend;
	}
	
	/**
	 * 是否需要重发验证码０不需要１需要,
	 */
	public void setResend(String value)
	 {
		this.resend = value;
	}
}
