package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金列表功能输出参数
 */
public class DsFundListQueryOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	private List<DsFundListQueryOutputDetail> detail = new ArrayList<DsFundListQueryOutputDetail>();
	
	public DsFundListQueryOutput() {
		this.setZ_funcCode("n00");
	}
	
	public List<DsFundListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
