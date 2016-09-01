package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金购买信息功能输入参数
 */
public class ISFundBuyInfoQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 交易类型代码,
	 */
	private String transactionsCode;
	
	/**
	 * 交易账号,做转换交易时需要传入用来传选择的转出交易账号
	 */
	private String transactionsAccount;
	
	/**
	 * 基金代码,做转换交易时需要传入用来传选择的转出基金代码
	 */
	private String fundCode;
	
	/**
	 * 份额类别,做转换交易时需要传入用来传选择的转出基金份额
	 */
	private String shareType;
	
	public ISFundBuyInfoQueryInput() {
		this.setZ_funcCode("u06");
	}
	
	/**
	 * 交易类型代码,
	 */
	public String getTransactionsCode() {
		return this.transactionsCode;
	}
	
	/**
	 * 交易类型代码,
	 */
	public void setTransactionsCode(String value)
	 {
		this.transactionsCode = value;
	}
	
	/**
	 * 交易账号,做转换交易时需要传入用来传选择的转出交易账号
	 */
	public String getTransactionsAccount() {
		return this.transactionsAccount;
	}
	
	/**
	 * 交易账号,做转换交易时需要传入用来传选择的转出交易账号
	 */
	public void setTransactionsAccount(String value)
	 {
		this.transactionsAccount = value;
	}
	
	/**
	 * 基金代码,做转换交易时需要传入用来传选择的转出基金代码
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,做转换交易时需要传入用来传选择的转出基金代码
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 份额类别,做转换交易时需要传入用来传选择的转出基金份额
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 份额类别,做转换交易时需要传入用来传选择的转出基金份额
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
}
