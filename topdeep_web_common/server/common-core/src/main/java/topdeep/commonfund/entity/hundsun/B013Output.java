package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 小额打款查询(B013)
 */
public class B013Output extends HundsunBaseOutput implements Serializable {
	
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
	 * 订单状态,0:失败 1:成功 2:处理中
	 */
	private String orderstatus = "";
	
	/**
	 * 打款时间,格式:yyyymmddhh24MMss
	 */
	private String remittime = "";
	
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
	 * 订单状态,0:失败 1:成功 2:处理中
	 */
	public String getOrderstatus() {
		return this.orderstatus;
	}
	
	/**
	 * 订单状态,0:失败 1:成功 2:处理中
	 */
	public void setOrderstatus(String value)
	 {
		this.orderstatus = value;
	}
	
	/**
	 * 打款时间,格式:yyyymmddhh24MMss
	 */
	public String getRemittime() {
		return this.remittime;
	}
	
	/**
	 * 打款时间,格式:yyyymmddhh24MMss
	 */
	public void setRemittime(String value)
	 {
		this.remittime = value;
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
