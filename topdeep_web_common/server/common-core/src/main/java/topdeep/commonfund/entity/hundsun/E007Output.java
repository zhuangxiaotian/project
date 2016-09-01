package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询专户人数限制(E007)
 */
public class E007Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 是否限制,0:不限制;1:限制
	 */
	private String limit = "";
	
	/**
	 * 是否限制,0:不限制;1:限制
	 */
	public String getLimit() {
		return this.limit;
	}
	
	/**
	 * 是否限制,0:不限制;1:限制
	 */
	public void setLimit(String value)
	 {
		this.limit = value;
	}
}
