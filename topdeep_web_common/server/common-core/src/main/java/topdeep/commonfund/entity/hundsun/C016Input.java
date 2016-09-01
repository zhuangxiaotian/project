package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 验证密保问题(C016)
 */
public class C016Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "空";
	
	/**
	 * 答案信息（需base64编码）,未base64编码前格式如：{"pos1":"2","pwanswer1":"1111"} 即表示第一题的问卷序号是2，投资人的答案是1111，同理如果有2题，那么就需要继续传入pos2，pwanswer2，以此类推
	 */
	private String answers = "";
	
	/**
	 * 初始化参数
	 */
	public C016Input() {
		this.setFunction("C016");
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
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 答案信息（需base64编码）,未base64编码前格式如：{"pos1":"2","pwanswer1":"1111"} 即表示第一题的问卷序号是2，投资人的答案是1111，同理如果有2题，那么就需要继续传入pos2，pwanswer2，以此类推
	 */
	public String getAnswers() {
		return this.answers;
	}
	
	/**
	 * 答案信息（需base64编码）,未base64编码前格式如：{"pos1":"2","pwanswer1":"1111"} 即表示第一题的问卷序号是2，投资人的答案是1111，同理如果有2题，那么就需要继续传入pos2，pwanswer2，以此类推
	 */
	public void setAnswers(String value)
	 {
		this.answers = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("answers", this.answers);
	}
}
