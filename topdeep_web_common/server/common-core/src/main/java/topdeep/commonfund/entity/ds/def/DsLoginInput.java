package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 登陆功能输入参数
 */
public class DsLoginInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 是否查询客户信息,
	 */
	private String needQueryCustInfo;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 密码,
	 */
	private String password;
	
	public DsLoginInput() {
		this.setZ_funcCode("u00");
	}
	
	/**
	 * 是否查询客户信息,
	 */
	public String getNeedQueryCustInfo() {
		return this.needQueryCustInfo;
	}
	
	/**
	 * 是否查询客户信息,
	 */
	public void setNeedQueryCustInfo(String value)
	 {
		this.needQueryCustInfo = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
	
	/**
	 * 密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
}
