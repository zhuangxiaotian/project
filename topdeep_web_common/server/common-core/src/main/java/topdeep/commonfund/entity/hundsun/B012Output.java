package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 小额打款(B012)
 */
public class B012Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行返回码,
	 */
	private String respcode = "";
	
	/**
	 * 银行返回信息,
	 */
	private String respdesc = "";
	
	/**
	 * 打款金额,格式:x.xx，单位元，精确到分
	 */
	private String amount = "";
	
	/**
	 * 订单号,
	 */
	private String orderno = "";
	
	/**
	 * 订单状态,0:未处理 1:已处理
	 */
	private String orderstatus = "";
	
	/**
	 * 申请时间,格式:yyyymmddhh24MMss
	 */
	private String requesttime = "";
	
	/**
	 * 银行返回码,
	 */
	public String getRespcode() {
		return this.respcode;
	}
	
	/**
	 * 银行返回码,
	 */
	public void setRespcode(String value)
	 {
		this.respcode = value;
	}
	
	/**
	 * 银行返回信息,
	 */
	public String getRespdesc() {
		return this.respdesc;
	}
	
	/**
	 * 银行返回信息,
	 */
	public void setRespdesc(String value)
	 {
		this.respdesc = value;
	}
	
	/**
	 * 打款金额,格式:x.xx，单位元，精确到分
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 打款金额,格式:x.xx，单位元，精确到分
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 订单号,
	 */
	public String getOrderno() {
		return this.orderno;
	}
	
	/**
	 * 订单号,
	 */
	public void setOrderno(String value)
	 {
		this.orderno = value;
	}
	
	/**
	 * 订单状态,0:未处理 1:已处理
	 */
	public String getOrderstatus() {
		return this.orderstatus;
	}
	
	/**
	 * 订单状态,0:未处理 1:已处理
	 */
	public void setOrderstatus(String value)
	 {
		this.orderstatus = value;
	}
	
	/**
	 * 申请时间,格式:yyyymmddhh24MMss
	 */
	public String getRequesttime() {
		return this.requesttime;
	}
	
	/**
	 * 申请时间,格式:yyyymmddhh24MMss
	 */
	public void setRequesttime(String value)
	 {
		this.requesttime = value;
	}
}
