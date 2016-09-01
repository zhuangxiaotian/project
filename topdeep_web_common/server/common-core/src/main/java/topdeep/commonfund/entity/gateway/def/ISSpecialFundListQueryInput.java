package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询特殊基金列表功能输入参数
 */
public class ISSpecialFundListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 交易类型代码,网关本地交易类型
	 */
	private String transactionsCode;
	
	/**
	 * 转出基金代码,可以为空
	 */
	private String fundCode;
	
	/**
	 * 转出份额类别,可以为空，数据字典份额类型
	 */
	private String shareType;
	
	public ISSpecialFundListQueryInput() {
		this.setZ_funcCode("n1g");
	}
	
	/**
	 * 交易类型代码,网关本地交易类型
	 */
	public String getTransactionsCode() {
		return this.transactionsCode;
	}
	
	/**
	 * 交易类型代码,网关本地交易类型
	 */
	public void setTransactionsCode(String value)
	 {
		this.transactionsCode = value;
	}
	
	/**
	 * 转出基金代码,可以为空
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 转出基金代码,可以为空
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 转出份额类别,可以为空，数据字典份额类型
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 转出份额类别,可以为空，数据字典份额类型
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
}
