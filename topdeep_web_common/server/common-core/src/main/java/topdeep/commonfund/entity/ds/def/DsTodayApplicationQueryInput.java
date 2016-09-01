package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 当日交易申请查询功能输入参数
 */
public class DsTodayApplicationQueryInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 页面索引,页索引,页索引
	 */
	private Integer pageIndex;
	
	/**
	 * 页记录数,页面记录数,页面记录数
	 */
	private Integer rowsOfPage;
	
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
	 * 基金类别,
	 */
	private String fundType;
	
	/**
	 * 证件号码,
	 */
	private String identityno;
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	/**
	 * 客户编号或者sessionKey,
	 */
	private String customerId;
	
	public DsTodayApplicationQueryInput() {
		this.setZ_funcCode("u0e");
	}
	
	/**
	 * 页面索引,页索引,页索引
	 */
	public Integer getPageIndex() {
		return this.pageIndex;
	}
	
	/**
	 * 页面索引,页索引,页索引
	 */
	public void setPageIndex(Integer value)
	 {
		this.pageIndex = value;
	}
	
	/**
	 * 页记录数,页面记录数,页面记录数
	 */
	public Integer getRowsOfPage() {
		return this.rowsOfPage;
	}
	
	/**
	 * 页记录数,页面记录数,页面记录数
	 */
	public void setRowsOfPage(Integer value)
	 {
		this.rowsOfPage = value;
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
	 * 基金类别,
	 */
	public String getFundType() {
		return this.fundType;
	}
	
	/**
	 * 基金类别,
	 */
	public void setFundType(String value)
	 {
		this.fundType = value;
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
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public String getCustomerId() {
		return this.customerId;
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public void setCustomerId(String value)
	 {
		this.customerId = value;
	}
}
