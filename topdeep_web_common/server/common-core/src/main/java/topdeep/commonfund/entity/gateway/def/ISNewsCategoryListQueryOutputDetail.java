package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资讯分类功能输出明细参数
 */
public class ISNewsCategoryListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 资讯分类ID,
	 */
	private Integer newsCategoryId;
	
	/**
	 * 资讯分类名称,
	 */
	private String newsCategoryName;
	
	/**
	 * 资讯分类ID,
	 */
	public Integer getNewsCategoryId() {
		return this.newsCategoryId;
	}
	
	/**
	 * 资讯分类ID,
	 */
	public void setNewsCategoryId(Integer value)
	 {
		this.newsCategoryId = value;
	}
	
	/**
	 * 资讯分类名称,
	 */
	public String getNewsCategoryName() {
		return this.newsCategoryName;
	}
	
	/**
	 * 资讯分类名称,
	 */
	public void setNewsCategoryName(String value)
	 {
		this.newsCategoryName = value;
	}
}
