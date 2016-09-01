package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 当日交易申请查询功能输出参数
 */
public class ISTodayTransactionsApplicationListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 总记录数,当statType传1时，此字段有意义
	 */
	private Integer totalRowsCount;
	
	private List<ISTodayTransactionsApplicationListQueryOutputDetail> detail = new ArrayList<ISTodayTransactionsApplicationListQueryOutputDetail>();
	
	public ISTodayTransactionsApplicationListQueryOutput() {
		this.setZ_funcCode("u0u");
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
	
	public List<ISTodayTransactionsApplicationListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
