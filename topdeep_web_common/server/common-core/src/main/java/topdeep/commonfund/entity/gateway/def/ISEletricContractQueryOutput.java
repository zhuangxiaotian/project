package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询电子合同信息功能输出参数
 */
public class ISEletricContractQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISEletricContractQueryOutputDetail> detail = new ArrayList<ISEletricContractQueryOutputDetail>();
	
	public ISEletricContractQueryOutput() {
		this.setZ_funcCode("u1a");
	}
	
	public List<ISEletricContractQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
