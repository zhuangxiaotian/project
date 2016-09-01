package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金费用功能输出参数
 */
public class ISFundFeeQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFundFeeQueryOutputDetail> detail = new ArrayList<ISFundFeeQueryOutputDetail>();
	
	public ISFundFeeQueryOutput() {
		this.setZ_funcCode("n0a");
	}
	
	public List<ISFundFeeQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
