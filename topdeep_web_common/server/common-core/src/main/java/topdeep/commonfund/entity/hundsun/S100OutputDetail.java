package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历测评详情查询(S100)功能输出明细参数
 */
public class S100OutputDetail extends Object implements Serializable {
	
	/**
	 * 选项内容,
	 */
	private String answer = "";
	
	/**
	 * 选项内容,
	 */
	private String answer1 = "";
	
	/**
	 * 问题内容,
	 */
	private String content = "";
	
	/**
	 * 客户编号,
	 */
	private String point = "";
	
	/**
	 * 问题类型,
	 */
	private String type = "";
	
	/**
	 * 选项内容,
	 */
	public String getAnswer() {
		return this.answer;
	}
	
	/**
	 * 选项内容,
	 */
	public void setAnswer(String value)
	 {
		this.answer = value;
	}
	
	/**
	 * 选项内容,
	 */
	public String getAnswer1() {
		return this.answer1;
	}
	
	/**
	 * 选项内容,
	 */
	public void setAnswer1(String value)
	 {
		this.answer1 = value;
	}
	
	/**
	 * 问题内容,
	 */
	public String getContent() {
		return this.content;
	}
	
	/**
	 * 问题内容,
	 */
	public void setContent(String value)
	 {
		this.content = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getPoint() {
		return this.point;
	}
	
	/**
	 * 客户编号,
	 */
	public void setPoint(String value)
	 {
		this.point = value;
	}
	
	/**
	 * 问题类型,
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 问题类型,
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
}
