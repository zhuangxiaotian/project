package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资讯内容功能输出参数
 */
public class ISNewsQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 资讯标识,
	 */
	private Integer newsId;
	
	/**
	 * 资讯内容,
	 */
	private String newsContent;
	
	private List<ISNewsQueryOutputDetail> detail = new ArrayList<ISNewsQueryOutputDetail>();
	
	public ISNewsQueryOutput() {
		this.setZ_funcCode("n02");
	}
	
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
	 * 资讯内容,
	 */
	public String getNewsContent() {
		return this.newsContent;
	}
	
	/**
	 * 资讯内容,
	 */
	public void setNewsContent(String value)
	 {
		this.newsContent = value;
	}
	
	public List<ISNewsQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
