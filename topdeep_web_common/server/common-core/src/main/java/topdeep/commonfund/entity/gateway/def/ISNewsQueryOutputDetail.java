package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资讯内容功能输出明细参数
 */
public class ISNewsQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 资源标识,
	 */
	private Integer resId;
	
	/**
	 * 资源类型,
	 */
	private String resType;
	
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
}
