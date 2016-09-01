package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收付款交易记录详情功能输入参数
 */
public class ISPayInfoInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 收付款交易记录标识,
	 */
	private String payId;
	
	public ISPayInfoInput() {
		this.setZ_funcCode("m0j");
	}
	
	/**
	 * 收付款交易记录标识,
	 */
	public String getPayId() {
		return this.payId;
	}
	
	/**
	 * 收付款交易记录标识,
	 */
	public void setPayId(String value)
	 {
		this.payId = value;
	}
}
