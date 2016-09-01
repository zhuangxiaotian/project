package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 历史确认查询功能输出参数
 */
public class ISHistoryConfirmQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISHistoryConfirmQueryOutputDetail> detail = new ArrayList<ISHistoryConfirmQueryOutputDetail>();
	
	public ISHistoryConfirmQueryOutput() {
		this.setZ_funcCode("u0i");
	}
	
	public List<ISHistoryConfirmQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
