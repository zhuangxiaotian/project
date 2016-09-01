package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 盈亏查询功能输出参数
 */
public class ISProfitQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISProfitQueryOutputDetail> detail = new ArrayList<ISProfitQueryOutputDetail>();
	
	public ISProfitQueryOutput() {
		this.setZ_funcCode("u1h");
	}
	
	public List<ISProfitQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
