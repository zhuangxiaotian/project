package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 份额流水查询功能输出参数
 */
public class ISShareWaterQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISShareWaterQueryOutputDetail> detail = new ArrayList<ISShareWaterQueryOutputDetail>();
	
	public ISShareWaterQueryOutput() {
		this.setZ_funcCode("u1j");
	}
	
	public List<ISShareWaterQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
