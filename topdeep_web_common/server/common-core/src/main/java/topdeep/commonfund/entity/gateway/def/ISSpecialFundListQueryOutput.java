package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询特殊基金列表功能输出参数
 */
public class ISSpecialFundListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISSpecialFundListQueryOutputDetail> detail = new ArrayList<ISSpecialFundListQueryOutputDetail>();
	
	public ISSpecialFundListQueryOutput() {
		this.setZ_funcCode("n1g");
	}
	
	public List<ISSpecialFundListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
