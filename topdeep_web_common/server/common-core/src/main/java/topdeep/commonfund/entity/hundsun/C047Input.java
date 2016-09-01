package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 新增预登记(C047)
 */
public class C047Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * ,
	 */
	private String customname = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String identitytype = "";
	
	/**
	 * 登记状态,1.已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功。
	 */
	private String regstate = "";
	
	/**
	 * 错误原因,
	 */
	private String errormsg = "";
	
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
	 * 登记时间,
	 */
	private String regtime = "";
	
	/**
	 * 所属单位,
	 */
	private String unit = "";
	
	/**
	 * 初始化参数
	 */
	public C047Input() {
		this.setFunction("C047");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * ,
	 */
	public String getCustomname() {
		return this.customname;
	}
	
	/**
	 * ,
	 */
	public void setCustomname(String value)
	 {
		this.customname = value;
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
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 登记状态,1.已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功。
	 */
	public String getRegstate() {
		return this.regstate;
	}
	
	/**
	 * 登记状态,1.已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功。
	 */
	public void setRegstate(String value)
	 {
		this.regstate = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("customname", this.customname);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("regstate", this.regstate);
		inputMap.put("errormsg", this.errormsg);
		inputMap.put("mobileno", this.mobileno);
		inputMap.put("orgname", this.orgname);
		inputMap.put("orgno", this.orgno);
		inputMap.put("regdate", this.regdate);
		inputMap.put("regtime", this.regtime);
		inputMap.put("unit", this.unit);
	}
}
