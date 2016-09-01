package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 子账户开户(C058)
 */
public class C058Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 子账户证件号,
	 */
	private String subaccoidentityno = "";
	
	/**
	 * 子账户证件类型,
	 */
	private String subaccoidentitytype = "";
	
	/**
	 * 子账户证件有效期,
	 */
	private String subaccoidvalidate = "";
	
	/**
	 * 子账户名称,
	 */
	private String subacconame = "";
	
	/**
	 * 子账户查询与交易密码,
	 */
	private String subaccopwd = "";
	
	/**
	 * 子账户邮箱,
	 */
	private String subemail = "";
	
	/**
	 * 子账户联系电话,
	 */
	private String subtelephone = "";
	
	/**
	 * 子账户联系地址,
	 */
	private String communicationaddr = "";
	
	/**
	 * 高华机构id,高华机构自主账户id，高华机构传
	 */
	private String subaccoid = "";
	
	/**
	 * 审核权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	private String subcheck = "";
	
	/**
	 * 查询权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	private String subquery = "";
	
	/**
	 * 交易权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	private String subtrade = "";
	
	/**
	 * 子账户邮编,
	 */
	private String zip = "";
	
	/**
	 * 初始化参数
	 */
	public C058Input() {
		this.setFunction("C058");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 子账户证件号,
	 */
	public String getSubaccoidentityno() {
		return this.subaccoidentityno;
	}
	
	/**
	 * 子账户证件号,
	 */
	public void setSubaccoidentityno(String value)
	 {
		this.subaccoidentityno = value;
	}
	
	/**
	 * 子账户证件类型,
	 */
	public String getSubaccoidentitytype() {
		return this.subaccoidentitytype;
	}
	
	/**
	 * 子账户证件类型,
	 */
	public void setSubaccoidentitytype(String value)
	 {
		this.subaccoidentitytype = value;
	}
	
	/**
	 * 子账户证件有效期,
	 */
	public String getSubaccoidvalidate() {
		return this.subaccoidvalidate;
	}
	
	/**
	 * 子账户证件有效期,
	 */
	public void setSubaccoidvalidate(String value)
	 {
		this.subaccoidvalidate = value;
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
	 * 子账户查询与交易密码,
	 */
	public String getSubaccopwd() {
		return this.subaccopwd;
	}
	
	/**
	 * 子账户查询与交易密码,
	 */
	public void setSubaccopwd(String value)
	 {
		this.subaccopwd = value;
	}
	
	/**
	 * 子账户邮箱,
	 */
	public String getSubemail() {
		return this.subemail;
	}
	
	/**
	 * 子账户邮箱,
	 */
	public void setSubemail(String value)
	 {
		this.subemail = value;
	}
	
	/**
	 * 子账户联系电话,
	 */
	public String getSubtelephone() {
		return this.subtelephone;
	}
	
	/**
	 * 子账户联系电话,
	 */
	public void setSubtelephone(String value)
	 {
		this.subtelephone = value;
	}
	
	/**
	 * 子账户联系地址,
	 */
	public String getCommunicationaddr() {
		return this.communicationaddr;
	}
	
	/**
	 * 子账户联系地址,
	 */
	public void setCommunicationaddr(String value)
	 {
		this.communicationaddr = value;
	}
	
	/**
	 * 高华机构id,高华机构自主账户id，高华机构传
	 */
	public String getSubaccoid() {
		return this.subaccoid;
	}
	
	/**
	 * 高华机构id,高华机构自主账户id，高华机构传
	 */
	public void setSubaccoid(String value)
	 {
		this.subaccoid = value;
	}
	
	/**
	 * 审核权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	public String getSubcheck() {
		return this.subcheck;
	}
	
	/**
	 * 审核权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	public void setSubcheck(String value)
	 {
		this.subcheck = value;
	}
	
	/**
	 * 查询权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	public String getSubquery() {
		return this.subquery;
	}
	
	/**
	 * 查询权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	public void setSubquery(String value)
	 {
		this.subquery = value;
	}
	
	/**
	 * 交易权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	public String getSubtrade() {
		return this.subtrade;
	}
	
	/**
	 * 交易权限,可选值【0-无权限，1-有权限】，为空时默认为1
	 */
	public void setSubtrade(String value)
	 {
		this.subtrade = value;
	}
	
	/**
	 * 子账户邮编,
	 */
	public String getZip() {
		return this.zip;
	}
	
	/**
	 * 子账户邮编,
	 */
	public void setZip(String value)
	 {
		this.zip = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("subaccoidentityno", this.subaccoidentityno);
		inputMap.put("subaccoidentitytype", this.subaccoidentitytype);
		inputMap.put("subaccoidvalidate", this.subaccoidvalidate);
		inputMap.put("subacconame", this.subacconame);
		inputMap.put("subaccopwd", this.subaccopwd);
		inputMap.put("subemail", this.subemail);
		inputMap.put("subtelephone", this.subtelephone);
		inputMap.put("communicationaddr", this.communicationaddr);
		inputMap.put("subaccoid", this.subaccoid);
		inputMap.put("subcheck", this.subcheck);
		inputMap.put("subquery", this.subquery);
		inputMap.put("subtrade", this.subtrade);
		inputMap.put("zip", this.zip);
	}
}
