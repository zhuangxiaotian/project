package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金买入(T003)功能输出明细参数
 */
public class T003OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请日期,
	 */
	private String requestdate = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 网银支付地址,
	 */
	private String bankurl = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 支付form,
	 */
	private String form = "";
	
	/**
	 * 申请日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
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
	 * 网银支付地址,
	 */
	public String getBankurl() {
		return this.bankurl;
	}
	
	/**
	 * 网银支付地址,
	 */
	public void setBankurl(String value)
	 {
		this.bankurl = value;
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
	 * 支付form,
	 */
	public String getForm() {
		return this.form;
	}
	
	/**
	 * 支付form,
	 */
	public void setForm(String value)
	 {
		this.form = value;
	}
}
