package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 我的红包功能输入参数
 */
public class ISMyGiftInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 翻页索引,
	 */
	private String pageIndex;
	
	/**
	 * 每页分页数量,
	 */
	private String pageSize;
	
	public ISMyGiftInput() {
		this.setZ_funcCode("u1L");
	}
	
	/**
	 * 翻页索引,
	 */
	public String getPageIndex() {
		return this.pageIndex;
	}
	
	/**
	 * 翻页索引,
	 */
	public void setPageIndex(String value)
	 {
		this.pageIndex = value;
	}
	
	/**
	 * 每页分页数量,
	 */
	public String getPageSize() {
		return this.pageSize;
	}
	
	/**
	 * 每页分页数量,
	 */
	public void setPageSize(String value)
	 {
		this.pageSize = value;
	}
}
