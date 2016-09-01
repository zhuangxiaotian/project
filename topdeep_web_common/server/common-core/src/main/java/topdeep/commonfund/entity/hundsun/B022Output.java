package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡快捷鉴权(B022)
 */
public class B022Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行帐号名,
	 */
	private String bankacconame = "";
	
	/**
	 * 分行,
	 */
	private String branchbank = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 签约协议号,部分银行会返回签约协议号，调用C037开户时，需要将此协议号传入
	 */
	private String cdcard = "";
	
	/**
	 * 请求序列号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 银行帐号名,
	 */
	public String getBankacconame() {
		return this.bankacconame;
	}
	
	/**
	 * 银行帐号名,
	 */
	public void setBankacconame(String value)
	 {
		this.bankacconame = value;
	}
	
	/**
	 * 分行,
	 */
	public String getBranchbank() {
		return this.branchbank;
	}
	
	/**
	 * 分行,
	 */
	public void setBranchbank(String value)
	 {
		this.branchbank = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 签约协议号,部分银行会返回签约协议号，调用C037开户时，需要将此协议号传入
	 */
	public String getCdcard() {
		return this.cdcard;
	}
	
	/**
	 * 签约协议号,部分银行会返回签约协议号，调用C037开户时，需要将此协议号传入
	 */
	public void setCdcard(String value)
	 {
		this.cdcard = value;
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
}
