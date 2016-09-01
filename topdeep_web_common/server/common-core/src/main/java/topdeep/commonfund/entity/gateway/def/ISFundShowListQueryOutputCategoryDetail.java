package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金显示列表功能输出明细参数
 */
public class ISFundShowListQueryOutputCategoryDetail extends Object implements Serializable {
	
	/**
	 * 基金分类代码,
	 */
	private String fundCategoryCode;
	
	/**
	 * 基金分类名称,
	 */
	private String fundCategoryName;
	
	/**
	 * 基金显示参数,
	 */
	private String showParam;
	
	/**
	 * 基金分类代码,
	 */
	public String getFundCategoryCode() {
		return this.fundCategoryCode;
	}
	
	/**
	 * 基金分类代码,
	 */
	public void setFundCategoryCode(String value)
	 {
		this.fundCategoryCode = value;
	}
	
	/**
	 * 基金分类名称,
	 */
	public String getFundCategoryName() {
		return this.fundCategoryName;
	}
	
	/**
	 * 基金分类名称,
	 */
	public void setFundCategoryName(String value)
	 {
		this.fundCategoryName = value;
	}
	
	/**
	 * 基金显示参数,
	 */
	public String getShowParam() {
		return this.showParam;
	}
	
	/**
	 * 基金显示参数,
	 */
	public void setShowParam(String value)
	 {
		this.showParam = value;
	}
}
