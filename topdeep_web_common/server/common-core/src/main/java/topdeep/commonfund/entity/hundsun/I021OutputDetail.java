package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投基金列表(I021)功能输出明细参数
 */
public class I021OutputDetail extends Object implements Serializable {
	
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
}
