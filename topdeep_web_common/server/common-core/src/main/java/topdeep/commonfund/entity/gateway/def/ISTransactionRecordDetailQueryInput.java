package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 明细查询功能输入参数
 */
public class ISTransactionRecordDetailQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 页面索引,
	 */
	private Integer pageIndex;
	
	/**
	 * 页记录数,
	 */
	private Integer rowsOfPage;
	
	/**
	 * 开始日期,
	 */
	private java.util.Date startDate;
	
	/**
	 * 结束日期,
	 */
	private java.util.Date endDate;
	
	public ISTransactionRecordDetailQueryInput() {
		this.setZ_funcCode("u0v");
	}
	
	/**
	 * 页面索引,
	 */
	public Integer getPageIndex() {
		return this.pageIndex;
	}
	
	/**
	 * 页面索引,
	 */
	public void setPageIndex(Integer value)
	 {
		this.pageIndex = value;
	}
	
	/**
	 * 页记录数,
	 */
	public Integer getRowsOfPage() {
		return this.rowsOfPage;
	}
	
	/**
	 * 页记录数,
	 */
	public void setRowsOfPage(Integer value)
	 {
		this.rowsOfPage = value;
	}
	
	/**
	 * 开始日期,
	 */
	public java.util.Date getStartDate() {
		return this.startDate;
	}
	
	/**
	 * 开始日期,
	 */
	public void setStartDate(java.util.Date value)
	 {
		this.startDate = value;
	}
	
	/**
	 * 结束日期,
	 */
	public java.util.Date getEndDate() {
		return this.endDate;
	}
	
	/**
	 * 结束日期,
	 */
	public void setEndDate(java.util.Date value)
	 {
		this.endDate = value;
	}
}
