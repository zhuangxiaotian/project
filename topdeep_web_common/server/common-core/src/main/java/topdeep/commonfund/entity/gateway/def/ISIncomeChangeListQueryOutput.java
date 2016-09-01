package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收益变动曲线功能输出参数
 */
public class ISIncomeChangeListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 总记录数,当statType传1时，此字段有意义
	 */
	private Integer totalRowsCount;
	
	private List<ISIncomeChangeListQueryOutputDetail> detail = new ArrayList<ISIncomeChangeListQueryOutputDetail>();
	
	public ISIncomeChangeListQueryOutput() {
		this.setZ_funcCode("u05");
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
	
	public List<ISIncomeChangeListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
