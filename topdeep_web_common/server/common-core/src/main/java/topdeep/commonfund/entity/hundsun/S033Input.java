package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 账户成交查询(S033)
 */
public class S033Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 每页记录数,不传则默认查SYS_MAXCOUNT配置的记录数
	 */
	private String applyrecordno = "";
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 确认编号,
	 */
	private String confirmno = "";
	
	/**
	 * 结束日期,格式yyyyMMdd
	 */
	private String enddate = "";
	
	/**
	 * 当前页,不传默认查第1页
	 */
	private String pageno = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 起始日期,格式yyyyMMdd
	 */
	private String startdate = "";
	
	/**
	 * 初始化参数
	 */
	public S033Input() {
		this.setFunction("S033");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 每页记录数,不传则默认查SYS_MAXCOUNT配置的记录数
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 每页记录数,不传则默认查SYS_MAXCOUNT配置的记录数
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
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
	 * 确认编号,
	 */
	public String getConfirmno() {
		return this.confirmno;
	}
	
	/**
	 * 确认编号,
	 */
	public void setConfirmno(String value)
	 {
		this.confirmno = value;
	}
	
	/**
	 * 结束日期,格式yyyyMMdd
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,格式yyyyMMdd
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 当前页,不传默认查第1页
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页,不传默认查第1页
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
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
	 * 起始日期,格式yyyyMMdd
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,格式yyyyMMdd
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("businflag", this.businflag);
		inputMap.put("confirmno", this.confirmno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("pageno", this.pageno);
		inputMap.put("requestno", this.requestno);
		inputMap.put("startdate", this.startdate);
	}
}
