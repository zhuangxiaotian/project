package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询支持开户的银行列表功能输入参数
 */
public class ISSupportOpenAccountBankListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 活动标志,参见快速开户查询功能
	 */
	private String promotionFlag;
	
	public ISSupportOpenAccountBankListQueryInput() {
		this.setZ_funcCode("n0t");
	}
	
	/**
	 * 活动标志,参见快速开户查询功能
	 */
	public String getPromotionFlag() {
		return this.promotionFlag;
	}
	
	/**
	 * 活动标志,参见快速开户查询功能
	 */
	public void setPromotionFlag(String value)
	 {
		this.promotionFlag = value;
	}
}
