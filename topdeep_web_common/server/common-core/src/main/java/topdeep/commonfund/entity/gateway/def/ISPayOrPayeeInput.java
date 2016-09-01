package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收款或付款功能输入参数
 */
public class ISPayOrPayeeInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 支付协议号,
	 */
	private String payId;
	
	/**
	 * 交易类型1收款2付款,
	 */
	private String payType;
	
	/**
	 * 支付密码,
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
	 * 交易账户,
	 */
	private String transactionAccount;
	
	/**
	 * 是否忽略黑名单1忽略,
	 */
	private String igNoreBlack;
	
	/**
	 * 是否需要重发验证码０是１否,
	 */
	private String resend;
	
	public ISPayOrPayeeInput() {
		this.setZ_funcCode("m0b");
	}
	
	/**
	 * 支付协议号,
	 */
	public String getPayId() {
		return this.payId;
	}
	
	/**
	 * 支付协议号,
	 */
	public void setPayId(String value)
	 {
		this.payId = value;
	}
	
	/**
	 * 交易类型1收款2付款,
	 */
	public String getPayType() {
		return this.payType;
	}
	
	/**
	 * 交易类型1收款2付款,
	 */
	public void setPayType(String value)
	 {
		this.payType = value;
	}
	
	/**
	 * 支付密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 支付密码,
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
	 * 是否忽略黑名单1忽略,
	 */
	public String getIgNoreBlack() {
		return this.igNoreBlack;
	}
	
	/**
	 * 是否忽略黑名单1忽略,
	 */
	public void setIgNoreBlack(String value)
	 {
		this.igNoreBlack = value;
	}
	
	/**
	 * 是否需要重发验证码０是１否,
	 */
	public String getResend() {
		return this.resend;
	}
	
	/**
	 * 是否需要重发验证码０是１否,
	 */
	public void setResend(String value)
	 {
		this.resend = value;
	}
}
