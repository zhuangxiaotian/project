package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取风险评测题目及答案(C004)功能输出明细参数
 */
public class C004OutputDetail extends Object implements Serializable {
	
	/**
	 * 上一次答案值,上一次该问题的答案值，与qitem中的itemvalue对应
	 */
	private String myanswer = "";
	
	/**
	 * 问卷答案值,默认选择的答案值，与qitem中的itemvalue对应
	 */
	private String qanswer = "";
	
	/**
	 * 问卷编号,该题目的问卷编号
	 */
	private String qno = "";
	
	/**
	 * 问卷标题,该题目的文字描述
	 */
	private String qtitle = "";
	
	private List<C004OutputQitemDetail> qitemDetail = new ArrayList<C004OutputQitemDetail>();
	
	/**
	 * 上一次答案值,上一次该问题的答案值，与qitem中的itemvalue对应
	 */
	public String getMyanswer() {
		return this.myanswer;
	}
	
	/**
	 * 上一次答案值,上一次该问题的答案值，与qitem中的itemvalue对应
	 */
	public void setMyanswer(String value)
	 {
		this.myanswer = value;
	}
	
	/**
	 * 问卷答案值,默认选择的答案值，与qitem中的itemvalue对应
	 */
	public String getQanswer() {
		return this.qanswer;
	}
	
	/**
	 * 问卷答案值,默认选择的答案值，与qitem中的itemvalue对应
	 */
	public void setQanswer(String value)
	 {
		this.qanswer = value;
	}
	
	/**
	 * 问卷编号,该题目的问卷编号
	 */
	public String getQno() {
		return this.qno;
	}
	
	/**
	 * 问卷编号,该题目的问卷编号
	 */
	public void setQno(String value)
	 {
		this.qno = value;
	}
	
	/**
	 * 问卷标题,该题目的文字描述
	 */
	public String getQtitle() {
		return this.qtitle;
	}
	
	/**
	 * 问卷标题,该题目的文字描述
	 */
	public void setQtitle(String value)
	 {
		this.qtitle = value;
	}
	
	public List<C004OutputQitemDetail> getQitemDetail() {
		return this.qitemDetail;
	}
	
}
