package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金历史净值功能输入参数
 */
public class ISHisNetValueQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 统计类型,0表示不统计总数 1表示需要统计总数
	 */
	private String statType;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 开始日期,
	 */
	private java.util.Date beginDate;
	
	/**
	 * 结束日期,
	 */
	private java.util.Date endDate;
	
	/**
	 * 返回顺序,0表示顺序 1表示逆序
	 */
	private String order;
	
	/**
	 * 页面索引,页索引
	 */
	private Integer pageIndex;
	
	/**
	 * 页记录数,页面记录数
	 */
	private Integer rowsOfPage;
	
	/**
	 * 数据来源,
	 */
	private String datasource;
	
	public ISHisNetValueQueryInput() {
		this.setZ_funcCode("n08");
	}
	
	/**
	 * 统计类型,0表示不统计总数 1表示需要统计总数
	 */
	public String getStatType() {
		return this.statType;
	}
	
	/**
	 * 统计类型,0表示不统计总数 1表示需要统计总数
	 */
	public void setStatType(String value)
	 {
		this.statType = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 开始日期,
	 */
	public java.util.Date getBeginDate() {
		return this.beginDate;
	}
	
	/**
	 * 开始日期,
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
	 * 返回顺序,0表示顺序 1表示逆序
	 */
	public String getOrder() {
		return this.order;
	}
	
	/**
	 * 返回顺序,0表示顺序 1表示逆序
	 */
	public void setOrder(String value)
	 {
		this.order = value;
	}
	
	/**
	 * 页面索引,页索引
	 */
	public Integer getPageIndex() {
		return this.pageIndex;
	}
	
	/**
	 * 页面索引,页索引
	 */
	public void setPageIndex(Integer value)
	 {
		this.pageIndex = value;
	}
	
	/**
	 * 页记录数,页面记录数
	 */
	public Integer getRowsOfPage() {
		return this.rowsOfPage;
	}
	
	/**
	 * 页记录数,页面记录数
	 */
	public void setRowsOfPage(Integer value)
	 {
		this.rowsOfPage = value;
	}
	
	/**
	 * 数据来源,
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
}
