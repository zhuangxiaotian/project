package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询专户剩余额度功能输出参数
 */
public class ISSpecialAccBalanceQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Integer totalrecords;
	
	private List<ISSpecialAccBalanceQueryOutputDetail> detail = new ArrayList<ISSpecialAccBalanceQueryOutputDetail>();
	
	public ISSpecialAccBalanceQueryOutput() {
		this.setZ_funcCode("u0z");
	}
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public Integer getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public void setTotalrecords(Integer value)
	 {
		this.totalrecords = value;
	}
	
	public List<ISSpecialAccBalanceQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
