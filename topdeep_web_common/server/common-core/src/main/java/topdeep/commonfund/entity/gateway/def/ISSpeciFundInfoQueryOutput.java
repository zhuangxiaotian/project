package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 专户基金详细信息查询功能输出参数
 */
public class ISSpeciFundInfoQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,
	 */
	private Integer totalrecords;
	
	private List<ISSpeciFundInfoQueryOutputDetail> detail = new ArrayList<ISSpeciFundInfoQueryOutputDetail>();
	
	public ISSpeciFundInfoQueryOutput() {
		this.setZ_funcCode("n0z");
	}
	
	/**
	 * 总记录条数,
	 */
	public Integer getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,
	 */
	public void setTotalrecords(Integer value)
	 {
		this.totalrecords = value;
	}
	
	public List<ISSpeciFundInfoQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
