package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询可撤单列表功能输入参数
 */
public class ISQueryCanCancelTransactionListInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 业务大类,
	 */
	private String busintype;
	
	/**
	 * 查询类别,
	 */
	private String querytype;
	
	/**
	 * 业务代码,
	 */
	private String callingcode;
	
	public ISQueryCanCancelTransactionListInput() {
		this.setZ_funcCode("u0w");
	}
	
	/**
	 * 业务大类,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 查询类别,
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类别,
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
}
