package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 购买基金功能输入参数
 */
public class ISFundBuyInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 申购金额,
	 */
	private Double amount;
	
	/**
	 * 交易密码,
	 */
	private String password;
	
	/**
	 * 资金来源,
	 */
	private String capsource;
	
	/**
	 * 支付方式,
	 */
	private String detailcapitalmode;
	
	/**
	 * 汇款顺延日期,
	 */
	private String delayday;
	
	/**
	 * 业务代码,
	 */
	private String businflag;
	
	public ISFundBuyInput() {
		this.setZ_funcCode("u0a");
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
	 * 申购金额,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 申购金额,
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
	
	/**
	 * 资金来源,
	 */
	public String getCapsource() {
		return this.capsource;
	}
	
	/**
	 * 资金来源,
	 */
	public void setCapsource(String value)
	 {
		this.capsource = value;
	}
	
	/**
	 * 支付方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 支付方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 汇款顺延日期,
	 */
	public String getDelayday() {
		return this.delayday;
	}
	
	/**
	 * 汇款顺延日期,
	 */
	public void setDelayday(String value)
	 {
		this.delayday = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
}
