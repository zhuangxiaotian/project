package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询专户剩余额度功能输入参数
 */
public class ISSpecialAccBalanceQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	public ISSpecialAccBalanceQueryInput() {
		this.setZ_funcCode("u0z");
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
