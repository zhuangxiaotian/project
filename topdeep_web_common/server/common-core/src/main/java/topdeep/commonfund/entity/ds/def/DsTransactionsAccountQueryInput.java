package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询用户的交易账户列表功能输入参数
 */
public class DsTransactionsAccountQueryInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 客户编号或者sessionKey,
	 */
	private String customerId;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	public DsTransactionsAccountQueryInput() {
		this.setZ_funcCode("u07");
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public String getCustomerId() {
		return this.customerId;
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public void setCustomerId(String value)
	 {
		this.customerId = value;
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
}
