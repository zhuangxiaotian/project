package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 历史交易申请查询功能输出参数
 */
public class ISHistoryTransactionsApplicationListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 总记录数,当statType传1时，此字段有意义
	 */
	private Integer totalRowsCount;
	
	private List<ISHistoryTransactionsApplicationListQueryOutputDetail> detail = new ArrayList<ISHistoryTransactionsApplicationListQueryOutputDetail>();
	
	public ISHistoryTransactionsApplicationListQueryOutput() {
		this.setZ_funcCode("u0s");
	}
	
	/**
	 * 总记录数,当statType传1时，此字段有意义
	 */
	public Integer getTotalRowsCount() {
		return this.totalRowsCount;
	}
	
	/**
	 * 总记录数,当statType传1时，此字段有意义
	 */
	public void setTotalRowsCount(Integer value)
	 {
		this.totalRowsCount = value;
	}
	
	public List<ISHistoryTransactionsApplicationListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
