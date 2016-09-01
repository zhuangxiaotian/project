package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 快速过户功能输入参数
 */
public class DsFundShareTransferInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 交易账户,
	 */
	private String transactionAccount;
	
	/**
	 * 申请份额,
	 */
	private String share;
	
	/**
	 * 目标交易账户,
	 */
	private String targetTransactionAccount;
	
	/**
	 * 基金账户,
	 */
	private String fundAccount;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 资金方式,
	 */
	private String capitalMode;
	
	/**
	 * 目标基金账户,
	 */
	private String targetFundAccount;
	
	/**
	 * 目标银行编号,
	 */
	private String targetBankNo;
	
	/**
	 * 目标资金方式,
	 */
	private String targetCapital;
	
	public DsFundShareTransferInput() {
		this.setZ_funcCode("u0d");
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
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
	 * 申请份额,
	 */
	public String getShare() {
		return this.share;
	}
	
	/**
	 * 申请份额,
	 */
	public void setShare(String value)
	 {
		this.share = value;
	}
	
	/**
	 * 目标交易账户,
	 */
	public String getTargetTransactionAccount() {
		return this.targetTransactionAccount;
	}
	
	/**
	 * 目标交易账户,
	 */
	public void setTargetTransactionAccount(String value)
	 {
		this.targetTransactionAccount = value;
	}
	
	/**
	 * 基金账户,
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账户,
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalMode() {
		return this.capitalMode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalMode(String value)
	 {
		this.capitalMode = value;
	}
	
	/**
	 * 目标基金账户,
	 */
	public String getTargetFundAccount() {
		return this.targetFundAccount;
	}
	
	/**
	 * 目标基金账户,
	 */
	public void setTargetFundAccount(String value)
	 {
		this.targetFundAccount = value;
	}
	
	/**
	 * 目标银行编号,
	 */
	public String getTargetBankNo() {
		return this.targetBankNo;
	}
	
	/**
	 * 目标银行编号,
	 */
	public void setTargetBankNo(String value)
	 {
		this.targetBankNo = value;
	}
	
	/**
	 * 目标资金方式,
	 */
	public String getTargetCapital() {
		return this.targetCapital;
	}
	
	/**
	 * 目标资金方式,
	 */
	public void setTargetCapital(String value)
	 {
		this.targetCapital = value;
	}
}
