package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 风险测评功能输出参数
 */
public class ISRiskEvaluationOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applicationNo;
	
	/**
	 * 交易日期,
	 */
	private java.util.Date transactionsDate;
	
	/**
	 * 答题时间,
	 */
	private java.util.Date acceptTime;
	
	/**
	 * 得分,
	 */
	private String score;
	
	/**
	 * 客户风险级别,
	 */
	private String custRiskLevel;
	
	public ISRiskEvaluationOutput() {
		this.setZ_funcCode("u0g");
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
	
	/**
	 * 答题时间,
	 */
	public java.util.Date getAcceptTime() {
		return this.acceptTime;
	}
	
	/**
	 * 答题时间,
	 */
	public void setAcceptTime(java.util.Date value)
	 {
		this.acceptTime = value;
	}
	
	/**
	 * 得分,
	 */
	public String getScore() {
		return this.score;
	}
	
	/**
	 * 得分,
	 */
	public void setScore(String value)
	 {
		this.score = value;
	}
	
	/**
	 * 客户风险级别,
	 */
	public String getCustRiskLevel() {
		return this.custRiskLevel;
	}
	
	/**
	 * 客户风险级别,
	 */
	public void setCustRiskLevel(String value)
	 {
		this.custRiskLevel = value;
	}
}
