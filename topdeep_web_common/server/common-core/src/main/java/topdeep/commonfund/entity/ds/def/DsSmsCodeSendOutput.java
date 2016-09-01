package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 发送验证码功能输出参数
 */
public class DsSmsCodeSendOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial;
	
	/**
	 * 短信验证码,
	 */
	private String smsSeqId;
	
	public DsSmsCodeSendOutput() {
		this.setZ_funcCode("u04");
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
	 * 短信验证码,
	 */
	public String getSmsSeqId() {
		return this.smsSeqId;
	}
	
	/**
	 * 短信验证码,
	 */
	public void setSmsSeqId(String value)
	 {
		this.smsSeqId = value;
	}
}
