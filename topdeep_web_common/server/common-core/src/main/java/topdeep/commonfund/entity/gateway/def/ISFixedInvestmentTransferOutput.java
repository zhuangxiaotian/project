package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期定额转换功能输出参数
 */
public class ISFixedInvestmentTransferOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial;
	
	/**
	 * 协议号,
	 */
	private String xyh;
	
	public ISFixedInvestmentTransferOutput() {
		this.setZ_funcCode("u1e");
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
	
	/**
	 * 协议号,
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 协议号,
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
	}
}
