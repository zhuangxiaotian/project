package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户角色查询(C053)
 */
public class C053Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如果没有传递证件号码，就必须传递基金账号，否者查询不到信息；不传证件号码或是证件类型则视为无效证件，会根据基金账号查询；传了证件号码、类型和基金账号必须都要正确，不然查不到结果
	 */
	private String identitytype = "";
	
	/**
	 * 基金帐号,如果没有传递证件号码，就必须传递基金账号，否者查询不到信息
	 */
	private String fundacco = "";
	
	/**
	 * 初始化参数
	 */
	public C053Input() {
		this.setFunction("C053");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 证件类型,如果没有传递证件号码，就必须传递基金账号，否者查询不到信息；不传证件号码或是证件类型则视为无效证件，会根据基金账号查询；传了证件号码、类型和基金账号必须都要正确，不然查不到结果
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如果没有传递证件号码，就必须传递基金账号，否者查询不到信息；不传证件号码或是证件类型则视为无效证件，会根据基金账号查询；传了证件号码、类型和基金账号必须都要正确，不然查不到结果
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 基金帐号,如果没有传递证件号码，就必须传递基金账号，否者查询不到信息
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,如果没有传递证件号码，就必须传递基金账号，否者查询不到信息
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("fundacco", this.fundacco);
	}
}
