package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询特殊基金列表功能输出明细参数
 */
public class ISSpecialFundListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * (可转入)基金代码,
	 */
	private String fundCode;
	
	/**
	 * (可转入)份额类别,见数据字典份额类型
	 */
	private String shareType;
	
	/**
	 * 基金名称,
	 */
	private String fundName;
	
	/**
	 * 份额类别名称,
	 */
	private String shareTypeName;
	
	/**
	 * 当前净值如何有的话,
	 */
	private String netValue;
	
	/**
	 * 折扣描述,
	 */
	private String discountDesc;
	
	/**
	 * (可转入)基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * (可转入)基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * (可转入)份额类别,见数据字典份额类型
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * (可转入)份额类别,见数据字典份额类型
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundName() {
		return this.fundName;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundName(String value)
	 {
		this.fundName = value;
	}
	
	/**
	 * 份额类别名称,
	 */
	public String getShareTypeName() {
		return this.shareTypeName;
	}
	
	/**
	 * 份额类别名称,
	 */
	public void setShareTypeName(String value)
	 {
		this.shareTypeName = value;
	}
	
	/**
	 * 当前净值如何有的话,
	 */
	public String getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 当前净值如何有的话,
	 */
	public void setNetValue(String value)
	 {
		this.netValue = value;
	}
	
	/**
	 * 折扣描述,
	 */
	public String getDiscountDesc() {
		return this.discountDesc;
	}
	
	/**
	 * 折扣描述,
	 */
	public void setDiscountDesc(String value)
	 {
		this.discountDesc = value;
	}
}
