package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 验证验证码功能输出参数
 */
public class DsSmsCodeValidOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 返回的序列号，拿去密码重置接口使用,
	 */
	private String applyserial;
	
	public DsSmsCodeValidOutput() {
		this.setZ_funcCode("u05");
	}
	
	/**
	 * 返回的序列号，拿去密码重置接口使用,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 返回的序列号，拿去密码重置接口使用,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
}
