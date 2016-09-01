package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 交易流程工作日查询功能输入参数
 */
public class ISTransactionsProcessDayQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 交易相关基金代码,申购或赎回的基金代码
	 */
	private String fundCode;
	
	/**
	 * 交易类型代码,目前支持申购、赎回，快速赎回，货币通充值，货币通取现，货币通快速取现
	 */
	private String transactionsCode;
	
	/**
	 * 交易日期,
	 */
	private java.util.Date transactionsDate;
	
	public ISTransactionsProcessDayQueryInput() {
		this.setZ_funcCode("n0s");
	}
	
	/**
	 * 交易相关基金代码,申购或赎回的基金代码
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 交易相关基金代码,申购或赎回的基金代码
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 交易类型代码,目前支持申购、赎回，快速赎回，货币通充值，货币通取现，货币通快速取现
	 */
	public String getTransactionsCode() {
		return this.transactionsCode;
	}
	
	/**
	 * 交易类型代码,目前支持申购、赎回，快速赎回，货币通充值，货币通取现，货币通快速取现
	 */
	public void setTransactionsCode(String value)
	 {
		this.transactionsCode = value;
	}
	
	/**
	 * 交易日期,
	 */
	public java.util.Date getTransactionsDate() {
		return this.transactionsDate;
	}
	
	/**
	 * 交易日期,
	 */
	public void setTransactionsDate(java.util.Date value)
	 {
		this.transactionsDate = value;
	}
}
