package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金转换功能输出参数
 */
public class ISFundTransferOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applicationNo;
	
	/**
	 * 交易日期,
	 */
	private java.util.Date transactionsDate;
	
	public ISFundTransferOutput() {
		this.setZ_funcCode("u0c");
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplicationNo(String value)
	 {
		this.applicationNo = value;
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
