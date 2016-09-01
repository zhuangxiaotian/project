package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 还款流水查询(S044)
 */
public class S044Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private Integer applyrecordno;
	
	/**
	 * 结束日期,如20101231
	 */
	private String enddate = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 银行卡类型,1-借记卡 2-信用卡
	 */
	private String paymentcardtype = "";
	
	/**
	 * 银行卡状态,H:历史、A:正常
	 */
	private String paymentstate = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 起始日期,如20101231
	 */
	private String startdate = "";
	
	/**
	 * 还款银行卡编号,
	 */
	private String paymentaccono = "";
	
	/**
	 * 按照申请日期查询,传入yyyymmdd格式的日期，如“20150612”，表示查询2015年6月12日的结果。
	 */
	private String requestdate = "";
	
	/**
	 * 初始化参数
	 */
	public S044Input() {
		this.setFunction("S044");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public Integer getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public void setApplyrecordno(Integer value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 结束日期,如20101231
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,如20101231
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public Integer getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public void setPageno(Integer value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 银行卡类型,1-借记卡 2-信用卡
	 */
	public String getPaymentcardtype() {
		return this.paymentcardtype;
	}
	
	/**
	 * 银行卡类型,1-借记卡 2-信用卡
	 */
	public void setPaymentcardtype(String value)
	 {
		this.paymentcardtype = value;
	}
	
	/**
	 * 银行卡状态,H:历史、A:正常
	 */
	public String getPaymentstate() {
		return this.paymentstate;
	}
	
	/**
	 * 银行卡状态,H:历史、A:正常
	 */
	public void setPaymentstate(String value)
	 {
		this.paymentstate = value;
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
	 * 起始日期,如20101231
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,如20101231
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 还款银行卡编号,
	 */
	public String getPaymentaccono() {
		return this.paymentaccono;
	}
	
	/**
	 * 还款银行卡编号,
	 */
	public void setPaymentaccono(String value)
	 {
		this.paymentaccono = value;
	}
	
	/**
	 * 按照申请日期查询,传入yyyymmdd格式的日期，如“20150612”，表示查询2015年6月12日的结果。
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 按照申请日期查询,传入yyyymmdd格式的日期，如“20150612”，表示查询2015年6月12日的结果。
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.formatInteger(this.applyrecordno));
		inputMap.put("enddate", this.enddate);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("paymentcardtype", this.paymentcardtype);
		inputMap.put("paymentstate", this.paymentstate);
		inputMap.put("requestno", this.requestno);
		inputMap.put("startdate", this.startdate);
		inputMap.put("paymentaccono", this.paymentaccono);
		inputMap.put("requestdate", this.requestdate);
	}
}
