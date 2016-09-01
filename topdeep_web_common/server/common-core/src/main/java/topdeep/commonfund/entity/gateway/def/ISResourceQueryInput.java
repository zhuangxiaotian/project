package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资源功能输入参数
 */
public class ISResourceQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 资源标识,
	 */
	private Integer resId;
	
	public ISResourceQueryInput() {
		this.setZ_funcCode("n03");
	}
	
	/**
	 * 资源标识,
	 */
	public Integer getResId() {
		return this.resId;
	}
	
	/**
	 * 资源标识,
	 */
	public void setResId(Integer value)
	 {
		this.resId = value;
	}
}
