package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询密保问题(C017)功能输出明细参数
 */
public class C017OutputDetail extends Object implements Serializable {
	
	/**
	 * 答案类型,D：日期类型；N：数字类型T：文本类型
	 */
	private String answertype = "";
	
	/**
	 * 问题内容,如果为自定义问题，则值为问题内容，如果为系统问题，值为问题编号
	 */
	private String prodesc = "";
	
	/**
	 * 问题序号,
	 */
	private String prono = "";
	
	/**
	 * 问题类型,0：自定义问题；1：系统问题
	 */
	private String protype = "";
	
	/**
	 * 答案类型,D：日期类型；N：数字类型T：文本类型
	 */
	public String getAnswertype() {
		return this.answertype;
	}
	
	/**
	 * 答案类型,D：日期类型；N：数字类型T：文本类型
	 */
	public void setAnswertype(String value)
	 {
		this.answertype = value;
	}
	
	/**
	 * 问题内容,如果为自定义问题，则值为问题内容，如果为系统问题，值为问题编号
	 */
	public String getProdesc() {
		return this.prodesc;
	}
	
	/**
	 * 问题内容,如果为自定义问题，则值为问题内容，如果为系统问题，值为问题编号
	 */
	public void setProdesc(String value)
	 {
		this.prodesc = value;
	}
	
	/**
	 * 问题序号,
	 */
	public String getProno() {
		return this.prono;
	}
	
	/**
	 * 问题序号,
	 */
	public void setProno(String value)
	 {
		this.prono = value;
	}
	
	/**
	 * 问题类型,0：自定义问题；1：系统问题
	 */
	public String getProtype() {
		return this.protype;
	}
	
	/**
	 * 问题类型,0：自定义问题；1：系统问题
	 */
	public void setProtype(String value)
	 {
		this.protype = value;
	}
}
