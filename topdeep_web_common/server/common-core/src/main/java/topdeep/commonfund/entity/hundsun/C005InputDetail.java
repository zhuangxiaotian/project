package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取风险评测题目及答案(C004)功能输出明细参数
 */
public class C005InputDetail extends Object implements Serializable {
	
	/**
	 * 问卷答案,
	 */
	private String qanswer = "";
	
	/**
	 * 问卷编号,未base64编码前格式如：{"00001":"003","00002":"004"} 其中00001为问卷编号，003为选项value
	 */
	private String qno = "";
	
	/**
	 * 问卷答案,
	 */
	public String getQanswer() {
		return this.qanswer;
	}
	
	/**
	 * 问卷答案,
	 */
	public void setQanswer(String value)
	 {
		this.qanswer = value;
	}
	
	/**
	 * 问卷编号,未base64编码前格式如：{"00001":"003","00002":"004"} 其中00001为问卷编号，003为选项value
	 */
	public String getQno() {
		return this.qno;
	}
	
	/**
	 * 问卷编号,未base64编码前格式如：{"00001":"003","00002":"004"} 其中00001为问卷编号，003为选项value
	 */
	public void setQno(String value)
	 {
		this.qno = value;
	}
}
