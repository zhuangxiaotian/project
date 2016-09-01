package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金列表功能输出参数
 */
public class ISFundListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFundListQueryOutputDetail> detail = new ArrayList<ISFundListQueryOutputDetail>();
	
	public ISFundListQueryOutput() {
		this.setZ_funcCode("n06");
	}
	
	public List<ISFundListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
