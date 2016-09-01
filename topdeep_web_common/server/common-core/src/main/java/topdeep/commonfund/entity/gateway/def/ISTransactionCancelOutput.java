package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 撤单功能输出参数
 */
public class ISTransactionCancelOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 接单时间,
	 */
	private java.util.Date acceptTime;
	
	/**
	 * 申请编号,
	 */
	private String applicationNo;
	
	public ISTransactionCancelOutput() {
		this.setZ_funcCode("u0d");
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
}
