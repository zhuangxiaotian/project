package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询风险测试题库功能输出参数
 */
public class ISRiskEvaluationExamQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISRiskEvaluationExamQueryOutputDetail> detail = new ArrayList<ISRiskEvaluationExamQueryOutputDetail>();
	
	/**
	 * 题库代码,
	 */
	private String questionLibCode;
	
	public ISRiskEvaluationExamQueryOutput() {
		this.setZ_funcCode("u0f");
	}
	
	public List<ISRiskEvaluationExamQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
	
	/**
	 * 题库代码,
	 */
	public String getQuestionLibCode() {
		return this.questionLibCode;
	}
	
	/**
	 * 题库代码,
	 */
	public void setQuestionLibCode(String value)
	 {
		this.questionLibCode = value;
	}
}
