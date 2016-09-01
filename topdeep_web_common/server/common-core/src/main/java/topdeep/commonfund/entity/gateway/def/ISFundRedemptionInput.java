package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金赎回功能输入参数
 */
public class ISFundRedemptionInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 赎回交易账号,份额转出的交易账号
	 */
	private String transactionsAccount;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 份额分类,
	 */
	private String shareType;
	
	/**
	 * 赎回份额,
	 */
	private Double redemptionAmount;
	
	/**
	 * 巨额赎回标志,一些基金公司需要巨额赎回标志
	 */
	private String largeRedemptionFlag;
	
	/**
	 * 赎回至交易账号,如果不填，则使用交易账号作为赎回至交易账号
	 */
	private String redeemToTransactionsAccount;
	
	/**
	 * 交易密码,
	 */
	private String password;
	
	/**
	 * 卖出方式,
	 */
	private String saleWay;
	
	/**
	 * 是否快速赎回1是0否,是否快速赎回1是0否
	 */
	private String fastRedemptionFlag;
	
	public ISFundRedemptionInput() {
		this.setZ_funcCode("u0b");
	}
	
	/**
	 * 赎回交易账号,份额转出的交易账号
	 */
	public String getTransactionsAccount() {
		return this.transactionsAccount;
	}
	
	/**
	 * 赎回交易账号,份额转出的交易账号
	 */
	public void setTransactionsAccount(String value)
	 {
		this.transactionsAccount = value;
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
	 * 份额分类,
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 份额分类,
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 赎回份额,
	 */
	public Double getRedemptionAmount() {
		return this.redemptionAmount;
	}
	
	/**
	 * 赎回份额,
	 */
	public void setRedemptionAmount(Double value)
	 {
		this.redemptionAmount = value;
	}
	
	/**
	 * 巨额赎回标志,一些基金公司需要巨额赎回标志
	 */
	public String getLargeRedemptionFlag() {
		return this.largeRedemptionFlag;
	}
	
	/**
	 * 巨额赎回标志,一些基金公司需要巨额赎回标志
	 */
	public void setLargeRedemptionFlag(String value)
	 {
		this.largeRedemptionFlag = value;
	}
	
	/**
	 * 赎回至交易账号,如果不填，则使用交易账号作为赎回至交易账号
	 */
	public String getRedeemToTransactionsAccount() {
		return this.redeemToTransactionsAccount;
	}
	
	/**
	 * 赎回至交易账号,如果不填，则使用交易账号作为赎回至交易账号
	 */
	public void setRedeemToTransactionsAccount(String value)
	 {
		this.redeemToTransactionsAccount = value;
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
	 * 卖出方式,
	 */
	public String getSaleWay() {
		return this.saleWay;
	}
	
	/**
	 * 卖出方式,
	 */
	public void setSaleWay(String value)
	 {
		this.saleWay = value;
	}
	
	/**
	 * 是否快速赎回1是0否,是否快速赎回1是0否
	 */
	public String getFastRedemptionFlag() {
		return this.fastRedemptionFlag;
	}
	
	/**
	 * 是否快速赎回1是0否,是否快速赎回1是0否
	 */
	public void setFastRedemptionFlag(String value)
	 {
		this.fastRedemptionFlag = value;
	}
}
