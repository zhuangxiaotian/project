package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 历史分红查询功能输出参数
 */
public class ISHisBonusListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,
	 */
	private Integer totalrecords;
	
	private List<ISHisBonusListQueryOutputDetail> detail = new ArrayList<ISHisBonusListQueryOutputDetail>();
	
	public ISHisBonusListQueryOutput() {
		this.setZ_funcCode("u1c");
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
	
	public List<ISHisBonusListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
