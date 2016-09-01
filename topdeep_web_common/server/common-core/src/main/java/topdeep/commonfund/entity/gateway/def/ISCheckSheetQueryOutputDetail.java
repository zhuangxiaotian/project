package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 对账单定制查询功能输出明细参数
 */
public class ISCheckSheetQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 编码,
	 */
	private String taskcode;
	
	/**
	 * 名称,
	 */
	private String taskname;
	
	/**
	 * 是否定制,1:定制;0:未定制
	 */
	private String currcanorder;
	
	/**
	 * 编码,
	 */
	public String getTaskcode() {
		return this.taskcode;
	}
	
	/**
	 * 编码,
	 */
	public void setTaskcode(String value)
	 {
		this.taskcode = value;
	}
	
	/**
	 * 名称,
	 */
	public String getTaskname() {
		return this.taskname;
	}
	
	/**
	 * 名称,
	 */
	public void setTaskname(String value)
	 {
		this.taskname = value;
	}
	
	/**
	 * 是否定制,1:定制;0:未定制
	 */
	public String getCurrcanorder() {
		return this.currcanorder;
	}
	
	/**
	 * 是否定制,1:定制;0:未定制
	 */
	public void setCurrcanorder(String value)
	 {
		this.currcanorder = value;
	}
}
