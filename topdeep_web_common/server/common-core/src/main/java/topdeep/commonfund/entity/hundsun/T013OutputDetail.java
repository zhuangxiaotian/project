package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合投资基金列表(T013)功能输出明细参数
 */
public class T013OutputDetail extends Object implements Serializable {
	
	/**
	 * 组合类型,
	 */
	private String c_type = "0:普通组合，1：理财组合，默认是0";
	
	/**
	 * 组合编号,
	 */
	private String combcode = "";
	
	/**
	 * 组合简介,
	 */
	private String combintroduce = "";
	
	/**
	 * 组合名称,
	 */
	private String combname = "";
	
	/**
	 * 组合风险等级,
	 */
	private String combRiskLevel = "";
	
	/**
	 * 外部组合编号,
	 */
	private String extcombcode = "多个组合编号可能对应同一个外部组合编号";
	
	/**
	 * 组合启用日期,
	 */
	private String startdate = "";
	
	/**
	 * 组合停用日期,
	 */
	private String stopdate = "";
	
	private List<T013OutputDetail> detail = new ArrayList<T013OutputDetail>();
	
	/**
	 * 组合类型,
	 */
	public String getC_type() {
		return this.c_type;
	}
	
	/**
	 * 组合类型,
	 */
	public void setC_type(String value)
	 {
		this.c_type = value;
	}
	
	/**
	 * 组合编号,
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	/**
	 * 组合简介,
	 */
	public String getCombintroduce() {
		return this.combintroduce;
	}
	
	/**
	 * 组合简介,
	 */
	public void setCombintroduce(String value)
	 {
		this.combintroduce = value;
	}
	
	/**
	 * 组合名称,
	 */
	public String getCombname() {
		return this.combname;
	}
	
	/**
	 * 组合名称,
	 */
	public void setCombname(String value)
	 {
		this.combname = value;
	}
	
	/**
	 * 组合风险等级,
	 */
	public String getCombRiskLevel() {
		return this.combRiskLevel;
	}
	
	/**
	 * 组合风险等级,
	 */
	public void setCombRiskLevel(String value)
	 {
		this.combRiskLevel = value;
	}
	
	/**
	 * 外部组合编号,
	 */
	public String getExtcombcode() {
		return this.extcombcode;
	}
	
	/**
	 * 外部组合编号,
	 */
	public void setExtcombcode(String value)
	 {
		this.extcombcode = value;
	}
	
	/**
	 * 组合启用日期,
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 组合启用日期,
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 组合停用日期,
	 */
	public String getStopdate() {
		return this.stopdate;
	}
	
	/**
	 * 组合停用日期,
	 */
	public void setStopdate(String value)
	 {
		this.stopdate = value;
	}
	
	public List<T013OutputDetail> getDetail() {
		return this.detail;
	}
	
}
