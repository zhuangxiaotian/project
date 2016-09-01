package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 风险测评功能输入参数
 */
public class ISRiskEvaluationInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 问题序号列表,用|号分隔
	 */
	private String questionList;
	
	/**
	 * 回答列表，对应问题,用|号分隔
	 */
	private String answerList;
	
	/**
	 * 证件号码,
	 */
	private String identityno;
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	public ISRiskEvaluationInput() {
		this.setZ_funcCode("u0g");
	}
	
	/**
	 * 问题序号列表,用|号分隔
	 */
	public String getQuestionList() {
		return this.questionList;
	}
	
	/**
	 * 问题序号列表,用|号分隔
	 */
	public void setQuestionList(String value)
	 {
		this.questionList = value;
	}
	
	/**
	 * 回答列表，对应问题,用|号分隔
	 */
	public String getAnswerList() {
		return this.answerList;
	}
	
	/**
	 * 回答列表，对应问题,用|号分隔
	 */
	public void setAnswerList(String value)
	 {
		this.answerList = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
}
