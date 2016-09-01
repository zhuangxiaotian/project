package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 身份证正反面认证(C068)
 */
public class C068Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 地址,
	 */
	private String addr = "";
	
	/**
	 * 生日,
	 */
	private String birthday = "";
	
	/**
	 * 姓名,
	 */
	private String customername = "";
	
	/**
	 * 证件有效期,
	 */
	private String expirydate = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 签发机构,
	 */
	private String issue = "";
	
	/**
	 * 民族,
	 */
	private String nation = "";
	
	/**
	 * 流水号,
	 */
	private String otherserial = "";
	
	/**
	 * 性别,
	 */
	private String sex = "";
	
	/**
	 * 地址,
	 */
	public String getAddr() {
		return this.addr;
	}
	
	/**
	 * 地址,
	 */
	public void setAddr(String value)
	 {
		this.addr = value;
	}
	
	/**
	 * 生日,
	 */
	public String getBirthday() {
		return this.birthday;
	}
	
	/**
	 * 生日,
	 */
	public void setBirthday(String value)
	 {
		this.birthday = value;
	}
	
	/**
	 * 姓名,
	 */
	public String getCustomername() {
		return this.customername;
	}
	
	/**
	 * 姓名,
	 */
	public void setCustomername(String value)
	 {
		this.customername = value;
	}
	
	/**
	 * 证件有效期,
	 */
	public String getExpirydate() {
		return this.expirydate;
	}
	
	/**
	 * 证件有效期,
	 */
	public void setExpirydate(String value)
	 {
		this.expirydate = value;
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
	
	/**
	 * 签发机构,
	 */
	public String getIssue() {
		return this.issue;
	}
	
	/**
	 * 签发机构,
	 */
	public void setIssue(String value)
	 {
		this.issue = value;
	}
	
	/**
	 * 民族,
	 */
	public String getNation() {
		return this.nation;
	}
	
	/**
	 * 民族,
	 */
	public void setNation(String value)
	 {
		this.nation = value;
	}
	
	/**
	 * 流水号,
	 */
	public String getOtherserial() {
		return this.otherserial;
	}
	
	/**
	 * 流水号,
	 */
	public void setOtherserial(String value)
	 {
		this.otherserial = value;
	}
	
	/**
	 * 性别,
	 */
	public String getSex() {
		return this.sex;
	}
	
	/**
	 * 性别,
	 */
	public void setSex(String value)
	 {
		this.sex = value;
	}
}
