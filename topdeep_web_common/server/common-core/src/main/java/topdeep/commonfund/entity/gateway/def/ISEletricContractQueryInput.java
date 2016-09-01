package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询电子合同信息功能输入参数
 */
public class ISEletricContractQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 客户编号,
	 */
	private String custno;
	
	/**
	 * 基金帐号,
	 */
	private String fundacco;
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco;
	
	public ISEletricContractQueryInput() {
		this.setZ_funcCode("u1a");
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 基金帐号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 交易帐号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
}
