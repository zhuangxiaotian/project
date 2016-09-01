package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * CMS内容查询(S042)
 */
public class S042Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private String applyrecordno = "";
	
	/**
	 * 分类id,多个id使用‘,’号隔开
	 */
	private String categoryid = "";
	
	/**
	 * 内容id,
	 */
	private String contentid = "";
	
	/**
	 * 内容状态,分类状态，多个状态使用‘,’号隔开
	 */
	private String state = "";
	
	/**
	 * 内容类型,单条查询时使用
	 */
	private String type = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private String pageno = "";
	
	/**
	 * 初始化参数
	 */
	public S042Input() {
		this.setFunction("S042");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 分类id,多个id使用‘,’号隔开
	 */
	public String getCategoryid() {
		return this.categoryid;
	}
	
	/**
	 * 分类id,多个id使用‘,’号隔开
	 */
	public void setCategoryid(String value)
	 {
		this.categoryid = value;
	}
	
	/**
	 * 内容id,
	 */
	public String getContentid() {
		return this.contentid;
	}
	
	/**
	 * 内容id,
	 */
	public void setContentid(String value)
	 {
		this.contentid = value;
	}
	
	/**
	 * 内容状态,分类状态，多个状态使用‘,’号隔开
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 内容状态,分类状态，多个状态使用‘,’号隔开
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 内容类型,单条查询时使用
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 内容类型,单条查询时使用
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("categoryid", this.categoryid);
		inputMap.put("contentid", this.contentid);
		inputMap.put("state", this.state);
		inputMap.put("type", this.type);
		inputMap.put("pageno", this.pageno);
	}
}
