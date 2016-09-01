package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询可撤单列表功能输出参数
 */
public class ISQueryCanCancelTransactionListOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISQueryCanCancelTransactionListOutputDetail> detail = new ArrayList<ISQueryCanCancelTransactionListOutputDetail>();
	
	public ISQueryCanCancelTransactionListOutput() {
		this.setZ_funcCode("u0w");
	}
	
	public List<ISQueryCanCancelTransactionListOutputDetail> getDetail() {
		return this.detail;
	}
	
}
