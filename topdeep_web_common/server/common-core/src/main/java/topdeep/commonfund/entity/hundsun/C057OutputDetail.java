package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 更新开户留痕(C057)功能输出明细参数
 */
public class C057OutputDetail extends Object implements Serializable {
	
	/**
	 * 请求序列号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 业务类型,如果入参传入，结果就会返回，否则不会
	 */
	private String busitype = "";
	
	/**
	 * 客户姓名,如果入参传入，结果就会返回，否则不会
	 */
	private String custname = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
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
	 * 业务类型,如果入参传入，结果就会返回，否则不会
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,如果入参传入，结果就会返回，否则不会
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 客户姓名,如果入参传入，结果就会返回，否则不会
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户姓名,如果入参传入，结果就会返回，否则不会
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
}
