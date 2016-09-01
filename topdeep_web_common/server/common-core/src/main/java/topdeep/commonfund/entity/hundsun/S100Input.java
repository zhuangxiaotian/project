package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历测评详情查询(S100)
 */
public class S100Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 问卷编号,
	 */
	private String questionno = "";
	
	/**
	 * 初始化参数
	 */
	public S100Input() {
		this.setFunction("S100");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("questionno", this.questionno);
	}
}
