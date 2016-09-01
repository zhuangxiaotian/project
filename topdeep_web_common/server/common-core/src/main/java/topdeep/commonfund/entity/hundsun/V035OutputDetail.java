package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询客户的积分变换情况(V035)功能输出明细参数
 */
public class V035OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务类型,
	 */
	private String businflag = "";
	
	/**
	 * 确认日期,
	 */
	private String cdate = "";
	
	/**
	 * 客户名称,
	 */
	private String custname = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 调整来源,
	 */
	private String from = "";
	
	/**
	 * 积分余额,
	 */
	private String lastpoints = "";
	
	/**
	 * 备注,
	 */
	private String memo = "";
	
	/**
	 * 操作人,
	 */
	private String operator = "";
	
	/**
	 * 操作日期,
	 */
	private String optime = "";
	
	/**
	 * 调整积分值,
	 */
	private String points = "";
	
	/**
	 * 可兑换积分,
	 */
	private String remainpoints = "";
	
	/**
	 * 流水号,
	 */
	private String serialno = "";
	
	/**
	 * 业务类型,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 确认日期,
	 */
	public String getCdate() {
		return this.cdate;
	}
	
	/**
	 * 确认日期,
	 */
	public void setCdate(String value)
	 {
		this.cdate = value;
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 调整来源,
	 */
	public String getFrom() {
		return this.from;
	}
	
	/**
	 * 调整来源,
	 */
	public void setFrom(String value)
	 {
		this.from = value;
	}
	
	/**
	 * 积分余额,
	 */
	public String getLastpoints() {
		return this.lastpoints;
	}
	
	/**
	 * 积分余额,
	 */
	public void setLastpoints(String value)
	 {
		this.lastpoints = value;
	}
	
	/**
	 * 备注,
	 */
	public String getMemo() {
		return this.memo;
	}
	
	/**
	 * 备注,
	 */
	public void setMemo(String value)
	 {
		this.memo = value;
	}
	
	/**
	 * 操作人,
	 */
	public String getOperator() {
		return this.operator;
	}
	
	/**
	 * 操作人,
	 */
	public void setOperator(String value)
	 {
		this.operator = value;
	}
	
	/**
	 * 操作日期,
	 */
	public String getOptime() {
		return this.optime;
	}
	
	/**
	 * 操作日期,
	 */
	public void setOptime(String value)
	 {
		this.optime = value;
	}
	
	/**
	 * 调整积分值,
	 */
	public String getPoints() {
		return this.points;
	}
	
	/**
	 * 调整积分值,
	 */
	public void setPoints(String value)
	 {
		this.points = value;
	}
	
	/**
	 * 可兑换积分,
	 */
	public String getRemainpoints() {
		return this.remainpoints;
	}
	
	/**
	 * 可兑换积分,
	 */
	public void setRemainpoints(String value)
	 {
		this.remainpoints = value;
	}
	
	/**
	 * 流水号,
	 */
	public String getSerialno() {
		return this.serialno;
	}
	
	/**
	 * 流水号,
	 */
	public void setSerialno(String value)
	 {
		this.serialno = value;
	}
}
