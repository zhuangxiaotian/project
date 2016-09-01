package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询用户的交易账户列表功能输出参数
 */
public class DsTransactionsAccountQueryOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	private List<DsTransactionsAccountQueryOutputDetail> detail = new ArrayList<DsTransactionsAccountQueryOutputDetail>();
	
	public DsTransactionsAccountQueryOutput() {
		this.setZ_funcCode("u07");
	}
	
	public List<DsTransactionsAccountQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
