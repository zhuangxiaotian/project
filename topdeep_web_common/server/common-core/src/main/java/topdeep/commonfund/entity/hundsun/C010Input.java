package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 读取用户信息(C010)
 */
public class C010Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 账户资料来源,DS-直销系统；DC-营销服务系统；不传-自动判断
	 */
	private String datasource = "";
	
	/**
	 * 客户类型,客户类型，0：机构，1：个人
	 */
	private String custtype;
	
	/**
	 * 证件号码,证件号码
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 基金账号,不登录的情况下使用，使用基金账号查询，不能传入证件号码
	 */
	private String fundacco = "";
	
	/**
	 * 初始化参数
	 */
	public C010Input() {
		this.setFunction("C010");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 账户资料来源,DS-直销系统；DC-营销服务系统；不传-自动判断
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 账户资料来源,DS-直销系统；DC-营销服务系统；不传-自动判断
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 客户类型,客户类型，0：机构，1：个人
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,客户类型，0：机构，1：个人
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 证件号码,证件号码
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,证件号码
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
	 * 基金账号,不登录的情况下使用，使用基金账号查询，不能传入证件号码
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,不登录的情况下使用，使用基金账号查询，不能传入证件号码
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("datasource", this.datasource);
		inputMap.put("custtype", this.custtype.toString());
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("fundacco", this.fundacco);
	}
}
