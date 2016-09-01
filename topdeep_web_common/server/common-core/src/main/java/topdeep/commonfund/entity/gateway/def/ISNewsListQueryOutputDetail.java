package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资讯列表功能输出明细参数
 */
public class ISNewsListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 资讯标识,
	 */
	private Integer newsId;
	
	/**
	 * 资讯列表标题,
	 */
	private String newsListTitle;
	
	/**
	 * 摘要,
	 */
	private String newsSummary;
	
	/**
	 * 资讯来源,
	 */
	private String newsFromSource;
	
	/**
	 * 资讯发布时间,
	 */
	private java.util.Date newsPublicTime;
	
	/**
	 * 图片新闻内容,只有第一条资讯返回
	 */
	private String newsPicPageContent;
	
	/**
	 * 新闻类型,
	 */
	private String newsType;
	
	/**
	 * 附加内容,
	 */
	private String pub0;
	
	/**
	 * 资讯标识,
	 */
	public Integer getNewsId() {
		return this.newsId;
	}
	
	/**
	 * 资讯标识,
	 */
	public void setNewsId(Integer value)
	 {
		this.newsId = value;
	}
	
	/**
	 * 资讯列表标题,
	 */
	public String getNewsListTitle() {
		return this.newsListTitle;
	}
	
	/**
	 * 资讯列表标题,
	 */
	public void setNewsListTitle(String value)
	 {
		this.newsListTitle = value;
	}
	
	/**
	 * 摘要,
	 */
	public String getNewsSummary() {
		return this.newsSummary;
	}
	
	/**
	 * 摘要,
	 */
	public void setNewsSummary(String value)
	 {
		this.newsSummary = value;
	}
	
	/**
	 * 资讯来源,
	 */
	public String getNewsFromSource() {
		return this.newsFromSource;
	}
	
	/**
	 * 资讯来源,
	 */
	public void setNewsFromSource(String value)
	 {
		this.newsFromSource = value;
	}
	
	/**
	 * 资讯发布时间,
	 */
	public java.util.Date getNewsPublicTime() {
		return this.newsPublicTime;
	}
	
	/**
	 * 资讯发布时间,
	 */
	public void setNewsPublicTime(java.util.Date value)
	 {
		this.newsPublicTime = value;
	}
	
	/**
	 * 图片新闻内容,只有第一条资讯返回
	 */
	public String getNewsPicPageContent() {
		return this.newsPicPageContent;
	}
	
	/**
	 * 图片新闻内容,只有第一条资讯返回
	 */
	public void setNewsPicPageContent(String value)
	 {
		this.newsPicPageContent = value;
	}
	
	/**
	 * 新闻类型,
	 */
	public String getNewsType() {
		return this.newsType;
	}
	
	/**
	 * 新闻类型,
	 */
	public void setNewsType(String value)
	 {
		this.newsType = value;
	}
	
	/**
	 * 附加内容,
	 */
	public String getPub0() {
		return this.pub0;
	}
	
	/**
	 * 附加内容,
	 */
	public void setPub0(String value)
	 {
		this.pub0 = value;
	}
}
