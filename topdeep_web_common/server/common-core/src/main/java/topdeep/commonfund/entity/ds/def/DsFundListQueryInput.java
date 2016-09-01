package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金列表功能输入参数
 */
public class DsFundListQueryInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	public DsFundListQueryInput() {
		this.setZ_funcCode("n00");
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
}
