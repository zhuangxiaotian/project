package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金列表功能输入参数
 */
public class ISFundListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 查询基金代码,
	 */
	private String fundCode;
	
	public ISFundListQueryInput() {
		this.setZ_funcCode("n06");
	}
	
	/**
	 * 查询基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 查询基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
}
