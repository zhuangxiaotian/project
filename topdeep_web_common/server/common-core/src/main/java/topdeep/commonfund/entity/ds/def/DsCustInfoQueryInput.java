package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 客户信息查询功能输入参数
 */
public class DsCustInfoQueryInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	public DsCustInfoQueryInput() {
		this.setZ_funcCode("u01");
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
