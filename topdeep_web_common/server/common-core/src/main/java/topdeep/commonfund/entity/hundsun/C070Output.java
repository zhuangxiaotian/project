package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 用户银行卡认证(C070)
 */
public class C070Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行名称,
	 */
	private String bankName = "";
	
	/**
	 * 银行编号,
	 */
	private String bankSerial = "";
	
	/**
	 * 客户姓名,
	 */
	private String custname = "";
	
	/**
	 * 对方流水号,
	 */
	private String otherserial = "";
	
	/**
	 * 应答码,[2000]:认证一致（通过） [2001]:认证不一致（不通过） [2002]:交易异常
	 */
	private String respcd = "";
	
	/**
	 * 应答信息,
	 */
	private String respinfo = "";
	
	/**
	 * 业务状态,
	 */
	private String status = "";
	
	/**
	 * 银行名称,
	 */
	public String getBankName() {
		return this.bankName;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankName(String value)
	 {
		this.bankName = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankSerial() {
		return this.bankSerial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankSerial(String value)
	 {
		this.bankSerial = value;
	}
	
	/**
	 * 客户姓名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
	 * 应答码,[2000]:认证一致（通过） [2001]:认证不一致（不通过） [2002]:交易异常
	 */
	public String getRespcd() {
		return this.respcd;
	}
	
	/**
	 * 应答码,[2000]:认证一致（通过） [2001]:认证不一致（不通过） [2002]:交易异常
	 */
	public void setRespcd(String value)
	 {
		this.respcd = value;
	}
	
	/**
	 * 应答信息,
	 */
	public String getRespinfo() {
		return this.respinfo;
	}
	
	/**
	 * 应答信息,
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
