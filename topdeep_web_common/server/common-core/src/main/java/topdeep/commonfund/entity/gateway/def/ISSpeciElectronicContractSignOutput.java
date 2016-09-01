package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 签署电子合同或风险揭示书功能输出参数
 */
public class ISSpeciElectronicContractSignOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial;
	
	public ISSpeciElectronicContractSignOutput() {
		this.setZ_funcCode("u1b");
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
}
