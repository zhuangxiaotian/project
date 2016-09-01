package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 身份证认证查询(C069)
 */
public class C069Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 公安比对分值,以45分为分割，大于45分全部认证通过，小于45分部分认证通过
	 */
	private String mpssim = "";
	
	/**
	 * 对方流水号,
	 */
	private String otherserial = "";
	
	/**
	 * 应答码,
	 */
	private String respcd = "";
	
	/**
	 * 应答信息,01：正在处理中； 00：成功；表示此次身份真伪或身份认证通过； 03：失败；表示身份真伪或身份认证失败，具体原因参见respCd,respInfo
	 */
	private String respinfo = "";
	
	/**
	 * 业务状态,
	 */
	private String status = "";
	
	/**
	 * 公安比对分值,以45分为分割，大于45分全部认证通过，小于45分部分认证通过
	 */
	public String getMpssim() {
		return this.mpssim;
	}
	
	/**
	 * 公安比对分值,以45分为分割，大于45分全部认证通过，小于45分部分认证通过
	 */
	public void setMpssim(String value)
	 {
		this.mpssim = value;
	}
	
	/**
	 * 对方流水号,
	 */
	public String getOtherserial() {
		return this.otherserial;
	}
	
	/**
	 * 对方流水号,
	 */
	public void setOtherserial(String value)
	 {
		this.otherserial = value;
	}
	
	/**
	 * 应答码,
	 */
	public String getRespcd() {
		return this.respcd;
	}
	
	/**
	 * 应答码,
	 */
	public void setRespcd(String value)
	 {
		this.respcd = value;
	}
	
	/**
	 * 应答信息,01：正在处理中； 00：成功；表示此次身份真伪或身份认证通过； 03：失败；表示身份真伪或身份认证失败，具体原因参见respCd,respInfo
	 */
	public String getRespinfo() {
		return this.respinfo;
	}
	
	/**
	 * 应答信息,01：正在处理中； 00：成功；表示此次身份真伪或身份认证通过； 03：失败；表示身份真伪或身份认证失败，具体原因参见respCd,respInfo
	 */
	public void setRespinfo(String value)
	 {
		this.respinfo = value;
	}
	
	/**
	 * 业务状态,
	 */
	public String getStatus() {
		return this.status;
	}
	
	/**
	 * 业务状态,
	 */
	public void setStatus(String value)
	 {
		this.status = value;
	}
}
