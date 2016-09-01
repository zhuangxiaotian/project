package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 历史分红查询功能输入参数
 */
public class ISHisBonusListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 结束日期,
	 */
	private String enddate;
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 当前页码,
	 */
	private Integer pageno;
	
	/**
	 * 起始日期,
	 */
	private String startdate;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco;
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	private String querytype;
	
	/**
	 * 交易来源,DS：直销，DC：数据中心
	 */
	private String datasource;
	
	/**
	 * 基金类型,为空时显示所有基金类型的信息
	 */
	private String fundtype;
	
	/**
	 * 每页显示多少条,
	 */
	private Integer pageSize;
	
	public ISHisBonusListQueryInput() {
		this.setZ_funcCode("u1c");
	}
	
	/**
	 * 结束日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 当前页码,
	 */
	public Integer getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,
	 */
	public void setPageno(Integer value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 起始日期,
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 交易来源,DS：直销，DC：数据中心
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 交易来源,DS：直销，DC：数据中心
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 基金类型,为空时显示所有基金类型的信息
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,为空时显示所有基金类型的信息
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 每页显示多少条,
	 */
	public Integer getPageSize() {
		return this.pageSize;
	}
	
	/**
	 * 每页显示多少条,
	 */
	public void setPageSize(Integer value)
	 {
		this.pageSize = value;
	}
}
