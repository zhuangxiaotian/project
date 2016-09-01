package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询风险测试题库功能输入参数
 */
public class ISRiskEvaluationExamQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 查询标志,保留用
	 */
	private String queryContent;
	
	/**
	 * 证件号码,
	 */
	private String identityno;
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	public ISRiskEvaluationExamQueryInput() {
		this.setZ_funcCode("u0f");
	}
	
	/**
	 * 查询标志,保留用
	 */
	public String getQueryContent() {
		return this.queryContent;
	}
	
	/**
	 * 查询标志,保留用
	 */
	public void setQueryContent(String value)
	 {
		this.queryContent = value;
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
