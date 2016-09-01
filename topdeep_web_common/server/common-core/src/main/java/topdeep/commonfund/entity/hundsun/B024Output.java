package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 联动优势身份验证(B024)
 */
public class B024Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 请求序列号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 业务类型,
	 */
	private String busintype = "";
	
	/**
	 * 请求序列号,
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 业务类型,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
}
