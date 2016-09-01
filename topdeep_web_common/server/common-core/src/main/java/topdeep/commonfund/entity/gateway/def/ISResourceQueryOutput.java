package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资源功能输出参数
 */
public class ISResourceQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISResourceQueryOutputDetail> detail = new ArrayList<ISResourceQueryOutputDetail>();
	
	public ISResourceQueryOutput() {
		this.setZ_funcCode("n03");
	}
	
	public List<ISResourceQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
