package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 子账户查询(S082)功能输出明细参数
 */
public class S082OutputDetail extends Object implements Serializable {
	
	/**
	 * 邮箱,
	 */
	private String email = "";
	
	/**
	 * 手机,
	 */
	private String handset = "";
	
	/**
	 * 最后更新日期,
	 */
	private String lastmodifydate = "";
	
	/**
	 * 激活标志,
	 */
	private String needactive = "";
	
	/**
	 * 密码错误次数,
	 */
	private String pwderrornum = "";
	
	/**
	 * 子账户名称,
	 */
	private String subacconame = "";
	
	/**
	 * 子账户编号,
	 */
	private String subaccono = "";
	
	/**
	 * 查询密码,
	 */
	private String subaccoquerypwd = "";
	
	/**
	 * 交易密码,
	 */
	private String subaccotradepwd = "";
	
	/**
	 * 审核权限,
	 */
	private String subcheck = "";
	
	/**
	 * 查询权限,
	 */
	private String subquery = "";
	
	/**
	 * 交易权限,
	 */
	private String subtrade = "";
	
	/**
	 * 电话,
	 */
	private String telephone = "";
	
	/**
	 * 高华机构子账户id,
	 */
	private String subaccoid = "";
	
	/**
	 * 地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * 锁定日期,
	 */
	private String locktime = "";
	
	/**
	 * 密码最后修改时间,
	 */
	private String pwdlastmodifytime = "";
	
	/**
	 * 邮编,
	 */
	private String zip = "";
	
	/**
	 * 邮箱,
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱,
	 */
	public void setEmail(String value)
	 {
		this.email = value;
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
	 * 查询密码,
	 */
	public String getSubaccoquerypwd() {
		return this.subaccoquerypwd;
	}
	
	/**
	 * 查询密码,
	 */
	public void setSubaccoquerypwd(String value)
	 {
		this.subaccoquerypwd = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getSubaccotradepwd() {
		return this.subaccotradepwd;
	}
	
	/**
	 * 交易密码,
	 */
	public void setSubaccotradepwd(String value)
	 {
		this.subaccotradepwd = value;
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
	 * 高华机构子账户id,
	 */
	public String getSubaccoid() {
		return this.subaccoid;
	}
	
	/**
	 * 高华机构子账户id,
	 */
	public void setSubaccoid(String value)
	 {
		this.subaccoid = value;
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
}
