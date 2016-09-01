package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金风险等级查询(S104)功能输出明细参数
 */
public class S104OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金全称,
	 */
	private String fullFundName = "";
	
	/**
	 * 基金风险等级,
	 */
	private String fundRiskLevel = "";
	
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
	 * 基金全称,
	 */
	public String getFullFundName() {
		return this.fullFundName;
	}
	
	/**
	 * 基金全称,
	 */
	public void setFullFundName(String value)
	 {
		this.fullFundName = value;
	}
	
	/**
	 * 基金风险等级,
	 */
	public String getFundRiskLevel() {
		return this.fundRiskLevel;
	}
	
	/**
	 * 基金风险等级,
	 */
	public void setFundRiskLevel(String value)
	 {
		this.fundRiskLevel = value;
	}
}
