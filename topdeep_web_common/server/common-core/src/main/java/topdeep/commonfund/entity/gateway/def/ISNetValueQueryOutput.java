package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金净值功能输出参数
 */
public class ISNetValueQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISNetValueQueryOutputDetail> detail = new ArrayList<ISNetValueQueryOutputDetail>();
	
	public ISNetValueQueryOutput() {
		this.setZ_funcCode("n07");
	}
	
	public List<ISNetValueQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
