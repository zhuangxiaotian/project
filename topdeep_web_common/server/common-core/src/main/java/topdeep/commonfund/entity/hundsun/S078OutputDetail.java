package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 专户基金信息披露(S078)功能输出明细参数
 */
public class S078OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 文章发布时间,
	 */
	private String publishDate = "";
	
	/**
	 * 文章标题,
	 */
	private String title = "";
	
	/**
	 * 文章链接,
	 */
	private String url = "";
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 文章发布时间,
	 */
	public String getPublishDate() {
		return this.publishDate;
	}
	
	/**
	 * 文章发布时间,
	 */
	public void setPublishDate(String value)
	 {
		this.publishDate = value;
	}
	
	/**
	 * 文章标题,
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * 文章标题,
	 */
	public void setTitle(String value)
	 {
		this.title = value;
	}
	
	/**
	 * 文章链接,
	 */
	public String getUrl() {
		return this.url;
	}
	
	/**
	 * 文章链接,
	 */
	public void setUrl(String value)
	 {
		this.url = value;
	}
}
