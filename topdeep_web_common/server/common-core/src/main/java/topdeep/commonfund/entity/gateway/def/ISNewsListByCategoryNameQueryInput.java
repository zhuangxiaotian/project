package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 根据类别名称查询资讯列表功能输入参数
 */
public class ISNewsListByCategoryNameQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 资讯分类名称,
	 */
	private String newsCategoryName;
	
	/**
	 * 指定基金代码,如果指定了基金代码，表示只查询该基金相关的资讯分类
	 */
	private String fundCode;
	
	/**
	 * 统计类型,0表示不统计总数 1表示需要统计总数
	 */
	private String statType;
	
	/**
	 * 页面索引,
	 */
	private Integer pageIndex;
	
	/**
	 * 页记录数,
	 */
	private Integer rowsOfPage;
	
	public ISNewsListByCategoryNameQueryInput() {
		this.setZ_funcCode("n0o");
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
	
	/**
	 * 指定基金代码,如果指定了基金代码，表示只查询该基金相关的资讯分类
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 指定基金代码,如果指定了基金代码，表示只查询该基金相关的资讯分类
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
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
}
