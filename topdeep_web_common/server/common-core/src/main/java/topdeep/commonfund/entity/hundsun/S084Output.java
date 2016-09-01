package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 待审核交易查询(S084)
 */
public class S084Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * 父账号,
	 */
	private String custno = "";
	
	/**
	 * 交易密码,
	 */
	private String dealpwd = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 最后更新日期,
	 */
	private String lastmodifydate = "";
	
	/**
	 * 密码错误次数,
	 */
	private String pwderrornum = "";
	
	/**
	 * 密码最后修改时间,
	 */
	private String pwdlastmodifytime = "";
	
	/**
	 * 子账户名称,
	 */
	private String subacconame = "";
	
	/**
	 * 子账户编号,
	 */
	private String subaccono = "";
	
	/**
	 * 审核权限,
	 */
	private String subcheck = "";
	
	/**
	 * 电话,
	 */
	private String telephone = "";
	
	/**
	 * 邮编,
	 */
	private String zip = "";
	
	/**
	 * 手机,
	 */
	private String handset = "";
	
	/**
	 * 交易权限,
	 */
	private String subtrade = "";
	
	/**
	 * 电邮,
	 */
	private String email = "";
	
	/**
	 * 激活标志,
	 */
	private String needactive = "";
	
	/**
	 * 查询权限,
	 */
	private String subquery = "";
	
	/**
	 * 锁定日期,
	 */
	private String locktime = "";
	
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
	 * 地址,
	 */
	public String getCommunicationaddr() {
		return this.communicationaddr;
	}
	
	/**
	 * 地址,
	 */
	public void setCommunicationaddr(String value)
	 {
		this.communicationaddr = value;
	}
	
	/**
	 * 父账号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 父账号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getDealpwd() {
		return this.dealpwd;
	}
	
	/**
	 * 交易密码,
	 */
	public void setDealpwd(String value)
	 {
		this.dealpwd = value;
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
	 * 最后更新日期,
	 */
	public String getLastmodifydate() {
		return this.lastmodifydate;
	}
	
	/**
	 * 最后更新日期,
	 */
	public void setLastmodifydate(String value)
	 {
		this.lastmodifydate = value;
	}
	
	/**
	 * 密码错误次数,
	 */
	public String getPwderrornum() {
		return this.pwderrornum;
	}
	
	/**
	 * 密码错误次数,
	 */
	public void setPwderrornum(String value)
	 {
		this.pwderrornum = value;
	}
	
	/**
	 * 密码最后修改时间,
	 */
	public String getPwdlastmodifytime() {
		return this.pwdlastmodifytime;
	}
	
	/**
	 * 密码最后修改时间,
	 */
	public void setPwdlastmodifytime(String value)
	 {
		this.pwdlastmodifytime = value;
	}
	
	/**
	 * 子账户名称,
	 */
	public String getSubacconame() {
		return this.subacconame;
	}
	
	/**
	 * 子账户名称,
	 */
	public void setSubacconame(String value)
	 {
		this.subacconame = value;
	}
	
	/**
	 * 子账户编号,
	 */
	public String getSubaccono() {
		return this.subaccono;
	}
	
	/**
	 * 子账户编号,
	 */
	public void setSubaccono(String value)
	 {
		this.subaccono = value;
	}
	
	/**
	 * 审核权限,
	 */
	public String getSubcheck() {
		return this.subcheck;
	}
	
	/**
	 * 审核权限,
	 */
	public void setSubcheck(String value)
	 {
		this.subcheck = value;
	}
	
	/**
	 * 电话,
	 */
	public String getTelephone() {
		return this.telephone;
	}
	
	/**
	 * 电话,
	 */
	public void setTelephone(String value)
	 {
		this.telephone = value;
	}
	
	/**
	 * 邮编,
	 */
	public String getZip() {
		return this.zip;
	}
	
	/**
	 * 邮编,
	 */
	public void setZip(String value)
	 {
		this.zip = value;
	}
	
	/**
	 * 手机,
	 */
	public String getHandset() {
		return this.handset;
	}
	
	/**
	 * 手机,
	 */
	public void setHandset(String value)
	 {
		this.handset = value;
	}
	
	/**
	 * 交易权限,
	 */
	public String getSubtrade() {
		return this.subtrade;
	}
	
	/**
	 * 交易权限,
	 */
	public void setSubtrade(String value)
	 {
		this.subtrade = value;
	}
	
	/**
	 * 电邮,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 电邮,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 激活标志,
	 */
	public String getNeedactive() {
		return this.needactive;
	}
	
	/**
	 * 激活标志,
	 */
	public void setNeedactive(String value)
	 {
		this.needactive = value;
	}
	
	/**
	 * 查询权限,
	 */
	public String getSubquery() {
		return this.subquery;
	}
	
	/**
	 * 查询权限,
	 */
	public void setSubquery(String value)
	 {
		this.subquery = value;
	}
	
	/**
	 * 锁定日期,
	 */
	public String getLocktime() {
		return this.locktime;
	}
	
	/**
	 * 锁定日期,
	 */
	public void setLocktime(String value)
	 {
		this.locktime = value;
	}
}
