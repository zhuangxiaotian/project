package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取风险评测题目及答案(C004)
 */
public class C005Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 问卷得分,
	 */
	private String questionpoint = "";
	
	/**
	 * 风险承受能力,（参考字典：投资人风险承受能力）
	 */
	private String riskability = "";
	
	/**
	 * 问卷得分,
	 */
	public String getQuestionpoint() {
		return this.questionpoint;
	}
	
	/**
	 * 问卷得分,
	 */
	public void setQuestionpoint(String value)
	 {
		this.questionpoint = value;
	}
	
	/**
	 * 风险承受能力,（参考字典：投资人风险承受能力）
	 */
	public String getRiskability() {
		return this.riskability;
	}
	
	/**
	 * 风险承受能力,（参考字典：投资人风险承受能力）
	 */
	public void setRiskability(String value)
	 {
		this.riskability = value;
	}
}
