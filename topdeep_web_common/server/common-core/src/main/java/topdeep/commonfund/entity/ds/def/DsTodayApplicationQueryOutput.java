package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 当日交易申请查询功能输出参数
 */
public class DsTodayApplicationQueryOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 总记录数,当statType传1时，此字段有意义
	 */
	private Integer totalRowsCount;
	
	private List<DsTodayApplicationQueryOutputDetail> detail = new ArrayList<DsTodayApplicationQueryOutputDetail>();
	
	public DsTodayApplicationQueryOutput() {
		this.setZ_funcCode("u0e");
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
	
	public List<DsTodayApplicationQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
