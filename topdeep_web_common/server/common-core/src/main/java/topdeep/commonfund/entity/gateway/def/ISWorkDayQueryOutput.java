package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 相关工作日查询功能输出参数
 */
public class ISWorkDayQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 参考工作日,
	 */
	private java.util.Date currentWorkDay;
	
	/**
	 * 前一工作日,
	 */
	private java.util.Date prevWorkDay;
	
	/**
	 * 下一工作日,
	 */
	private java.util.Date nextWorkDay;
	
	/**
	 * T+N工作日,
	 */
	private java.util.Date tNWorkDay;
	
	public ISWorkDayQueryOutput() {
		this.setZ_funcCode("n0p");
	}
	
	/**
	 * 参考工作日,
	 */
	public java.util.Date getCurrentWorkDay() {
		return this.currentWorkDay;
	}
	
	/**
	 * 参考工作日,
	 */
	public void setCurrentWorkDay(java.util.Date value)
	 {
		this.currentWorkDay = value;
	}
	
	/**
	 * 前一工作日,
	 */
	public java.util.Date getPrevWorkDay() {
		return this.prevWorkDay;
	}
	
	/**
	 * 前一工作日,
	 */
	public void setPrevWorkDay(java.util.Date value)
	 {
		this.prevWorkDay = value;
	}
	
	/**
	 * 下一工作日,
	 */
	public java.util.Date getNextWorkDay() {
		return this.nextWorkDay;
	}
	
	/**
	 * 下一工作日,
	 */
	public void setNextWorkDay(java.util.Date value)
	 {
		this.nextWorkDay = value;
	}
	
	/**
	 * T+N工作日,
	 */
	public java.util.Date getTNWorkDay() {
		return this.tNWorkDay;
	}
	
	/**
	 * T+N工作日,
	 */
	public void setTNWorkDay(java.util.Date value)
	 {
		this.tNWorkDay = value;
	}
}
