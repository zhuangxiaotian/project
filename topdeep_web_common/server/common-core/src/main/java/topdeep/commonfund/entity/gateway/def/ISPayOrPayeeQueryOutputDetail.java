package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 支付查询功能输出明细参数
 */
public class ISPayOrPayeeQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 收款人客户号,
	 */
	private String payCustNo;
	
	/**
	 * 付款人客户号,
	 */
	private String payeeCustNo;
	
	/**
	 * 收款人客户名称,
	 */
	private String payCustName;
	
	/**
	 * 付款人客户名称,
	 */
	private String payeeCustName;
	
	/**
	 * 付款人交易账户,
	 */
	private String payTransactionAccount;
	
	/**
	 * 支付人客户号,
	 */
	private String payeeTransactionAccount;
	
	/**
	 * 交易金额,
	 */
	private String amount;
	
	/**
	 * 收款人交易账户名称,
	 */
	private String payTransactionAccountName;
	
	/**
	 * 收款人交易账户名称,
	 */
	private String payeeTransactionAccountName;
	
	/**
	 * 收款人昵称,
	 */
	private String payNikName;
	
	/**
	 * 付款人昵称,
	 */
	private String payeeNikName;
	
	/**
	 * 协议号,
	 */
	private String payId;
	
	/**
	 * 收款人手机号,
	 */
	private String payPhone;
	
	/**
	 * 付款人手机号,
	 */
	private String payeePhone;
	
	/**
	 * 收款人客户号,
	 */
	public String getPayCustNo() {
		return this.payCustNo;
	}
	
	/**
	 * 收款人客户号,
	 */
	public void setPayCustNo(String value)
	 {
		this.payCustNo = value;
	}
	
	/**
	 * 付款人客户号,
	 */
	public String getPayeeCustNo() {
		return this.payeeCustNo;
	}
	
	/**
	 * 付款人客户号,
	 */
	public void setPayeeCustNo(String value)
	 {
		this.payeeCustNo = value;
	}
	
	/**
	 * 收款人客户名称,
	 */
	public String getPayCustName() {
		return this.payCustName;
	}
	
	/**
	 * 收款人客户名称,
	 */
	public void setPayCustName(String value)
	 {
		this.payCustName = value;
	}
	
	/**
	 * 付款人客户名称,
	 */
	public String getPayeeCustName() {
		return this.payeeCustName;
	}
	
	/**
	 * 付款人客户名称,
	 */
	public void setPayeeCustName(String value)
	 {
		this.payeeCustName = value;
	}
	
	/**
	 * 付款人交易账户,
	 */
	public String getPayTransactionAccount() {
		return this.payTransactionAccount;
	}
	
	/**
	 * 付款人交易账户,
	 */
	public void setPayTransactionAccount(String value)
	 {
		this.payTransactionAccount = value;
	}
	
	/**
	 * 支付人客户号,
	 */
	public String getPayeeTransactionAccount() {
		return this.payeeTransactionAccount;
	}
	
	/**
	 * 支付人客户号,
	 */
	public void setPayeeTransactionAccount(String value)
	 {
		this.payeeTransactionAccount = value;
	}
	
	/**
	 * 交易金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 交易金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 收款人交易账户名称,
	 */
	public String getPayTransactionAccountName() {
		return this.payTransactionAccountName;
	}
	
	/**
	 * 收款人交易账户名称,
	 */
	public void setPayTransactionAccountName(String value)
	 {
		this.payTransactionAccountName = value;
	}
	
	/**
	 * 收款人交易账户名称,
	 */
	public String getPayeeTransactionAccountName() {
		return this.payeeTransactionAccountName;
	}
	
	/**
	 * 收款人交易账户名称,
	 */
	public void setPayeeTransactionAccountName(String value)
	 {
		this.payeeTransactionAccountName = value;
	}
	
	/**
	 * 收款人昵称,
	 */
	public String getPayNikName() {
		return this.payNikName;
	}
	
	/**
	 * 收款人昵称,
	 */
	public void setPayNikName(String value)
	 {
		this.payNikName = value;
	}
	
	/**
	 * 付款人昵称,
	 */
	public String getPayeeNikName() {
		return this.payeeNikName;
	}
	
	/**
	 * 付款人昵称,
	 */
	public void setPayeeNikName(String value)
	 {
		this.payeeNikName = value;
	}
	
	/**
	 * 协议号,
	 */
	public String getPayId() {
		return this.payId;
	}
	
	/**
	 * 协议号,
	 */
	public void setPayId(String value)
	 {
		this.payId = value;
	}
	
	/**
	 * 收款人手机号,
	 */
	public String getPayPhone() {
		return this.payPhone;
	}
	
	/**
	 * 收款人手机号,
	 */
	public void setPayPhone(String value)
	 {
		this.payPhone = value;
	}
	
	/**
	 * 付款人手机号,
	 */
	public String getPayeePhone() {
		return this.payeePhone;
	}
	
	/**
	 * 付款人手机号,
	 */
	public void setPayeePhone(String value)
	 {
		this.payeePhone = value;
	}
}
