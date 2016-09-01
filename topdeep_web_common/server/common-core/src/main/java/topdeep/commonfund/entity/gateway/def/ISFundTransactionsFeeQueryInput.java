package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金交易费率查询功能输入参数
 */
public class ISFundTransactionsFeeQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 交易类型,
	 */
	private String transactionsType;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 份额类别,
	 */
	private String shareType;
	
	/**
	 * 转入基金代码,
	 */
	private String fundCodeIn;
	
	/**
	 * 转入份额类别,
	 */
	private String shareTypeIn;
	
	/**
	 * 转入交易账号,
	 */
	private String transactionsAccountIn;
	
	/**
	 * 金额或份额,
	 */
	private Double amount;
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	public ISFundTransactionsFeeQueryInput() {
		this.setZ_funcCode("u08");
	}
	
	/**
	 * 交易账号,
	 */
	public String getTransactionsAccount() {
		return this.transactionsAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTransactionsAccount(String value)
	 {
		this.transactionsAccount = value;
	}
	
	/**
	 * 交易类型,
	 */
	public String getTransactionsType() {
		return this.transactionsType;
	}
	
	/**
	 * 交易类型,
	 */
	public void setTransactionsType(String value)
	 {
		this.transactionsType = value;
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
	 * 份额类别,
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 份额类别,
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 转入基金代码,
	 */
	public String getFundCodeIn() {
		return this.fundCodeIn;
	}
	
	/**
	 * 转入基金代码,
	 */
	public void setFundCodeIn(String value)
	 {
		this.fundCodeIn = value;
	}
	
	/**
	 * 转入份额类别,
	 */
	public String getShareTypeIn() {
		return this.shareTypeIn;
	}
	
	/**
	 * 转入份额类别,
	 */
	public void setShareTypeIn(String value)
	 {
		this.shareTypeIn = value;
	}
	
	/**
	 * 转入交易账号,
	 */
	public String getTransactionsAccountIn() {
		return this.transactionsAccountIn;
	}
	
	/**
	 * 转入交易账号,
	 */
	public void setTransactionsAccountIn(String value)
	 {
		this.transactionsAccountIn = value;
	}
	
	/**
	 * 金额或份额,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 金额或份额,
	 */
	public void setAmount(Double value)
	 {
		this.amount = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
}
