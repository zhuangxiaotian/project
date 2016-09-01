package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 字典查询功能输入参数
 */
public class ISBaseInfoQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 字典类型,
	 */
	private String baseTypeId;
	
	public ISBaseInfoQueryInput() {
		this.setZ_funcCode("b06");
	}
	
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
}
