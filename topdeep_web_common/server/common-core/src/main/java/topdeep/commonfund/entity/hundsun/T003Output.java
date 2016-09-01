package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金买入(T003)
 */
public class T003Output extends HundsunBaseOutput implements Serializable {
	
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
	
	private List<T003OutputForm> form = new ArrayList<T003OutputForm>();
	
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
	
	public List<T003OutputForm> getForm() {
		return this.form;
	}
	
}
