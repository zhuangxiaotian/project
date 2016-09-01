package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 积分兑换列表(V033)功能输出明细参数
 */
public class V033OutputDetail extends Object implements Serializable {
	
	/**
	 * 地址,
	 */
	private String c_address = "";
	
	/**
	 * 礼品编号,
	 */
	private String c_presentid = "";
	
	/**
	 * 礼品名称,
	 */
	private String c_presentname = "";
	
	/**
	 * 申请编号,
	 */
	private String c_requestno = "";
	
	/**
	 * 快递单号,
	 */
	private String c_trackingno = "";
	
	/**
	 * 快递商,
	 */
	private String c_trackingtype = "";
	
	/**
	 * 申请日期,
	 */
	private String d_date = "";
	
	/**
	 * 寄送日期,
	 */
	private String d_senddate = "";
	
	/**
	 * 状态,
	 */
	private String status = "";
	
	/**
	 * 所需积分,
	 */
	private String totalpoint = "";
	
	/**
	 * 地址,
	 */
	public String getC_address() {
		return this.c_address;
	}
	
	/**
	 * 地址,
	 */
	public void setC_address(String value)
	 {
		this.c_address = value;
	}
	
	/**
	 * 礼品编号,
	 */
	public String getC_presentid() {
		return this.c_presentid;
	}
	
	/**
	 * 礼品编号,
	 */
	public void setC_presentid(String value)
	 {
		this.c_presentid = value;
	}
	
	/**
	 * 礼品名称,
	 */
	public String getC_presentname() {
		return this.c_presentname;
	}
	
	/**
	 * 礼品名称,
	 */
	public void setC_presentname(String value)
	 {
		this.c_presentname = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getC_requestno() {
		return this.c_requestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setC_requestno(String value)
	 {
		this.c_requestno = value;
	}
	
	/**
	 * 快递单号,
	 */
	public String getC_trackingno() {
		return this.c_trackingno;
	}
	
	/**
	 * 快递单号,
	 */
	public void setC_trackingno(String value)
	 {
		this.c_trackingno = value;
	}
	
	/**
	 * 快递商,
	 */
	public String getC_trackingtype() {
		return this.c_trackingtype;
	}
	
	/**
	 * 快递商,
	 */
	public void setC_trackingtype(String value)
	 {
		this.c_trackingtype = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getD_date() {
		return this.d_date;
	}
	
	/**
	 * 申请日期,
	 */
	public void setD_date(String value)
	 {
		this.d_date = value;
	}
	
	/**
	 * 寄送日期,
	 */
	public String getD_senddate() {
		return this.d_senddate;
	}
	
	/**
	 * 寄送日期,
	 */
	public void setD_senddate(String value)
	 {
		this.d_senddate = value;
	}
	
	/**
	 * 状态,
	 */
	public String getStatus() {
		return this.status;
	}
	
	/**
	 * 状态,
	 */
	public void setStatus(String value)
	 {
		this.status = value;
	}
	
	/**
	 * 所需积分,
	 */
	public String getTotalpoint() {
		return this.totalpoint;
	}
	
	/**
	 * 所需积分,
	 */
	public void setTotalpoint(String value)
	 {
		this.totalpoint = value;
	}
}
