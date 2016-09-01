package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资讯分类功能输入参数
 */
public class ISNewsCategoryListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 父资讯分类ID,0表示根分类
	 */
	private Integer parentCategoryId;
	
	/**
	 * 指定基金代码,如果指定了基金代码，表示只查询该基金相关的资讯分类
	 */
	private String fundCode;
	
	public ISNewsCategoryListQueryInput() {
		this.setZ_funcCode("n00");
	}
	
	/**
	 * 父资讯分类ID,0表示根分类
	 */
	public Integer getParentCategoryId() {
		return this.parentCategoryId;
	}
	
	/**
	 * 父资讯分类ID,0表示根分类
	 */
	public void setParentCategoryId(Integer value)
	 {
		this.parentCategoryId = value;
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
}
