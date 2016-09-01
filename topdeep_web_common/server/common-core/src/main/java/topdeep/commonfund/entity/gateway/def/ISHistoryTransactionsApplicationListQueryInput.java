package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 历史交易申请查询功能输入参数
 */
public class ISHistoryTransactionsApplicationListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
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
	 * 申请编号,
	 */
	private String applicationNo;
	
	/**
	 * 开始日期,
	 */
	private java.util.Date beginDate;
	
	/**
	 * 结束日期,
	 */
	private java.util.Date endDate;
	
	/**
	 * 交易类型,
	 */
	private String transactionsType;
	
	/**
	 * 查询内容,
	 */
	private String queryContentType;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 排除交易类型,
	 */
	private String excludeTransactionsType;
	
	/**
	 * 证件号码,
	 */
	private String identityno;
	
	/**
	 * identitytype,
	 */
	private String identitytype;
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	private String agencytype;
	
	/**
	 * 销售商,当渠道参数agencytype为A时有效
	 */
	private String agencyno;
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	private String datasource;
	
	public ISHistoryTransactionsApplicationListQueryInput() {
		this.setZ_funcCode("u0s");
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
	 * 申请编号,
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplicationNo(String value)
	 {
		this.applicationNo = value;
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
	 * 交易类型,
	 */
	public String getTransactionsType() {
		return this.transactionsType;
	}
	
	/**
	 * 交易类型,
	 */
	public void setTransactionsType(String value)
	 {
		this.transactionsType = value;
	}
	
	/**
	 * 查询内容,
	 */
	public String getQueryContentType() {
		return this.queryContentType;
	}
	
	/**
	 * 查询内容,
	 */
	public void setQueryContentType(String value)
	 {
		this.queryContentType = value;
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
	 * 排除交易类型,
	 */
	public String getExcludeTransactionsType() {
		return this.excludeTransactionsType;
	}
	
	/**
	 * 排除交易类型,
	 */
	public void setExcludeTransactionsType(String value)
	 {
		this.excludeTransactionsType = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * identitytype,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * identitytype,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	public String getAgencytype() {
		return this.agencytype;
	}
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	public void setAgencytype(String value)
	 {
		this.agencytype = value;
	}
	
	/**
	 * 销售商,当渠道参数agencytype为A时有效
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商,当渠道参数agencytype为A时有效
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
}
