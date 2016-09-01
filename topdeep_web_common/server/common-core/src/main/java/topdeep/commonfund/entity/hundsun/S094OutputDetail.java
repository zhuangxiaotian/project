package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 指数均线查询(S094)功能输出明细参数
 */
public class S094OutputDetail extends Object implements Serializable {
	
	/**
	 * 均线类型,
	 */
	private String avgexponenttype = "";
	
	/**
	 * 均线数值,
	 */
	private String avgexponentvalue = "";
	
	/**
	 * 指数代码,
	 */
	private String exponentcode = "";
	
	/**
	 * 指数日期,
	 */
	private String exponentdate = "";
	
	/**
	 * 指数名称,
	 */
	private String exponentname = "";
	
	/**
	 * 指数数值,
	 */
	private String exponentvalue = "";
	
	/**
	 * 均线类型,
	 */
	public String getAvgexponenttype() {
		return this.avgexponenttype;
	}
	
	/**
	 * 均线类型,
	 */
	public void setAvgexponenttype(String value)
	 {
		this.avgexponenttype = value;
	}
	
	/**
	 * 均线数值,
	 */
	public String getAvgexponentvalue() {
		return this.avgexponentvalue;
	}
	
	/**
	 * 均线数值,
	 */
	public void setAvgexponentvalue(String value)
	 {
		this.avgexponentvalue = value;
	}
	
	/**
	 * 指数代码,
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 指数代码,
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 指数日期,
	 */
	public String getExponentdate() {
		return this.exponentdate;
	}
	
	/**
	 * 指数日期,
	 */
	public void setExponentdate(String value)
	 {
		this.exponentdate = value;
	}
	
	/**
	 * 指数名称,
	 */
	public String getExponentname() {
		return this.exponentname;
	}
	
	/**
	 * 指数名称,
	 */
	public void setExponentname(String value)
	 {
		this.exponentname = value;
	}
	
	/**
	 * 指数数值,
	 */
	public String getExponentvalue() {
		return this.exponentvalue;
	}
	
	/**
	 * 指数数值,
	 */
	public void setExponentvalue(String value)
	 {
		this.exponentvalue = value;
	}
}
