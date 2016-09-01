package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 帐户资料修改详情查询(S045)功能输出明细参数
 */
public class S045OutputDetail extends Object implements Serializable {
	
	/**
	 * 字段中文名,
	 */
	private String columncaption = "";
	
	/**
	 * 字段名,
	 */
	private String columnname = "";
	
	/**
	 * 修改后值,
	 */
	private String newvalue = "";
	
	/**
	 * 修改后值显示,yyyymmdd
	 */
	private String newvaluecaption = "";
	
	/**
	 * 修改前值,参考字典：业务名称
	 */
	private String oldvalue = "";
	
	/**
	 * 修改前值显示,
	 */
	private String oldvaluecaption = "";
	
	/**
	 * 字段中文名,
	 */
	public String getColumncaption() {
		return this.columncaption;
	}
	
	/**
	 * 字段中文名,
	 */
	public void setColumncaption(String value)
	 {
		this.columncaption = value;
	}
	
	/**
	 * 字段名,
	 */
	public String getColumnname() {
		return this.columnname;
	}
	
	/**
	 * 字段名,
	 */
	public void setColumnname(String value)
	 {
		this.columnname = value;
	}
	
	/**
	 * 修改后值,
	 */
	public String getNewvalue() {
		return this.newvalue;
	}
	
	/**
	 * 修改后值,
	 */
	public void setNewvalue(String value)
	 {
		this.newvalue = value;
	}
	
	/**
	 * 修改后值显示,yyyymmdd
	 */
	public String getNewvaluecaption() {
		return this.newvaluecaption;
	}
	
	/**
	 * 修改后值显示,yyyymmdd
	 */
	public void setNewvaluecaption(String value)
	 {
		this.newvaluecaption = value;
	}
	
	/**
	 * 修改前值,参考字典：业务名称
	 */
	public String getOldvalue() {
		return this.oldvalue;
	}
	
	/**
	 * 修改前值,参考字典：业务名称
	 */
	public void setOldvalue(String value)
	 {
		this.oldvalue = value;
	}
	
	/**
	 * 修改前值显示,
	 */
	public String getOldvaluecaption() {
		return this.oldvaluecaption;
	}
	
	/**
	 * 修改前值显示,
	 */
	public void setOldvaluecaption(String value)
	 {
		this.oldvaluecaption = value;
	}
}
