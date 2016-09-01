package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 历史确认查询功能输入参数
 */
public class ISHistoryConfirmQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 起始日期,
	 */
	private java.util.Date beginDate;
	
	/**
	 * 结束日期,
	 */
	private java.util.Date endDate;
	
	/**
	 * 分页索引从0开始,
	 */
	private Integer pageIndex;
	
	/**
	 * 每页记录数,
	 */
	private Integer rowsOfPage;
	
	/**
	 * 业务代码,
	 */
	private String busiCode;
	
	public ISHistoryConfirmQueryInput() {
		this.setZ_funcCode("u0i");
	}
	
	/**
	 * 起始日期,
	 */
	public java.util.Date getBeginDate() {
		return this.beginDate;
	}
	
	/**
	 * 起始日期,
	 */
	public void setBeginDate(java.util.Date value)
	 {
		this.beginDate = value;
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
	
	/**
	 * 分页索引从0开始,
	 */
	public Integer getPageIndex() {
		return this.pageIndex;
	}
	
	/**
	 * 分页索引从0开始,
	 */
	public void setPageIndex(Integer value)
	 {
		this.pageIndex = value;
	}
	
	/**
	 * 每页记录数,
	 */
	public Integer getRowsOfPage() {
		return this.rowsOfPage;
	}
	
	/**
	 * 每页记录数,
	 */
	public void setRowsOfPage(Integer value)
	 {
		this.rowsOfPage = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getBusiCode() {
		return this.busiCode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusiCode(String value)
	 {
		this.busiCode = value;
	}
}
