package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 个人客户信息查询功能输入参数
 */
public class ISCustomerInfoQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 查询数据来源,DS-直销系统；DC-营销服务系统；不传-自动判断
	 */
	private String queryType;
	
	/**
	 * 证件号码,
	 */
	private String identityno;
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	/**
	 * 客户类型,客户类型，0：机构，1：个人
	 */
	private String custtype;
	
	public ISCustomerInfoQueryInput() {
		this.setZ_funcCode("u0l");
	}
	
	/**
	 * 查询数据来源,DS-直销系统；DC-营销服务系统；不传-自动判断
	 */
	public String getQueryType() {
		return this.queryType;
	}
	
	/**
	 * 查询数据来源,DS-直销系统；DC-营销服务系统；不传-自动判断
	 */
	public void setQueryType(String value)
	 {
		this.queryType = value;
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
}
