package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 鉴权功能输出参数
 */
public class DsAuthenticationOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 鉴权序列号,
	 */
	private String applyserial;
	
	public DsAuthenticationOutput() {
		this.setZ_funcCode("u06");
	}
	
	/**
	 * 鉴权序列号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 鉴权序列号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
}
