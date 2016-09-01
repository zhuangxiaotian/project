package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史测评查询(S099)
 */
public class S099Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 直销起始行号,
	 */
	private String lineNumber = "";
	
	/**
	 * 问卷编号,传空查所有，传具体查具体
	 */
	private String questionno = "";
	
	/**
	 * 初始化参数
	 */
	public S099Input() {
		this.setFunction("S099");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 直销起始行号,
	 */
	public String getLineNumber() {
		return this.lineNumber;
	}
	
	/**
	 * 直销起始行号,
	 */
	public void setLineNumber(String value)
	 {
		this.lineNumber = value;
	}
	
	/**
	 * 问卷编号,传空查所有，传具体查具体
	 */
	public String getQuestionno() {
		return this.questionno;
	}
	
	/**
	 * 问卷编号,传空查所有，传具体查具体
	 */
	public void setQuestionno(String value)
	 {
		this.questionno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("lineNumber", this.lineNumber);
		inputMap.put("questionno", this.questionno);
	}
}
