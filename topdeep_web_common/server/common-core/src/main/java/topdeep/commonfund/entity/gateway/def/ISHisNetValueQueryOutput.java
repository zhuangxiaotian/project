package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金历史净值功能输出参数
 */
public class ISHisNetValueQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 总记录数,当statType传1时，此字段有意义
	 */
	private Integer totalRowsCount;
	
	private List<ISHisNetValueQueryOutputDetail> detail = new ArrayList<ISHisNetValueQueryOutputDetail>();
	
	public ISHisNetValueQueryOutput() {
		this.setZ_funcCode("n08");
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
	
	public List<ISHisNetValueQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
