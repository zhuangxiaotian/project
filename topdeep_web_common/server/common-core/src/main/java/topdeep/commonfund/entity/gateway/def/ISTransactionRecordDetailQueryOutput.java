package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 明细查询功能输出参数
 */
public class ISTransactionRecordDetailQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISTransactionRecordDetailQueryOutputDetail> detail = new ArrayList<ISTransactionRecordDetailQueryOutputDetail>();
	
	public ISTransactionRecordDetailQueryOutput() {
		this.setZ_funcCode("u0v");
	}
	
	public List<ISTransactionRecordDetailQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
