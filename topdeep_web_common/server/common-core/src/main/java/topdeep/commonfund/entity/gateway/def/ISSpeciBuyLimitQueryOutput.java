package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询专户人数限制功能输出参数
 */
public class ISSpeciBuyLimitQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 是否限制,
	 */
	private String limit;
	
	public ISSpeciBuyLimitQueryOutput() {
		this.setZ_funcCode("n0y");
	}
	
	/**
	 * 是否限制,
	 */
	public String getLimit() {
		return this.limit;
	}
	
	/**
	 * 是否限制,
	 */
	public void setLimit(String value)
	 {
		this.limit = value;
	}
}
