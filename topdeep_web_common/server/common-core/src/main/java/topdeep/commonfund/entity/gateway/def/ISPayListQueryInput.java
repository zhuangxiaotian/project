package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询收付款交易记录功能输入参数
 */
public class ISPayListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 开始时间,
	 */
	private String startDate;
	
	/**
	 * 结束时间,
	 */
	private String endDate;
	
	/**
	 * 分页索引,
	 */
	private String pageIndex;
	
	/**
	 * 每页分页数量,
	 */
	private String pageSize;
	
	/**
	 * 收付款交易ID,
	 */
	private String payId;
	
	public ISPayListQueryInput() {
		this.setZ_funcCode("m0h");
	}
	
	/**
	 * 开始时间,
	 */
	public String getStartDate() {
		return this.startDate;
	}
	
	/**
	 * 开始时间,
	 */
	public void setStartDate(String value)
	 {
		this.startDate = value;
	}
	
	/**
	 * 结束时间,
	 */
	public String getEndDate() {
		return this.endDate;
	}
	
	/**
	 * 结束时间,
	 */
	public void setEndDate(String value)
	 {
		this.endDate = value;
	}
	
	/**
	 * 分页索引,
	 */
	public String getPageIndex() {
		return this.pageIndex;
	}
	
	/**
	 * 分页索引,
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
	
	/**
	 * 收付款交易ID,
	 */
	public String getPayId() {
		return this.payId;
	}
	
	/**
	 * 收付款交易ID,
	 */
	public void setPayId(String value)
	 {
		this.payId = value;
	}
}
