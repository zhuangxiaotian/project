package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金转换功能输入参数
 */
public class ISFundTransferInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String outFundCode;
	
	/**
	 * 份额类别,见数据字典份额类型
	 */
	private String outShareType;
	
	/**
	 * 交易账号,
	 */
	private String outTransactionsAccount;
	
	/**
	 * 转入基金代码,
	 */
	private String inFundCode;
	
	/**
	 * 转入份额类别,见数据字典份额类型
	 */
	private String inShareType;
	
	/**
	 * 交易账号,
	 */
	private String inTransactionsAccount;
	
	/**
	 * 赎回标志,一些基金公司需要巨额赎回标志
	 */
	private String redemptionFlag;
	
	/**
	 * 转换份额,
	 */
	private Double amount;
	
	/**
	 * 交易密码,
	 */
	private String password;
	
	public ISFundTransferInput() {
		this.setZ_funcCode("u0c");
	}
	
	/**
	 * 基金代码,
	 */
	public String getOutFundCode() {
		return this.outFundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setOutFundCode(String value)
	 {
		this.outFundCode = value;
	}
	
	/**
	 * 份额类别,见数据字典份额类型
	 */
	public String getOutShareType() {
		return this.outShareType;
	}
	
	/**
	 * 份额类别,见数据字典份额类型
	 */
	public void setOutShareType(String value)
	 {
		this.outShareType = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getOutTransactionsAccount() {
		return this.outTransactionsAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setOutTransactionsAccount(String value)
	 {
		this.outTransactionsAccount = value;
	}
	
	/**
	 * 转入基金代码,
	 */
	public String getInFundCode() {
		return this.inFundCode;
	}
	
	/**
	 * 转入基金代码,
	 */
	public void setInFundCode(String value)
	 {
		this.inFundCode = value;
	}
	
	/**
	 * 转入份额类别,见数据字典份额类型
	 */
	public String getInShareType() {
		return this.inShareType;
	}
	
	/**
	 * 转入份额类别,见数据字典份额类型
	 */
	public void setInShareType(String value)
	 {
		this.inShareType = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getInTransactionsAccount() {
		return this.inTransactionsAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setInTransactionsAccount(String value)
	 {
		this.inTransactionsAccount = value;
	}
	
	/**
	 * 赎回标志,一些基金公司需要巨额赎回标志
	 */
	public String getRedemptionFlag() {
		return this.redemptionFlag;
	}
	
	/**
	 * 赎回标志,一些基金公司需要巨额赎回标志
	 */
	public void setRedemptionFlag(String value)
	 {
		this.redemptionFlag = value;
	}
	
	/**
	 * 转换份额,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 转换份额,
	 */
	public void setAmount(Double value)
	 {
		this.amount = value;
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
}
