package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡快捷鉴权验证码发送(B040)
 */
public class B040Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 对方流水号,
	 */
	private String otherserial = "";
	
	/**
	 * 请求序列号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 银行短信识别码,交行资金方式时会返回
	 */
	private String banksessionid = "";
	
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
	 * 银行短信识别码,交行资金方式时会返回
	 */
	public String getBanksessionid() {
		return this.banksessionid;
	}
	
	/**
	 * 银行短信识别码,交行资金方式时会返回
	 */
	public void setBanksessionid(String value)
	 {
		this.banksessionid = value;
	}
}
