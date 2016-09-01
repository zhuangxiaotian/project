package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * CMS内容查询(S042)功能输出明细参数
 */
public class S042OutputDetail extends Object implements Serializable {
	
	/**
	 * 分类id,
	 */
	private String categoryId = "";
	
	/**
	 * 内容正文,
	 */
	private String content = "";
	
	/**
	 * 内容id,
	 */
	private String contentId = "";
	
	/**
	 * 创建日期,modificationDate
	 */
	private String creationDate = "";
	
	/**
	 * 编辑人,
	 */
	private String editor = "";
	
	/**
	 * 修改日期,modificationDate
	 */
	private String modificationDate = "";
	
	/**
	 * 发布日期,modificationDate
	 */
	private String publishDate = "";
	
	/**
	 * 内容标题,
	 */
	private String title = "";
	
	/**
	 * 内容类型,
	 */
	private String type = "";
	
	/**
	 * 链接地址,
	 */
	private String url = "";
	
	/**
	 * 分类id,
	 */
	public String getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * 分类id,
	 */
	public void setCategoryId(String value)
	 {
		this.categoryId = value;
	}
	
	/**
	 * 内容正文,
	 */
	public String getContent() {
		return this.content;
	}
	
	/**
	 * 内容正文,
	 */
	public void setContent(String value)
	 {
		this.content = value;
	}
	
	/**
	 * 内容id,
	 */
	public String getContentId() {
		return this.contentId;
	}
	
	/**
	 * 内容id,
	 */
	public void setContentId(String value)
	 {
		this.contentId = value;
	}
	
	/**
	 * 创建日期,modificationDate
	 */
	public String getCreationDate() {
		return this.creationDate;
	}
	
	/**
	 * 创建日期,modificationDate
	 */
	public void setCreationDate(String value)
	 {
		this.creationDate = value;
	}
	
	/**
	 * 编辑人,
	 */
	public String getEditor() {
		return this.editor;
	}
	
	/**
	 * 编辑人,
	 */
	public void setEditor(String value)
	 {
		this.editor = value;
	}
	
	/**
	 * 修改日期,modificationDate
	 */
	public String getModificationDate() {
		return this.modificationDate;
	}
	
	/**
	 * 修改日期,modificationDate
	 */
	public void setModificationDate(String value)
	 {
		this.modificationDate = value;
	}
	
	/**
	 * 发布日期,modificationDate
	 */
	public String getPublishDate() {
		return this.publishDate;
	}
	
	/**
	 * 发布日期,modificationDate
	 */
	public void setPublishDate(String value)
	 {
		this.publishDate = value;
	}
	
	/**
	 * 内容标题,
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * 内容标题,
	 */
	public void setTitle(String value)
	 {
		this.title = value;
	}
	
	/**
	 * 内容类型,
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 内容类型,
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	/**
	 * 链接地址,
	 */
	public String getUrl() {
		return this.url;
	}
	
	/**
	 * 链接地址,
	 */
	public void setUrl(String value)
	 {
		this.url = value;
	}
}
