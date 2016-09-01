package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改密保问题(C018)
 */
public class C018Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 答案信息（需base64编码）,未base64编码前格式如：{"pwpro1":"99","pwanswer1":"1111",prodesc1:"aa"} 即表示第一题的问题编号是99，投资人的答案是1111，自定义问题描述是aa,其中pwpro的值为C017返回的值，prodesc只有在pwpro为99（即自定义问题）时才需要
	 */
	private String answers = "";
	
	/**
	 * 初始化参数
	 */
	public C018Input() {
		this.setFunction("C018");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 答案信息（需base64编码）,未base64编码前格式如：{"pwpro1":"99","pwanswer1":"1111",prodesc1:"aa"} 即表示第一题的问题编号是99，投资人的答案是1111，自定义问题描述是aa,其中pwpro的值为C017返回的值，prodesc只有在pwpro为99（即自定义问题）时才需要
	 */
	public String getAnswers() {
		return this.answers;
	}
	
	/**
	 * 答案信息（需base64编码）,未base64编码前格式如：{"pwpro1":"99","pwanswer1":"1111",prodesc1:"aa"} 即表示第一题的问题编号是99，投资人的答案是1111，自定义问题描述是aa,其中pwpro的值为C017返回的值，prodesc只有在pwpro为99（即自定义问题）时才需要
	 */
	public void setAnswers(String value)
	 {
		this.answers = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("answers", this.answers);
	}
}
