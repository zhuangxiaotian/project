package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询风险匹配基金(C024)功能输出明细参数
 */
public class C024OutputDetail extends Object implements Serializable {
	
	/**
	 * 客户名称,
	 */
	private String custname = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 基金风险等级,参考字典：基金风险等级
	 */
	private String fundrisklevel = "";
	
	/**
	 * 基金状态,参考字典：基金状态
	 */
	private String fundstate = "";
	
	/**
	 * 问卷编号,
	 */
	private String questionno = "";
	
	/**
	 * 投资人风险承受能力,参考字典：投资人风险承受能力
	 */
	private String riskbility = "";
	
	/**
	 * 风险限制类型,
	 */
	private String riskrestrictstyle = "";
	
	/**
	 * 客户名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 基金风险等级,参考字典：基金风险等级
	 */
	public String getFundrisklevel() {
		return this.fundrisklevel;
	}
	
	/**
	 * 基金风险等级,参考字典：基金风险等级
	 */
	public void setFundrisklevel(String value)
	 {
		this.fundrisklevel = value;
	}
	
	/**
	 * 基金状态,参考字典：基金状态
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,参考字典：基金状态
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 问卷编号,
	 */
	public String getQuestionno() {
		return this.questionno;
	}
	
	/**
	 * 问卷编号,
	 */
	public void setQuestionno(String value)
	 {
		this.questionno = value;
	}
	
	/**
	 * 投资人风险承受能力,参考字典：投资人风险承受能力
	 */
	public String getRiskbility() {
		return this.riskbility;
	}
	
	/**
	 * 投资人风险承受能力,参考字典：投资人风险承受能力
	 */
	public void setRiskbility(String value)
	 {
		this.riskbility = value;
	}
	
	/**
	 * 风险限制类型,
	 */
	public String getRiskrestrictstyle() {
		return this.riskrestrictstyle;
	}
	
	/**
	 * 风险限制类型,
	 */
	public void setRiskrestrictstyle(String value)
	 {
		this.riskrestrictstyle = value;
	}
}
