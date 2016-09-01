package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 支付查询功能输出参数
 */
public class ISPayOrPayeeQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISPayOrPayeeQueryOutputDetail> detail = new ArrayList<ISPayOrPayeeQueryOutputDetail>();
	
	public ISPayOrPayeeQueryOutput() {
		this.setZ_funcCode("m0c");
	}
	
	public List<ISPayOrPayeeQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
