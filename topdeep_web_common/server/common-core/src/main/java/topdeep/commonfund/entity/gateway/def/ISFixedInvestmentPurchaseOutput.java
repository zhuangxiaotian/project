package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期定额申购功能输出参数
 */
public class ISFixedInvestmentPurchaseOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 协议号,
	 */
	private String agreementNo;
	
	/**
	 * 接单时间,
	 */
	private java.util.Date acceptTime;
	
	/**
	 * 交易日期,
	 */
	private java.util.Date transactionsDate;
	
	public ISFixedInvestmentPurchaseOutput() {
		this.setZ_funcCode("u0q");
	}
	
	/**
	 * 协议号,
	 */
	public String getAgreementNo() {
		return this.agreementNo;
	}
	
	/**
	 * 协议号,
	 */
	public void setAgreementNo(String value)
	 {
		this.agreementNo = value;
	}
	
	/**
	 * 接单时间,
	 */
	public java.util.Date getAcceptTime() {
		return this.acceptTime;
	}
	
	/**
	 * 接单时间,
	 */
	public void setAcceptTime(java.util.Date value)
	 {
		this.acceptTime = value;
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
