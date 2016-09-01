package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询交易帮助信息功能输出参数
 */
public class ISTransactionsHelpQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 资讯标识,
	 */
	private Integer newsId;
	
	/**
	 * 资讯内容,
	 */
	private String newsContent;
	
	private List<ISTransactionsHelpQueryOutputDetail> detail = new ArrayList<ISTransactionsHelpQueryOutputDetail>();
	
	public ISTransactionsHelpQueryOutput() {
		this.setZ_funcCode("n0m");
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
	
	public List<ISTransactionsHelpQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
