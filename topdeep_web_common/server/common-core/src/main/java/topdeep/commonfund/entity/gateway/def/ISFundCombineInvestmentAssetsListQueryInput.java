package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金组合投资资产组合功能输入参数
 */
public class ISFundCombineInvestmentAssetsListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	public ISFundCombineInvestmentAssetsListQueryInput() {
		this.setZ_funcCode("n0g");
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
}
