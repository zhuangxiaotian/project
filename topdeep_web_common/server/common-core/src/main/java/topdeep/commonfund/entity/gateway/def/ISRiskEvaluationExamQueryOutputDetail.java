package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询风险测试题库功能输出明细参数
 */
public class ISRiskEvaluationExamQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 序号,
	 */
	private String sn;
	
	/**
	 * 题目标题,
	 */
	private String title;
	
	/**
	 * 选项A,
	 */
	private String optionA;
	
	/**
	 * 选项B,
	 */
	private String optionB;
	
	/**
	 * 选项C,
	 */
	private String optionC;
	
	/**
	 * 选项D,
	 */
	private String optionD;
	
	/**
	 * 标志,0无效1有效
	 */
	private String flag;
	
	/**
	 * 状态,0未发布1已发布2过期提醒
	 */
	private String state;
	
	/**
	 * 类型,第一位题目渠道4手机，第二位客户类别1个人
	 */
	private String type;
	
	/**
	 * 选项E,
	 */
	private String optionE;
	
	/**
	 * 问卷答案值,默认选择的答案值
	 */
	private String qanswer;
	
	/**
	 * 上一次答案值,上一次该问题的答案值
	 */
	private String myanswer;
	
	/**
	 * 选项A编号,
	 */
	private String optionANo;
	
	/**
	 * 选项B编号,
	 */
	private String optionBNo;
	
	/**
	 * 选项C编号,
	 */
	private String optionCNo;
	
	/**
	 * 选项D编号,
	 */
	private String optionDNo;
	
	/**
	 * 选项E编号,
	 */
	private String optionENo;
	
	/**
	 * 序号,
	 */
	public String getSn() {
		return this.sn;
	}
	
	/**
	 * 序号,
	 */
	public void setSn(String value)
	 {
		this.sn = value;
	}
	
	/**
	 * 题目标题,
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * 题目标题,
	 */
	public void setTitle(String value)
	 {
		this.title = value;
	}
	
	/**
	 * 选项A,
	 */
	public String getOptionA() {
		return this.optionA;
	}
	
	/**
	 * 选项A,
	 */
	public void setOptionA(String value)
	 {
		this.optionA = value;
	}
	
	/**
	 * 选项B,
	 */
	public String getOptionB() {
		return this.optionB;
	}
	
	/**
	 * 选项B,
	 */
	public void setOptionB(String value)
	 {
		this.optionB = value;
	}
	
	/**
	 * 选项C,
	 */
	public String getOptionC() {
		return this.optionC;
	}
	
	/**
	 * 选项C,
	 */
	public void setOptionC(String value)
	 {
		this.optionC = value;
	}
	
	/**
	 * 选项D,
	 */
	public String getOptionD() {
		return this.optionD;
	}
	
	/**
	 * 选项D,
	 */
	public void setOptionD(String value)
	 {
		this.optionD = value;
	}
	
	/**
	 * 标志,0无效1有效
	 */
	public String getFlag() {
		return this.flag;
	}
	
	/**
	 * 标志,0无效1有效
	 */
	public void setFlag(String value)
	 {
		this.flag = value;
	}
	
	/**
	 * 状态,0未发布1已发布2过期提醒
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 状态,0未发布1已发布2过期提醒
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 类型,第一位题目渠道4手机，第二位客户类别1个人
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 类型,第一位题目渠道4手机，第二位客户类别1个人
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	/**
	 * 选项E,
	 */
	public String getOptionE() {
		return this.optionE;
	}
	
	/**
	 * 选项E,
	 */
	public void setOptionE(String value)
	 {
		this.optionE = value;
	}
	
	/**
	 * 问卷答案值,默认选择的答案值
	 */
	public String getQanswer() {
		return this.qanswer;
	}
	
	/**
	 * 问卷答案值,默认选择的答案值
	 */
	public void setQanswer(String value)
	 {
		this.qanswer = value;
	}
	
	/**
	 * 上一次答案值,上一次该问题的答案值
	 */
	public String getMyanswer() {
		return this.myanswer;
	}
	
	/**
	 * 上一次答案值,上一次该问题的答案值
	 */
	public void setMyanswer(String value)
	 {
		this.myanswer = value;
	}
	
	/**
	 * 选项A编号,
	 */
	public String getOptionANo() {
		return this.optionANo;
	}
	
	/**
	 * 选项A编号,
	 */
	public void setOptionANo(String value)
	 {
		this.optionANo = value;
	}
	
	/**
	 * 选项B编号,
	 */
	public String getOptionBNo() {
		return this.optionBNo;
	}
	
	/**
	 * 选项B编号,
	 */
	public void setOptionBNo(String value)
	 {
		this.optionBNo = value;
	}
	
	/**
	 * 选项C编号,
	 */
	public String getOptionCNo() {
		return this.optionCNo;
	}
	
	/**
	 * 选项C编号,
	 */
	public void setOptionCNo(String value)
	 {
		this.optionCNo = value;
	}
	
	/**
	 * 选项D编号,
	 */
	public String getOptionDNo() {
		return this.optionDNo;
	}
	
	/**
	 * 选项D编号,
	 */
	public void setOptionDNo(String value)
	 {
		this.optionDNo = value;
	}
	
	/**
	 * 选项E编号,
	 */
	public String getOptionENo() {
		return this.optionENo;
	}
	
	/**
	 * 选项E编号,
	 */
	public void setOptionENo(String value)
	 {
		this.optionENo = value;
	}
}
