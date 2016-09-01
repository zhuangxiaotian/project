package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 发送验证信息接口功能输出参数
 */
public class ISValidInfoSendOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 发送的序号,
	 */
	private String seqId;
	
	public ISValidInfoSendOutput() {
		this.setZ_funcCode("n0v");
	}
	
	/**
	 * 发送的序号,
	 */
	public String getSeqId() {
		return this.seqId;
	}
	
	/**
	 * 发送的序号,
	 */
	public void setSeqId(String value)
	 {
		this.seqId = value;
	}
}
