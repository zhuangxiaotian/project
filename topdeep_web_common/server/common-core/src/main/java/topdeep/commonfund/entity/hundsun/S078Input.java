package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 专户基金信息披露(S078)
 */
public class S078Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 页码,
	 */
	private String pageno = "";
	
	/**
	 * 每页条数,
	 */
	private String pagesize = "";
	
	/**
	 * 初始化参数
	 */
	public S078Input() {
		this.setFunction("S078");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
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
	 * 页码,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 页码,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 每页条数,
	 */
	public String getPagesize() {
		return this.pagesize;
	}
	
	/**
	 * 每页条数,
	 */
	public void setPagesize(String value)
	 {
		this.pagesize = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("pageno", this.pageno);
		inputMap.put("pagesize", this.pagesize);
	}
}
