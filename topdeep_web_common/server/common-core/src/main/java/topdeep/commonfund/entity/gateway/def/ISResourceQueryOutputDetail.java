package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资源功能输出明细参数
 */
public class ISResourceQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 资源标识,
	 */
	private Integer resId;
	
	/**
	 * 资源扩展名,
	 */
	private String resExt;
	
	/**
	 * 资源类型,
	 */
	private String resType;
	
	/**
	 * 资源规格,
	 */
	private String resSpec;
	
	/**
	 * 资源URL,
	 */
	private String resUrl;
	
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
	
	/**
	 * 资源扩展名,
	 */
	public String getResExt() {
		return this.resExt;
	}
	
	/**
	 * 资源扩展名,
	 */
	public void setResExt(String value)
	 {
		this.resExt = value;
	}
	
	/**
	 * 资源类型,
	 */
	public String getResType() {
		return this.resType;
	}
	
	/**
	 * 资源类型,
	 */
	public void setResType(String value)
	 {
		this.resType = value;
	}
	
	/**
	 * 资源规格,
	 */
	public String getResSpec() {
		return this.resSpec;
	}
	
	/**
	 * 资源规格,
	 */
	public void setResSpec(String value)
	 {
		this.resSpec = value;
	}
	
	/**
	 * 资源URL,
	 */
	public String getResUrl() {
		return this.resUrl;
	}
	
	/**
	 * 资源URL,
	 */
	public void setResUrl(String value)
	 {
		this.resUrl = value;
	}
}
