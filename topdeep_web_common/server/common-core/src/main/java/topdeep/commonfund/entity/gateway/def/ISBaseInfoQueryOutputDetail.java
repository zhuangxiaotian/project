package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 字典查询功能输出明细参数
 */
public class ISBaseInfoQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 字典类型,
	 */
	private String baseTypeId;
	
	/**
	 * 字典标识,
	 */
	private String baseInfoId;
	
	/**
	 * 字典名称,
	 */
	private String baseInfoName;
	
	/**
	 * 字典类型,
	 */
	public String getBaseTypeId() {
		return this.baseTypeId;
	}
	
	/**
	 * 字典类型,
	 */
	public void setBaseTypeId(String value)
	 {
		this.baseTypeId = value;
	}
	
	/**
	 * 字典标识,
	 */
	public String getBaseInfoId() {
		return this.baseInfoId;
	}
	
	/**
	 * 字典标识,
	 */
	public void setBaseInfoId(String value)
	 {
		this.baseInfoId = value;
	}
	
	/**
	 * 字典名称,
	 */
	public String getBaseInfoName() {
		return this.baseInfoName;
	}
	
	/**
	 * 字典名称,
	 */
	public void setBaseInfoName(String value)
	 {
		this.baseInfoName = value;
	}
}
