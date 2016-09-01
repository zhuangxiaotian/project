package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资讯内容功能输入参数
 */
public class ISNewsQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 资讯标识,
	 */
	private Integer newsId;
	
	public ISNewsQueryInput() {
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
}
