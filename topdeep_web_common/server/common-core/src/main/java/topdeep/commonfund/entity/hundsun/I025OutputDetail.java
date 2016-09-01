package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投协议查询(I025)功能输出明细参数
 */
public class I025OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请金额,
	 */
	private String applysum = "";
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 组合编号,
	 */
	private String combcode = "";
	
	/**
	 * 协议名称,
	 */
	private String combname = "";
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 客户编号,
	 */
	private String customerserial = "";
	
	/**
	 * 协议状态,
	 */
	private String state = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 申请金额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
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
	 * 协议名称,
	 */
	public String getCombname() {
		return this.combname;
	}
	
	/**
	 * 协议名称,
	 */
	public void setCombname(String value)
	 {
		this.combname = value;
	}
	
	/**
	 * 组合申请编号,
	 */
	public String getCombrequestno() {
		return this.combrequestno;
	}
	
	/**
	 * 组合申请编号,
	 */
	public void setCombrequestno(String value)
	 {
		this.combrequestno = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustomerserial() {
		return this.customerserial;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustomerserial(String value)
	 {
		this.customerserial = value;
	}
	
	/**
	 * 协议状态,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 协议状态,
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
}
