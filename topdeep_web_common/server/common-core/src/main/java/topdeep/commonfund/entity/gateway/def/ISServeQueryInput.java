package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 可定制信息查询功能输入参数
 */
public class ISServeQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 查询方式,1:所有信息模板 2：客户订阅的信息模板
	 */
	private String type;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	public ISServeQueryInput() {
		this.setZ_funcCode("u1m");
	}
	
	/**
	 * 查询方式,1:所有信息模板 2：客户订阅的信息模板
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 查询方式,1:所有信息模板 2：客户订阅的信息模板
	 */
	public void setType(String value)
	 {
		this.type = value;
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
}
