package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询预登记信息(C046)功能输出明细参数
 */
public class C046OutputDetail extends Object implements Serializable {
	
	/**
	 * 客户姓名,
	 */
	private String customname = "";
	
	/**
	 * 错误原因,
	 */
	private String errormsg = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 手机号码,
	 */
	private String mobileno = "";
	
	/**
	 * 预约签署机构名称,
	 */
	private String orgname = "";
	
	/**
	 * 预约机构代码,
	 */
	private String orgno = "";
	
	/**
	 * 登记日期,
	 */
	private String regdate = "";
	
	/**
	 * 登记状态,已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功
	 */
	private String regstate = "";
	
	/**
	 * 登记时间,
	 */
	private String regtime = "";
	
	/**
	 * 所属单位,
	 */
	private String unit = "";
	
	/**
	 * 客户姓名,
	 */
	public String getCustomname() {
		return this.customname;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustomname(String value)
	 {
		this.customname = value;
	}
	
	/**
	 * 错误原因,
	 */
	public String getErrormsg() {
		return this.errormsg;
	}
	
	/**
	 * 错误原因,
	 */
	public void setErrormsg(String value)
	 {
		this.errormsg = value;
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
	 * 手机号码,
	 */
	public String getMobileno() {
		return this.mobileno;
	}
	
	/**
	 * 手机号码,
	 */
	public void setMobileno(String value)
	 {
		this.mobileno = value;
	}
	
	/**
	 * 预约签署机构名称,
	 */
	public String getOrgname() {
		return this.orgname;
	}
	
	/**
	 * 预约签署机构名称,
	 */
	public void setOrgname(String value)
	 {
		this.orgname = value;
	}
	
	/**
	 * 预约机构代码,
	 */
	public String getOrgno() {
		return this.orgno;
	}
	
	/**
	 * 预约机构代码,
	 */
	public void setOrgno(String value)
	 {
		this.orgno = value;
	}
	
	/**
	 * 登记日期,
	 */
	public String getRegdate() {
		return this.regdate;
	}
	
	/**
	 * 登记日期,
	 */
	public void setRegdate(String value)
	 {
		this.regdate = value;
	}
	
	/**
	 * 登记状态,已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功
	 */
	public String getRegstate() {
		return this.regstate;
	}
	
	/**
	 * 登记状态,已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功
	 */
	public void setRegstate(String value)
	 {
		this.regstate = value;
	}
	
	/**
	 * 登记时间,
	 */
	public String getRegtime() {
		return this.regtime;
	}
	
	/**
	 * 登记时间,
	 */
	public void setRegtime(String value)
	 {
		this.regtime = value;
	}
	
	/**
	 * 所属单位,
	 */
	public String getUnit() {
		return this.unit;
	}
	
	/**
	 * 所属单位,
	 */
	public void setUnit(String value)
	 {
		this.unit = value;
	}
}
