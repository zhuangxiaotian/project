package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 现金宝过户查询(S101)功能输出明细参数
 */
public class S101OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 申请日期,
	 */
	private String requestdate = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 申请份数,
	 */
	private Double share;
	
	/**
	 * 状态,
	 */
	private String state;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 对方交易账号,
	 */
	private String othertradeacco = "";
	
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
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	/**
	 * 申请份数,
	 */
	public Double getShare() {
		return this.share;
	}
	
	/**
	 * 申请份数,
	 */
	public void setShare(Double value)
	 {
		this.share = value;
	}
	
	/**
	 * 状态,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 状态,
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
	
	/**
	 * 对方交易账号,
	 */
	public String getOthertradeacco() {
		return this.othertradeacco;
	}
	
	/**
	 * 对方交易账号,
	 */
	public void setOthertradeacco(String value)
	 {
		this.othertradeacco = value;
	}
}
