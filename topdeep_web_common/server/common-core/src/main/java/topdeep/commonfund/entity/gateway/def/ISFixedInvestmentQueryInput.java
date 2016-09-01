package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期定额查询功能输入参数
 */
public class ISFixedInvestmentQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 客户编号,
	 */
	private String customerNo;
	
	/**
	 * 查询交易类型,申购，赎回，转换 不传表示查所有的
	 */
	private String transactionsType;
	
	public ISFixedInvestmentQueryInput() {
		this.setZ_funcCode("u0p");
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustomerNo() {
		return this.customerNo;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustomerNo(String value)
	 {
		this.customerNo = value;
	}
	
	/**
	 * 查询交易类型,申购，赎回，转换 不传表示查所有的
	 */
	public String getTransactionsType() {
		return this.transactionsType;
	}
	
	/**
	 * 查询交易类型,申购，赎回，转换 不传表示查所有的
	 */
	public void setTransactionsType(String value)
	 {
		this.transactionsType = value;
	}
}
