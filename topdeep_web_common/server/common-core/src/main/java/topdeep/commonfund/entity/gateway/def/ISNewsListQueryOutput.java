package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资讯列表功能输出参数
 */
public class ISNewsListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 总记录数,当statType传1时，此字段有意义
	 */
	private Integer totalRowsCount;
	
	private List<ISNewsListQueryOutputDetail> detail = new ArrayList<ISNewsListQueryOutputDetail>();
	
	public ISNewsListQueryOutput() {
		this.setZ_funcCode("n01");
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
	
	public List<ISNewsListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
