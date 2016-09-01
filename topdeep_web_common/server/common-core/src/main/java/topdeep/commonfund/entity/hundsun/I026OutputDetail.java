package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投策略查询(I026)功能输出明细参数
 */
public class I026OutputDetail extends Object implements Serializable {
	
	/**
	 * 方案编号,
	 */
	private String schemano = "";
	
	/**
	 * 均线类型,
	 */
	private String avgexponenttype = "";
	
	/**
	 * 启用日期,
	 */
	private String begindate = "";
	
	/**
	 * 停用日期,
	 */
	private String enddate = "";
	
	/**
	 * 指数代码,
	 */
	private String exponentcode = "";
	
	/**
	 * 指数类型,
	 */
	private String exptype = "";
	
	/**
	 * 投资浮动比例,
	 */
	private String invenstrate = "";
	
	/**
	 * 浮动区间左值,
	 */
	private String lvalue = "";
	
	/**
	 * 浮动区间右值,
	 */
	private String rvalue = "";
	
	/**
	 * 方案名称,
	 */
	private String schemaname = "";
	
	/**
	 * 启用标志,(0:未启用; 1:启用; 2:停用)
	 */
	private String state = "";
	
	/**
	 * 方案编号,
	 */
	public String getSchemano() {
		return this.schemano;
	}
	
	/**
	 * 方案编号,
	 */
	public void setSchemano(String value)
	 {
		this.schemano = value;
	}
	
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
	 * 启用日期,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 启用日期,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 停用日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 停用日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
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
	 * 指数类型,
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 投资浮动比例,
	 */
	public String getInvenstrate() {
		return this.invenstrate;
	}
	
	/**
	 * 投资浮动比例,
	 */
	public void setInvenstrate(String value)
	 {
		this.invenstrate = value;
	}
	
	/**
	 * 浮动区间左值,
	 */
	public String getLvalue() {
		return this.lvalue;
	}
	
	/**
	 * 浮动区间左值,
	 */
	public void setLvalue(String value)
	 {
		this.lvalue = value;
	}
	
	/**
	 * 浮动区间右值,
	 */
	public String getRvalue() {
		return this.rvalue;
	}
	
	/**
	 * 浮动区间右值,
	 */
	public void setRvalue(String value)
	 {
		this.rvalue = value;
	}
	
	/**
	 * 方案名称,
	 */
	public String getSchemaname() {
		return this.schemaname;
	}
	
	/**
	 * 方案名称,
	 */
	public void setSchemaname(String value)
	 {
		this.schemaname = value;
	}
	
	/**
	 * 启用标志,(0:未启用; 1:启用; 2:停用)
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 启用标志,(0:未启用; 1:启用; 2:停用)
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
}
