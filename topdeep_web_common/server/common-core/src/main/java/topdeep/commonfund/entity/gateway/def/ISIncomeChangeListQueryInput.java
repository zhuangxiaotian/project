package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收益变动曲线功能输入参数
 */
public class ISIncomeChangeListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 统计类型,0表示不统计总数 1表示需要统计总数
	 */
	private String statType;
	
	/**
	 * 页面索引,页索引
	 */
	private Integer pageIndex;
	
	/**
	 * 页记录数,页面记录数
	 */
	private Integer rowsOfPage;
	
	/**
	 * 开始日期,0客户编号 1 基金账号 2交易账号
	 */
	private java.util.Date beginDate;
	
	/**
	 * 结束日期,
	 */
	private java.util.Date endDate;
	
	/**
	 * 查询单位,
	 */
	private String queryUnit;
	
	/**
	 * 需要统计的基金列表,用逗号分隔
	 */
	private String fundList;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	public ISIncomeChangeListQueryInput() {
		this.setZ_funcCode("u05");
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
	 * 开始日期,0客户编号 1 基金账号 2交易账号
	 */
	public java.util.Date getBeginDate() {
		return this.beginDate;
	}
	
	/**
	 * 开始日期,0客户编号 1 基金账号 2交易账号
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
	 * 查询单位,
	 */
	public String getQueryUnit() {
		return this.queryUnit;
	}
	
	/**
	 * 查询单位,
	 */
	public void setQueryUnit(String value)
	 {
		this.queryUnit = value;
	}
	
	/**
	 * 需要统计的基金列表,用逗号分隔
	 */
	public String getFundList() {
		return this.fundList;
	}
	
	/**
	 * 需要统计的基金列表,用逗号分隔
	 */
	public void setFundList(String value)
	 {
		this.fundList = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
}
