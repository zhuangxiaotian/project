package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史测评查询(S099)功能输出明细参数
 */
public class S099OutputDetail extends Object implements Serializable {
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 客户名称,
	 */
	private String customname = "";
	
	/**
	 * 投资人风险承受能力,
	 */
	private String custrisktype = "";
	
	/**
	 * 客户类型,
	 */
	private String custtype = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 问卷编号,
	 */
	private String questionnaireno = "";
	
	/**
	 * 问卷得分,
	 */
	private String questionnairescore = "";
	
	/**
	 * 最后更新时间,
	 */
	private String replydate = "";
	
	/**
	 * 填写标志,
	 */
	private String replyflag = "";
	
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
	 * 客户名称,
	 */
	public String getCustomname() {
		return this.customname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustomname(String value)
	 {
		this.customname = value;
	}
	
	/**
	 * 投资人风险承受能力,
	 */
	public String getCustrisktype() {
		return this.custrisktype;
	}
	
	/**
	 * 投资人风险承受能力,
	 */
	public void setCustrisktype(String value)
	 {
		this.custrisktype = value;
	}
	
	/**
	 * 客户类型,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
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
	
	/**
	 * 问卷编号,
	 */
	public String getQuestionnaireno() {
		return this.questionnaireno;
	}
	
	/**
	 * 问卷编号,
	 */
	public void setQuestionnaireno(String value)
	 {
		this.questionnaireno = value;
	}
	
	/**
	 * 问卷得分,
	 */
	public String getQuestionnairescore() {
		return this.questionnairescore;
	}
	
	/**
	 * 问卷得分,
	 */
	public void setQuestionnairescore(String value)
	 {
		this.questionnairescore = value;
	}
	
	/**
	 * 最后更新时间,
	 */
	public String getReplydate() {
		return this.replydate;
	}
	
	/**
	 * 最后更新时间,
	 */
	public void setReplydate(String value)
	 {
		this.replydate = value;
	}
	
	/**
	 * 填写标志,
	 */
	public String getReplyflag() {
		return this.replyflag;
	}
	
	/**
	 * 填写标志,
	 */
	public void setReplyflag(String value)
	 {
		this.replyflag = value;
	}
}
