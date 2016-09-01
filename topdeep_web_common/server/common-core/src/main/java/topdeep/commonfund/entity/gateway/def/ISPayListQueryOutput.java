package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询收付款交易记录功能输出参数
 */
public class ISPayListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISPayListQueryOutputPayList> payList = new ArrayList<ISPayListQueryOutputPayList>();
	
	public ISPayListQueryOutput() {
		this.setZ_funcCode("m0h");
	}
	
	public List<ISPayListQueryOutputPayList> getPayList() {
		return this.payList;
	}
	
}
